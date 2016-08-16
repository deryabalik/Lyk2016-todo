package tr.org.linux.kamp2016.helloworld;

public class Box <T> {

	private T t;
	
	public void set(T t){
		this.t = t;
	}
	public T get(){
		return t;
	}
	

}
