package javaSamples.stream.streamApiSample;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Starter {
	public static void main(String[] args) {
		List<Person> urr = new ArrayList<Person>();
		urr.add(new Person("Вася", 14));
		urr.add(new Person("Коля", 25));
		urr.add(new Person("Юля", 28));
		urr.add(new Person("Ваня", 45));
		urr.add(new Person("Люда", 60));
		urr.add(new Person("Валера", 16));
		urr.add(new Person("Костя", 35));
		urr.add(new Person("Маша", 20));

		// find persons between 18 & 30
		List<Person> persons = new ArrayList<Person>();
		persons = urr.stream().filter((p) -> p.getAge() > 18 && p.getAge() < 30).collect(Collectors.toList());
		for (Person person : persons) {
			System.out.println(person);
		}

	}
}
