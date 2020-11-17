package javaSamples.car;

public class Starter {

	public static void main(String[] args) {

		IEngine Ie18 = new Engine18();
		Car car = new Car(Ie18);

		IEngine Ie20 = new Engine20();
		Car car1 = new Car(Ie20);

		car.move();
		car1.move();

	}
}
