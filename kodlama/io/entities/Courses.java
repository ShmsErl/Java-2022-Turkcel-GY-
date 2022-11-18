package kodlama.io.entities;

public class Courses {
	private int id;
	private String name;
	private double unitPrice;
	
	
	public Courses() {
	
	}


	public Courses(int id, String name, double unitPrice) {
		super();
		this.id = id;
		this.name = name;
		this.unitPrice = unitPrice;
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
	
	public double getUnitPrice() {
		return unitPrice;
	}
	
	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}
	
	public void ozet() {
		System.out.println("Course İD :\t " + getId()+ "Course Name : \t" + getName());
	}
	
	

}
