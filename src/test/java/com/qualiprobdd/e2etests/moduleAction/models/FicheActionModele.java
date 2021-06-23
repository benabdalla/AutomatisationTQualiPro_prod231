package com.qualiprobdd.e2etests.moduleAction.models;


import com.qualiprobdd.e2etests.moduleAction.pages.ActSimplPage;
import com.qualiprobdd.e2etests.moduleAction.pages.FicheActionPage;
import com.qualiprobdd.e2etests.util.Common;
import com.qualiprobdd.e2etests.util.ExcelUtils;
import com.qualiprobdd.e2etests.util.RandomValue;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.*;


public class FicheActionModele {

//private static String Path = "resources/testData/TestData2.xlsx";
	static int i=1;
	public static List<String> informations = new ArrayList<String>();
	public static HashMap<String,String> filtre_repor = new HashMap<>();
	private static String Path = "resources/testData/TestData.xlsx";




	public static void consulter_types_d_action(WebDriver driver) throws Exception {
		Thread.sleep(1000L);
		//FicheActionPage.menuID.click();
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click()", FicheActionPage.menuID);
		Thread.sleep(200L);
		Common.AccéderModule(2, 0, 0, driver);
		Common.AccéderModule(2, 7, 0, driver);

	}


	public static void ajouter_types_d_action() {
		FicheActionPage.wAjouttype.click();

	}


	public static void saisir_type_d_action(int row) throws Exception {

		Thread.sleep(2000);
		String st = "Type Action Auto " + LocalDateTime.now().toString();
		ExcelUtils.setExcelFile(Path, "Action");
		ExcelUtils.setCellData1(st, row, 1, Path,"Action");
		FicheActionPage.wsaitype.sendKeys(st);
		FicheActionPage.wnancastype.click();
	}


	public static void clique_sur_valider() throws InterruptedException {
		FicheActionPage.btnValiderSousAction.click();
		FicheActionPage.EditTxReaId.click();
		FicheActionPage.wrecheperson.sendKeys("au");
		for (int i = 1; i < 4; i++) {
			FicheActionPage.wtabpersonne.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_GridView_Employe_wrapper\"]/div[2]/div/table/tbody/tr[" + i + "]/td[1]")).findElement(By.tagName("input")).click();
		}
		FicheActionPage.wvalidetpreson.click();
FicheActionPage.wretourSource.click();
	}


	public static void verifier_type_d_action(int  row) throws Exception {

		ExcelUtils.setExcelFile(Path, "Action");
		String st = ExcelUtils.getCellData1(row, 1);
		FicheActionPage.wrecherchetype.sendKeys(st);
		Assert.assertEquals(st,FicheActionPage.wtabtypeAct.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_GridView1_wrapper\"]/div[2]/div/table/tbody/tr[1]/td[2]")).getText());

