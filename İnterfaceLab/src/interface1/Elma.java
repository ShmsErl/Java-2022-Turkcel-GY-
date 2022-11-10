package interface1;

public class Elma {
	private String renk;
	private int agirlik;
	
	public Elma(String renk, int agirlik) {
		this.renk = renk;
		this.agirlik = agirlik;
	}
	
	
	
	public String getRenk() {
		return renk;
	}
	public void setRenk(String renk) {
		this.renk = renk;
	}
	public int getAgirlik() {
		return agirlik;
	}
	public void setAgirlik(int agirlik) {
		this.agirlik = agirlik;
	}

}
