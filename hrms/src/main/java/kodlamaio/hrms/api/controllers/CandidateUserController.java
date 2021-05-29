package kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.CandidateUserService;
import kodlamaio.hrms.entities.concretes.CandidateUser;

@RestController
@RequestMapping("/api/candidateusers")
public class CandidateUserController {

	private CandidateUserService candidateUserService;
	
	@Autowired
	public CandidateUserController (CandidateUserService candidateUserService) {
		
		this.candidateUserService = candidateUserService;
		
	}
	
	
	@GetMapping("/getall")
	public List<CandidateUser> getAll() {
		
		return this.candidateUserService.getAll();
		
	}
	
	@PostMapping("/findbyemail")
	public List<CandidateUser> findByEmailIs(@RequestBody String email ) {
		
		return this.candidateUserService.findByEmailIs(email);
	
		
	}
	
	@PostMapping("/findbyidentity")
	public List<CandidateUser> findByIdentityIs(@RequestBody String identityNumber) {
		
		
		return this.candidateUserService.findByIdentityNumberIs(identityNumber);
		
	}
	
	@PostMapping("/add")
	public void add(@RequestBody CandidateUser candidateUser) {
		
		this.candidateUserService.add(candidateUser);
	}
	
}
