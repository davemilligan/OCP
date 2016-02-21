package atomic;

public class IncrementerThead extends Thread {
	private Counter counter;

	public IncrementerThead(Counter counter) {
		this.counter = counter;
	}

	public void run() {
		for (int i = 0; i < 100000; i++) {
			counter.increment();
		}		
	}

}
