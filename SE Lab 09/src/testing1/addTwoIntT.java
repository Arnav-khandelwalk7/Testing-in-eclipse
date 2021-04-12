package testing1;


import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class addTwoIntT {

	@Test
	public void test() {
		
		Junittesting obj1 = new Junittesting();
		int test1 = obj1.addTwoInt(200,300);
		assertEquals(500,test1);
	}

}
//E19CSE273
//Arnav Khandelwal