package interface1;


public class Driver {
	public static void main(String[] args) {
		Elma[] elmalar = new Elma[10];
		elmalar[0] = new Elma("sarı",20);
		elmalar[1] = new Elma("Kırmızı",32);
		elmalar[2] = new Elma("Yeşil",45);
		elmalar[3] = new Elma("Sarı",50);
		elmalar[4] = new Elma("Kırmızı",10);
		elmalar[5] = new Elma("Yeşil", 17);
		elmalar[6] = new Elma("sarı",20);
		elmalar[7] = new Elma("Kırmızı",32);
		elmalar[8] = new Elma("Yeşil",45);
		elmalar[9] = new Elma("Sarı",50);
		
		/*
		renkFiltrele("Yeşil", elmalar);
		System.out.println("---------------------------------------------");
		agirlikFiltrele(15, elmalar);
		
		
	}
	
	public static void renkFiltrele(String renk, Elma[] elmalar) {
		for (int i = 0; i < elmalar.length; i++) {
				Elma elma = elmalar[i];
				if(elma.getRenk().equals(renk)) {
					System.out.println(elma.getRenk() +"\t"+elma.getAgirlik());
				}
		}
		}
		
		
		public static void agirlikFiltrele(int agirlik, Elma[] elmalar) {
			for (int i = 0; i < elmalar.length; i++) {
					Elma elma = elmalar[i];
					if(elma.getAgirlik() >= agirlik) {
						System.out.println(elma.getRenk() +"\t"+elma.getAgirlik());
					}
			}*/
		ElmaFiltrele filtre1 = new RenkFiltrele("Yeşil");
		ElmaFiltrele filtre = new AgirlikFiltrele(20);
		filtrele(filtre, elmalar);
		System.out.println("---------------------------");
		filtrele(filtre1, elmalar);
	
		
	}
	public static void filtrele(ElmaFiltrele elmaFitrele, Elma[] elmalar) {
		for (int i = 0; i < elmalar.length; i++) {
			Elma elma = elmalar[i];
			if(elmaFitrele.filtrele(elma)) {
				System.out.println(elma.getAgirlik() + elma.getRenk() );
			}
			
		}
			
		}

}
