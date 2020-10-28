package javaSamples.hashCodeEquals;

import java.util.HashSet;
import java.util.Set;

public class Starter {

	public static void main(String[] args) {
		ObjectStudent os1 = new ObjectStudent(11L, "name1");
		ObjectStudent os2 = new ObjectStudent(11L, "name2");
		if (os1.equals(os2)) {
			System.out.println("Ok");
			System.out.println(os1.hashCode());
			System.out.println(os2.hashCode());
		}
		Set<ObjectStudent> set = new HashSet<>();
		set.add(os1);
		set.add(os2);
		System.out.println("SIZE:" + set.size());
	}

}
