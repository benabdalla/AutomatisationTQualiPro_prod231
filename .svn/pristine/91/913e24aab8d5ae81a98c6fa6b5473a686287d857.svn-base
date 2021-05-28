package com.qualiprobdd.e2etests;

import java.io.File;

import cucumber.api.testng.AbstractTestNGCucumberTests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.cucumber.listener.Reporter;
import com.qualiprobdd.e2etests.util.DriverManager;

import cucumber.api.CucumberOptions;
import cucumber.api.Scenario;



@CucumberOptions(
		plugin = {
				"html:target/cucumber-html-report", "json:target/cucumber.json", "junit:target/cucumber.xml",
				"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"},       
		features = { "src/specs/features/Risque/Risque.feature" }, 
    	glue = {"com.qualiprobdd.e2etests"}
    	,
		//tags = {"@CréationFicherRisque"}
		tags = {"@CréationFicherRisque,@EvaluationBruteagenda,@EvaluationRésiduelle"}
        , dryRun = false
        , monochrome = true
)

@Test
public class RisqueRunner extends AbstractTestNGCucumberTests {


	
	public static WebDriver driver;
	static DriverManager driverManager;
 
	@Parameters({"language","browsername"}) 
	@BeforeClass
    public void setup(String language,String browsername) throws Exception { 
		com.qualiprobdd.e2etests.authentification.stepdefs.AuthentificationStepDefinition.lan=language;
		com.qualiprobdd.e2etests.util.Setup.browsername=browsername;

    } 
	@AfterClass
	public static void writeExtentReport() {
		//Reporter.loadXMLConfig(new File("resources/configs/extent-config.xml"));

	}




}
