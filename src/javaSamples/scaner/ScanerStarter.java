package javaSamples.scaner;

import java.util.Scanner;

public class ScanerStarter {
	public static void main(String[] args) {
		System.out.println("Please print your name & press <Enter>");
		Scanner scan = new Scanner(System.in);
		String name = scan.next();
		System.out.println("Welcome, " + name);
		scan.close();
	}

}
