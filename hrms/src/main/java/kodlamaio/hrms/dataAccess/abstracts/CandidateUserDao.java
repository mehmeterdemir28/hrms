package kodlamaio.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import kodlamaio.hrms.entities.concretes.CandidateUser;

@Repository
public interface CandidateUserDao extends JpaRepository<CandidateUser, Integer> {

	
	List<CandidateUser> findByEmailIs(String email);

	
	List<CandidateUser> findByIdentityNumberIs(String identityNumber);
	
	
	
}
