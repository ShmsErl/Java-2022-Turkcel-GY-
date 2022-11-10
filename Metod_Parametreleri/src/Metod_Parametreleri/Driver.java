package Metod_Parametreleri;

import java.util.Arrays;

public class Driver {

	public static void main(String[] args) {
		Driver driver = new Driver();
		int x=20;
		System.out.println(x);
		driver.passByValue(x);
		System.out.println(x);
		
		int[] sayilar = {2,3,4,5,60};
		System.out.println(Arrays.toString(sayilar));
		driver.degistir(sayilar);
		System.out.println(Arrays.toString(sayilar));
		
		driver.test(x);
		
		
				

	}
	public void passByValue(int x) {
		System.out.println("PBV"+ x);
		x=10;
		System.out.println("PBV" + x);
		
	}
	public void degistir(int[] sayilar) {
		for(int i = 0; i<sayilar.length ; i++) {
			sayilar[i]*=sayilar[i];
		}
		
		
	}
	public void test(final int x) {
		//x=10;
		System.out.println(x);
	}

}
