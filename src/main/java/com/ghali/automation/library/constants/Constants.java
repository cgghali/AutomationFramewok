package com.ghali.automation.library.constants;

public final class Constants {

	private Constants() {
	}

	public static final class DriverNames {

		private DriverNames() {
		}

		public static final String ANDROID = "android";
		public static final String IOS = "ios";
		public static final String FIREFOX = "firefox";
		public static final String CHROME = "chrome";
	}

	public static final class AppiumConstants {

		private AppiumConstants() {
		}

		public static final String AUTOMATION_NAME_ANDROID = "uiautomator2";
		public static final String AUTOMATION_NAME_IOS = "xcuitest";
		public static final String KEY_XCODE_CONFIG_FILE = "xcodeConfigFile";
		public static final String KEY_AUTO_GRANT_PERMISSION = "autoGrantPermissions";
		public static final String KEY_SESSION_OVERRIDE = "session-override";
		public static final String KEY_LOG = "log";
		public static final String KEY_LOG_LEVEL = "log-level";
		public static final String PLATFORM_VERSION = "platformVersion";
		public static final String AUTOMATION_NAME_UIAUTOMATOR2 = "uiautomator2";
		public static final String AUTOMATION_PLATFORM_ANDROID = "android";
	}
	public final class MessagesConstants {

		private MessagesConstants() {
		}

		public static final String WAS_NOT_LOADED = " was not loaded...";

	}

	public static final class GenericConstants {

		public static final String ROOT;
		public static final String HOME;

		static {
			ROOT = System.getProperty("user.dir");
			HOME = System.getProperty("user.home");
		}

		private GenericConstants() {

		}
		public static final String CONFIG_PROPERTIES = ROOT + "/Config.properties";
		public static final String PLATFORM_TYPE = "platformType";
		public static final String PLATFORM_VERSION = "platformVersion";
		public static final String DRIVER_NAME = "driverName";
		public static final String APK_PATH = "apkPath";
		public static final String LOCALHOST_URL = "127.0.0.1";

		public static final String UP_ARROW = "up";
		public static final String DOWN_ARROW = "down";
		public static final String LEFT_ARROW = "left";
		public static final String RIGHT_ARROW = "right";

	}




}
