package oops_concepts;
//Calculator1 is Child class derived from Calculator(Parent class)
//Single Inheritance
public class Calculator1 extends Calculator {
	
	//This method overrides display() of Calculator class
	@Override
	void display() {
		// TODO Auto-generated method stub
		System.out.println("In Child class");
		super.display();
	}
	//Overloaded add().It takes two int parameters
	int add(int a, int b) {
		return a+b;
	}
	//Overloaded add().It takes three int parameters
	int add(int a, int b, int c) {
		return a+b+c;
	}
	//Overloaded add().It takes two double parameters
	double add(double a, double b) {
		return a+b;
	}

}
