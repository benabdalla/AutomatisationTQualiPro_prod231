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
	@And("^Selectionner date cr??ation$")
	public void Selectionner_date_cr??ation() throws Throwable {
		EvalFourModel.Selectionner_date_cr??ation(driver);
	}
	@And("^Choisir site$")
	public void Choisir_site() throws Throwable {
		EvalFourModel.Choisir_site(driver);
	}
	@And("^Choisir processus$")
	public void Choisir_processus() throws Throwable {
		EvalFourModel.Choisir_processus(driver);
	}
	@And("^Choisir activit??$")
	public void Choisir_activit??() throws Throwable {
		EvalFourModel.Choisir_activit??(driver);
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
	@Then("^V??rifier la cr??ation de la fiche evaluation fournisseur$")
		public void V??rifier_la_cr??ation_de_la_fiche_evaluation_fournisseur() throws Exception {
				WebElement NumFiche=driver.findElement(By.id("ctl00_ContentPlaceHolder1_Text_neval"));
		Actions action = new Actions(driver);
		action.moveToElement(NumFiche).perform();
		ExcelUtils.setExcelFile(Path, "EvalFRN");
		ExcelUtils.setCellData1(NumFiche.getText(), row , 2 , Path,"EvalFRN") ;
		Common.Exporter_visibilit??("Fiche ??valuation fournisseur:"+NumFiche.getText());
		Common.Exporter_champ_A_masquer("Fiche ??valuation fournisseur: "+NumFiche.getText());
		assertTrue(!(NumFiche.getText().equals("")));
		System.out.println("La fiche ??valuation fournisseur N:"+ NumFiche.getText() + "est Ajoute");
		Common.Exporter_numFiche("La fiche ??valuation fournisseur N:"+ NumFiche.getText());
	}
	@And("^V??rifier laffichage du message que la somme de coefficient des crit??res de type de produit est correcte$")
	public void V??rifier_laffichage_du_message_que_la_somme_de_coefficient_des_crit??res_de_type_de_produit_est_correcte() throws Throwable {
		try{
			driver.findElement(By.id("ctl00_ContentPlaceHolder1_Label7")).isDisplayed();
			assertTrue(driver.findElement(By.id("ctl00_ContentPlaceHolder1_Label7")).getText().equals("Vous ne pouvez pas faire l'??valuation parce que la somme des coefficients des crit??res n'est pas ??gale ?? 100."));
			}catch (NoSuchElementException e) {
			System.out.println("Cette fiche peut ??tre ??valu??");
		}
		
	}
	@And("^V??rifier historique des ??valuations$")
	public void V??rifier_historique_des_??valuations() throws Throwable {
		EvalFourModel.V??rifier_historique(driver,col);
		
	}
	@And("^Rattacher Piece Jointe$")
	public void Rattacher_Piece_Jointe() throws Throwable {
		EvalFourModel.Rattacher_PJ();
	}
	@And("^Rattacher des non conformit??s$")
	public void Rattacher_des_non_conformit??s() throws Throwable {
		EvalFourModel.Rattacher_NC(driver);
	}
	@And("^Rattacher des r??clamations fournisseur$")
	public void Rattacher_des_r??clamations_fournisseur() throws Throwable {
		EvalFourModel.Rattacher_RF(driver);
	}
	@And("^Rattacher une piece jointe$")
	public void Rattacher_une_piece_jointe() throws Throwable {
		
	}
	@When("^Connecter en tant que responsable (\\d+)$")
	public void connecter_en_tant_que_responsable(int arg1) throws Throwable {
		ExcelUtils.setExcelFile(Path, "Crit??reTypeProduit");
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
		ExcelUtils.setExcelFile(Path, "Crit??reTypeProduit");
		System.out.println(" numEval  "+NumEval);
		String critere=ExcelUtils.getCellData(arg1,0);
		System.out.println(" criterel  "+critere);
		String note=ExcelUtils.getCellData(arg1,2);
		System.out.println(" note  "+note);
		col=arg3;
		EvalFourModel.Evaluer_crit??re(critere,NumEval,driver,note,arg3);
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

	@Then("^V??rifier les notes saisies et la saise du note globale et (\\d+)$")
	public void V??rifier_les_notes_saisies_et_la_saise_du_note_globale_et(int arg1) throws Throwable {
		EvalFourModel.V??rifier_note(Path,driver,arg1,col);
	}


	@Then("^Consulter Aper??u$")
	public void consulter_Aper??u() throws Throwable {
	
	}

	@Then("^V??rifier la coh??rence des donn??es$")
	public void v??rifier_la_coh??rence_des_donn??es() throws Throwable {
	
	}

	@Then("^Verifier le reporting moyenne des fournisseurs$")
	public void verifier_le_reporting_moyenne_des_fournisseurs() throws Throwable {
	    
	}

	@Then("^Verifier le reporting historique des moyennes$")
	public void verifier_le_reporting_historique_des_moyennes() throws Throwable {

	}

	@Then("^Verifier la rubrique exportation ??valuation des fournisseurs$")
	public void verifier_la_rubrique_exportation_??valuation_des_fournisseurs() throws Throwable {
	
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

	@When("^Saisir la periodicit??$")
	public void saisir_la_periodicit??() throws Throwable {
		ExcelUtils.setExcelFile(Path, "EvalFRN");
		String perio=ExcelUtils.getCellData(row,3);
		EvalFourModel.saisir_la_periodicit??(perio);
	}
	
	@When("^Saisir la periodicit?? null$")
	public void saisir_la_periodicit??_null() throws Throwable {
		ExcelUtils.setExcelFile(Path, "EvalFRN");
		String perio="";
		EvalFourModel.saisir_la_periodicit??(perio);
	}

	@When("^Saisir la date de d??but$")
	public void saisir_la_date_de_d??but() throws Throwable {
		ExcelUtils.setExcelFile(Path, "EvalFRN");
		String dated=ExcelUtils.getCellData(row,4);
		EvalFourModel.saisirdated??but(dated, driver);
		Thread.sleep(500);
	}

	@When("^Cliquer valider type produit$")
	public void cliquer_valider_type_produit() throws Throwable {
		EvalFourModel.validertypeproduit();
		Thread.sleep(1000);
	}

	@When("^Consulter crit??respar type$")
	public void consulter_crit??respar_type() throws Throwable {
		
		EvalFourModel.consultercrit??respartype(driver);
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

	@When("^ajouter type de produit agr??e$")
	public void ajouter_type_de_produit_agr??e() throws Throwable {
		ExcelUtils.setExcelFile(Path, "EvalFRN");
		String type=ExcelUtils.getCellData(row,1);
		EvalFourModel.ajouter_type_de_produit_agr??e(driver, type);
	}
	
	@Then("^supprimer type de produit agr??e$")
	public void supprimer_type_de_produit_agr??e() throws Throwable {
		ExcelUtils.setExcelFile(Path, "EvalFRN");
		String type=ExcelUtils.getCellData(row,1);
		EvalFourModel.supprimer_type_de_produit_agr??e(driver, type);
	}

	@Then("^V??rifier existence d une fiche evaluation$")
	public void v??rifier_existence_d_une_fiche_evaluation() throws Throwable {
		ExcelUtils.setExcelFile(Path, "EvalFRN");
		String frn=ExcelUtils.getCellData(row,0);
		String type=ExcelUtils.getCellData(row,1);
		EvalFourModel.v??rifier_existence_d_une_fiche_evaluation(frn, type);
	}
}
