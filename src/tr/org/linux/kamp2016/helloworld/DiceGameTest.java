package tr.org.linux.kamp2016.helloworld;

public class DiceGameTest {
	
	public static void main(String args[]){
		
		DiceGame d1 = new DiceGame();
		DiceGame d2 = new DiceGame();
		d1.roll();
		d2.roll();
		if(d1.getFacevalue() < d2.getFacevalue()){
			System.out.println("d1 kullanıcısı : "+d1.getFacevalue());
			System.out.println("d2 kullanıcısı : " +d2.getFacevalue());
			System.out.println("d2 kazandı!");
		}
		else if(d1.getFacevalue() > d2.getFacevalue()){
			System.out.println("d1 kullanıcısı : "+d1.getFacevalue());
			System.out.println("d2 kullanıcısı : " +d2.getFacevalue());
			System.out.println("d1 kazandı!");
		}
		else{
			System.out.println("d1 kullanıcısı : "+d1.getFacevalue());
			System.out.println("d2 kullanıcısı : " +d2.getFacevalue());
			System.out.println("d1 ve d2 kazandı!");
		}
		
	}

}