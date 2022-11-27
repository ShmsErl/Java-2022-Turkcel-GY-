package Kodlama.io.Kodlama.io.devs.webApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Kodlama.io.Kodlama.io.devs.business.Request.CreateLanguageRequest;
import Kodlama.io.Kodlama.io.devs.business.Response.GetLanguageResponse;
import Kodlama.io.Kodlama.io.devs.business.abstracts.ProgramingLanguageService;

@RestController
@RequestMapping("/api/programinglanguages")
public class ProgramingLanguagesController {
	private ProgramingLanguageService programingLanguagesService;

	@Autowired
	public ProgramingLanguagesController(ProgramingLanguageService languageService) {
		this.programingLanguagesService = languageService;
	}

	@GetMapping("/getall")
	public List<GetLanguageResponse> getAll() {
		return programingLanguagesService.getAll();
	}

	@PostMapping("/add")
	public void add(CreateLanguageRequest createLanguageRequest) throws Exception {
		programingLanguagesService.add(createLanguageRequest);
	}

	@DeleteMapping("/delete")
	public void delete(int id) throws Exception {
		programingLanguagesService.delete(id);
	}
	@PutMapping("/update")
	public void update(GetLanguageResponse getLanguageResponse) throws Exception {
		programingLanguagesService.update(getLanguageResponse);
	}

	



}
