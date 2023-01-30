package pracjava;

import java.util.ArrayList;

public class ArrayListEx1 {
	public static void main(String args[]) {
		ArrayList l1=new ArrayList(); //creating new array list for vehicle
		l1.add("Bus");  //taking object 
		l1.add("Truck");
		l1.add("Car");
		l1.add("Auto");
		l1.add("Bicycle");
		l1.add("Cycle");
		l1.add("Tractor");
		System.out.println(l1);   //printing new array list
		
		ArrayList l2=new ArrayList();  //creating another array list
		l2.add("Scooter");   //adding new object
		l2.add(l1);
		System.out.println(l2);  //printing new array list
	}

}
