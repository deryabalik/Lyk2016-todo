package books;

import java.util.Arrays;

public class ShoppingCart {

	Book[] contents = new Book[10];
	int numEntriesInCar;
	public ShoppingCart(Book[] contants, int numEntriesInCar) {
		super();
		this.contents = contents;
		this.numEntriesInCar = numEntriesInCar;
		
	}
	public Book[] getContents() {
		return contents;
	}
	public void setContents(Book[] contents) {
		this.contents = contents;
	}
	public int getNumEntriesInCar() {
		return numEntriesInCar;
	}
	public void setNumEntriesInCar(int numEntriesInCar) {
		this.numEntriesInCar = numEntriesInCar;
	}
	
	public   boolean   addBook(Book   book){
		return true;
	}
	
	  public boolean   removeLastBook(){
		  return true;
	  }
	@Override
	public String toString() {
		return "ShoppingCart contents=" + Arrays.toString(contents)
				+ " numEntriesInCar=" + numEntriesInCar ;
	}
	  
	  
	
}
