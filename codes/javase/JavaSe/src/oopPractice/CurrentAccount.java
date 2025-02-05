package oopPractice;

public class CurrentAccount implements IBankAccount {

	private double balance;

	public CurrentAccount(double balance) {
		super();
		this.balance = balance;
	}

	@Override
	public void deposit(double amount) {
		balance+=amount;
		
	}

	@Override
	public void withDrow(double amount) {
		balance-=amount;	//overDraft hadisesi
	}

	@Override
	public double getBalance() {
		return balance;
	}
	
}
