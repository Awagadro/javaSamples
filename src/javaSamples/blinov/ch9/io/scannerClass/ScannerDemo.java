package javaSamples.blinov.ch9.io.scannerClass;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ScannerDemo {
	public static void main(String[] args) {
		String file = "src\\javaSamples\\blinov\\ch9\\io\\data\\res.txt";

		try (FileReader fr = new FileReader(file); Scanner scan = new Scanner(fr)) {
			while (scan.hasNext()) {
				if (scan.hasNextInt()) {
					System.out.println(scan.nextInt() + " :int");
				} else if (scan.hasNextBoolean()) {
					System.out.println(scan.nextBoolean() + " :boolean");
				} else if (scan.hasNextDouble()) {
					System.out.println(scan.nextDouble() + " :double");
				} else {
					System.out.println(scan.next() + " :String"); // чаще всего этого достаточно
				}
			}
		} catch (FileNotFoundException e) {
			System.err.print(e);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
}
