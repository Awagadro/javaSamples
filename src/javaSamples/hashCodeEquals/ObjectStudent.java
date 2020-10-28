package javaSamples.hashCodeEquals;

public class ObjectStudent {
	private Long id;
	private String name;

	public ObjectStudent(long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	@Override
	public boolean equals(Object o) {
		System.out.println("equals() is called" + this + o);
		ObjectStudent os = (ObjectStudent) o;
		return id.equals(os.getId()) && name.equals(os.getName());
	}

	@Override
	public int hashCode() {
		System.out.println("hashCode() is called" + this);
		return this.id.intValue();
	}

	@Override
	public String toString() {
		return "ObjectStudent [id=" + id + ", name=" + name + "]";
	}
}
