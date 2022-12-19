package LayerDemo.Entities.Concretes;

public class Users {
	
	private int userId;
	private String 	name;
	private String surName;
	private String identityNumber;
	private String birthDate;
	
	public Users(int userId, String name, String surName, String identityNumber,String birthDate) {
		super();
		this.userId = userId;
		this.name = name;
		this.surName = surName;
		this.identityNumber = identityNumber;
		this.birthDate = birthDate;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurName() {
		return surName;
	}

	public void setSurName(String surName) {
		this.surName = surName;
	}

	public String getIdentityNumber() {
		return identityNumber;
	}

	public void setIdentityNumber(String identityNumber) {
		this.identityNumber = identityNumber;
	}

	public String getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}
	
	

}
