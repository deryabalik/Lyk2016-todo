package tr.org.linux.kamp2016.helloworld;

import java.util.Arrays;

public class IntArrayToString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] intNumbers = new int[]{1,2,3,4,5};
		
		StringBuffer sBuffer = new StringBuffer();
		String strSeperator = " ";
		
		if(intNumbers.length > 0){
			
			sBuffer.append(intNumbers[0]);
			
			for(int i = 1;i<intNumbers.length;i++){
				
				sBuffer.append(strSeperator).append(intNumbers[i]);
			}
		}
		
		System.out.println("int erreyi stringe dönüştürülüyor...");
		
		System.out.println(sBuffer.toString());
		
		String strNumbers = Arrays.toString(intNumbers);
		
		System.out.println("String, Arrays.toString metodu aracılığıyla oluşturuluyor..."+strNumbers);
		
		strNumbers = strNumbers.replaceAll(",", strSeperator).replace("[", "").replace("]","");
		
		System.out.println("Final string " + strNumbers);
	}

}
