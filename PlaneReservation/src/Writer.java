import java.util.concurrent.locks.Lock;

public class Writer extends Thread {

	private Lock lock;
	private int no;

	public void run() {
		//lock.lock();
		makeReservation();
		//lock.unlock();
	}

	private synchronized void makeReservation() {
		if (Koltuk.koltuklar[no][1] == 0) {
			Koltuk.koltuklar[no][1]=1;
			System.out.println("Koltuk Rezerve Edildi\n");
		} else {
			System.out.println("Koltuk Dolu\n");
		}
	}

	public Writer(Lock lock, int no) {
		this.lock = lock;
		this.no = no;
	}
}
