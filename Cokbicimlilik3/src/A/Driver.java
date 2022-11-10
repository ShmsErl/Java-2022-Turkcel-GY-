package A;

public class Driver {
	public static void main(String[] args) {
		/*Calisan calisan = new Calisan("Şeyhmus Erol", "Web Developer", 2500);
		calisan.özet();*/
		
		Calisan calisan = new Memur("Ahmet", "Web Developer", 2500, "İT");
		calisan.setIsim("Said Orfan Nomany");
		calisan.setGörev("İnşaat Mühendisi");
		
		
		calisan.özet();
		
	}

}
