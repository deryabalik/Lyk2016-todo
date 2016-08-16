package tr.org.linux.kamp2016.helloworld;

import java.util.HashMap;
import java.util.Scanner;

public class Statistic {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String table;
		generateRandomValues(table);
		System.out.println(table.toString());
		Scanner input = new Scanner(System.in);
		
		System.out.println("mean = " +mean(table));
		
	}
	private static void generateRandomValues(HashMap<Integer,Integer>map,int size){
		
	}
     
	public static double mean(HashMap<Integer,Integer> map){
		double answer = 0;
	}
}
