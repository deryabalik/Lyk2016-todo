package tr.org.lkd.lyk2016.inner_class;

//Money#getValue = manoey sınıfının getvalue metodu demek
import java.util.ArrayList;
import java.util.Collection;

public class Person extends AbstractPerson{
	
	private String name;
	public class Money {
		
		public Money(int value, Currency currency) {
			
			this.value = value;
			this.currency = currency;
		}
		
		
		private int value;
		private Currency currency;
		
		public int getValue(){
			
			switch(currency){
			case TL:
				return value;
				
			case DOLLAR:
				return value*exchangeRate;
			}
			
			
			return 0;//FIXME
		}
	}
	public static String nationality__Turkısh;
	public enum Currency{
			TL,DOLLAR
		}
	
	private int exchangeRate = 3;
	
	private Integer age;
	private Collection<Money> moneyList = new ArrayList<>();	//hiyerarşideki en yukarıdaki tipi seçmeliyiz
	
	public Person(String name, Integer age) {
		super(); //Her zaman ilk metodda olmak zorunda çünkü alt sınıfta yaptığımız şeyler
		//üst sınıftaki state değişikleri ile ilgili olabilir
		//üst sınıfın birden fazla constructoru varsa
		System.out.println("Person const");
		
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	
	public void addMoney(int value,Currency currency){
		moneyList.add(new Money(value,currency));//TODO new money
	}
	
	public void addMoney(Money m){
		moneyList.add(m);
	}
	public int getTotalMoney(){
		//TODO calculate all money
		int total = 0;
		for(Money m:moneyList){
			total += m.getValue();
		}
		return total;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", money=" + getTotalMoney()
				+ "]";
	}
	
	//public static class Money {

	
	
	
	
	
	
	
	

}
