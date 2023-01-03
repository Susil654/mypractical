package assignment29dec2022;

import java.util.Scanner;

public class MyThread extends Thread {
	
	public  void run() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value to find odd or even");
		int r= sc.nextInt();
		if(r%2==0)
		{
			System.out.println(r+" is an even number");
		}
		else
		{
			System.out.println(r+" is an odd number");
		}	
	}
		
}
	
