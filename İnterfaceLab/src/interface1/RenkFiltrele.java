package interface1;

public class RenkFiltrele implements ElmaFiltrele {
	private String renk;
	
	public RenkFiltrele(String renk) {
		this.renk = renk;
		
	}
	@Override
	public boolean filtrele(Elma elma) {
		return elma.getRenk().equals(renk);
		
	}

}
