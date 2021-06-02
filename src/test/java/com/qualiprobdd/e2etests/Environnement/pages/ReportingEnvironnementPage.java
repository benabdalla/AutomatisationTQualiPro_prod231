package com.qualiprobdd.e2etests.Environnement.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ReportingEnvironnementPage {

    final static String consulter_Reporting_Environnement_CSS =".AspNet-Menu-Vertical img";
    final static String cliquer_sur_Etat_Aspect ="";
    final static String sélectionner_Aspect ="";
    final static String saisir_Activité_Service ="";
    final static String sélectionner_site ="";
    final static String saisir_date ="";
    final static String sélectionner_score ="";
    final static String cliquer_sur_le_bouton_valider ="";
    final static String vérifier_le_filtre_tous ="";





    @FindBy(how = How.ID, using = consulter_Reporting_Environnement_CSS)
    public static WebElement wconsulter_Reporting_Environnement_CSS;
}
