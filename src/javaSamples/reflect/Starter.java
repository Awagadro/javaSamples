package javaSamples.reflect;

import java.lang.reflect.Field;

public class Starter {

	public static void main(String[] args) throws Exception {
		// получаем доступ к приватным полям класса и суперкласса
		Class<?> cl1 = Class.forName("javaSamples.reflect.Second");
		// Class<?> cl1 = Second.class; // тоже правильно
		Second o = (Second) cl1.getDeclaredConstructor().newInstance();

		Field field = cl1.getSuperclass().getDeclaredField("name");
		field.setAccessible(true);
		field.set(o, "name");

		Field field2 = cl1.getDeclaredField("name1");
		field2.setAccessible(true);
		field2.set(o, "name1");

		System.out.println(o.getName());
		System.out.println(o.getName1());
	}

}
