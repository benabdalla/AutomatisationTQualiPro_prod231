package com.qualiprobdd.e2etests.Client.stepdefs;

import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Paths;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

import com.qualiprobdd.e2etests.Client.Page.SatisfClientPage;
import com.qualiprobdd.e2etests.Client.models.SatisfClientModel;
import com.qualiprobdd.e2etests.Fournisseur.models.EvalFourModel;
import com.qualiprobdd.e2etests.Fournisseur.pages.EvalFourPage;
import com.qualiprobdd.e2etests.ReclamationClient.Pages.ReclamationClientPage;
import com.qualiprobdd.e2etests.moduleReunion.pages.ModuleReunionPage;
import com.qualiprobdd.e2etests.util.Common;
import com.qualiprobdd.e2etests.util.ExcelUtils;
import com.qualiprobdd.e2etests.util.RTFUtil;
import com.qualiprobdd.e2etests.util.RandomValue;
import com.qualiprobdd.e2etests.util.Setup;




public class SatisfClientstepDef {


	public WebDriver driver;
	private static String Path = "resources/testData/TestData.xlsx";
	public static int row;
	private Common common = new Common();
	List<String> list_Client;
	
	public SatisfClientstepDef() {
		driver = Setup.driver;
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 PageFactory.initElements(driver, SatisfClientPage.class);
	}

	@Then("^Consulter Sous Module Satisfaction client$")
	public void consulter_Sous_Module_Satisfaction_client() throws Throwable {
		SatisfClientModel.consulter_SM_satisfactionclient(driver);
	}

	@When("^Consulter Sous Module Questionnaire$")
	public void consulter_Sous_Module_Questionnaire() throws Throwable {
		SatisfClientModel.consulter_SM_questionnaire(driver);
	}

	@When("^Cliquer sur ajouter questionnaire$")
	public void cliquer_sur_ajouter_questionnaire() throws Throwable {
		SatisfClientModel.ajouter_questionnaire(driver);
	}

	@When("^Lire (\\d+) depuis Excel$")
	public void lire_depuis_Excel(int arg1) throws Throwable {
		row=arg1;
	}

	@When("^Saisir code questionnaire$")
	public void saisir_code_questionnaire() throws Throwable {
		ExcelUtils.setExcelFile(Path, "Questionnaire");
		
		String code="Test_Auto_Stai_Client1_"+RandomValue.randomString(15);
		ExcelUtils.setCellData1(code, row, 0, Path);
		Thread.sleep(500);

		SatisfClientPage.CodeQuestionnaireId.sendKeys(code);
		
		Thread.sleep(500);
		
		SatisfClientModel.saisir_code_questionnaire(code,18);
	}

	@When("^Saisir titre questionnaire$")
	public void saisir_titre_questionnaire() throws Throwable {
		ExcelUtils.setExcelFile(Path, "Questionnaire");
		String titre="test_auto_titre_sati_client"+RandomValue.randomString(15);
		SatisfClientModel.saisir_titre_questionnaire(titre,19);
		Thread.sleep(500);
		SatisfClientPage.TitreQuestionnaireId.sendKeys(titre);
	ExcelUtils.setCellData1(titre, row, 1, Path);
		
		

	}

	@When("^Cliquer valider questionnaire$")
	public void cliquer_valider_questionnaire() throws Throwable {
		SatisfClientModel.valider_questionnaire();
	}

	@Then("^vérifier ajout de la fiche questionnaire$")
	public void vérifier_ajout_de_la_fiche_questionnaire() throws Throwable {
		ExcelUtils.setExcelFile(Path, "Questionnaire");
		Thread.sleep(200);
		String code=SatisfClientPage.CodeQuestionnaireId.getAttribute("value");
		ExcelUtils.setCellData1(code,row,0,Path);
		String titre = SatisfClientPage.TitreQuestionnaireId.getAttribute("value");
		ExcelUtils.setCellData1(titre,row,1,Path);
	}

	@Then("^Ajouter introduction$")
	public void ajouter_introduction() throws Throwable {
		SatisfClientModel.Ajouter_Introduction();
	}

