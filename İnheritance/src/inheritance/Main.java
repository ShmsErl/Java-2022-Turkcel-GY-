package inheritance;
public class Main {

	public static void main(String[] args) {
		IndividualCustomer sehmus = new IndividualCustomer();
		sehmus.customerNumber="34353451";
		
		
		
		 
		CustomerCorpareted hepsiburada= new CustomerCorpareted();
		hepsiburada.customerNumber="213123";
		
		
		
		
		CustomerManager customermanager = new CustomerManager();
		
		UnionCustomer abc= new UnionCustomer();
		abc.customerNumber="99999";
		
		Customer [] customers= {sehmus,hepsiburada,abc};
		
		customermanager.addMultiple(customers);
		
	}
	
	
	

}
