package javaSamples.blinov.ch9.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFileOutputStream {

	public static void main(String[] args) {
		String sArray[] = { "2021 ", "Java EE 8" };
		File fbyte = new File("src\\javaSamples\\blinov\\ch9\\io\\data\\byte.data");
		File fsymb = new File("src\\javaSamples\\blinov\\ch9\\io\\data\\symbol.txt");
		try (FileOutputStream fos = new FileOutputStream(fbyte); FileWriter fw = new FileWriter(fsymb)) {
			for (String s : sArray) {
				fos.write(s.getBytes()); // метод для вывода данных
				fw.write(s); // метод для вывода символов
			}
		} catch (IOException e) {
			System.out.println("ошибка записи: " + e);
		}
	}

}
