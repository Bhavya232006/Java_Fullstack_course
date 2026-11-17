package oops;

public class Dog extends Animal {
	public void eat() {
		System.out.println("Dog is eating");
	}

	public static void main(String[] args) {
		Animal a = new Dog();
		Dog d = (Dog) a;
		d.eat();
	}
}
