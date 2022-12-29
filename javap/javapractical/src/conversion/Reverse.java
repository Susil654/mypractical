package conversion;

import java.util.Scanner;

public class Reverse {
	 
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a text");
		String a = sc.nextLine();
		
		StringBuilder reversestring = new StringBuilder(a);
		reversestring.reverse();
		String result = reversestring.toString();
		
		System.out.println("Reversed string- "+result);
		
		System.out.println("The Uppercase is- "+a.toUpperCase());
		
		
	}

}
