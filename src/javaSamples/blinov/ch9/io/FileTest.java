package javaSamples.blinov.ch9.io;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class FileTest {

	public static void main(String[] args) {
		// с объектом типа File ассоциируется файл да диске FileTest2.java
		File fp = new File("src\\javaSamples\\blinov\\ch9\\io\\data\\FileTest2.java");
		if (fp.exists()) {
			System.out.println(fp.getName() + " существует");
			if (fp.isFile()) { // если объект - дисковый файл
				System.out.println("Путь к файлу " + fp.getPath());
				System.out.println("Абсолютный путь файлу " + fp.getAbsolutePath());
				System.out.println("Размер файла " + fp.length());
				System.out.println("Последняя модификация " + new Date(fp.lastModified()));
				System.out.println("Файл доступен для чтения: " + fp.canRead());
				System.out.println("Файл доступен для записи: " + fp.canWrite());
				System.out.println("Файл удален:\t " + fp.delete());
			}
		} else {
			System.out.println("Файл " + fp.getName() + "  не существует");
			try {
				if (fp.createNewFile()) {
					System.out.println("Файл " + fp.getName() + "  создан");
				}
			} catch (IOException e) {
				System.out.println(e);
			}
		}
		// в объект типа File помещается каталог/директория
		// в корне проекта должен быть создан каталог data с несколькими файлами
		File dir = new File("src\\javaSamples\\blinov\\ch9\\io\\data");
		if (dir.exists() && dir.isDirectory()) { /* если объект является каталогом и он существует */
			System.out.println("каталог " + dir.getName() + " существует");
		}
		File[] files = dir.listFiles();
		for (int i = 0; i < files.length; i++) {
			Date date = new Date(files[i].lastModified());
			System.out.println("\n" + files[i].getPath() + " \t| " + files[i].length() + " \t|" + date);
			// использовать toLocaleSrting() или toGMTString()
		}
		// метод listRoots() возвращает воступные корневые каталоги
		File root = File.listRoots()[1];
		System.out.printf("\n%s %,d из %,d свободно.", root.getPath(), root.getUsableSpace(), root.getTotalSpace());
	}

}
