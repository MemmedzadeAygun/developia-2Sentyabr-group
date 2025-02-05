package oop;

public class DigitalPayment implements Payment {
	public void verifyTransaction() {
		System.out.println("Ödəniş təsdiqlənir...");
	}

	@Override
	public void processPayment(double amount) {
		System.out.println(amount+"odenis edildi...");
	}

	@Override
	public String getPaymentType() {
		return "Odenis edildi";
	}
}
