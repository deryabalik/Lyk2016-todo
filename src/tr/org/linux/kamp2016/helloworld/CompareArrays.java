package tr.org.linux.kamp2016.helloworld;

public class CompareArrays {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Pulbiber Mahallesi";
		String str2 ="pulbiber mahallesi";
		
		System.out.println(str.compareTo(str2));
		System.out.println(str.compareToIgnoreCase(str2));

	}

}