Thread.sleep(1000);

	}


	public static void consulter_source_d_action(WebDriver driver) throws Exception {

		Thread.sleep(1000L);
		//FicheActionPage.menuID.click();
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click()", FicheActionPage.menuID);
		Thread.sleep(200L);
		Common.AccéderModule(2, 0, 0, driver);
		Common.AccéderModule(2, 6, 0, driver);


	}


	public static void ajouter_source_d_action() {
		FicheActionPage.wbtnAjouSource.click();

	}

	public static void saisir_source_d_action(int row) throws Exception {
		Thread.sleep(2000);
		String st = "Source Action Auto"+ LocalDateTime.now().toString();
		ExcelUtils.setExcelFile(Path, "Action");
		ExcelUtils.setCellData1(st, row, 0, Path,"Action");
		FicheActionPage.wource.sendKeys(st);
	}


	public static void clique_source_d_action() {
		FicheActionPage.wValidSource.click();
		FicheActionPage.wretourSource.click();

	}


	public static void verifier_source_d_action(int row) throws Exception {
		ExcelUtils.setExcelFile(Path, "Action");
		String st = ExcelUtils.getCellData1(row, 0);
		FicheActionPage.wrecherSource.sendKeys(st);
		FicheActionPage.wbtnrecherSource.click();
		Assert.assertEquals(FicheActionPage.wverfiSource.getText(), st);

	}

	public static void ajouter_type_de_causes(WebDriver driver) throws Throwable {
		Thread.sleep(2000L);
		//FicheActionPage.menuID.click();
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click()", FicheActionPage.menuID);
		Thread.sleep(200L);
		Common.AccéderModule(2, 0, 0, driver);
		Common.AccéderModule(2, 8, 0, driver);

FicheActionPage.btnAjouterAction.click();

	}


	public static void saisir_type_de_causes(int  row ) throws Throwable {
		Thread.sleep(2000);
		String st = "type de causes auto" + LocalDateTime.now().toString();
		ExcelUtils.setExcelFile(Path, "Action");
		ExcelUtils.setCellData1(st, row, 9, Path,"Action");
		FicheActionPage.wtypecaus.sendKeys(st);
		FicheActionPage.btnValiderSousAction.click();



	}


	public static void verifier_type_de_causes(int  row) throws Throwable {
		FicheActionPage.wretourSource.click();
		ExcelUtils.setExcelFile(Path, "Action");
		String st = ExcelUtils.getCellData1(row, 9);
		FicheActionPage.wrecherchetype.sendKeys(st);
		Assert.assertEquals(FicheActionPage.gridActionRealisation.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_GridView1_wrapper\"]/div[2]/div/table/tbody/tr[1]/td[2]")).getText(),st);


	}

	public static void ajouter_priorité(WebDriver driver) throws Throwable {

		Thread.sleep(2000L);
		//FicheActionPage.menuID.click();
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click()", FicheActionPage.menuID);
		Thread.sleep(200L);
		Common.AccéderModule(2, 0, 0, driver);
		Common.AccéderModule(2, 9, 0, driver);
		FicheActionPage.btnAjouterAction.click();

	}


	public static void saisir_priorité(int row) throws Throwable {

		Thread.sleep(2000);
		String st = "Priorité" + LocalDateTime.now().toString();
		ExcelUtils.setExcelFile(Path, "Action");
		ExcelUtils.setCellData1(st, row, 2, Path,"Action");
		FicheActionPage.wtypecaus.sendKeys(st);
		FicheActionPage.btnValiderSousAction.click();


	}


	public static void verifier_priorité(int row) throws Throwable {
FicheActionPage.wretourSource.click();

		ExcelUtils.setExcelFile(Path, "Action");
		String st = ExcelUtils.getCellData1(row, 2);
		FicheActionPage.wrecherchetype.sendKeys(st);
		Assert.assertEquals(st,FicheActionPage.wtabtypeAct.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_GridView1_wrapper\"]/div[2]/div/table/tbody/tr[1]/td[2]")).getText());

		Thread.sleep(1000);
	}


	public static void ajouter_gravité(WebDriver driver) throws Throwable {
		Thread.sleep(2000L);
		//FicheActionPage.menuID.click();
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click()", FicheActionPage.menuID);
		Thread.sleep(200L);
		Common.AccéderModule(2, 0, 0, driver);
		Common.AccéderModule(2, 10, 0, driver);
		FicheActionPage.btnAjouterAction.click();

	}


	public static void saisir_gravité(int row) throws Throwable {
		Thread.sleep(2000);
		String st = "Gravité " + LocalDateTime.now().toString();
		ExcelUtils.setExcelFile(Path, "Action");
		ExcelUtils.setCellData1(st, row, 3, Path,"Action");
		FicheActionPage.wsaitype.sendKeys(st);
		FicheActionPage.wValidSource.click();

	}


	public static void verifier_gravité(int row) throws Throwable{
		FicheActionPage.wretourSource.click();
		ExcelUtils.setExcelFile(Path, "Action");
		String st = ExcelUtils.getCellData1(row, 3);
		FicheActionPage.wrecherchetype.sendKeys(st);
		Assert.assertEquals(st,FicheActionPage.wtabtypeAct.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_GridView1_wrapper\"]/div[2]/div/table/tbody/tr[1]/td[2]")).getText());

		Thread.sleep(1000);


	}

	public static void consulter_Action(WebDriver driver) throws Throwable {
		Thread.sleep(2000L);
		//FicheActionPage.menuID.click();
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click()", FicheActionPage.menuID);
		Thread.sleep(200L);
		Common.AccéderModule(2, 0, 0, driver);
		Common.AccéderModule(2, 1, 0, driver);
		Thread.sleep(200L);

	}
	public static void ajouter_action_détaillée(WebDriver driver) throws InterruptedException {
		//FicheActionPage.btnAjouterAction.click();
		JavascriptExecutor executor =(JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click()", FicheActionPage.btnAjouterAction);
		Thread.sleep(1000L);
		//FicheActionPage.btnajouter_action_detaillee.click();
		executor.executeScript("arguments[0].click()", FicheActionPage.btnajouter_action_detaillee);
		Thread.sleep(1000L);
		Common.Exporter_visibilité("Nouvelle Fiche Action");
		Common.Exporter_champ_A_masquer("Nouvelle Fiche Action");
	}
	public static void selectionnerSourceModeleAction(int row) throws Throwable {

		ExcelUtils.setExcelFile(Path, "Action");
		
		
		Select select = new Select(FicheActionPage.sourceId);
	//	select.selectByValue("84");
		select.selectByVisibleText(ExcelUtils.getCellData(row, 0));
		informations.add(ExcelUtils.getCellData(row,0));
		
		
	}
	
	public static void choixDate(WebDriver driver,int row) throws Throwable {
		SimpleDateFormat	dateFormat;
		Cookie cookie1 = driver.manage().getCookieNamed("lan");
			if(cookie1.getValue().equals("en-US")) {
				dateFormat = new SimpleDateFormat("MM/dd/yyyy");
			}else {
			 dateFormat = new SimpleDateFormat("dd/MM/yyyy");
			}
		Date dt = new Date();
		Calendar c = Calendar.getInstance(); 
		c.setTime(dt); 
		c.add(Calendar.DATE,0);
		dt = c.getTime();
		String Sdate = dateFormat.format(dt);
		System.out.println(Sdate);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[1].value = arguments[0];",Sdate,FicheActionPage.calenrierId);
		Thread.sleep(500);
		
		
		/*
		FicheActionPage.calenrierId.click();
		//JavascriptExecutor executor =(JavascriptExecutor)driver;
		//executor.executeScript("arguments[0].click()", FicheActionPage.calenrierId);
		FicheActionPage.choixDateId.click();
		//executor.executeScript("arguments[0].click()", FicheActionPage.choixDateId);
		String value=driver.findElement(By.id("ctl00_ContentPlaceHolder1_datcrea")).getAttribute("value");
		System.out.println(value);
		ExcelUtils.setExcelFile(Path, "Action");
		ExcelUtils.setCellData1(value, row ,8 , Path) ;*/
	}
	
	public static void origine_action() {
		try {
			FicheActionPage.ORIGINEId.isDisplayed();
			Select select = new Select(FicheActionPage.ORIGINEId);
			select.selectByVisibleText("AUTO");
			Common.Exporter_champ_A_masquer("le champ origine action est visible");
			}
			catch (NoSuchElementException e) {
				Common.Exporter_champ_A_masquer("le champ origine action est invisible");
			}
	}
	public static void rattacher_produit(WebDriver driver) throws Throwable {
		
			FicheActionPage.AjtProdId.isDisplayed();
			//FicheActionPage.AjtProdId.click();
			JavascriptExecutor executor =(JavascriptExecutor)driver;
			executor.executeScript("arguments[0].click()", FicheActionPage.AjtProdId);
			Thread.sleep(1000);
			executor = (JavascriptExecutor)driver;
			executor.executeScript("arguments[0].click()",FicheActionPage.ChxProdId.findElement(By.xpath("//*[@id=\"myModalRatproduit\"]/div/div/div[2]/div[2]/div/div[2]/table/tbody/tr[2]/td[1]")).findElement(By.tagName("input")));
			Thread.sleep(2000);
		FicheActionPage.VldProdId.click();
		//JavascriptExecutor executor3 =(JavascriptExecutor)driver;

			//executor3.executeScript("arguments[0].click()", FicheActionPage.VldProdId);
			Thread.sleep(300);
			try {
			Common.Exporter_champ_A_masquer("le champ produit est visible");
			}
			catch (NoSuchElementException e) {
				Common.Exporter_champ_A_masquer("le champ produit est invisible");
			}
	}
	public static void rattacher_Type_cause(WebDriver driver, int row) throws Throwable {
		try {
			
			FicheActionPage.AjtTypCauseId.isDisplayed();
			ExcelUtils.setExcelFile(Path, "Action");
			//FicheActionPage.AjtTypCauseId.click();
			JavascriptExecutor executor =(JavascriptExecutor)driver;
			executor.executeScript("arguments[0].click()", FicheActionPage.AjtTypCauseId);
			Thread.sleep(1000);
			FicheActionPage.RechTypCauseId.sendKeys(ExcelUtils.getCellData(row, 9));
			FicheActionPage.GridTypCauseId.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_GridView9\"]/tbody/tr/td[1]")).findElement(By.tagName("input")).click();
			Thread.sleep(1000);
			//FicheActionPage.VldTypCauseId.click();
			executor.executeScript("arguments[0].click()", FicheActionPage.VldTypCauseId);
			Thread.sleep(1000);
			Common.Exporter_champ_A_masquer("le champ type cause est visible");
			}
			catch (NoSuchElementException e) {
				Common.Exporter_champ_A_masquer("le champ type cause est invisible");
			}
	}
	
	public static void rattacher_intervenant(WebDriver driver) throws Throwable {
		try {
			Thread.sleep(300);
			FicheActionPage.PanelIntervId.isDisplayed();
			List<WebElement> Exist=driver.findElements(By.id("ctl00_ContentPlaceHolder1_GridView_Intervenants"));
			if(Exist.size()==0)
			{
				//FicheActionPage.PanelIntervId.click();
				JavascriptExecutor executor =(JavascriptExecutor)driver;
				executor.executeScript("arguments[0].click()", FicheActionPage.PanelIntervId);
				Thread.sleep(300);
				//FicheActionPage.AjtIntervId.click();
				executor.executeScript("arguments[0].click()", FicheActionPage.AjtIntervId);
				Thread.sleep(300);
				FicheActionPage.RechInetervId.sendKeys("AUTO");
				Thread.sleep(300);
				//FicheActionPage.ChxIntervId.findElement(By.tagName("input")).click();
				executor.executeScript("arguments[0].click()", FicheActionPage.ChxIntervId.findElement(By.tagName("input")));
				Thread.sleep(300);
				//FicheActionPage.VldIntervId.click();
				executor.executeScript("arguments[0].click()", FicheActionPage.VldIntervId);
				Thread.sleep(300);
			}
			
			Common.Exporter_champ_A_masquer("le champ intervenant est visible");
			}
			catch (NoSuchElementException e) {
				Common.Exporter_champ_A_masquer("le champ intervenant est invisible");
			}
	}
	public static void objectif() throws Throwable {
		try {
			FicheActionPage.ObjectifId.isDisplayed();
			FicheActionPage.ObjectifId.sendKeys("Objectif Action");
			Common.Exporter_champ_A_masquer("le champ objectif est visible");
			}
			catch (NoSuchElementException e) {
				Common.Exporter_champ_A_masquer("le champ objectif est invisible");
			}
	}
	public static void Ref_Audit(int row) throws Throwable {
		try {
			FicheActionPage.RefAuditId.isDisplayed();
			ExcelUtils.setExcelFile(Path, "Action");
			Select select = new Select(FicheActionPage.RefAuditId);
			select.selectByVisibleText(ExcelUtils.getCellData(row, 10));
			Common.Exporter_champ_A_masquer("le champ ref audit est visible");
			}
			catch (NoSuchElementException e) {
				Common.Exporter_champ_A_masquer("le champ ref audit est invisible");
			}
	}
	public static void Priorite(int row) throws Throwable {
		try {
			FicheActionPage.PrioriteId.isDisplayed();
			ExcelUtils.setExcelFile(Path, "Action");
			Select select = new Select(FicheActionPage.PrioriteId);
			select.selectByVisibleText(ExcelUtils.getCellData(row, 2));
			Common.Exporter_champ_A_masquer("le champ priorite est visible");
			}
			catch (NoSuchElementException e) {
				Common.Exporter_champ_A_masquer("le champ priorite est invisible");
			}
	}
	
	public static void Gravite(int row) throws Throwable {
		try {
			FicheActionPage.GraviteId.isDisplayed();
			ExcelUtils.setExcelFile(Path, "Action");
			Select select = new Select(FicheActionPage.GraviteId);
			select.selectByVisibleText(ExcelUtils.getCellData(row,3 ));
			Common.Exporter_champ_A_masquer("le champ gravite est visible");
			}
			catch (NoSuchElementException e) {
				Common.Exporter_champ_A_masquer("le champ gravite est invisible");
			}
	}
	
	public static void Risque() {
		try {
			FicheActionPage.RisqueId.isDisplayed();
			FicheActionPage.RisqueId.sendKeys("Risque sous action");
			Common.Exporter_champ_A_masquer("le champ risque est visible");
			}
			catch (NoSuchElementException e) {
				Common.Exporter_champ_A_masquer("le champ risque est invisible");
			}
	}
	
	public static void Cout_Prev() {
		try {
			FicheActionPage.CoutPrevId.isDisplayed();
			FicheActionPage.CoutPrevId.sendKeys("1000");
			Common.Exporter_champ_A_masquer("le champ cout prévisionelle est visible");
			}
			catch (NoSuchElementException e) {
				Common.Exporter_champ_A_masquer("le champ cout prévisionelle est invisible");
			}
	}
	public static void designationModeleAction(int row) throws Throwable {

		Thread.sleep(2000);
		FicheActionPage.designationId.sendKeys("désignation  action  simplifie "+Common.paragraphe(11,11));
		
		ExcelUtils.setExcelFile(Path, "Action");
		ExcelUtils.setCellData1(FicheActionPage.designationId.getAttribute("value") , row ,11 , Path,"Action") ;
		informations.add(ExcelUtils.getCellData(1,11));
	}
	public static void saisirCausesPossibles() {

		FicheActionPage.causesPossiblesId.sendKeys("Test Auto");
		informations.add(FicheActionPage.causesPossiblesId.getText());
	}
	public static void selectionnerTypeModeleAction(int row) throws Throwable {
	
		ExcelUtils.setExcelFile(Path, "Action");
		Select select = new Select(FicheActionPage.listeTypeId);
	
	select.selectByVisibleText(ExcelUtils.getCellData(row, 1));
			//select.selectByValue("4");

		ExcelUtils.setExcelFile(Path, "Action");
		informations.add(ExcelUtils.getCellData(row,1));

		
	}
	
	public static void saisirDescription(int row) throws Throwable {

		FicheActionPage.descriptionObjetId.sendKeys(RandomValue.randomString(10));
		ExcelUtils.setExcelFile(Path, "Action");
		ExcelUtils.setCellData1(FicheActionPage.descriptionObjetId.getAttribute("value") , row ,12 , Path,"Action") ;
		informations.add(ExcelUtils.getCellData(1,12));
		
	}
	
	public static void selectionnerSiteModeleAction(WebDriver driver,int row) throws Throwable  {
		try {
			
			FicheActionPage.siteId.isDisplayed();
			Common.Exporter_visibilité("le site est visible");
			String text=driver.findElement(By.id("ctl00_ContentPlaceHolder1_lbsite2")).getText();
			if(text.indexOf('*')!=-1) 
			{
				Common.Exporter_visibilité("le site est obligatoire");
			}else 
			{
				Common.Exporter_visibilité("le site n'est pas obligatoire");
				
			}
			Select select = new Select(FicheActionPage.siteId);
			select.selectByVisibleText(ExcelUtils.getCellData(row, 13));
			Thread.sleep(500);
			}
			catch (NoSuchElementException e) {
				Common.Exporter_visibilité("le site est invisible");
			}
		
	}
	
	public static void selectionnerProcessus(WebDriver driver,int row) throws Throwable {
		try {
			FicheActionPage.processusId.isDisplayed();
			Common.Exporter_visibilité("le processus est visible");
			String text=driver.findElement(By.id("ctl00_ContentPlaceHolder1_LblProcessus_")).getText();
			ExcelUtils.setExcelFile(Path, "Action");
			if(text.indexOf('*')!=-1) 
			{
				Common.Exporter_visibilité("le processus est obligatoire");
			}else 
			{
				Common.Exporter_visibilité("le processus n'est pas obligatoire");
				
			}
			Thread.sleep(500);
			Select select = new Select(FicheActionPage.processusId);
			Thread.sleep(500);
			select.selectByVisibleText(ExcelUtils.getCellData(row,14));
			Thread.sleep(500);
			informations.add(ExcelUtils.getCellData(1,14));
			Thread.sleep(500);
			}
			catch (NoSuchElementException e) {
				Common.Exporter_visibilité("le processus est invisible");
			}
	}
	
	public static void selectionnerActivite(WebDriver driver, int row) throws Throwable {
		try {
			FicheActionPage.activiteId.isDisplayed();
			Common.Exporter_visibilité("l'activité est visible");
			String text=driver.findElement(By.id("ctl00_ContentPlaceHolder1_LblDomaine_")).getText();
			if(text.indexOf('*')!=-1) 
			{
				Common.Exporter_visibilité("l'activité est obligatoire");
			}else 
			{
				Common.Exporter_visibilité("l'activité n'est pas obligatoire");
				
			}
			ExcelUtils.setExcelFile(Path, "Action");
			Select select = new Select(FicheActionPage.activiteId);
			select.selectByVisibleText(ExcelUtils.getCellData(row, 15));
			informations.add(ExcelUtils.getCellData(row,15));
			}
			catch (NoSuchElementException e) {
				Common.Exporter_visibilité("l'activité est invisible");
			}
		
	}
	public static void selectionnerDirection(WebDriver driver,int row) throws Throwable {
		try {
			FicheActionPage.directionId.isDisplayed();
			Common.Exporter_visibilité("la direction est visible");
			String text=driver.findElement(By.id("ctl00_ContentPlaceHolder1_LabelDir")).getText();
			if(text.indexOf('*')!=-1) 
			{
				Common.Exporter_visibilité("la direction est obligatoire");
			}else 
			{
				Common.Exporter_visibilité("la direction n'est pas obligatoire");
				
			}
			ExcelUtils.setExcelFile(Path, "Action");
			Select select = new Select(FicheActionPage.directionId);
			select.selectByVisibleText(ExcelUtils.getCellData(row, 16));
			informations.add(ExcelUtils.getCellData(row,16));
			}
			catch (NoSuchElementException e) {
				Common.Exporter_visibilité("la direction est invisible");
			}

	}
	
	public static void service(WebDriver driver, int row) throws Exception {
		try {
			FicheActionPage.service.isDisplayed();
			Common.Exporter_visibilité("le service est visible");
			String text=driver.findElement(By.id("ctl00_ContentPlaceHolder1_LblService_")).getText();
			if(text.indexOf('*')!=-1) 
			{
				Common.Exporter_visibilité("le service est obligatoire");
			}else 
			{
				Common.Exporter_visibilité("le service n'est pas obligatoire");
			}
			ExcelUtils.setExcelFile(Path, "Action");
			Select select = new Select(FicheActionPage.service);
			select.selectByVisibleText(ExcelUtils.getCellData(row, 17));
			informations.add(select.getFirstSelectedOption().getText());
			}
			catch (NoSuchElementException e) {
				Common.Exporter_visibilité("le service est invisible");
			}
	}

	public static void  resp_cloture(int row) throws Exception {
        
		ExcelUtils.setExcelFile(Path, "moduleAction");
		Select select = new Select(FicheActionPage.Respcloture);
System.err.println("le responable   cloture   est    "+ExcelUtils.getCellData(1,5));
		select.selectByVisibleText(ExcelUtils.getCellData(1,5));
		informations.add(select.getFirstSelectedOption().getText());
	}

	 public static void datecreation(WebDriver driver) throws Exception {
	     
		    //ActSimplPage.DatecreationActSimplifiee.click();
		 	JavascriptExecutor executor =(JavascriptExecutor)driver;
			executor.executeScript("arguments[0].click()", ActSimplPage.DatecreationActSimplifiee);
			Thread.sleep(1000);
			//ActSimplPage.agendacreation.click();
			executor.executeScript("arguments[0].click()", ActSimplPage.agendacreation);
	  	}
	public static void validerAjout(WebDriver driver) {

		//FicheActionPage.btnValiderActionId.click();
		JavascriptExecutor executor =(JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click()", FicheActionPage.btnValiderActionId);
	}
	public static void cliqueAgenda(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver,4000);
        wait.until(ExpectedConditions.visibilityOf(FicheActionPage.agendatActionId));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click()", FicheActionPage.agendatActionId);
		//FicheActionPage.agendatActionId.click();
		//FicheActionPage.agendatAction2Id.click();
	}
	public static void clickAjouterSousActionModeleAction(WebDriver driver) {
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click()", FicheActionPage.btnAjouterSousActionModeleAction);
		
	}
	public static void selectionnerResponsableRealisation(int row) throws Throwable {
		ExcelUtils.setExcelFile(Path, "Action");
		Select select = new Select(FicheActionPage.responsableRealisationID);
		select.selectByVisibleText(ExcelUtils.getCellData(row,4));
		informations.add(ExcelUtils.getCellData(row,4));
	}
	public static void selectionnerResponsableSuivi(int row) throws Throwable {
		ExcelUtils.setExcelFile(Path, "Action");
		Select select = new Select(FicheActionPage.responsableSuiviID);
		select.selectByVisibleText(ExcelUtils.getCellData(row, 6));	
		informations.add(ExcelUtils.getCellData(row,6));
		
	}
	public static void saisirDesignationSousAct(int row) throws Throwable {
		Thread.sleep(2000);
		FicheActionPage.designationSousAction.sendKeys("désignation  action  simplifie "+Common.paragraphe(11,11));
		i++;
		ExcelUtils.setExcelFile(Path, "Action");
		ExcelUtils.setCellData1(FicheActionPage.designationSousAction.getAttribute("value"), row ,18, Path,"Action") ;
		informations.add(ExcelUtils.getCellData(row,18));
		
	}
	
	public static void initializer_filtre_Bilan_action(int row) throws Throwable
	{
		ExcelUtils.setExcelFile(Path, "Action");
	
		filtre_repor.put(FicheActionPage.selec_source_id,ExcelUtils.getCellData(row,0));
	
		filtre_repor.put(FicheActionPage.selec_type_id,ExcelUtils.getCellData(row,1));
		
		filtre_repor.put(FicheActionPage.selec_Priorite_id,ExcelUtils.getCellData(row,2));
		filtre_repor.put(FicheActionPage.selec_gravite_id,ExcelUtils.getCellData(row,3));
		filtre_repor.put(FicheActionPage.selec_resp_rea_id,ExcelUtils.getCellData(row,4));
		filtre_repor.put(FicheActionPage.selec_resp_suivi_id,ExcelUtils.getCellData(row,6));
		//filtre_repor.put(FicheActionPage.del_creation_1_id,ExcelUtils.getCellData(row,8));
		//filtre_repor.put(FicheActionPage.del_creation_2_id,ExcelUtils.getCellData(row,8));
		filtre_repor.put(FicheActionPage.selec_type_cause_id,ExcelUtils.getCellData(row,9));
		filtre_repor.put(FicheActionPage.audit_id,ExcelUtils.getCellData(row,10));
		filtre_repor.put(FicheActionPage.designation_id,ExcelUtils.getCellData(row,11));
		filtre_repor.put(FicheActionPage.description_id,ExcelUtils.getCellData(row,12));
		filtre_repor.put(FicheActionPage.selec_site_id,ExcelUtils.getCellData(row,13));
		filtre_repor.put(FicheActionPage.selec_processus_id,ExcelUtils.getCellData(row,14));
		filtre_repor.put(FicheActionPage.selec_domaine_id,ExcelUtils.getCellData(row,15));
		filtre_repor.put(FicheActionPage.selec_direction_id,ExcelUtils.getCellData(row,16));
		filtre_repor.put(FicheActionPage.designsousact_id,ExcelUtils.getCellData(row,18));
		filtre_repor.put(FicheActionPage.del_real_1_id,ExcelUtils.getCellData(row,19));
		filtre_repor.put(FicheActionPage.del_real_2_id,ExcelUtils.getCellData(row,19));
		filtre_repor.put(FicheActionPage.taux_real_1_id,ExcelUtils.getCellData(row,20));
		filtre_repor.put(FicheActionPage.taux_real_2_id,ExcelUtils.getCellData(row,20));
		filtre_repor.put(FicheActionPage.del_suivi_1_id,ExcelUtils.getCellData(row,21));
		filtre_repor.put(FicheActionPage.del_suivi_2_id,ExcelUtils.getCellData(row,21));
		filtre_repor.put(FicheActionPage.taux_eff_1_id,ExcelUtils.getCellData(row,22));
		filtre_repor.put(FicheActionPage.taux_eff_2_id,ExcelUtils.getCellData(row,22));
	}
	
	public static void initializer_filtre_Etat_action(String Path) throws Throwable 
	{
		ExcelUtils.setExcelFile(Path, "Action");
		filtre_repor.put(FicheActionPage.selec_Site_Action_Par_Resp_id,ExcelUtils.getCellData(1,13));
		filtre_repor.put(FicheActionPage.selec_Processus_Action_Par_Resp_id,ExcelUtils.getCellData(1,14));
		filtre_repor.put(FicheActionPage.selec_Activité_Action_Par_Resp_id,ExcelUtils.getCellData(1,15));
		filtre_repor.put(FicheActionPage.selec_Direction_Action_Par_Resp_id,ExcelUtils.getCellData(1,16));
		filtre_repor.put(FicheActionPage.selec_Priorité_Action_Par_Resp_id,ExcelUtils.getCellData(1,2));
		filtre_repor.put(FicheActionPage.selec_GravitéAction_Action_Par_Resp_id,ExcelUtils.getCellData(1,3));
		filtre_repor.put(FicheActionPage.selec_RespRéalisation_Action_Par_Resp_id,ExcelUtils.getCellData(1,4));
		filtre_repor.put(FicheActionPage.del_DateCreation1_Action_Par_Resp_id,ExcelUtils.getCellData(1,8));
		filtre_repor.put(FicheActionPage.del_DateCreation2_Action_Par_Resp_id,ExcelUtils.getCellData(1,8));
		filtre_repor.put(FicheActionPage.del_DateRealisation1_Action_Par_Resp_id,ExcelUtils.getCellData(1,18));
		filtre_repor.put(FicheActionPage.del_DateRealisation2_Action_Par_Resp_id,ExcelUtils.getCellData(1,18));
	}
	

	
	public static void choixDateSousActionModeleAction(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
	//	FicheActionPage.dateSousAction.click();


		//JavascriptExecutor executor =(JavascriptExecutor)driver;
		//executor.executeScript("arguments[0].click()", FicheActionPage.dateSousAction);
		//FicheActionPage.choixDateSousAction.click();
	//	executor.executeScript("arguments[0].click()", FicheActionPage.choixDateSousAction);

		final DateFormat dateFormat;
		Cookie cookie1 = driver.manage().getCookieNamed("lan");
		if(cookie1.getValue().equals("en-US")) {
			dateFormat = new SimpleDateFormat("MM/dd/yyyy");
		}else {
			dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		}
		Date dt = new Date();
		Calendar c = Calendar.getInstance();
		c.setTime(dt);
		c.add(Calendar.DATE,0);
		dt = c.getTime();
		String Sdate = dateFormat.format(dt);
		System.out.println(Sdate);
		Thread.sleep(1000);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[1].value = arguments[0];",Sdate, FicheActionPage.wdateRel);
		Thread.sleep(500);


		
	}
	public static void validerSousAction(WebDriver driver) {

		//FicheActionPage.btnValiderSousAction.click();
		JavascriptExecutor executor =(JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click()", FicheActionPage.btnValiderSousAction);
	}
	public static void saisirNumActionRealisation(String num,WebDriver driver) throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver,60);
    //    wait.until(ExpectedConditions.elementToBeClickable(FicheActionPage.numActionrealisation));
		wait.until(ExpectedConditions.visibilityOf(FicheActionPage.numActionrealisation));
		Thread.sleep(500);
		FicheActionPage.numActionrealisation.clear();
		FicheActionPage.numActionrealisation.sendKeys(num);
	}
	public static void rechercherNumActionRealisation(WebDriver driver) throws InterruptedException {
		Thread.sleep(500);
		//FicheActionPage.rechercherNumActionrealisation.click();
		JavascriptExecutor executor =(JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click()", FicheActionPage.rechercherNumActionrealisation);
		Thread.sleep(500);
	}	
	public static void choixNumActionRealisation() throws InterruptedException {
Thread.sleep(1000);
		FicheActionPage.choixNumActionrealisation.findElement(By.tagName("a")).click();
		
	}	
	public static void saisirTauxRealisation() {

		FicheActionPage.tauxRealisation.sendKeys("25");
	}
	public static void saisirDepenses() {
		try {
			FicheActionPage.depensesID.isDisplayed();
			FicheActionPage.depensesID.clear();
			FicheActionPage.depensesID.sendKeys("1000");
			Common.Exporter_champ_A_masquer("le champ cout est visible");
			}
			catch (NoSuchElementException e) {
				Common.Exporter_champ_A_masquer("le champ cout est invisible");
			}
		
	}
	public static void saisirCommentaire() {
		FicheActionPage.commentaireID.clear();
		FicheActionPage.commentaireID.sendKeys("test auto");
	}
	public static void choixDateRealisation(WebDriver driver) {

		FicheActionPage.dateRealisation.click();
		//JavascriptExecutor executor =(JavascriptExecutor)driver;
		//executor.executeScript("arguments[0].click()", FicheActionPage.dateRealisation);
		
		FicheActionPage.choixDateRealisation.click();
		//executor.executeScript("arguments[0].click()", FicheActionPage.choixDateRealisation);
	}
	public static void validerRealisationAction(WebDriver driver) {

		//FicheActionPage.validerRealisation.click();
		JavascriptExecutor executor =(JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click()", FicheActionPage.validerRealisation);
	//	=====> 
		
		
	}
	
	public  static   void   EnrTauxReal(WebDriver driver,String  ta) throws InterruptedException {
		Thread.sleep(500);
		JavascriptExecutor executor =(JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click()", FicheActionPage.WbtnEnrTReal);
		Thread.sleep(500);
		FicheActionPage.WtauxRealAg.clear();
		Thread.sleep(500);
		FicheActionPage.WtauxRealAg.sendKeys(ta);
		Thread.sleep(500);
		JavascriptExecutor executor2 =(JavascriptExecutor)driver;
		executor2.executeScript("arguments[0].click()", FicheActionPage.WbtnVldTReall);
		Thread.sleep(500);
	}
	
	public static void saisirNumActionSuivre(String num) throws Throwable {
		Thread.sleep(500);
		FicheActionPage.numActionSuivre.clear();
		Thread.sleep(500);

		FicheActionPage.numActionSuivre.sendKeys(num);
	}
	public static void rechercherNumActionSuivre(WebDriver driver) throws InterruptedException {

		//FicheActionPage.rechercherNumActionSuivre.click();


		Thread.sleep(1000);

		JavascriptExecutor executor =(JavascriptExecutor)driver;


	//	executor.executeScript("arguments[0].clear()", FicheActionPage.rechercherNumActionSuivre);
		Thread.sleep(1000);

		executor.executeScript("arguments[0].click()", FicheActionPage.rechercherNumActionSuivre);
		
	}	
	public static void choixNumActionSuivren() throws InterruptedException {
	//	FicheActionPage.choixNumActionSuivre.clear();
		Thread.sleep(1000);
		FicheActionPage.choixNumActionSuivre.findElement(By.tagName("a")).click();
	}	
	public static void saisirTauxEffi() {

		FicheActionPage.TauxEffiID.sendKeys("100");
	}
	public static void saisirRapportEffi() {

		FicheActionPage.rapportEffiID.sendKeys("test Auto");
	}
	public static void validerSuivi(WebDriver driver) {

		//FicheActionPage.validerSuivi.click();
		JavascriptExecutor executor =(JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click()", FicheActionPage.validerSuivi);
	}
	public static void choixNumActionCloturee(WebDriver driver) {

		//FicheActionPage.choixActionCloturer.findElement(By.tagName("a")).click();
		JavascriptExecutor executor =(JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click()", FicheActionPage.choixActionCloturer.findElement(By.tagName("a")));
	}	
	public static void choixCloturee(WebDriver driver) {

		//FicheActionPage.choixCloturee.click();
		JavascriptExecutor executor =(JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click()", FicheActionPage.choixCloturee);
	}	
	public static void choixDateCloture(WebDriver driver) {

		//FicheActionPage.dateCloture.click();
		JavascriptExecutor executor =(JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click()", FicheActionPage.dateCloture);
		//FicheActionPage.choixDateCloture.click();
		executor.executeScript("arguments[0].click()", FicheActionPage.choixDateCloture);
	}
	public static void validerCloturee() {

		FicheActionPage.validerCloture.click();
	}	
	
	public static void consulter_fiche(String NumFiche,WebDriver driver) throws Throwable{
		FicheActionPage.RechFiltreId.sendKeys(NumFiche);
		//FicheActionPage.BtnRechFiltId.click();
		JavascriptExecutor executor =(JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click()", FicheActionPage.BtnRechFiltId);
		Thread.sleep(1000L);
		//FicheActionPage.TableFiltreAction.findElement(By.tagName("a")).click();
		executor.executeScript("arguments[0].click()", FicheActionPage.TableFiltreAction.findElement(By.tagName("a")));
		Thread.sleep(1000L);
		//FicheActionPage.TracabiliteId.click();
		executor.executeScript("arguments[0].click()", FicheActionPage.TracabiliteId);
		Thread.sleep(1000L);
		
	}
	
	public static void initializer_filtre_action_par_personne(String Path) throws Throwable {

			ExcelUtils.setExcelFile(Path, "Action");
			filtre_repor.put(FicheActionPage.selec_Site_Action_Par_Personne_id,ExcelUtils.getCellData(1,13));
			filtre_repor.put(FicheActionPage.selec_Processus_Action_Par_Personne_id,ExcelUtils.getCellData(1,14));
			filtre_repor.put(FicheActionPage.selec_Activité_Action_Par_Personne_id,ExcelUtils.getCellData(1,15));
			filtre_repor.put(FicheActionPage.selec_Direction_Action_Par_Personne_id,ExcelUtils.getCellData(1,16));
			filtre_repor.put(FicheActionPage.selec_Priorité_Action_Par_Personne_id,ExcelUtils.getCellData(1,2));
			filtre_repor.put(FicheActionPage.selec_GravitéAction_Action_Par_Personne_id,ExcelUtils.getCellData(1,3));
			filtre_repor.put(FicheActionPage.selec_Source_Action_Par_Personne_id,ExcelUtils.getCellData(1,0));
			filtre_repor.put(FicheActionPage.selec_RespRéalisation_Action_Par_Personne_id,ExcelUtils.getCellData(1,4));
			filtre_repor.put(FicheActionPage.del_DateRealisation1_Action_Par_Personne_id,ExcelUtils.getCellData(1,18));
			filtre_repor.put(FicheActionPage.del_DateRealisation2_Action_Par_Personne_id,ExcelUtils.getCellData(1,18));
			filtre_repor.put(FicheActionPage.del_DateSaisieRealisation1_Action_Par_Personne_id,ExcelUtils.getCellData(1,22));
			filtre_repor.put(FicheActionPage.del_DateSaisieRealisation2_Action_Par_Personne_id,ExcelUtils.getCellData(1,22));
		}
	
	public static void initializer_filtre_Bilan_action(String Path,String Filtre) throws Throwable
	{
		ExcelUtils.setExcelFile(Path, "Action");
		if(Filtre.equals("source")) 
		{
			filtre_repor.put(FicheActionPage.selec_source_id,ExcelUtils.getCellData(1,0));
		}else if(Filtre.equals("type")) {
			filtre_repor.put(FicheActionPage.selec_type_id,ExcelUtils.getCellData(1,1));
		}else if(Filtre.equals("priorité")) {
			filtre_repor.put(FicheActionPage.selec_Priorite_id,ExcelUtils.getCellData(1,2));
		}else if(Filtre.equals("gravité")) {
			filtre_repor.put(FicheActionPage.selec_gravite_id,ExcelUtils.getCellData(1,3));
		}else if(Filtre.equals("Resp réalisation")) {
			filtre_repor.put(FicheActionPage.selec_resp_rea_id,ExcelUtils.getCellData(1,4));
		}else if(Filtre.equals("Resp suivi")) {
			filtre_repor.put(FicheActionPage.selec_resp_suivi_id,ExcelUtils.getCellData(1,6));
		}else if(Filtre.equals("date création")) {
			filtre_repor.put(FicheActionPage.del_creation_1_id,ExcelUtils.getCellData(1,8));
			filtre_repor.put(FicheActionPage.del_creation_2_id,ExcelUtils.getCellData(1,8));
		}else if(Filtre.equals("type cause")) {
			filtre_repor.put(FicheActionPage.selec_type_cause_id,ExcelUtils.getCellData(1,9));
		}else if(Filtre.equals("Ref Audit")) {
			filtre_repor.put(FicheActionPage.audit_id,ExcelUtils.getCellData(1,10));
		}else if(Filtre.equals("Designation")) {
			filtre_repor.put(FicheActionPage.designation_id,ExcelUtils.getCellData(1,11));
		}else if(Filtre.equals("Description")) {
			filtre_repor.put(FicheActionPage.description_id,ExcelUtils.getCellData(1,12));
		}else if(Filtre.equals("site")) {
			filtre_repor.put(FicheActionPage.selec_site_id,ExcelUtils.getCellData(1,13));
		}else if(Filtre.equals("processus")) {
			filtre_repor.put(FicheActionPage.selec_processus_id,ExcelUtils.getCellData(1,14));
		}else if(Filtre.equals("domaine")) {
			filtre_repor.put(FicheActionPage.selec_domaine_id,ExcelUtils.getCellData(1,15));
		}else if(Filtre.equals("direction")) {
			filtre_repor.put(FicheActionPage.selec_direction_id,ExcelUtils.getCellData(1,16));
		//}else if(Filtre.equals("service")) {
			//filtre_repor.put(FicheActionPage.selec_service_id,ExcelUtils.getCellData(1,17));
		}else if(Filtre.equals("des sous act")) {
			filtre_repor.put(FicheActionPage.designsousact_id,ExcelUtils.getCellData(1,18));
		}else if(Filtre.equals("date réalisation")) {
			filtre_repor.put(FicheActionPage.del_real_1_id,ExcelUtils.getCellData(1,19));
			filtre_repor.put(FicheActionPage.del_real_2_id,ExcelUtils.getCellData(1,19));
		}else if(Filtre.equals("taux réalisation")) {
			filtre_repor.put(FicheActionPage.taux_real_1_id,ExcelUtils.getCellData(1,20));
			filtre_repor.put(FicheActionPage.taux_real_2_id,ExcelUtils.getCellData(1,20));
		}else if(Filtre.equals("date suivi")) {
			filtre_repor.put(FicheActionPage.del_suivi_1_id,ExcelUtils.getCellData(1,21));
			filtre_repor.put(FicheActionPage.del_suivi_2_id,ExcelUtils.getCellData(1,21));
		}else if(Filtre.equals("taux efficacité")) {
			filtre_repor.put(FicheActionPage.taux_eff_1_id,ExcelUtils.getCellData(1,22));
			filtre_repor.put(FicheActionPage.taux_eff_2_id,ExcelUtils.getCellData(1,22));
		}
	}
	

}
