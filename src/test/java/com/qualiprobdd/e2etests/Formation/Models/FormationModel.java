package com.qualiprobdd.e2etests.Formation.Models;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Random;

import static org.testng.Assert.assertTrue;

import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;

import com.qualiprobdd.e2etests.Formation.Pages.FormationPage;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qualiprobdd.e2etests.authentification.models.AuthentificationModel;
import com.qualiprobdd.e2etests.util.Common;
import com.qualiprobdd.e2etests.util.ExcelUtils;
import com.qualiprobdd.e2etests.util.RandomValue;
import org.testng.Assert;

public class FormationModel {
	static String Demandeur, utilisateurs, NumFormation;
	static boolean participe;
	private static String
			Path = "resources/testData/TestData.xlsx";

//*****************************développe_par_FATMA_CHAOUACHI

	public static void consulter_sous_module_Types_de_thèmes(WebDriver driver) throws Throwable {


		Common.AccéderModule(12, 2, 10, driver);

	}

	public static void cliquer_sur_ajouter_Types_de_thèmes(WebDriver driver) throws Throwable {
		Thread.sleep(1000L);
		FormationPage.wAjouter_un_Type_de_thème.click();

	}

	public static void saisir_un_Type_de_thème(int row) throws Throwable {
		Thread.sleep(2000);

		String st =LocalDateTime.now().toString();
		System.out.println("Type de thème st1 =  "+st);

		ExcelUtils.setExcelFile(Path, "Formation");
		ExcelUtils.setCellData1(st, row, 16, Path,"Formation");
		FormationPage.wsaisir_un_Type_de_thème.sendKeys(st);

	}
	public static void cliquer_sur_valider10  (WebDriver driver) throws Throwable {
		Thread.sleep(1000L);
		FormationPage.wcliquer_sur_valider10.click();

	}
	
	public static void vérifier_Type_de_thème_ajouté(int row ) throws Throwable {
		FormationPage.wcliquer_sur_le_bouton_retour_Type_thème.click();
		ExcelUtils.setExcelFile(Path, "Formation");
		String st = ExcelUtils.getCellData1(row, 16);
		System.out.println(st+"Type de thème st2 =  ");

		Thread.sleep(2000);
		FormationPage.wremplir_le_champ.sendKeys(st);
		FormationPage.wcliquer_sur_le_bouton_Rechercher_Type_de_Thème.click();
		String st11=FormationPage.wTab_type_de_thème.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_GridView1_wrapper\"]/div[2]/div/table/tbody/tr[1]/td[2]")).getText();
		System.out.println(st11+"Type de thème st11 =  ");

		//Assert.assertEquals(st,st11);

		Thread.sleep(1000);

	}
	
	public static void consulter_sous_module_Types_de_formation(WebDriver driver) throws Throwable {

		Common.AccéderModule(12, 2, 9, driver);

	}

	public static void cliquer_sur_ajouter_Types_de_formation(WebDriver driver) throws Throwable {
		Thread.sleep(1000L);
		FormationPage.wajouter_Types_de_formation.click();

	}
	
	public static void saisir_un_Type_de_formation (int row) throws Throwable {
		Thread.sleep(2000);
		String st = " formation auto" + LocalDateTime.now().toString();
		System.out.println("st1 =  "+st);
		ExcelUtils.setExcelFile(Path, "Formation");
		ExcelUtils.setCellData1(st, row, 3, Path,"Formation");
		FormationPage.wsaisir_un_Type_de_formation.sendKeys(st);


	}
	
	public static void cliquer_sur_le_bouton_radio_Avec_évaluation_à_chaud(WebDriver driver) throws Throwable {
		Thread.sleep(1000L);
		FormationPage.wcliquer_sur_le_bouton_radio_Avec_évaluation_chaud.click();
	}

	public static void cliquer_sur_valider_Types_de_formation (WebDriver driver) throws Throwable {
		Thread.sleep(1000L);
		FormationPage.wcliquer_sur_valider_Types_de_formation.click();
	}
	//*****************************
	public static void consulter_sous_module_Sociétés(WebDriver driver) throws Throwable {

		Common.AccéderModule(12, 2, 8, driver);
	}


	public static void cliquer_sur_ajouter_une_Société() throws Throwable {
		Thread.sleep(1000L);
		FormationPage.wajouter_une_société .click();
	}


	public static void saisir_une_Société(int row) throws Throwable {
		Thread.sleep(2000);
		String st = "SOCIETE AUTO" + LocalDateTime.now().toString();
		System.out.println("SOCIETE st14 =  "+st);

		ExcelUtils.setExcelFile(Path, "Formation");
		ExcelUtils.setCellData1(st, row, 6, Path,"Formation");
		FormationPage.wsaisir_une_Société.sendKeys(st);
	
	}


	public static void cliquer_sur_valider_Société() throws Throwable {
		Thread.sleep(1000L);
		FormationPage.wcliquer_sur_valider_Société .click();
	}


	public static void vérifier_une_Société_ajoutée(int row) throws Throwable {
		FormationPage.wBoutton_retour_société.click();
		ExcelUtils.setExcelFile(Path, "Formation");
		String st = ExcelUtils.getCellData1(row, 6);
		System.out.println(st+"SOCIETE st13 =  ");

		Thread.sleep(2000);
		FormationPage.wremplir_le_champ_société.sendKeys(st);
		FormationPage.wRechercher_société.click();
		String st11=FormationPage.wTab_société.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_GridView1\"]/tbody/tr[1]/td[2]")).getText();
		System.out.println(st11+"SOCIETE st13 =  ");

		//Assert.assertEquals(st,st11);

		Thread.sleep(1000);
	}

