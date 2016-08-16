package tr.org.linux.kamp2016.helloworld;

import java.util.Scanner;

public class FactorialTest {
	public static void main(String args[]){
		Factorial factObj = new Factorial();
		Scanner input = new Scanner(System.in);
		System.out.println("Faktoriyeli alınacak sayıyı girinix :");
		int inputValue = input.nextInt();
		System.out.println(factObj).factorial(inputValue);
	}

}
