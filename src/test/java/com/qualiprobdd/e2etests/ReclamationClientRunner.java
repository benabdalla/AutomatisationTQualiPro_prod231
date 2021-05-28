package com.qualiprobdd.e2etests;



import java.io.File;
import cucumber.api.testng.AbstractTestNGCucumberTests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
//import cucumber.api.junit.Cucumber;

//@RunWith(Cucumber.class)
@CucumberOptions(
monochrome =true,
strict = true,
features = { "src/specs/features/Client/ReclamationClient.feature" },
plugin = { "json:target/cucumber.json", "junit:target/cucumber.xml",
"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html" },
dryRun= false,
tags= {"@AjoutReclamationClient,@DecisionInvestigation,@InvestigationRéclamation,@ApprobationInvestigationRéclamation,@Decision,@Traitement,@Suivi,@Approbation"}
		//tags= {"@Paramétrage,@AjoutReclamationClient"}
		//tags= {"@Approbation"}
)
public class ReclamationClientRunner extends AbstractTestNGCucumberTests {
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

