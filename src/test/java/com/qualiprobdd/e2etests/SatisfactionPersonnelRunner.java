package com.qualiprobdd.e2etests;



import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;




	//@RunWith(Cucumber.class)
	@CucumberOptions(
	monochrome =true,
	strict = true,
	features = { "src/specs/features/GRH/SatisfactionPersonnel.feature" },
	plugin = { "json:target/cucumber.json", "junit:target/cucumber.xml",
	"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html" },
	dryRun= false,
	tags= {"@CréationQuestionnairePersonnel or @CréationEnquêtePersonnel or @RéponseEnquêtePersonnel or @EnregistrerRéponseEnquête"}
	)
	//
	public class SatisfactionPersonnelRunner extends AbstractTestNGCucumberTests {
		@Parameters({"language","browsername"}) 
		@BeforeClass
	    public void setup(String language,String browsername) throws Exception { 
			com.qualiprobdd.e2etests.authentification.stepdefs.AuthentificationStepDefinition.lan=language;
			com.qualiprobdd.e2etests.util.Setup.browsername=browsername;
	    } 
		@AfterClass
		public static void writeExtentReport() {
		//	Reporter.loadXMLConfig(new File("resources/configs/extent-config.xml"));

		}	
		
}



