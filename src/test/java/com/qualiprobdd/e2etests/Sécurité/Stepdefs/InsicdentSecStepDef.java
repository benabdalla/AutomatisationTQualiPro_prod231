package com.qualiprobdd.e2etests.Sécurité.Stepdefs;

import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;
import io.cucumber.java.en.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.qualiprobdd.e2etests.Environnement.models.IncidentModel;
import com.qualiprobdd.e2etests.Sécurité.Models.IncidentSecModel;
import com.qualiprobdd.e2etests.Sécurité.Pages.IncidentSecPage;
import com.qualiprobdd.e2etests.util.Common;
import com.qualiprobdd.e2etests.util.ExcelUtils;
import com.qualiprobdd.e2etests.util.Setup;



public class InsicdentSecStepDef {
	public WebDriver driver;
	private static String Path = "resources/testData/TestData.xlsx";
	static int row;
	static String NumIncident="";

	public InsicdentSecStepDef() {
		 driver = Setup.driver;
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 PageFactory.initElements(driver, IncidentSecPage.class);
	}

	@When("^Consulter module securité$")
	public void Consulter_module_securité() throws Throwable {
	IncidentSecModel.Consulter_module_Securite(driver);
	}


@When("^Consulter Sous Module Incident sécurité$")
public void consulter_Sous_Module_Incident_sécurité() throws Throwable {
	IncidentSecModel.Consulter_Module_Incident_Securite(driver);
}

@When("^Consulter Sous Module Liste des incidents sécurité$")
public void consulter_Sous_Module_Liste_des_incidents_sécurité() throws Throwable {
	IncidentSecModel.Consulter_Module_incidentsSec(driver);
	
}	


	@When("^Cliquer sur ajouter incident sécurité$")
	public void cliquer_sur_ajouter_incident_sécurité() throws Throwable {
		IncidentSecModel.ajouter_incidentSec();
	}
	
	@When("^Lire Données incident sécurité (\\d+) depuis Excel$")
	public void lire_Données_incident_sécurité__depuis_Excel(int arg1) throws Throwable{
		row=arg1;
	}

	@When("^Saisir désignation Incident sécurité$")
	public void saisir_désignation_Incident_sécurité() throws Throwable {
		IncidentSecModel.désignation_Incident();
	}

	@When("^Choisir type Incident sécurité$")
	public void choisir_type_Incident_sécurité() throws Throwable {
		ExcelUtils.setExcelFile(Path, "IncidentSec");
		String type=ExcelUtils.getCellData(row,0);
		IncidentSecModel.Choisir_type_Incident(type);
	}

	@When("^Choisir Catégorie Incident sécurité$")
	public void choisir_Catégorie_Incident_sécurité() throws Throwable {
		IncidentSecModel.Choisir_Catégorie();
	}

	@When("^Choisir Date Incident sécurité$")
	public void choisir_Date_Incident_sécurité() throws Throwable {
		IncidentSecModel.Date_Incident(driver);
	}

	@When("^Saisir Heure Incident sécurité$")
	public void saisir_Heure_Incident_sécurité() throws Throwable {
		IncidentSecModel.Heure_Incident(driver);
	}

	@When("^Saisir N interne sécurité$")
	public void saisir_N_interne_sécurité() throws Throwable {
		IncidentSecModel.N_interne();
	}

	@When("^Saisir Détecter par sécurité$")
	public void saisir_Détecter_par_sécurité() throws Throwable {
		IncidentSecModel.Détecter_par();
	}

	@When("^choisir semaine$")
	public void choisir_semaine() throws Throwable {
		IncidentSecModel.Selectionner_Semaine();
	}

	@When("^Saisir nombre jour arreté$")
	public void saisir_nombre_jour_arrete() throws Throwable {
		IncidentSecModel.nombre_jour();
	}

	@When("^Choisir site incident sécurité$")
	public void choisir_site_incident_sécurité() throws Throwable {
		ExcelUtils.setExcelFile(Path, "IncidentSec");
		String site=ExcelUtils.getCellData(row,1);
		System.out.println(site);
		IncidentSecModel.Choisir_site(site, driver);
	}

