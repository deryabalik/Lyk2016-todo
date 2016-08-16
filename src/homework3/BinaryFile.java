package homework3;

public abstract class BinaryFile extends File {

	public BinaryFile(String fName, long fSize) {
		super(fName, fSize);

	}

	public abstract BinaryFile getCopy();
}
