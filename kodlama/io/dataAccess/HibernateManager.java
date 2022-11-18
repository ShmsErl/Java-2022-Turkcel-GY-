package kodlama.io.dataAccess;

import kodlama.io.entities.Category;
import kodlama.io.entities.Courses;
import kodlama.io.entities.Instractor;

public class HibernateManager implements CourseDao, CategoryDao, InstractorDao {

	@Override
	public void save(Instractor instractor) {
		System.out.println("Eğitmen Hibernate ile kaydedildi.");
		
	}

	@Override
	public void save(Category category) {
		System.out.println("Kategori Hibernate ile kaydedildi."+ category.getName() + category.getId());
		
	}

	@Override
	public void save(Courses course) {
		System.out.println("Kurs Hibernate ile kaydedildi."+ course.getName());
		
	}
	
	
}
