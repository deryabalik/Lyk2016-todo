package tr.org.linux.kamp2016.encapsulation;

public class Armor extends Item{
	
	private double defencePoints;
	private boolean isWorn;
	
	public Armor(double price, double weight,double defencePoints) {
		super(price,weight);
		if(defencePoints>0){
		this.defencePoints = defencePoints;}
		else
			defencePoints=0;
		isWorn = false;
	}

	public double getDefencePoints() {
		return defencePoints;
	}

	public boolean getIsWorn() {
		return isWorn;
	}
	
	public boolean useItem(){
		isWorn = true;
		return true;
	}

	@Override
	public String toString() {
		
		return "Armor's defencePoints=" + defencePoints + ",price= "
				+getItemPrice()+",weight= "+getItemWeight();	
	}
	
	double getHit(double damagePoints){
		
		if(getIsWorn())
		{
		if(getDefencePoints() >=damagePoints)
		{
			 defencePoints-=damagePoints;
			return 0;
		}
		if(defencePoints<damagePoints)
		{
			defencePoints=0;
			return damagePoints-getDefencePoints();
			
		}
		}
		else
			
		return getDefencePoints()-damagePoints;
				
		return getDefencePoints()-damagePoints;
		}
		
	
		
		
	

	public void upgrade(){
			
			defencePoints += 100;
	

}
	
	
	
	

}
