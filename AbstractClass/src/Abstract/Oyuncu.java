package Abstract;

public abstract class Oyuncu {
	private String isim;
	private String numarasi;
	
	
	public Oyuncu(String isim, String numara) {
		this.isim = isim;
		this.numarasi = numara;
	}
	
	
	public String getIsim() {
		return isim;
	}
	public void setIsim(String isim) {
		this.isim = isim;
	}
	public String getNumarasi() {
		return numarasi;
	}
	public void setNumarasi(String numarasi) {
		this.numarasi = numarasi;
	}
	
	public abstract void sutCek() ;
	public abstract void pasVer();
	

}
