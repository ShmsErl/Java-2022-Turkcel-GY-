package döngüler;

public class Ödev
{
	public Ödev() {
		System.out.println("sistem hatası");
	}
	
	private int userId;
	private String userName;
	private String courseName;
	private String instructorName;
	
	
	public Ödev(int userId, String userName, String courseName,String instructorName) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.courseName = courseName;
		this.instructorName=instructorName;
	}
	
	public int getUserId() {
		return userId;
	}

	
	public void setUserId(int userId) {
		this.userId = userId;
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public String getCourseName() {
		return courseName;
	}


	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}


	public String getInstructorName() {
		return instructorName;
	}


	public void setInstructorName(String instructorName) {
		this.instructorName = instructorName;
	}

	

}
