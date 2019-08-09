package javaSamples.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Starter {

	public static void main(String[] args) {
		List<Person> persons = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			persons.add(new Person("Name " + i, Math.random() + 1));
		}

		List<Double> grades = persons.stream()
				.map(p -> p.getGrade())
				.filter(g -> g > 1.5)
				.collect(Collectors.toList());
	
		grades.stream().forEach(g ->System.out.println(g));
		
		persons.stream()
		.map(p->p.getName())
		.filter(n -> n.endsWith("5"))
		.collect(Collectors.toList())
		.forEach(n -> System.out.println(n));
	
	}

}
