package Nestedclass;


class A{
	void set() {
		
	}
	static class B{
		void get() {
			System.out.println("in get");
		}
	}
}

public class nestedclass {

	public static void main(String[] args) {
		A.B obj =new A.B();//{new A().new B()-member inner class}
		obj.get();
}}
