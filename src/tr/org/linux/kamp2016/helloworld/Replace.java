package tr.org.linux.kamp2016.helloworld;

public class Replace {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Grapon Kağıtları ";
		System.out.println(str.replace("Gr","Ka"));
		System.out.println(str.replaceFirst("Gr","Grr"));
		System.out.println(str.replaceAll("Gr","Ha"));
		

	}

}
