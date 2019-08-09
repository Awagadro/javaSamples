package javaSamples.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Starter {

	public static void main(String[] args) {

//		File src = new File(".");
//		File[] files = src.listFiles((p) -> p.isDirectory());
//		for (File f : files) {
//			System.out.println(f.getName());
//		}

		List<String> list = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			list.add(String.format("%02d", i));
		}
		
		Collections.sort(list, (s1, s2) -> -s1.compareTo(s2));
		
		
		for (String s : list) {
			System.out.println(s);
		}
	}
}
