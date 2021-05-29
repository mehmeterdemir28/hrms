package kodlamaio.hrms.core.adapters;

import java.rmi.RemoteException;
import java.util.Calendar;


import kodlamaio.hrms.entities.concretes.CandidateUser;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisCheckAdapter implements CandidateUserCheckService {

	
	@Override
	public boolean checkIfRealPerson(CandidateUser candidateUser ) {

		KPSPublicSoap soapClient = new KPSPublicSoapProxy();
		boolean result = false;
		try {
			result = soapClient.TCKimlikNoDogrula(Long.parseLong(candidateUser.getIdentityNumber()), candidateUser.getFirstName(),
					candidateUser.getLastName(), candidateUser.getDateOfBirth().getYear());
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		return result;

	}
	
	
}
