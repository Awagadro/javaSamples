package javaSamples.lambda;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Starter {

	public static void main(String[] args) {
// пример использования лямбда-функций
		// получить все названия папок
		File src = new File(".");
		File[] files = src.listFiles((p) -> p.isDirectory());
		for (File f : files) {
			System.out.println(f.getName());
		}

		// сортировка листа строк (знак - меняет порядок)
		List<String> list = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			list.add(String.format("%02d", i));
		}
		Collections.sort(list, (s1, s2) -> -s1.compareTo(s2));

		for (String s : list) {
			System.out.println(s);
		}
	}
}
