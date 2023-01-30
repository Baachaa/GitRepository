package org.base;

import java.io.IOException;

import org.openqa.selenium.WebElement;

public class Main extends BaseClass {

	public static void main(String[] args) throws IOException, InterruptedException {
		getDriver("chrome");
		url("https://www.facebook.com/");
		WebElement user = locator("id","email");
		sendText(user, "9597420153");
		screenShot("UserName");
		WebElement pswd = locator("name","pass");
		sendText(pswd,"bala");
		screenShot("password");
		WebElement logIn = locator("xpath","//button[text()='Log in']");
		buttonClick(logIn);
		Thread.sleep(2000);
		screenShot("login");

	}

}
