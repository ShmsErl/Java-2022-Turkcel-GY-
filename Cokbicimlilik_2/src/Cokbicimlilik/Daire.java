package Cokbicimlilik;

public class Daire extends Sekil{
	private int yariCap;
	
	public Daire(int u) {
		yariCap = u ;
	}

	public int getYariCap() {
		return yariCap;
	}

	public void setYariCap(int yariCap) {
		this.yariCap = yariCap;
	}
	
	public void alan() {
		System.out.println("Alan : " + (Math.PI *Math.pow(yariCap, 2)));
	}
	
}
