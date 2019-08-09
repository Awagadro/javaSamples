package javaSamples.lambda.function;

import java.util.function.BiFunction;

public class Starter {

	public static void main(String[] args) {

		Starter s = new Starter();
		Person p = new Person();

		s.processHospital(p, 4, (g, d) -> 0.8 * 8 * d * g);
		s.processAdditional(p, 8.5, (g, h) -> 2.0 * 8 * h * g);
	}

	public void processHospital(Person p, Integer days, BiFunction<Double, Integer, Double> ph) {
		ph.apply(p.getGrade(), days);
		// write to DB
		// send mail...
	}

	public void processAdditional(Person p, Double hours, BiFunction<Double, Double, Double> ph) {
		ph.apply(p.getGrade(), hours);
		// write to DB
		// send mail...
	}
}
