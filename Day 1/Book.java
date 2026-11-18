package basic;

public class Book {
	String type;
	int pages;
	float price;

	public Book() {
		System.out.println("Constructor");
	}

	public Book(String type, int pages, float price) {
		System.out.println(type);
		System.out.println(pages);
		System.out.println(price);
	}

	public Book(int pages, float price, String type) {
		this.type = type;
		this.pages = pages;
		this.price = price;
	}

	public static void main(String[] args) {
		System.out.println("main");
		Book b1 = new Book();
		Book b2 = new Book("ruler", 100, 60.0f);
		Book b3 = new Book(100, 40.0f, "plain");
		System.out.println(b3.pages);
		System.out.println(b3.price);
		System.out.println(b3.type);
	}

}
