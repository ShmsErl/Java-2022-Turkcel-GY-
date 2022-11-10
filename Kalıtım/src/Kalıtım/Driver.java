package Kalıtım;

public class Driver {

	public static void main(String[] args) {
		Kare kare = new Kare();
		kare.setPosX(5);
		kare.setPosY(6);
		kare.setKenarUzunluk((kare.getPosX() * kare.getPosY()));

		System.out.println(kare.getKenarUzunluk());

		Dikdörtgen dikdörtgen = new Dikdörtgen();
		dikdörtgen.setYükseklik(20);
		dikdörtgen.setUzunluk(60);
		dikdörtgen.setPosX(2);
		dikdörtgen.setPosY(2);
		dikdörtgen.setRenk("Mavi");

	}

}
