package com.ghali.automation.library.factory;

import java.net.MalformedURLException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ghali.automation.library.constants.Constants;
import com.ghali.automation.library.drivers.MobileAndroidDriver;
import com.ghali.automation.library.drivers.WebDriverChrome;
import com.ghali.automation.library.drivers.WebDriverFirefox;
import com.ghali.automation.library.interfaces.DriverInterface;

public class DriverFactory {
	private final static Logger LOG = LoggerFactory.getLogger(DriverFactory.class);
	private DriverInterface driverInterface;
	private static DriverFactory instance;
	private String currentDriver;

	private DriverFactory(String driverName) throws MalformedURLException, InterruptedException {
		this.currentDriver = driverName;
		switch (this.currentDriver.toLowerCase()) {
		case Constants.DriverNames.CHROME:
			this.driverInterface = new WebDriverChrome();
			break;
		case Constants.DriverNames.FIREFOX:
			this.driverInterface =  new WebDriverFirefox();
			break;
		case Constants.DriverNames.ANDROID:
			this.driverInterface = new MobileAndroidDriver();
			break;
		default:
			LOG.info("Choose Correct drive name");

		}

	}

	public DriverInterface getDriverInterface() {

		return this.driverInterface;
	}

	public static synchronized DriverFactory getInstance(String driverName)
			throws MalformedURLException, InterruptedException {

		instance = new DriverFactory(driverName);
		return instance;
	}

}
