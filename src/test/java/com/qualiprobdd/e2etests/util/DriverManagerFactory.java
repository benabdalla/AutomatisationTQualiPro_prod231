package com.qualiprobdd.e2etests.util;


public class DriverManagerFactory {

	public static DriverManager getManager(DriverType type) {

		DriverManager driverManager;

		switch (type) {
		case CHROME:
			driverManager = new ChromeDriverManager();
			break;
		case FIREFOX:
			driverManager = new FirefoxDriverManager();
			break;
		case IE:
			driverManager = new IEDriverManager();
			break;
		case OPERA:
			driverManager = new OperaDriverManager();
			break;
		default:
			driverManager = new SafariDriverManager();
			break;
		}
		return driverManager;

	}
}
