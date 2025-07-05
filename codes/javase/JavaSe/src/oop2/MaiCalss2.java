package oop2;

public class MaiCalss2 {
	public static void main(String[] args) {

		Account account = new Account(200);
		account.deposit(100);
		System.out.println("Cari vesait: " + account.getPrice());
		account.withDraw(50);
		System.out.println("Cari vesait: " + account.getPrice());

		CurrentAccount curent = new CurrentAccount(400);
		curent.deposit(300);
		System.out.println("Cari vesait: " + curent.getPrice());
		curent.withDraw(1000);
		System.out.println("Cari vesait: " + curent.getPrice());
	}
}
