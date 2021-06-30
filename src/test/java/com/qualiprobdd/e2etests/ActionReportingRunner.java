package com.qualiprobdd.e2etests;

import java.io.File;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



@CucumberOptions(
		strict = true,
		features = { "src/specs/features/moduleAction/Action.feature" },
		monochrome =true,
		plugin = {"html:target/cucumber-html-report", "json:target/cucumber.json", "junit:target/cucumber.xml",
		"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html" },
				tags = "@VerificationBilanAction",
				//@VerificationBilanAction,@ReportingEtatActionParResponsable,@ReportingListeActionRealiseeParPersonne,,@VerificationBilanActionParFiltre
		dryRun= false
		)

@Test
public class ActionReportingRunner extends AbstractTestNGCucumberTests
{
@Parameters({"language"}) 
@BeforeClass
public void setup(String language) throws Exception { 
	com.qualiprobdd.e2etests.authentification.stepdefs.AuthentificationStepDefinition.lan=language;
} 
@AfterClass
public static void writeExtentReport() {
	//Reporter.loadXMLConfig(new File("resources/configs/extent-config.xml"));

}
	

}

