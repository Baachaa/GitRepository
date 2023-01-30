package org.test.com;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNg {
	@BeforeClass
	private void tc1() {
		System.out.println("tc1");
	}
	@BeforeGroups
	private void tc2() {
		System.out.println("tc2");
	}
	@BeforeMethod
	private void tc3() {
		System.out.println("tc3");
	}
	@Test
	private void tc4() {
		System.out.println("tc4");
	}
	@AfterMethod
	private void tc5() {
		System.out.println("tc5");
	}
	@AfterGroups
	private void tc6() {
	System.out.println("tc6");
	}
	@AfterClass
	private void tc7() {
	System.out.println("tc7");
	}
}