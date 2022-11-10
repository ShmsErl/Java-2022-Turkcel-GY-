package interfaces;

public class Main {

	public static void main(String[] args) {
		 Logger[] loggers= {new FileLogger(),new DatabaseLogger(),new SmsLogger()};
		 
		
		 
			CustomerManager customermanager= new CustomerManager(loggers);
			Customer file= new Customer(1,"Sehmys","erol");
			customermanager.add(file);
		
		
			
	}

}
