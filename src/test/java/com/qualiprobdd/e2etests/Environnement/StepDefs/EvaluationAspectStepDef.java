package com.qualiprobdd.e2etests.Environnement.StepDefs;


import com.qualiprobdd.e2etests.Environnement.models.EvaluationAspectModel;
import com.qualiprobdd.e2etests.Environnement.pages.EvaluationAspectPage;
import com.qualiprobdd.e2etests.Formation.Pages.FormationPage;
import com.qualiprobdd.e2etests.util.Common;
import com.qualiprobdd.e2etests.util.ExcelUtils;
import com.qualiprobdd.e2etests.util.Setup;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;

public class EvaluationAspectStepDef {

    private Common common = new Common();
    private WebDriver driver;
    static int row=0;

    public EvaluationAspectStepDef() {
    driver = Setup.driver;
        PageFactory.initElements(driver, EvaluationAspectPage.class);

    }


    @When("^Lire Données Aspect (\\d+) depuis Excel$")
    public void lire_Données_Aspect_depuis_Excel(int arg1) throws Throwable{
        row=arg1;
    System.out.println("ligne= "+row);}


    @When("Consulter Sous Module Aspects")
    public void consulter_Sous_Module_Aspects() throws Throwable {

        EvaluationAspectModel.consulter_Sous_Module_Aspects(driver);

    }

    @When("Consulter Sous Module Evaluation des aspects")
    public void consulter_Sous_Module_Evaluation_des_aspects() throws Throwable  {
        EvaluationAspectModel.consulter_Sous_Module_Evaluation_des_aspects(driver);
    }

    @When("Cliquer sur ajouter Evaluation aspect")
    public void cliquer_sur_ajouter_Evaluation_aspect() throws Throwable {
        EvaluationAspectModel.cliquer_sur_ajouter_Evaluation_aspect();

    }

    @When("Sélectionner Aspect EVALUATION")
    public void sélectionner_Aspect_EVALUATION() throws Throwable {
        EvaluationAspectModel.sélectionner_Aspect_EVALUATION(row);

    }

    @When("Sélectionner Facteur")
    public void sélectionner_Facteur() throws Throwable {
        EvaluationAspectModel.sélectionner_Facteur (row);
    }

    @When("Sélectionner Lieu")
    public void sélectionner_Lieu() throws Throwable {
        EvaluationAspectModel.sélectionner_Lieu (row);
    }

    @When("Sélectionner condition")
    public void sélectionner_condition () throws Throwable {
        EvaluationAspectModel.sélectionner_condition(row);
    }

    @When("cliquer sur valider Evaluation aspect")
    public void cliquer_sur_valider_Evaluation_aspect() throws Exception {
        EvaluationAspectModel.cliquer_sur_valider_Evaluation_aspect (row);

    }

    @Then("Vérifier Evaluation aspect ajouté")
    public void vérifier_Evaluation_aspect_ajouté() throws Throwable {
        EvaluationAspectModel.vérifier_Evaluation_aspect_ajouté (row);

    }

}
