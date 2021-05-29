package kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.EmployerUserService;
import kodlamaio.hrms.entities.concretes.CandidateUser;
import kodlamaio.hrms.entities.concretes.EmployerUser;

@RestController
@RequestMapping("/api/employerusers")
public class EmployerUserController {

	private EmployerUserService employerUserService;
	
	
	@Autowired
	public EmployerUserController(EmployerUserService employerUserService) {
		
		this.employerUserService = employerUserService;
		
	}
	
	@GetMapping("/getall")
	public List<EmployerUser> getAll() {
		return this.employerUserService.getAll();
		
	}
	
	@PostMapping("/findbyemail")
	public List<EmployerUser> findByEmailIs(@RequestBody String email ) {
		
		return this.employerUserService.findByEmailIs(email);
		
	}
	@PostMapping("/add")
	public void add(@RequestBody EmployerUser employerUser) {
		
		this.employerUserService.add(employerUser);
	}
	
	
}
