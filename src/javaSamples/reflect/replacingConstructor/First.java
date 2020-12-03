package javaSamples.reflect.replacingConstructor;

public class First {
	private String name = "12345";

	public First() {
		throw new RuntimeException("CHECK");
	}

	public First(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
