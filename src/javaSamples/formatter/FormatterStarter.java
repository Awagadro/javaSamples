package javaSamples.formatter;

import java.util.Formatter;

public class FormatterStarter {

	public static void main(String[] args) {

		Formatter f = new Formatter();

		// форматирование текста
		f.format("This %s is about %n%S %c", "book", "java", '8');
		System.out.println(f);

		// форматирование чисел
		Formatter fNum = new Formatter();
		fNum.format("Hex: %x, Octal: %o", 100, 100);
		System.out.println(fNum);

		fNum = new Formatter();
		fNum.format("%a", 100.001);
		System.out.println(fNum);

		fNum = new Formatter();
		for (double i = 1000; i < 1.0e+10; i *= 100) {
			fNum.format("%g ", i);
			System.out.println(fNum);
		}
	}

}
