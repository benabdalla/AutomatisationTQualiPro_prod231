package com.qualiprobdd.e2etests.GRH.Stepdefs;


import static org.testng.Assert.assertTrue;

import java.util.List;
import java.util.concurrent.TimeUnit;

import cucumber.api.java.en.*;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import com.qualiprobdd.e2etests.Client.Page.SatisfClientPage;
import com.qualiprobdd.e2etests.Client.models.SatisfClientModel;
import com.qualiprobdd.e2etests.Client.stepdefs.SatisfClientstepDef;
import com.qualiprobdd.e2etests.GRH.Models.SatisPersonnelModel;
import com.qualiprobdd.e2etests.GRH.Pages.SatisPersonnelPage;
import com.qualiprobdd.e2etests.util.Common;
import com.qualiprobdd.e2etests.util.ExcelUtils;
import com.qualiprobdd.e2etests.util.RandomValue;
import com.qualiprobdd.e2etests.util.Setup;




public class SatisPersonnelStepdef {
	public WebDriver driver;
	private static String Path = "resources/testData/TestData.xlsx";

	public SatisPersonnelStepdef() {
		driver = Setup.driver;
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 PageFactory.initElements(driver, SatisPersonnelPage.class);
	}
	@Then("^Consulter Sous Module Satisfaction Personnel$")
	public void Consulter_Sous_Module_Satisfaction_Personnel() throws Throwable {
		Common.AccéderModule(12, 3, 0, driver);
		//SatisPersonnelPage.MSatisfactionGrhId.click();
	}

	@When("^Consulter Sous Module Questionnaire GRH$")
	public void Consulter_Sous_Module_Questionnaire_GRH() throws Throwable {
		Common.AccéderModule(12, 3, 2, driver);
		/*Actions action = new Actions(driver);
		action.moveToElement(SatisPersonnelPage.MQuestionnaireGrhId);
		JavascriptExecutor  executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click()",SatisPersonnelPage.MQuestionnaireGrhId);*/

		
	}
	
	@When("^Consulter Sous Module Enquête GRH$")
	public void Consulter_Sous_Module_Enquête_GRH() throws Throwable {
		Common.AccéderModule(12, 3, 1, driver);
		//SatisPersonnelPage.MEnqueteGrhId.click();
	}
	@When("^Saisir code questionnaire personnel$")
	public void saisir_code_questionnaire_personnel() throws Throwable {
		ExcelUtils.setExcelFile(Path, "Questionnaire");
		int num=SatisfClientstepDef.row+1;
		String code="test_Auto_Perso_code_"+RandomValue.randomString(14);
		SatisfClientModel.saisir_code_questionnaire(code,21);
		SatisfClientPage.CodeQuestionnaireId.sendKeys(code);
		ExcelUtils.setCellData1(code,num, 0, Path);
	}

	@When("^Saisir titre questionnaire personnel$")
	public void Saisir_titre_questionnaire_personnel() throws Throwable {
		ExcelUtils.setExcelFile(Path, "Questionnaire");
		int num=SatisfClientstepDef.row+1;
		String titre="test_Auto_Perso_titre_"+RandomValue.randomString(14);
		SatisfClientModel.saisir_titre_questionnaire(titre,22);
		SatisfClientPage.TitreQuestionnaireId.sendKeys(titre);

		ExcelUtils.setCellData1(titre,num, 0, Path);

	}
	@Then("^vérifier ajout de la fiche questionnaire personnel$")
	public void vérifier_ajout_de_la_fiche_questionnaire_personnel() throws Throwable {
		ExcelUtils.setExcelFile(Path, "Questionnaire");
		Thread.sleep(200);
		int num=SatisfClientstepDef.row+1;
		String code=SatisfClientPage.CodeQuestionnaireId.getAttribute("value");
		ExcelUtils.setCellData1(code,num,0,Path);
		String titre = SatisfClientPage.TitreQuestionnaireId.getAttribute("value");
		ExcelUtils.setCellData1(titre,num,1,Path);
		Common.Exporter_numFiche("fiche questionnaire personnel"+code);
	}
	@When("^Choisir questionnaire personnel$")
	public void Choisir_questionnaire_personnel() throws Throwable {
	ExcelUtils.setExcelFile(Path, "Questionnaire");
	int num=SatisfClientstepDef.row+1;
	String titre=ExcelUtils.getCellData(num,1);
	SatisPersonnelModel.Choisir_quest_enquete_personnel(titre);
	}
	
