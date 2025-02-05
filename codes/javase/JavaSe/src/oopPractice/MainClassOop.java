package oopPractice;

public class MainClassOop {
	public static void main(String[] args) {
		SavingAccount saveAccount=new SavingAccount(400);
		saveAccount.deposit(200);
		System.out.println("Saving account balance: "+saveAccount.getBalance());
		saveAccount.withDrow(100);
		System.out.println("Saving account balance after: "+saveAccount.getBalance());
		saveAccount.getBalance();
		
		
		CurrentAccount curAccount=new CurrentAccount(300);
//		IBankAccount curAccount=new CurrentAccount(300);
		curAccount.deposit(100);
		System.out.println("Current account balance: "+curAccount.getBalance());
		curAccount.withDrow(600);
		System.out.println("Current account balance after: "+curAccount.getBalance());
		curAccount.getBalance();
		
	}
}
