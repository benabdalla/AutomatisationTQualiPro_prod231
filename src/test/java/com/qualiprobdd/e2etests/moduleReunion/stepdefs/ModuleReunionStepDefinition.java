package com.qualiprobdd.e2etests.moduleReunion.stepdefs;

import static org.junit.Assert.assertTrue;

import java.awt.Robot;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import io.cucumber.java.en.*;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.tools.ant.taskdefs.Java;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


import com.qualiprobdd.e2etests.moduleReunion.models.ModuleReunionModel;
import com.qualiprobdd.e2etests.moduleReunion.pages.ModuleReunionPage;
import com.qualiprobdd.e2etests.util.Common;
import com.qualiprobdd.e2etests.util.ExcelUtils;
import com.qualiprobdd.e2etests.util.RTFUtil;
import com.qualiprobdd.e2etests.util.Setup;



public class ModuleReunionStepDefinition {

	public int compteur;
	public String numero_reunion = "";
	private static String Path = "resources/testData/TestData.xlsx";
	public List<String> informations = new ArrayList<String>();
	private Common common = new Common();
	private int row;

	public WebDriver driver;

	public ModuleReunionStepDefinition() {
		driver = Setup.driver;
		PageFactory.initElements(driver, ModuleReunionPage.class);
	}

	@When("^consulter reunion$")
	public void consulter_reunion() throws Throwable {
		
		ModuleReunionModel.consulter_Reunion(driver);
		
	}

