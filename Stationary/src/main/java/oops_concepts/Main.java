package oops_concepts;

public class Main {

	public static void main(String[] args) {
		Calculator1 ob = new Calculator1();
		
		ob.display();//
		ob.setName("Casio");
		//Due to encapsulation, the direct access of name is not possible
		//System.out.println(ob.name);

		System.out.println(ob.add(2, 4));
		System.out.println(ob.add(5, 7, 9));
		System.out.println(ob.add(5.7, 9.8));
	}

}
