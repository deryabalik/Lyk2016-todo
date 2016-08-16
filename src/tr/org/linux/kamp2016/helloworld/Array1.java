package tr.org.linux.kamp2016.helloworld;

import java.util.Scanner;

public class Array1 {
	public static void main(String args[]){
		int sum =0;
		System.out.println("Bir sayı giriniz :" );
		Scanner input = new Scanner(System.in);
		int sayi = input.nextInt();
		int[] k = new int[sayi];
		for(int i = 1; i<k.length;i++){
			
		sum +=sayi;
		
		}
		
		
		System.out.println("Sayının toplamı : "+ sum);
		
	}

}
