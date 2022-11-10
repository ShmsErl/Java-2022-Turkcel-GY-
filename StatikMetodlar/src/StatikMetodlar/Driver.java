package StatikMetodlar;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Driver {
	
	public static  int x = 20;
	public static void merhaba() {
		System.out.println("MERHAABAA");
	}
	
	public static void main(String[] args) {
		/*Driver driver = new Driver();
		driver.normalMetod(x);
		Driver.statikMetod();
		merhaba();
		int sonuc = Driver.max(10, 6, 11);
		System.out.println(sonuc);
		
		double sonuc1 = Driver.max(10.0f, 6.0f, 12.0f);
		System.out.println(sonuc1);
		
		int [] x= {11,2,3,4};
		int [] y= {11,2,3,5};
		
		
		boolean durum = Driver.eq(x, y);
		System.out.println(durum);
		
		int değer = Driver.topla(x);
		System.out.println(değer);
		
		int[] değer1 = Driver.cift(new int[] {1,2,3,4,5,6,7,8});
		System.out.println(Arrays.toString(değer1));*/ 
		
		int[] l = {1,2,3 } ;
		int x2 = 10;
		int y2 = 11;
		System.out.println(x2 + y2 );
		Driver.degistir(x2,y2);
		System.out.println(x2 + y2);
		
		System.out.println(Arrays.toString(l) );
		Driver.degistir(l);
		System.out.println(Arrays.toString(l));
		
		
	
	}
	
	
	
	public void normalMetod() {
		System.out.println(x);
	}
	public static void statikMetod() {
		System.out.println(x);
	
	}
	public static int max(int x, int y, int z){
		int max = x;
		if(y>x) max = y; 
		if(z>y) max = z;
			
		return max;
		
		
	}
	public static double max(double x, double y, double z) {
		double max = x;
		if(y>x)max = y;
		if(z>y)max = z;
		
		return  max;
	}
	public static boolean eq(int[] x, int[] y) {
		boolean result = false;
		if(x.length == y.length) {
			for(int i = 0; i<x.length ; i++) {
				if(x[i]!=y[i]) {
					result = true;
					break;
				}
				else {
					result = false;
					
				}
				
			}
		}
		return result;
		
	}
	
	public static int topla(int[] x){
		int toplam=0;
		for(int i = 0; i<x.length ; i++) {
			toplam+= x[i];
			
		}
		return toplam;
		
		
	}
	public static int[] cift(int[] x) {
		int[] z = null;
		int sayac=0;
		
		for(int i = 0; i < x.length ; i++) {
			if(x[i]%2 == 0) {
				sayac++;
				
			}
			
			}
		z = new int[sayac];
		int index=0;
		for(int i = 0; i <  x.length; i++) {
			if(x[i] % 2  == 0) {
				z[index++]=x[i];
			}
			
			
			
		}
		return z;
		
	}
	
	public static void degistir(int[] x) {
		int temp = x[0];
		x[0]=x[1];
		x[1]=temp;
	}
	public static void degistir(int x, int y) {
		int temp = x;
		x=y;
		y=temp;
	}

}
