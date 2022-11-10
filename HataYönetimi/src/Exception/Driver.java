package Exception;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Driver {
	public static void main(String[] args) {
		// yaz();
		//oku();
	int a = 7;
	int b= 0;
	try {
		int c = a/b;
	System.out.println(c);
	}
	catch(ArithmeticException e){
		System.out.println("Girdiğiniz Değer '0' olmamalli" + e.getMessage());
		throw e;
	}
	finally {
		System.out.println("Buraya gelindi.");
	}
	

	}
	
	
	
	
	

	public static void oku() {
		File file = new File("read.txt");
		FileReader oku = null;
		try {
			oku = new FileReader(file);
			int c = 0;
			while ((c = oku.read()) != -1) {
				System.out.print((char) c);

			}
			oku.read();

		} catch (IOException e) {
			System.out.println(e.getMessage());
		} finally {
			if(oku != null) {
				
			
			try {
				oku.close();
			} catch (IOException e) {
				System.out.println(e.getLocalizedMessage());
				
			}
		}
			}

	}

	public static void yaz() {

		File file = new File("Read.me");
		Scanner scanner = new Scanner(System.in);
		FileWriter filewrite = null;
		try {
			filewrite = new FileWriter(file);
			System.out.println("Lütfen bilgi giriniz : ");
			String nesne = scanner.nextLine();

			filewrite.write(nesne);

		} catch (IOException e) {
			System.out.println(e.getMessage());
			// TODO: handle exception
		} finally {
			try {
				filewrite.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			scanner.close();
		}

	}

}
