
package com.qualiprobdd.e2etests.metrologie.stepdef;

import static org.testng.Assert.assertTrue;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


import com.qualiprobdd.e2etests.ReclamationClient.Pages.ReclamationClientPage;
import io.cucumber.java.en.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import org.testng.annotations.Test;

import com.qualiprobdd.e2etests.Documentation.pages.DocumentationPage;
import com.qualiprobdd.e2etests.audit.models.ModuleAuditsModel;
import com.qualiprobdd.e2etests.audit.pages.ModuleAuditsPage;
import com.qualiprobdd.e2etests.metrologie.model.ModuleMetrologieModel;
import com.qualiprobdd.e2etests.metrologie.page.ModuleMetrologiePage;
import com.qualiprobdd.e2etests.util.Common;
import com.qualiprobdd.e2etests.util.RTFUtil;
import com.qualiprobdd.e2etests.util.Setup;


@Test
public class ModuleMetrologieStepDefinition {

	public WebDriver driver;
	public  String numAudit;
	private static Common common = new Common();
	static int row;
	
	public ModuleMetrologieStepDefinition() {
		driver = Setup.driver;
		PageFactory.initElements(driver, ModuleMetrologiePage.class);
		PageFactory.initElements(driver, ReclamationClientPage.class);

	}



	@When("cliquer sur sous module machine")
	public void cliquer_sur_sous_module_machine() throws Exception {
		// Write code here that turns the phrase above into concrete actions
		Common.AccéderModule(11,6,0, driver);
	}

	@When("clique   sur ajouter machine")
	public void clique_sur_ajouter_machine() {
		ModuleMetrologieModel.clique_sur_ajouter_machine();

	}

	@When("saisir  nom  de   machine")
	public void saisir_nom_de_machine() throws Exception {
		ModuleMetrologieModel.saisir_nom_de_machine(row);
	}


	@When("cliquer sur sous module etat  des    équipements")
	public void cliquer_sur_sous_module_etat_des_équipements() throws Exception {
		// Write code here that turns the phrase above into concrete actions
		Common.AccéderModule(11,5,0, driver);
	}

	@When("clique   sur ajouter etat  des    équipements")
	public void clique_sur_ajouter_etat_des_équipements() {
		ModuleMetrologieModel.clique_sur_ajouter_etat_des_équipements();

	}

	@When("saisir  etat  des    équipement")
	public void saisir_etat_des_équipement() throws Exception {
		ModuleMetrologieModel.saisir_etat_des_équipement(row);
	}

	@When("saisir Prise en charge au niveau de l'agenda")
	public void saisir_Prise_en_charge_au_niveau_de_l_agenda() {
		ModuleMetrologieModel.saisir_Prise_en_charge_au_niveau_de_l_agenda(driver);
	}

	@When("saisir Affiché au niveau de l'état du planning")
	public void saisir_Affiché_au_niveau_de_l_état_du_planning() throws Exception {
		ModuleMetrologieModel.saisir_Affiché_au_niveau_de_l_état_du_planning(row,driver);
	}



	@When("cliquer sur sous module Type intervention")
	public void cliquer_sur_sous_module_Type_intervention() throws Exception {
		// Write code here that turns the phrase above into concrete actions
		Common.AccéderModule(11,4,0, driver);
		Thread.sleep(500);
ModuleMetrologiePage.wajoutEtaBtn.click();
	}

	@When("Saisir  Type intervention")
	public void saisir_Type_intervention() throws Exception {
		ModuleMetrologieModel.saisir_Type_intervention(row);

	}

	@When("saisir Prévention d'alerte")
	public void saisir_Prévention_d_alerte() {
		ModuleMetrologieModel.saisir_Prévention_d_alerte();
	}

	@When("saisir  Responsable  type   intervention")
	public void saisir_Responsable_type_intervention() throws Exception {
		ModuleMetrologieModel.saisir_Responsable_type_intervention(row,driver);

	}
	@When("verefier Type intervention")
	public void verefier_Type_intervention() throws Exception {
		ModuleMetrologieModel.verefier_Type_intervention(row);

	}



