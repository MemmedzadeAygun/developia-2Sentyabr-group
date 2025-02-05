package oopPractice;

public class SavingAccount implements IBankAccount{

	private double balance;
	
	public SavingAccount(double balance) {
		super();
		this.balance = balance;
	}

	@Override
	public void deposit(double amount) {
		balance+=amount;
	}

	@Override
	public void withDrow(double amount) {
		if (balance>=amount) {
			balance-=amount;
		} else {
			System.out.println("Balansinizda kifayet qeder vesait yoxdur...");
		}
		
	}

	@Override
	public double getBalance() {
		return balance;
	}

}
