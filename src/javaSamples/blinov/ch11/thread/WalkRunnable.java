package javaSamples.blinov.ch11.thread;

public class WalkRunnable implements Runnable {
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Walking");
			try {
				Thread.sleep(7); // остановка на 7 милисекунд
			} catch(InterruptedException e) {
				System.err.print(e);
			}
		}
	}
}
