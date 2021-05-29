package kodlamaio.hrms.business.validationRules;

import kodlamaio.hrms.core.results.Result;
import kodlamaio.hrms.entities.concretes.EmployerUser;

public interface EmployerValidatorService {

	
	Result employerNullCheck(EmployerUser employerUser);
	
}
