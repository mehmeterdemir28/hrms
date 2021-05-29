package kodlamaio.hrms.entities.concretes;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name="job_adverts")

public class JobAdvert {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	
	
	@ManyToOne
	@JoinColumn(name = "employer_id")
	private EmployerUser employer;
	
	@ManyToOne
	@JoinColumn(name = "position_id")
	private JobPosition position;
	
	@ManyToOne
	@JoinColumn(name = "city_id")
	private City city;
	
	@Column(name = "advert_description")
	private String advertDescription;
	
	@Column(name = "min_salary")
	private int minSalary;
	
	@Column(name = "max_salary")
	private int maxSalary;
	
	@Column(name = "open_position")
	private short openPosition;
	
	@Column(name = "deadline")
	private LocalDate deadline;
	
	@Column(name = "created_date")
	private LocalDate createdDate;
	
	@Column (name = "is_active")
	private boolean isActive;
	
	
	
	
}
