package multithreading;

class ThreadJoin extends Thread  
{  
	public void run()  
	{  
		for (int j = 0; j < 2; j++)  
		{  
			try  
			{  
				Thread.sleep(300);  
				System.out.println("The current thread name is: " + Thread.currentThread().getName());  
			}catch(Exception e)  {  
				System.out.println("The exception has been caught: " + e);  
			}  
			System.out.println( j );  
		}  
	}  
}  

public class ThreadJoinExample  
{  
	//main method  
	public static void main (String argvs[])  
	{  

		//creating 3 threads  
		ThreadJoin th1 = new ThreadJoin();  
		ThreadJoin th2 = new ThreadJoin();  
		ThreadJoin th3 = new ThreadJoin();  

		//thread th1 starts  
		th1.start();  
		try  
		{  
			System.out.println("The current thread name is: "+ Thread.currentThread().getName());  
			th1.join();  
		}catch(Exception e){  
			System.out.println("The exception has been caught " + e);  
		}  
		th2.start();  

		try  
		{  
			System.out.println("The current thread name is: " + Thread.currentThread().getName());  
			th2.join();  
		}catch(Exception e){  
			System.out.println("The exception has been caught " + e);  
		}  
		th3.start();  
	}  
}  
