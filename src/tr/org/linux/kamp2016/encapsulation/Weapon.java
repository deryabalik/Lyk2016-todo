package tr.org.linux.kamp2016.encapsulation;

public class Weapon extends Item {

	private double damageAmount;

	public Weapon(double price,double weight,double damage) {
		super(price,weight);
		if(damageAmount < 0)
		damageAmount = 0;
		else
			damageAmount = damage;
		
	}

	public double getDamageAmount() {
		return damageAmount;
	}

	@Override
	public String toString() {
		return "Weapon's damageAmount=" + damageAmount + ",price= "
				+getItemPrice()+",weight= "+getItemWeight();
	}
	public boolean useItem(){
		if(getDamageAmount()>0)
			return true;
		else
			return false;
		
	}
	
	
	

}


