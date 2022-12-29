package input;

interface Printable
{
	void display();
}
interface Calculate
{
	int cal(int n);
}
class Square implements printable, Calculate {

      public void display()
      {
    	  System.out.println("Square of a number is - ");
      }
      public int cal(int a)
      {
    	      return a*a;
      }
}
class Cube
{
	  public void display()
	  {
		  System.out.println("Cube of a number is - ");
	  }
	  public int cal(int a)
	  {
		  return a*a*a;
	  }	
}

public class TwoInterface
{
	public static void main(String[]args)
	{
		Square sq = new Square();
		sq.display();
		System.out.println(sq.cal(2));
		Cube cb = new Cube();
		cb.display();
		System.out.println(cb.cal(2));
		
      }
}

