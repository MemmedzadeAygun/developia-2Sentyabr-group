package oop2;

class Database {

	public void addDatabase(IDatabase database) {
		database.add();
	}

	public void deleteDatabase(IDatabase database) {
		database.delete();
	}

	public void getDatabase(IDatabase database) {
		database.get();
	}

	public void updateDatabase(IDatabase database) {
		database.update();
	}

}

public class MaiCalss5 {

	public static void main(String[] args) {

		Database db = new Database();

		db.addDatabase(new Mysql());

		db.addDatabase(new PostgreSql());

		/*
		 * IDatabase idatabase=new Mysql();
		 * 
		 * IDatabase idatabase2=new PostgreSql();
		 */
	}
}
