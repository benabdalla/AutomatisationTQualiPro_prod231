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
				plugin = { "json:target/cucumber.json", "junit:target/cucumber.xml"},
				dryRun= false,
			tags = "@CréerFichePNC or @ValiderFichePNC or @DécisionDeTraitement or @DécisionInvestigation or @InvestigationPNC or @ApprobationInvestigationPNC " +
					"or @ValiderDécisionTraitement or  @TraitementPNC or " +
					"@SuiviPNC or @approbationFinale"
	//	tags = {"@CréerFichePNC or @ValiderFichePNC or @DécisionDeTraitement or @DécisionInvestigation"}
		//@CréerFichePNC or @ValiderFichePNC or @DécisionDeTraitement
		//tags = {"@ValiderDécisionTraitement or @CréerFichePNCPlusieursProduitsPlusieursTypesNC"}
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

