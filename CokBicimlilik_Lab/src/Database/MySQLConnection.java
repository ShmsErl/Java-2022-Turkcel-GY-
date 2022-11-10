package Database;

public class MySQLConnection extends DataBaseConnection {

	public void DbOpen() {

		System.out.println("MySQL Bağlantısı Açıldı..");

	}

	public void executeQuery(String baglanti) {

		System.out.println(baglanti);
		System.out.println("Veri alındı");

	}

	public void DbClose() {

		System.out.println("MySQL Bağlantısı Kapatıldı");

	}

}
