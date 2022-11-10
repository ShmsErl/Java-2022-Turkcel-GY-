package Abstract;

public class Basketbol extends Oyuncu {
	
	public Basketbol(String isim, String numara) {
		super(isim, numara);
	}
	
	@Override
	public void sutCek() {
		System.out.println(super.getIsim() +"\tAdlı\t" + super.getNumarasi() +"\tNumaralı\t" +"Oyuncu Şut Çekti..");
	}
	@Override
	public void pasVer() {
		System.out.println(super.getIsim()+"\tAdlı\t"+super.getNumarasi()+"\tNumaralı\t"+"Oyuncu Pas Verdi..");
	}


}
