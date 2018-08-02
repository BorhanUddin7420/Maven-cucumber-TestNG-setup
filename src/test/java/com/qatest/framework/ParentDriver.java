package com.qatest.framework;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public abstract class ParentDriver {
	
	public static WebDriver driver;
	
	public WebDriver getDriver() {
		
		if(driver == null) {
			System.setProperty("webdriver.chrome.driver","ChromeDriver/chromedriver.exe");
			ChromeOptions cOptions = new ChromeOptions();
			cOptions.addArguments("chrome.switches","-disable-extensions");
			cOptions.addArguments("--start-maximized");
			cOptions.addArguments("--disable-web-security");
			cOptions.addArguments("--disable-notifications");
			cOptions.addArguments("--no-proxy-server");
			
	    	Map<String, Object> prefs = new HashMap<String, Object>();
	    	prefs.put("credentials_enable_service", false);
	    	prefs.put("profile.password_manager_enabled", false);
	    	cOptions.setExperimentalOption("prefs", prefs);
			cOptions.setExperimentalOption("excludeSwitches", Arrays.asList("enable-automation"));
			driver = new ChromeDriver(cOptions);
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		}
		return driver;
	}

}