	@When("^choisir type enquête$")
	public void choisir_type_enquête() throws Throwable {
		ExcelUtils.setExcelFile(Path, "EnquetePersonnel");
		String mode=ExcelUtils.getCellData(SatisfClientstepDef.row,1);
		SatisPersonnelModel.choisir_type_enquete(mode, driver);
	}

	@When("^choisir site satisfaction personnel$")
	public void choisir_site_satisfaction_personnel() throws Throwable {
		SatisPersonnelModel.choisir_site(driver);
	}

	@When("^choisir processus satisfaction personnel$")
	public void choisir_processus_satisfaction_personnel() throws Throwable {
		SatisPersonnelModel.choisir_processus(driver);
	}

	@When("^choisir direction satisfaction personnel$")
	public void choisir_direction_satisfaction_personnel() throws Throwable {
		SatisPersonnelModel.choisir_direction(driver);
	}
	
	@When("^choisir Activité satisfaction personnel$")
	public void choisir_Activité_satisfaction_personnel() throws Throwable {
		SatisPersonnelModel.choisir_activité(driver);
	}

	@When("^choisir service satisfaction personnel$")
	public void choisir_service_satisfaction_personnel() throws Throwable {
		SatisPersonnelModel.choisir_service(driver);
	}
	
	@When("^Cliquer valider enquête personnel$")
	public void Cliquer_valider_enquête_personnel() throws Throwable {
		SatisPersonnelModel.valider_enquete();
	}
	
	@When("^Saisir référence enquête personnel$")
	public void saisir_référence_enquête_personnel() throws Throwable {
		ExcelUtils.setExcelFile(Path, "EnquetePersonnel");
		int num=SatisfClientstepDef.row;
		String ref="test_Auto_Ref_Per_enq_"+RandomValue.randomString(15);
		Thread.sleep(500);
		SatisfClientPage.RefEnqueteId.sendKeys(ref);

		SatisfClientModel.saisir_ref_enquete(ref,18);
		ExcelUtils.setCellData1(ref, num,0,Path);
	}
	
	@Then("^vérifier ajout de la fiche enquête personnel$")
	public void vérifier_ajout_de_la_fiche_enquête_personnel() throws Throwable {
		ExcelUtils.setExcelFile(Path, "EnquetePersonnel");
		int num=SatisfClientstepDef.row;
		ExcelUtils.setCellData1(SatisfClientPage.RefEnqueteId.getAttribute("value"),num,0,Path);
	}
	
	@When("^Ajouter coefficients des questions jauges personnel$")
	public void Ajouter_coefficients_des_questions_jauge_personnel() throws Throwable {
		SatisPersonnelModel.ajouter_coef_quest_jauge(Path, driver, SatisfClientstepDef.row);
	}
	
	@When("^Rattacher les personnels concernés$")
	public void rattacher_les_personnels_concernés() throws Throwable {
		SatisPersonnelModel.rattacher_personnel(Path, driver, SatisfClientstepDef.row);
	}

	@When("^Rattacher les personnes habilités à enregistrer les réponses$")
	public void rattacher_les_personnes_habilités_à_enregistrer_les_réponses() throws Throwable {
		SatisPersonnelModel.rattacher_personne_habilités_à_enregistrer_réponse(Path, driver, SatisfClientstepDef.row);
	}
	
