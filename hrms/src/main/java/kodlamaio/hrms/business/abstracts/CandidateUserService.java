package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.entities.concretes.CandidateUser;

public interface CandidateUserService   {
	
	List<CandidateUser> getAll();

	List<CandidateUser> findByEmailIs(String email);
	
	List<CandidateUser> findByIdentityNumberIs(String identityNumber);

	void add(CandidateUser candidateUser);
	
}
