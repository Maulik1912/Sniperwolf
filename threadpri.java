class a implements Runnable
{
	public void run()
	{
		System.out.println("hello from a ");
		
	}

}
class b implements Runnable
{
	public void run()
	{
		System.out.println("hello from b ");
		
	}

}



public class threadpri 
{
	public static void main(String []args)
	{
		Thread t1=new Thread(new a());
		Thread t2=new Thread(new b());
		t2.setPriority(10);
		t1.setPriority(0);
		t1.start();
		t2.start();
	}

}
