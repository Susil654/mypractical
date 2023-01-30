package pracjava;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx2 {
	public static void main(String args[]) {
		HashMap<String,String> map1=new HashMap<String,String>(); //creating new object
		map1.put("S01", "English");  //taking new object
		map1.put("S02", "Geography");
		map1.put("S03", "History");
		map1.put("S04", "Economics");
		map1.put("S05", "Mathematics");
		map1.put("S03", "Sanskrit");
		
		
		for(Map.Entry m: map1.entrySet())
				{
			System.out.println(m.getKey()+"  "+m.getValue());  //printing the values
				}
	}

}
