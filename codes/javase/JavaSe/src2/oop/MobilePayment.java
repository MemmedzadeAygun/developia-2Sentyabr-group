package oop;

public class MobilePayment extends DigitalPayment implements Payment {

	@Override
	public void processPayment(double amount) {
		System.out.println("Mobil cihaz ile odenis" + " " + amount + " " + "AZN odenildi...");
	}

	@Override
	public String getPaymentType() {
		return "Mobil odenis";
	}

}
