package com.qualiprobdd.e2etests.Risque.StepDefs;

import java.util.concurrent.TimeUnit;
import cucumber.api.java.en.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.qualiprobdd.e2etests.Risque.Models.RisqueOppModele;
import com.qualiprobdd.e2etests.Risque.Page.RisqueOppPage;
import com.qualiprobdd.e2etests.util.Setup;





public class RisqueStepDef {
public WebDriver driver;
	public int row;
	public RisqueStepDef() {
		driver = Setup.driver;
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 PageFactory.initElements(driver, RisqueOppPage.class);
	}



	
	@When("^Introduire (\\d+) risque$")
	public void introduire_risque(int arg1) throws Throwable {
		row=arg1;
	}
	@When("^cliquer sur module Risque Opportunite$")
	public void cliquer_sur_module_Risque_Opportunite() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		RisqueOppModele.cliquer_sur_module_Risque_Opportunité(driver);
	}

	@When("^cliquer sur sous module risque Opportunite$")
	public void cliquer_sur_sous_module_risque_Opportunite() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		RisqueOppModele.cliquer_sur_sous_module_risque_Opportunité(driver);
	}

	@When("^cliquer  sur ajouter Risque Opportunite$")
	public void cliquer_sur_ajouter_Risque_Opportunite() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		RisqueOppModele.cliquer_sur_ajouter_Risque_Opportunité(driver);
	}

	@When("^saisir Objet d incertitude$")
	public void saisir_Objet_d_incertitude() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		RisqueOppModele.saisir_Objet_d_incertitude(row,driver);
	}

	@When("^saisir  Objectif$")
	public void saisir_Objectif() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		RisqueOppModele.saisir_Objectif(driver, row);
	}

	@When("^saisir Source et Cause$")
	public void saisir_Source_et_Cause() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		RisqueOppModele.saisir_Source_Cause(driver, row);
	}

	@When("^saisir Evenement et Contexte$")
	public void saisir_Evenement_et_Contexte() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		RisqueOppModele.saisir_Evènement_Contexte(driver, row);
	}

	@When("^saisir  Enjeu et Consequence$")
	public void saisir_Enjeu_et_Consequence() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		RisqueOppModele.saisir_Enjeu_Conséquence(driver, row);
	}

	@When("^saisir  Domaine de risque$")
	public void saisir_Domaine_de_risque() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		RisqueOppModele.saisir_Domaine_de_risque(driver, row);
	}

	@When("^saisir Type dimpact des risques$")
	public void saisir_Type_dimpact_des_risques() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		 RisqueOppModele.saisir_Type_dimpact_des_risques(driver, row);
	}

	@When("^saisir  Site$")
	public void saisir_Site() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		RisqueOppModele.saisir_Site(driver, row);
	}

	@When("^saisir Processus$")
	public void saisir_Processus() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		RisqueOppModele.saisir_Processus(driver, row);
	}

	@When("^saisir Activite$")
	public void saisir_Activite() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		RisqueOppModele.saisir_Activité(driver, row);
	}

	@When("^saisir  Direction$")
	public void saisir_Direction() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		RisqueOppModele.saisir_Direction(driver, row);
	}

	@When("^saisir  Service$")
	public void saisir_Service() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		RisqueOppModele.saisir_Service(driver, row);
	}

	@When("^cliquer   valider$")
	public void cliquer_valider() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		RisqueOppModele.cliquer_valider(driver);
	}

	@Then("^Verifier l ajout de la fiche$")
	public void verifier_l_ajout_de_la_fiche() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		RisqueOppModele.verifier_l_ajout_de_la_fiche(driver, row);
	}

@When("^clique  sur agenda Risque$")
public void clique_sur_agenda_Risque() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	RisqueOppModele.clique_sur_agenda_Risque(driver);		 
}

