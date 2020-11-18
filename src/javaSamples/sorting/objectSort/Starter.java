package javaSamples.sorting.objectSort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import javaSamples.stream.streamApiSample.Person;

public class Starter {

	public static void main(String[] args) {
		List<Person> persons = new ArrayList<Person>();
		persons.add(new Person("Вася", 14));
		persons.add(new Person("Коля", 25));
		persons.add(new Person("Юля", 28));
		persons.add(new Person("Ваня", 45));
		persons.add(new Person("Люда", 60));
		persons.add(new Person("Валера", 16));
		persons.add(new Person("Костя", 35));
		persons.add(new Person("Маша", 20));

		Comparator<Person> compareByAge = new Comparator<Person>() {
			@Override
			public int compare(Person p1, Person p2) {
				return p1.getAge() - p2.getAge();
			}
		};

		Comparator<Person> compareByName = new Comparator<Person>() {
			@Override
			public int compare(Person p1, Person p2) {
				return p1.getName().compareTo(p2.getName());
			}
		};

		Collections.sort(persons, compareByAge); // sorting by age
		persons.stream().forEach(n -> System.out.println(n));
		System.out.println("Sorting...");

		Collections.sort(persons, compareByName); // sorting by name
		persons.stream().forEach(n -> System.out.println(n));

	}

}
