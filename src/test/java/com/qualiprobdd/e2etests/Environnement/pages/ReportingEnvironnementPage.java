package com.qualiprobdd.e2etests.Environnement.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ReportingEnvironnementPage {

    final static String consulter_Reporting_Environnement_CSS =".AspNet-Menu-Vertical img";
    final static String cliquer_sur_Environnement_xpath ="//div[@id='menu_rep']/div/div/ul/li/ul/li[21]/a";
    final static String cliquer_sur_Etat_Aspect_Xpath ="//div[@id='menu_rep']/div/div/ul/li/ul/li[21]/ul/li/a";
    final static String sélectionner_Aspect ="ctl00_ContentPlaceHolder1_Dp_Aspect";
    final static String sélectionner_site ="ctl00_ContentPlaceHolder1_Fsite";
    final static String saisir_date_début ="//div[4]/div/div/a/span";
    final static String saisir_date_fin ="//div[5]/div/div/a/span";
    final static String sélectionner_score ="ctl00_ContentPlaceHolder1_dp_op";
    final static String cliquer_sur_le_bouton_radio_tous ="ctl00_ContentPlaceHolder1_R_CL_0";
    final static String cliquer_sur_le_bouton_valider ="ctl00_ContentPlaceHolder1_Valider";


    @FindBy(how = How.ID, using = consulter_Reporting_Environnement_CSS)
    public static WebElement wconsulter_Reporting_Environnement_CSS;
    @FindBy(how = How.ID, using = cliquer_sur_Environnement_xpath)
    public static WebElement wcliquer_sur_Environnement_xpath;
    @FindBy(how = How.ID, using = cliquer_sur_Etat_Aspect_Xpath  )
    public static WebElement wcliquer_sur_Etat_Aspect_Xpath ;
    @FindBy(how = How.ID, using =sélectionner_Aspect )
    public static WebElement wsélectionner_Aspect;
    @FindBy(how = How.ID, using = sélectionner_site)
    public static WebElement wsélectionner_site;
    @FindBy(how = How.ID, using =saisir_date_début )
    public static WebElement wsaisir_date_début;
    @FindBy(how = How.ID, using =saisir_date_fin )
    public static WebElement wsaisir_date_fin;
    @FindBy(how = How.ID, using = sélectionner_score )
    public static WebElement wsélectionner_score;
    @FindBy(how = How.ID, using = cliquer_sur_le_bouton_radio_tous )
    public static WebElement wcliquer_sur_le_bouton_radio_tous;
    @FindBy(how = How.ID, using = cliquer_sur_le_bouton_valider )
    public static WebElement wcliquer_sur_le_bouton_valider;


}
