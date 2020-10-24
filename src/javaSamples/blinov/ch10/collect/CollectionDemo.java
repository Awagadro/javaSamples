package javaSamples.blinov.ch10.collect;

import java.util.ArrayList;

public class CollectionDemo {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("Java");
		list.add("Java FX2");
		String res = list.get(0);
		System.out.println("озиция №0 из списка : " + res);
		System.out.println(list);
	}

}
