package pracjava;

import java.util.Vector;

public class VectorEx {
	public static void main(String args[]) {
	Vector v=new Vector();  //creating new object vector
	v.add(10);              //taking a new object
	System.out.println(v);   //printing new value
	System.out.println(v.capacity());
	for(int i=0;i<10;i++)     //create a for loop
	{
		v.addElement(i);      //add a object with vector
	}
	System.out.println(v);    //print vector
	v.addElement(100);
	System.out.println(v);
	System.out.println(v.capacity());   //printing vector capacity
	v.get(2);
	System.out.println(v);
	

}
}
