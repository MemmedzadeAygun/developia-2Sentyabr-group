package oop;

class BankAccount {

	public void process(DigitalPayment payment) {
		payment.processPayment(1200);
	}

	public void payment(DigitalPayment payment) {
		payment.getPaymentType();
	}

	public void transaction(DigitalPayment payment) {
		payment.verifyTransaction();
	}

}

public class MainClass_OOP {
	public static void main(String[] args) {
		/*
		 * DigitalPayment card=new CardPayment(); card.processPayment(1200);
		 * System.out.println(card.getPaymentType()); card.verifyTransaction();
		 * 
		 * DigitalPayment digital=new MobilePayment(); digital.processPayment(2000);
		 * System.out.println(digital.getPaymentType()); digital.verifyTransaction();
		 */

		BankAccount bank = new BankAccount();

		bank.process(new CardPayment());
		bank.payment(new CardPayment());
		bank.transaction(new CardPayment());

		bank.process(new MobilePayment());

	}
}
