package tr.org.linux.kamp2016.garbagecollector;

public class MyClassTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyClass obj1 = new MyClass(10);
		MyClass obj2 = new MyClass(20);
		
		try{
			obj1.finalize();
			
		}
	    catch(Throwable e){
	    	e.printStackTrace();
	    }
		
		obj1 = obj2;
		System.out.println("Bitti");

	}

}
