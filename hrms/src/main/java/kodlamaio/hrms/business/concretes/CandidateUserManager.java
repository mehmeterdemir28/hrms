package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.CandidateUserService;
import kodlamaio.hrms.dataAccess.abstracts.CandidateUserDao;
import kodlamaio.hrms.entities.concretes.CandidateUser;

@Service
public class CandidateUserManager implements CandidateUserService {

	private CandidateUserDao candidateUserDao;

	@Autowired
	public CandidateUserManager(CandidateUserDao candidateUserDao) {
		this.candidateUserDao = candidateUserDao;

	}

	@Override
	public List<CandidateUser> getAll() {
		return candidateUserDao.findAll();
	}

	@Override
	public List<CandidateUser> findByEmailIs(String email) {

		return candidateUserDao.findByEmailIs(email);
	}

	@Override
	public List<CandidateUser> findByIdentityNumberIs(String identityNumber) {

		return candidateUserDao.findByIdentityNumberIs(identityNumber);
	}

	@Override
	public void add(CandidateUser candidateUser) {

		if (findByEmailIs(candidateUser.getEmail()).size() != 0
				|| findByIdentityNumberIs(candidateUser.getIdentityNumber()).size() != 0) {

			System.err.println("Bu email daha önce kullanılmış.");

			return;
		}

		System.out.println("Başarıyla kayıt olundu");

	}

}
