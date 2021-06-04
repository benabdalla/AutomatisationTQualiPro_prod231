package com.qualiprobdd.e2etests.Environnement.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class EvaluationAspectPage {
    final static String consulter_Sous_Module_Aspects_ID ="ctl00_Body1";
    final static String consulter_Sous_Module_Evaluation_des_aspects_Xpath ="//div[@id='cssmenu15']/div/div/ul/li[15]/ul/li/ul/li/a";
    final static String cliquer_sur_ajouter_Evaluation_aspect ="ctl00_ContentPlaceHolder1_Ajouter";
    final static String sélectionner_Aspect_EVALUATION ="ctl00_ContentPlaceHolder1_DpFaspect";
    final static String sélectionner_Facteur ="ctl00_ContentPlaceHolder1_DpFfact";
    final static String sélectionner_Lieu ="ctl00_ContentPlaceHolder1_DpFlieu";
    final static String sélectionner_condition ="ctl00_ContentPlaceHolder1_DpFcond";
    final static String cliquer_sur_valider_Evaluation_aspect ="ctl00_ContentPlaceHolder1_Lk_valid_fiche";
    final static String Boutton_retour_Aspect_EVALUATION ="ctl00_ContentPlaceHolder1_Lk_retour_fiche";
    final static String remplir_le_champ_N_Aspect ="ctl00_ContentPlaceHolder1_TextBox1";
    final static String Rechercher_Aspect_EVALUATION ="ctl00_ContentPlaceHolder1_Filtre_Rechercher";
    final static String Tab_Aspect_EVALUATION ="ctl00_ContentPlaceHolder1_GridView1p";


    @FindBy(how = How.ID, using =consulter_Sous_Module_Aspects_ID)
    public static WebElement wconsulter_Sous_Module_Aspects_ID;
    @FindBy(how = How.ID, using =consulter_Sous_Module_Evaluation_des_aspects_Xpath)
    public static WebElement wconsulter_Sous_Module_Evaluation_des_aspects_Xpath;
    @FindBy(how = How.ID, using =cliquer_sur_ajouter_Evaluation_aspect)
    public static WebElement wcliquer_sur_ajouter_Evaluation_aspect;
    @FindBy(how = How.ID, using =sélectionner_Aspect_EVALUATION)
    public static WebElement wsélectionner_Aspect_EVALUATION;
    @FindBy(how = How.ID, using =sélectionner_Facteur)
    public static WebElement wsélectionner_Facteur;
    @FindBy(how = How.ID, using = sélectionner_Lieu )
    public static WebElement wsélectionner_Lieu;
    @FindBy(how = How.ID, using = sélectionner_condition)
    public static WebElement wsélectionner_condition;
    @FindBy(how = How.ID, using =cliquer_sur_valider_Evaluation_aspect)
    public static WebElement wcliquer_sur_valider_Evaluation_aspect;
    @FindBy(how = How.ID, using =Boutton_retour_Aspect_EVALUATION)
    public static WebElement wBoutton_retour_Aspect_EVALUATION;
    @FindBy(how = How.ID, using =remplir_le_champ_N_Aspect)
    public static WebElement wremplir_le_champ_N_Aspect;
    @FindBy(how = How.ID, using =Rechercher_Aspect_EVALUATION)
    public static WebElement wRechercher_Aspect_EVALUATION;
    @FindBy(how = How.ID, using =Tab_Aspect_EVALUATION)
    public static WebElement wTab_Aspect_EVALUATION;
}
