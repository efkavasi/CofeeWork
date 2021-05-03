package coffeeDemo.Concrete;

import coffeeDemo.Abstract.CustomerCheckService;
import coffeeDemo.Entities.Customer;


public class CustomerCheckManager implements CustomerCheckService{

	@Override
	public Boolean CheckIfRealPerson(Customer customer) {
		
			return true;
		
	}
	
}