//*****************************************

	public static void consulter_sous_module_type_de_critère_d_évaluation(WebDriver driver ) throws Throwable {
				Common.AccéderModule(12, 2, 7, driver);
	}


	public static void cliquer_sur_ajouter_type_de_critère_d_évaluation() throws Throwable {
		Thread.sleep(1000L);
		FormationPage.wajouter_type_de_critère_d_évaluation.click();
	}

	public static void saisir_type_de_critère_d_évaluation(int row) throws Throwable {
		Thread.sleep(2000);
		String st = "Type de critére" + LocalDateTime.now().toString();
		System.out.println("SOCIETE st15 =  "+st);

		ExcelUtils.setExcelFile(Path, "Formation");
		ExcelUtils.setCellData1(st, row, 17, Path,"Formation");
		FormationPage.wsaisir_type_de_critère_d_évaluation.sendKeys(st);

	}


	public static void cliquer_sur_valider_type_de_critère_d_évaluation() throws Throwable {
		Thread.sleep(1000L);
		FormationPage.wcliquer_sur_valider_type_de_critère_d_évaluation.click();
	}


	public static void vérifier_type_de_critère_d_évaluation_ajoutée(int row) throws Throwable {
		FormationPage.wBoutton_retour_type_de_critère_d_évaluation.click();
		ExcelUtils.setExcelFile(Path, "Formation");
		
		String st = ExcelUtils.getCellData1(row, 17);
		System.out.println(st+"SOCIETE st18 =");

		Thread.sleep(2000);
		FormationPage.wremplir_le_champ_type_de_critère_d_évaluation.sendKeys(st);
		FormationPage.wRechercher_type_de_critère_d_évaluation.click();
		String st11=FormationPage.wTab_type_de_critère_d_évaluation.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_GridView1\"]/tbody/tr[1]/td[2]")).getText();
		System.out.println(st11+"SOCIETE st18 =");
