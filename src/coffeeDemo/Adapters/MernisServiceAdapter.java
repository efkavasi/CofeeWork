package coffeeDemo.Adapters;

import java.rmi.RemoteException;

import coffeeDemo.Abstract.CustomerCheckService;
import coffeeDemo.Entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements CustomerCheckService{

	@Override
	public Boolean CheckIfRealPerson(Customer customer) {
			
		KPSPublicSoap client = new KPSPublicSoapProxy();
		boolean result = false;
		try {
			result = client.TCKimlikNoDogrula(Long.parseLong(customer.getNationalId()) , customer.getFirstName().toUpperCase(), customer.getLastName().toUpperCase(), customer.getBirthDate());
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		return result;
			
	}

	
}
