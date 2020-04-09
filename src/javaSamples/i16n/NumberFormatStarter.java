package javaSamples.i16n;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberFormatStarter {

	public static void main(String[] args) {
		NumberFormat nfGe = NumberFormat.getInstance(Locale.GERMAN);
		NumberFormat nfUs = NumberFormat.getInstance(Locale.US);
		NumberFormat nfFr = NumberFormat.getInstance(Locale.FRANCE);
		double iGe = 0, iUs = 0, iFr = 0;
		String str = "1.2345,5";
		try {
			// преобразование строки в германский стандарт
			iGe = nfGe.parse(str).doubleValue();
			// преобразование строки в американский стандарт
			iUs = nfUs.parse(str).doubleValue();
			// преобразование строки во французский стандарт
			iFr = nfFr.parse(str).doubleValue();
		} catch (ParseException e) {
			System.err.print("Error position: " + e.getErrorOffset());
		}
		System.out.printf("iGe = %f\niUs = %f\niFr = %f", iGe, iUs, iFr);

		// преобразование числа из германчкого в американский стандарт
		String sUs = nfUs.format(iGe);
		// преобразование числа из германчкого во французский стандарт
		String sFr = nfFr.format(iGe);
		System.out.println("\nUs " + sUs + "\nFr " + sFr);
	}

}
