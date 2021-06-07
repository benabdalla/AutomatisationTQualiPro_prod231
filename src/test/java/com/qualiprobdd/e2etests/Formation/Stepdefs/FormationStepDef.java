package com.qualiprobdd.e2etests.Formation.Stepdefs;

import java.util.concurrent.TimeUnit;


import com.qualiprobdd.e2etests.Formation.Models.FormationModel;
import com.qualiprobdd.e2etests.Formation.Pages.FormationPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import org.openqa.selenium.NoSuchElementException;

import com.qualiprobdd.e2etests.Formation.Models.DemandeFormationModel;

import com.qualiprobdd.e2etests.util.Common;
import com.qualiprobdd.e2etests.util.ExcelUtils;
import com.qualiprobdd.e2etests.util.Setup;


public class FormationStepDef {
    public WebDriver driver;
    private static String Path = "resources/testData/TestData.xlsx";
    boolean Eval_Formateur;
    static int row;

    public FormationStepDef() {
        driver = Setup.driver;
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        PageFactory.initElements(driver, FormationPage.class);
    }
    //développe_par_FATMA_CHAOUACHI


    @When("^consulter sous module Types de thèmes$")
    public void consulter_sous_module_Types_de_thèmes() throws Throwable {
        FormationModel.consulter_sous_module_Types_de_thèmes(driver);

    }

    @When("^cliquer sur ajouter Types de thèmes$")
    public void cliquer_sur_ajouter_Types_de_thèmes() throws Throwable {
        FormationModel.cliquer_sur_ajouter_Types_de_thèmes(driver);

    }

    @When("^saisir un Type de thème$")
    public void saisir_un_Type_de_thème() throws Throwable {
        FormationModel.saisir_un_Type_de_thème(row);

    }

    @When("^cliquer sur valider10$")
    public void cliquer_sur_valider10() throws Throwable {
        FormationModel.cliquer_sur_valider10(driver);

    }

    @Then("^vérifier Type de thème ajouté$")
    public void vérifier_Type_de_thème_ajouté() throws Throwable {
        FormationModel.vérifier_Type_de_thème_ajouté(row);
    }

    //************************************************************
    @When("^consulter sous module Types de formation$")
    public void consulter_sous_module_Types_de_formation() throws Throwable {
        FormationModel.consulter_sous_module_Types_de_formation(driver);
    }

    @When("^cliquer sur ajouter Types de formation$")
    public void cliquer_sur_ajouter_Types_de_formation() throws Throwable {
        FormationModel.cliquer_sur_ajouter_Types_de_formation(driver);
    }

    @When("^saisir un Type de formation$")
    public void saisir_un_Type_de_formation() throws Throwable {
        FormationModel.saisir_un_Type_de_formation(row);
    }

    @When("^cliquer sur le bouton radio Avec évaluation à chaud$")
    public void cliquer_sur_le_bouton_radio_Avec_évaluation_à_chaud() throws Throwable {
        FormationModel.cliquer_sur_le_bouton_radio_Avec_évaluation_à_chaud(driver);
    }

    @When("^cliquer sur valider Types de formation$")
    public void cliquer_sur_valider_Types_de_formation() throws Throwable {
        FormationModel.cliquer_sur_valider_Types_de_formation(driver);
    }

    @When("^consulter sous module Sociétés$")
    public void consulter_sous_module_Sociétés() throws Throwable {
        FormationModel.consulter_sous_module_Sociétés(driver);
    }

    @When("^cliquer sur ajouter une Société$")
    public void cliquer_sur_ajouter_une_Société() throws Throwable {
        FormationModel.cliquer_sur_ajouter_une_Société();
    }

    @When("^saisir une Société$")
    public void saisir_une_Société() throws Throwable {
        FormationModel.saisir_une_Société(row);
    }

    @When("^cliquer sur valider Société$")
    public void cliquer_sur_valider_Société() throws Throwable {
        FormationModel.cliquer_sur_valider_Société();
    }

    @Then("^vérifier une Société ajoutée$")
    public void vérifier_une_Société_ajoutée() throws Throwable {
        FormationModel.vérifier_une_Société_ajoutée(row);
    }

    //**********************************************************
    @When("^consulter sous module type de critère d'évaluation$")
    public void consulter_sous_module_type_de_critère_d_évaluation() throws Throwable {
        FormationModel.consulter_sous_module_type_de_critère_d_évaluation(driver);
    }

