package kodlamaio.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import kodlamaio.hrms.entities.concretes.StaffUser;

@Repository
public interface StaffUserDao extends JpaRepository<StaffUser, Integer> {

	
}
