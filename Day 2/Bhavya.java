package oops;

public class Bhavya extends BankAccount{

	public Bhavya(long accNo, String accHolderName, String add, float bal) {
		super(accNo, accHolderName, add, bal);
		// TODO Auto-generated constructor stub
	}
public static void main(String[] args) {
	Bhavya b=new Bhavya(123456789,"bhavya","blr",98765.0f);
	System.out.println(b.getBal());
	b.setBal(1000.0f);
	System.out.println(b.getBal());
}	

}
