package com.qualiprobdd.e2etests.Environnement.StepDefs;

import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;
import io.cucumber.java.en.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.qualiprobdd.e2etests.Environnement.models.IncidentModel;
import com.qualiprobdd.e2etests.Environnement.pages.IncidentPage;
import com.qualiprobdd.e2etests.authentification.models.AuthentificationModel;
import com.qualiprobdd.e2etests.util.Common;
import com.qualiprobdd.e2etests.util.ExcelUtils;
import com.qualiprobdd.e2etests.util.Setup;


public class IncidentStepDef {

	public WebDriver driver;
	private static String Path = "resources/testData/TestData.xlsx";
	static int row;
	static String NumIncident="";

	public  IncidentStepDef() {
		 driver = Setup.driver;
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 PageFactory.initElements(driver, IncidentPage.class);
	}


	@When("^Consulter module Environnement$")
	public void consulter_module_Environnement() throws Throwable {
	IncidentModel.Consulter_module_Environnement(driver);
	}


	@When("^Consulter Sous Module Incident environnemental$")
	public void consulter_Sous_Module_Incident_environnemental() throws Throwable {
		IncidentModel.Consulter_Module_Incident_environnemental(driver);
	}

	@When("^Consulter Sous Module Liste des incidents$")
	public void consulter_Sous_Module_Liste_des_incidents() throws Throwable {
		IncidentModel.Consulter_Module_incidents(driver);
	}

	@When("^Cliquer sur ajouter incident$")
	public void cliquer_sur_ajouter_incident() throws Throwable {
		IncidentModel.ajouter_incident();
	}

	@When("^Lire Données (\\d+) depuis Excel$")
	public void lire_Données_depuis_Excel(int arg1) throws Throwable{
		row=arg1;
	}

	@When("^Saisir désignation Incident$")
	public void saisir_désignation_Incident() throws Throwable {
		IncidentModel.désignation_Incident();
	}

	@When("^Choisir type Incident$")
	public void choisir_type_Incident() throws Throwable {
		ExcelUtils.setExcelFile(Path, "IncidentEnv");
		String type=ExcelUtils.getCellData(row,0);
		IncidentModel.Choisir_type_Incident(type);
	}

	@When("^Choisir Catégorie Incident$")
	public void choisir_Catégorie_Incident() throws Throwable {
		IncidentModel.Choisir_Catégorie();
	}

	@When("^Choisir Date Incident$")
	public void choisir_Date_Incident() throws Throwable {
		IncidentModel.Date_Incident(driver);
	}

	@When("^Saisir Heure Incident$")
	public void saisir_Heure_Incident() throws Throwable {
		IncidentModel.Heure_Incident(driver);
	}

	@When("^Saisir N interne$")
	public void saisir_N_interne() throws Throwable {
		IncidentModel.N_interne();
	}

	@When("^Saisir Détecter par$")
	public void saisir_Détecter_par() throws Throwable {
		IncidentModel.Détecter_par();
	}

	@When("^Saisir à l origine$")
	public void saisir_à_l_origine() throws Throwable {
		IncidentModel.Saisir_Origine();
	}

	@When("^Saisir quantité rejeté$")
	public void saisir_quantité_rejeté() throws Throwable {
		IncidentModel.quantité_rejeté();
	}

	@When("^Choisir Lieu$")
	public void choisir_Lieu() throws Throwable {
		ExcelUtils.setExcelFile(Path, "IncidentEnv");
		String lieu=ExcelUtils.getCellData(row,3);
		IncidentModel.Choisir_Lieu(lieu, driver);;
	}

	@When("^Choisir site incident$")
	public void choisir_site_incident() throws Throwable {
		ExcelUtils.setExcelFile(Path, "IncidentEnv");
		String site=ExcelUtils.getCellData(row,1);
		IncidentModel.Choisir_site(site, driver);
	}

	@When("^Choisir processus incident$")
	public void choisir_processus_incident() throws Throwable {
		ExcelUtils.setExcelFile(Path, "IncidentEnv");
		String process=ExcelUtils.getCellData(row,2);
		System.out.println(process);
		IncidentModel.Choisir_processus(process, driver);
	}

	@When("^Choisir activité incident$")
	public void choisir_activité_incident() throws Throwable {
		IncidentModel.Choisir_activité(driver);
	}

	@When("^Choisir direction incident$")
	public void choisir_direction_incident() throws Throwable {
		IncidentModel.Choisir_direction(driver);
	}

