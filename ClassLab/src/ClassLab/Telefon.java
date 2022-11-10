package ClassLab;

public  class Telefon {
	TelefonTipi tip;
	String ad;
	String marka;
	String model;
	double androidSürümü;
	double internetKotası;
	boolean wifi;
	boolean mobilVeri;
	boolean aramaVarmi;
	
	void aramaYap(String phoneNumber) {
		System.out.println(phoneNumber);
		aramaVarmi = true;
		
	}
	void aramaSonlandır() {
		if(aramaVarmi) {
			System.out.println("Arama Sonlandırıldı");
			aramaVarmi = false;
			}
		else {
				System.out.println("Mevcut bir arama bulunamadı " +"\nArama Durumu :" + aramaVarmi);
			}
		
	}
	
	void mesaj(String Mesaj) {
		if(mobilVeri || wifi) {
			System.out.println("MESAJ GÖNDERİLDİ: " + Mesaj);
		}
		else {
			System.out.println("Lütfen Mobil Veriyi Yada Wifi Kontrol edin...");
		}
		
	}
	
	

}
