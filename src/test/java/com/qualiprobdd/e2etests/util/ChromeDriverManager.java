package com.qualiprobdd.e2etests.util;

import java.io.File;
import java.util.HashMap;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Predicate;

public class ChromeDriverManager extends DriverManager {

    private ChromeDriverService chService;

    @Override
    public void startService() {
        if (null == chService) {
            try {
                chService = new ChromeDriverService.Builder()
                        .usingDriverExecutable(new File("resources/DriversExecutables/chromedriver.exe"))
                        .usingAnyFreePort().build();
                chService.start();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void stopService() {
        if (null != chService && chService.isRunning())
            chService.stop();
    }

    @Override
    public void createDriver() {
        String downloadFilepath = "E:\\qualipro\\trunk\\AutomatisationTQualiPro_prod231\\resources\\Telechargement";

      /*  HashMap<String, Object> chromePrefs = new HashMap<String, Object>();

        chromePrefs.put("profile.default_content_settings.popups", 0);
        chromePrefs.put("download.prompt_for_download", false);
        chromePrefs.put("download.default_directory", downloadFilepath);*/


        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-features=VizDisplayCompositor");
        options.addArguments("--window-size=1920,1080");
        options.addArguments("--force-device-scale-factor=1");

        HashMap<String, Object> chromeOptionsMap = new HashMap<String, Object>();
        chromeOptionsMap.put("plugins.plugins_disabled", new String[] {
                "Chrome PDF Viewer"
        });
        chromeOptionsMap.put("download.default_directory", downloadFilepath);

        chromeOptionsMap.put("plugins.always_open_pdf_externally", true);

        options.setExperimentalOption("prefs", chromeOptionsMap);
     //   options.setExperimentalOption("prefs", chromePrefs);

        options.addArguments("--test-type");

        DesiredCapabilities cap = DesiredCapabilities.chrome();
        cap.setCapability("download.default_directory",downloadFilepath);
        cap.setCapability(ChromeOptions.CAPABILITY, chromeOptionsMap);
        cap.setCapability(ChromeOptions.CAPABILITY, options);
        cap.setCapability(ChromeOptions.CAPABILITY, chromeOptionsMap);
        cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);

        cap.setCapability(ChromeOptions.CAPABILITY, options);
        driver = new ChromeDriver(chService, cap);
        Dimension d = new Dimension(1382,744);
        //Resize the current window to the given dimension
        //driver.manage().window().setSize(d);
        driver.manage().window().maximize();

    }

}
