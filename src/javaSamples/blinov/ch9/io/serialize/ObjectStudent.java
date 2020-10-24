package javaSamples.blinov.ch9.io.serialize;

import java.io.Serializable;

public class ObjectStudent implements Serializable {
	protected static String faculty;
	private String name;
	private int id;
	private transient String password;
	private static final long serialVersionUID = 1L;

	public ObjectStudent(String nameOfFaculty, String name, int id, String password) {
		faculty = nameOfFaculty;
		this.name = name;
		this.id = id;
		this.password = password;
	}

	@Override
	public String toString() {
		return "StudentObject [\nfaculty=" + faculty + ",\nname=" + name + ",\n id=" + id + ",\n password=" + password
				+ "]";
	}

}
