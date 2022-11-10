package Metodlar;

import java.util.Scanner;

public class Driver {
	
	public static void hello() {
		System.out.println("Merhaba Arkadaşlar");
	}
	public int topla(int x, int y) {
		int toplam = x + y;
		return toplam;
	}
	public static void main(String[] args) {
		Driver gel= new Driver();
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Lütfen bir 'X' sayısı giriniz: ");
		int x = scanner.nextInt();
		System.out.println("Lütfen bir 'Y' sayısı giriniz: ");
		int y = scanner.nextInt();
		System.out.println(gel.topla(x,y));
		
	}

}
