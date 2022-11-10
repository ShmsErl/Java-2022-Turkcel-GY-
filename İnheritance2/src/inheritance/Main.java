package inheritance;
public class Main {

	public static void main(String[] args) {
		CustomerManager customer=new CustomerManager();
		customer.add(new DatabaseLogger());
	}

}
