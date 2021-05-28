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

features = { "src/specs/features/Documentation/CreationDocument.feature" }, 
monochrome =true,
plugin = {"html:target/cucumber-html-report", "json:target/cucumber.json", "junit:target/cucumber.xml",
"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html" },
tags = { "@DocumentaionAvecReporting"},
dryRun= false
		
		)

@Test
public class DocumentationReportingRunner extends AbstractTestNGCucumberTests {

	@Parameters({"language"}) 
	@BeforeClass
    public void setup(String language) throws Exception { 
		
		com.qualiprobdd.e2etests.authentification.stepdefs.AuthentificationStepDefinition.lan=language;
    } 
	@AfterClass
	public static void writeExtentReport() {
	//	Reporter.loadXMLConfig(new File("resources/configs/extent-config.xml"));

	}
	}
