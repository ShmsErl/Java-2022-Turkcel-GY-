package Kodlama.io.Kodlama.io.devs.business.concretes;

import org.springframework.stereotype.Service;

import Kodlama.io.Kodlama.io.devs.business.abstracts.ObjectValuesCheckService;
import Kodlama.io.Kodlama.io.devs.dataAccess.abstracts.ProgramingLanguageRepository;
import Kodlama.io.Kodlama.io.devs.entities.concretes.ProgramingLanguage;

@Service
public class ObjectValuesCheckManager implements ObjectValuesCheckService {

	ProgramingLanguageRepository languageRepository;

	public ObjectValuesCheckManager(ProgramingLanguageRepository languageRepository) {

		this.languageRepository = languageRepository;
	}

	@Override
	public void isLanguageId(int id) throws Exception {
		boolean result = false;
		for (ProgramingLanguage language : this.languageRepository.findAll()) {
			if (id == language.getId()) {
				result = true;

			}
		}
		if (result == true) {
			

		} else {
			throw new Exception("Id Bulunamadı");
		}

	}

	@Override
	public void isLanguageName(String name) throws Exception {

		for (ProgramingLanguage language : this.languageRepository.findAll()) {
			if (name.equals(language.getName())) {
				throw new Exception("Girilen Programlama Dili Mevcut");

			} else {
				continue;
			}

		}

	}

}