    @When("^cliquer sur ajouter  type de critère d'évaluation$")
    public void cliquer_sur_ajouter_type_de_critère_d_évaluation() throws Throwable {
        // Write code here that turns the phrase above into concrete actions


        FormationModel.cliquer_sur_ajouter_type_de_critère_d_évaluation();
    }

    @When("^saisir type de critère d'évaluation$")
    public void saisir_type_de_critère_d_évaluation() throws Throwable {
        FormationModel.saisir_type_de_critère_d_évaluation(row);
    }


    @When("^cliquer sur valider type de critère d'évaluation$")
    public void cliquer_sur_valider_type_de_critère_d_évaluation() throws Throwable {
        FormationModel.cliquer_sur_valider_type_de_critère_d_évaluation();
    }

    @Then("^vérifier type de critère d'évaluation ajoutée$")
    public void vérifier_type_de_critère_d_évaluation_ajoutée() throws Throwable {
        FormationModel.vérifier_type_de_critère_d_évaluation_ajoutée(row);
    }

    @When("^consulter sous module thèmes de formation$")
    public void consulter_sous_module_thèmes_de_formation() throws Throwable {
        FormationModel.consulter_sous_module_thèmes_de_formation(driver);

    }

    @When("^cliquer sur ajouter  thèmes de formation$")
    public void cliquer_sur_ajouter_thèmes_de_formation() throws Throwable {
        FormationModel.cliquer_sur_ajouter_thèmes_de_formation();
    }

    @When("^saisir thèmes de formation$")
    public void saisir_thèmes_de_formation() throws Throwable {
        FormationModel.saisir_thèmes_de_formation(row);
    }

    @When("^choisir un type de Thème$")
    public void choisir_un_type_de_Thème() throws Throwable {
        FormationModel.choisir_un_type_de_Thème(row);
    }

    @When("^cliquer sur valider thèmes de formation$")
    public void cliquer_sur_valider_thèmes_de_formation() throws Throwable {
        FormationModel.cliquer_sur_valider_thèmes_de_formation();
    }

    @Then("^vérifier thèmes de formation ajoutée$")
    public void vérifier_thèmes_de_formation_ajoutée() throws Throwable {
        FormationModel.vérifier_thèmes_de_formation_ajoutée(row);
    }


    @When("^consulter sous module Organisme$")
    public void consulter_sous_module_Organisme() throws Throwable {
        FormationModel.consulter_sous_module_Organisme(driver);
    }

    @When("^cliquer sur ajouter  Organisme de Formation$")
    public void cliquer_sur_ajouter_Organisme_de_Formation() throws Throwable {


        FormationModel.cliquer_sur_ajouter_Organisme_de_Formation();
    }

    @When("^saisir Organisme de Formation$")
    public void saisir_Organisme_de_Formation() throws Throwable {
        FormationModel.saisir_Organisme_de_Formation(row);
    }

    @When("^cliquer sur valider Organisme de Formation$")
    public void cliquer_sur_valider_Organisme_de_Formation() throws Throwable {
        FormationModel.cliquer_sur_valider_Organisme_de_Formation();
    }


    @Then("^vérifier Organisme de Formation ajoutée$")
    public void vérifier_Organisme_de_Formation_ajoutée() throws Throwable {
        FormationModel.vérifier_Organisme_de_Formation_ajoutée(row);
    }


    //Fin_dev_par_FATMA_CHAOUACHI

    @When("^cliquer sur paramétrage formation$")
    public void cliquer_sur_paramétrage_formation() throws Throwable {
        FormationModel.cliquer_sur_paramétrage_formation(driver);
    }

    @Then("^choisir type évaluation à chaud$")
    public void choisir_type_évaluation_à_chaud() throws Throwable {
        FormationModel.choisir_une_évaluation_à_chaud(driver);
    }

    @When("^consulter filtre formation$")
    public void consulter_filtre_demande_de_formation() throws Throwable {
        //Actions action = new Actions(driver);
        //action.moveToElement(FormationPage.SSMForID).perform();
        FormationModel.consulter_SSM_Formation(driver);
    }

    @When("^cliquer sur ajouter fiche formation$")
    public void cliquer_sur_ajouter_fiche_formation() throws Throwable {
        FormationModel.Ajouter_formation(driver);
        Common.Exporter_visibilité("Nouvelle Fiche Formation");
        Common.Exporter_champ_A_masquer("Nouvelle Fiche Formation");
    }

