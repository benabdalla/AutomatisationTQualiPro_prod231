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
features = { "src/specs/features/Client/ReclamationClient.feature" },
		plugin = {"html:target/cucumber-html-report", "json:target/cucumber.json", "junit:target/cucumber.xml"},

//tags= {"@Paramétrage or @AjoutReclamationClient or @DecisionInvestigation or @InvestigationRéclamation or @ApprobationInvestigationRéclamation or @Decision or @Traitement or @Suivi or @Approbation"}
		tags= {"@AjoutReclamationClient"}
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

