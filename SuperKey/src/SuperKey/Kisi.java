package SuperKey;

public class Kisi {
	private String kisi;
	
	 
	public Kisi(String isim) {
		this.kisi = isim ;
	}

	public String getKisi() {
		return kisi;
	}

	public void setKisi(String kisi) {
		this.kisi = kisi;
	}
	public void ozet() {
		System.out.println("İsim: " + getKisi());
	}
	
	
	

}
