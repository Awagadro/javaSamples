package javaSamples.blinov.ch7;

import java.util.Arrays;
import java.util.regex.Pattern;

public class StringTest {
	public static void main(String[] args) {
		String s = new String(
				"Java — строго типизированный объектно-ориентированный язык программирования, разработанный компанией Sun Microsystems (в последующем приобретённой компанией Oracle). Разработка ведётся сообществом, организованным через Java Community Process, язык и основные реализующие его технологии распространяются по лицензии GPL. Права на торговую марку принадлежат корпорации Oracle. Приложения Java обычно транслируются в специальный байт-код, поэтому они могут работать на любой компьютерной архитектуре, для которой существует реализация виртуальной Java-машины. Дата официального выпуска — 23 мая 1995 года. На 2019 год Java — один из самых популярных языков программирования.");
		System.out.println("БЫЛО:");
		System.out.println(s);

		// разбить текст на слова

		System.out.println(Arrays.toString(text2words(s)));

		System.out.println("СТАЛО:");
		System.out.println(chengeLetter(s, '@', 3));

	}

	private static String[] text2words(String s) {
		Pattern p3 = Pattern.compile("\\p{Punct}?\\p{Blank}+\\p{Punct}?");
		String[] words = p3.split(s);
		return words;
	}

	private static String chengeLetter(String s, char c, int i) {
		// в каждом слове текста i-ю букву заменить заданным символом (c), если i -
		// больше длины слова, корректировку не выполнять.

		return null;

	}
}
