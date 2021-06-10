package Nestedclass;

class A //outer class
{
	void set()
	{
		System.out.println(new B().b);
	}
	int a=67;
	class B //inner class
	{
		int b=78;
		void get()
		{
			System.out.println(a);
		}
	}}
public class nestedclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A obj=new A();
		obj.set();
		A.B obj1=new A().new B();
		obj1.get();

	}

}


//output:
//78
//67
