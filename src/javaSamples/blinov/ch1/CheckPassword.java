package javaSamples.blinov.ch1;

import java.util.Scanner;

public class CheckPassword {

	public static void main(String[] args) {
		String correctPass = "12345Gg";

		System.out.println("Введите пароль и нажмите <Enter> ");
		Scanner scan = new Scanner(System.in);
		String pass = scan.next();

		if (pass.equals(correctPass)) {
			System.out.println("Добро пожаловать!");
		} else {
			System.out.println("Fuck you!");
		}
		scan.close();

	}
}
