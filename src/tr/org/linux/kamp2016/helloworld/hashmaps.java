package tr.org.linux.kamp2016.helloworld;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;

public class hashmaps {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		arrayList.add(0);
		arrayList.add(1);
		arrayList.add(2);
		arrayList.add(3);
		arrayList.add(4);
		
		System.out.println("Forward: " +arrayList.toString());
		
		Collections.reverse(arrayList);
		
		System.out.println("Reverse: " + arrayList.toString());
		
		System.out.println("Max :" +Collections.max(arrayList));
		
		System.out.println("Min : " +Collections.min(arrayList));
		
		ArrayList<Integer> arrayList2 = new ArrayList<Integer>();
		
		arrayList2.add(2);
		arrayList2.add(4);
		arrayList2.add(3);
		arrayList2.add(1);
		arrayList2.add(0);
		
		System.out.println("Unordered: " +arrayList2.toString());
	    Collections.sort(arrayList2);
	    System.out.println("Ordered : " +arrayList2.toString());
	    
		

	}

}