	@When("cliquer sur sous module organiseme")
	public void cliquer_sur_sous_module_organiseme() throws Exception {
		// Write code here that turns the phrase above into concrete actions
		Common.AccéderModule(11,3,0, driver);
	}

	@When("cliquer   sur   ajouter   organiseme")
	public void cliquer_sur_ajouter_organiseme() {
ModuleMetrologieModel.cliquer_sur_ajouter_organiseme();
	}

	@When("saisir  organiseme")
	public void saisir_organiseme() throws Exception {
		ModuleMetrologieModel.saisir_organiseme(row);

	}



	@When("cliquer sur sous module Type d'équipement")
	public void cliquer_sur_sous_module_Type_d_équipement() throws Exception {
		// Write code here that turns the phrase above into concrete actions
		Common.AccéderModule(11,2,0, driver);
	}

	@When("cliquer  sur   ajouter   Type d'équipement")
	public void cliquer_sur_ajouter_Type_d_équipement() {
ModuleMetrologieModel.cliquer_sur_ajouter_Type_d_équipement();
	}

	@When("saisir   Type d'équipement")
	public void saisir_Type_d_équipement() throws Exception {
		ModuleMetrologieModel.saisir_Type_d_équipement(row);
	}




	@When("^saisir ligne  (\\d+) a excel$")
	public void saisir_ligne_a_excel(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   row =arg1;
	}

@When("^cliquer sur module Métrologie$")
public void cliquer_sur_module_Métrologie() throws Throwable {
	ModuleMetrologieModel.cliquer_sur_module_Métrologie(driver);
  
}
@When("^cliquer sur ajouter fiche$")
public void cliquer_sur_ajouter_fiche() throws Throwable {
	ModuleMetrologieModel.cliquer_sur_ajouter_fiche();
 
}




@When("^cliquer sur sous module équipement de mesure$")
public void cliquer_sur_sous_module_équipement_de_mesure() throws Throwable {
	Common.AccéderModule(11,1,0, driver);
 
}

@When("^saisir Code équipement$")
public void saisir_Code_équipement() throws Throwable {
	ModuleMetrologieModel.saisir_Code_équipement(row);
    
}

@When("^saisir Désignation équipement$")
public void saisir_Désignation_équipement() throws Throwable {
	ModuleMetrologieModel.saisir_Désignation_équipement( row);
   
}

@When("^saisir Date mise en service$")
public void saisir_Date_mise_en_service() throws Throwable {
	ModuleMetrologieModel.saisir_Date_mise_en_service(driver);
   
}

@When("^choisir Etat$")
public void choisir_Etat() throws Throwable {
	ModuleMetrologieModel.choisir_Etat(driver, row);
  
}

@When("^saisir N° de série$")
public void saisir_N_de_série() throws Throwable {
	ModuleMetrologieModel.saisir_N_de_série(row);
   
}

@When("^saisir Précision/Résolution$")
public void saisir_Précision_Résolution() throws Throwable {
	ModuleMetrologieModel.saisir_Précision_Résolution(row);
    
}

@When("^saisir Etendue de mesure$")
public void saisir_Etendue_de_mesure() throws Throwable {
	ModuleMetrologieModel.saisir_Etendue_de_mesure(row);
  
}

@When("^saisir Ecart maximal toléré$")
public void saisir_Ecart_maximal_toléré() throws Throwable {
	ModuleMetrologieModel.saisir_Ecart_maximal_toléré(row);
    
}

@When("^saisir Consigne$")
public void saisir_Consigne() throws Throwable {
	ModuleMetrologieModel.saisir_Consigne(row);
  
}

@When("^saisir Consigne Commentaire type équipement$")
public void saisir_Consigne_Commentaire_type_équipement() throws Throwable {
 
}

@When("^Sélectionner Fournisseur$")
public void sélectionner_Fournisseur() throws Throwable {
	ModuleMetrologieModel.sélectionner_Fournisseur(row,driver);
   
}

@When("^choisir Appareil critique$")
public void choisir_Appareil_critique() throws Throwable {
	ModuleMetrologieModel.choisir_Appareil_critique(row);
  
}

@When("^choisir Type équipement$")
public void choisir_Type_équipement() throws Throwable {
	ModuleMetrologieModel.choisir_Type_équipement(row);
    
}

@Then("^vérifier l’ajout de la fiche$")
public void vérifier_l_ajout_de_la_fiche() throws Throwable {
	ModuleMetrologieModel.vérifier_l_ajout_de_la_fiche(row);
   
}
@When("^cliquer sur Historique des affectations$")
public void cliquer_sur_Historique_des_affectations() throws Throwable {
	ModuleMetrologieModel.cliquer_sur_Historique_des_affectations();
}  

@When("^choisir une date historique$")
public void choisir_une_date_historique() throws Throwable {
	ModuleMetrologieModel.choisir_une_date_historique();
    
}

@When("^choisir un site historique$")
public void choisir_un_site_historique() throws Throwable {
	ModuleMetrologieModel.choisir_un_site_historique(row) ;
    
}

@When("^choisir dotation historique$")
public void choisir_dotation_historique() throws Throwable {
	ModuleMetrologieModel.choisir_dotation_historique(row);
  
}

@When("^choisir Emplacement intervention historique$")
public void choisir_Emplacement_intervention_historique() throws Throwable {
	ModuleMetrologieModel.choisir_Emplacement_intervention_historique(row);
  
}




@When("^cliquer sur validerh$")
public void cliquer_sur_validerh() throws Throwable {
	ModuleMetrologieModel.cliquer_sur_validerh();
	
}

@When("^cliquer sur valider historique$")
public void cliquer_sur_valider_historique() throws Throwable {
	ModuleMetrologieModel.cliquer_sur_valider_historique();
}
@When("^cliquer sur machine list$")
public void cliquer_sur_machine_list() throws Throwable {
	ModuleMetrologieModel.cliquer_sur_machine_list();

}

@When("^cliquer sur link$")
public void cliquer_sur_link() throws Throwable {
	ModuleMetrologieModel.cliquer_sur_link(driver,row);
    
}

@When("^cliquer sur add$")
public void cliquer_sur_add() throws Throwable {
	ModuleMetrologieModel.cliquer_sur_add(row);
	
}

@When("^cliquer sur delete$")
public void cliquer_sur_delete() throws Throwable {
	//ModuleMetrologieModel.cliquer_sur_delete(driver);
  
}
@When("^ajouter liste type d operation$")
public void ajouter_liste_type_d_operation() throws Throwable {
	ModuleMetrologieModel.ajouter_liste_type_d_operation(driver,row); 
   
}
@When("^valider fiche operation$")
public void valider_fiche_operation() throws Throwable {
   ModuleMetrologieModel.valider_fiche_operation(driver);
}
@When("^ajouter operation report$")
public void ajouter_operation_report() throws Throwable {
 //ModuleMetrologieModel.ajouter_operation_report(row);
}
@When("^rechecher equipement$")
public void rechecher_equipement() throws Throwable {
	ModuleMetrologieModel.rechecher_equipement(row);
   
}
@When("^consulter agenda metrologie$")
public void consulter_agenda_metrologie() throws Throwable {
	ModuleMetrologieModel.consulter_agenda_metrologie(row , driver);
	
	
   
}


@Then("^cliquer sur operation report$")
public void cliquer_sur_operation_report() throws Throwable {
	ModuleMetrologieModel.cliquer_sur_operation_report(row , driver);
	ModuleMetrologieModel.ajouter_operation_report(row, driver);
	//ModuleMetrologieModel.rattacher_pièces_jointes(driver);
}

@Then("^cliquer sur R&R$")
public void cliquer_sur_R_R() throws Throwable {
	ModuleMetrologieModel.cliquer_sur_R_R(row , driver);
   
}
@Then("^Rechercher le code de la fiche$")
public void rechercher_le_code_de_la_fiche() throws Throwable {
	ModuleMetrologieModel.rechercher_le_code_de_la_fiche(row, driver);
  
}

}