	@When("^Choisir processus incident sécurité$")
	public void choisir_processus_incident_sécurité() throws Throwable {
		ExcelUtils.setExcelFile(Path, "IncidentSec");
		String process=ExcelUtils.getCellData(row,2);
		System.out.println(process);
		IncidentSecModel.Choisir_processus(process, driver);
	}

	@When("^Choisir activité incident sécurité$")
	public void choisir_activité_incident_sécurité() throws Throwable {
		IncidentSecModel.Choisir_activité(driver);
	}

	@When("^Choisir direction incident sécurité$")
	public void choisir_direction_incident_sécurité() throws Throwable {
		IncidentSecModel.Choisir_direction(driver);
	}

	@When("^Choisir service incident sécurité$")
	public void choisir_service_incident_sécurité() throws Throwable {
		IncidentSecModel.Choisir_service(driver);
	}

	@When("^Choisir secteur sécurité$")
	public void choisir_secteur_sécurité() throws Throwable {
		IncidentSecModel.Choisir_secteur();
	}

	@When("^Saisir poste de travail sécurité$")
	public void saisir_poste_de_travail_sécurité() throws Throwable {
		IncidentSecModel.poste_travail();
	}

	@When("^Saisir description Incident sécurité$")
	public void saisir_description_Incident_sécurité() throws Throwable {
		IncidentSecModel.description_Incident();
	}

	@When("^Saisir description de cause sécurité$")
	public void saisir_description_de_cause_sécurité() throws Throwable {
		IncidentSecModel._description_cause();
	}

	@When("^Saisir des conséquences sécurité$")
	public void saisir_des_conséquences_sécurité() throws Throwable {
		IncidentSecModel.Saisir_conséquences();
	}

	@When("^Rattacher type de conséquence sécurité$")
	public void rattacher_type_de_conséquence_sécurité() throws Throwable {
		IncidentSecModel.type_conséquence();
	}

	@When("^Rattacher type de cause sécurité$")
	public void rattacher_type_de_cause_sécurité() throws Throwable {
		IncidentSecModel.type_cause();
	}
	
	@When("^Rattacher cause typique sécurité$")
	public void rattacher_cause_typique_sécurité() throws Throwable {
		IncidentSecModel.cause_typique();
	}
	
	@When("^Rattacher site lésion sécurité$")
	public void rattacher_site_lésion_sécurité() throws Throwable {
		IncidentSecModel.SITE_LIAISON();
	}

	@When("^Choisir Gravité sécurité$")
	public void choisir_Gravité_sécurité() throws Throwable {
		IncidentSecModel.Choisir_Gravité();
	}

	@When("^Choisir Cout estimé sécurité$")
	public void choisir_Cout_estimé_sécurité() throws Throwable {
		IncidentSecModel.Cout_estimé();
	}

	@When("^Choisir ISPS sécurité$")
	public void choisir_ISPS_sécurité() throws Throwable {
		IncidentSecModel.Choisir_ISPS();
	}

	@When("^Choisir evenement déclencheur$")
	public void choisir_evenement_declencheur() throws Throwable {
		IncidentSecModel.Choisir_evenement_déclencheur();
	}

	@When("^Saisir Actions immédiates sécurité$")
	public void saisir_Actions_immédiates_sécurité() throws Throwable {
		IncidentSecModel.Actions_immédiates();
	}

