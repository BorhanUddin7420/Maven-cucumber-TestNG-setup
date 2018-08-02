package com.qatest.framework;

import org.openqa.selenium.WebDriver;

import com.qatest.pageObject.LogIn;

public abstract class ParentScenario extends ParentDriver {

	protected WebDriver driver = getDriver();
	
	public LogIn login;
	
	public void startBrowser() {
		login = new LogIn(driver);
	}
	
	
}
