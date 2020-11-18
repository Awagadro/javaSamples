package javaSamples.stream;

import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StarterStreamEx {

	public static void main(String[] args) {
		// 1) пример без потока
		int[] arr = { 50, 60, 70, 80, 90, 100, 110, 120 };
		int count = 0;
		for (int x : arr) {
			if (x >= 90)
				continue;
			x += 10;
			count++;
			if (count > 3)
				break;
			System.out.print(x + ",");
		}
		System.out.println();
		// 1) тот же пример с потоком
		IntStream.of(50, 60, 70, 80, 90, 100, 110, 120).filter(x -> x < 90).map(x -> x + 10).limit(3)
				.forEach(System.out::print);
		System.out.println();
		
	//	joining() — cобирает элементы в одну строку. 
		String a = Stream.of("s", "u" ,"p", "e", "r").collect(Collectors.joining());
	       System.out.println(a); 
	// super
	       String b = Stream.of("s", "u", "p", "e", "r").collect(Collectors.joining("-"));
	       System.out.println(b); 
	// s-u-p-e-r
	       String c = Stream.of("s", "u", "p", "e", "r").collect(Collectors.joining(" -> ", "[ ", " ]"));
	       System.out.println(c);  
	// [ s -> u -> p -> e -> r ]

	}

}
