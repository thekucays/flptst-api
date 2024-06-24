package com.tests;

import org.testng.annotations.Test;
import com.common.Common;

public class TestExample {
	
	@Test
	public void testOne() {
		Common.getGenderResponse("Isabella", "female");
	}
	
	@Test
	public void testTwo() {
		Common.getGenderResponse("Olivia", "female");
	}
	
	@Test
	public void testThree() {
		Common.getGenderResponse("Ethan", "male");
	}
	
	@Test
	public void testFour() {
		Common.getGenderResponse("Christopher", "male");
	}
	
	@Test
	public void testFive() {
		Common.getGenderResponse("Sophia", "female");
	}
}
