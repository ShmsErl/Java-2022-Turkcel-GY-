package SuperKey;

public class Ogrenci extends Kisi {
	private int numara;
	
	public Ogrenci(String isim, int numara) {
		super(isim);
		this.numara = numara;
		
	}

	public int getNumara() {
		return numara;
	}

	public void setNumara(int numara) {
		this.numara = numara;
	}
	
	public void ozet() {
		super.ozet();
		System.out.println("Numara: " + getNumara());
	}

}
