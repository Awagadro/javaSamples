package javaSamples;

import java.util.Locale;

public class LocaleSample {
	public static void main(String[] args) {
		Locale current = Locale.getDefault();
		String regionCode = current.getCountry(); // код региона
		String country = current.getDisplayCountry(); // название региона
		String lang = current.getLanguage(); // код языка региона
		String langName = current.getDisplayLanguage(); // название языка региона

		System.out.println("код региона: " + regionCode);
		System.out.println("страна: " + country);
		System.out.println("код языка: " + lang);
		System.out.println("название языка: " + langName);
	}
}
