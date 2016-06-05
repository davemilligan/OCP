package variable;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		VolatileThread vt = new VolatileThread();
		vt.start();
		Scanner s = new Scanner(System.in);
		s.nextLine();
		vt.stopRunning();
	}
}

class VolatileThread extends Thread {
	
	public VolatileThread() {
		System.out.println(Thread.currentThread().getName() + " " + counter++);
	}
	
	// In theory if this variable was not volatile it could be cached in memory
	// by the thread and updating its value in the main thread will not be
	// reflected in the run thread.
	private volatile boolean running = true;
	private int counter = 0;

	public void run() {
		while (running) {
			System.out.println(Thread.currentThread().getName() + " " + counter++);
			try {
				Thread.sleep(20);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public void stopRunning() {
		System.out.println(Thread.currentThread().getName() + " " + counter++);
		running = false;
	}
}
