package com.qualiprobdd.e2etests;





import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;





@CucumberOptions( features = { "src/specs/features/Documentation/CreationDocPlusieursResponsables.feature" }, plugin = {
		"html:target/cucumber-html-report", "json:target/cucumber.json", "junit:target/cucumber.xml" },
		tags = "@DocumentationPlusieurResp")
@Test
public class DocPlusieursResponsablesRunner extends AbstractTestNGCucumberTests {

	@Parameters({"language","browsername"}) 
	@BeforeClass
    public void setup(String language,String browsername) throws Exception { 
		com.qualiprobdd.e2etests.authentification.stepdefs.AuthentificationStepDefinition.lan=language;
		com.qualiprobdd.e2etests.util.Setup.browsername=browsername;
    } 
}
