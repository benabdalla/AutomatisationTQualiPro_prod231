package com.qualiprobdd.e2etests;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;




    @CucumberOptions(
            monochrome =true,
            strict = true,
            features = { "src/specs/features/Administration/GestionAccés.feature" }, plugin = {
            "html:target/cucumber-html-report", "json:target/cucumber.json",},
            tags = "@AjoutEmployé",
            dryRun= false

    )
    public class EmpRunner extends AbstractTestNGCucumberTests {
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

