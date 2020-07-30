package javaSamples.blinov.ch7.String;

import java.util.Arrays;
import java.util.regex.Pattern;

public class StringTest {
	public static void main(String[] args) {
		String s = new String(
				"Java - строго типизированный объектно-ориентированный язык программирования, разработанный компанией Sun Microsystems (в последующем приобретённой компанией Oracle). Разработка ведётся сообществом, организованным через Java Community Process, язык и основные реализующие его технологии распространяются по лицензии GPL. Права на торговую марку принадлежат корпорации Oracle. Приложения Java обычно транслируются в специальный байт-код, поэтому они могут работать на любой компьютерной архитектуре, для которой существует реализация виртуальной Java-машины. Дата официального выпуска - 3 мая 1995 года. На 2019 год Java - один из самых популярных языков программирования.");
		System.out.println("БЫЛО:");
		System.out.println(s);

		System.out.println("СТАЛО1:");
		System.out.println(chengeLetter(s, '@', 3));

		System.out.println("СТАЛО2:");
		System.out.println(Arrays.toString(extractWords(s)));
		int[] count = countWords(s);

	}

	private static String chengeLetter(String s, char c, int i) {
		// в каждом слове текста i-ю букву заменить заданным символом (c), если i -
		// больше длины слова, корректировку не выполнять.
		StringBuilder sb = new StringBuilder();
		String[] words = text2words(s);
		for (String word : words) {
			char[] ch = word.toCharArray();
			if (ch.length > i) {
				ch[i] = c;
			}
			sb.append(ch);
			sb.append(' ');
		}

		return sb.toString();
	}

	private static String[] text2words(String s) {
		// разбить текст на слова
		Pattern p3 = Pattern.compile("\\p{Blank}+");
		String[] words = p3.split(s);
		return words;
	}

	private static int[] countWords(String s) {
		// подсчитать количество повторов в тексте каждого слова
		String[] words = extractWords(s);

		// поиск уникальных элементов
		String[] uniqWords = new String[2];
		uniqWords[0] = words[0];
		for (int j = 0; j < words.length; j++) {
			String temp = words[j];
			if (!uniqWords[j].equals(temp)) {
				
			} else {

			}
		}
		System.out.println(Arrays.toString(uniqWords));
		return null;
	}

	private static String[] extractWords(String s) {
		// разбить текст на слова (исключая знака препинания)
		Pattern p3 = Pattern.compile("(?U)\\W+");
		String[] words = p3.split(s);
		return words;
	}

}