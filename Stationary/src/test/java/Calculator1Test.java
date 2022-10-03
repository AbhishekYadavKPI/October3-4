import static org.junit.Assert.assertEquals;

import org.junit.Test;

import oops_concepts.Calculator1;

public class Calculator1Test {
	@Test
	public void checkadd() {
		Calculator1 ob = new Calculator1();
		assertEquals(10,ob.add(6,4));
		assertEquals(289,ob.add(150,100,39));
	}

}

