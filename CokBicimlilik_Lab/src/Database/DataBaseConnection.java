package Database;

public class DataBaseConnection {
	
	

	public void DbOpen() {
		System.out.println("Database Bağlantısı Açıldı..");
	}
	
	public void executeQuery(String baglanti) {
		System.out.println(baglanti);
	}
	public void DbClose() {
		System.out.println("Database Bağlantısı Kapatıldı");
	}
	

}
