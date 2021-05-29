package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.JobAdvertService;
import kodlamaio.hrms.business.validationRules.Messages;
import kodlamaio.hrms.core.results.DataResult;
import kodlamaio.hrms.core.results.Result;
import kodlamaio.hrms.core.results.SuccessDataResult;
import kodlamaio.hrms.core.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.JobAdvertDao;
import kodlamaio.hrms.entities.concretes.JobAdvert;

@Service
public class JobAdvertManager implements JobAdvertService {

	
	private final JobAdvertDao jobAdvertDao;
	
	
	
	@Autowired
	public JobAdvertManager(JobAdvertDao jobAdvertDao) {

		this.jobAdvertDao = jobAdvertDao;
		
		
	}

	@Override
	public DataResult<List<JobAdvert>> getAll() {
		return new SuccessDataResult<>(this.jobAdvertDao.findAll());
	}

	@Override
	public DataResult<List<JobAdvert>> getByActiveIs() {
		
		return new SuccessDataResult<>(this.jobAdvertDao.getByActiveIs());
	}

	@Override
	public DataResult<List<JobAdvert>> getByActiveIsAndEmployer_Id(int employerId) {
		
		return new SuccessDataResult<>(this.jobAdvertDao.getByActiveIsAndEmployer_Id(employerId));
	}

	@Override
	public Result closeJobAdvert(int JobAdvertId) {
		
		JobAdvert tempJobAdvert = this.jobAdvertDao.getOne(JobAdvertId);
		
		tempJobAdvert.setActive(false);
		
		
		this.jobAdvertDao.save(tempJobAdvert);
		return new SuccessResult(Messages.update);
		
	}

	
	
	

}
