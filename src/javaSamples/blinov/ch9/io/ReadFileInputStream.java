package javaSamples.blinov.ch9.io;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileInputStream {
	// чтение по одному символу (байту) из потока ввода
	public static void main(String[] args) {
		String file = "src\\javaSamples\\blinov\\ch9\\io\\data\\file.txt";
		File f = new File(file); // объект для связи с файлом на диске
		int b, count = 0;
		try (FileReader is = new FileReader(f)) {

			while ((b = is.read()) != -1) { // чтение
				System.out.print((char) b);
				count++;
			}
			System.out.println("\n число байт = " + count);
		} catch (IOException e) {
			System.out.println("Ошибка файла: " + e);
		}
	}

}
