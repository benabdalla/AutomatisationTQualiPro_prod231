package com.qualiprobdd.e2etests.Formation.Stepdefs;

import java.util.concurrent.TimeUnit;

import com.qualiprobdd.e2etests.util.Common;
import cucumber.api.java.en.*;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.interactions.Actions;


import com.qualiprobdd.e2etests.Formation.Models.DemandeFormationModel;
import com.qualiprobdd.e2etests.Formation.Pages.DemandeFormationPage;
import com.qualiprobdd.e2etests.authentification.models.AuthentificationModel;
import com.qualiprobdd.e2etests.util.ExcelUtils;
import com.qualiprobdd.e2etests.util.Setup;


public class DemandeFormationStepDef {
	public WebDriver driver;
	private static String Path = "resources/testData/TestData.xlsx";
	static int row;

	public DemandeFormationStepDef() {
		driver = Setup.driver;
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 PageFactory.initElements(driver, DemandeFormationPage.class);
	}

	@When("^Consulter module GRH$")
	public void consulter_module_GRH() throws Throwable {
		DemandeFormationModel.consulter_MGRH(driver);
	}

	@When("^consulter sous module formations$")
	public void consulter_sous_module_formations() throws Throwable {
		DemandeFormationModel.consulter_SM_Formation(driver);
		Thread.sleep(1000L);
		
	}

	@When("^consulter filtre demande de formation$")
	public void consulter_filtre_demande_de_formation() throws Throwable {
		//Actions action = new Actions(driver);
		//action.moveToElement(DemandeFormationPage.MDFORID).perform();
		DemandeFormationModel.consulter_SSM_DemandeFormation(driver);
		
	}

	@When("^cliquer sur ajouter fiche demande de formation$")
	public void cliquer_sur_ajouter_fiche_demande_de_formation() throws Throwable {
		DemandeFormationModel.cliquer_sur_ajouter_fiche_Dformation(driver);
	}
	
	@Then("^vérifier que le déclencheur est celui qui a connecté$")
	public void vérifier_que_le_déclencheur_est_celui_qui_a_connecté() throws Throwable {
		DemandeFormationModel.Verifier_demandeur(driver);
	}

	@When("^saisir (\\d+) a traiter$")
	public void saisir_a_traiter(int arg1) throws Throwable {
	  row=arg1;
	}

	

	@When("^Saisir date de prévue de la formation$")
	public void saisir_date_de_prévue_de_la_formation() throws Throwable {
		DemandeFormationModel.saisir_date_formation_prevu(driver);
	}

	@When("^choisir theme$")
	public void choisir_theme() throws Throwable {
		
		ExcelUtils.setExcelFile(Path, "DemandeFormation");
		String theme=ExcelUtils.getCellData(row,2);
		DemandeFormationModel.choisir_theme(theme);
	}

	@When("^Choisir organisme$")
	public void choisir_organisme() throws Throwable {
	   DemandeFormationModel.choisir_organisme();
	}

	@When("^choisir la societe$")
	public void choisir_la_societe() throws Throwable {
	DemandeFormationModel.choisir_societe();
	}

	@When("^choisir le site$")
	public void choisir_le_site() throws Throwable {
		ExcelUtils.setExcelFile(Path, "DemandeFormation");
		String site=ExcelUtils.getCellData(row,0);
		DemandeFormationModel.choisir_site(site,driver);
	}

	@When("^choisir le processus$")
	public void choisir_le_processus() throws Throwable {
		ExcelUtils.setExcelFile(Path, "DemandeFormation");
		String processus=ExcelUtils.getCellData(row,1);
		DemandeFormationModel.choisir_processus(processus,driver);
	}

	@When("^choisir l’activité$")
	public void choisir_l_activité() throws Throwable {
		DemandeFormationModel.choisir_activite(driver);
	}

	@When("^choisir la direction$")
	public void choisir_la_direction() throws Throwable {
		DemandeFormationModel.choisir_direction(driver);
	}

	@When("^choisir le service$")
	public void choisir_le_service() throws Throwable {
		DemandeFormationModel.choisir_service(driver);
	}

	@When("^Choisir type de formation$")
	public void choisir_type_de_formation() throws Throwable {
		ExcelUtils.setExcelFile(Path, "DemandeFormation");
		String type=ExcelUtils.getCellData(row,3);
		DemandeFormationModel.choisir_typeFormation(type);
	}

	@When("^Saisir nbre de jours estimé$")
	public void saisir_nbre_de_jours_estimé() throws Throwable {
		ExcelUtils.setExcelFile(Path, "DemandeFormation");
		String nbrej=ExcelUtils.getCellData(row,4);
		DemandeFormationModel.saisir_nbre_jour(nbrej);
	}

	@When("^Choisir Formateur$")
	public void choisir_Formateur() throws Throwable {
		DemandeFormationModel.saisir_formateur();
	}

	@When("^saisir le cout$")
	public void saisir_le_cout() throws Throwable {
		ExcelUtils.setExcelFile(Path, "DemandeFormation");
		String cout=ExcelUtils.getCellData(row,5);
		DemandeFormationModel.saisir_cout(cout);;
	}

