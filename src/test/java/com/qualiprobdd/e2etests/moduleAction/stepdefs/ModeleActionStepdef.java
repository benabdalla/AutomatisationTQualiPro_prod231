package com.qualiprobdd.e2etests.moduleAction.stepdefs;

import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import io.cucumber.java.en.*;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


import com.qualiprobdd.e2etests.moduleAction.models.FicheActionModele;
import com.qualiprobdd.e2etests.moduleAction.models.ModeleActionModel;
import com.qualiprobdd.e2etests.moduleAction.pages.FicheActionPage;
import com.qualiprobdd.e2etests.moduleAction.pages.ModeleActionPage;
import com.qualiprobdd.e2etests.util.Common;
import com.qualiprobdd.e2etests.util.RTFUtil;
import com.qualiprobdd.e2etests.util.Setup;



public class ModeleActionStepdef {
	public WebDriver driver;
	//private static String Path = "resources/testData/TestData.xlsx";
	static int row;
	private Common common = new Common();
	public String Num_Modele;
	public ModeleActionStepdef() {
		driver = Setup.driver;
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 PageFactory.initElements(driver, ModeleActionPage.class);
	}

	@When("^Consulter Modèle Action$")
	public void Consulter_Modèle_Action() throws Throwable
	{
		ModeleActionModel.consulter_Modele_Action(driver);
	}

	@When("^cliquer sur ajouter modèle Action$")
	public void cliquer_sur_ajouter_modèle_Action() throws Throwable
	{
		row=1;
		ModeleActionModel.ajouter_modele(driver);	
	}
	
	@When("^saisir délais de réalisation modele$")
	public void saisir_délais_de_réalisation_modele() throws Throwable 
	{
		ModeleActionModel.saisir_delai_realisation();
	}
	
	@When("^choisir délais de suivi modele$")
	public void choisir_délais_de_suivi_modele() throws Throwable {
		ModeleActionModel.saisir_delai_suivi();		
	}
	
	@When("^choisir direction modele$")
	public void choisir_direction_modele() throws Throwable {
		ModeleActionModel.selectionnerDirection(driver);
	}
	
	@When("^saisir cout sous action$")
	public void saisir_cout_sous_action()throws Throwable 
	{
		ModeleActionModel.saisir_cout();
	}
	
	@When("^choisir Types causes$")
	public void choisir_Types_causes()throws Throwable {
		FicheActionModele.rattacher_Type_cause(driver, row);
		
	}
	
	@Then("^récuperer numéro fiche$")
	public void récuperer_numéro_fiche() throws Throwable {
		Num_Modele=ModeleActionPage.NumModele.getText();
		System.out.println("numero: "+Num_Modele);
	}
	
