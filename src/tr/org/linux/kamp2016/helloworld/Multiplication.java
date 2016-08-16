package tr.org.linux.kamp2016.helloworld;

public class Multiplication {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		int[][] a = b(10);
        arrayToPrint(a);
		
	}
	
	public static int[][] b(int n){
		int [][] matris = new int[n][n];
		
		for(int j = 0; j<n;j++){
			for(int k=0;k<matris[j].length;k++){
				matris[j][k] = (j+1)*(k+1);
			}
			return matris;
		}
		for(int j = 0; j<n;j++){
			for(int k=0;k<matris[j].length;k++){
				matris[j][k] = (j+1)*(k+1);
		System.out.printf("%-5d",+matris[j][k]);
	}
	
	public static void arrayToprint(int[][] matris){
		
	}
}	
		
	


