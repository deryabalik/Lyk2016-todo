package tr.org.linux.kamp2016.encapsulation;

public class Sword extends Weapon{

	public Sword(double price,double weight, double damage) {
		super(price,weight,damage);
		
		
	}
	
	public boolean useItem(){
		System.out.println("The sword is used and caused damage of X points"+getDamageAmount()
				+"points");
		return true;
		
	}

	@Override
	public String toString() {
		return "Weapon's type= Sword , damageAmounts =" + getDamageAmount() + ",price= "
				+getItemPrice()+",weight= "+getItemWeight();
	}
	
	

	
}
