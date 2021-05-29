package kodlamaio.hrms.business.validationRules;

import kodlamaio.hrms.core.results.Result;
import kodlamaio.hrms.entities.concretes.CandidateUser;

public interface CandidateValidatorService {

	  Result candidateNullCheck(CandidateUser candidateUser);
	
}
