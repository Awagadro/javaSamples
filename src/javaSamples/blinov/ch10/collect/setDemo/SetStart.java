package javaSamples.blinov.ch10.collect.setDemo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class SetStart {
	// использование множества для вывода всех уникальных слов из файла
	public static void main(String[] args) {
		HashSet<String> words = new HashSet<>(100);
		long callTime = System.nanoTime();
		try (Scanner scan = new Scanner(new File("src\\javaSamples\\blinov\\ch10\\collect\\data\\text.txt"))) {
			// src\javaSamples\blinov\ch10\collect\data
			scan.useDelimiter("[^А-я]+");
			while (scan.hasNext()) {
				String word = scan.next();
				words.add(word.toLowerCase());
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		Iterator<String> it = words.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

		TreeSet<String> ts = new TreeSet<>(words);
		System.out.println(ts);
		long totalTime = System.nanoTime() - callTime;
		System.out.println("Различных слов: " + words.size() + ", " + totalTime + " наносекунд");
	}

}
