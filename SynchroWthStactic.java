package synchronisation;
	

class Table {	
	
	synchronized static  void printTable(int no)
	{
	for(int i=1;i<=10;i++)
		{
		System.out.println(no*i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	}
	}



	class A extends Thread
	{
		@Override
		public void run()
		{
			Table.printTable(4);
		}
	}

	class B extends Thread
	{
		@Override
		public void run()
		{
			Table.printTable(5);
		}
	}



	public class Synchronise{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		A obj1=new A();
		obj1.start();
		B obj2=new B();
		obj2.start();

	}

}
