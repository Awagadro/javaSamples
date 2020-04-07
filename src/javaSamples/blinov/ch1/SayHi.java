package javaSamples.blinov.ch1;

import java.util.Scanner;

public class SayHi {

	public static void main(String[] args) {

		System.out.println("Введите свое имя и нажмите <Enter> ");
		Scanner scan = new Scanner(System.in);
		String name = scan.next();
		System.out.println("Привет, " + name);
		scan.close();
	}

}
