package tr.org.linux.kamp2016.garbagecollector;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class DateExample {

	public static void main(String[] args){
		
			
			LocalDate today = LocalDate.now();
			
			Scanner input = new Scanner(System.in);
			System.out.println("Ay ' ı giriniz :");
			int month = input.nextInt();
			System.out.println("Gün ' ü giriniz :");
			int day = input.nextInt();
			System.out.println("Yıl ' ı giriniz :");
			int year = input.nextInt();
			
			LocalDate birthday = LocalDate.of(year, month, day);
			
			long daysAlive = ChronoUnit.DAYS.between(birthday,today);
			
			System.out.println("Yaşadığın gün sayısı : " +daysAlive+ ":))");
		}
		
	}


