package Kodlama.io.Kodlama.io.devs.business.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import Kodlama.io.Kodlama.io.devs.business.Request.CreateFrameworkRequest;
import Kodlama.io.Kodlama.io.devs.business.Request.CreateLanguageRequest;
import Kodlama.io.Kodlama.io.devs.business.Response.GetFrameworkResponse;
import Kodlama.io.Kodlama.io.devs.business.Response.GetLanguageResponse;
import Kodlama.io.Kodlama.io.devs.business.abstracts.ProgramingLanguageService;
import Kodlama.io.Kodlama.io.devs.dataAccess.abstracts.FrameworkRepository;
import Kodlama.io.Kodlama.io.devs.dataAccess.abstracts.ProgramingLanguageRepository;
import Kodlama.io.Kodlama.io.devs.entities.concretes.ProgramingLanguage;
import Kodlama.io.Kodlama.io.devs.entities.concretes.ProgramingLanguageFramework;

@Service
public class ProgramingLanguagesManager extends ObjectValuesCheckManager implements ProgramingLanguageService {

	ProgramingLanguageRepository programingLanguageRepository;
	FrameworkRepository frameworkRepository;

	public ProgramingLanguagesManager(ProgramingLanguageRepository languageRepository,
			ProgramingLanguageRepository programingLanguageRepository, FrameworkRepository frameworkRepository) {
		super(languageRepository);
		this.programingLanguageRepository = programingLanguageRepository;
		this.frameworkRepository = frameworkRepository;
	}

	@Override
	public List<GetLanguageResponse> getAll() {
		List<ProgramingLanguage> programingLanguages = programingLanguageRepository.findAll();
		List<ProgramingLanguageFramework> frameworks = frameworkRepository.findAll();
		List<GetLanguageResponse> getLanguageResponses = new ArrayList<GetLanguageResponse>();
		List<GetFrameworkResponse> frameworkResponses = new ArrayList<GetFrameworkResponse>();

		for (ProgramingLanguage programingLanguage : programingLanguages) {

			GetLanguageResponse addItem = new GetLanguageResponse();

			addItem.setId(programingLanguage.getId());
			addItem.setName(programingLanguage.getName());

			addItem.setFrameworks(frameworkResponses);

			getLanguageResponses.add(addItem);}

			for (ProgramingLanguageFramework framework : frameworks) {

				GetFrameworkResponse addItem1 = new GetFrameworkResponse();
				addItem1.setId(framework.getId());
				addItem1.setName(framework.getName());
				addItem1.setLanguage_id(framework.getLanguages().getId());
				frameworkResponses.add(addItem1);

			}
		

		return getLanguageResponses;
	}

	@Override
	public void add(CreateLanguageRequest createLanguageRequest) throws Exception {
		ProgramingLanguage language1 = new ProgramingLanguage();
		isLanguageName(createLanguageRequest.getName());
		if (createLanguageRequest.getName().isEmpty()) {
			throw new Exception("Programlama Dili Alanı Boş Olamaz!!!");
		}

		language1.setName(createLanguageRequest.getName());

		programingLanguageRepository.save(language1);
	}

	@Override
	public void delete(int id) throws Exception {
		isLanguageId(id);
		programingLanguageRepository.delete(programingLanguageRepository.getReferenceById(id));

	}

	@Override
	public void update(GetLanguageResponse getLanguageResponse) throws Exception {
		isLanguageId(getLanguageResponse.getId());
		isLanguageName(getLanguageResponse.getName());
		ProgramingLanguage language = programingLanguageRepository.getReferenceById(getLanguageResponse.getId());
		language.setName(getLanguageResponse.getName());

		programingLanguageRepository.save(language);

	}

}
