package com.qualiprobdd.e2etests.util;

import java.io.File;


import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.firefox.GeckoDriverService;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.io.File;
import java.io.IOException;

public class FirefoxDriverManager extends DriverManager {

	

	//public class FirefoxDriverManager extends AbstractDriverManager implements WebDriverManager {
	    private GeckoDriverService geckoDriverService;
	    private final File geckoDriverExe;

	    FirefoxDriverManager() {
	        //final String path = getClass().getClassLoader().getResource("resources/DriversExecutables/geckodriver.exe").getPath();
	        geckoDriverExe = new File("resources/DriversExecutables/geckodriver.exe");
	        System.setProperty("webdriver.gecko.driver", "resources/DriversExecutables/geckodriver.exe");
	    }

	    @Override
	    public void startService() {
	       if (null == geckoDriverService) {
	            try {
	                geckoDriverService = new GeckoDriverService.Builder()
	                        .usingDriverExecutable(geckoDriverExe)
	                        .usingAnyFreePort()
	                        .build();
	                geckoDriverService.start();

		            System.out.println("GeckoDriverService Started");
	            } catch (final IOException e) {
	                e.printStackTrace();
	            }
	        }
	    }

	    @Override
	    public void stopService() {
	       if (null != geckoDriverService && geckoDriverService.isRunning()) {
	            geckoDriverService.stop();
	            System.out.println("GeckoDriverService Stopped");
	        }
	    }

	    
	    @Override
	    public void createDriver() {
	    	DesiredCapabilities capabilities = DesiredCapabilities.firefox();
			capabilities.setCapability("marionette",true);
			FirefoxProfile fp = new FirefoxProfile();
			fp.setPreference("xpinstall.signatures.required", false);
			fp.setPreference("toolkit.telemetry.reportingpolicy.firstRun", false);
			driver = new FirefoxDriver();
			   System.out.println("FirefoxDriver Started");
			driver.manage().window().maximize();
	    }

	
	

}
