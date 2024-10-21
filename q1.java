package labex;

public class q1 {
	public static void main(String[] args) {

		final Object resource1 = new Object();
		
		final Object resource2 = new Object();

		Thread thread1 = new Thread(() -> {

		synchronized (resource10) {

		System.out.println("Thread 1: Locked resource 1");

		try {

			Thread.sleep(100);

		} 
		
		catch (InterruptedException e) {

			e.printStackTrace();
			
		}
		
		synchronized (resource20) {
			System.out.println("Thread 1: Locked resource 2");

		}

		}

		});

		Thread thread2 = new Thread(() -> {

		synchronized (resource20) {

		System.out.println("Thread 2: Locked resource 2");

		try {

		Thread.sleep(100);

		} 
		
		catch (InterruptedException e) {

		e.printStackTrace();

		}

		synchronized (resource10) {

		System.out.println("Thread 2: Locked resource 1");

		}

		}

		});

		thread1.start();

		thread2.start();

		
		}
}
