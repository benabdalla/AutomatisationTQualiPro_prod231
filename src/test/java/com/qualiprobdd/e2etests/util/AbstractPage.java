package com.qualiprobdd.e2etests.util;

import net.codestory.simplelenium.SectionObject;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class AbstractPage implements SectionObject {

	//public static final String DATE_FORMAT_IN_GUI = "yyyy-MM-dd";
	//protected static final Logger logger = LoggerFactory.getLogger(AbstractPage.class);

	public static WebDriver driver;
	public static boolean bResult;

	public AbstractPage(WebDriver driver) {
		AbstractPage.driver = driver;
		AbstractPage.bResult = true;
	}

}
