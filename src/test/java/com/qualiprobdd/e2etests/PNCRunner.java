package com.qualiprobdd.e2etests;



import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



@CucumberOptions(
				strict = true,
				features = { "src/specs/features/PNC/PNC.feature" }, 
				monochrome =true,
				plugin = { "json:target/cucumber.json", "junit:target/cucumber.xml","com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html" },
				dryRun= false,
			//	tags = {"@Paramétrage,@CréerFichePNC,@ValiderFichePNC,@DécisionInvestigation,@DécisionDeTraitement,@InvestigationPNC,@ApprobationInvestigationPNC,@ValiderDécisionTraitement,@TraitementPNC,@SuiviPNC,@approbationFinale"}
		tags = {"@CréerFichePNC,@ValiderFichePNC,@DécisionDeTraitement,@DécisionInvestigation"}
		//@CréerFichePNC,@ValiderFichePNC,@DécisionDeTraitement
		//tags = {"@ValiderDécisionTraitement,@CréerFichePNCPlusieursProduitsPlusieursTypesNC"}
)

	@Test
	public class PNCRunner extends AbstractTestNGCucumberTests {
	
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

