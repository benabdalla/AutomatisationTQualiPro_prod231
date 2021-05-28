package com.qualiprobdd.e2etests.moduleReunion.stepdefs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.qualiprobdd.e2etests.moduleReunion.models.typeréunionmodel;
import com.qualiprobdd.e2etests.moduleReunion.pages.ModuleReunionPage;
import com.qualiprobdd.e2etests.moduleReunion.pages.typeréunionpage;
import com.qualiprobdd.e2etests.util.Setup;

import cucumber.api.java.en.*;


public class TypeRéunionStepDef {
	public WebDriver driver;
	public TypeRéunionStepDef() {
		driver = Setup.driver;
		PageFactory.initElements(driver, typeréunionpage.class);
	}
	
	@When("^consulter type de réunion$")
	public void consulter_type_de_réunion() throws Throwable {
		typeréunionmodel.Consulter_typ_réunion();
	}

	@When("^ajouter type réunion$")
	public void ajouter_type_réunion() throws Throwable {
		typeréunionmodel.ajouter_type_réunion();
	}

	@When("^saisir type de réunion$")
	public void saisir_type_de_réunion() throws Throwable {
		typeréunionmodel.saisir_type_réunion();
	}

	@When("^saisir périodicité$")
	public void saisir_périodicité() throws Throwable {
		typeréunionmodel.saisir_périodicité();
	}

	@When("^saisir source$")
	public void saisir_source() throws Throwable {
		typeréunionmodel.saisir_Source();
	}

	@When("^valider type$")
	public void valider_type() throws Throwable {
		typeréunionmodel.valider_typeréunion();
	}

	
	@Then("^type ajouté$")
	public void type_ajouté() throws Throwable {
		typeréunionmodel.retour_typeréunion();
		typeréunionmodel.filtre_typeréunion();
		typeréunionmodel.recherche_typeréunion();
		typeréunionmodel.resultat_typeréunion();
	}


}
