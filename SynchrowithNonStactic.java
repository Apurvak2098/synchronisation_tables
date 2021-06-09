package synchronisation;
	

class Table {

	//synchronised non static
	
	synchronized  void printTable(int no)
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
		Table t;
		public A(Table t) {
			super();
			this.t = t;
		}
		@Override
		public void run()
		{
			t.printTable(4);
		}
	}

	class B extends Thread
	{
		Table t;
		public B(Table t) {
			super();
			this.t = t;
		}
		@Override
		public void run()
		{
			t.printTable(5);
		}
	}



	public class Synchronise{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Table t=new Table();
		A obj1=new A(t);
		obj1.start();
		B obj2=new B(t);
		obj2.start();

	}

}

	
