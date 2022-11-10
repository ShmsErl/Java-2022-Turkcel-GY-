package A;

public class Calisan {
	private String isim;
	private String görev;
	private int maas;
	
	public Calisan(String isim, String görev, int maas) {
		this.isim = isim;
		this.görev = görev;
		this.maas = maas;
		
	}
	
	
	
		
	
	public String getIsim() {
		return isim;
	}
	public void setIsim(String isim) {
		this.isim = isim;
	}
	public String getGörev() {
		return görev;
	}
	public void setGörev(String görev) {
		this.görev = görev;
	}
	public int getMaas() {
		return maas;
	}
	public void setMaas(int maas) {
		this.maas = maas;
	}
	
	public void özet() {
		System.out.println("İsim : " + isim + "\nGörev : " + görev + "\nMaas : " + maas) ;
	}
	
	

}
