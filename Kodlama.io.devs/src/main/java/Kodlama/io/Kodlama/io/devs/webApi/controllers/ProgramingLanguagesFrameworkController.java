package Kodlama.io.Kodlama.io.devs.webApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Kodlama.io.Kodlama.io.devs.business.Request.CreateFrameworkRequest;
import Kodlama.io.Kodlama.io.devs.business.Response.GetFrameworkResponse;
import Kodlama.io.Kodlama.io.devs.business.abstracts.FrameworkService;

@RestController
@RequestMapping("/api/framework")
public class ProgramingLanguagesFrameworkController {

	private FrameworkService frameworkService;

	@Autowired
	public ProgramingLanguagesFrameworkController(FrameworkService frameworkService) {

		this.frameworkService = frameworkService;
	}

	@GetMapping("/getall")
	public List<GetFrameworkResponse> getAll() {
		return frameworkService.getAll();

	}
	@GetMapping("/getbyid")
	public List<GetFrameworkResponse> getById(int id){
		return frameworkService.getById(id);
	}

	@PostMapping("/add")
	public void add(CreateFrameworkRequest createFrameworkRequest) {
		frameworkService.add(createFrameworkRequest);

	}

	@PutMapping("/update")
	public void update(GetFrameworkResponse framework) throws Exception {
		frameworkService.udpate(framework);
	}

	@DeleteMapping("/delete")
	public void delete(int id) throws Exception {
		frameworkService.delete(id);
	}

}
