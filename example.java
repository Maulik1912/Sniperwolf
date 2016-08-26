import java.util.*;
class a extends Thread
{
	public void run()
	{
		for(int i=0;i<10;i++)
			System.out.println("Hello from a"+i);
	}
}

class b extends Thread
{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("Hello from b"+i);
			
				
		}
	}
}


public class example
{
	public static void main(String args[])
	{
		a t1=new a();
		
		b t2=new b();
		t1.setPriority(4);
		t2.setPriority(2);
		t1.start();
		t2.start();
		

		}
}


