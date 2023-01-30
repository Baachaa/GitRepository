package org.junit.framework;

import java.io.IOException;
import java.util.Date;

import org.base.BaseClass;
import org.base.POM;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebElement;

public class JunitRealTime extends BaseClass {
@BeforeClass
public static void testCase1() {
	getDriver("chrome");
	url("https://www.facebook.com/");	
}
@Before
public void testCase2() {
	Date d = new Date();
	System.out.println("Start time is : " +d);
}
@Test
public void testCase3() {
	POM p = new POM();
	WebElement userName = p.getUserName();
	sendText(userName,"BalachandarKandeepan");
	WebElement passWord = p.getPassWord();
	sendText(passWord,"bala");
	WebElement logIn = p.getLogIn();
	buttonClick(logIn);
}
@After
public void testCase4() throws IOException {
	Date d = new Date();
	System.out.println("End time is : " +d);
	screenShot("Login Credentials");
}
@AfterClass 
public static void testCase5() throws InterruptedException{
	System.out.println("FlowCompleted");
	Thread.sleep(3000);
	quit();
}
}
