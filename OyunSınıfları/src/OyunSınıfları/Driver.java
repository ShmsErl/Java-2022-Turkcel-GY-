package OyunSınıfları;

public class Driver {

	public static void main(String[] args) {
		Calisan calisan = new Calisan();
	
		calisan.setIsim("ahmet");	
		System.out.println(calisan.getIsim());
		
		
		Kare kare = new Kare();
		kare.setX(12.0);
		kare.setY(5.0);
		kare.setUzunluk(kare.getX() * kare.getY());
		System.out.println(kare.getUzunluk());
	}

}
