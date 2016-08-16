package tr.org.linux.kamp2016.absanimal;

public class AnimalTest {

	
	public static void main(String[] args) {
		Cat sari = new Cat("Sarı","Sarı","Efendi","Sarı",3);
		Cat kara = new Cat("Kara","Kara","İsyanlar","Yeşil",3);
		Cat ucrenk = new Cat("Üçrenk","Sarı,Gri,Beyaz","Deli Kedi","Sarı",3);
		Dog fistik = new Dog("Fıstık");
		Owl hedwig = new Owl("Hedwig");
		Snake husnu = new Snake("Hüsnü");
		
		fistik.bark();
		fistik.eat();
		sari.meow();
		kara.sleep();
		husnu.clowl();
		
		/*Animal an = sari;
		Herbivorous car = sari;
		Object o = sari;*/

		System.out.println("Sarı memeli mi " +isMammal(sari));
		System.out.println("Hedwig memeli mi " +isMammal(hedwig));
	}

	static  boolean isMammal(Object obj){
		if(obj instanceof Mammal){
			return true ;
		}
		else return false;
	}
}
