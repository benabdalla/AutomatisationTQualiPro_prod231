package com.qualiprobdd.e2etests.util;

import java.io.File;
import java.util.HashMap;


import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.opera.OperaDriverService;
import org.openqa.selenium.opera.OperaOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class OperaDriverManager extends DriverManager {

	private OperaDriverService OperaService;

	@Override
	public void startService() {
		if (null == OperaService) {
			try {
				OperaService = new OperaDriverService.Builder()
						.usingDriverExecutable(new File("resources/DriversExecutables/operadriver.exe"))
						.usingAnyFreePort().build();
				OperaService.start();
				 System.out.println("OperaService Started");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	@Override  
	public void stopService() {
		if (null != OperaService && OperaService.isRunning())
			OperaService.stop();
	}
 
	@SuppressWarnings("deprecation")
	@Override
	public void createDriver() {
		String downloadFilepath = "E:\\qualipro\\trunk\\AutomatisationTQualiPro_prod\\resources\\Telechargement";

		HashMap<String, Object> OperaPrefs = new HashMap<String, Object>();
	
		    
		OperaPrefs.put("profile.default_content_settings.popups", 0);
		OperaPrefs.put("download.prompt_for_download", false);
		OperaPrefs.put("download.default_directory", downloadFilepath);

		OperaOptions Opoptions = new OperaOptions();
		Opoptions.setBinary("C:\\Users\\manel.hajjem.SAPHIR\\AppData\\Local\\Programs\\Opera\\63.0.3368.88\\opera.exe");
		

		//Opoptions.setExperimentalOption("prefs", OperaPrefs);

		//Opoptions.addArguments("--test-type");

		DesiredCapabilities cap = DesiredCapabilities.opera();
		
		//cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		cap.setCapability(OperaOptions.CAPABILITY, Opoptions);
		
		driver = new OperaDriver(OperaService, cap);
		 System.out.println("OperaDriver Started");
		driver.manage().window().maximize();
		
	}
}
