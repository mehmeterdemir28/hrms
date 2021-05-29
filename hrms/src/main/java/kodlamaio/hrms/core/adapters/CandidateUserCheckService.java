package kodlamaio.hrms.core.adapters;

import kodlamaio.hrms.entities.concretes.CandidateUser;

public interface CandidateUserCheckService {

	
	boolean checkIfRealPerson(CandidateUser candidateUser);
	
	
}
