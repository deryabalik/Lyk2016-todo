package tr.org.linux.kamp2016.helloworld;

public class CheckValidNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] str = new String[]{"10.20","1234","12.at"};
		for(int i = 0; i< str.length; i++)
		{
			if(str[i].indexOf(".") > 0){
				try{
					Double.parseDouble(str[i]);
					System.out.println(str[i]+ " geçerli bir sayıdır");
				}
				catch(NumberFormatException nme){
					System.out.println("Geçersiz");
				}
			}
			else{
				try{
					Integer.parseInt(str[i]);
					System.out.println(str[i]+"geçerli bir tam sayıdır");
				}
				catch(NumberFormatException nme){
					System.out.println("Geçerli bir sayı değildir");
				}
				
			}
		}
	}

}
