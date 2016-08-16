package tr.org.linux.kamp2016.absanimal;

public class Owl extends Bird implements Carnivore {
	
	Owl(String name){
		super(name);
	}
	
	public void Hunt(){
		System.out.println("Etçil");
	}

	public void fly(){
		System.out.println("Uçabilir");
	}
  public void rotateHead(){
	System.out.println("Kafasını 270 derece döndürebilir");
}
 
  void breath(){
		System.out.println("Nefes alma özelliği");
	}
	void eat(){
		System.out.println("Yemek yeme özelliği");
	}
	void sleep(){
		System.out.println("Uyuma özelliği");
	}

	
}
