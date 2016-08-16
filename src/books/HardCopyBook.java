package books;

public class HardCopyBook extends Book{
	
	private double weight,shippingCost;
	
	

	public HardCopyBook(String name, String author, String bookld,
			double price, double weight, double shippingCost) {
		super(name, author, bookld, price);
		this.weight = weight;
		this.shippingCost = shippingCost;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getShippingCost() {
		return shippingCost;
	}

	public void setShippingCost(double shippingCost) {
		this.shippingCost = shippingCost;
	}

	@Override
	public String toString() {
		return "HardCopyBook weight=" + weight + " shippingCost="
				+ shippingCost ;
	}
	
	public   double  getTotalCost(){
		return weight + shippingCost;
	}
	

}
