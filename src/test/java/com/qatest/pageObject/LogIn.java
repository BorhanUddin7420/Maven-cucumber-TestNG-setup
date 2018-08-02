package com.qatest.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.qatest.framework.ParentDriver;

public class LogIn extends ParentDriver {
	WebDriver driver = getDriver();
	
	public LogIn(WebDriver driver) {
		this.driver = driver;
	}
	
	public void navigateto() {
		driver.navigate().to("https://login.jomakhata.com/login");
	}
	
	
	public void enterPassword(String arg1) {
		driver.findElement(By.xpath(".//*[@id='password']")).sendKeys(arg1);
	}
	public void clickLoginbtn() {
		driver.findElement(By.xpath("//*[@id='login']/div[5]/button")).click();
	}
	
	public void alertCheck(String arg1) {
		String X =  driver.findElement(By.xpath("//span[@id=\"loginmessage\"]")).getText();
		Assert.assertEquals(X, arg1);
	}
	
}
