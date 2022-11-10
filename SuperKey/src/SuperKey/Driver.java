package SuperKey;

public class Driver {
	public static void main(String[] args) {
		Kisi kisi = new Kisi("Şeyhmus");
		System.out.println(kisi.getKisi());
		
		Kisi kisi1 = new Ogrenci("Ahmet",149);
				kisi1.ozet();
		
		
	}
}
