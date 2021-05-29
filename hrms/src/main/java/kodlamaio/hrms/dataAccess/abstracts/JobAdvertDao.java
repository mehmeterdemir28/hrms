package kodlamaio.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import kodlamaio.hrms.entities.concretes.JobAdvert;

@Repository
public interface JobAdvertDao extends JpaRepository<JobAdvert, Integer> {

	
	@Query("FROM JobAdvert where isActive = true")
	List<JobAdvert> getByActiveIs();
	
	
	@Query("FROM JobAdvert where isActive = true and employer.id=:employerId ")
	List<JobAdvert> getByActiveIsAndEmployer_Id(int employerId);
	
	
}
