package com.ghali.automation.library.drivers;

import java.net.MalformedURLException;

import com.ghali.automation.library.factory.UtilityFactory;
import com.ghali.automation.library.interfaces.DriverInterface;

import io.appium.java_client.android.AndroidDriver;

public class MobileAndroidDriver implements DriverInterface {

	private AndroidDriver<?> driver;

	public MobileAndroidDriver() throws MalformedURLException {
		this.driver = UtilityFactory.getAndroidUtils().startAndroidApp();
	}

	public Object getDriver() {

		return this.driver;
	}

	public void closeDriver() {

		this.driver.close();
	}

}
