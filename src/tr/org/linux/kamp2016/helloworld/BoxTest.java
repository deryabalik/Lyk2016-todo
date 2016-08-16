package tr.org.linux.kamp2016.helloworld;

public class BoxTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Box < Integer > integerBox = new Box<Integer>();
		integerBox.set(new Integer(10));
		Integer someInteger = integerBox.get();
		System.out.println(someInteger);
		

	}

}
