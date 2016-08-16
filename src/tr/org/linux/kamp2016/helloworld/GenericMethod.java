package tr.org.linux.kamp2016.helloworld;

public class GenericMethod {

	/**
	 * @param args
	 */
public static < E > void printArray(E[] inputArray){
	
		for(E element : inputArray){
			System.out.println(element);
			
		}

	}

}
