class A //local inner class
{
	private int a=67;
	void set()
	
	{
	class B //inner class
	{
		int b=78;
		void get()
		{
			System.out.println(a);
		}
	}
	B obj =new B();
	obj.get();
	}}
public class nestedclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A obj=new A();
		obj.set();
		
	}

}

//output:
//67  
