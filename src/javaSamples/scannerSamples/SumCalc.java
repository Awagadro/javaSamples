package javaSamples.scannerSamples;

import java.util.Scanner;

public class SumCalc {
	public static void main(String[] args) {
		// ввод с консоли целых чисел с их суммированием
		int sum = 0;
		System.out.println("Введите число и нажмите <Enter> ");
		Scanner scan = new Scanner(System.in);
		boolean isEnough = false;

		while (isEnough == false) {
			int sum2 = sum;
			sum = iterationSum(sum, scan);
			if (sum2 == sum) {
				isEnough = true;
			} else {
				sum2 = sum;
			}
		}

		scan.close();

	}

	private static int iterationSum(int sum, Scanner scan) {

		try {
			int val = Integer.parseInt(scan.next());
			if (val == 0) {
				System.out.println("Конец подсчета: " + sum);
			} else {
				sum = sum + val;
				System.out.println(
						"Новое значение: " + sum + " Чтобы продолжить введите число, чтобы закончить нажмите ноль <0>");

			}
		} catch (NumberFormatException e) {

			System.out.println("Fuck you!");
		}
		return sum;
	}

}
