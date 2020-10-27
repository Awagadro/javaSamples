package javaSamples.blinov.ch11.thread.atomicDemo;

import java.util.Random;
import java.util.concurrent.atomic.AtomicLong;

public class Market extends Thread {
	private AtomicLong index;

	public AtomicLong getIndex() {
		return index;
	}

	public void setIndex(AtomicLong index) {
		this.index = index;
	}

	@Override
	public void run() {
		Random random = new Random();
		try {
			while (true) {
				index.addAndGet(random.nextInt(10));
				Thread.sleep(random.nextInt(500));
				index.addAndGet(-1 * random.nextInt(10));
				Thread.sleep(random.nextInt(500));
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
