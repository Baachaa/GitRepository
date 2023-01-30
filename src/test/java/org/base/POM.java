package org.base;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM extends BaseClass{
	@FindBy(id="email")
	private WebElement userName;
	@FindBy(name="pass")
	private WebElement PassWord;
	@FindBy(xpath="//button[text()='Log in']")
	private WebElement logIn;
	public WebElement getUserName() {
		return userName;
	}
	public WebElement getPassWord() {
		return PassWord;
	}
	public WebElement getLogIn() {
		return logIn;
	}
	
	public POM() {
		PageFactory.initElements(driver, this);
		
	}
}
