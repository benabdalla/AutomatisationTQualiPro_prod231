package com.qualiprobdd.e2etests.agenda.StepDefs;

import java.util.concurrent.TimeUnit;


import cucumber.api.java.en.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.qualiprobdd.e2etests.Documentation.pages.DocumentationPage;
import com.qualiprobdd.e2etests.Environnement.pages.IncidentPage;
import com.qualiprobdd.e2etests.Fournisseur.pages.EvalFourPage;
import com.qualiprobdd.e2etests.GRH.Pages.SatisPersonnelPage;
import com.qualiprobdd.e2etests.PNC.models.ModulePNCModel;
import com.qualiprobdd.e2etests.PNC.pages.ModulePNCPage;
import com.qualiprobdd.e2etests.ReclamationClient.Pages.ReclamationClientPage;
import com.qualiprobdd.e2etests.Risque.Page.RisqueOppPage;
import com.qualiprobdd.e2etests.agenda.Models.ModeleSommerAgenda;
import com.qualiprobdd.e2etests.agenda.Page.PageSommerAgenda;
import com.qualiprobdd.e2etests.audit.pages.ModuleAuditsPage;
import com.qualiprobdd.e2etests.indicateur.pages.IndicateurPage;
import com.qualiprobdd.e2etests.moduleAction.pages.FicheActionPage;
import com.qualiprobdd.e2etests.moduleReunion.pages.ModuleReunionPage;
import com.qualiprobdd.e2etests.util.Setup;



public class StepDefsSommAgenda {
	public WebDriver driver;

	public StepDefsSommAgenda() {
		driver = Setup.driver;
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		PageFactory.initElements(driver, DocumentationPage.class);
		PageFactory.initElements(driver, FicheActionPage.class);
		PageFactory.initElements(driver, ModuleAuditsPage.class);
		PageFactory.initElements(driver, RisqueOppPage.class);
		PageFactory.initElements(driver, IndicateurPage.class);
		PageFactory.initElements(driver, ModulePNCPage.class);
		PageFactory.initElements(driver, ReclamationClientPage.class);
		PageFactory.initElements(driver, EvalFourPage.class);
		PageFactory.initElements(driver, ModuleReunionPage.class);
		 PageFactory.initElements(driver, SatisPersonnelPage.class);
		 PageFactory.initElements(driver, IncidentPage.class);
		PageFactory.initElements(driver, PageSommerAgenda.class);
	}



@When("^Somme agenda documentation$")
public void somme_agenda_documentation() throws Throwable {
   ModeleSommerAgenda.somme_agenda_documentation(driver);
}

@When("^Somme agenda Action$")
public void somme_agenda_Action() throws Throwable {
	   ModeleSommerAgenda.somme_agenda_Action(driver);
}
@When("^Somme agenda Change Control$")
public void somme_agenda_Change_Control() throws Throwable {
ModeleSommerAgenda.somme_agenda_Change_Control();
}

@When("^Somme agenda Audit$")
public void somme_agenda_Audit() throws Throwable {
	   ModeleSommerAgenda.somme_agenda_Audit(driver);
}

@When("^Somme agenda Indicateur$")
public void somme_agenda_Indicateur() throws Throwable {
	ModeleSommerAgenda.somme_agenda_Indicateur(driver);
}

@When("^Somme agenda Risque Opportunité$")
public void somme_agenda_Risque_Opportunité() throws Throwable {
	ModeleSommerAgenda.somme_agenda_Risque_Opportunité(driver);
}

@When("^Somme agenda Pnc$")
public void somme_agenda_Pnc() throws Throwable {
	ModeleSommerAgenda.somme_agenda_Pnc(driver);
}

@When("^Somme agenda client$")
public void somme_agenda_client() throws Throwable {
	ModeleSommerAgenda.somme_agenda_client();
}

@When("^Somme agenda Fournisseur$")
public void somme_agenda_Fournisseur() throws Throwable {
	ModeleSommerAgenda.somme_agenda_Fournisseur();
}

@When("^Somme agenda Réunion$")
public void somme_agenda_Réunion() throws Throwable {
	ModeleSommerAgenda.somme_agenda_Réunion();
}

@When("^Somme agenda Métrologie$")
public void somme_agenda_Métrologie() throws Throwable {
	ModeleSommerAgenda.somme_agenda_Métrologie();
}

@When("^Somme agenda GRH$")
public void somme_agenda_GRH() throws Throwable {
	ModeleSommerAgenda.somme_agenda_GRH();
}

@When("^Somme agenda partie interesséss$")
public void somme_agenda_partie_interesséss() throws Throwable {
	ModeleSommerAgenda.somme_agenda_partie_interesséss(driver);
}

@When("^Somme agenda Achat$")
public void somme_agenda_Achat() throws Throwable {
	ModeleSommerAgenda.somme_agenda_Achat();
}

@When("^Somme agenda Environnement$")
public void somme_agenda_Environnement() throws Throwable {
	ModeleSommerAgenda.somme_agenda_Environnement(driver);
}

@When("^Somme agenda Sécurite$")
public void somme_agenda_Sécurite() throws Throwable {
	ModeleSommerAgenda.somme_agenda_Sécurite(driver);
}


@When("^Somme   agenda Réglementation$")
public void somme_agenda_Réglementation() throws Throwable {
	ModeleSommerAgenda.somme_agenda_Réglementation(driver);

}
}
