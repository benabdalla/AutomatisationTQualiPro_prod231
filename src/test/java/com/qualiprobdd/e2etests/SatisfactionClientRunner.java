package com.qualiprobdd.e2etests;

import java.io.File;

import cucumber.api.testng.AbstractTestNGCucumberTests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;

	//@RunWith(Cucumber.class)
	@CucumberOptions(
	monochrome =true,
	strict = true,
	features = { "src/specs/features/Client/SatisfactionClient.feature" },
	plugin = { "json:target/cucumber.json", "junit:target/cucumber.xml",
	"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html" },
	dryRun= false,
	//tags= {"@CréationQuestionnaire,@CréationEnquête,@RéponseEnquête"}
	tags= {"@CréationQuestionnaire"}
	)

public class SatisfactionClientRunner extends AbstractTestNGCucumberTests {
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
