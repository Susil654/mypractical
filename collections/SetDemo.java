package pracjava;

import java.util.TreeSet;

public class SetDemo {
	public static void main(String args[]) {
		TreeSet<String> ts=new TreeSet<String>();  //create new TreeSet
		ts.add("D");   //adding new object
		ts.add("F");
		ts.add("B");
		ts.add("E");
		ts.add("C");
		ts.add("A");
		System.out.println(ts);   //print TreeSet
		System.out.println(ts.first());  //print first object
		System.out.println(ts.last());    //print last object
		System.out.println(ts.headSet("D"));  //print headset D
		System.out.println(ts.tailSet("D"));   //print tailset D
		System.out.println(ts.subSet("B","E"));  //print subset B and E
	}

}