	@When("^Valider fiche incident sécurité$")
	public void valider_fiche_incident_sécurité() throws Throwable {
		IncidentSecModel.Valider_fiche(driver);
	}
	@Then("^vérifier fiche incident sécurité crée$")
	public void vérifier_fiche_incident_sécurité_crée() throws Throwable{
		Thread.sleep(500);
		WebElement num =driver.findElement(By.id("ctl00_ContentPlaceHolder1_NumInc"));
		String Num=num.getText();
		System.out.println("Incident sécurité numero: "+Num);
		Common.Exporter_visibilité("Fiche Incident sécurité:"+Num);
		Common.Exporter_champ_A_masquer("Fiche Incident sécurité: "+Num);
		ExcelUtils.setExcelFile(Path, "IncidentSec");
		ExcelUtils.setCellData1(Num,row,6,Path,"IncidentSec") ;
		assertTrue(!(num.getText().equals("")));
		System.out.println("La fiche incident sécurité N:"+ Num + "est Ajoute");
		Common.Exporter_numFiche("La fiche incident sécurité N:"+ Num );
		NumIncident=Num;
	}
	@When("Rattacher personne concernée incident sécurité$")
	public void Rattacher_personne_concernée_incident_sécurité() throws Throwable
	{
		IncidentSecModel.Rattacher_personne_concerné(driver);
	}
	@When("Rattacher des témoins incident sécurité$")
	public void Rattacher_des_témoins_incident_sécurité() throws Throwable 
	{
		IncidentSecModel.Rattacher_témoins(driver);
	}
	@When("^Rattacher conformité réglementaire incident sécurité$")
	public void rattacher_conformité_réglementaire_incident_sécurité() throws Throwable {
		IncidentSecModel.Rattacher_conformité_réglementaire(driver);
	}

	@When("^Rattacher risque incident sécurité$")
	public void rattacher_risque_incident_sécurité() throws Throwable {
		IncidentSecModel.Rattacher_risque(driver);
	}

	@When("^Rattacher situation d’urgence incident sécurité$")
	public void rattacher_situation_d_urgence_incident_sécurité() throws Throwable {
		IncidentSecModel.Rattacher_situation_urgence(driver);
	}

	@When("^rattacher règle de sécurité incident sécurité$")
	public void rattacher_règle_de_sécurité_incident_sécurité() throws Throwable {
		IncidentSecModel.rattacher_règle_sécurité(driver);
	}

	@When("^rattacher pièce jointe incident sécurité$")
	public void rattacher_pièce_jointe_incident_sécurité() throws Throwable {
		IncidentSecModel.rattacher_pièce_jointe(driver);
	}

	@When("^rattacher personne à informer incident sécurité$")
	public void rattacher_personne_à_informer_incident_sécurité() throws Throwable {
		IncidentSecModel.rattacher_personne_informer(driver);
	}

	@When("^rattacher action incident sécurité$")
	public void rattacher_action_incident_sécurité() throws Throwable {
		IncidentSecModel.rattacher_action(driver);
	}

	
	@When("^consulter agenda sécurité$")
	public void consulter_agenda_sécurité() throws Throwable {
	   IncidentSecModel.consulter_agenda(driver);
	   System.err.println(" consulter  agenda  ");
	}
	
	
	@When("^consulter (\\d+) Incident securite à valider$")
	public void consulter_Incident_securite_à_valider(int arg1) throws Throwable {
		row=arg1;
		ExcelUtils.setExcelFile(Path, "IncidentSec");
		String num=ExcelUtils.getCellData(arg1,6);
		System.err.println("  numero  de   fiche   incident  est   : "+num);
		IncidentSecModel.consulter_Incident_à_valider(num,driver);
	}

@When("^consulter (\\d+) Incident  à valider$")
public void consulter_Incident_à_valider(int arg1) throws Throwable {

	row=arg1;
	ExcelUtils.setExcelFile(Path, "IncidentSec");
	String num=ExcelUtils.getCellData(arg1,6);
	Thread.sleep(3000);
	System.err.println("acceder le methode pnsulter  incident  ");
	IncidentSecModel.consulter_Incident_à_valider(num,driver);
	
}




	@When("^saisir \"([^\"]*)\" incident securite à prendre$")
	public void saisir_incident_securite_à_prendre(String arg1) throws Throwable {
		IncidentSecModel.decisionDeValidation(arg1, Path, row,driver);
	 
	}
	@Then("^vérifier que l état de la fiche incident securite suit \"([^\"]*)\"$")
	public void vérifier_que_l_état_de_la_fiche_incident_securite_suit(String arg1) throws Throwable {
		IncidentSecModel.vérifier_que_l_état_de_la_fiche_incident_suit(arg1, driver);
	}

	@When("^consulter (\\d+) Incident securite à corriger$")
	public void consulter_Incident_securite_à_corriger(int arg1) throws Throwable {
		row=arg1;
		ExcelUtils.setExcelFile(Path, "IncidentSec");
		String num=ExcelUtils.getCellData(arg1,6);
		IncidentSecModel.consulter_Incident_à_corriger(num);
	}

