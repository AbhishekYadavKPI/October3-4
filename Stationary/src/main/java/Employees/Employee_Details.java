package Employees;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Employee_Details {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		Map<String,Integer> list = new HashMap<String,Integer>();
		//list.put("Abhishek",9180);
		//list.put("Employee2",9181);
		//list.put("Employee3", 9183);
		for(int i=0; i<5;i++) {
			String name =sc.next();
			int id =sc.nextInt();
			list.put(name,id);
		}
		System.out.println(list);
;
}
}
