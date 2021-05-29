package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.EmployerUserService;
import kodlamaio.hrms.dataAccess.abstracts.EmployerUserDao;
import kodlamaio.hrms.entities.concretes.EmployerUser;

@Service
public class EmployerUserManager implements EmployerUserService {

	private EmployerUserDao employerUserDao;

	@Autowired
	public EmployerUserManager(EmployerUserDao employerUserDao) {

		this.employerUserDao = employerUserDao;

	}

	@Override
	public List<EmployerUser> getAll() {

		return employerUserDao.findAll();
	}

	@Override
	public List<EmployerUser> findByEmailIs(String email) {
		
		return this.findByEmailIs(email);
	}

	@Override
	public void add(EmployerUser employerUser) {
		if(findByEmailIs(employerUser.getEmail()).size() != 0) {
			
			System.err.println("Bu email daha önce kullanılmış.");
			
			return;
			
		}
		
		System.out.println("Başarıyla kayıt olundu");
		
	}

	
	
	
}
