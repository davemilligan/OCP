package forkjoin;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveAction;

public class InitialiseLargeArray extends RecursiveAction {
	private final int THRESHOLD = 10000;
	private Date[] data;
	private int start;
	private int end;
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Date[] data = new Date[10000000];
		ForkJoinPool p = new ForkJoinPool();
		InitialiseLargeArray original = new InitialiseLargeArray(data, 0, data.length);
		p.invoke(original);
	}
	
	public InitialiseLargeArray(Date[]data, int start, int end) {
		this.data = data;
		this.start = start;
		this.end = end;
	}

	@Override
	protected void compute() {
		if ((end - start) <= THRESHOLD) {
			for (int i = start; i < end; i++) {
				data[i] = new Date();				
			}
			System.out.println("Completed " + start + " " + end);
		} else {
			int halfway = ((end - start) / 2) + start;
			InitialiseLargeArray left = new InitialiseLargeArray(data, start, halfway);
			InitialiseLargeArray right = new InitialiseLargeArray(data, halfway, end);
			left.fork();
			right.compute();
			left.join();
		}
		
	}

}
