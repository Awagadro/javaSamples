package javaSamples.blinov.ch7;

public class StringTest {
	public static void main(String[] args) {
		String s = new String(" «Мой дядя самых честных правил,\r\n" + "Когда не в шутку занемог,\r\n"
				+ "Он уважать себя заставил\r\n" + "И лучше выдумать не мог.\r\n" + "Его пример другим наука;\r\n"
				+ "Но, боже мой, какая скука\r\n" + "С больным сидеть и день и ночь,\r\n"
				+ "Не отходя ни шагу прочь!\r\n" + "Какое низкое коварство\r\n" + "Полуживого забавлять,\r\n"
				+ "Ему подушки поправлять,\r\n" + "Печально подносить лекарство,\r\n"
				+ "Вздыхать и думать про себя:\r\n" + "Когда же черт возьмет тебя!»");
		System.out.println("БЫЛО:");
		System.out.println(s);
		
		System.out.println("СТАЛО:");
		
		System.out.println(chengeLetter(s, '@', 3));

	}

	private static String chengeLetter(String s, char c, int i) {
		// в каждом слове текста i-ю букву заменить заданным символом (c), если k -
		// больше длины слова, корректировку не выполнять.

		return null;

	}
}
