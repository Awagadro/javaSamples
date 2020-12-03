package javaSamples.scannerSamples;

import java.util.Scanner;

public class ScanerSayHi {

	public static void main(String[] args) {

		System.out.println("Введите свое имя и нажмите <Enter> ");
		Scanner scan = new Scanner(System.in);
		String name = scan.next(); // nextLine() - если нужно читать строки
		System.out.println("Привет, " + name);
		scan.close();
	}

}
