package Kodlama.io.Kodlama.io.devs.business.abstracts;

import java.util.List;

import Kodlama.io.Kodlama.io.devs.business.Request.CreateFrameworkRequest;
import Kodlama.io.Kodlama.io.devs.business.Response.GetFrameworkResponse;
import Kodlama.io.Kodlama.io.devs.business.Response.GetLanguageResponse;
import Kodlama.io.Kodlama.io.devs.entities.concretes.ProgramingLanguageFramework;

public interface FrameworkService {
	void add(CreateFrameworkRequest createFrameworkRequest);
	void udpate(GetFrameworkResponse getFrameworkResponse) throws Exception;
	void delete(int id) throws Exception;
	List<GetFrameworkResponse> getAll();
	List<GetFrameworkResponse>getById(int id);

}
