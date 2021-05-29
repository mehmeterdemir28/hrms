package kodlamaio.hrms.business.validationRules;

import kodlamaio.hrms.core.results.ErrorResult;
import kodlamaio.hrms.core.results.Result;
import kodlamaio.hrms.core.results.SuccessResult;
import kodlamaio.hrms.entities.concretes.EmployerUser;

public class EmployerValidator extends UserValidator implements EmployerValidatorService {

	@Override
	public Result employerNullCheck(EmployerUser employerUser) {
		String companyName = employerUser.getCompanyName();
		String webAddress = employerUser.getWebAddress();
		String phoneNumber = employerUser.getPhoneNumber();		
		
		
		 if (super.userNullCheck(employerUser).isSuccess() || (companyName == null || companyName.isBlank())
				 || (webAddress == null || webAddress.isBlank()) || (phoneNumber==null||phoneNumber.isBlank())) {
	            return new ErrorResult(Messages.notNull);
	        }
	        return new SuccessResult(null);
	    }
		
		
	}


