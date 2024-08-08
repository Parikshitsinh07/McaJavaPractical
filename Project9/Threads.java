class OddThread extends Thread {
	int i;

	public void run() {
		for (i = 0; i <= 100; i++) {
			if (i % 2 != 0) {
				System.out.println("Odd Number is: " + i);
			}
		}
	}
}

class PrimeThread implements Runnable {
	int count = 0, i,j;

	public void run() {
		for (i = 2; i <= 100; i++) {
			for (j = 0; j < i / 2; j++) {
				if (j % i == 0) {
					count = count + 1;
				}
			}
			if (count == 0) {
				System.out.println("This is Prime Number:" + i);
				
			}
			count = 0;
		}

	}
}

class Threads {
	public static void main(String[] a) {
		OddThread Odd = new OddThread();
		// PrimeThread Prime = new PrimeThread();
		Thread t = new Thread(new PrimeThread());
		Odd.start();
		t.start();
		try {
			Odd.join();
			t.join();
		} catch (InterruptedException e) {
			System.out.println("Interrupted Exception ");
		}
	}
}