	@When("^Choisir service incident$")
	public void choisir_service_incident() throws Throwable {
		IncidentModel.Choisir_service(driver);
	}

	@When("^Choisir secteur$")
	public void choisir_secteur() throws Throwable {
		IncidentModel.Choisir_secteur();
	}

	@When("^Saisir poste de travail$")
	public void saisir_poste_de_travail() throws Throwable {
		IncidentModel.poste_travail();
	}

	@When("^Saisir description Incident$")
	public void saisir_description_Incident() throws Throwable {
		IncidentModel.description_Incident();
	}

	@When("^Saisir description de cause$")
	public void saisir_description_de_cause() throws Throwable {
		IncidentModel._description_cause();
	}

	@When("^Saisir des conséquences$")
	public void saisir_des_conséquences() throws Throwable {
		IncidentModel.Saisir_conséquences();
	}

	@When("^Rattacher type de conséquence$")
	public void rattacher_type_de_conséquence() throws Throwable {
		IncidentModel.type_conséquence(driver);
	}

	@When("^Rattacher type de cause$")
	public void rattacher_type_de_cause() throws Throwable {
		IncidentModel.type_cause(driver);
	}

	@When("^Choisir Gravité$")
	public void choisir_Gravité() throws Throwable {
		IncidentModel.Choisir_Gravité();
	}

	@When("^Choisir Cout estimé$")
	public void choisir_Cout_estimé() throws Throwable {
		IncidentModel.Cout_estimé();
	}

	@When("^Choisir ISPS$")
	public void choisir_ISPS() throws Throwable {
		IncidentModel.Choisir_ISPS();
	}

	@When("^Choisir source$")
	public void choisir_source() throws Throwable {
		IncidentModel.Choisir_source();
	}

	@When("^Saisir Actions immédiates$")
	public void saisir_Actions_immédiates() throws Throwable {
		IncidentModel.Actions_immédiates();
	}

	@When("^Valider fiche incident$")
	public void valider_fiche_incident() throws Throwable {
		IncidentModel.Valider_fiche(driver);
	}
	@Then("^vérifier fiche incident crée$")
	public void vérifier_fiche_incident_crée() throws Throwable{
		Thread.sleep(500);
		WebElement num =driver.findElement(By.id("ctl00_ContentPlaceHolder1_NumInc"));
		String Num=num.getText();
		System.out.println("Incident Env numero: "+Num);
		Common.Exporter_visibilité("Fiche Incident Environnemental:"+Num);
		Common.Exporter_champ_A_masquer("Fiche Incident Environnemental: "+Num);
		ExcelUtils.setExcelFile(Path, "IncidentEnv");
		ExcelUtils.setCellData1(Num,row,7,Path,"IncidentEnv") ;
		assertTrue(!(num.getText().equals("")));
		System.out.println("La fiche incident N:"+ Num + "est Ajoute");
		NumIncident=Num;
		Thread.sleep(500);
		Common.Exporter_numFiche("fiche incident "+Num);
	}

	@When("^Rattacher conformité réglementaire$")
	public void rattacher_conformité_réglementaire() throws Throwable {
		IncidentModel.Rattacher_conformité_réglementaire(driver);
	}

	@When("^Rattacher aspect$")
	public void rattacher_aspect() throws Throwable {
		IncidentModel.Rattacher_aspect(driver);
	}

	@When("^Rattacher situation d’urgence$")
	public void rattacher_situation_d_urgence() throws Throwable {
		IncidentModel.Rattacher_situation_urgence(driver);
	}

	@When("^rattacher règle de sécurité$")
	public void rattacher_règle_de_sécurité() throws Throwable {
		IncidentModel.rattacher_règle_sécurité();
	}

	@When("^rattacher pièce jointe$")
	public void rattacher_pièce_jointe() throws Throwable {
		IncidentModel.rattacher_pièce_jointe();
	}

