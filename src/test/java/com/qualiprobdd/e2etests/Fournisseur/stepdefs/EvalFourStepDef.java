package com.qualiprobdd.e2etests.Fournisseur.stepdefs;

import static org.testng.Assert.assertTrue;


import com.qualiprobdd.e2etests.Formation.Models.FormationModel;
import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import com.qualiprobdd.e2etests.Fournisseur.models.EvalFourModel;
import com.qualiprobdd.e2etests.Fournisseur.pages.EvalFourPage;
import com.qualiprobdd.e2etests.util.Common;
import com.qualiprobdd.e2etests.util.ExcelUtils;
import com.qualiprobdd.e2etests.util.Setup;


public class EvalFourStepDef {
	

	public WebDriver driver;
	private static String Path = "resources/testData/TestData.xlsx";
	static int row;
	
	
	
	public EvalFourStepDef() {
		driver = Setup.driver;
		PageFactory.initElements(driver, EvalFourPage.class);
	}
	
	@When("^Consulter Fournisseur$")
	public void Consulter_Fournisseur() throws Throwable {
		EvalFourModel.Consulter_Fournisseur(driver);
	}
	
	@And("^Consulter Evaluation Fournisseur$")
	public void Consulter_Evaluation_Fournisseur() throws Throwable {
		EvalFourModel.Consulter_Evaluation_Fournisseur(driver);
	}
	@And("^Cliquer sur ajouter evaluation$")
	public void Cliquer_sur_ajouter_evaluation() throws Throwable {
		EvalFourModel.Ajouter_evaluation();
	}
	@And("^lire (\\d+) depuis Excel$")
	public void lire_depuis_Excel(int arg1) throws Throwable {
				row=arg1;
				
	}
	@And("^Selectionner fournisseur$")
	public void Selectionner_fournisseur() throws Throwable {
		ExcelUtils.setExcelFile(Path, "EvalFRN");
		String FRN=ExcelUtils.getCellData(row,0);
		EvalFourModel.Selectionner_fournisseur(FRN,driver);
	}
	@And("^Selectionner type produit$")
	public void Selectionner_type_produit() throws Throwable {
		ExcelUtils.setExcelFile(Path, "EvalFRN");
		String typPdt=ExcelUtils.getCellData(row,1);
		EvalFourModel.Selectionner_type_produit(typPdt);
	}
	@And("^Selectionner date création$")
	public void Selectionner_date_création() throws Throwable {
		EvalFourModel.Selectionner_date_création(driver);
	}
	@And("^Choisir site$")
	public void Choisir_site() throws Throwable {
		EvalFourModel.Choisir_site(driver);
	}
	@And("^Choisir processus$")
	public void Choisir_processus() throws Throwable {
		EvalFourModel.Choisir_processus(driver);
	}
	@And("^Choisir activité$")
	public void Choisir_activité() throws Throwable {
		EvalFourModel.Choisir_activité(driver);
	}
	@And("^Choisir direction$")
	public void Choisir_direction() throws Throwable {
		EvalFourModel.Choisir_direction(driver);
	}
	@And("^Choisir service$")
	public void Choisir_service() throws Throwable {
		EvalFourModel.Choisir_service(driver);
	}
	@And("^Cliquer sur valider$")
	public void Cliquer_sur_valider() throws Throwable {
		EvalFourModel.Valider_Evaluation(driver);
	}
	@Then("^Vérifier la création de la fiche evaluation fournisseur$")
		public void Vérifier_la_création_de_la_fiche_evaluation_fournisseur() throws Exception {
				WebElement NumFiche=driver.findElement(By.id("ctl00_ContentPlaceHolder1_Text_neval"));
		Actions action = new Actions(driver);
		action.moveToElement(NumFiche).perform();
		ExcelUtils.setExcelFile(Path, "EvalFRN");
		ExcelUtils.setCellData1(NumFiche.getText(), row , 2 , Path,"EvalFRN") ;
		Common.Exporter_visibilité("Fiche évaluation fournisseur:"+NumFiche.getText());
		Common.Exporter_champ_A_masquer("Fiche évaluation fournisseur: "+NumFiche.getText());
		assertTrue(!(NumFiche.getText().equals("")));
		System.out.println("La fiche évaluation fournisseur N:"+ NumFiche.getText() + "est Ajoute");
		Common.Exporter_numFiche("La fiche évaluation fournisseur N:"+ NumFiche.getText());
	}
	@And("^Vérifier laffichage du message que la somme de coefficient des critères de type de produit est correcte$")
	public void Vérifier_laffichage_du_message_que_la_somme_de_coefficient_des_critères_de_type_de_produit_est_correcte() throws Throwable {
		try{
			driver.findElement(By.id("ctl00_ContentPlaceHolder1_Label7")).isDisplayed();
			assertTrue(driver.findElement(By.id("ctl00_ContentPlaceHolder1_Label7")).getText().equals("Vous ne pouvez pas faire l'évaluation parce que la somme des coefficients des critères n'est pas égale à 100."));
			}catch (NoSuchElementException e) {
			System.out.println("Cette fiche peut être évalué");
		}
		
	}
	@And("^Vérifier historique des évaluations$")
	public void Vérifier_historique_des_évaluations() throws Throwable {
		EvalFourModel.Vérifier_historique(driver,col);
		
	}
	@And("^Rattacher Piece Jointe$")
	public void Rattacher_Piece_Jointe() throws Throwable {
		EvalFourModel.Rattacher_PJ();
	}
	@And("^Rattacher des non conformités$")
	public void Rattacher_des_non_conformités() throws Throwable {
		EvalFourModel.Rattacher_NC(driver);
	}
	@And("^Rattacher des réclamations fournisseur$")
	public void Rattacher_des_réclamations_fournisseur() throws Throwable {
		EvalFourModel.Rattacher_RF(driver);
	}
	@And("^Rattacher une piece jointe$")
	public void Rattacher_une_piece_jointe() throws Throwable {
		
	}
	@When("^Connecter en tant que responsable (\\d+)$")
	public void connecter_en_tant_que_responsable(int arg1) throws Throwable {
		ExcelUtils.setExcelFile(Path, "CritèreTypeProduit");
		String responsable=ExcelUtils.getCellData(arg1,1);
		System.out.println(responsable);
	   FormationModel.Connecter_en_tant_que(responsable,driver);
	}
	@When("^Consulter agenda evaluation fournisseur$")
	public void consulter_agenda_evaluation_fournisseur() throws Throwable {
		EvalFourModel.Consulter_agenda(driver);
	}

