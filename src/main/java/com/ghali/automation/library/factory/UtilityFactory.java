package com.ghali.automation.library.factory;



import com.ghali.automation.library.utils.AndroidUtils;
import com.ghali.automation.library.utils.AppiumUtils;
import com.ghali.automation.library.utils.JavaUtils;

public class UtilityFactory {

	private static JavaUtils javaUtils;
	private static AppiumUtils appiumUtils;
	private static AndroidUtils androidUtils;


	public static JavaUtils getJavaUtils() {

		if (javaUtils == null) {
			javaUtils = new JavaUtils();
		}
		return javaUtils;
	}

	public static AppiumUtils getAppiumUtils() {

		if (appiumUtils == null) {
			appiumUtils = new AppiumUtils();
		}
		return appiumUtils;
	}

	public static AndroidUtils getAndroidUtils() {

		if (androidUtils == null) {
			androidUtils = new AndroidUtils();
		}
		return androidUtils;
	}
}
