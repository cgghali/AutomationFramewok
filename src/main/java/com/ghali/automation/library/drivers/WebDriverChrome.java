package com.ghali.automation.library.drivers;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ghali.automation.library.interfaces.DriverInterface;

public class WebDriverChrome implements DriverInterface {
	private Logger LOG = LoggerFactory.getLogger(Driver.class);
	private ChromeDriver driver;

	public WebDriverChrome()
	{
		this.driver = new ChromeDriver();
		this.driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
		this.driver.manage().window().maximize();

	}

	@Override
	public Object getDriver() {
		return this.driver;
	}

	@Override
	public void closeDriver() {
		this.driver.close();

	}

}
