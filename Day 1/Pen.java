package basic;

public class Pen {
	String col;
	String com;
	float price;

	public Pen(String color, String company, float priceData) {
		this("red", "class");
		this.col = color;
		this.com = company;
		this.price = priceData;
		System.out.println("Constructor with 3 value");
	}

	public Pen(String color, String company) {
		this("red");
		this.col = color;
		this.com = company;
		System.out.println("Constructor with 2 value");
	}

	public Pen(String color) {
		// this("red","cello",10.0f); no equal number of this call can be used in
		// constructor
		System.out.println("Constructor with 1 value");
	}

	public static void main(String[] args) {
		System.out.println("Main");
		Pen p1 = new Pen("Red", "Cello", 10.0f);
		System.out.println(p1.col);
		System.out.println(p1.com);
		System.out.println(p1.price);
	}
}
