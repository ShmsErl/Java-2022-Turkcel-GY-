package kodlama.io.business;

import java.util.ArrayList;
import java.util.List;

import kodlama.io.dataAccess.CategoryDao;
import kodlama.io.entities.Category;

public class CategoryManager {
	private CategoryDao categoryDao;

	public CategoryManager(CategoryDao categoryDao) {
		
		this.categoryDao = categoryDao;
	}
	
	List<Category> categorys = new ArrayList<Category>();
	public void add(Category category) throws Exception {
		for (Category category1 : categorys) {
			if(category.getName().equals(category1.getName())) {
			throw new Exception("Mevcut Kurs İsmi!!!");
		}
		
		}
		categorys.add(category);
		categoryDao.save(category);
		
	}
	
	

}
