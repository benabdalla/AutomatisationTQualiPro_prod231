package com.qualiprobdd.e2etests.audit.stepdefs;

import com.qualiprobdd.e2etests.audit.models.RepAuParTypeModel;
import com.qualiprobdd.e2etests.audit.pages.ModuleAuditsPage;
import com.qualiprobdd.e2etests.audit.pages.RepAuParTypePage;
import com.qualiprobdd.e2etests.moduleAction.pages.FicheActionPage;
import com.qualiprobdd.e2etests.util.Common;
import com.qualiprobdd.e2etests.util.Setup;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.HashMap;
import java.util.Map;

public class RepAuParTypeStepDef {


    public WebDriver driver;
    public String numAudit;
    private static Common common = new Common();
    public static String etat = "";
    int row;

    private static String Path = "resources/testData/TestData.xlsx";

    public RepAuParTypeStepDef() {
        driver = Setup.driver;
        PageFactory.initElements(driver, ModuleAuditsPage.class);
        PageFactory.initElements(driver, FicheActionPage.class);
        PageFactory.initElements(driver, RepAuParTypePage.class);
    }


    @Given("consulter reporting Audit par type")
    public void consulter_reporting_Audit_par_type() throws InterruptedException {
        RepAuParTypeModel.consulter_reporting_Audit_par_type(driver);
    }

    @When("^saisir (\\d+) Audit a traiter par type$")
    public void saisir_Audit_a_traiter_par_type(int arg1) throws Throwable {
        row = arg1;


    }

    @When("saisir Type Audit")
    public void saisir_Type_Audit() throws Exception {
        RepAuParTypeModel.saisir_Type_Audit(row);

    }

    @When("saisir Champ d'audit")
    public void saisir_Champ_d_audit() throws Exception {
        RepAuParTypeModel.saisir_Champ_d_audit(row);
    }

    @When("saisir Site")
    public void saisir_Site() throws Exception {
        RepAuParTypeModel.saisir_Site(driver, row);

    }


    @When("Date prévue entre")
    public void date_prévue_entre() throws InterruptedException {
        RepAuParTypeModel.date_prévue_entre(driver);
    }

    @Then("vérifier est reporté")
    public void vérifier_Numero_Audit_est_reporté() throws Exception {

        RepAuParTypeModel.vérifier_Numero_Audit_est_reporté(row);
    }

    @When("saisir Champ d'audit de filter")
    public void saisir_Champ_d_audit_de_filter() throws Exception {
        RepAuParTypeModel.saisir_Champ_d_audit_de_filter(row);
    }

    @When("clique  sur rechercher audit")
    public void clique_sur_rechercher_audit() throws InterruptedException {
        RepAuParTypeModel.clique_sur_rechercher_audit(driver);
    }

    @When("saisir type d'audit de filter")
    public void saisir_type_d_audit_de_filter() throws Exception {
        RepAuParTypeModel.saisir_type_d_audit_de_filter(row);
    }

    @When("recuperer stattistique")
    public void recuperer_stattistique() throws Exception {
        RepAuParTypeModel.recuperer_stattistique(row);
    }


    @When("saisir etat {string} d'audit de filter")
    public void saisir_etat_d_audit_de_filter(String string) {
        RepAuParTypeModel.saisir_etat_d_audit_de_filter(string);

    }


    @When("clique sur valider rep")
    public void clique_sur_valider_rep() throws InterruptedException {
        RepAuParTypeModel.clique_sur_valider_rep(driver);
    }

    @When("consulter reporting de Taux De Charges Par Auditeur")
    public void consulter_reporting_de_Taux_De_Charges_Par_Auditeur() throws InterruptedException {
        RepAuParTypeModel.consulter_reporting_de_Taux_De_Charges_Par_Auditeur(driver);
    }

    @When("saisir Type Audit de taux")
    public void saisir_Type_Audit_de_taux() throws Exception {
        RepAuParTypeModel.saisir_Type_Audit_de_taux(row);
    }

    @When("clique sur valider rep taux")
    public void clique_sur_valider_rep_taux() throws InterruptedException {
        RepAuParTypeModel.clique_sur_valider_rep_taux(driver);
    }


    @Then("vérifier est reporté de  taux")
    public void vérifier_est_reporté_de_taux() throws Exception {
        RepAuParTypeModel.vérifier_est_reporté_de_taux(row);
    }



    @When("consulter reporting de Programme d'Audit")
    public void consulter_reporting_de_Programme_d_Audit() throws InterruptedException {
RepAuParTypeModel.consulter_reporting_de_Programme_d_Audit(driver);
    }

    @When("saisir Type de programme d'audit")
    public void saisir_Type_de_programme_d_audit() throws Exception {
        RepAuParTypeModel.saisir_Type_de_programme_d_audit(row);
    }

    @When("saisir Champ  de programme d'audit")
    public void saisir_Champ_de_programme_d_audit() throws Exception {
        RepAuParTypeModel.saisir_Champ_de_programme_d_audit(row);
    }

    @When("Date prévue entre et  programme d'audit")
    public void date_prévue_entre_et_programme_d_audit() throws InterruptedException {
RepAuParTypeModel.date_prévue_entre_et_programme_d_audit(driver);
    }
    @Then("vérifier est reporté de programme d'audit")
    public void vérifier_est_reporté_de_programme_d_audit() throws Exception {
        RepAuParTypeModel.vérifier_est_reporté_de_programme_d_audit(row);
    }

}
