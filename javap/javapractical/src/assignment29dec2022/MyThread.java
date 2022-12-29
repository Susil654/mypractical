package assignment29dec2022;

public class MyThread {
	public static void main(String[] args) {
		MyThread t=new MyThread();
		t.start();
		for(int i=1;i<=10;i++)
		{
			System.out.println("Even :"+i);
		}
	}

}
class MyThread extends Thread
{
	public void run()
	{for(int i=1;i<=10;i++)
	{
		System.out.println("odd :"i++);
	}
		
	}
}	
