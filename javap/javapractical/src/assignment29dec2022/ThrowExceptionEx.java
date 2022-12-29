package assignment29dec2022;
import java.util. *;

public class ThrowExceptionEx {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your age");
		int age=sc.nextInt();
		sc.close();
		
		if(age<18) {
			throw new ArithmeticException("Age is not correct, you are not eligible to vote");
		}
		else {
			System.out.println("you are eligible to vote");
		}
	}
}
