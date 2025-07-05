package oop;

public class CardPayment extends DigitalPayment implements Payment {

	@Override
	public void processPayment(double amount) {
		System.out.println("Kart ile odenis" + " " + amount + " " + "AZN odenidi...");
	}

	@Override
	public String getPaymentType() {
		return "Kart odenisi";
	}

}