    @When("^saisir code (\\d+) a traiter$")
    public void saisir_code_a_traiter(int arg1) throws Throwable {
        row = arg1;
    }

    @When("^choisir theme formation$")
    public void choisir_theme_formation() throws Throwable {
        ExcelUtils.setExcelFile(Path, "Formation");
        String theme = ExcelUtils.getCellData(row, 2);
        FormationModel.choisir_theme(theme, driver);
    }

    @When("^choisir theme formation aleatoire$")
    public void choisir_theme_formation_aleatoire() throws Throwable {
        FormationModel.choisir_theme();
    }

    @When("^Saisir detail$")
    public void saisir_detail() throws Throwable {
        FormationModel.ajouter_details(driver);
    }

    @When("^Choisir organisme formation$")
    public void choisir_organisme_formation() throws Throwable {
        ExcelUtils.setExcelFile(Path, "Formation");
        FormationModel.Choisir_organisme(ExcelUtils.getCellData(row, 7));
    }

    @When("^saisir objectif de formation$")
    public void saisir_objectif_de_formation() throws Throwable {
        FormationModel.saisir_objectifs(driver);
    }

    @When("^Choisir le type de formation$")
    public void choisir_le_type_de_formation() throws Throwable {
        ExcelUtils.setExcelFile(Path, "Formation");
        FormationModel.Choisir_type_formation(ExcelUtils.getCellData(row, 3));
    }

    @When("^choisir type formateur$")
    public void choisir_type_formateur() throws Throwable {
        ExcelUtils.setExcelFile(Path, "Formation");
        FormationModel.choisir_type_formateur(ExcelUtils.getCellData(row, 4), driver);
    }

    @When("^Choisir le Formateur$")
    public void choisir_le_Formateur() throws Throwable {
        ExcelUtils.setExcelFile(Path, "Formation");
        FormationModel.Choisir_Formateur(ExcelUtils.getCellData(row, 5), ExcelUtils.getCellData(row, 4));
    }

    @When("^saisir le cout formation$")
    public void saisir_le_cout_formation() throws Throwable {
        FormationModel.saisir_cout();
    }

    @When("^saisir le restourne formation$")
    public void saisir_le_restourne_formation() throws Throwable {
        FormationModel.saisir_restourne();
    }

    @When("^saisir le lieu formation$")
    public void saisir_le_lieu_formation() throws Throwable {
        FormationModel.saisir_lieu();
    }

    @When("^choisir societé formation$")
    public void choisir_societé_formation() throws Throwable {
        ExcelUtils.setExcelFile(Path, "Formation");
        FormationModel.choisir_societe(ExcelUtils.getCellData(row, 6));
    }

    @When("^choisir le site formation$")
    public void choisir_le_site_formation() throws Throwable {
        ExcelUtils.setExcelFile(Path, "Formation");
        DemandeFormationModel.choisir_site(ExcelUtils.getCellData(row, 0), driver);
    }

    @When("^choisir le processus formation$")
    public void choisir_le_processus_formation() throws Throwable {
        ExcelUtils.setExcelFile(Path, "Formation");
        DemandeFormationModel.choisir_processus(ExcelUtils.getCellData(row, 1), driver);
    }

    @When("^choisir l’activité formation$")
    public void choisir_l_activité_formation() throws Throwable {
        DemandeFormationModel.choisir_activite(driver);
    }

    @When("^choisir la direction formation$")
    public void choisir_la_direction_formation() throws Throwable {
        try {
            FormationPage.DirID.isDisplayed();
            Common.Exporter_visibilité("la direction est visible");
            Select select = new Select(FormationPage.DirID);
            select.selectByVisibleText("DIRECTION AUTO");
            String text = driver.findElement(By.id("ctl00_ContentPlaceHolder1_LabelDirPilot")).getText();
            if (text.indexOf('*') != -1) {
                Common.Exporter_visibilité("la direction est obligatoire");
            } else {
                Common.Exporter_visibilité("la direction n'est pas obligatoire");

            }

        } catch (NoSuchElementException e) {
            Common.Exporter_visibilité("la direction est invisible");
        }

    }

    @When("^choisir le service formation$")
    public void choisir_le_service_formation() throws Throwable {
        DemandeFormationModel.choisir_service(driver);
    }

