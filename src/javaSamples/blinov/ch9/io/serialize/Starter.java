package javaSamples.blinov.ch9.io.serialize;

import java.io.InvalidObjectException;

public class Starter {

	public static void main(String[] args) {
		// создание и запись объекта
		ObjectStudent s = new ObjectStudent("FMF", "Ivanov", 1, "G017s9");
		System.out.println(s);
		String file = "src\\javaSamples\\blinov\\ch9\\io\\data\\student.data";
		ObjectSerializator sz = new ObjectSerializator();
		boolean b = sz.serealization(s, file);
		ObjectStudent.faculty = "GEO"; // изменение значения static-поля
		// чтение и вывод объекта
		ObjectStudent res = null;
		try {
			res = sz.deserialization(file);
		} catch (InvalidObjectException e) {
			e.printStackTrace();
		}
		System.out.println(res);
	}

}
