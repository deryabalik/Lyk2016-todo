package unıversity;

import java.util.ArrayList;

public class Course {
	
	private Department department;
	String name,instructorName;
	
	private ArrayList<Student> registeredStudents  = new ArrayList();
	
	public void Course(String name,Department department,String instructorName){
		this.name=name;
		this.department=department;
		this.instructorName=instructorName;
	}

	@Override
	public String toString() {
		return "Course department=" + department + " name=" + name
				+ " instructorName=" + instructorName
				+ " registeredStudents=" + registeredStudents ;
	}



	public ArrayList<Student> getRegisteredStudents() {
		return registeredStudents;
	}

	public void setRegisteredStudents(ArrayList<Student> registeredStudents) {
		this.registeredStudents = registeredStudents;
	}

	public Department getDepartment() {
		return department;
	}
	
	
	
	
}
