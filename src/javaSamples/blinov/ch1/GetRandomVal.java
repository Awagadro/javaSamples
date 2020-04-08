package javaSamples.blinov.ch1;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class GetRandomVal {

	public static void main(String[] args) {

		System.out.println("Введите число и нажмите <Enter> ");
		Scanner scan = new Scanner(System.in);
		try {
			int val = Integer.parseInt(scan.next());
			for (int i = 0; i < val; i++) {
				int randomNum = ThreadLocalRandom.current().nextInt(-val, val + 1);
				System.out.println(randomNum);
			}
		} catch (NumberFormatException e) {
			System.out.println("Fuck you!");
		}

		scan.close();

	}

}