	@When("^Consulter type produit (\\d+)$")
	public void consulter_type_produit(int arg1) throws Throwable {
		ExcelUtils.setExcelFile(Path, "EvalFRN");
		String typPdt=ExcelUtils.getCellData(arg1,1);
		EvalFourModel.consulter_type_produit(typPdt, driver);
	}
public  static int col =0;
	@When("^Evaluer (\\d+) de la fiche (\\d+) et (\\d+)$")
	public void evaluer_de_la_fiche(int arg1,int arg2,int arg3) throws Throwable {
		ExcelUtils.setExcelFile(Path, "EvalFRN");
		String NumEval=ExcelUtils.getCellData(arg2,2);
		System.out.println(" numEval  "+NumEval);
		ExcelUtils.setExcelFile(Path, "CritèreTypeProduit");
		System.out.println(" numEval  "+NumEval);
		String critere=ExcelUtils.getCellData(arg1,0);
		System.out.println(" criterel  "+critere);
		String note=ExcelUtils.getCellData(arg1,2);
		System.out.println(" note  "+note);
		col=arg3;
		EvalFourModel.Evaluer_critère(critere,NumEval,driver,note,arg3);
	}

	@When("^Consulter fiche (\\d+)$")
	public void consulter_fiche(int arg1) throws Throwable {
		Thread.sleep(1000);
		ExcelUtils.setExcelFile(Path, "EvalFRN");
		String FRN=ExcelUtils.getCellData(arg1,0);
		String TypePdt=ExcelUtils.getCellData(arg1,1);
		String Num_Eval=ExcelUtils.getCellData(arg1,2);
		EvalFourModel.consulter_fiche(FRN,TypePdt,Num_Eval);
	}

	@Then("^Vérifier les notes saisies et la saise du note globale et (\\d+)$")
	public void Vérifier_les_notes_saisies_et_la_saise_du_note_globale_et(int arg1) throws Throwable {
		EvalFourModel.Vérifier_note(Path,driver,arg1,col);
	}


	@Then("^Consulter Aperçu$")
	public void consulter_Aperçu() throws Throwable {
	
	}

	@Then("^Vérifier la cohérence des données$")
	public void vérifier_la_cohérence_des_données() throws Throwable {
	
	}

