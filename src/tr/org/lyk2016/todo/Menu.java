package tr.org.lyk2016.todo;

import java.io.ObjectInputStream.GetField;
import java.util.Iterator;

public class Menu {
	public static void printMenu(){
		StringBuilder menu = new StringBuilder(50);
		
		menu.append("TODOs\n");
		menu.append("=====\n");
		menu.append("\n");
		
		 int i=0;
		Iterator<Todo> local = TodoHelper.getIterator();
	while(local.hasNext()){
		Todo t = local.next();
	  
	   i++;
		

		//TODO use TodoHelper's getIterator method here
		// hint: use a while loop
		
		

			// TODO add checkbox according to 'done' status
			// TODO add index numbers for users to choose
			menu.append("(");
			menu.append(i);
			menu.append(") ");
			menu.append(t.getCheckbox());
			menu.append(" ");
			menu.append(t.getDescription());
			menu.append("\n");
		}
		
		menu.append("\n");
		menu.append("MENU\n");
		menu.append("=====\n");
		menu.append("(0) Exit\n");
		menu.append("(1) Add Todo\n");
		menu.append("(2) Mark as done\n");
		menu.append("(3) Remove todo\n");
		menu.append("\n");
		menu.append("Enter your command: ");
		
		System.out.println(menu.toString());
	}
	
}
