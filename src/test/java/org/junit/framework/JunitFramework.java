package org.junit.framework;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class JunitFramework {
@BeforeClass
public static void tc1() {
	System.out.println("tc1");
}
@Before
public void tc2() {
	System.out.println("tc2");
}
@Test
public void tc3() {
	System.out.println("tc3");
}
@After
public void tc4() {
	System.out.println("tc4");
}
@AfterClass
public static void tc5() {
	System.out.println("tc5");
}
}
