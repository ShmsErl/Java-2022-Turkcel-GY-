package döngüler;

public class sddon {

	public static void main(String[] args) {
		
		Ödev kodlama= new Ödev(1,"ShmsErl","Java and React","Engin Demiroğ");
		
		Ödev product2=  new Ödev();
		product2.setUserId(1);
		product2.setUserName("HP5");
		product2.setCourseName("sadasdsad");
		product2.setInstructorName("Şeyhmus Erol");
		
		

		Ödev[] products= {kodlama,product2};
	
		 for (Ödev product : products){
		 
			 System.out.println("Kullanıcı Adı: "+product.getUserName()+"\nEğitmen Adı:  "+product2.getInstructorName());
			
		 	} 
		 
		 ÖdevMethod ödevmethod=new ÖdevMethod();
		 ödevmethod.instructor(product2);
		
	
		

	}

}
