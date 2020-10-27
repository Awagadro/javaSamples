package javaSamples.blinov.ch11.thread.synchronizedDemo;

public class SyncThread extends Thread {
	private Resource res;

	public SyncThread(String name, Resource res) {
		super(name);
		this.res = res;
	}

	public void run() {
		for (int i = 0; i < 5; i++) {
			res.writing(getName(), i); // место срабатывания синхронизации
		}
	}
}
