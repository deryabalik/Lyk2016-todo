package tr.org.linux.kamp2016.helloworld;

import java.util.Scanner;



public class Fsayi {
	public static void main(String args[]){
		
		Scanner input = new Scanner(System.in);
		System.out.println("Bir sayı giriniz :");
		int count = input.nextInt();
	int n1=0, n2=1, n3;
	
		for(int i=2;i<=count;++i){
			
			n3 = n1 + n2;
			System.out.println(n3);
			n1 = n2;
			n2 =n3;
		}
		
	}

}
