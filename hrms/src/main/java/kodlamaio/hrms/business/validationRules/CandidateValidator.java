package kodlamaio.hrms.business.validationRules;

import java.time.LocalDate;

import kodlamaio.hrms.core.results.ErrorResult;
import kodlamaio.hrms.core.results.Result;
import kodlamaio.hrms.core.results.SuccessResult;
import kodlamaio.hrms.entities.concretes.CandidateUser;

public class CandidateValidator extends UserValidator implements CandidateValidatorService {

	@Override
	public Result candidateNullCheck(CandidateUser candidateUser) {

		String firstName = candidateUser.getFirstName();
		String lastName = candidateUser.getLastName();
		String identityNumber = candidateUser.getIdentityNumber();
		LocalDate dateOfBirth = candidateUser.getDateOfBirth();

		if (super.userNullCheck(candidateUser).isSuccess() || (firstName == null || firstName.isBlank())
				|| (lastName == null || lastName.isBlank()) || (identityNumber == null || identityNumber.isBlank())
				|| dateOfBirth == null) {
			return new ErrorResult(Messages.notNull);
		}
		return new SuccessResult(null);
	}
}
