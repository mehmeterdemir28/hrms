package kodlamaio.hrms.business.validationRules;

import kodlamaio.hrms.core.results.ErrorResult;
import kodlamaio.hrms.core.results.Result;
import kodlamaio.hrms.core.results.SuccessResult;
import kodlamaio.hrms.entities.concretes.User;

public class UserValidator {

	public Result userNullCheck(User user) {

		if (user.getEmail() == null || user.getEmail().isBlank()
				|| (user.getPassword() == null || user.getPassword().isBlank())) {

			{
				return new ErrorResult(Messages.notNull);
			}

		}
		return new SuccessResult(null);

	}

}
