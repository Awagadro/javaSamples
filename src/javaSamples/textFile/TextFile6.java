package javaSamples.textFile;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.SortedMap;

public class TextFile6 {
	public static void main(String[] args) {
// несколько способов перпедать текстовый файл в List<String>
		final String fileName = "test.txt";
//		List<String> list = readList_6(fileName);
//		List<String> list = readList_7(fileName);
		List<String> list = readList_7_2(fileName);

		for (String s : list) {
			System.out.println(s);
		}

		SortedMap<String, Charset> map = Charset.availableCharsets();
		for (String s : map.keySet()) {
			System.out.println(s);
		}

	}

	private static List<String> readList_6(String fileName) {
		List<String> result = new LinkedList<>();
		try {

			BufferedReader br = new BufferedReader(new FileReader(fileName));
			try {
				String line;
				while ((line = br.readLine()) != null) {
					result.add(line);
				}
			} finally {
				br.close();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		return result;
	}

	private static List<String> readList_7(String fileName) {
		List<String> result = new LinkedList<>();
		try (InputStreamReader fr = new InputStreamReader(new FileInputStream(fileName), Charset.forName("UTF-8"));
				BufferedReader br = new BufferedReader(fr);) {
			String line;
			while ((line = br.readLine()) != null) {
				result.add(line);
			}

		} catch (IOException e) {
			e.printStackTrace(System.out);
		}

		return result;
	}

	private static List<String> readList_7_2(String fileName) {
		try {
			return Files.readAllLines(Paths.get(fileName));

		} catch (IOException e) {
			e.printStackTrace(System.out);
		}
		return Collections.EMPTY_LIST;

	}
}