    @When("^saisir N formation interne$")
    public void saisir_N_formation_interne() throws Throwable {
        FormationModel.saisir_Num_interne();
    }

    @When("^sélectionner evaluation par formateur$")
    public void sélectionner_evaluation_par_formateur() throws Throwable {
        ExcelUtils.setExcelFile(Path, "Formation");
        FormationModel.sélectionner_evaluation_formateur(ExcelUtils.getCellData(row, 8), driver, ExcelUtils.getCellData(row, 12));

    }

    @When("^ajouter participant$")
    public void ajouter_participant() throws Throwable {

        FormationModel.ajouter_participant(driver);
    }

    @When("^ajouter group de travail$")
    public void ajouter_group_de_travail() throws Throwable {

        Actions action = new Actions(driver);
        action.moveToElement(FormationPage.AjtGrpID).perform();
        ExcelUtils.setExcelFile(Path, "Formation");
        String Group1 = ExcelUtils.getCellData(row, 9);
        FormationModel.ajouter_group(Group1, driver);
    }

    @When("^Choisir le responsable de suivi efficacité$")
    public void Choisir_le_responsable_de_suivi_efficacité() throws Throwable {
        ExcelUtils.setExcelFile(Path, "Formation");
        FormationModel.Choisir_responsable_suivi(ExcelUtils.getCellData(row, 10), driver, ExcelUtils.getCellData(row, 13));
    }

    @When("^valider fiche formation$")
    public void valider_fiche_formation() throws Throwable {
        FormationModel.valider_fiche_formation(driver);
    }

    @Then("^vérifier fiche formation ajoutée$")
    public void vérifier_fiche_formation_ajoutée() throws Throwable {
        Actions action = new Actions(driver);
        action.moveToElement(FormationPage.NumFormationID).perform();
        ExcelUtils.setExcelFile(Path, "Formation");
        ExcelUtils.setCellData1(FormationPage.NumFormationID.getText(), row, 11, Path);
        Common.Exporter_visibilité("Fiche formaton:" + FormationPage.NumFormationID);
        Common.Exporter_champ_A_masquer("Fiche formation: " + FormationPage.NumFormationID);
        FormationModel.verifier_formation();
        Common.Exporter_numFiche("Fiche formation: " + FormationPage.NumFormationID.getText());
    }

    @When("^consulter la (\\d+) souhaitée$")
    public void consulter_la_souhaitée(int arg1) throws Throwable {
        ExcelUtils.setExcelFile(Path, "Formation");
        String Nfiche = ExcelUtils.getCellData(arg1, 11);
        FormationModel.Consulter_Fiche(Nfiche, driver);
    }

    @When("^cliquer sur editer les participants$")
    public void cliquer_sur_editer_les_participants() throws Throwable {
        FormationModel.cliquer_Editer_Participation(driver);
    }

    @When("^confirmer l’assistance des participants$")
    public void confirmer_l_assistance_des_participants() throws Throwable {
        FormationModel.Editer_Participation(driver);
    }

    @When("^valider la confirmation$")
    public void valider_la_confirmation() throws Throwable {
        FormationModel.Valider_Editer_Participation(driver);
    }

    @Then("^Vérifier la partie réalisation de la fiche formation est validée$")
    public void vérifier_la_partie_réalisation_de_la_fiche_formation_est_validée() throws Throwable {
        FormationModel.Vérifier_réalisation(driver);
    }

    @When("^Connecter en tant que \"([^\"]*)\"$")
    public void connecter_en_tant_que(String arg1) throws Throwable {
        FormationModel.Connecter_en_tant_que(arg1, driver);
    }

    @When("^accéder agenda formation à chaud$")
    public void accéder_agenda_formation_à_chaud() throws Throwable {
        FormationModel.acceder_agenda_evaluation_chaud(driver);
    }

    @When("^choisir (\\d+) a évaluer$")
    public void choisir_a_évaluer(int arg1) throws Throwable {
        ExcelUtils.setExcelFile(Path, "Formation");
        String Nfiche = ExcelUtils.getCellData(arg1, 11);
        System.out.println("fich ===> " + Nfiche);
        Thread.sleep(800);
        FormationModel.choisir_fiche_a_evaluer(Nfiche, driver);
    }

    @When("^saisir les notes d’evaluation$")
    public void saisir_les_notes_d_evaluation() throws Throwable {
        Thread.sleep(800);
        FormationModel.saisir_notes_evaluation();
    }

