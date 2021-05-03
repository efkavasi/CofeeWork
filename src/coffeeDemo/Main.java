package coffeeDemo;

import coffeeDemo.Abstract.CustomerManager;
import coffeeDemo.Adapters.MernisServiceAdapter;
import coffeeDemo.Concrete.NeroCustomerManager;
import coffeeDemo.Concrete.StarbucksCustomerManager;
import coffeeDemo.Entities.Customer;

public class Main {

	public static void main(String[] args ) {
		
		
		CustomerManager customerManager = new NeroCustomerManager();
		customerManager.Save(new Customer(001,"Engin","Þen",1981,"123123123123"));
		
		CustomerManager customerManager1 = new StarbucksCustomerManager(new MernisServiceAdapter());
		customerManager1.Save(new Customer(002,"MURAT","OZCAN",1986,"12222342432"));
	}

}
