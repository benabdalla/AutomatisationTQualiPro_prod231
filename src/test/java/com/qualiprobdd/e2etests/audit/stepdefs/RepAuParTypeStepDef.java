package com.qualiprobdd.e2etests.audit.stepdefs;

import com.qualiprobdd.e2etests.audit.models.RepAuParTypeModel;
import com.qualiprobdd.e2etests.audit.pages.ModuleAuditsPage;
import com.qualiprobdd.e2etests.moduleAction.pages.FicheActionPage;
import com.qualiprobdd.e2etests.util.Common;
import com.qualiprobdd.e2etests.util.Setup;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class RepAuParTypeStepDef {



    public WebDriver driver;
    public String numAudit;
    private static Common common = new Common();
    public static String etat = "";
    int row;
    private static String Path = "resources/testData/TestData.xlsx";

    public  RepAuParTypeStepDef(){
    driver = Setup.driver;
        PageFactory.initElements(driver, ModuleAuditsPage .class);
        PageFactory.initElements(driver, FicheActionPage .class);
    }


    @Given("consulter reporting Audit par type")
    public void consulter_reporting_Audit_par_type() throws InterruptedException {
        RepAuParTypeModel.consulter_reporting_Audit_par_type(driver);
    }

    @When("saisir Type Audit")
    public void saisir_Type_Audit() {
RepAuParTypeModel.saisir_Type_Audit();

    }

    @When("saisir Champ d'audit")
    public void saisir_Champ_d_audit() {
        RepAuParTypeModel.saisir_Champ_d_audit();
    }

    @When("saisir Site")
    public void saisir_Site() {
        RepAuParTypeModel.saisir_Site();

    }

    @When("saisir Activité")
    public void saisir_Activité() {
RepAuParTypeModel.saisir_Activité();
    }

    @When("saisir Direction")
    public void saisir_Direction() {
        RepAuParTypeModel.saisir_Direction();
    }

    @When("Date prévue entre")
    public void date_prévue_entre() {
        RepAuParTypeModel.date_prévue_entre();
    }

    @Then("vérifier <Numero Audit> est reporté")
    public void vérifier_Numero_Audit_est_reporté() {

        RepAuParTypeModel.vérifier_Numero_Audit_est_reporté();
    }
}
