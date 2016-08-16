package books;

public class Book {

	private String name,author,bookId;
	private double price;

	public Book(String name, String author, String bookld, double price) {
		
		this.name = name;
		this.author = author;
		this.bookId = bookId;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getBookld() {
		return bookld;
	}

	public void setBookld(String bookld) {
		this.bookld = bookld;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void applyDiscount(double discountPercentage) {
		price = price - ((price*discountPercentage)/100);
	}
	@Override
	public String toString() {
		return "Book name=" + name + " author=" + author + " bookld="
				+ bookld + ", price=" + price ;
	}

	
	
	
}