	@When("^rattacher \"([^\"]*)\" action$")
	public void rattacher_action(String arg1) throws Throwable {
		ModeleActionModel.rattacherr_modele(arg1,driver);
	}
	@When("^rattacher modele action$")
	public void rattacher_modele_action() throws Throwable {
		System.out.println("Numero2: "+ Num_Modele);
		ModeleActionModel.rattacherr_modele(Num_Modele,driver);
	}
 	@And("^Vérifier Site$")
 	public void Vérifier_Site() throws Throwable {
	try {
			FicheActionPage.siteId.isDisplayed();
			Common.Exporter_visibilité("le site est visible");
			Select select = new Select(FicheActionPage.siteId);
			if(select.getFirstSelectedOption().getText().equals("")) 
			{
				select.selectByVisibleText("SITE AUTO");
			   String text=driver.findElement(By.id("ctl00_ContentPlaceHolder1_lbsite2")).getText();
			   if(text.indexOf('*')!=-1) 
				{
					
					Common.Exporter_visibilité("le site n'est pas obligatoire");
				}else 
			{
				Common.Exporter_visibilité("le site n'est pas obligatoire");
			}
			}
			}
			catch (NoSuchElementException e) {
				Common.Exporter_visibilité("le site est invisible");
			}
 	}
	 @When("^cliquer sur valider Modele$")
	 public void cliquer_sur_valider_Modele() throws Throwable
	 {
		 
		 ModeleActionPage.VldModeleID.click();
	 } 
 	@And("^Vérifier processus$")
 	public void Vérifier_processus() throws Throwable {
		try {
			FicheActionPage.processusId.isDisplayed();
			Common.Exporter_visibilité("le processus est visible");
			Select select = new Select(FicheActionPage.processusId);
			if(select.getFirstSelectedOption().getText().equals("")) 
			{
				select.selectByVisibleText("PROCESSUS AUTO");
				String text=driver.findElement(By.id("ctl00_ContentPlaceHolder1_LblProcessus_")).getText();
				if(text.indexOf('*')!=-1) 
				{
					Common.Exporter_visibilité("le processus est obligatoire");
				}else 
				{
					Common.Exporter_visibilité("le processus n'est pas obligatoire");
				}
			}

			}
			catch (NoSuchElementException e) {
				Common.Exporter_visibilité("le processus est invisible");
			}
 	}
 	@And("^Vérifier activité$")
 	public void Vérifier_activité() throws Throwable {
		try {
			FicheActionPage.activiteId.isDisplayed();
			Common.Exporter_visibilité("l'activité est visible");
			Select select = new Select(FicheActionPage.activiteId);
			if(select.getFirstSelectedOption().getText().equals("")) 
			{
				select.selectByVisibleText("ACTIVITE AUTO");
				String text=driver.findElement(By.id("ctl00_ContentPlaceHolder1_LblDomaine_")).getText();
				if(text.indexOf('*')!=-1) 
				{
					Common.Exporter_visibilité("l'activité est obligatoire");
				}else 
				{
				Common.Exporter_visibilité("l'activité n'est pas obligatoire");
				
				}
			}
		
			}
			catch (NoSuchElementException e) {
				Common.Exporter_visibilité("l'activité est invisible");
			}
 	}
    @And("^Vérifier direction$")
    public void Vérifier_direction() throws Throwable {
    	try {
			ModeleActionPage.directionId.isDisplayed();
			Common.Exporter_visibilité("la direction est visible");
			Select select = new Select(ModeleActionPage.directionId);
			if(select.getFirstSelectedOption().getText().equals("")) 
			{
				
				select.selectByVisibleText("DIRECTION AUTO");
				String text=driver.findElement(By.id("ctl00_ContentPlaceHolder1_LabelDir")).getText();
			if(text.indexOf('*')!=-1) 
			{
				Common.Exporter_visibilité("la direction est obligatoire");
			}else 
			{
				Common.Exporter_visibilité("la direction n'est pas obligatoire");
				
			}
			}
			}
			catch (NoSuchElementException e) {
				Common.Exporter_visibilité("la direction est invisible");
			}
    }
    @And("^Vérifier service$")
    public void Vérifier_service() throws Throwable {
    	try {
			FicheActionPage.service.isDisplayed();
			Common.Exporter_visibilité("le service est visible");
			Select select = new Select(FicheActionPage.service);
			if(select.getFirstSelectedOption().getText().equals("")) 
			{
				
				select.selectByVisibleText("SERVICE AUTO");
				String text=driver.findElement(By.id("ctl00_ContentPlaceHolder1_LblService_")).getText();
				if(text.indexOf('*')!=-1) 
				{
					Common.Exporter_visibilité("le service est obligatoire");
				}else 
				{
					Common.Exporter_visibilité("le service n'est pas obligatoire");
				}
			
			
			}
			}
			catch (NoSuchElementException e) {
				Common.Exporter_visibilité("le service est invisible");
			}
    }
	@Then("^vérifier les dates$")
	public void vérifier_date_suivi() throws Throwable {
		ModeleActionModel.verifier_date_rea(driver);
		FicheActionModele.validerAjout(driver);
	}
	
/*	@When("^Exporter apercu action$")
	public void Exporter_apercu_action() throws Throwable {
		ModeleActionModel.apercu_action(driver);
		FicheActionPage.ExporterId.click();
		driver.findElement(By.id("IconImg_iconMenu_arrow_bobjid_1539360008730_dialog_combo")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("iconMenu_menu_bobjid_1539360008730_dialog_combo_text_bobjid_1539360008730_dialog_combo_it_17")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("theBttnbobjid_1539360008730_dialog_submitBtn")).click();
		Thread.sleep(1000);
		Screen s = new Screen();
		Screen s1 = new Screen();
		Screen s2 = new Screen();
		Screen s3 = new Screen();
		try {
			Pattern pattern = new Pattern("resources/imgs/Exporter_PV_reunion.PNG");
			Pattern pattern1 = new Pattern("resources/imgs/combo_exporter_pv_reunion.PNG");
			Pattern pattern2 = new Pattern("resources/imgs/Choix_combo_PV_reunion.PNG");
			Pattern pattern3 = new Pattern("resources/imgs/Btn_exporter_PV_reunion.PNG");
			s.click(pattern);
			s1.click(pattern1);
			s2.click(pattern2);
			s3.click(pattern3);
			Thread.sleep(4000);
			
		} catch (FindFailed e) {
			e.printStackTrace();
		}
		Runtime.getRuntime().exec("C:\\Qualipro_Auto\\AutomatisationTQualiPro_23\\AutomatisationTQualiPro_23\\resources\\Scripts\\EnregistrerFichier.exe");
		Thread.sleep(3000);
	}*/

	@Then("^vérifier les données importés$")
	public void vérifier_si_tous_les_donneés_existe() throws Throwable {
		Thread.sleep(8000);

		String path = "resources/Telechargement/CrystalReportViewer1.rtf";
		String fileData = null;
		fileData = RTFUtil.ReadRTFFile(path);
		System.out.println("**************************************PV************************************************" + fileData);

		for (int i = 0; i < FicheActionModele.informations.size(); i++) {
			int j = i + 1;
			System.out.println("l'information " + j + ":" + FicheActionModele.informations.get(i));
			System.out.println("Existe: " + common.ExisteWord(path, FicheActionModele.informations.get(i)));
			assertTrue(common.ExisteWord(path, FicheActionModele.informations.get(i)));
		}
		driver.navigate().back();
	}

}
