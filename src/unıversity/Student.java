package unıversity;

import java.time.LocalDate;

public class Student {

	private String name,ID,semester;
	private int year;
	 static private int currentYear =LocalDate.now().getYear();
	 static int currentSemester=1;
	
	
	
	public String getName() {
		return name;
	}
	public String getID() {
		return ID;
	}
	public String getSemester() {
		return semester;
	}
	public int getYear() {
		return year;
	}
	public static int getCurrentYear() {
		return currentYear;
	}
	public static int getCurrentSemester() {
		return currentSemester;
	}
	
	
	
	public void setSemester(String semester) {
	    if(semester==null||semester.isEmpty())
		this.semester = "Fall";
	    else if(semester.equals("Fall")||semester.equals("Spring")||semester.equals("Summer"))
	    	this.semester = semester;
	    else
	    	this.semester= "Fall";
	}
	public void setYear(int year) {
		if(year < 0)
		this.year = 1900;
		else
			this.year = year;
	}
	public static void setCurrentYear(int currentYear) {
		if(currentYear > 0)
			Student.currentYear = currentYear;
		else
		Student.currentYear = 1900;
	}
	public static void setCurrentSemester(int currentSemester) {
		if(currentSemester >=0 && currentYear <=2)
		Student.currentSemester = currentSemester;
		else
			Student.currentYear = 0;
		
	}
	
	public void Student(String name,String ID){
		
		this.name = name;
		if(ID.length()==5){
			int id= Integer.parseInt(ID);
			if(id >= 4001 && id  <= 4999)
				this.ID = ID;
			else
				this.ID ="04001";
			semester = "Fall";
			year = 1900;
		}
		this.ID = ID;
	}
	
	public void Student(String name, String ID, String semester, int year){
		this(name,ID);
		this.setSem
	}
	@Override
	public String toString() {
		return "Student name=" + name + " ID=" + ID + " semester="
				+ semester + " year=" + year ;
	}
	
	
	
	
}
