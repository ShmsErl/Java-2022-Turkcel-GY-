package interfaces;

public class Customer {
	private int id;
	private String firsName;
	private String lastName;
	
	public Customer() {
		
	}

	
	public Customer(int id, String firsName, String lastName) {
		super();
		this.id = id;
		this.firsName = firsName;
		this.lastName = lastName;
	}

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirsName() {
		return firsName;
	}

	public void setFirsName(String firsName) {
		this.firsName = firsName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	

}
