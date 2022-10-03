package oops_concepts;
//Parent class
public class Calculator {
		
	private String name;// Private access specifier limits the variables direct access

	void display() {
		System.out.println("In Parent class");	
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	}