	@When("^rattacher personne à informer$")
	public void rattacher_personne_à_informer() throws Throwable {
		IncidentModel.rattacher_personne_informer();
	}
	
@When("^consulter agenda Environnement$")
public void consulter_agenda_Environnement() throws Throwable {
   IncidentModel.consulter_agenda(driver);
}

@When("^consulter (\\d+) Incident à valider$")
public void consulter_Incident_à_valider(int arg1) throws Throwable {
	row=arg1;
	ExcelUtils.setExcelFile(Path, "IncidentEnv");
	String num=ExcelUtils.getCellData(arg1,7);
	IncidentModel.consulter_Incident_à_valider(num,driver);
}




@When("^saisir \"([^\"]*)\" incident à prendre$")
public void saisir_incident_à_prendre(String arg1) throws Throwable {
	IncidentModel.decisionDeValidation(arg1, Path, row);
 
}
@Then("^vérifier que l état de la fiche incident suit \"([^\"]*)\"$")
public void vérifier_que_l_état_de_la_fiche_incident_suit(String arg1) throws Throwable {
	IncidentModel.vérifier_que_l_état_de_la_fiche_incident_suit(arg1, driver);
}

@When("^consulter (\\d+) Incident à corriger$")
public void consulter_Incident_à_corriger(int arg1) throws Throwable {
	row=arg1;
	ExcelUtils.setExcelFile(Path, "IncidentEnv");
	String num=ExcelUtils.getCellData(arg1,7);
	IncidentModel.consulter_Incident_à_corriger(num);
}

@When("^consulter (\\d+) décision de traitement des incidents$")
public void consulter_décision_de_traitement_des_incidents(int arg1) throws Throwable {
	row=arg1;
	ExcelUtils.setExcelFile(Path, "IncidentEnv");
	String num=ExcelUtils.getCellData(arg1,7);
	IncidentModel.consulter_Incident_à_décider(num,driver);
}

@When("^choisir responsable traitement$")
public void choisir_responsable_traitement() throws Throwable {
	ExcelUtils.setExcelFile(Path, "IncidentEnv");
	String Resp=ExcelUtils.getCellData(row,8);
	IncidentModel.choisir_responsable_traitement(Resp);
}

@When("^choisir responsable clôture$")
public void choisir_responsable_clôture() throws Throwable {
	ExcelUtils.setExcelFile(Path, "IncidentEnv");
	String Resp=ExcelUtils.getCellData(row,6);
	IncidentModel.choisir_responsable_clôture(driver, Resp);
}

@When("^choisir délai de traitement$")
public void choisir_délai_de_traitement() throws Throwable {
  IncidentModel.choisir_délai_de_traitement(driver);
}

@When("^saisir cause incident$")
public void saisir_cause_incident() throws Throwable {
IncidentModel.saisir_cause_incident();
}

@When("^saisir traitement incident$")
public void saisir_traitement_incident() throws Throwable {
    IncidentModel.saisir_traitement_incident();
}

@When("^choisir type décision$")
public void choisir_type_décision() throws Throwable {
 IncidentModel.choisir_type_décision(driver);
}

@When("^valider décision$")
public void valider_décision() throws Throwable {
    IncidentModel.valider_décision(driver);
    
}



@When("^consulter (\\d+) traitement des incidents$")
public void consulter_traitement_des_incidents(int arg1) throws Throwable {
	row=arg1;
	ExcelUtils.setExcelFile(Path, "IncidentEnv");
	String num=ExcelUtils.getCellData(arg1,7);
	IncidentModel.consulter_traitement_des_incidents(num,driver);
}

@When("^Cocher incident traité$")
public void cocher_incident_traité() throws Throwable {
	IncidentModel.cocher_incident_traité();
}

@When("^Saisir cout$")
public void saisir_cout() throws Throwable {
	IncidentModel.saisir_cout(driver);
}

@When("^saisir rapport traitement$")
public void saisir_rapport_traitement() throws Throwable {
	IncidentModel.saisir_rapport_traitement(driver);
}

@When("^valider le traitement$")
public void valider_le_traitement() throws Throwable {
	IncidentModel.valider_le_traitement(driver);
}

@When("^consulter (\\d+) cloture des incidents$")
public void consulter_cloture_des_incidents(int arg1) throws Throwable {
	row=arg1;
	ExcelUtils.setExcelFile(Path, "IncidentEnv");
	String num=ExcelUtils.getCellData(arg1,7);
	IncidentModel.consulter_incidents_a_cloturer(num);
}

@When("^Cocher incident cloture$")
public void cocher_incident_cloture() throws Throwable {
	IncidentModel.cocher_incident_cloturé();
}

@When("^Saisir rapport cloture$")
public void saisir_rapport_cloture() throws Throwable {
	IncidentModel.saisir_rapport_cloture(driver);
}

@When("^valider la cloture$")
public void valider_la_cloture() throws Throwable {
	IncidentModel.valider_le_cloture();
}


}
