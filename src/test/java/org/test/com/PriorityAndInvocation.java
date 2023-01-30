package org.test.com;


import org.testng.annotations.Test;

public class PriorityAndInvocation {
	@Test (priority= -10 , invocationCount = 3 , enabled = false)
	private void tc1() {
		System.out.println("tc1");
	}
	@Test(priority= 6)
	private void tc2() {
		System.out.println("tc2");
	}
	@Test(priority= 4)
	private void tc3() {
		System.out.println("tc3");
	}
	@Test(priority= 5)
	private void tc4() {
		System.out.println("tc4");
	}
	@Test(priority= 2)
	private void tc5() {
		System.out.println("tc5");
	}
	@Test(priority= -7 )
	private void tc6() {
	System.out.println("tc6");
	}
	@Test(priority= -8)
	private void tc7() {
	System.out.println("tc7");
	}
}
