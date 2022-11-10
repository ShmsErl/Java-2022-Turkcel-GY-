package ahmet;
public class Driver {

	public static void main(String[] args) {
		NakliyeAraclar nakarac = new NakliyeAraclar();
		nakarac.setKapasite(100);
		nakarac.setUretici("tırsan");
		
		
		Tır tir = new Tır();
		tir.setKapasite(250);
		tir.setKonteynarSayisi(10);
		tir.setUretici("tırsan");
				

	}

}
