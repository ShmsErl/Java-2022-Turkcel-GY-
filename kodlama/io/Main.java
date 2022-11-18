package kodlama.io;

import kodlama.io.business.CategoryManager;
import kodlama.io.business.CourseManager;
import kodlama.io.dataAccess.HibernateManager;
import kodlama.io.dataAccess.JDBCManager;
import kodlama.io.entities.Category;
import kodlama.io.entities.Courses;

public class Main {

	public static void main(String[] args) throws Exception {
		
		Category catgr = new Category(1, "Teknoloji");
		Courses course = new Courses();
		course.setId(2);
		course.setName("Java");
		course.setUnitPrice(12);
		
		
		CourseManager courseManager1 = new CourseManager(new HibernateManager ());
		courseManager1.add(course);
		
		CategoryManager category = new  CategoryManager(new JDBCManager() );
		category.add(catgr);
		
		

	}
	
	
	
	
	
	

}
