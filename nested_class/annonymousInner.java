package Nestedclass;

//annonymous inner class
interface i
{
	void get();}
public class nestedclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//new A();//annonymous object	
		
		i obj=new i()//internally creates class
				{

					@Override
					public void get() {
						// TODO Auto-generated method stub
						System.out.println("hi get");
						
					}
			
				};
				obj.get();
	}

}


//output:
//hi get




//using abstract class

package Nestedclass;

//annonymous inner class
abstract class i
{
	abstract void get();}
public class nestedclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//new A();//annonymous object	
		
		i obj=new i()//internally creates class
				{

					@Override
					public void get() {
						// TODO Auto-generated method stub
						System.out.println("hi get");
						
					}
			
				};
				obj.get();
	}

}
