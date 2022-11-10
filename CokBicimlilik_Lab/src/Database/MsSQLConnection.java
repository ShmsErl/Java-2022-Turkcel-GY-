package Database;

public class MsSQLConnection extends DataBaseConnection {
	

	

	public void DbOpen() {

		System.out.println("MsSQL Bağlantısı Açıldı..");

	}

	public void executeQuery(String baglanti) {

		System.out.println(baglanti);
		System.out.println("Veri alındı");

	}

	public void DbClose() {

		System.out.println("MsSQL Bağlantısı Kapatıldı");

	}

	public static DataBaseConnection newInstance() {
		// TODO Auto-generated method stub
		return null;
	}

}