    @When("^saisir un commentaire évaluation$")
    public void saisir_un_commentaire_évaluation() throws Throwable {
        FormationModel.saisir_commentaire_participant();
    }

    @When("^saisir suggestion si besoin$")
    public void saisir_suggestion_si_besoin() throws Throwable {
        FormationModel.saisir_suggestion_participant();
    }

    @When("^valider evaluation à chaud$")
    public void valider_evaluation_à_chaud() throws Throwable {
        FormationModel.valider_evaluation_participant(driver);
    }

    @When("^Connecter en tant que formateur de (\\d+)$")
    public void connecter_en_tant_que_formateur_de(int arg1) throws Throwable {

        ExcelUtils.setExcelFile(Path, "Formation");
        String type_for = ExcelUtils.getCellData(arg1, 4);
        if (type_for.equals("Formateur interne") || type_for.equals("Internal Trainer")) {
            ExcelUtils.setExcelFile(Path, "Formation");
            String Formateur1 = ExcelUtils.getCellData(arg1, 5);
            System.out.println("formateur" + Formateur1);
            FormationModel.Connecter_en_tant_que(Formateur1, driver);
        } else {
            ExcelUtils.setExcelFile(Path, "Formation");
            String Personne_hab = ExcelUtils.getCellData(arg1, 12);
            FormationModel.Connecter_en_tant_que(Personne_hab, driver);
        }
    }

    @When("^accéder agenda evaluation en tant que formateur de (\\d+)$")
    public void accéder_agenda_evaluation_en_tant_que_formateur(int arg1) throws Throwable {
        ExcelUtils.setExcelFile(Path, "Formation");
        String typeval_for = ExcelUtils.getCellData(arg1, 8);
        if (typeval_for.equals("OUI")) {
            Eval_Formateur = true;
            ExcelUtils.setExcelFile(Path, "Formation");
            String NumFich = ExcelUtils.getCellData(arg1, 11);
            FormationModel.acceder_agenda_formateur(NumFich, driver);
        } else {
            Eval_Formateur = false;
            System.out.println("Cette Formation est sans Evaluation par formateur");
        }
    }

    @When("^cliquer editer pour intégrer les notes$")
    public void cliquer_editer_pour_intégrer_les_notes() throws Throwable {
        if (Eval_Formateur) {
            FormationModel.cliquer_editer_notes(driver);
        }
    }

    @When("^saisir les notes$")
    public void saisir_les_notes() throws Throwable {
        if (Eval_Formateur) {
            FormationModel.saisir_notes();
        }
    }

    @Then("^valider partie evaluation par le formateur$")
    public void valider_partie_evaluation_par_le_formateur() throws Throwable {
        if (Eval_Formateur) {
            FormationModel.valider_evaluation_formateur(driver);
        }
    }


    @When("^Connecter en tant que responsable suivi de (\\d+)$")
    public void connecter_en_tant_que_responsable_suivi_de(int arg1) throws Throwable {
        ExcelUtils.setExcelFile(Path, "Formation");
        String typeval_for = ExcelUtils.getCellData(arg1, 10);
        if (typeval_for.equals("MONO")) {
            ExcelUtils.setExcelFile(Path, "Formation");
            String Formateur1 = ExcelUtils.getCellData(arg1, 13);
            FormationModel.Connecter_en_tant_que(Formateur1, driver);
        }
    }


    @When("^consulter agenda evaluation à froid  de (\\d+)$")
    public void consulter_agenda_evaluation_à_froid_de(int arg1) throws Throwable {
        ExcelUtils.setExcelFile(Path, "Formation");
        Thread.sleep(800);

        FormationModel.consulter_agenda_evaluation_froid(ExcelUtils.getCellData(arg1, 11), driver);
    }

    @When("^evaluer participants a froid$")
    public void evaluer_participants_a_froid() throws Throwable {
        FormationModel.evaluer_participant_afroid(driver);

    }

    @Then("^verifier evaluation traite de (\\d+)$")
    public void verifier_evaluation_traite_de(int arg1) throws Throwable {
        ExcelUtils.setExcelFile(Path, "Formation");
        String Nfiche = ExcelUtils.getCellData(arg1, 11);
        FormationModel.verifier_evaluation_afroid(Nfiche, driver);
    }


}
