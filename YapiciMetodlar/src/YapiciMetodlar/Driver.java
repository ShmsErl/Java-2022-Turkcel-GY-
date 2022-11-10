package YapiciMetodlar;
public class Driver {
	
	String ad;
	int yas;
	
	public Driver(String ad, int yas){
			this.ad = ad;
			this.yas = yas;
			
		
		
	}

	public static void main(String[] args) {
		Driver driver = new Driver("mehmet",6);
		System.out.println(driver.ad);
		System.out.println(driver.yas);
		

	}

}
