package testing1;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class addTwoStrT {

	@Test
	public void test() {
		Junittesting obj2 = new Junittesting();
		String test1 = obj2.addTwoStr("hello","people");
		assertEquals("hellopeople",test1);

	}

}
//E19CSE273
//Arnav Khandelwal