//Boolean  ok  =st.equals(st11+"  ");
		//Assert.assertTrue(ok,"rahi   mrgla  ");

		Thread.sleep(1000);
	}
	public static void consulter_sous_module_thèmes_de_formation(WebDriver driver) throws Throwable {

		Common.AccéderModule(12, 2, 5, driver);
	}

	public static void cliquer_sur_ajouter_thèmes_de_formation() throws Throwable {
		Thread.sleep(1000L);
		FormationPage.wcliquer_sur_ajouter_thèmes_de_formation.click();
	}

	public static void saisir_thèmes_de_formation(int  row) throws Throwable {
		Thread.sleep(2000);
		String st = "Théme AUTO" + LocalDateTime.now().toString();
		System.out.println("Théme AUTO =  "+st);

		ExcelUtils.setExcelFile(Path, "Formation");
		ExcelUtils.setCellData1(st, row, 2, Path,"Formation");
		FormationPage.wsaisir_thèmes_de_formation.sendKeys(st);

	}

	public static void choisir_un_type_de_Thème(int row) throws Throwable {

	Select select=new Select(FormationPage.wchoisir_un_type_de_Thème);
		ExcelUtils.setExcelFile(Path, "Formation");
		String st=ExcelUtils.getCellData1( row, 16);
		System.out.println(" verifier"+st);
	select.selectByVisibleText(st);
	}

	public static  void cliquer_sur_valider_thèmes_de_formation() throws Throwable {
		FormationPage.wcliquer_sur_valider_thèmes_de_formation.click();
	}


	public static void vérifier_thèmes_de_formation_ajoutée(int row) throws Throwable {
		FormationPage.wBoutton_retour_thèmes_de_formation.click();
		ExcelUtils.setExcelFile(Path, "Formation");
		String st = ExcelUtils.getCellData1(row, 2); 
		System.out.println(st+"Théme AUTO st20 =");

		Thread.sleep(2000);
		FormationPage.wremplir_le_champ_thèmes_de_formation.sendKeys(st);
		FormationPage.wRechercher_thèmes_de_formation.click();
		String st11=FormationPage.wTab_thèmes_de_formation.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_GridView1_wrapper\"]/div[2]/div")).getText();
		System.out.println(st11+"Théme AUTO st20 =");


		Thread.sleep(1000);

	}
	
	public static void consulter_sous_module_Organisme(WebDriver driver) throws Throwable {

		Common.AccéderModule(12, 2, 4, driver);
	}

	
	public static void cliquer_sur_ajouter_Organisme_de_Formation() throws Throwable {
		Thread.sleep(1000L);
		FormationPage.wcliquer_sur_ajouter_Organisme_de_Formation.click();
	}


	public static void saisir_Organisme_de_Formation(int row) throws Throwable {
		Thread.sleep(2000);
		String st = "ORGANISME AUTO" + LocalDateTime.now().toString();
		System.out.println("ORGANISME AUTO =  "+st);

		ExcelUtils.setExcelFile(Path, "Formation");
		ExcelUtils.setCellData1(st, row, 7, Path,"Formation");
		FormationPage.wsaisir_Organisme_de_Formation.sendKeys(st);
	}


	public static void cliquer_sur_valider_Organisme_de_Formation() throws Throwable {
		FormationPage.wcliquer_sur_valider_Organisme_de_Formation.click();
	}


	public static void vérifier_Organisme_de_Formation_ajoutée(int row) throws Throwable {
		Thread.sleep(1000);
		//FormationPage.wBoutton_retour_Organisme_de_Formation.click();
		ExcelUtils.setExcelFile(Path, "Formation");
		String st = ExcelUtils.getCellData1(row, 7);
		System.out.println(st+"ORGANISME AUTO st28 =");

		Thread.sleep(2000);
		FormationPage.wremplir_le_champ_Organisme_de_Formation.sendKeys(st);
		FormationPage.wRechercher_Organisme_de_Formation.click();
		String st11= FormationPage.wTab_Organisme_de_Formation.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_GridView1\"]/tbody/tr[1]/td[2]")).getText();
		System.out.println(st11+"ORGANISME AUTO st28 =");


		Thread.sleep(1000);
	}




	//Fin_dev_par_FATMA_CHAOUACHI



	
	public static void cliquer_sur_paramétrage_formation(WebDriver driver) throws Throwable {
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click()", FormationPage.wparametrageFormation);
	}

	public static void choisir_une_évaluation_à_chaud(WebDriver driver) throws Throwable {
		ExcelUtils.setExcelFile(Path, "Formation");
		String st = ExcelUtils.getCellData1(1, 14);
		System.out.println("l'évaluation à chaud===>" +st);
		if (st.equals("note")) {
			JavascriptExecutor executor = (JavascriptExecutor) driver;
			executor.executeScript("arguments[0].click()", FormationPage.wchaudparNote);

		} else {
			JavascriptExecutor executor = (JavascriptExecutor) driver;
			executor.executeScript("arguments[0].click()", FormationPage.wchaudparNiveaux);

		}
		
		Thread.sleep(500);
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click()", FormationPage.wbtnValideEvaPa);
		Thread.sleep(500);

	}
	
	public static void consulter_SSM_Formation(WebDriver driver) throws Throwable {
		utilisateurs=FormationPage.UtilID.getAttribute("innerText");
		Common.AccéderModule(12,2,1, driver);
	}

	
	public static void Ajouter_formation(WebDriver driver) throws Throwable {
		//FormationPage.AjtForID.click();
		//added by rahma
		JavascriptExecutor  executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click()", FormationPage.AjtForID);

		Thread.sleep(2000L);
	}
	
	public static void choisir_theme(String them,WebDriver driver) throws Throwable {
		//Select select = new Select(FormationPage.ThemeID);
		//select.selectByVisibleText(them);
		JavascriptExecutor executor2 = (JavascriptExecutor) driver;
		executor2.executeScript("arguments[0].click()", FormationPage.wAddThopic);
		Thread.sleep(500);
		JavascriptExecutor executor3 = (JavascriptExecutor) driver;
		String  themeRandom =RandomValue.randomString(8);
		FormationPage.wWriteTopic.sendKeys(themeRandom);
		executor3.executeScript("arguments[0].click()", FormationPage.wValideTopic);
Thread.sleep(500);
System.out.println(" ----> theme  de formation  : "+themeRandom);
JavascriptExecutor executor4 = (JavascriptExecutor) driver;

		executor4.executeScript("arguments[0].click()", FormationPage.wRetourTopic);
		Thread.sleep(500);
		}
	
	public static void choisir_theme() throws Throwable {
		Select select = new Select(FormationPage.ThemeID);
		Random rand = new Random();
		int Index = rand.nextInt(select.getOptions().size());
		Thread.sleep(800);
		System.err.println(" index   topic"+Index);
		select.selectByIndex(Index);

		
	}
	
	public static void saisir_objectifs(WebDriver driver) throws Throwable {
		
		JavascriptExecutor executor2 = (JavascriptExecutor) driver;
		executor2.executeScript("arguments[0].click()", FormationPage.wajoutObjf);
		FormationPage.wsaisirObjf.sendKeys("Objectif AUTO " + RandomValue.randomString(10));
		JavascriptExecutor executor3 = (JavascriptExecutor) driver;
		executor3.executeScript("arguments[0].click()", FormationPage.wbtnObjf);
		
		executor2.executeScript("arguments[0].click()", FormationPage.wajoutObjf);
		FormationPage.wsaisirObjf.sendKeys("Objectif AUTO " + RandomValue.randomString(10));
		executor3.executeScript("arguments[0].click()", FormationPage.wbtnObjf);
		
		executor2.executeScript("arguments[0].click()", FormationPage.wajoutObjf);
		FormationPage.wsaisirObjf.sendKeys("Objectif AUTO " + RandomValue.randomString(10));
		executor3.executeScript("arguments[0].click()", FormationPage.wbtnObjf);
	}
	
	public static void ajouter_details(WebDriver driver) throws Throwable
	{
		//added by rahma
		//FormationPage.DetailsID.click();
		JavascriptExecutor  executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click()", FormationPage.DetailsID);

		//FormationPage.AjtDetailID.click();
		executor.executeScript("arguments[0].click()", FormationPage.AjtDetailID);
		Thread.sleep(1000L);
		Saisir_date_debut(driver);
		Saisir_heure_debut();
		Saisir_date_fin(driver);
		Saisir_heure_fin();
		
		//FormationPage.VldDetID.click();
		executor.executeScript("arguments[0].click()", FormationPage.VldDetID);
		//FormationPage.QttDetID.click();
		executor.executeScript("arguments[0].click()", FormationPage.QttDetID);
		
	}
	
	public static void Saisir_heure_debut(){
		Select select = new Select(FormationPage.HDebID);
		select.selectByVisibleText("09:00");
	}
	
	public static void Saisir_heure_fin() throws Throwable{
		Select select = new Select(FormationPage.HFinID);
		select.selectByVisibleText("18:00");
	}
	
	
	
	public static void Saisir_date_debut(WebDriver driver) throws Throwable{
		//changed by rahma
		Actions action = new Actions(driver);
		
		//WebDriverWait wait = new WebDriverWait(driver,60);
       // wait.until(ExpectedConditions.visibilityOf(FormationPage.DDebID));
		//FormationPage.DDebID.click();
        action.moveToElement(FormationPage.DDebID).click().perform();

		//wait.until(ExpectedConditions.visibilityOf(FormationPage.DDebSysID));
		//FormationPage.DDebSysID.click();
		action.moveToElement(FormationPage.DDebSysID).click().perform();
	}
	
	public static void Saisir_date_fin(WebDriver driver) throws Throwable {
		//changed by rahma
		//WebDriverWait wait = new WebDriverWait(driver,60);
        //wait.until(ExpectedConditions.visibilityOf(FormationPage.DFinID));
		//FormationPage.DFinID.click();
		//wait.until(ExpectedConditions.visibilityOf(FormationPage.DFinSysID));
		//FormationPage.DFinSysID.click();
		Actions action = new Actions(driver);
		action.moveToElement(FormationPage.DFinID).click().perform();
		action.moveToElement(FormationPage.DFinSysID).click().perform();
	}
	public static void Choisir_organisme(String org) throws Throwable {
		Select select = new Select(FormationPage.OrgID);
		select.selectByVisibleText(org);
	}
	
	public static void Choisir_type_formation(String form) throws Throwable {
		try {
			
			FormationPage.TypForID.isDisplayed();
		Select select = new Select(FormationPage.TypForID);
		select.selectByVisibleText(form);
		}catch (NoSuchElementException e) {
			Common.Exporter_visibilité("type formation est invisible");
		}
	}
	public static void choisir_type_formateur(String typformateur, WebDriver driver) throws Throwable{
		Select select = new Select(FormationPage.TypFormateurID);
		Cookie cookie1 = driver.manage().getCookieNamed("lan");
		if(cookie1.getValue().equals("en-US"))
		{
			if(typformateur.equals("Formateur interne"))
			{
				select.selectByVisibleText("Internal Trainer");
			
			}else if(typformateur.equals("Formateur externe"))
			{
				select.selectByVisibleText("External Trainer");
			}
		}else {
		select.selectByVisibleText(typformateur);
		}
	}
	public static void Choisir_Formateur(String formateur,String typformateur) throws Throwable {
		 Thread.sleep(1000L);
		 if(typformateur.equals("Formateur interne")||typformateur.equals("Internal Trainer")) {
			 FormationPage.FormateurID.sendKeys(formateur);
		 }
		 else {
			 FormationPage.Formateur2ID.sendKeys(formateur);
		 }
	}
	public static void saisir_cout() throws Throwable {
		FormationPage.CoutID.clear();
		FormationPage.CoutID.sendKeys("1000");
	}
	public static void saisir_restourne() throws Throwable {
		FormationPage.RestID.clear();
		FormationPage.RestID.sendKeys("500");
	}  
	public static void saisir_lieu() throws Throwable {
		FormationPage.LieuID.sendKeys("Tunisie");
	}
	
	public static void choisir_societe(String soc) throws Throwable {
		Select select = new Select(FormationPage.SocID);
		select.selectByVisibleText(soc);
	}
	public static void saisir_Num_interne() throws Throwable {
		FormationPage.InterneID.sendKeys("1");
	}

	
	public static void sélectionner_evaluation_formateur(String typevalform,WebDriver driver, String EmpHab) throws Throwable {
		 final DateFormat dateFormat;
			Select select = new Select(FormationPage.EvalForID);
			Cookie cookie1 = driver.manage().getCookieNamed("lan");
			if(cookie1.getValue().equals("en-US"))
			{
				dateFormat = new SimpleDateFormat("MM/dd/yyyy");
				if(typevalform.equals("OUI"))
				{
					select.selectByVisibleText("Yes");
					
				
				}else if(typevalform.equals("NON"))
				{
					select.selectByVisibleText("NO");
					
				}
			}else {
				dateFormat = new SimpleDateFormat("dd/MM/yyyy");
			select.selectByVisibleText(typevalform);
			}
			if(typevalform.equals("OUI")) 
			{
				//FormationPage.ValEvalID.click();
				//Thread.sleep(1000L);
				Date dt = new Date();
				Calendar c = Calendar.getInstance(); 
				c.setTime(dt); 
				c.add(Calendar.DATE,1);
				dt = c.getTime();
				String Sdate = dateFormat.format(dt);
				System.out.println(Sdate);
				WebElement wb = driver.findElement(By.name("ctl00$ContentPlaceHolder1$TextBox25"));
				JavascriptExecutor jse = (JavascriptExecutor)driver;
				jse.executeScript("arguments[1].value = arguments[0];",Sdate, wb);
				
				Thread.sleep(1000L);
				if(!(EmpHab.equals("")))
				{
					//changed  by rahma
					//FormationPage.AjtEmpEvalID.click();
					JavascriptExecutor  executor = (JavascriptExecutor)driver;
					executor.executeScript("arguments[0].click()", FormationPage.AjtEmpEvalID);

					Thread.sleep(1000L);
					FormationPage.ChkEmpEvalID.sendKeys(EmpHab);
					WebElement cellIneed = FormationPage.TableEmpEvalID.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_GridView7\"]/tbody/tr/td[1]"));
					WebElement cellIneed1 = cellIneed.findElement(By.tagName("input"));
					executor.executeScript("arguments[0].click()", cellIneed1);
					//cellIneed1.click();
					//FormationPage.VldEmpEvalID.click();
					executor.executeScript("arguments[0].click()", FormationPage.VldEmpEvalID);
					Thread.sleep(1000L);
			    }
			}
			
	}
	
	public static void valider_fiche_formation (WebDriver driver) throws Throwable {
	
		//FormationPage.VldFichID.click();
		//added by rahma
		Actions action = new Actions(driver);
		action.moveToElement( FormationPage.VldFichID).perform();

		JavascriptExecutor  executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click()", FormationPage.VldFichID);

	}
	public static void ajouter_participant(WebDriver driver) throws Throwable {
		//FormationPage.AjtPartiID.click();
		//added by rahma
		Thread.sleep(2000L);
		// Actions action = new Actions(driver);
	//	action.moveToElement(FormationPage.AjtPartiID).perform();
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", FormationPage.AjtPartiID);

		JavascriptExecutor  executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click()", FormationPage.AjtPartiID);

		Thread.sleep(1000L);
		FormationPage.RechPartiID.sendKeys("AUTO1");
		//FormationPage.rechtBtnID.click();
		JavascriptExecutor  executor3 = (JavascriptExecutor)driver;

		executor3.executeScript("arguments[0].click()", FormationPage.rechtBtnID);
		Thread.sleep(1000L);
		WebElement cellIneed = FormationPage.TablePartiID.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_GridView3\"]/tbody/tr[1]/td[1]"));
	    WebElement cellIneed1 = cellIneed.findElement(By.tagName("input"));
	    //cellIneed1.click();
	    JavascriptExecutor  executor4 = (JavascriptExecutor)driver;
	    executor4.executeScript("arguments[0].click()", cellIneed1);
	    //FormationPage.VldPartiID.click();
	    JavascriptExecutor  executor5 = (JavascriptExecutor)driver;
	    executor5.executeScript("arguments[0].click()", FormationPage.VldPartiID);
	    Thread.sleep(1000L);
	}
	public static void ajouter_group(String Group,WebDriver driver) throws Throwable {
		//added by rahma
		JavascriptExecutor  executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click()", FormationPage.AjtGrpID);
		//FormationPage.AjtGrpID.click();
		Thread.sleep(1000L);
		FormationPage.RechGrpID.sendKeys(Group);
		executor.executeScript("arguments[0].click()", FormationPage.RechBtnGroupID);
		//FormationPage.RechBtnGroupID.click();
		Thread.sleep(1000L);
		WebElement cellIneed = FormationPage.TableGrpID.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_GridViewGrp\"]/tbody/tr/td[1]"));
	    WebElement cellIneed1 = cellIneed.findElement(By.tagName("input"));
	    //cellIneed1.click();
	    executor.executeScript("arguments[0].click()", cellIneed1);
	    executor.executeScript("arguments[0].click()", FormationPage.VldGrpID);
	    //FormationPage.VldGrpID.click();
	    Thread.sleep(1000L);
	}
	
    public static void verifier_formation() throws Throwable {
    	   
		Thread.sleep(1000L);
		NumFormation =FormationPage.NumFormationID.getText();
		assertTrue(!(NumFormation.equals("")));
		System.out.println("Le plan de la Formation N:"+ NumFormation + "est Ajoute");
		asserttrueF(true);		
}
	
	 public static void asserttrueF(Boolean incrementation) {
			System.out.println(incrementation);
		}
	 
	 public static void Choisir_responsable_suivi(String typesuivi ,WebDriver driver,String Resp) throws Throwable{
		 if(typesuivi.equals("MONO")){
			 final DateFormat dateFormat;
				Cookie cookie1 = driver.manage().getCookieNamed("lan");
				if(cookie1.getValue().equals("en-US")) {
					dateFormat = new SimpleDateFormat("MM/dd/yyyy");
				}else {
					dateFormat = new SimpleDateFormat("dd/MM/yyyy");
				}
				//added by rahma
				JavascriptExecutor  executor = (JavascriptExecutor)driver;
				executor.executeScript("arguments[0].click()", FormationPage.RespID);

			 //FormationPage.RespID.click();
			 Thread.sleep(1000L);
			 executor.executeScript("arguments[0].click()", FormationPage.NomRespSuiviID);
			 //FormationPage.NomRespSuiviID.click();
			 Thread.sleep(1000L);
			 FormationPage.RechRespSuiviID.sendKeys(Resp);
			 executor.executeScript("arguments[0].click()", FormationPage.RechBtnRespID);
			 //FormationPage.RechBtnRespID.click();
				WebElement cellIneed = FormationPage.TableRespSuiviID.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_GridView1yt\"]/tbody/tr[1]/td[1]"));
			    WebElement cellIneed1 = cellIneed.findElement(By.tagName("a"));
			    //cellIneed1.click();
			    executor.executeScript("arguments[0].click()", cellIneed1);
			    Thread.sleep(1000L);
				Date dt = new Date();
				Calendar c = Calendar.getInstance(); 
				c.setTime(dt); 
				c.add(Calendar.DATE,0);
				dt = c.getTime();
				String Sdate = dateFormat.format(dt);
				System.out.println(Sdate);
				JavascriptExecutor jse = (JavascriptExecutor)driver;
				jse.executeScript("arguments[1].value = arguments[0];",Sdate, FormationPage.DelSuiviID);
				executor.executeScript("arguments[0].click()", FormationPage.VldSuiviID);
				//FormationPage.VldSuiviID.click();
			  
		 }
		 
	 }
	 
		public static void Consulter_Fiche(String Nfiche, WebDriver driver) throws Throwable{
			//added by rahma
			

			FormationPage.RechFilForID.sendKeys(Nfiche);
			//FormationPage.VldRechFilForID.click();
			JavascriptExecutor  executor = (JavascriptExecutor)driver;
			executor.executeScript("arguments[0].click()", FormationPage.VldRechFilForID);
			Thread.sleep(1000L);
			WebElement cellIneed = FormationPage.TableFilID.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_GridView1p\"]/tbody/tr/td[2]"));
		    WebElement cellIneed1 = cellIneed.findElement(By.tagName("a"));
		    executor.executeScript("arguments[0].click()", cellIneed1);
		    //cellIneed1.click();
		    Thread.sleep(1000L);
			
		}
		
		public static void cliquer_Editer_Participation(WebDriver driver) throws Throwable
		{
			Actions action = new Actions(driver);
			//added by rahma
			action.moveToElement(FormationPage.EditPartID).click().perform();
			//FormationPage.EditPartID.click();
			Thread.sleep(1000L);
		}
		
		public static void Editer_Participation(WebDriver driver) throws Throwable
		{
			Actions action = new Actions(driver);
			action.moveToElement(FormationPage.TablePartID).perform();
			List<WebElement> allRows=FormationPage.TablePartID.findElements(By.tagName("tr"));
			System.out.println(allRows.size());
			int i=1;
			 while(i<=allRows.size()/2) 
			 {
				WebElement cellIneed = FormationPage.TablePartID.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_GridView1\"]/tbody/tr["+i+"]/td[3]"));
				WebElement cellIneed1 = cellIneed.findElement(By.tagName("select"));
				Select select = new Select(cellIneed1);
				select.selectByIndex(1);
				//select.selectByVisibleText("OUI");
				i++;
			 }
			 
		}
		
		public static void Valider_Editer_Participation(WebDriver driver) throws Throwable
		{
			Actions action = new Actions(driver);
			action.moveToElement(FormationPage.VldEditID).perform();
			FormationPage.VldEditID.click();
			
		}
		
		public static void Vérifier_réalisation(WebDriver driver) throws Throwable
		{
			Actions action = new Actions(driver);
			action.moveToElement(FormationPage.VolReaID).perform();
			FormationPage.VolReaID.click();
			Thread.sleep(1000L);
			Select select = new Select(FormationPage.StatReaID);
			String State=select.getFirstSelectedOption().getText();
			System.out.println("l'état de la Formation est: " + State);
			asserttrueF(true);		
					
		}
		
		public static void Connecter_en_tant_que(String parti,WebDriver driver) throws Throwable
		{
			AuthentificationModel.Changer_Compte(parti,driver);
			participe=true;
			Thread.sleep(4000L);
			
		}
		
		 public static void acceder_agenda_evaluation_chaud(WebDriver driver) throws Throwable 
		 {
			 Thread.sleep(1000);
			 JavascriptExecutor  executor = (JavascriptExecutor)driver;
			 executor.executeScript("arguments[0].click()", FormationPage.AgdID);
			 //FormationPage.AgdID.click();
			 Thread.sleep(1000L);
			 boolean Test=isElementPresent(By.id("Span4"),driver);
			 Thread.sleep(1000L);
		
			 if(Test==false)
			 {
				 //added by rahma
				 //FormationPage.HomeID.click();
				
				 executor.executeScript("arguments[0].click()", FormationPage.HomeID);

				 participe=false;
				 System.out.println("Vous n\' avez pas des evaluations a chaud");
			 }else
			 {
				 //added by rahma
				 executor.executeScript("arguments[0].click()", FormationPage.VolEvalChdID);
			// FormationPage.VolEvalChdID.click();
			 }
			 
			 
		 }
		 
		 public static void choisir_fiche_a_evaluer(String fich, WebDriver driver) throws Throwable
		 {
			 if(participe==true) {
				 FormationPage.RechFichChdID.sendKeys(fich);
				 boolean Test=isElementPresent(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_GridView4\"]/tbody/tr/td[1]"),driver);
				 JavascriptExecutor  executor = (JavascriptExecutor)driver;
				 //Thread.sleep(1000L);
				 if(Test==false)
				 {
					 //added by rahma
					 executor.executeScript("arguments[0].click()", FormationPage.HomeID);
					 //FormationPage.HomeID.click();
					 participe=false;
					 System.out.println("Vous n\' avez pas participe a cette formation");
				 
				 }else 
				 {
					 Thread.sleep(500);
					 WebElement Element=FormationPage.PosFichChdID.findElement(By.tagName("a"));
					 executor.executeScript("arguments[0].click()", Element);
					 //Element.click();
				 }
			 }
		 }
		 
			public static void saisir_notes_evaluation() throws Throwable
			{
				List<WebElement> Elements = FormationPage.TableEvalParID.findElements(By.tagName("tr"));
				int i = 1;
				ExcelUtils.setExcelFile(Path, "Formation");
				String typeeval = ExcelUtils.getCellData1(1, 14);
				System.out.println("l'évaluation à chaud===>" + typeeval);
				
					if ((participe == true) && (typeeval.equals("niveau")))
						{
							int note;
							if ((Elements.size() + 1) / 2 == 1) 
							{
							WebElement cellIneed = FormationPage.TableEvalForID
									.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_GridView7\"]/tbody/tr/td[3]"));

							WebElement cellIneed1 = cellIneed.findElement(By.tagName("select"));
							Select select = new Select(cellIneed1);
							do {
								note = RandomValue.randomInt(select.getOptions().size());
								select.selectByIndex(note);
							} while (note == 0);

							} else
							{

							while (i < ((Elements.size() + 1) / 2)) {

								WebElement cellIneed = FormationPage.TableEvalParID.findElement(
										By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_GridView7\"]/tbody/tr[" + i + "]/td[3]"));
								WebElement cellIneed1 = cellIneed.findElement(By.tagName("select"));
								Select select = new Select(cellIneed1);
								do {
									note = RandomValue.randomInt((select.getOptions().size()) - 1);
								} while (note == 0);
								select.selectByIndex(note);
								i++;
							}
							
							}}
						else if ((participe == true) && (typeeval.equals("note")))
						{
							
							//*[@id="ctl00_ContentPlaceHolder1_GridView7"]/tbody/tr[1]/td[3]/table/tbody/tr/td[1]	
							//*[@id="ctl00_ContentPlaceHolder1_GridView7"]/tbody/tr[1]/td[3]
							double random ;
							DecimalFormat df ;
							String strandom;
					
								
							int note;
							if ((Elements.size() + 1) / 2 == 1) 
							{
							WebElement cellIneed = FormationPage.TableEvalForID
									.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_GridView7\"]/tbody/tr/td[3]"));

							WebElement cellIneed1 = cellIneed.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_GridView7\"]/tbody/tr/td[3]/table/tbody/tr/td[1]"));
							WebElement cellIneed2 = cellIneed1.findElement(By.tagName("input"));
							random =  Math.random() * (5);
							df = new DecimalFormat();
							df.setMaximumFractionDigits(2);
						     strandom=df.format(random);
							System.out.println(" strrandom  est   : "+strandom);
							cellIneed2.sendKeys(strandom);
						

							} else
							{

							while (i < ((Elements.size() + 1) / 2)) {

								WebElement cellIneed = FormationPage.TableEvalParID.findElement(
								
								By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_GridView7\"]/tbody/tr[" + i + "]/td[3]"));
								WebElement cellIneed1 = cellIneed.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_GridView7\"]/tbody/tr[" + i + "]/td[3]/table/tbody/tr/td[1]"));
								WebElement cellIneed2 = cellIneed1.findElement(By.tagName("input"));
								random =  Math.random() * (5);
								df = new DecimalFormat();
								df.setMaximumFractionDigits(2);
							     strandom=df.format(random);
								System.out.println(" strrandom  est   : "+strandom);
								cellIneed2.sendKeys(strandom);
								i++;
							}
							
							}
							}
						

			}

		 public static void saisir_commentaire_participant() throws Throwable
		 {
			 if(participe==true) {
			 FormationPage.CommParID.clear();
		     FormationPage.CommParID.sendKeys("Commentaire AUTO");
			 }
		 }
		 public static void saisir_suggestion_participant() throws Throwable
		 {
			 if(participe==true) {
			 FormationPage.SuggParID.clear();
		     FormationPage.SuggParID.sendKeys("Suggestion AUTO");
			 }
			 
		 }
		 public static void valider_evaluation_participant(WebDriver driver) throws Throwable
		 {
			 if(participe==true) {
				 JavascriptExecutor  executor = (JavascriptExecutor)driver;
				 executor.executeScript("arguments[0].click()", FormationPage.VldEvalPartID);
			 //FormationPage.VldEvalPartID.click();
			 }
		 }
		 
		 public static void acceder_agenda_formateur(String NumFich,WebDriver driver) throws Throwable
		 {
			 JavascriptExecutor  executor = (JavascriptExecutor)driver;
			 executor.executeScript("arguments[0].click()", FormationPage.AgdID);
			 WebDriverWait wait = new WebDriverWait(driver,60);
		     wait.until(ExpectedConditions.visibilityOf(FormationPage.VolEvalForID));
			 executor.executeScript("arguments[0].click()", FormationPage.VolEvalForID);
			 //FormationPage.VolEvalForID.click();
			 FormationPage.RechFichForID.sendKeys(NumFich);
			 WebElement Element=FormationPage.PosfichForID.findElement(By.tagName("a"));
			 executor.executeScript("arguments[0].click()", Element);
			 //Element.click();
			 Thread.sleep(1000L);
		 } 
		 public static void cliquer_editer_notes(WebDriver driver) throws Throwable
		 {
			 //added by rahma
			 //FormationPage.EditFichForID.click();
			 JavascriptExecutor  executor = (JavascriptExecutor)driver;
			 executor.executeScript("arguments[0].click()", FormationPage.EditFichForID);
			// Thread.sleep(1000L);
			// FormationPage.VolEnrForID.click();
			// Thread.sleep(1000L);
			// FormationPage.VolEvalFormatID.click();
		 } 
		 public static void saisir_notes()throws Throwable
		 {
			 List<WebElement> Elements=FormationPage.TableEvalForID.findElements(By.tagName("tr"));
			 if(Elements.size()==1)
			 {
				 	WebElement cellIneed = FormationPage.TableEvalForID.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_GridView8\"]/tbody/tr/td[3]"));
					WebElement cellIneed1 = cellIneed.findElement(By.tagName("input"));
					int note =RandomValue.randomInt(100);
					String str1 = Integer.toString(note);
					cellIneed1.sendKeys(str1);
					
			 }else {
				int i=1;
				 while(i<Elements.size()) 
				 {
					WebElement cellIneed = FormationPage.TableEvalForID.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_GridView8\"]/tbody/tr["+i+"]/td[3]"));
					WebElement cellIneed1 = cellIneed.findElement(By.tagName("input"));
					int note =RandomValue.randomInt(100);
					String str1 = Integer.toString(note);
					cellIneed1.sendKeys(str1);
					i++;
				 }}
			 
		 }

		 public static void  valider_evaluation_formateur(WebDriver driver)throws Throwable
		 {
			 //FormationPage.VldVolEvalForID.click();
			 JavascriptExecutor  executor = (JavascriptExecutor)driver;
			 executor.executeScript("arguments[0].click()", FormationPage.VldVolEvalForID);

		 }
		 
		 
		 public static void  consulter_agenda_evaluation_froid(String NumFich, WebDriver driver) throws Throwable
		 {
			 //added by rahma
			 JavascriptExecutor  executor = (JavascriptExecutor)driver;
			 executor.executeScript("arguments[0].click()", FormationPage.AgdID);
			 //FormationPage.AgdID.click();
			 Thread.sleep(1000L);
			 boolean Test=isElementPresent(By.id("Span5"),driver);
			 System.out.println(Test);
			 Thread.sleep(1000L);
			 if(Test==false)
			 {
				 //FormationPage.HomeID.click();
				 executor.executeScript("arguments[0].click()", FormationPage.HomeID);
				 participe=false;
				 System.out.println("Vous n\' avez pas des evaluations a froid");
			 }else
			 {
				 //FormationPage.VolEvalFroidID.click();
				 executor.executeScript("arguments[0].click()", FormationPage.VolEvalFroidID);
				 FormationPage.RechFichFroidID.sendKeys(NumFich);
				 Thread.sleep(1000L);
				 boolean Test1=isElementPresent(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_GridView3\"]/tbody/tr/td[1]"),driver);
				 System.out.println(Test1);
				 Thread.sleep(1000L);
				 if(Test1==false)
				 {
					 executor.executeScript("arguments[0].click()", FormationPage.HomeID);
					 //FormationPage.HomeID.click();
					 participe=false;
					 System.out.println("Vous n\' etes pas responsable pour cette formation");
			 
				 }else 
				 {
					 WebElement Element=FormationPage.PosFichFroidID.findElement(By.tagName("a"));
					 executor.executeScript("arguments[0].click()", Element);
					 //Element.click();
					 //Thread.sleep(1000L);
				 }
			 
		 }
		 }
		 
		 public static void saisir_objectifs(WebElement element,WebDriver driver) throws Throwable
		 {
				boolean Testobj=isElementPresentE(By.tagName("a"),element);
				Thread.sleep(1000L);
				if(Testobj==true)
				{
					WebElement cellIneed1 = element.findElement(By.tagName("a"));
					JavascriptExecutor  executor = (JavascriptExecutor)driver;
					executor.executeScript("arguments[0].click()", cellIneed1);

					//cellIneed1.click();
					Thread.sleep(1000);
					List<WebElement> ObjElements=FormationPage.TableObjFroidID.findElements(By.tagName("tr"));
					int i=1;
					 while(i<ObjElements.size()) 
					 {
						WebElement cellObjIneed = FormationPage.TableObjFroidID.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_GridView9\"]/tbody/tr["+i+"]/td[2]"));
						WebElement cellObjIneed1 = cellObjIneed.findElement(By.tagName("input"));
						cellObjIneed1.clear();
						int note =RandomValue.randomInt(100);
						String str1 = Integer.toString(note);
						cellObjIneed1.sendKeys(str1);
						i++;
					 }
					 
					 //FormationPage.VldObjFroidId.click();
					 executor.executeScript("arguments[0].click()", FormationPage.VldObjFroidId);
					 Thread.sleep(1000L);
				}else 
				{
					WebElement cellIneed1 = element.findElement(By.tagName("input"));
					int note =RandomValue.randomInt(100);
					String str1 = Integer.toString(note);
					cellIneed1.sendKeys(str1);
				}
			 
		 }
		 
		 public static void saisir_rapport(WebElement Element) throws Throwable
		 {
			 WebElement cellIneed1 =  Element.findElement(By.tagName("input"));
			 cellIneed1.sendKeys(RandomValue.randomString(10));
		 }
		 
		 public static void valider_qualification(WebElement Element) throws Throwable
		 {
			
		 }
		 
		 public static void rattacher_piece_jointe(WebElement Element, WebDriver driver) throws Throwable
		 {
			 WebElement cellIneed12 =  Element.findElement(By.cssSelector("input[id$='FileUpload31']"));
			 JavascriptExecutor  executor = (JavascriptExecutor)driver;
			 executor.executeScript("arguments[0].click()",  cellIneed12);

			 //cellIneed12.click();
			 Thread.sleep(500);
				Runtime.getRuntime().exec("E:\\qualipro\\trunk\\AutomatisationTQualiPro_prod\\resources\\Scripts\\joindreFichier1.exe");
				 Thread.sleep(1000);
		 }
		 
		 public static void evaluer_participant_afroid(WebDriver driver) throws Throwable
		 {
			 List<WebElement> Elements=FormationPage.TableFroidID.findElements(By.tagName("tr"));
			 if(Elements.size()==1)
			 {
				 WebElement cellIneed = FormationPage.TableFroidID.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_GridView_Efficacite\"]/tbody/tr/td[3]"));
				 saisir_objectifs(cellIneed,driver);
				 cellIneed = FormationPage.TableFroidID.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_GridView_Efficacite\"]/tbody/tr/td[4]"));
				 saisir_rapport(cellIneed);
				 cellIneed = FormationPage.TableFroidID.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_GridView_Efficacite\"]/tbody/tr/td[5]"));
				 valider_qualification(cellIneed);
				 cellIneed = FormationPage.TableFroidID.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_GridView_Efficacite\"]/tbody/tr/td[6]"));
				 rattacher_piece_jointe(cellIneed, driver);

			 }else {
				int i=1;
				 while(i<Elements.size()) 
				 {
					 WebElement cellIneed = FormationPage.TableFroidID.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_GridView_Efficacite\"]/tbody/tr["+i+"]/td[3]"));
					 saisir_objectifs(cellIneed,driver);
					 cellIneed = FormationPage.TableFroidID.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_GridView_Efficacite\"]/tbody/tr["+i+"]/td[4]"));
					 saisir_rapport(cellIneed);
					 cellIneed = FormationPage.TableFroidID.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_GridView_Efficacite\"]/tbody/tr["+i+"]/td[5]"));
					 valider_qualification(cellIneed);
					 cellIneed = FormationPage.TableFroidID.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_GridView_Efficacite\"]/tbody/tr["+i+"]/td[6]"));
					 rattacher_piece_jointe(cellIneed,driver);
					 Thread.sleep(1000);
					i++;
				 }
			}
			 JavascriptExecutor  executor = (JavascriptExecutor)driver;
			 executor.executeScript("arguments[0].click()", FormationPage.ValEvalFroidID);


			 //FormationPage.ValEvalFroidID.click();
			 Thread.sleep(1000L);
			 executor.executeScript("arguments[0].click()", FormationPage.QttEvalFroidId);
			 //FormationPage.QttEvalFroidId.click();
			 
		 }
		 
		 public static void verifier_evaluation_afroid(String NumFich, WebDriver driver) throws Throwable
		 {
			 Thread.sleep(1000L);
			 JavascriptExecutor  executor = (JavascriptExecutor)driver;
			 executor.executeScript("arguments[0].click()", FormationPage.HomeID);
			 //FormationPage.HomeID.click();
			 Thread.sleep(1000L);
				
				executor.executeScript("arguments[0].click()", FormationPage.AgdID);
			 Thread.sleep(1000L);
			 boolean Test=isElementPresent(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_p_Evalfroid\"]/div[1]/div/h4/a/span"),driver);
			 System.out.println(Test);
			 Thread.sleep(1000L);
			 if(Test==false)
			 {
				 System.out.println("Evaluation a froid traite");
			 }else
			 {
				executor.executeScript("arguments[0].click()", FormationPage.VolEvalFroidID);
				 Thread.sleep(500L);
				 FormationPage.RechFichFroidID.sendKeys(NumFich);
				 Thread.sleep(1000L);
				 boolean Test1=isElementPresent(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_GridView3\"]/tbody/tr/td[1]"),driver);
				 Thread.sleep(1000L);
				 if(Test1==false)
				 {
					 System.out.println("Evaluation a froid traite");
			 
				 }else 
				 {
					 System.out.println("Evaluation a froid non traite");
					 //Thread.sleep(1000L);
				 }
			 
		 }
		 }
		 
		 
		 private static boolean isElementPresentE(By by,WebElement element)
		 {
			    try {
			      element.findElement(by);
			      return true;
			    } catch (NoSuchElementException e) {
			      return false;
			    }
	      } 
		 
		 
		 
		 private static boolean isElementPresent(By by,WebDriver driver)
		 {
			    try 
			    {
			      driver.findElement(by);
			      return true;
			    } catch (NoSuchElementException e) {
			      return false;
			    }
	      }



}
