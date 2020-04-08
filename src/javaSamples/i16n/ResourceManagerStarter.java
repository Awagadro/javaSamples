package javaSamples.i16n;

import java.util.Locale;

public class ResourceManagerStarter {
	public static void main(String[] args) {
		ResourceManager manager = ResourceManager.INSTANCE;
		System.out.println(manager.getString("str1"));
		manager.changeResource(new Locale("en", "US"));
		System.out.println(manager.getString("str1"));
	}
}
