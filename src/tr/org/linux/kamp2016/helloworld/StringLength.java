package tr.org.linux.kamp2016.helloworld;

public class StringLength {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] strArray = new String[]{"Edip","Turgut","Cemal","Ece","Tomris"};
		
		int length = strArray.length;
		
		System.out.println("String array : " +length);
		
		for(int i = 0; i<length;i++){
			System.out.println(strArray[i]);
		}

	}

}
