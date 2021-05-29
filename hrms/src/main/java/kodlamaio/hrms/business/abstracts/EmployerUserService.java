package kodlamaio.hrms.business.abstracts;

import java.util.List;


import kodlamaio.hrms.entities.concretes.EmployerUser;

public interface EmployerUserService {

	List<EmployerUser> getAll();
	
	List<EmployerUser> findByEmailIs(String email);
	
	void add(EmployerUser employerUser);
	
	
	
	
	
	
}
