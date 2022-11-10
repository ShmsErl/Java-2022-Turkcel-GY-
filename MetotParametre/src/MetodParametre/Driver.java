package MetodParametre;

public class Driver {

	public static void main(String[] args) {
		Ogrenci ogrenci = new Ogrenci();
		ogrenci.ad= "SEHMUS";
		ogrenci.yas = 6;
		
		Driver driver = new Driver();
		driver.ogrenciBilgileri(ogrenci);
		 

	}
	public void ogrenciBilgileri(Ogrenci ogrenci) {
		ogrenci.ad = "adsad";
		System.out.println(ogrenci.ad);
		System.out.println(ogrenci.yas);
	}

}
