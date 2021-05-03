package coffeeDemo.Concrete;

import coffeeDemo.Abstract.CustomerCheckService;
import coffeeDemo.Abstract.CustomerManager;
import coffeeDemo.Entities.Customer;


public class StarbucksCustomerManager extends CustomerManager {
			
		private CustomerCheckService customerCheckService;
		
		public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
			super();
			this.customerCheckService = customerCheckService;
		}

		@Override	
		public void Save(Customer customer) {
						
			if (customerCheckService.CheckIfRealPerson(customer)) {
				System.out.println("Starbucks müþterisi kaydedildi" +" " + customer.getFirstName());
			}
				
			
					
		}
}
		
	




