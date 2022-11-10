package interfaces;



public class CustomerManager {
	private Logger[] loggers= {};
	
	
	
	public CustomerManager(Logger[]loggers) {
		
		this.loggers = loggers;
	}

	public void add(Customer customer) {
		System.out.println("Müşteri Eklendi."+customer.getFirsName());
		Utils.runLogger(loggers, "sdasdads");
		
	}
	
	public void delete(Customer customer) {
		System.out.println("Müşteri Silindi."+customer.getFirsName());
		DatabaseLogger databaselogger= new DatabaseLogger();
		Utils.runLogger(loggers, "sdasdads");
	

		
	}



}
