package com.qualiprobdd.e2etests;


import cucumber.api.CucumberOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.cucumber.listener.Reporter;

import cucumber.api.testng.AbstractTestNGCucumberTests;

import java.io.File;


@CucumberOptions(

        strict = true,
        features = { "src/specs/features/indicateur/IndecateurFormule.feature" },
        monochrome =true,
        plugin = {"html:target/cucumber-html-report", "json:target/cucumber.json"
               },
        dryRun= false,
        tags = "@EnregistrmentIndicateur"
                //",@SUIVIIndicateurFormule"
        )
//tags = { "@EnregistrmentIndicateur,@SUIVIIndicateurQualipro" })
//tags = { "@EnregistrmentIndicateur,@SUIVIIndicateurManuel,@SUIVIIndicateurQualipro,@SUIVIIndicateurFormule" })

@Test
public class IndicateurFormuleRunner extends AbstractTestNGCucumberTests {
    @Parameters({"language", "browsername"})
    @BeforeClass
    public void setup(String language, String browsername) throws Exception {
        com.qualiprobdd.e2etests.authentification.stepdefs.AuthentificationStepDefinition.lan = language;
        com.qualiprobdd.e2etests.util.Setup.browsername = browsername;
    }

    @AfterClass
    public static void writeExtentReport() {
       // Reporter.loadXMLConfig(new File("resources/configs/extent-config.xml"));

    }
}