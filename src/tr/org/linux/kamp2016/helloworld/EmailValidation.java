package tr.org.linux.kamp2016.helloworld;

import java.util.Scanner;

public class EmailValidation {

	/**
	 * @param args
	 */
	static String email;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("This program takes an email adress");
	   
		Scanner input = new Scanner(System.in);
		String mail = "mail";
	while(!mail.isEmpty()){
		System.out.println("Enter an mail addres");
		mail = input.nextLine();
		if(!mail.isEmpty()){
			if(isValid(mail)){
				System.out.println("This mail adress is valid");
			}
			else{
				System.out.println("This mail adres is not valid");
			}
		}System.out.println("Done");	
	}
		
		
			
			

	}
	
	private static boolean isValid(String email){
		
		if(email.contains(" ")){
			return false;
		
		}
		if(!email.contains("@")){
			return false;
		}
		if(!email.contains(".")){
			return false;
		}
		if(email.startsWith("@")|| email.startsWith(".")){
			return false;
		}
		
		//mail@.
		if(!(email.indexOf('@') + 1 < email.lastIndexOf("."))){
			return false;
		}
		if(!(email.lastIndexOf(".") +2 < email.length())){
			return false;
		}return true;
	}
	

}
