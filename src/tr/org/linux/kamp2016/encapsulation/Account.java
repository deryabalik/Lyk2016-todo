package tr.org.linux.kamp2016.encapsulation;

import java.util.Scanner;

public class Account {

	private double balance ;
	private int id;
	public Account (int id){
		this.id = id;
		balance = 0;
	}
	public void withdraw(double amount){
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Account acc = new Account(1);
        System.out.println(acc);
        acc.deposit(500);
        System.out.println(acc);
        acc.withdraw(250);
        System.out.println(acc);
        acc.withdraw(1000);
        System.out.println(acc);
        acc.deposit(1000);
        System.out.println(acc);
        acc.withdrawal(250);
        System.out.println(acc);
	}

}
