package UyeBilgileri;
public class Driver {

	public static void main(String[] args) {
		/*Bisiklet bisiklet = new Bisiklet();
		bisiklet.vites = 5;
		bisiklet.hız = 20;
		Bisiklet.bisikletSayisi = 1; 
		
		bisiklet.bilgileriYazdır();
		
		System.out.println(Bisiklet.bisikletSayisi);
		
		Bisiklet bisiklet2 = new Bisiklet();
		
		bisiklet2.hız = 12;
		bisiklet2.vites =8;
		Bisiklet.bisikletSayisi = 2;
		System.out.println(Bisiklet.bisikletSayisi);
		
		bisiklet2.bilgileriYazdır();*/
		
		
		Oyuncu oyuncu = new Oyuncu();
		System.out.println(oyuncu.saglik);
		for(int i = 0; i < 30; i++) {
			oyuncu.darbe();
			System.out.println(oyuncu.saglik);
		}
		oyuncu.yasam();
		System.out.println(oyuncu.saglik);
		
	}

}
