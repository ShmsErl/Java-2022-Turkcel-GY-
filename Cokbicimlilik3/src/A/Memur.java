package A;

public class Memur extends Calisan {
	private String birim;
	
	

	public Memur(String isim, String görev, int maas, String birim) {
		super(isim, görev, maas);
		this.birim=birim;
	
	}
	
	public String getBirim() {
		return birim;
	}

	public void setBirim(String birim) {
		this.birim = birim;
	}
	public void özet() {
		
		System.out.println("İsim : " + getIsim() + "\nGörev : " + getGörev() + "\nMaas : " + getMaas( )+ "\nBirim : " + getBirim()) ;
	}
	

}
