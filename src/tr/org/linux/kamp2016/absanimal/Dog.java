package tr.org.linux.kamp2016.absanimal;

public class Dog extends Mammal implements Carnivore{

	Dog(String name){
		super(name);
	}
	
	public void Hunt(){
		System.out.println("Etçildir");
	}
	
	public void giveBirth(){
		System.out.println("doğurgandır");
	}
	public void bark(){
		System.out.println("Havlar");
	}
	public void sniff(){
		System.out.println("Koku alır");
	}

	public void breath(){
		System.out.println("Nefes alma özelliği");
	}
	public void eat(){
		System.out.println("Yemek yeme özelliği");
	}
	public void sleep(){
		System.out.println("Uyuma özelliği");
	}

}
