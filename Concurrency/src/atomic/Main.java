package atomic;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		Counter counter = new Counter();
		Thread t1 = new Thread(new IncrementerThead(counter));
		Thread t2 = new Thread(new IncrementerThead(counter));
		t2.start();
		t1.start();
		t1.join();
		t2.join();
		System.out.println(counter.getValue());
	}

}
