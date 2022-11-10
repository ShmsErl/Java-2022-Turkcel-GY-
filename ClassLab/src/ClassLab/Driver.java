package ClassLab;
public class Driver {

	public static void main(String[] args) {
		Telefon telefon = new Telefon();
		telefon.tip = TelefonTipi.Cep;
		telefon.ad = "Android Telefon";
		telefon.marka = "Huawie";
		telefon.model = "P20";
		telefon.androidSürümü = 5.2;
		telefon.mobilVeri = false ;
		telefon.wifi = false;
		
		
		telefon.aramaYap("0543-675-1431");
		System.out.println(telefon.aramaVarmi);
		telefon.aramaSonlandır();
		System.out.println(telefon.aramaVarmi);
		telefon.aramaSonlandır();
		telefon.mobilVeri = true ;
		telefon.mesaj("Deneme mesajı ");
		
		//------------------------------------------------//
		
		Köpek köpek = new Köpek();
		köpek.cins = "Kangal";
		köpek.boyut = Boyut.ORTA;
		köpek.yas = 6;
		köpek.renk = Renk.BEYAZ;
		
		
		köpek.uyu();
		köpek.kos();
	}

}
