package javaSamples.blinov.ch9.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFromFile {

	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(
				new FileReader("src\\javaSamples\\blinov\\ch9\\io\\data\\res.txt"))) {
			String tmp = "";
			while ((tmp = br.readLine()) != null) {
				String[] s = tmp.split("\\s"); // пробел использовать как разделитель
				// вывод полученных строк
				for (String res : s) {
					System.out.println(res);
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
