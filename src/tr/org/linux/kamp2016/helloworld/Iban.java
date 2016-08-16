package tr.org.linux.kamp2016.helloworld;

import java.util.Scanner;

public class Iban {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    
		Scanner input = new Scanner (System.in);
		String iban= "iban";
		while(!iban.isEmpty()){
			System.out.println("İban : ");
			iban = input.nextLine();
		    if(iban.isEmpty()){
		    	String countryCode = iban.substring(0,2);
		    	String controlCode = iban.substring(2,4);
		    	String bankCode = iban.substring(4,9);
		    	String accountNumber = iban.substring(10,26);
		    	System.out.println("Countr code : " +countryCode);
		    	System.out.println("Control code : " +controlCode);
		    	System.out.println("bank code : " +bankCode);
		    	System.out.println("Account number : " +accountNumber);
		    	if(iban.length() !=26){
		    		System.out.println("IBAN length is not valid");
		    	}   
		    if(!countryCode.equals("TR")){
		    	System.out.println("This is not TR IBAN");
		    }
		    if(!digitControl(controlCode)){
		    	System.out.println("This is not TR IBAN");
		}	
		    if(!digitControl(bankCode)){
		    	System.out.println("This is not TR IBAN");

	}
		    if(!digitControl(accountNumber)){
		    	System.out.println("This is not TR IBAN");
		 
		    }
		    
	public static boolean digitControl( String str){
		for(int i = 0; i < str.length();i++){
		if(!Character.isDigit(str.charAt(i))){
			return false;
		}
		
		}
		
		
		return true;

	}

}
	
