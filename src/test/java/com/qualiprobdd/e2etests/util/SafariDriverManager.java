package com.qualiprobdd.e2etests.util;

import org.openqa.selenium.safari.SafariDriver;

public class SafariDriverManager extends DriverManager {

	@Override
	protected void startService() {
		// TODO Auto-generated method stub

	}

	@Override
	protected void stopService() {
		// TODO Auto-generated method stub

	}

	@Override
	protected void createDriver() {
		
		driver = new SafariDriver();
		driver.manage().window().maximize();
	}

}
