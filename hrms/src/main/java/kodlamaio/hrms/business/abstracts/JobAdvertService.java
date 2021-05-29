package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.results.DataResult;
import kodlamaio.hrms.core.results.Result;
import kodlamaio.hrms.entities.concretes.JobAdvert;

public interface JobAdvertService {

	DataResult<List<JobAdvert>> getAll();
 	DataResult<List<JobAdvert>> getByActiveIs();
	
 	DataResult<List<JobAdvert>> getByActiveIsAndEmployer_Id(int employerId);

	Result closeJobAdvert(int JobAdvertId);
	
}
