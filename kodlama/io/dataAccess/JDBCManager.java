package kodlama.io.dataAccess;

import kodlama.io.entities.Category;
import kodlama.io.entities.Courses;
import kodlama.io.entities.Instractor;

public class JDBCManager implements CourseDao, CategoryDao, InstractorDao  {

	@Override
	public void save(Instractor instractor) {
		System.out.println("Eğitmen JDBC ile kaydedildi.");
		
	}

	@Override
	public void save(Category category) {
		System.out.println("Category JDBC ile kaydedildi."+ category.getName());
		
	}

	@Override
	public void save(Courses course) {
		System.out.println("Kurs JDBC ile kaydedildi." +  course.getName());
	}
	

}
