
package com.qualiprobdd.e2etests;



import java.io.File;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;



@CucumberOptions(
        strict = true,
        features = { "src/specs/features/Environnement/EvaluationAspects.feature" },
        plugin = {"html:target/cucumber-html-report", "json:target/cucumber.json", "junit:target/cucumber.xml"},
        monochrome =true,
        tags = "@EvaluationAspect",
        //tags= {"@FicheFormation,@RéalisationFormation,@EvaluationAchaud,@EvaluationFormateur,@EvaluationAfroidMono"},
        //",@RéalisationFormation,@EvaluationAchaud,@EvaluationFormateur,@EvaluationAfroidMono"},
        dryRun= false
)



public class EvaluationAspectRunner extends AbstractTestNGCucumberTests {
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

