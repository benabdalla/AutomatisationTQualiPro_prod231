package com.qualiprobdd.e2etests.util;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Set;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;


import com.google.common.base.Predicate;
import com.google.common.io.Files;



public class Setup {

	public static WebDriver driver;
	public static String browsername;
	static DriverManager driverManager;

	@Before
	/**
	 * Call Browser
	 */
	public static void setup() throws IOException, InterruptedException {
		System.err.println("Browser name in @BeforeClass is" + browsername);
		if(browsername.equals("CHROME")) {
			driverManager = DriverManagerFactory.getManager(DriverType.CHROME);}
		else if(browsername.equals("FireFox"))
		{
			driverManager = DriverManagerFactory.getManager(DriverType.FIREFOX);
		}else if(browsername.equals("IE"))
		{
			driverManager = DriverManagerFactory.getManager(DriverType.IE);
		}else if(browsername.equals("OPERA"))
		{
			driverManager = DriverManagerFactory.getManager(DriverType.OPERA);
		}
		//driverManager = DriverManagerFactory.getManager(DriverType.CHROME);
		//System.out.println("driver manager Started");
		driver = driverManager.getDriver();
		//System.out.println("Get driver Started");

	}


	@After
	/**
	 * Embed a screenshot in test report if test is marked as failed
	 */
	public void afterScenario(Scenario scenario) {
		//afficher le nom et le valeur de tous les cookies
		/*Set<Cookie> cookieL = driver.manage().getCookies();
		for(Cookie temp_cookie : cookieL ){
			System.out.println("Name of the cookie : "+temp_cookie.getName()+
					" and its value : "+ temp_cookie.getValue());
		}*/
		//Cookie cookie1 = driver.manage().getCookieNamed("lan");
		//System.out.println("Name of the cookie : "+cookie1.getName()+
		//" and its value : "+ cookie1.getValue());
		if (scenario.isFailed()) {
			String screenshotName = scenario.getName().replaceAll(" ", "_");
			try {

				//This takes a screenshot from the driver at save it to the specified location
				File sourcePath = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

				//Building up the destination path for the screenshot to save
				//Also make sure to create a folder 'screenshots' with in the cucumber-report folder
				File destinationPath = new File(System.getProperty("user.dir") + "/target/cucumber-reports/"+screenshotName+".png");

				//Copy taken screenshot from source location to destination location
				Files.copy(sourcePath, destinationPath);

				//This attach the specified screenshot to the test
				//Reporter.addScreenCaptureFromPath(destinationPath.toString());


			} catch (IOException e) {
			}
		}
		// quit driver
		if (driver != null)
			driver=null;
		//	driver.quit();

		// delete all "scoped_dir" temp folders
         /*String tempfolder = System.IO.Path.GetTempPath();
         String[] tempfiles = Directory.GetDirectories(tempfolder, "scoped_dir*", SearchOption.AllDirectories);
         foreach (String tempfile in tempfiles)
         {
             try
             {
                 System.IO.DirectoryInfo directory = new System.IO.DirectoryInfo(tempfolder);
                 foreach (System.IO.DirectoryInfo subDirectory in directory.GetDirectories()) subDirectory.Delete(true);
             }
             catch (Exception ex)
             {
                 writeEx("File '" + tempfile + "' could not be deleted:\r\n" +
                         "Exception: " + ex.getMessage() + ".");
             }
         }*/
	}
}
