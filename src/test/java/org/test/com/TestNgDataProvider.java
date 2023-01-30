package org.test.com;

import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNgDataProvider extends BaseClass{
	@DataProvider(name="login")
	private Object[][]getData(){
	return new Object[][]{{"test1@gmail.com","bala"},{"test2@gmail.com","bala2"},{"test3@gmail.com","bala3"}};
}
	@Test(dataProvider = "login")
	private void tc1(String userName,String passWord) {
		getDriver("chrome");
		url("https://www.facebook.com/");
		WebElement user = locator("id","email");
		sendText(user,userName);
		WebElement pwd = locator("name","pass");
		sendText(pwd,passWord);
		WebElement logIn = locator("xpath","//button[text()='Log in']");
		buttonClick(logIn);
		
	}
}
