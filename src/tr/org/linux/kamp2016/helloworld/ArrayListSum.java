package tr.org.linux.kamp2016.helloworld;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListSum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sayi=1;
		Scanner input = new Scanner(System.in);
		System.out.println("Bir sayı giriniz : ");
	    ArrayList<Integer> x = new ArrayList<Integer>();
	    while(true){
	    	if(sayi == 0){
	    	   break;
	    	}
	    	
	    	sayi = input.nextInt();
	    	x.add(sayi);
	    	  
	   
	    }System.out.println("Toplam = " +toplam(x));
	   

	}
	 
	public static int toplam(ArrayList<Integer> x){
		int sonuc =0;
		for(Integer i : x){
			sonuc += i;
		}
		//for(int i = 0;i<x.size();i++){
		//sum +=arrayList.get(i);
		return sonuc;
	}

}
