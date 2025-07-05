package oop2;

public class CurrentAccount implements BankAccount {
	private double balance;

	public CurrentAccount(double balance) {
		super();
		this.balance = balance;
	}

	@Override
	public void deposit(double amount) {
//		price+=amount;
		balance = balance + amount;

	}

	@Override
	public void withDraw(double amount) {
		balance = balance - amount;
	}

	@Override
	public double getPrice() {
		return balance;
	}

}
