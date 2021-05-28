package com.qualiprobdd.e2etests.util;

import java.io.File;
import java.util.HashMap;

import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeDriverService;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class InternetExplorerDriver extends DriverManager {

	private EdgeDriverService IEService;
	@Override
	protected void startService() {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.edge.driver", "");
		if (null == IEService) {
			try {
				IEService = new EdgeDriverService.Builder()
						.usingDriverExecutable(new File("C:\\Qualipro_Auto\\AutomatisationTQualiPro_23\\AutomatisationTQualiPro_23\\resources\\DriversExecutables\\MicrosoftWebDriver1.exe"))
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

	}

	@Override
	protected void createDriver() {
	
		HashMap<String, Object> edgeOptionsMap = new HashMap<String, Object>();

		DesiredCapabilities cap = DesiredCapabilities.edge();

		cap.setCapability(EdgeOptions.CAPABILITY, edgeOptionsMap);

		cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);

		driver = new EdgeDriver(IEService, cap);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
	}

}
