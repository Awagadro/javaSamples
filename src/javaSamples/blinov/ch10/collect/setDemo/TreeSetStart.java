package javaSamples.blinov.ch10.collect.setDemo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

public class TreeSetStart {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		boolean b;
		for (int i = 0; i < 6; i++) {
			list.add((int) (Math.random() * 100) + "Y");
		}
		System.out.println(list + "список");
		TreeSet<String> set = new TreeSet<String>(list); // упорядоченное множество
		
		System.out.println(set + "множество");
		System.out.println(set.comparator()); // null - String реализует Comparable

		System.out.println("извлечение наибольшего и наименьшего элемента");
		System.out.println(set.last() + " " + set.first());

		HashSet<String> hSet = new HashSet<>(set);
		for (String str : hSet) {
			System.out.println(str + "    " + str.hashCode());
		}
	}

}
