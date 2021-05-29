package kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.JobAdvertService;
import kodlamaio.hrms.core.results.DataResult;
import kodlamaio.hrms.core.results.Result;
import kodlamaio.hrms.entities.concretes.JobAdvert;

@RestController
@RequestMapping("/api/jobadverts")
public class JobAdvertsController {

	private JobAdvertService jobAdvertService;

	
	@Autowired
	public JobAdvertsController(JobAdvertService jobAdvertService) {	
		this.jobAdvertService = jobAdvertService;
	}
	 	
	@GetMapping("/getall")
	public DataResult<List<JobAdvert>> getAll() {
		
		return  this.jobAdvertService.getAll();
		
	}
	
	
	@GetMapping("/getbyactiveis")
	public DataResult<List<JobAdvert>> getByActiveIs() {
		
		return this.jobAdvertService.getByActiveIs();
		
	}
	
	@GetMapping("/getbyactiveisandemployerid")
	public DataResult<List<JobAdvert>> getByActiveIsAndEmployerId(@RequestParam int employerId) {
		
		return this.jobAdvertService.getByActiveIsAndEmployer_Id(employerId);

	}
	
	
	@PutMapping("/closejobadvert")
	
	public Result closeJobAdvert(@RequestParam int JobAdvetId) {
		
		return this.jobAdvertService.closeJobAdvert(JobAdvetId);
	}
	
	
	
	
	
}
