package kodlama.io.business;

import java.util.ArrayList;
import java.util.List;

import kodlama.io.dataAccess.CourseDao;
import kodlama.io.entities.Courses;

public class CourseManager {
	private CourseDao courseDao;

	public CourseManager(CourseDao courseDao) {

		this.courseDao = courseDao;
	}

	List<Courses> courses = new ArrayList<Courses>();

	public void add(Courses course) throws Exception {
		if (course.getUnitPrice() < 0) {
			throw new Exception("Kurs fiyatı '0' dan küçük olamaz");
		}
		for (Courses courses : courses) {
			if (courses.getName() == course.getName()) {
				throw new Exception("Kurs Mevcuttttt");
			}

		}
		courses.add(course);
		courseDao.save(course);

	}

}
