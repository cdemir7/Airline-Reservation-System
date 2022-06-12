import java.io.IOException;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Main {

	public static void main(String[] args) throws IOException {
		
		Lock lock = new ReentrantLock();
		Koltuk.olustur();
		
		Writer writer1 = new Writer(lock,0);
		Writer writer2 = new Writer(lock,0);
		Writer writer3 = new Writer(lock,0);
		Writer writer4 = new Writer(lock,0);
		Writer writer5 = new Writer(lock,0);
		
		writer1.start();
		writer2.start();
		writer3.start();
		writer4.start();
		writer5.start();
		
		Reader reader1 = new Reader(lock);
		Reader reader2 = new Reader(lock);
		Reader reader3 = new Reader(lock);
		Reader reader4 = new Reader(lock);
		Reader reader5 = new Reader(lock);
		Reader reader6 = new Reader(lock);
		
		reader1.start();
		reader2.start();
		reader3.start();
		reader4.start();
		reader5.start();
		reader6.start();
	}

}
