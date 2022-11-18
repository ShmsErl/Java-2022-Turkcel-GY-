package kodlama.io.business;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import kodlama.io.dataAccess.InstractorDao;
import kodlama.io.entities.Instractor;

public class InsractorManager {
	
	private InstractorDao ınsractorDao;
	
	public InsractorManager(InstractorDao insractorDao) {
		
		this.ınsractorDao = insractorDao;
	}

	List<Instractor> ınstractors = new ArrayList<Instractor>();
	public void add(Instractor ınstractor) throws Exception {
		if(ınstractor.getName().isEmpty()) {
			throw new Exception("Eğitmen Adı Boş Olamaz");
		}
		ınstractors.add(ınstractor);
		ınsractorDao.save(ınstractor);
	}

}
