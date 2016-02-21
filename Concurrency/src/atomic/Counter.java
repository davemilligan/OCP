package atomic;

import java.util.concurrent.atomic.AtomicInteger;

public class Counter {
	private AtomicInteger counter = new AtomicInteger();

	public void increment() {
		counter.getAndAdd(1);
	}

	public int getValue() {
		return counter.intValue();
	}
}
