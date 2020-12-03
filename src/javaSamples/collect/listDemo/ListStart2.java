package javaSamples.collect.listDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListStart2 {
	public static void main(String[] args) {
		Comparator<Integer> comp = new Comparator<Integer>() {
			@Override
			public int compare(Integer one, Integer two) {
				return two.intValue() - one.intValue();
			}
		};
		ArrayList<Integer> list = new ArrayList<Integer>();

		Collections.addAll(list, 1, 2, 3, 4, 5);
		Collections.shuffle(list);
		print(list);
		Collections.sort(list);
		print(list);
		Collections.reverse(list);
		print(list);
		Collections.rotate(list, 3);
		print(list);
		System.out.println("min: " + Collections.min(list, comp));
		System.out.println("max: " + Collections.max(list, comp));

		List<Integer> singl = Collections.singletonList(71);
		print(singl);
		// singl.add(21); // ошибка

	}

	private static void print(List<Integer> list) {
		for (int i : list) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
}
