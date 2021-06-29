package com.qualiprobdd.e2etests;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;



@CucumberOptions(
monochrome =true,
strict = true,
features = { "src/specs/features/Environnement/Incident.feature" }, plugin = {
		"html:target/cucumber-html-report", "json:target/cucumber.json", "junit:target/cucumber.xml"},
dryRun= false,
		//tags= {"@CréationFicheIncident"}
		tags= {"@CréationFicheIncident or @ValidationFicheIncident or @DécisionFicheIncident or @TraitementFicheIncident or @ClotureFicheIncident"}
)

public class IncidentEnvRunner extends AbstractTestNGCucumberTests {
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
