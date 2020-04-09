package javaSamples.i16n;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;
import java.util.Locale;

public class DateFormatStarter {
	public static void main(String[] args) {
		DateFormat df = DateFormat.getDateInstance();
		System.out.println(df);

		// DateFormat dfFull = DateFormat.getDateInstance(DateFormat.FULL, new
		// Locale("BE"));
		// System.out.println(dfFull);

		String s = df.format(new Date());
		System.out.println(s);

		DateFormat dform = DateFormat.getDateInstance(DateFormat.MEDIUM, new Locale("US"));
		Date d = null;
		String str = "April 9, 2020";

		try {
			d = dform.parse(str);
			System.out.println(d);
		} catch (ParseException e) {
			System.err.print("Error position: " + e.getErrorOffset());
		}
		
		dform = DateFormat.getDateInstance(DateFormat.LONG, new Locale("ru","RU"));
		System.out.println(dform.format(d));
		
		dform = DateFormat.getDateInstance(DateFormat.FULL, Locale.GERMAN);
		System.out.println(dform.format(d));
		
		
	}
}
