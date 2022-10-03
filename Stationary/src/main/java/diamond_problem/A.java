package diamond_problem;
//Super base class
public class A {
	void show() {
		System.out.println("Class A");
		}
}
class B extends A{
	@Override
	void show() {
		System.out.println("Class A");
		}
}
class c extends A{
	@Override
	void show() {
		System.out.println("Class A");
		}
}
//Multiple inheritance not supported in normal classes
class D extends B,C{
	public static void main(String args[]) {
		D d = new D();
		//Both B and C override show() of Class A(
		//Creates ambiguity which show() method to call  
		//This ambiguity is diamond problem
		d.show();
	}
}
