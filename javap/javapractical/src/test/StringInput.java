package test;

import java.util.Scanner;

public class StringInput {
	 
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter First String");
		String str1 = sc.next();
		
		System.out.println("Enter second String");
		String str2 = sc.next();
		 
		if(str1.contains(str2))
		{
			System.out.println("content of first string are exist in second string");
		}
		else
		{
			System.out.println("content of first string are not exist in second string");
			
		}
	}

}

