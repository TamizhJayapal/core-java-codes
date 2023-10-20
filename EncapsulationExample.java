/*
 * Encapsulation is encapsulate data(fields and methods) 
 * protect data from direct access using public methods
 */


class Box {
	private int length;
	private int breadth;
	private int height;

	public Box(int length, int breadth, int height) {
		this.length = length;
		this.breadth = breadth;
		this.height = height;
	}
	
	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getBreadth() {
		return breadth;
	}

	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int volume() {
		return length * breadth * height;
	}

	public boolean equals(Box box) {
		return breadth == box.breadth && height == box.height && length == box.length;
	}

}

public class EncapsulationExample {

	public EncapsulationExample() {}

	public static void main(String[] args) {
		Box blackBox = new Box(4,5,6);
		System.out.println(blackBox.volume());
	}

}
