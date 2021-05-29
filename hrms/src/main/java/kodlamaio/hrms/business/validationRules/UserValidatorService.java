package kodlamaio.hrms.business.validationRules;

import kodlamaio.hrms.core.results.Result;
import kodlamaio.hrms.entities.concretes.User;

public interface UserValidatorService {

	Result userNullCheck(User user);
}
