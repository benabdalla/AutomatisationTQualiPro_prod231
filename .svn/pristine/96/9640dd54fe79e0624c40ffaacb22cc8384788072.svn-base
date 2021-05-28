package com.qualiprobdd.e2etests;
import java.io.File;

import com.qualiprobdd.e2etests.util.Setup;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.cucumber.listener.Reporter;

@CucumberOptions(
		strict = true,

		features = { "src/specs/features/Agenda/SommeAgenda.feature" }, 
		monochrome =true,
		plugin = {"html:target/cucumber-html-report", "json:target/cucumber.json", "junit:target/cucumber.xml",
	 },
				tags = "@SommeAgenda",
		dryRun= false
		)

@Test
public class SommeAgendaRunner extends AbstractTestNGCucumberTests {
	@Parameters({"language", "browsername"})
	@BeforeClass
	public void setup(String language, String browsername) throws Exception {
		com.qualiprobdd.e2etests.authentification.stepdefs.AuthentificationStepDefinition.lan = language;
		com.qualiprobdd.e2etests.util.Setup.browsername = browsername;
	}

	@AfterClass
	public static void writeExtentReport() {
	//	Reporter.loadXMLConfig(new File("resources/configs/extent-config.xml"));

	}
}


	

