package Database;

public class Oracle extends DataBaseConnection {

	public void DbOpen() {

		System.out.println("Oracle Bağlantısı Açıldı..");

	}

	public void executeQuery(String baglanti) {

		System.out.println(baglanti);
		System.out.println("Veri alındı");
	}

	

	public void DbClose() {

		System.out.println("Oracle Bağlantısı Kapatıldı");

	}
}
