package books;

import java.util.Arrays;

public class Customer {

	private String userName,userSurname;
	Purchase[] purchaseHistory = new Purchase[10];
    int purchaseCount;
	public Customer(String userName, String userSurname,
			Purchase[] purchaseHistory, int purchaseCount) {
		super();
		this.userName = userName;
		this.userSurname = userSurname;
		this.purchaseHistory = purchaseHistory;
		this.purchaseCount = purchaseCount;
	}
	
	public   boolean   placePurchase(Purchase   current){
		return true;
	}
	
	public   double   getTotalAmountSpent(){
		
	}

	@Override
	public String toString() {
		return "Customer userName=" + userName + " userSurname="
				+ userSurname + " purchaseHistory="
				+ Arrays.toString(purchaseHistory) + " purchaseCount="
				+ purchaseCount ;
	}
	
	
}
