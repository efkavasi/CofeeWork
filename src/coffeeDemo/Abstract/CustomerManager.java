package coffeeDemo.Abstract;
import coffeeDemo.Entities.Customer;


public abstract class CustomerManager implements CustomerServices{
	@Override
	public void Save(Customer customer){
		
			System.out.println("Kahve m��terisi kaydedildi" +" " + customer.getFirstName());
	}

	

}
