package pracjava;

import java.util.*;

public class LinkedList1 {
	public static void main(String args[]) {
		List<String> a=new ArrayList<String>();  //creating new array list
		a.add("Ravi");  //adding object
		a.add("Vijay");
		a.add("Ajay");
		a.add("Ravi");
		
		List<String> a1=new LinkedList<String>();  //creating new linked list
		a1.add("James");  //adding object
		a1.add("Serena");
		a1.add("Swati");
		a1.add("John");
		
		System.out.println("arraylist:" +a);  //printing array list
		System.out.println("Linkedlist:" +a1); //printing linked list 

		
		}
		
		
	}

