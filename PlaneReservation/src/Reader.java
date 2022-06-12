import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Reader extends Thread {
	Lock lock = new ReentrantLock();
	
	public void run() {
		lock.lock();
		queryReservation();
		lock.unlock();
	}
	
	private synchronized void queryReservation() {
		for (int i = 0; i < Koltuk.koltuklar.length; i++) {
			if(Koltuk.koltuklar[i][1] == 0 ) {
				System.out.print(Koltuk.koltuklar[i][0] + ", ");
			}
		}
		System.out.println("");
	}
	
	public Reader(Lock lock) {
		this.lock = lock;
	}

}
