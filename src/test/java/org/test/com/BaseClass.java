package org.test.com;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
public static WebDriver driver;

public static void getDriver(String Browser) {
	if(Browser.equalsIgnoreCase("chrome")) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	else if(Browser.equalsIgnoreCase("Edge")) {
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
	}
	else {
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
	}
}
public static void url (String url) {
	driver.get(url);
}
public static WebElement locator(String locator , String AttributeValue) {
	if(locator.equalsIgnoreCase("id")) {
		WebElement findElement = driver.findElement(By.id(AttributeValue));
		return findElement;	
	}
	else if(locator.equalsIgnoreCase("name")) {
		WebElement findElement = driver.findElement(By.name(AttributeValue));
		return findElement;	
	}
	else if(locator.equalsIgnoreCase("classname")) {
		WebElement findElement = driver.findElement(By.className(AttributeValue));
		return findElement;
	}
	else if(locator.equalsIgnoreCase("xpath")) {
		WebElement findElement = driver.findElement(By.xpath(AttributeValue));
		return findElement;
	}
	else {
		WebElement findElement = driver.findElement(By.tagName(AttributeValue));
		return findElement;
	}
}	
public static void sendText (WebElement FindElement,String values) {
	FindElement.sendKeys(values);
}
public static void screenShot (String name) throws IOException {
	TakesScreenshot tk = (TakesScreenshot)driver;
	File s = tk.getScreenshotAs(OutputType.FILE);
	File d = new File ("C:\\Users\\balachandar\\Pictures\\Screenshots\\" +name+".png");
	FileUtils.copyFile(s,d);
}
public static void buttonClick (WebElement FindElement) {
	FindElement.click();
}
public static void quit() {
	driver.quit();
}		

}