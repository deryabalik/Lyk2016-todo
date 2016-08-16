package tr.org.linux.kamp2016.absanimal;

public class Snake extends Reptile implements Carnivore{

	
	Snake(String name){
		super(name);
	}
	public void clowl(){
		System.out.println("");
	}
	
	public void Hunt(){
		System.out.println(name+"Etçil");
	}
	public void crawl(){
		System.out.println(name+"Sürünür");
	}
	
	public void poison(){
		System.out.println(name+"Zehirli");
	}
	
	public void breath(){
		System.out.println(name+"Nefes alma özelliği");
	}
	public void eat(){
		System.out.println(name+"Yemek yeme özelliği");
	}
	public void sleep(){
		System.out.println(name+"Uyuma özelliği");
	}


}