	@Then("^Verifier le reporting moyenne des fournisseurs$")
	public void verifier_le_reporting_moyenne_des_fournisseurs() throws Throwable {
	    
	}

	@Then("^Verifier le reporting historique des moyennes$")
	public void verifier_le_reporting_historique_des_moyennes() throws Throwable {

	}

	@Then("^Verifier la rubrique exportation évaluation des fournisseurs$")
	public void verifier_la_rubrique_exportation_évaluation_des_fournisseurs() throws Throwable {
	
	}

	@When("^Consulter type produit$")
	public void consulter_type_produit() throws Throwable {
		EvalFourModel.consultertypeproduit(driver);
	}

	@When("^Cliquer Ajouter type produit$")
	public void cliquer_Ajouter_type_produit() throws Throwable {
		EvalFourModel.Ajoutertypeproduit();
	}
	
	@When("^Saisir nom type produit$")
	public void saisir_nom_type_produit() throws Throwable {
		ExcelUtils.setExcelFile(Path, "EvalFRN");
		String TypPdt=ExcelUtils.getCellData(row,1);
		EvalFourModel.saisirNomType(TypPdt,18,Path,row);
		
	}

	@When("^Saisir la periodicité$")
	public void saisir_la_periodicité() throws Throwable {
		ExcelUtils.setExcelFile(Path, "EvalFRN");
		String perio=ExcelUtils.getCellData(row,3);
		EvalFourModel.saisir_la_periodicité(perio);
	}
	
	@When("^Saisir la periodicité null$")
	public void saisir_la_periodicité_null() throws Throwable {
		ExcelUtils.setExcelFile(Path, "EvalFRN");
		String perio="";
		EvalFourModel.saisir_la_periodicité(perio);
	}

	@When("^Saisir la date de début$")
	public void saisir_la_date_de_début() throws Throwable {
		ExcelUtils.setExcelFile(Path, "EvalFRN");
		String dated=ExcelUtils.getCellData(row,4);
		EvalFourModel.saisirdatedébut(dated, driver);
		Thread.sleep(500);
	}

	@When("^Cliquer valider type produit$")
	public void cliquer_valider_type_produit() throws Throwable {
		EvalFourModel.validertypeproduit();
		Thread.sleep(1000);
	}

	@When("^Consulter critèrespar type$")
	public void consulter_critèrespar_type() throws Throwable {
		
		EvalFourModel.consultercritèrespartype(driver);
	}

	@When("^Selection type de produit$")
	public void selection_type_de_produit() throws Throwable {
		ExcelUtils.setExcelFile(Path, "EvalFRN");
		String TypPdt=ExcelUtils.getCellData(row,1);
		EvalFourModel.selection_type_de_produit(TypPdt);
	}

	@When("^Ajouter criteres$")
	public void ajouter_criteres() throws Throwable {
		EvalFourModel.ajouter_criteres(Path);
	}

	@When("^Consulter Module fournisseur$")
	public void consulter_Module_fournisseur() throws Throwable {
		EvalFourModel.consulter_Module_fournisseur(driver);
	}

	@When("^consulter fiche fournisseur$")
	public void consulter_fiche_fournisseur() throws Throwable {
		ExcelUtils.setExcelFile(Path, "EvalFRN");
		String frn=ExcelUtils.getCellData(row,0);
		EvalFourModel.consulter_fiche_fournisseur(frn);
	}

	@When("^ajouter type de produit agrée$")
	public void ajouter_type_de_produit_agrée() throws Throwable {
		ExcelUtils.setExcelFile(Path, "EvalFRN");
		String type=ExcelUtils.getCellData(row,1);
		EvalFourModel.ajouter_type_de_produit_agrée(driver, type);
	}
	
	@Then("^supprimer type de produit agrée$")
	public void supprimer_type_de_produit_agrée() throws Throwable {
		ExcelUtils.setExcelFile(Path, "EvalFRN");
		String type=ExcelUtils.getCellData(row,1);
		EvalFourModel.supprimer_type_de_produit_agrée(driver, type);
	}

	@Then("^Vérifier existence d une fiche evaluation$")
	public void vérifier_existence_d_une_fiche_evaluation() throws Throwable {
		ExcelUtils.setExcelFile(Path, "EvalFRN");
		String frn=ExcelUtils.getCellData(row,0);
		String type=ExcelUtils.getCellData(row,1);
		EvalFourModel.vérifier_existence_d_une_fiche_evaluation(frn, type);
	}
}