	@And("^cliquer sur ajouter$")
	public void cliquer_sur_ajouter() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver,60);
        wait.until(ExpectedConditions.visibilityOf(ModuleReunionPage.btnAjouterID));
		ModuleReunionModel.ajouterFicheReunion();
	}
	@When("^saisir (\\d+) reunion$")
	public void saisir_reunion(int arg1) throws Throwable {
			row=arg1;
		
	}


	@Then("^verifier le declencheur$")
	public void verifier_le_declencheur() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver,60);
        wait.until(ExpectedConditions.visibilityOf(ModuleReunionPage.declencheurID));
		String declencheur = ModuleReunionPage.declencheurID.getText();
		informations.add(declencheur);
		Assert.assertTrue(declencheur.contains("AUTO"));
	}

	@When("^saisir lieu$")
	public void saisir_lieu() throws Throwable {

		ModuleReunionModel.saisirLieu(row);

	}

	@And("^choisir type reunion$")
	public void choisir_type_reunion() throws Throwable {
		ModuleReunionModel.ChoisirType(driver,row);
		ExcelUtils.setExcelFile(Path, "Reunion");
		informations.add(ExcelUtils.getCellData(row, 0));

	}

	@And("^choisir date prevu$")
	public void choisir_date_prevu() throws Throwable {

		ModuleReunionModel.cliquerCalendrier();
		WebDriverWait wait = new WebDriverWait(driver,60);
        wait.until(ExpectedConditions.visibilityOf(ModuleReunionPage.choixDateID));
		ModuleReunionModel.choisirDate();
	}

	@And("^saisir ordre de jour$")
	public void saisir_ordre_de_jour() throws Throwable {

		ModuleReunionModel.saisirOrdreDeJour();
		
	}
	
	@And("^choisir site r??union$")
	public void choisir_site_r??union() throws Throwable {
		ModuleReunionModel.site(driver,row);
	}
	
    @And("^choisir processus r??union$")
    public void choisir_processus_r??union() throws Throwable {
    	ModuleReunionModel.processus(driver,row);
    }
    @And("^choisir activit?? r??union$")
    public void choisir_activit??_r??union() throws Throwable {
    	ModuleReunionModel.activite(driver,row);
    
    }
    @And("^choisir direction r??union$")
    public void choisir_direction_r??union() throws Throwable {
    	ModuleReunionModel.direction(driver,row);
    }
    @And("^choisir service r??union$")
    public void choisir_service_r??union() throws Throwable {
    	ModuleReunionModel.service(driver,row);
    }

	@When("^cliquer sur Valider$")
	public void cliquer_sur_Valider() throws Throwable {

		ModuleReunionModel.cliquerValider();
	}

	@Then("^fiche reunion valid??$")
	public void fiche_reunion_valid??() throws Throwable {
		ExcelUtils.setExcelFile(Path, "Reunion");
		String Num_Fiche_Reunion = driver.findElement(By.id("ctl00_ContentPlaceHolder1_Text_Nreunion"))
				.getText();
		System.out.println("Fiche r??union cr??e sous num??ro : " + Num_Fiche_Reunion);
		numero_reunion = Num_Fiche_Reunion;
		informations.add(Num_Fiche_Reunion);
		ExcelUtils.setCellData(numero_reunion, row, 9);
		Common.Exporter_visibilit??("Fiche r??union:"+Num_Fiche_Reunion);
		Common.Exporter_champ_A_masquer("Fiche r??union: "+Num_Fiche_Reunion);
		Common.Exporter_numFiche("Fiche r??union: "+Num_Fiche_Reunion);
	}

	@When("^cliquer sur Ajouter un participant$")
	public void ajouterParticipant() throws Throwable {

		common.scrollerPage();
		ModuleReunionModel.AjouterParticipant(driver);
	}

	@When("^rechercher avec NomPrenom$")
	public void saisir_NomPrenom() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver,800);
        wait.until(ExpectedConditions.visibilityOf(ModuleReunionPage.nomprenomXPATH));
		ModuleReunionModel.saisirNomPrenom();
	}


	@When("^selectionner participant$")
	public void selectionner_participant() throws Throwable {
		ModuleReunionModel.selectionnerParticipant();
	}

	@And("^cliquer sur valider$")
	public void cliquer_sur_valider() throws Throwable {

		ModuleReunionModel.cliquervalider();

		//Thread.sleep(3000);
	}

	@Then("^participant ajouter ?? Liste des participants$")
	public void participant_ajouter_??_Liste_des_participants() throws Throwable {

		Boolean ajouter = false;
		WebDriverWait wait = new WebDriverWait(driver,60);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("ctl00_ContentPlaceHolder1_GridView2"))));
		WebElement table = driver.findElement(By.id("ctl00_ContentPlaceHolder1_GridView2"));
		List<WebElement> TotalRowCount = table.findElements(By.xpath("//*[@id='ctl00_ContentPlaceHolder1_GridView2']/tbody/tr"));
		System.out.println("Nombre des enregistrement est: " + (TotalRowCount.size() - 1));

		if (TotalRowCount.size() > 0) {
			ajouter = true;
		}

		assertTrue("participant bien ajouter", ajouter);
	}

	@When("^verefier compteur agenda$")
	public void verefier_compteur_agenda() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver,2000);
        wait.until(ExpectedConditions.visibilityOf(ModuleReunionPage.cmptreunionID));

		try {
			if (ModuleReunionPage.cmptreunionID.getText() != "") {
				compteur = Integer.parseInt(ModuleReunionPage.cmptreunionID.getText());
				System.out.println("compteur: " + compteur);
			} else {
				compteur = 0;
				System.out.println("compteur: " + compteur);
			}
		} catch (Exception e) {
			
		}
		

	}

	@Then("^incrementation compteur agenda reunion$")
	public void incrementation_compteur_agenda_reunion() throws Throwable {
		Boolean incrementation = false;
		ModuleReunionPage.homeID.click();
		Thread.sleep(2000);
		//ModuleReunionModel.consulter_Reunion();
		//Thread.sleep(2000);
		//ModuleReunionPage.numeroReunion.sendKeys(numero_reunion);
		//ModuleReunionPage.btnrechercherFicheReunion.click();
		//ModuleReunionPage.listReunionID.click();		
		//Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait(driver,2000);
        wait.until(ExpectedConditions.visibilityOf(ModuleReunionPage.cmptreunionID));
		System.out.println("compteur1 : " + ModuleReunionPage.cmptreunionID.getText());
		if (Integer.parseInt(ModuleReunionPage.cmptreunionID.getText()) == compteur + 2) {
			incrementation = true;
		}
		
	//	assertTrue("Compteur agenda reunion est incr??ment?? ", incrementation);
		
	}

	@When("^saisir numero reunion$")
	public void saisir_numero_reunion() throws Throwable {
		ModuleReunionPage.numeroReunion.sendKeys(numero_reunion);
	}
	
	@When("^saisir \"([^\"]*)\"$")
	public void saisir(String arg1) throws Throwable {
		ModuleReunionPage.numeroReunion.sendKeys(arg1);
	}

	@When("^cliquer sur rechercher reunion$")
	public void cliquer_sur_rechercher_reunion() throws Throwable {
		//ModuleReunionPage.btnrechercherFicheReunion.click();
		JavascriptExecutor  js  = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()",ModuleReunionPage.btnrechercherFicheReunion);
	}

	@When("^Ouvrir fiche reunion$")
	public void ouvrir_fiche_reunion() throws Throwable {
	JavascriptExecutor  js  = (JavascriptExecutor) driver;
	js.executeScript("arguments[0].click()",ModuleReunionPage.listReunionID);
		//ModuleReunionPage.listReunionID.click();
	}

	@Then("^redirection vers fiche r??union$")
	public void redirection_vers_fiche_r??union() throws Throwable {
		System.out.println("redirection vers fiche r??union num??ro : " + numero_reunion);
	}

	@When("^s??lectionner Etat$")
	public void s??lectionner_Etat() throws Throwable {
		JavascriptExecutor  executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click()",ModuleReunionPage.enregistrement_Xpath);
		Thread.sleep(500);
		executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click()",ModuleReunionPage.realisation_Xpath);
		WebDriverWait wait = new WebDriverWait(driver,60);
        wait.until(ExpectedConditions.visibilityOf(ModuleReunionPage.etatRealisationID));
		ModuleReunionPage.etatRealisationID.click();
		Thread.sleep(100);
	}


	@When("^saisir Date r??alisation$")
	public void saisir_Date_r??alisation() throws Throwable {
		//ModuleReunionPage.enregistrement_Xpath.click();
		//Thread.sleep(100);
		//ModuleReunionPage.realisation_Xpath.click();
		//Thread.sleep(200);
		ModuleReunionPage.etatRealisationID.click();
		Thread.sleep(100);
		ModuleReunionPage.calendrierRealisationID.click();
		ModuleReunionPage.choixDateRealisationID.click();
		//ModuleReunionPage.dateRealisationID.sendKeys("03/09/2018");
	}

	@When("^saisir Dur??e r??alis??e$")
	public void saisir_Dur??e_r??alis??e() throws Throwable {
		ModuleReunionPage.dureeRealisationID.sendKeys("3H");
	}
	
	@When("^cliquer sur valider R??alisation$")
	public void cliquer_sur_valider_R??alisation() throws Throwable {
		ModuleReunionPage.btnvaliderRealisationID.click();
	}
	@When("^Rattacher action$")
	public void rattacher_action() throws Throwable {
		
		/*Actions action = new Actions(driver);
		action.moveToElement(ModuleReunionPage.realisation_Xpath).perform();
		
	     JavascriptExecutor executor = (JavascriptExecutor)driver;
		 executor.executeScript("arguments[0].click()",ModuleReunionPage.realisation_Xpath);*/
		
		WebDriverWait wait = new WebDriverWait(driver,60);
        wait.until(ExpectedConditions.visibilityOf(ModuleReunionPage.rattacherActionID));
		
        JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click()",ModuleReunionPage.rattacherActionID);
	
		wait = new WebDriverWait(driver,60);
        wait.until(ExpectedConditions.visibilityOf(ModuleReunionPage.rechercherActionID));
        
		ExcelUtils.setExcelFile(Path, "Action");
		ModuleReunionPage.rechercherActionID.sendKeys(ExcelUtils.getCellData(row,7));
		ModuleReunionPage.VldrechercherActionID.click();
		Thread.sleep(500);
		ModuleReunionPage.choixActionXPATH.findElement(By.tagName("a")).click();
		Thread.sleep(1000);

	}

	@When("^cliquer sur valider D??cision$")
	public void cliquer_sur_valider_D??cision() throws Throwable {
		ModuleReunionPage.btnValiderDecisionsID.click();
		Thread.sleep(1000);
	}

	@Then("^Taux de r??alisation actions est correctement calculer$")
	public void taux_de_r??alisation_actions_est_correctement_calculer() throws Throwable {

		double taux = 0;
		double taux_realisation_Action;
		boolean comp = false;
		WebElement table = driver.findElement(By.id("ctl00_ContentPlaceHolder1_GridView3"));
		List<WebElement> TotalRowCount = table
				.findElements(By.xpath("//*[@id='ctl00_ContentPlaceHolder1_GridView3']/tbody/tr"));
		 System.out.println("Nombre des enregistrement est: "+ (TotalRowCount.size()));

		List<WebElement> TotalTaux = table
				.findElements(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_GridView3\"]/tbody/tr/td[4]")); 
		
		try
		  { 
			for (WebElement e : TotalTaux) {
			
				taux = taux + Integer.parseInt(e.getText());		
		  }
		  }
		 catch(Exception ex) 
		  {
			 taux = 0;
		  }
		taux = taux / (TotalRowCount.size());
		System.out.println("Taux_realisation: "+taux);
		 System.out.println("Taux_realisation_Action: "+ModuleReunionPage.tauxRealisationAction.getAttribute("value"));

		taux_realisation_Action = Integer.parseInt(ModuleReunionPage.tauxRealisationAction.getAttribute("value"));
		System.out.println("round(Taux): "+ Math.round(taux));
		if (taux_realisation_Action == Math.round(taux)) {
			comp = true;
			System.out.println("Taux realisation action  est correctement calcul??");
		}

		assertTrue("Taux realisation action  n'est pas correctement calcul??", comp);
	}

	@When("^saisir Commentaires$")
	public void saisir_Commentaires() throws Throwable {
		ModuleReunionPage.zoneCommentairesID.sendKeys("*******Commentaire test automatis??******");
	}

	@When("^cliquer sur valider Commentaires$")
	public void cliquer_sur_valider_Commentaires() throws Throwable {
		ModuleReunionPage.btnValiderCommantairesID.click();
	}

	@When("^cliquer sur Retour$")
	public void cliquer_sur_Retour() throws Throwable {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, -document.body.scrollHeight);");

		driver.findElement(By.id("ctl00_ContentPlaceHolder1_Retour")).click();
		Thread.sleep(1000);
		driver.navigate().back();
	}

	@When("^cliquer sur Demande action$")
	public void cliquer_sur_Demande_action() throws Throwable {		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, -document.body.scrollHeight);");
		
		driver.findElement(By.id("ctl00_ContentPlaceHolder1_LinkButtonDemand")).click();
		Thread.sleep(500);
		driver.findElement(By.id("ctl00_ContentPlaceHolder1_LinkButton12")).click();
		Thread.sleep(500);
		driver.findElement(By.id("ctl00_ContentPlaceHolder1_TextBox7")).sendKeys("5");
		driver.findElement(By.id("ctl00_ContentPlaceHolder1_LinkButton21")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_GridView8\"]/tbody/tr[1]/td[1]")).findElement(By.tagName("input")).click();
		driver.findElement(By.id("ctl00_ContentPlaceHolder1_LinkButton38")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_LinkButtonRetour\"]/span")).click();

	}

	@When("^cliquer sur Pi??ces jointes$")
	public void cliquer_sur_Pi??ces_jointes() throws Throwable {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, -document.body.scrollHeight);");
		driver.findElement(By.id("ctl00_ContentPlaceHolder1_LinkButton32")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("ctl00_ContentPlaceHolder1_LinkButton33")).click();
		driver.findElement(By.id("ctl00_ContentPlaceHolder1_tb_obj")).sendKeys("objet test pieces jointes automatique");
		driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_Panel_ajtpj\"]/div[2]/div[2]/div/div/span/label")).click();
		Thread.sleep(500);
		Runtime.getRuntime().exec("E:\\qualipro\\trunk\\AutomatisationTQualiPro_prod\\resources\\Scripts\\joindreFichier.exe");
		Thread.sleep(1000);
		driver.findElement(By.id("ctl00_ContentPlaceHolder1_LB_vald_ajtpiec")).click();
		Thread.sleep(500);
		driver.findElement(By.id("ctl00_ContentPlaceHolder1_LinkButton34")).click();
		Thread.sleep(500);
		
		
	}

	@When("^cliquer sur Personnes ?? informer$")
	public void cliquer_sur_Personnes_??_informer() throws Throwable {
		//JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("window.scrollTo(0, -document.body.scrollHeight);");

		WebElement element1= driver.findElement(By.id("ctl00_ContentPlaceHolder1_LinkButton_Informe"));
		JavascriptExecutor  executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click()", element1);
		Thread.sleep(500);

	}

	@When("^cliquer sur Selectionner Employe$")
	public void cliquer_sur_Selectionner_Employe() throws Throwable {
		Thread.sleep(500);
		ModuleReunionModel.cliquerSelectionnerEmploye(driver);
		Thread.sleep(500);
	}

	@When("^rechercher avec Nom Prenom Employe a informer$")
	public void saisir_Nom_Prenom_Employe() throws Throwable {
		ModuleReunionModel.RechercheEmployeInformer();	
		Thread.sleep(500);
		}

	@When("^selectionner Employe$")
	public void selectionner_Employe() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_GridView4\"]/tbody/tr[1]/td[1]")).findElement(By.tagName("input")).click();
		//ModuleReunionPage.choixEmplID.click();
		Thread.sleep(500);
	}

	@When("^cliquer sur valider selectionner Employe$")
	public void cliquer_sur_valider_selectionner_Employe() throws Throwable {
		ModuleReunionModel.cliquerValiderSelection();
		Thread.sleep(500);
		driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_LinkButton_Retour\"]/span")).click();
		Thread.sleep(500);
		
	}

	@When("^choisir Type reunion$")
	public void choisir_Type_reunion() throws Throwable {
		Select typeReunion = new Select(ModuleReunionPage.numeroType1);
		//Select typeReunion = new Select(driver.findElement(By.id("ctl00_ContentPlaceHolder1_List_FType")));
		typeReunion.selectByVisibleText(informations.get(1));
	}

	@When("^selectionner etat$")
	public void selectionner_etat() throws Throwable {
		Select etat = new Select(driver.findElement(By.id("ctl00_ContentPlaceHolder1_List_FEtat")));
		etat.selectByIndex(1);
		//etat.selectByVisibleText("R??alis??e");
	}

	@When("^saisir Ordre de jour$")
	public void saisir_Ordre_de_jour() throws Throwable {

		ModuleReunionPage.numeroOrdre.sendKeys("Ordre de jour test");
	}

	@Then("^Liste des reunions contient la fiche reunion ?? recherche$")
	public void Liste_des_reunions_contient_la_fiche_reunion_??_recherche() throws Throwable {
		WebElement table = driver.findElement(By.id("ctl00_ContentPlaceHolder1_GridView1"));
		List<WebElement> TotalRowCount = table
				.findElements(By.xpath("//*[@id='ctl00_ContentPlaceHolder1_GridView1']/tbody/tr"));
		List<WebElement> numero = table
				.findElements(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_GridView1\"]/tbody/tr[1]/td[2]"));
		System.out.println("get num: " + numero.get(0).getText());
		System.out.println("get size: " + TotalRowCount.size());
		assertTrue(numero.get(0).getText().contains(numero_reunion));
		//assertTrue(TotalRowCount.size() == 1);
	}

	@When("^cliquer sur PV$")
	public void cliquer_sur_PV() throws Throwable {
		ModuleReunionPage.pvActionID.click();
	}

	/*@When("^Exporter le rapport$")
	public void exporter_le_rapport() throws Throwable {
		JavascriptExecutor  executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click()", ModuleReunionPage.exportPVActionID);
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
	}*/

	@Then("^v??rifier si tous les donne??s existe$")
	public void v??rifier_si_tous_les_donne??s_existe() throws Throwable {
		Thread.sleep(8000);

		String path = "resources/Telechargement/CrystalReportViewer1.rtf";
		String fileData = null;
		fileData = RTFUtil.ReadRTFFile(path);
		System.out.println("**************************************PV************************************************" + fileData);

		for (int i = 0; i < informations.size(); i++) {
			int j = i + 1;
			System.out.println("l'information " + j + ":" + informations.get(i));
			System.out.println("Existe: " + common.ExisteWord(path, informations.get(i)));
			assertTrue(common.ExisteWord(path, informations.get(i)));
		}
		driver.navigate().back();
	}

	@When("^consulter reporting$")
	public void consulter_reporting() throws Throwable {
		/*Point coordinates = driver.findElement(By.xpath("#menu_rep > div > div > ul > li > a > img")).getLocation();
		Robot robot = new Robot();
		robot.mouseMove(coordinates.getX(), coordinates.getY() + 120);*/
		Thread.sleep(2000L);
		driver.findElement(By.cssSelector("#menu_rep > div > div > ul > li > a > img")).click();

	}

	@When("^cliquer sur liste des reunions$")
	public void cliquer_sur_liste_des_reunions() throws Throwable {
		//PageFactory.initElements(driver, ModuleReunionPage.class);
		Actions actions = new Actions(driver);
		WebElement moveonmenu = driver.findElement(By.xpath("//*[@id=\"menu_rep\"]/div/div/ul/li/ul/li[12]/a"));
		actions.moveToElement(moveonmenu)
				.moveToElement(driver.findElement(By.xpath("//*[@id=\"menu_rep\"]/div/div/ul/li/ul/li[12]/ul/li[1]/a")))
				.click().perform();
		Thread.sleep(1000);
		Select typeReunion = new Select(ModuleReunionPage.numeroType1);
		typeReunion.selectByVisibleText("WEEKend");
		driver.findElement(By.id("ctl00_ContentPlaceHolder1_Image1")).click();
		Thread.sleep(500);
		driver.findElement(By.id("ctl00_ContentPlaceHolder1_CalendarExtender1_today")).click();
	
		driver.findElement(By.id("ctl00_ContentPlaceHolder1_Image2")).click();
		Thread.sleep(500);
		driver.findElement(By.id("ctl00_ContentPlaceHolder1_CalendarExtender2_today")).click();
		
		driver.findElement(By.id("ctl00_ContentPlaceHolder1_LinkButton11")).click();
		

	}

	@Then("^v??rifier rapport$")
	public void v??rifier_rapport() throws Throwable {

		Thread.sleep(4000);
		String path = "C:/Qualipro_Auto/AutomatisationTQualiPro_23/AutomatisationTQualiPro_23/resources/Telechargement/CrystalReportViewer1.rtf";
		String pathContext = "E:/qualipro/trunk/AutomatisationTQualiPro_prod/resources/apercu";
		String fileData = null;
		// G??n??rer un nom significatif pour le fichier t??l??charg??
		String nom = Common.GenererNom("r??union", numero_reunion, ".rtf");

		// Renommer et Deplacer la fichier
		Common.RenomerDeplacer(nom, path, pathContext);
		fileData = RTFUtil.ReadRTFFile(pathContext);
		System.out.println(
				"**************************************Liste des reunions************************************************"
						+ fileData);
		
		System.out.println("R??union num??ro :" + numero_reunion);
		System.out.println("Existe: " + common.ExisteWord(pathContext, numero_reunion));
		assertTrue(common.ExisteWord(pathContext, numero_reunion));

	}

	@When("^V??rifier l'exportation Excel$")
	public void v??rifier_l_exportation_Excel() throws Throwable {
		String excelLoc = "C:/Qualipro_Auto/AutomatisationTQualiPro_23/AutomatisationTQualiPro_23/resources/Telechargement/test.xlsx";

		InputStream inputStream = null;
		try {
			inputStream = new FileInputStream(new File(excelLoc));
			Workbook wb = WorkbookFactory.create(inputStream);
			int numberOfSheet = wb.getNumberOfSheets();
			System.out.println("number Of Sheet :" + numberOfSheet);

			Sheet sheet = wb.getSheetAt(0);
			Cell Cell = sheet.getRow(7).getCell(0);

			String CellData = Cell.getStringCellValue();

			System.out.println("Cell Data :" + CellData);

		} catch (Exception e) {

			throw (e);
		}

	}
}
