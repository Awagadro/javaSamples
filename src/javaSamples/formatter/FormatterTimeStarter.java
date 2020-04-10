package javaSamples.formatter;

import java.util.Calendar;
import java.util.Formatter;

public class FormatterTimeStarter {

	public static void main(String[] args) {
		Formatter f = new Formatter();
		Calendar cal = Calendar.getInstance();

		// вывод в 12-часовом временном формате
		f.format("%tr", cal);
		System.out.println(f);

		// форматированный вывод времени и даты
		f = new Formatter();
		f.format("%tc", cal);
		System.out.println(f);

		// вывод текущего часа и минуты
		f = new Formatter();
		f.format("%tl:%tM", cal, cal);
		System.out.println(f);

		// варианты вывода месяца
		f = new Formatter();
		f.format("%tB %tb %tm", cal, cal, cal);
		System.out.println(f);

	}

}
