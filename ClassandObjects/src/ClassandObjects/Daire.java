package ClassandObjects;
public class Daire {
	double x,y;
	double r;
	double pi = Math.PI;
	
	public double cevreHesapla(double pi, double r) {
		return 2 * pi * r;
		
	}
	public double alanHesapla(double pi, double r) {
			return pi * Math.pow(r, 2);
	}
	

}
