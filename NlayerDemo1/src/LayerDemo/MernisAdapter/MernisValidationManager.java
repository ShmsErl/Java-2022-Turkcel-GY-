package LayerDemo.MernisAdapter;



public class MernisValidationManager  {
	
String identityNumber = "123";
String name = "Şeyhmus";
String surName = "Erol";
String birtDate ="1999-08-01";
	public boolean validation(String id, String name, String surname, String birtDate) {
		boolean result = false;
		if(this.identityNumber == id  && this.name == name && this.surName ==surname && this.birtDate == birtDate) {
			
			result = true;
		}
		else {
			result = false;
		}
	
		return result;
		
		
	}

}
