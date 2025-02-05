package polimorfizm;

class Bank{
	
	public Bank() {
		// TODO Auto-generated constructor stub
	}

	Bank makeSound() {
		System.out.println("Animal make sound");
		return new Bank();
	}
}

class KapitalBank extends Bank{

	public KapitalBank() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	KapitalBank makeSound() {
		System.out.println("Cat make sound");
		return new KapitalBank();
	}
}

public class MainClass4 {

	public static void main(String[] args) {
		Bank a1=new Bank();
		a1.makeSound();
		
		KapitalBank cat=new KapitalBank();
		cat.makeSound();
		
		Bank b=new KapitalBank();
	}

}
