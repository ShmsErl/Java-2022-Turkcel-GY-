package ClassandObjects;

public class Driver {

	public static void main(String[] args) {
		Daire daire = new Daire();
		daire.x = 12.0;
		daire.y = 5.0;
		daire.r = 5.0;
		double pi = Math.PI;
		double x = daire.cevreHesapla(daire.pi, daire.r);
		double y = daire.alanHesapla(daire.pi, daire.r);
		
		System.out.println("cevre: " + x + "\nalan " + y);

	}

}
