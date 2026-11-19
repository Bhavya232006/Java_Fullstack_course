package oops;

public class BankAccount {
	private long AccNo;
	private String AccHolderName, add;
	private float bal;

	public BankAccount(long accNo, String accHolderName, String add, float bal) {
		super();
		AccNo = accNo;
		AccHolderName = accHolderName;
		this.add = add;
		this.bal = bal;
	}

	public long getAccNo() {
		return AccNo;
	}

	public void setAccNo(long accNo) {
		AccNo = accNo;
	}

	public String getAccHolderName() {
		return AccHolderName;
	}

	public void setAccHolderName(String accHolderName) {
		AccHolderName = accHolderName;
	}

	public String getAdd() {
		return add;
	}

	public void setAdd(String add) {
		this.add = add;
	}

	public float getBal() {
		return bal;
	}

	public void setBal(float bal) {
		this.bal = bal;
	}
}
