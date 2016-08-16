package tr.org.linux.kamp2016.encapsulation;

public class Bow extends Weapon {

	private int numArrows;

	public Bow(double price,double weight,double damage,int numArrows) {
		super(price,weight,damage);
		if(numArrows >0)
			this.numArrows = numArrows;
			
		else
		numArrows = 0;
	}

	public int getNumArrows() {
		return numArrows;
	}
	public boolean useItem(){
		if(numArrows > 0){
			numArrows --;
			System.out.println("The Bow is used the throw an arrow and caused damage of" +getDamageAmount()+" points " );
			return true;}
			else 
				return false;
	}
	public void upgrade(){
		numArrows += 10;
	}
	

	@Override
	public String toString() {
		return "Bow's numArrows ="+ numArrows + "damageAmonts =" +getDamageAmount() + ",price= "
				+getItemPrice()+",weight= "+getItemWeight();
	}
	
	
	

}
