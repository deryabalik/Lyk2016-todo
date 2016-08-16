package books;

public class Purchase extends ShoppingCart{

	private String purchaseDate,shippingDate;
	private int deliveryLength;
	public Purchase(Book[] contants, int numEntriesInCar, String purchaseDate,
			String shippingDate, int deliveryLength) {
		super(contants, numEntriesInCar);
		this.purchaseDate = purchaseDate;
		this.shippingDate = shippingDate;
		this.deliveryLength = deliveryLength;
	}
	public String getPurchaseDate() {
		return purchaseDate;
	}
	public void setPurchaseDate(String purchaseDate) {
		this.purchaseDate = purchaseDate;
	}
	public String getShippingDate() {
		return shippingDate;
	}
	public void setShippingDate(String shippingDate) {
		this.shippingDate = shippingDate;
	}
	public int getDeliveryLength() {
		return deliveryLength;
	}
	public void setDeliveryLength(int deliveryLength) {
		this.deliveryLength = deliveryLength;
	}
	
	public double getTotalPayment(){
		
	}
	@Override
	public String toString() {
		return "Purchase purchaseDate=" + purchaseDate + " shippingDate="
				+ shippingDate + " deliveryLength=" + deliveryLength;
	}
	
	
}
