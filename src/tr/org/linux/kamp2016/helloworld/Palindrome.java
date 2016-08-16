package tr.org.linux.kamp2016.helloworld;

import java.util.Scanner;

public class Palindrome {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.println("Bir ifade giriniz : ");
		String str = input.nextLine();
		System.out.println("Palindrom mu?" + isPalindrome(str));
	}
	
	public static boolean isPalindrome(String str){
		boolean answer = false;
		String reserve = " ";
		for(int i = str.length()-1; i >=0; i--){
		reserve += str.charAt(i);
			
		}
		if(str.equals(reserve)){
			answer = true;
		}                                                                                                                
		
		return answer;
	}

}
