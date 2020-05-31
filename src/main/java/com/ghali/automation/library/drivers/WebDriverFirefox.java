package com.ghali.automation.library.drivers;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ghali.automation.library.interfaces.DriverInterface;

public class WebDriverFirefox implements DriverInterface {
	private Logger LOG = LoggerFactory.getLogger(WebDriverFirefox.class);
	private FirefoxDriver driver;
	
	public WebDriverFirefox()
	{
		this.driver = new FirefoxDriver();
	}
	
	public Object getDriver() {
		return this.driver;
	}

	public void closeDriver() {
		this.driver.close();
	}
}
