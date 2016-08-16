package tr.org.linux.kamp2016.helloworld;

public class StringExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = new String("Ofis çiftçinin kara gün dostudur.");
		
		if(s1.equals("Ofis çiftçinin kara gün dostudur."))
			System.out.println("Eşit");
		else
			System.out.println("Eşit değil");
		if(s1.contains("kara"))
			System.out.println("İçeriyor");
		else
			System.out.println("İçermiyor");
		
		String s2 = new String("A");
		String s3 = new String("a");
		String s4 = new String("b");
		String s5 = new String("A");
		
		System.out.println(s2.compareTo(s3));
		
		System.out.println(s3.compareTo(s2));
		
		System.out.println(s2.compareTo(s5));
		
		System.out.println(s2.compareTo(s4));
		
	}

}
