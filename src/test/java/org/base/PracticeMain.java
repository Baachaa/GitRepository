package org.base;

import java.io.IOException;

import org.openqa.selenium.WebElement;

public class PracticeMain extends BaseClass{
	public static void main(String[] args) throws IOException, InterruptedException {
		getDriver("chrome");
		url("https://www.facebook.com/");
		POM p = new POM();
		WebElement userName = p.getUserName();
		sendText (userName,"BalaChandar");
		WebElement passWord = p.getPassWord();
		sendText (passWord,"Bala");
		WebElement logIn = p.getLogIn();
		buttonClick(logIn);
		Thread.sleep(3000);
		screenShot ("feedback");
		
		
		
	}
}
