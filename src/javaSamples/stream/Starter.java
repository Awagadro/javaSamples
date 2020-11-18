package javaSamples.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
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
	
		grades.stream().forEach(new MyPrint());
		
		System.out.println();
		
		persons.stream()
		.map(p->p.getName())
		.filter(n -> n.endsWith("5"))
		.collect(Collectors.toList())
		.forEach(n -> System.out.println(n));
	
	}

}

class MyPrint implements Consumer <Double>{
	
	@Override
	public void accept (Double g){
		System.out.println(g);
	}
}

 class Person {
	private String name;
	private Double grade;

	public Person(String name, Double grade) {
		this.name = name;
		this.grade = grade;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getGrade() {
		return grade;
	}

	public void setGrade(Double grade) {
		this.grade = grade;
	}

}