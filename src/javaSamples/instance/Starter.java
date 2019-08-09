package javaSamples.instance;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Starter {

	public static void main(String[] args) {
		Class<First> cl = First.class;
		try {
			Constructor<First> cns = cl.getDeclaredConstructor(String.class);
			First f = cns.newInstance("TEST");
			System.out.println(f.getName());
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
			System.out.println("FINISH");
		}

	}

