package tr.org.linux.kamp2016.helloworld;

import java.util.Scanner;

public class Palindrom {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String kelime;
        String reserve = "";
		Scanner input = new Scanner(System.in);
		System.out.println("Test etmek istediğiniz kelimeyi yazınız : ");
		kelime = input.next();
		for(int i = kelime.length()-1;i >=0; i--){
			
			reserve += kelime.charAt(i);
			
		}
		if(kelime.equals(reserve)){
				System.out.println("Palindrom");}
			else
				System.out.println("Palindrom değil");
		
	
	}
	
	

}
