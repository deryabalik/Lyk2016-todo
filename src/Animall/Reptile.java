package Animall;
//interface : sıfat 
//3 ten fazla miras almamalı kalıtımda
//ototospçunun galaksi rehberi
//statik fonksiyon ve değişken mümkün olduğunca az kullanılmalı
//bir sınıf birden fazla interface yi implement alabilir
//interface ve implemente bak
//abstract a bak
//interface ye yazılan metodlar zaten public olur yazmaya gerek yok
//abstract da private yazılmaz 
//interface ye new diyemeyiz
//fonksiyon isimleri fiil olmalı 
//tasarım deseni oku mutlaka
//DRY : kendini tekRAR ETME
//STRATEJİ PANTEntİNDE interface in değişiklikleri yapılır
/*MVC : modal view control :veriyi taşıyan model
sınıfı bu veriyi işleyen view sınıfları var
kodun içinde en az değişen view sınıfıdır
M : HTML ,C : CSS, V : JS */
for(mamal m : memeliler)
	
{
	if(m instanceof cat / carnivor)
		
		m.clowl(); diyemeyiz
		
		cat c = (cat)m;
		c.clowl();kullanılır
}


//TASARIM DESENİ
public class Application{ //bu artık değişken değil sabit olur
	//yani sadece bir kere atama ypılabilir
	
	private static final Application INSTANCE;
	
}

      private Application(){}
      
      public static Application getInstannce(){
    	  
    	  if(Im.. == null){
    		  INSTANCE == new Application();
    		  
    	  }
    	  return INSTANCE;
      }




