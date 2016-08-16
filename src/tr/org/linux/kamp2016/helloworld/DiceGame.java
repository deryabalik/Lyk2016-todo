package tr.org.linux.kamp2016.helloworld;

public class DiceGame {
	
	private int facevalue;
	
	public DiceGame(){
		facevalue = 1;
		
	
	   
	}
	public int roll(){
		int dice =(int)(Math.random()*6)+1;
		facevalue = dice;
		return facevalue;
	}
	public int getFacevalue(){
		
		return facevalue;
	}


}