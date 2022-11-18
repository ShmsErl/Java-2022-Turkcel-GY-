package kodlama.io.entities;

public class Instractor {
	private int id;
	private String name;
	private String lastName;
	private String profession;
	
	
	public Instractor() {
		
	}


	public Instractor(int id, String name, String lastName, String profession) {
	
		this.id = id;
		this.name = name;
		this.lastName = lastName;
		this.profession = profession;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getProfession() {
		return profession;
	}


	public void setProfession(String profession) {
		this.profession = profession;
	}
	
	public void ozet() {
		System.out.println(getId()+ "\t" + getName()+ "\t"  + getLastName()+ "\t"  + getProfession());
	}
	
	
	

}
