package com.qualiprobdd.e2etests;



	import java.io.File;

	import cucumber.api.testng.AbstractTestNGCucumberTests;
	import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;


	@CucumberOptions(
					strict = true,
					features = { "src/specs/features/Formation/Formation.feature" }, 
					plugin = {"html:target/cucumber-html-report", "json:target/cucumber.json", "junit:target/cucumber.xml",
					"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html" },
					monochrome =true,
					tags= {"@FicheFormation,@RéalisationFormation,@EvaluationAchaud,@EvaluationFormateur,@EvaluationAfroidMono"},
							//",@RéalisationFormation,@EvaluationAchaud,@EvaluationFormateur,@EvaluationAfroidMono"},
					dryRun= false
	)



	public class FormationRunner extends AbstractTestNGCucumberTests {
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
