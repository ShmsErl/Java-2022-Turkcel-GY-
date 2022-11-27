package Kodlama.io.Kodlama.io.devs.business.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Kodlama.io.Kodlama.io.devs.business.Request.CreateFrameworkRequest;
import Kodlama.io.Kodlama.io.devs.business.Response.GetFrameworkResponse;
import Kodlama.io.Kodlama.io.devs.business.abstracts.FrameworkService;
import Kodlama.io.Kodlama.io.devs.dataAccess.abstracts.FrameworkRepository;
import Kodlama.io.Kodlama.io.devs.dataAccess.abstracts.ProgramingLanguageRepository;
import Kodlama.io.Kodlama.io.devs.entities.concretes.ProgramingLanguage;
import Kodlama.io.Kodlama.io.devs.entities.concretes.ProgramingLanguageFramework;

@Service
public class FrameworksManager implements FrameworkService {

	private FrameworkRepository frameworkRepository;
	private ProgramingLanguageRepository languageRepository;

	@Autowired
	public FrameworksManager(FrameworkRepository frameworkRepository, ProgramingLanguageRepository languageRepository) {

		this.frameworkRepository = frameworkRepository;
		this.languageRepository = languageRepository;
	}

	@Override
	public List<GetFrameworkResponse> getAll() {
		List<ProgramingLanguageFramework> prFramework = frameworkRepository.findAll();
		List<GetFrameworkResponse> getLanguageResponses = new ArrayList<GetFrameworkResponse>();
		for (ProgramingLanguageFramework framework : prFramework) {
			GetFrameworkResponse addItem = new GetFrameworkResponse();
			addItem.setId(framework.getId());
			addItem.setName(framework.getName());
			addItem.setLanguage_id(framework.getLanguages().getId());
			
			getLanguageResponses.add(addItem);

		}

		return getLanguageResponses;
	}

	@Override
	public void add(CreateFrameworkRequest createFrameworkRequest) {
		List<ProgramingLanguage> languages = languageRepository.findAll();
		ProgramingLanguageFramework frameWork = new ProgramingLanguageFramework();
		for (ProgramingLanguage programingLanguage : languages) {
			if(programingLanguage.getId() == createFrameworkRequest.getLanguage_id()) {
				frameWork.setName(createFrameworkRequest.getName());
				frameWork.setLanguages(programingLanguage);
				frameworkRepository.save(frameWork);
			}
			else {
				continue;
			}
			
		}
		
		
		
		
		
		

	}

	@Override
	public void delete(int id) throws Exception {
		frameworkRepository.deleteById(id);
		
		

	}

	@Override
	public void udpate(GetFrameworkResponse getLanguageResponse) throws Exception {
		
		List<ProgramingLanguageFramework> framework = frameworkRepository.findAll();
		
		
		GetFrameworkResponse frameworkResponse = new GetFrameworkResponse();
		for (ProgramingLanguageFramework programingLanguageFramework : framework) {
			
			if(getLanguageResponse.getId() == programingLanguageFramework.getId()) {
				frameworkResponse.setLanguage_id(getLanguageResponse.getLanguage_id());
				frameworkResponse.setName(getLanguageResponse.getName());
				
				
			
				frameworkRepository.save(programingLanguageFramework);
				
			}
			
		} 
		
		
		
		

		}
	@Override
	public List<GetFrameworkResponse> getById(int id) {
		List<ProgramingLanguageFramework> frameworks = frameworkRepository.findAll();
		List<GetFrameworkResponse> frameworkResponses = new ArrayList<GetFrameworkResponse>();
		
		for (ProgramingLanguageFramework getFrameworkResponse : frameworks) {
			GetFrameworkResponse response = new GetFrameworkResponse();
			if(getFrameworkResponse.getId() == id) {
				
				response.setId(getFrameworkResponse.getId());
				response.setName(getFrameworkResponse.getName());
				response.setLanguage_id(getFrameworkResponse.getLanguages().getId());
			
			}
			else {
				continue;
			}
			frameworkResponses.add(response);
		
			
		}
		return frameworkResponses;
		
		
		
		
	}

	

}
