package books;

public class EBook extends Book{
	
	private double fileSize;
	private String encodingFormat;
	private int numDevicesBeingUsed;
	public EBook(String name, String author, String bookld, double price,
			double fileSize, String encodingFormat, int numDevicesAllowed,
			int numDevicesBeingUsed) {
		super(name, author, bookld, price);
		this.fileSize = fileSize;
		this.encodingFormat = encodingFormat;
		this.numDevicesAllowed = numDevicesAllowed;
		this.numDevicesBeingUsed = numDevicesBeingUsed;
	}
	public double getFileSize() {
		return fileSize;
	}
	public void setFileSize(double fileSize) {
		this.fileSize = fileSize;
	}
	public String getEncodingFormat() {
		return encodingFormat;
	}
	public void setEncodingFormat(String encodingFormat) {
		this.encodingFormat = encodingFormat;
	}
	public int getNumDevicesAllowed() {
		return numDevicesAllowed;
	}
	public void setNumDevicesAllowed(int numDevicesAllowed) {
		this.numDevicesAllowed = numDevicesAllowed;
	}
	public int getNumDevicesBeingUsed() {
		return numDevicesBeingUsed;
	}
	public void setNumDevicesBeingUsed(int numDevicesBeingUsed) {
		this.numDevicesBeingUsed = numDevicesBeingUsed;
	}
	
	public boolean addDevice(){
		return true;
	}
	
	public boolean removeDevice(){
		return false;
	}
	@Override
	public String toString() {
		return "EBook fileSize=" + fileSize + " encodingFormat="
				+ encodingFormat + " numDevicesAllowed=" + numDevicesAllowed
				+ " numDevicesBeingUsed=" + numDevicesBeingUsed ;
	}

	
}
