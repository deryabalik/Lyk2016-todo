package tr.org.lkd.lyk2016.inner_class;

import tr.org.lkd.lyk2016.inner_class.Person.Currency;
import tr.org.lkd.lyk2016.inner_class.Person.Money;




public class Application {

	
	public static void main(String[] args) {
		
		Person p1 = new Person("John",23);
		
		//usage with static inner class
		//Money m = new Money(10,Currency.DOLLAR);
		
		//usage with non-static inner class
		 Money m = p1.new Money(10, Currency.DOLLAR)
		
		p1.addMoney(m);
		p1.addMoney(5,Currency.TL);
		p1.addMoney(25,Currency.TL);
		
		
		System.out.println(p1.toString());

	}
	
	

}
