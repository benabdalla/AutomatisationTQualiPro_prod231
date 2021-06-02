package com.qualiprobdd.e2etests.Administration.SteDefs;

import com.qualiprobdd.e2etests.Administration.Models.GestionAccesModel;
import com.qualiprobdd.e2etests.Administration.Pages.GestionAccesPage;
import com.qualiprobdd.e2etests.Formation.Pages.DemandeFormationPage;
import com.qualiprobdd.e2etests.audit.pages.ModuleAuditsPage;
import com.qualiprobdd.e2etests.moduleAction.pages.FicheActionPage;
import com.qualiprobdd.e2etests.util.Common;
import com.qualiprobdd.e2etests.util.Setup;
import io.cucumber.java.en.*;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class GestionAccesStepDef {

    public WebDriver driver;
    public String numAudit;
    private static Common common = new Common();
    public static String etat = "";

    private static String Path = "resources/testData/TestData.xlsx";
public  GestionAccesStepDef(){
    driver = Setup.driver;
    PageFactory.initElements(driver, GestionAccesPage.class);
    PageFactory.initElements(driver,  DemandeFormationPage.class);
}

public   static   int  emp=0;

    @When("^consulter sous module Employés$")
    public void consulter_sous_module_Employés() throws Throwable {
        Thread.sleep(1000);
        //DemandeFormationPage.MenuID.click();
        //added by rahma
        JavascriptExecutor  executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click()", DemandeFormationPage.MenuID);
        Thread.sleep(1000);
        Common.AccéderModule(12,0,0,driver);
        Thread.sleep(200);
        Common.AccéderModule(12,1,1,driver);
        Thread.sleep(200);

    }



    @When("^cliquer sur ajouter fiche employé$")
    public void cliquer_sur_ajouter_fiche_employé() throws Throwable {
        GestionAccesModel.cliquer_sur_ajouter_fiche_employé();

    }

    @When("^saisir matricule (\\d+)$")
    public void saisir_matricule(int arg1) throws Throwable {
        emp=arg1;
    GestionAccesModel.saisir_matricule(emp);

    }

    @When("^saisir NomPrenom Employé$")
    public void saisir_NomPrenom_Employé() throws Throwable {
        GestionAccesModel.saisir_NomPrenom_Employé(emp);

    }

    @When("^cliquer sur valider matricule$")
    public void cliquer_sur_valider_matricule() throws Throwable {
        GestionAccesModel.cliquer_sur_valider_matricule(driver);

    }

    @When("^saisir date de naissance$")
    public void saisir_date_de_naissance() throws Throwable {
        GestionAccesModel.saisir_date_de_naissance(driver);

    }

    @When("^saisir N°CIN$")
    public void saisir_N_CIN() throws Throwable {
        GestionAccesModel.saisir_N_CIN();

    }

    @When("^saisir date dexpiration$")
    public void saisir_date_dexpiration() throws Throwable {
        GestionAccesModel.saisir_date_dexpiration();

    }

    @When("^saisir date de recrutement$")
    public void saisir_date_de_recrutement() throws Throwable {
        GestionAccesModel.saisir_date_de_recrutement(driver);
    }

    @When("^choisir Site employe$")
    public void choisir_Site_employe() throws Throwable {
        GestionAccesModel.choisir_Site_employe();
    }

    @When("^choisir Processus employe$")
    public void choisir_Processus_employe() throws Throwable {
        GestionAccesModel.choisir_Processus_employe();
    }

    @When("^Choisir Activite employe$")
    public void choisir_Activite_employe() throws Throwable {
        GestionAccesModel.choisir_Activite_employe();
    }

    @When("^Choisir Direction employe$")
    public void choisir_Direction_employe() throws Throwable {
        GestionAccesModel.choisir_Direction_employe();
    }

    @When("^Choisir saisir Service employe$")
    public void choisir_saisir_Service_employe() throws Throwable {
        GestionAccesModel.choisir_saisir_Service_employe();
    }

    @When("^saisir telephone$")
    public void saisir_telephone() throws Throwable {
        GestionAccesModel.saisir_telephone();
    }

    @When("^Choisir Etat civil$")
    public void choisir_Etat_civil() throws Throwable {
        GestionAccesModel.choisir_Etat_civil();
    }

    @When("^Choisir sexe$")
    public void choisir_sexe() throws Throwable {
        GestionAccesModel.choisir_sexe();
    }

    @When("^saisir Adresse Mail$")
    public void saisir_Adresse_Mail() throws Throwable {
        GestionAccesModel.saisir_Adresse_Mail();
    }

    @When("^saisir Formation initiale$")
    public void saisir_Formation_initiale() throws Throwable {
        GestionAccesModel.saisir_Formation_initiale();
    }

    @When("^saisir Grade$")
    public void saisir_Grade() throws Throwable {
        GestionAccesModel.saisir_Grade();
    }

    @When("^Saisir titre$")
    public void saisir_titre() throws Throwable {
        GestionAccesModel. saisir_titre();}

    @When("^Choisir type de travail$")
    public void choisir_type_de_travail() throws Throwable {
        GestionAccesModel.choisir_type_de_travail();
    }

    @When("^Ajouter une fonction$")
    public void ajouter_une_fonction() throws Throwable {
        GestionAccesModel.ajouter_une_fonction(driver);
    }
    @When("^Paramétrage employé$")
    public void Paramétrage_employé() throws Throwable {
        GestionAccesModel.Paramétrage_employé(driver);
    }

    @When("^ajouter group de travail de employé$")
    public void ajouter_group_de_travail_de_employé() throws Throwable {
        GestionAccesModel.ajouter_group_de_travail_de_employé(driver);
    }
    @When("^Valider fiche Employé$")
    public void valider_fiche_Employé() throws Throwable {
        GestionAccesModel.valider_fiche_Employé(emp,driver);
    }

    @When("^Consulter menu Administration$")
    public void consulter_menu_Administration() throws Throwable {
        GestionAccesModel.consulter_menu_Administration();
    }

    @When("^consulter sous menu Gestion des droits d'accés$")
    public void consulter_sous_menu_Gestion_des_droits_d_accés() throws Throwable {
        GestionAccesModel.consulter_sous_menu_Gestion_des_droits_d_accés();
    }

    @When("^cliquer sur Employé$")
    public void cliquer_sur_Employé() throws Throwable {
        GestionAccesModel.cliquer_sur_Employé();
    }

    @When("^cliquer sur rechercher employe$")
    public void cliquer_sur_rechercher_employe() throws Throwable {
        GestionAccesModel.cliquer_sur_rechercher_employe();
    }

    @When("^selectionner employe$")
    public void selectionner_employe() throws Throwable {
        GestionAccesModel.selectionner_employe();
    }

    @When("^choisir action$")
    public void choisir_action() throws Throwable {
        GestionAccesModel.choisir_action();

    }

    @When("^ajouter ajout$")
    public void ajouter_ajout() throws Throwable {
        GestionAccesModel.ajouter_ajout();
    }

    @When("^valider affectation acces$")
    public void valider_affectation_acces() throws Throwable {
        GestionAccesModel.valider_affectation_acces();
    }




}