	@When("^saisir le lieu$")
	public void saisir_le_lieu() throws Throwable {
		DemandeFormationModel.saisir_Lieu();
	}

	@When("^saisir les objectifs de formation$")
	public void saisir_les_objectifs_de_formation() throws Throwable {
		ExcelUtils.setExcelFile(Path, "DemandeFormation");
		String obj="objectif formation "+ Common.paragraphe(12,10);
				ExcelUtils.setCellData1(obj,row,6,Path);
		DemandeFormationModel.saisir_objectif(obj);
	}

	@When("^cliquer ajouter participant$")
	public void cliquer_ajouter_participant() throws Throwable {
		DemandeFormationModel.ajouter_participant(driver);
	}
	


	@When("^ajouter participants$")
	public void cliquer_ajouter_un_groupe_de_travail() throws Throwable {
		WebElement tableRow = DemandeFormationPage.TableParID.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_der\"]/tbody/tr[1]"));
	    WebElement cellIneed = tableRow.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_der\"]/tbody/tr[1]/td[1]"));
	    WebElement cellIneed1 = cellIneed.findElement(By.tagName("input"));
	    //added by rahma
	    JavascriptExecutor  executor = (JavascriptExecutor)driver;
	    executor.executeScript("arguments[0].click()", cellIneed1);
	   // cellIneed1.click();
	    tableRow = DemandeFormationPage.TableParID.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_der\"]/tbody/tr[2]"));
	    cellIneed = tableRow.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_der\"]/tbody/tr[2]/td[1]"));
	    cellIneed1 = cellIneed.findElement(By.tagName("input"));
	    //added by rahma
	    //cellIneed1.click();
	    executor.executeScript("arguments[0].click()", cellIneed1);
	    executor.executeScript("arguments[0].click()", DemandeFormationPage.VldPartID);
	    //DemandeFormationPage.VldPartID.click();
	}



	@When("^cliquer sur valider fiche demande$")
	public void cliquer_sur_valider_fiche_demande() throws Throwable {
		DemandeFormationModel.valider_demande_formation(driver);
	}

	@Then("^vérifier demande de formation ajoutée$")
	public void vérifier_demande_de_formation_ajoutée() throws Throwable {
		DemandeFormationModel.verifier_demande_formation();
	}
	
	@Then("^Vérifier Responsable Validation$")
	public void vérifier_Responsable_Validation() throws Throwable {
		Actions action = new Actions(driver);
		action.moveToElement(DemandeFormationPage.RespTableID).perform();
		DemandeFormationModel.Recuperer_RV();
		DemandeFormationModel.Vérifier_RV(row);
		
	}

	@Then("^valider fiche demande de formation par les responsables de validation$")
	public void valider_fiche_demande_de_formation_par_les_responsables_de_validation() throws Throwable {
		String demand=DemandeFormationModel.Recuperer_utilisateur();
		
		int i=7;
		ExcelUtils.setExcelFile(Path, "DemandeFormation");
		String curResp=ExcelUtils.getCellData(row,i);
		while(!(curResp.equals("")))
		{
			System.out.println("resp: "+ curResp);
			System.out.println("demandeur: "+ demand);
			System.out.println(curResp);
			if (demand.equals(curResp))
			{
				DemandeFormationModel.Verifier_compteur_agenda_DA(driver);
				
			}else
			{
				//added by rahma
				JavascriptExecutor  executor = (JavascriptExecutor)driver;
				WebDriverWait wait = new WebDriverWait(driver,120);
		        wait.until(ExpectedConditions.visibilityOf(DemandeFormationPage.CompteID));
		        //DemandeFormationPage.CompteID.click();
		        
		        executor.executeScript("arguments[0].click()", DemandeFormationPage.CompteID);


		        //added by rahma
		        wait.until(ExpectedConditions.visibilityOf(DemandeFormationPage.DeconnID));

				//DemandeFormationPage.DeconnID.click();
		        executor.executeScript("arguments[0].click()", DemandeFormationPage.DeconnID);
				Thread.sleep(3000L);

				AuthentificationModel.Changer_Compte(curResp,driver);
				System.out.println("ok");
				Thread.sleep(2000L);
			}
		
			DemandeFormationModel.Acceder_Demande(driver);	
		i++;
		ExcelUtils.setExcelFile(Path, "DemandeFormation");
		curResp=ExcelUtils.getCellData(row,i);
		}
	}

	@Then("^vérifier l’ajout de la fiche formation au niveau du planning des demandes de formations$")
	public void vérifier_l_ajout_de_la_fiche_formation_au_niveau_du_planning_des_demandes_de_formations() throws Throwable {
	
	}

	@Then("^Insérer Numéro fiche formation En Excel$")
	public void insérer_Numéro_fiche_formation_En_Excel() throws Throwable {

	}

	@Then("^consulter aperçu fiche demande de formation$")
	public void consulter_aperçu_fiche_demande_de_formation() throws Throwable {
	
	}

	@Then("^exporter l’aperçu$")
	public void exporter_l_aperçu() throws Throwable {
	
	}


}
