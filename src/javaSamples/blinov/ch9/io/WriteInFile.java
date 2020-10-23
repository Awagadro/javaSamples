package javaSamples.blinov.ch9.io;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class WriteInFile {
	// демонстрация вывода в файл строк и чисел с плавающей точкой
	public static void main(String[] args) {

		File f = new File("src\\javaSamples\\blinov\\ch9\\io\\data\\res.txt"); // создание файла

		f.delete();// если файл уже существует на диске, его нужно удалить

		double[] v = { 1.10, 1.2, 1.401, 5.01, 6.017, 7, 8 };
		try (PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(f, true)))) { // последовательно
																								// обернутые друг в
																								// друга классы
			for (double version : v) {
				pw.printf("Java %.2g%n", version); // запись прямо в файл
			}
		} catch (IOException e) {
			System.err.println("ошибка открытия потока " + e);
		}
	}

}
