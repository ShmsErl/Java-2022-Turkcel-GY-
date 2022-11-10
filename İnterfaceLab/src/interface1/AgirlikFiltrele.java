package interface1;

public class AgirlikFiltrele implements ElmaFiltrele {
	private int agirlik;
	
	public AgirlikFiltrele(int agirlik) {
		this.agirlik = agirlik;
	}
	@Override
	public boolean filtrele(Elma elma) {
		return elma.getAgirlik() >= agirlik;
	}
	public int getAgirlik() {
		return agirlik;
	}
	public void setAgirlik(int agirlik) {
		this.agirlik = agirlik;
	}

}
