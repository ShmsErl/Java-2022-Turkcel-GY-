package ezme;

public class Elma {
	private int agirlik;
	
	public  Elma(int agirlik) {
		this.agirlik = agirlik;
	}
	
	 

	public int getAgirlik() {
		return agirlik;
	}

	public void setAgirlik(int agirlik) {
		this.agirlik = agirlik;
	}
	@Override
	public String toString() {
		return "Ağırlık: " + getAgirlik();
		
	}
	
	

}
