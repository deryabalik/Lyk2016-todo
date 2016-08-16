package tr.org.linux.kamp2016.helloworld;



public class Card {
	
	
	private String cardType;
	private int value;
	
	
	
	public Card(String cardType, int value){
		if(cardType.equals("spade")||cardType.equals("club")||
				cardType.equals("heart")||cardType.equals("diamond")){
			this.cardType = cardType;
		}
			
        if(0<value && value < 14){
        this.value = value;
	    
        }
		
	}
	
	
	public String getCardType(){
	

		return cardType;
	}
	
	public int getValue(){
		

		return value;
	}
	
	
	
	public boolean equals(Card other){
		
		return (other.getCardType().equals(this.getCardType())
				&&other.getValue()== this.getValue());
		
			
}

}