	@When("^Ajouter pièce jointe personnel$")
	public void ajouter_pièce_jointe_personnel() throws Throwable {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, -document.body.scrollHeight);");
		SatisPersonnelPage.AjtPJId.click();
		Thread.sleep(500);
		driver.findElement(By.id("ctl00_ContentPlaceHolder1_Ajouter_pj")).click();
		driver.findElement(By.id("ctl00_ContentPlaceHolder1_tb_obj")).sendKeys("objet test pieces jointes automatique");
		driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_Panel_ajtpj\"]/div[2]/div[2]/div/span/label")).click();
		Thread.sleep(500);
		Runtime.getRuntime().exec("E:\\qualipro\\trunk\\AutomatisationTQualiPro_prod\\resources\\Scripts\\joindreFichier.exe");
		Thread.sleep(500);
		driver.findElement(By.id("ctl00_ContentPlaceHolder1_LB_vald_ajtpiec")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_fermer\"]/span")).click();
		Thread.sleep(500);
	}
	
	@When("^Consulter agenda GRH$")
	public void consulter_agenda_GRH() throws Throwable {
		SatisPersonnelModel.consulter_agenda_RH();
	}

	@When("^Saisir référence enquête à répondre$")
	public void saisir_référence_enquête_à_répondre() throws Throwable {
		ExcelUtils.setExcelFile(Path, "EnquetePersonnel");
		int num=SatisfClientstepDef.row;
		String ref=ExcelUtils.getCellData(num,0);
		SatisPersonnelModel.consulter_enquête_à_répondre(ref);
	}
	
	@Then("^Saisir réponse personnel$")
	public void Saisir_réponse_personnel() throws Throwable {
		SatisfClientModel.enregistrer_réponses_client(Path, driver, SatisfClientstepDef.row);
		Thread.sleep(500);
		driver.findElement(By.id("ctl00_ContentPlaceHolder1_CheckBox2")).click();
	}

	@Then("^Enregistrer les réponses des employés concernés$")
	public void enregistrer_les_réponses_des_employés_concernés() throws Throwable {
		
	boolean arret=false;
	ExcelUtils.setExcelFile(Path, "EnquetePersonnel");
	int num=SatisfClientstepDef.row;
	String ref=ExcelUtils.getCellData(num,0);
	String mode=ExcelUtils.getCellData(num,1);
		do {
			SatisPersonnelModel.consulter_agenda_RH();
			SatisPersonnelPage.SpEnqSatENregId.click();
			Thread.sleep(500);
			SatisPersonnelPage.AgdRechEnqEnregId.sendKeys(ref);
			Thread.sleep(500);
			Thread.sleep(500);
			List<WebElement> allRows=SatisPersonnelPage.AgdGridEnqEnrgiId.findElements(By.tagName("tr"));
			if(allRows.size()==2)
			{
				try {
				WebElement element=SatisPersonnelPage.AgdGridEnqEnrgiId.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_GridView_EnregEnq\"]/tbody/tr/td[1]"));
				element.isDisplayed();
				if(mode.equals("ANONYME"))
				{
					assertTrue(element.findElement(By.tagName("a")).getText().contains("***"));
					assertTrue(SatisPersonnelPage.AgdGridEnqEnrgiId.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_GridView_EnregEnq\"]/tbody/tr/td[2]")).findElement(By.tagName("span")).getText().contains("*** ***"));
				}
				element.findElement(By.tagName("a")).click();
				}catch (NoSuchElementException e) {
						arret=true;
				}
			}else {
				WebElement element=SatisPersonnelPage.AgdGridEnqEnrgiId.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_GridView_EnregEnq\"]/tbody/tr[1]/td[1]"));
				if(mode.equals("ANONYME"))
				{
					assertTrue(element.findElement(By.tagName("a")).getText().contains("***"));
					assertTrue(SatisPersonnelPage.AgdGridEnqEnrgiId.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_GridView_EnregEnq\"]/tbody/tr[1]/td[2]")).findElement(By.tagName("span")).getText().contains("*** ***"));
				}
				element.findElement(By.tagName("a")).click();
			}
			Thread.sleep(500);
			if(mode.equals("ANONYME"))
			{
				assertTrue(driver.findElement(By.id("ctl00_ContentPlaceHolder1_LabelEmploye")).getText().contains("***"));
			}
			SatisfClientModel.enregistrer_réponses_client(Path, driver, SatisfClientstepDef.row);
			Thread.sleep(500);
			driver.findElement(By.id("ctl00_ContentPlaceHolder1_CheckBox2")).click();
		}while(arret==true);
	    
	}

	


	
}