@When("^cliquer sur Liste des evaluation des risques$")
public void cliquer_sur_Liste_des_evaluation_des_risques() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	RisqueOppModele.cliquer_sur_Liste_des_évaluation_des_risques_Opportunités_résiduel_le_s_brut_e_s(driver);
}

@When("^rechercher un fichier  risque Opportunite$")
public void rechercher_un_fichier_risque_Opportunite() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	RisqueOppModele.rechercher_un_fichier_risque_Opportunité(driver, row);
}

@When("^cliquer  sur fiche risque  opportunite$")
public void cliquer_sur_fiche_risque_opportunite() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
RisqueOppModele. cliquer_sur_fiche_risque_Opportunité(driver);
}

@When("^clique sur valider$")
public void clique_sur_valider() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	RisqueOppModele.cliquer_valider_evaluation_brute(driver);
}

@When("^cliquer  sur évalution brut$")
public void cliquer_sur_évalution_brut() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	RisqueOppModele.verifier_evaluation_brut(driver);
	
}

@When("^cliquer  sur évaluer$")
public void cliquer_sur_évaluer() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	RisqueOppModele.cliquer_sur_évaluer(driver);
}

@When("^choisir les notes  agenda$")
public void choisir_les_notes_et_agenda() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	RisqueOppModele.choisier_les_notes_agenda(row);
}

@When("^cliquer  valider evaluation brute$")
public void cliquer_valider_evaluation_brute() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	RisqueOppModele.cliquer_valider_evaluation_brute(driver);
}
@When("^Ajouter décision$")
public void Ajouter_décision() throws Throwable
{
	RisqueOppModele.ajouter_decision(driver, row);
}

@When("^cliquer sur Risque Opportunite$")
public void cliquer_sur_Risque_Opportunite() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	RisqueOppModele.cliquer_sur_ajouter_Risque_Opportunité(driver);
}

@When("^cliquer sous module risque Opportunite$")
public void cliquer_sous_module_risque_Opportunite() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	RisqueOppModele.rechercher_filtre_risque_opportunité(driver, row);
}



@When("^cliquer  sur Evaluation brute$")
public void cliquer_sur_Evaluation_brute() throws Throwable {
  RisqueOppModele.cliquer_sur_Evaluation_brute(driver);
}

@Then("^Verifier matrice saisie a partir de l agenda$")
public void verifier_matrice_saisie_a_partir_de_l_agenda() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	
	RisqueOppModele.verifier_matrice_saisie_à_partir_de_l_agenda(driver, row);
}

@When("^rechercher un fichier  risque Opportunite module$")
public void rechercher_un_fichier_risque_Opportunite_module() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	RisqueOppModele.rechercher_un_fichier_risque_Opportunité_module(driver, row);
}


@When("^cliquer Evaluation résiduelle$")
public void cliquer_Evaluation_résiduelle() throws Throwable {
	RisqueOppModele.cliquer_Evaluation_résiduelle(driver);	
}

@When("^cliquer  sur evaluer$")
public void cliquer_sur_evaluer() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	RisqueOppModele.cliquerEva(driver);
}

@When("^choisir les notes  module$")
public void choisir_les_notes_module() throws Throwable {
	RisqueOppModele.choisier_les_notes(row);
}

@When("^cliquer valider residuelle$")
public void cliquer_valider_residuelle() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	RisqueOppModele.evaleuerRes(driver);
}

@Then("^Verifier matrice$")
public void verifier_matrice() throws Throwable {
	RisqueOppModele.verifier_matrice(driver,row);
}



@Then("^Verifier formule saisie a partir de l agenda$")
public void verifier_formule_saisie_a_partir_de_l_agenda() throws Throwable {
	
RisqueOppModele.verifier_formule_saisie_a_partir_de_l_agenda(driver);

}

@Then("^Verifier matrice formule$")
public void verifier_matrice_formule() throws Throwable {
  RisqueOppModele.verifier_matrice_formule(driver);
	
	
}



}
