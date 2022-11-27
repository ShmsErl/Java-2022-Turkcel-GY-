package Kodlama.io.Kodlama.io.devs.business.abstracts;

import java.util.List;

import Kodlama.io.Kodlama.io.devs.business.Request.CreateLanguageRequest;
import Kodlama.io.Kodlama.io.devs.business.Response.GetLanguageResponse;

public interface ProgramingLanguageService {
	
	
	void add(CreateLanguageRequest createLanguageRequest) throws Exception;
	void delete(int id) throws Exception; 
	void update(GetLanguageResponse getLanguageResponse)throws Exception;
	List<GetLanguageResponse> getAll(); 
}
