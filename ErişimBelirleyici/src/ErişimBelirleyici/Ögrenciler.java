package ErişimBelirleyici;
public class Ögrenciler {
	private String ad;
	private String soyad;
	private int yas;
	
	
	public void ad(String ad) {
		System.out.println("adınız: "+ ad);
	}
	public void yas(int yas) {
		if(yas > 0) {
			System.out.println("Yaşınız : " + yas);
			
		}
		else
		{
			System.out.println("Lütfen doğru bir değer girin... ");
		}
	}

}
