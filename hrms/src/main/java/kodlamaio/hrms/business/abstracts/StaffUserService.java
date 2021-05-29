package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.results.DataResult;
import kodlamaio.hrms.entities.concretes.StaffUser;

public interface StaffUserService {

	DataResult<List<StaffUser>> getAll();
	
	
}
