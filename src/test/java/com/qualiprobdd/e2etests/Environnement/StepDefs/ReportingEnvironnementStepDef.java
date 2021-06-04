package com.qualiprobdd.e2etests.Environnement.StepDefs;

import com.qualiprobdd.e2etests.Environnement.models.ReportingEnvironnementModel;
import com.qualiprobdd.e2etests.Environnement.pages.ReportingEnvironnementPage;
import com.qualiprobdd.e2etests.agenda.Page.PageSommerAgenda;
import com.qualiprobdd.e2etests.moduleAction.pages.FicheActionPage;
import com.qualiprobdd.e2etests.util.Common;
import com.qualiprobdd.e2etests.util.Setup;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class ReportingEnvironnementStepDef {
    public WebDriver driver;
    private static String Path = "resources/testData/TestData.xlsx";


    private Common common = new Common();
    public ReportingEnvironnementStepDef() {
        driver = Setup.driver;
        PageFactory.initElements(driver, FicheActionPage.class);
        PageFactory.initElements(driver, ReportingEnvironnementPage.class);

    }

    @When("Consulter Reporting Environnement")
    public void consulter_Reporting_Environnement() throws Throwable {

        ReportingEnvironnementModel.consulter_Reporting_Environnement(driver);


    }

    @When("Cliquer sur Etat Aspect")
    public void cliquer_sur_Etat_Aspect() {

    }

    @When("Sélectionner Aspect")
    public void sélectionner_Aspect() {

    }


    @When("sélectionner site")
    public void sélectionner_site() {

    }

    @When("sélectionner facteur")
    public void sélectionner_facteur() {

    }

    @When("saisir date")
    public void saisir_date() {

    }

    @When("Sélectionner score")
    public void sélectionner_score() {

    }

    @When("cliquer sur le bouton radio tous")
    public void cliquer_sur_le_bouton_radio_tous() {

    }

    @When("cliquer sur le bouton valider")
    public void cliquer_sur_le_bouton_valider() {

    }

    @Then("vérifier le filtre tous")
    public void vérifier_le_filtre_tous() {

    }
}
