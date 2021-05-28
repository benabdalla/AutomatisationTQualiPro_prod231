package com.qualiprobdd.e2etests.util;

import java.io.File;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.ie.InternetExplorerDriverService;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.remote.DesiredCapabilities;

public class IEDriverManager extends DriverManager {

	private InternetExplorerDriverService  IEService;
	
	private final File ieDriverExe;
	
	
	IEDriverManager() {
        ieDriverExe = new File("resources/DriversExecutables/IEDriverServer1.exe");

		System.setProperty("webdriver.ie.driver","resources/DriversExecutables/IEDriverServer1.exe");
    }
	@Override
	protected void startService() {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.edge.driver", "");
		if (null == IEService) {
			try {
				IEService = new InternetExplorerDriverService.Builder()
						.usingDriverExecutable(ieDriverExe)
						.usingAnyFreePort().build();
				IEService.start();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	@Override
	protected void stopService() {
		// TODO Auto-generated method stub
		if (null != IEService && IEService.isRunning())
			IEService.stop();
		System.out.println("IEDriverService Stopped");
	}

	@SuppressWarnings("deprecation")
	@Override
	protected void createDriver() {
	 	DesiredCapabilities caps = DesiredCapabilities.internetExplorer();
		//caps.setCapability("marionetteIE",true);
		caps.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,true);
		caps.setCapability(InternetExplorerDriver.NATIVE_EVENTS, false);
		caps.setCapability("requireWindowFocus", true);

				driver=new InternetExplorerDriver(caps);
				//driver = new InternetExplorerDriver(caps);
		driver.get("about:blank");
		JavascriptExecutor  executor = (JavascriptExecutor)driver;
		executor.executeScript("window.open('about:blank', 'another_window')");
		System.out.println("IEDriver Started");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	
		///HashMap<String, Object> edgeOptionsMap = new HashMap<String, Object>();

		//DesiredCapabilities cap = DesiredCapabilities.internetExplorer();

		//cap.setCapability(InternetExplorerOptions.this, edgeOptionsMap);
		//cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);

		/*driver = new InternetExplorerDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();*/
		//set system property, so that we can access IE driver
		

		//driver =new IEDriverManager();
	

	}

}
