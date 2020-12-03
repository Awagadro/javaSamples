package javaSamples.interfaceUse;

public class Car {
	private IEngine engine;

	public Car(IEngine engine) {
		this.engine = engine;
	}

	public void move() {
		engine.go();
	}
}
