package Cokbicimlilik;

public class Kare extends Sekil {
	private int kenarUzunluk;
	
	public Kare(int u) {
		kenarUzunluk = u;
	}
	
	public void alan() {
		System.out.println("Alan : " + Math.pow(kenarUzunluk,2));
		
	}

	public int getKenarUzunluk() {
		return kenarUzunluk;
	}

	public void setKenarUzunluk(int kenarUzunluk) {
		this.kenarUzunluk = kenarUzunluk;
	}

}
