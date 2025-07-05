package oop2;

public class Account implements BankAccount {

	private double balance;

	public Account(double balance) {
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
		if (balance > amount) {
			balance = balance - amount;
		} else {
			System.out.println("Balasinizda kifayet qeder vesait yoxdur");
		}

	}

	@Override
	public double getPrice() {
		return balance;
	}

}
