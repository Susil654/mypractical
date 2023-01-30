package pracjava;

import java.util.LinkedList;
import java.util.ListIterator;

public class ListIteratorDemo {
	public static void main(String args[]) {
		LinkedList<String> l=new LinkedList<String>(); //creating new linked list
		l.add("Neha");     //add new object
		l.add("Sumit");
		l.add("Ravi");
		l.add("Deepak");
		System.out.println(l);
		ListIterator<String> itr=l.listIterator(); 
		while(itr.hasNext())
		{
			String s=(String)itr.next();
			if(s.equals("Neha"))  //check if object "Neha" is available
			{
				itr.remove();  //remove object
			}
			else if(s.equals("Sumit"))  //check if object "sumit" is available
			{
				itr.add("Amit");   // adding "Amit"
			}
			else if(s.equals("Deepak"))  
			{
				itr.set("xyz");  //set "xyz" at the place of "Deepak"
			}
		}
		System.out.println(l);
	}
}


