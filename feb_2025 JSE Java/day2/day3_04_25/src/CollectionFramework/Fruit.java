package CollectionFramework;

import java.util.Objects;

public class Fruit {
	private String name;
	private String color;

	public Fruit() {
		name = "unkonwn";
		color = "unknown";
	}

	public Fruit(String name, String color) {
		super();
		this.name = name;
		this.color = color;
	}

	public String getName() {
		return name;
	}

	public String getColor() {
		return color;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Fruit [name=" + name + ", color=" + color + "]";
	}

//	as over meaning in hashCode() mrethod 
	/*
	 * { 
	 * int hashvalue = name.length() + color.length(); 
	 * return hashvalue; 
	 * }
	 */
	@Override
	public int hashCode() {
		System.out.print(name.length()+color.length());
		return Objects.hash(color, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Fruit other = (Fruit) obj;
		return Objects.equals(color, other.color) && Objects.equals(name, other.name);
	}
}
