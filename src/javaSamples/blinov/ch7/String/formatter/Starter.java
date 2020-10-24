package javaSamples.blinov.ch7.String.formatter;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.Formatter;
import java.util.Locale;

public class Starter {

	public static void main(String[] args) throws IOException {
		
		String s = "%1$tY.%1$tm.%1$td %1$tR переведена сумма в размере %2$07.2f руб. по счету №'%3$s'%n";
		String answer = String.format(Locale.forLanguageTag("ru"), s, new Date(), 99.8, "AC12345");
		System.out.println(answer);
		try(Formatter fm = new Formatter (new File ("out.txt"))){
			fm.format(s, new Date(), 99.8, "AC12345");
			fm.format(s, new Date(), 99.8, "AC12345");
			fm.format(s, new Date(), 99.8, "AC12345");
		}
	}

}
