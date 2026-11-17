package oops;

public class Phonev2 extends Phonev1 {
	public void fingerprint() {
		System.out.println("scanning finger");
	}

	public static void main(String[] args) {
		Phonev2 p = new Phonev2();
		p.fingerprint();
	}
}
