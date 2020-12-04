package javaSamples.collect.listDemo;

import java.util.ArrayList;
import java.util.List;

public class ArrayListStart {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Java");
		list.add("Java FX2");
		String res = list.get(0); // чтение элемента по индексу
		System.out.println("Позиция №0 из списка : " + res);
		System.out.println(list);

		list.remove(1);// удаление элемента
		System.out.println(list);

		list.add("Java is cool");
		list.add("Java is cool");
		list.add("Java has future");
		list.add("Java brings money");
		System.out.println(list);

		int i = list.indexOf("Java is cool"); // поиск позиции элемента - с начала
		System.out.println("Позиция элемента 'Java is cool' от начала списка: " + i);

		int j = list.lastIndexOf("Java is cool"); // поиск позиции элемента - с конца
		System.out.println("Позиция элемента 'Java is cool' c конца списка: " + j);

		List<String> sublist = list.subList(3, 5); // обрезать список с первого индекса до последнего (не включая)ы
		System.out.println(sublist);
	}

}
