package tr.org.linux.kamp2016.absanimal;

public class Cat extends Mammal implements Herbivorous{

	String furColor;
	String catPsychology;
	String eyeColor;
	int age;
	
	
	public Cat(String name,String furColor,String catPsychology,String eyeColor,int age){
		super(name);
		this.furColor = furColor;
		this.catPsychology = catPsychology;
		this.age = age;
		this.eyeColor = eyeColor;
	}
	public void meow(){
		System.out.println(name +"Miyavlar");
	}
	
	public void clow(){
		System.out.println(name +"Tırmalar");
	}

	public void InvastigatePlants(){
		System.out.println(name +"Otçuldur");
	}
	
	public void giveBirth(){
		System.out.println(name +"Doğurganlık özelliğine sahiptir");
	}
	
	
	public void breath(){
		
	}
	public void eat(){
		System.out.println(name+"whiskas yer");
	}
	public void sleep(){
		System.out.println(name+"uyur");
	}

}