	@When("^consulter (\\d+) décision de traitement des incidents sécurite$")
	public void consulter_décision_de_traitement_des_incidents_sécurite(int arg1) throws Throwable {
		row=arg1;
		ExcelUtils.setExcelFile(Path, "IncidentSec");
		String num=ExcelUtils.getCellData(arg1,6);
		IncidentSecModel.consulter_Incident_à_décider(num);
	}

	@When("^choisir responsable traitement incident sécurite$")
	public void choisir_responsable_traitement_incident_sécurite() throws Throwable {
		ExcelUtils.setExcelFile(Path, "IncidentSec");
		String Resp=ExcelUtils.getCellData(row,7);
		IncidentSecModel.choisir_responsable_traitement(Resp);
	}

	@When("^choisir responsable clôture incident sécurite$")
	public void choisir_responsable_clôture_incident_sécurite() throws Throwable {
		ExcelUtils.setExcelFile(Path, "IncidentSec");
		String Resp=ExcelUtils.getCellData(row,5);
		IncidentSecModel.choisir_responsable_clôture(driver, Resp);
	}

	@When("^choisir délai de traitement incident sécurite$")
	public void choisir_délai_de_traitement_incident_sécurite() throws Throwable {
	  IncidentSecModel.choisir_délai_de_traitement(driver);
	}

	@When("^saisir cause incident sécurite$")
	public void saisir_cause_incident_sécurite() throws Throwable {
	IncidentSecModel.saisir_cause_incident();
	}

	@When("^saisir traitement incident sécurite$")
	public void saisir_traitement_incident_sécurite() throws Throwable {
	    IncidentSecModel.saisir_traitement_incident();
	}

	@When("^valider décision incident sécurite$")
	public void valider_décision_incident_sécurite() throws Throwable {
	    IncidentSecModel.valider_décision(driver);
	    
	}


	@When("^consulter (\\d+) traitement des incidents sécurite$")
	public void consulter_traitement_des_incidents_sécurite(int arg1) throws Throwable {
		row=arg1;
		ExcelUtils.setExcelFile(Path, "IncidentSec");
		String num=ExcelUtils.getCellData(arg1,6);
		IncidentSecModel.consulter_traitement_des_incidents(num,driver);
	}

	@When("^Cocher incident sécurite traité$")
	public void cocher_incident_sécurite_traité() throws Throwable {
		IncidentSecModel.cocher_incident_traité();
	}

	@When("^Saisir cout incident sécurite$")
	public void saisir_cout_incident_sécurite() throws Throwable {
		IncidentSecModel.saisir_cout(driver);
	}

	@When("^saisir rapport traitement incident sécurite$")
	public void saisir_rapport_traitement_incident_sécurite() throws Throwable {
		IncidentSecModel.saisir_rapport_traitement(driver);
	}

	@When("^valider le traitement incident sécurite$")
	public void valider_le_traitement_incident_sécurite() throws Throwable {
		IncidentSecModel.valider_le_traitement(driver);
	}

	@When("^consulter (\\d+) cloture des incidents sécurite$")
	public void consulter_cloture_des_incidents_sécurite(int arg1) throws Throwable {
		row=arg1;
		ExcelUtils.setExcelFile(Path, "IncidentSec");
		String num=ExcelUtils.getCellData(arg1,6);
		IncidentSecModel.consulter_incidents_a_cloturer(num);
	}

	@When("^Cocher incident sécurite cloture$")
	public void cocher_incident_sécuritet_cloture() throws Throwable {
		IncidentSecModel.cocher_incident_cloturé();
	}

	@When("^Saisir rapport cloture incident sécurite$")
	public void saisir_rapport_cloture_incident_sécurite() throws Throwable {
		IncidentSecModel.saisir_rapport_cloture(driver);
	}

	@When("^valider la cloture incident sécurite$")
	public void valider_la_cloture_incident_sécurite() throws Throwable {
		IncidentSecModel.valider_le_cloture(driver);
	}

}
