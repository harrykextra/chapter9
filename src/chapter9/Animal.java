package chapter9;

public class Animal {

	private String name;
	private double weight;
	private Color color;
	protected static int lifeSpan;
	
	public Animal() {}
	public 
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public Color getColor() {
		return color;
	}
	public void setColor(Color color) {
		this.color = color;
	}
	public static int getLifeSpan() {
		return lifeSpan;
	}
	public static void setLifeSpan(int lifeSpan) {
		Animal.lifeSpan = lifeSpan;
	}
}
