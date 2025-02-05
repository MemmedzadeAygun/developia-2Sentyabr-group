package polimorfizm;

/*
class Bank{
	
	public Bank bankInfo(){
		return new Bank();
		
	}
}

class AccessBank extends Bank{
	
	@Override
	public AccessBank bankInfo() {
		return new AccessBank();
	}
	
} */

class Computer{
	String model;
	int year;
	
	public Computer(String model, int year) {
		this.model = model;
		this.year = year;
	}
	
	@Override
		public boolean equals(Object obj) {
//			this.model.equals(obj.model)
		Computer that=null;
		if (obj instanceof Computer) {
			that=(Computer)obj;
		}
		else {
			return false;
		}
			
		if (this.model.equals(that.model) && this.year==that.year) {
			return true;
		}else {
			return false;
		}
	}
}

public class MainClass3 {

	public static void main(String[] args) {
		
//		Bank accessb=new AccessBank();
//		System.out.println(accessb.bankInfo());
		
//		String s1="Alma";
//		String s2="Armud";
//		System.out.println(s1.equals(s2));
		
		Computer computer=new Computer("Inspiro",12);
		Computer computer2=new Computer("Inspiro",12);
		
		String s="Alma";
		
		System.out.println(computer.equals(computer2));
		
	}

}