	@Then("^Ajouter sections$")
	public void ajouter_sections() throws Throwable {
		ExcelUtils.setExcelFile(Path, "Questionnaire");
		String nbrsection=ExcelUtils.getCellData(row,2);
		SatisfClientModel.ajouter_sections(nbrsection);
	}

	@Then("^Ajouter questions$")
	public void ajouter_questions() throws Throwable {
		SatisfClientModel.ajouter_questions(Path,row,driver);
	}

	@Then("^Ajouter fin$")
	public void ajouter_fin() throws Throwable {
		SatisfClientModel.Ajouter_fin(driver);
	}

	@Then("^Valider Questionnaire$")
	public void valider_Questionnaire() throws Throwable {
		JavascriptExecutor  executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click()", SatisfClientPage.VldQuestionnaireId);
		
	}

	@Then("^Cliquer aperçu questionnaire$")
	public void cliquer_aperçu_questionnaire() throws Throwable {
		JavascriptExecutor  executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click()", SatisfClientPage.ApercuQuestionnaireId);
	}

	@Then("^Exporter aperçu$")
	public void exporter_aperçu() throws Throwable {
		Thread.sleep(1000);
		WebElement need= driver.findElement(By.id("IconImg_CrystalReportViewer1_toptoolbar_export"));
		JavascriptExecutor  executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click()", need);
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
			Thread.sleep(8000);
			
		} catch (FindFailed e) {
			e.printStackTrace();
		}
		Runtime.getRuntime().exec("C:\\Qualipro_Auto\\AutomatisationTQualiPro_23\\AutomatisationTQualiPro_23\\resources\\Scripts\\EnregistrerFichier.exe");
		Thread.sleep(3000);
	 
	}

	@Then("^Vérifier la cohérence des données questionnaire$")
	public void vérifier_la_cohérence_des_données_questionnaire() throws Throwable {
	//	Runtime.getRuntime().exec("C:\\Qualipro_Auto\\AutomatisationTQualiPro_23\\AutomatisationTQualiPro_23\\resources\\Scripts\\EnregistrerFichier.exe");
		Thread.sleep(3000);
		String path = "resources/Telechargement/CrystalReportViewer1.rtf";
		String fileData = null;
		fileData = RTFUtil.ReadRTFFile(path);
		System.out.println("**************************************PV************************************************" + fileData);

		for (int i = 0; i < SatisfClientModel.informations.size(); i++) {
			int j = i + 1;
			System.out.println("l'information " + j + ":" + SatisfClientModel.informations.get(i));
			System.out.println("Existe: " + common.ExisteWord(path, SatisfClientModel.informations.get(i)));
			Thread.sleep(1000);

			assertTrue(common.ExisteWord(path, SatisfClientModel.informations.get(i)));
		}
		System.out.println("delete file -----------------------------------------");
		
		Thread.sleep(3000);
		//Runtime.getRuntime().exec("E:\\qualipro\\trunk\\AutomatisationTQualiPro_prod231\\resources\\Scripts\\deletefilertf1.exe");
		
	
		
		
		Thread.sleep(3000);
		
/*try {
            
            ProcessBuilder pb = new ProcessBuilder("C:\\Program Files (x86)\\AutoIt3\\AutoIt3.exe\"", "\"E:\\qualipro\\trunk\\AutomatisationTQualiPro_prod231\\resources\\Scripts\\deleteFileRtf.au3\"");
             Process p = pb.start();
            
                
             System.out.println("Script executed, TrueCrypt volume created!");
        }
        catch (IOException e) { 
                System.out.println("exception happened - here's what I know: ");
                e.printStackTrace();
                System.exit(-1);
        }*/
        
    
		
		
	//Common.deleteFile("E:\\qualipro\\trunk\\AutomatisationTQualiPro_prod231\\resources\\Telechargement\\CrystalReportViewer1.rtf");
		  FileOutputStream fos = null;
	      
	  
	         // create new file output stream
	        
		java.nio.file.Path path2 = FileSystems.getDefault().getPath("E:\\qualipro\\trunk\\AutomatisationTQualiPro_prod231\\resources\\Telechargement\\CrystalReportViewer1.rtf");
        try {
       System.err.println("files is  "+Files.exists(path2));
       fos = new FileOutputStream("E:\\qualipro\\trunk\\AutomatisationTQualiPro_prod231\\resources\\Telechargement\\CrystalReportViewer1.rtf");
       fos.close();
       Thread.sleep(1000);
   //    Files.delete(path2);
        } catch (NoSuchFileException x) {
            System.err.format("%s: no such" + " file or directory%n", path2);
        } catch (IOException x) {
            System.err.println(x);
        }
		

	//	driver.findElement(By.id("Retour")).click();
		//driver.navigate().back();
	}
	
	
	@When("^Consulter Sous Module Enquête client$")
	public void consulter_Sous_Module_Enquête_client() throws Throwable {
		SatisfClientModel.consulter_MEnquete(driver);
	}

	@When("^Cliquer sur ajouter enquête client$")
	public void cliquer_sur_ajouter_enquête_client() throws Throwable {
		SatisfClientModel.ajouetr_enquete();
	}

	@When("^Lire données (\\d+) depuis Excel$")
	public void lire_données_depuis_Excel(int arg1) throws Throwable {
		row=arg1;
	}

	@When("^Saisir référence enquête$")
	public void saisir_référence_enquête() throws Throwable {
		ExcelUtils.setExcelFile(Path, "EnqueteClient");
		String ref="test_Auto_Ref_client1_ "+RandomValue.randomString(14);
		SatisfClientModel.saisir_ref_enquete(ref,15);
		Thread.sleep(500);
		SatisfClientPage.RefEnqueteId.sendKeys(ref);
		ExcelUtils.setCellData1(ref, row, 0, Path);

		
	}

	@When("^Choisir questionnaire$")
	public void choisir_questionnaire() throws Throwable {
		ExcelUtils.setExcelFile(Path, "Questionnaire");
		String titre=ExcelUtils.getCellData(row,1);
		SatisfClientModel.Choisir_quest_enquete(titre);
	}

	@When("^Choisir date début enquête$")
	public void choisir_date_début_enquête() throws Throwable {
		SatisfClientModel.saisir_date_debut_enquete(driver);
	}

	@When("^Choisir date fin enquête$")
	public void choisir_date_fin_enquête() throws Throwable {
		SatisfClientModel.saisir_date_fin_enquete(driver);
	}

	@When("^choisir mode enquête$")
	public void choisir_mode_enquête() throws Throwable {
		ExcelUtils.setExcelFile(Path, "EnqueteClient");
		String mode=ExcelUtils.getCellData(row,1);
		SatisfClientModel.choisir_mode_enquete(mode);
	}

	@When("^Cliquer valider enquête$")
	public void cliquer_valider_enquête() throws Throwable {
		SatisfClientModel.valider_enquete(driver);
	}

	@Then("^vérifier ajout de la fiche enquête$")
	public void vérifier_ajout_de_la_fiche_enquête() throws Throwable {
		ExcelUtils.setExcelFile(Path, "EnqueteClient");
	//	ExcelUtils.setCellData1(SatisfClientPage.RefEnqueteId.getAttribute("value"),row,0,Path);
	}

	@When("^Ajouter coefficients des questions jauges$")
	public void Ajouter_coefficients_des_questions_jauges() throws Throwable {
		SatisfClientModel.ajouter_coef_quest_jauge(Path, driver, row);
	}

	@When("^Rattacher les clients concernés$")
	public void rattacher_les_clients_concernés() throws Throwable {
		SatisfClientModel.rattacher_client(Path, driver, row);
	}

	@When("^Rattacher des actions$")
	public void rattacher_des_actions() throws Throwable {
		SatisfClientModel.rattacher_action();
	}

	@When("^Ajouter action$")
	public void ajouter_action() throws Throwable {
	 
	}

	@When("^Valider enquête$")
	public void valider_enquête() throws Throwable {
		SatisfClientModel.valider_compo_enquete(driver);
	}

	@When("^Ajouter pièce jointe$")
	public void ajouter_pièce_jointe() throws Throwable {
		Thread.sleep(500);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, -document.body.scrollHeight);");
		SatisfClientPage.PiecejointeId.click();
		Thread.sleep(500);
		driver.findElement(By.id("ctl00_ContentPlaceHolder1_Ajouter_pj")).click();
		driver.findElement(By.id("ctl00_ContentPlaceHolder1_tb_obj")).sendKeys("objet test pieces jointes automatique");
		driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_Panel_ajtpj\"]/div[2]/div[2]/div/div/span/label")).click();
		Thread.sleep(500);
		Runtime.getRuntime().exec("E:\\qualipro\\trunk\\AutomatisationTQualiPro_prod\\resources\\Scripts\\joindreFichier1.exe");
		Thread.sleep(500);
		driver.findElement(By.id("ctl00_ContentPlaceHolder1_LB_vald_ajtpiec")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_fermer\"]/span")).click();
		Thread.sleep(500);
	}

	@When("^Envoyer enquête aux clients$")
	public void envoyer_enquête_aux_clients() throws Throwable {
		ExcelUtils.setExcelFile(Path,"EnqueteClient");
		String mode=ExcelUtils.getCellData(row,1);
		if(!(mode.equals("ANONYME")))
		{
		SatisfClientPage.SPClientId.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_GridView2\"]/tbody/tr[1]/td[1]")).findElement(By.tagName("input")).click();;
		Thread.sleep(1000);
		SatisfClientPage.EnvoiId.click();
		Thread.sleep(1000);
		driver.findElement(By.id("ctl00_ContentPlaceHolder1_TextBox_Objet")).sendKeys("objet test envoi automatique");
		driver.findElement(By.id("ctl00_ContentPlaceHolder1_TextBox_Texte")).sendKeys("texte test envoi automatique");
		driver.findElement(By.id("ctl00_ContentPlaceHolder1_LinkButton2")).click();
		Thread.sleep(500);
		}
		
	}

	@Then("^vérifier réception mail$")
	public void vérifier_réception_mail() throws Throwable {
	 
	}

	@Then("^Exporter enquête$")
	public void exporter_enquête() throws Throwable {
		SatisfClientPage.ExporterId.click();
	}

	@Then("^Afficher aperçu enquête$")
	public void afficher_aperçu_enquête() throws Throwable {
		SatisfClientPage.ApercuId.click();
	}

	@Then("^Vérifier la cohérence des données enquête$")
	public void vérifier_la_cohérence_des_données_enquête() throws Throwable {
	    
	}
	
	@When("^Consulter Sous Module Enregistrement Réponse$")
	public void consulter_Sous_Module_Enregistrement_Réponse() throws Throwable {
		SatisfClientModel.consulter_MEnregistrementRéponse(driver);
	}

	@When("^Saisir référence enquête à traiter$")
	public void saisir_référence_enquête_à_traiter() throws Throwable {
		ExcelUtils.setExcelFile(Path, "EnqueteClient");
		String ref=ExcelUtils.getCellData(row,0);
		SatisfClientModel.saisir_référence_enquête_à_répondre(ref);
	}

	@When("^rechercher enquête à traiter$")
	public void rechercher_enquête_à_traiter() throws Throwable {
		SatisfClientModel.rechercher_enquête_à_répondre();
	}

	@When("^consulter fiche enquête à traiter$")
	public void consulter_fiche_enquête_à_traiter() throws Throwable {
		SatisfClientModel.consulter_fiche_enquête_à_répondre();
	}
	
	@When("^la liste des clients suivante$")
	public void la_liste_des_clients_suivante(DataTable dt) throws Throwable {
		ExcelUtils.setExcelFile(Path,"EnqueteClient");
		String mode=ExcelUtils.getCellData(row,1);
		if(!(mode.equals("ANONYME")))
		{
		list_Client = dt.asList(String.class);
		}
	}

	@Then("^Enregistrer réponses client$")
	public void enregistrer_réponses_client() throws Throwable {
		Thread.sleep(1000);
		driver.findElement(By.id("sp_collapse8")).click();
		ExcelUtils.setExcelFile(Path,"EnqueteClient");
		String mode=ExcelUtils.getCellData(row,1);
		if(!(mode.equals("ANONYME")))
		{
		for(int i=0; i<list_Client.size(); i++) {
			System.out.println(list_Client.get(i));
			String currClient = list_Client.get(i);
			Actions action1 = new Actions(driver);
			action1.moveToElement(SatisfClientPage.SelectCltId).perform();
			JavascriptExecutor  executor = (JavascriptExecutor)driver;
			executor.executeScript("arguments[0].click()", SatisfClientPage.SelectCltId);
			Thread.sleep(500);
			driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_GridView22_filter\"]/label/input")).sendKeys(currClient);
			WebElement Ineed;
			WebElement Ineed1;
			try {
				Ineed = driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_GridView22\"]/tbody/tr/td"));
				Ineed.isDisplayed();
				Actions action = new Actions(driver);
				action.moveToElement(SatisfClientPage.AjtNvRepId).perform();
				executor = (JavascriptExecutor)driver;
				executor.executeScript("arguments[0].click()", SatisfClientPage.AjtNvRepId);
				Thread.sleep(1000);
				action.moveToElement(SatisfClientPage.RechNvCltId).perform();
				SatisfClientPage.RechNvCltId.sendKeys(currClient);
				try {
					Ineed1 = SatisfClientPage.GridNvCltId.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_GridView2\"]/tbody/tr/td"));
					Ineed1.isDisplayed();
					action.moveToElement(SatisfClientPage.AjtCltPassId).perform();
					executor = (JavascriptExecutor)driver;
					executor.executeScript("arguments[0].click()", SatisfClientPage.AjtCltPassId);
					Thread.sleep(1000);
					SatisfClientPage.NomPassId.sendKeys(currClient);
					String age=Integer.toString(RandomValue.randomInt(100));
					SatisfClientPage.AgePassId.sendKeys(age);
					SatisfClientPage.AdressPassId.sendKeys("Tunis");
					SatisfClientPage.NatPassId.sendKeys("Tunisienne");
					String tel=Integer.toString(RandomValue.randomInt(90000000)+10000000);
					SatisfClientPage.TelPassId.sendKeys(tel);
					String fax=Integer.toString(RandomValue.randomInt(90000000)+10000000);
					SatisfClientPage.FaxPassId.sendKeys(fax);
					SatisfClientPage.VldPassId.click();
					Thread.sleep(1000);
					
				}catch (NoSuchElementException e)
				{
					Ineed1 = SatisfClientPage.GridNvCltId.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_GridView2\"]/tbody/tr/td[1]"));
					Ineed1.findElement(By.tagName("a")).click();
				}
			}catch (NoSuchElementException e)
			{
				Ineed = driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_GridView22\"]/tbody/tr/td[1]"));
				Ineed.findElement(By.tagName("a")).click();
			}
			
			SatisfClientModel.enregistrer_réponses_client(Path, driver, row);
			Thread.sleep(500);
			driver.findElement(By.id("ctl00_ContentPlaceHolder1_LinkButton_creponse")).click();
		}
		
		}else{
			ExcelUtils.setExcelFile(Path,"EnqueteClient");
			String nbrClient=ExcelUtils.getCellData(row,4);
			int nbreClient=Integer.parseInt(nbrClient);
			JavascriptExecutor executor = (JavascriptExecutor)driver;
			executor.executeScript("arguments[0].click()", SatisfClientPage.AjtNvRepId);
			//driver.findElement(By.id("ctl00_ContentPlaceHolder1_LinkButtonNouvRep")).click();
			for(int i=0; i<nbreClient; i++) 
			{
				SatisfClientModel.enregistrer_réponses_client(Path, driver, row);
				Thread.sleep(500);
				driver.findElement(By.id("ctl00_ContentPlaceHolder1_LinkButton_csreponse")).click();
			}
			
		}
	}
}
