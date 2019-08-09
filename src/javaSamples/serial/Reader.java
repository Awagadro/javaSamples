package javaSamples.serial;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Reader {
	public static void main(String[] args) {
		testRead();

	}

	private static void testRead() {
		try (FileInputStream fs = new FileInputStream("out.dat"); 
				ObjectInputStream ois = new ObjectInputStream(fs)) {

			Second first = (Second) ois.readObject();
			System.out.println(first.getFirstCode());
			System.out.println(first.getFirstName());
			System.out.println(first.getSecondCode());
			System.out.println(first.getSecondName());

		} catch (IOException e) {
			e.printStackTrace(System.out);
		} catch (ClassNotFoundException ex) {
			ex.printStackTrace(System.out);
		}
	}
}
