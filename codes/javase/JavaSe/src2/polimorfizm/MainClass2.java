package polimorfizm;

class Database{
	
	public void addDatabase(IDatabase database) {
		database.add();
	}
	
//	public void addDatabase(Mysql mysql) {
//		mysql.add();
//	}
//	public void addDatabase(Postgresql pos) {
//		pos.add();
//	}
	
	//Postgresql pos=new Mysql();
//	IDatabase database=new Mysql()
	
	public void deleteDatabase(IDatabase database) {
		database.delete();
	}
	
	public void updateDatabase(IDatabase database) {
		database.update();
	}
	
	public void getDatabase(IDatabase database) {
		database.get();
	}
}

public class MainClass2 {

	public static void main(String[] args) {
		Database db=new Database();
		
		db.addDatabase(new Mysql());
		db.addDatabase(new Postgresql());
		
		
		
	}

}
