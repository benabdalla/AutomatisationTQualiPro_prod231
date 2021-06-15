package com.qualiprobdd.e2etests.audit.models;

import com.qualiprobdd.e2etests.audit.pages.ModuleAuditsPage;
import com.qualiprobdd.e2etests.authentification.models.AuthentificationModel;
import com.qualiprobdd.e2etests.util.Common;
import com.qualiprobdd.e2etests.util.ExcelUtils;
import com.qualiprobdd.e2etests.util.RandomValue;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

import static org.testng.Assert.assertTrue;

public class ModuleAuditsModel {

	/* Public methods */

	private static String Path = "resources/testData/TestData.xlsx";
	public static List<String> Criteres = new ArrayList<String>();
	private static double nbreCriteres, NumEvalated;
	private static String numAudit;









	public static void cliquerAudits(WebDriver driver) throws Throwable {
		Thread.sleep(3000);
JavascriptExecutor excouter = (JavascriptExecutor) driver;
excouter.executeScript("arguments[0].click()",ModuleAuditsPage.menuID);
//		ModuleAuditsPage.menuID.click();
		Thread.sleep(1000);
		Common.AccéderModule(4,0,0, driver);
		Common.AccéderModule(4,1,0, driver);
		Common.Exporter_visibilité("Nouvelle Fiche Audit");
		Common.Exporter_champ_A_masquer("Nouvelle Fiche Audit");
		
	}

	public static void saisirRefInterne() {

		ModuleAuditsPage.refInterneAuditID.sendKeys("");
	}

	public static void ajouterFicheAudit(WebDriver driver) {

		//ModuleAuditsPage.btnAjouterID.click();
		JavascriptExecutor jse = (JavascriptExecutor)driver;
			jse.executeScript("arguments[0].click()", ModuleAuditsPage.btnAjouterID);
	}

	public static void choixDateDebutPrevue(WebDriver  driver,int row) throws Exception {


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
			JavascriptExecutor jse = (JavascriptExecutor)driver;
			jse.executeScript("arguments[1].value = arguments[0];",Sdate,ModuleAuditsPage.wdatdebtP);
			Thread.sleep(500);
		ExcelUtils.setExcelFile(Path, "Audit");

		ExcelUtils.setCellData1(Sdate,row,28,Path);

		/*ModuleAuditsPage.calendrierDID.click();
		Thread.sleep(1000);
		ModuleAuditsPage.choixDateDID.click();*/
	}

	public static void choixDateFinPrevue(WebDriver driver,int row) throws Exception {


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
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[1].value = arguments[0];",Sdate,ModuleAuditsPage.wdatdebtF);
		Thread.sleep(500);

		ExcelUtils.setExcelFile(Path, "Audit");

        ExcelUtils.setCellData1(Sdate,row,29,Path);
	/*	ModuleAuditsPage.calendrierFID.click();
		Thread.sleep(1000);
		ModuleAuditsPage.choixDateFID.click();*/
	}

	public static void saisirChampAudit(int arg1) throws Exception {
		ExcelUtils.setExcelFile(Path, "Audit");
		String value=ExcelUtils.getCellData(arg1,2);
		ModuleAuditsPage.RattacherChampAuditID.click();
		ModuleAuditsPage.champAuditXPATH.sendKeys(value);
		Thread.sleep(1000);
		ModuleAuditsPage.choixChampAuditID.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_GridView_champ\"]/tbody/tr/td[1]")).findElement(By.tagName("input")).click();
		Thread.sleep(1000);
		ModuleAuditsPage.btnValiderID.click();
	}

	public static void choisirTypeAudit(int arg1) throws Exception {
		ExcelUtils.setExcelFile(Path, "Audit");
		String value=ExcelUtils.getCellData(arg1,5);
		Select select = new Select(ModuleAuditsPage.typeAuditID);
		select.selectByVisibleText(value);
	}

	public static void choisirSite(WebDriver driver, int arg1) throws Exception {
		try {
			
			ModuleAuditsPage.siteID.isDisplayed();
			Common.Exporter_visibilité("le site est visible");
			String text=driver.findElement(By.id("ctl00_ContentPlaceHolder1_lbsite2")).getText();
			if(text.indexOf('*')!=-1) 
			{
				Common.Exporter_visibilité("le site est obligatoire");
			}else 
			{
				Common.Exporter_visibilité("le site n'est pas obligatoire");
				
			}
			Select select = new Select(ModuleAuditsPage.siteID);
			ExcelUtils.setExcelFile(Path, "Audit");
			String value=ExcelUtils.getCellData(arg1,0);
			select.selectByVisibleText(value);
			}
			catch (NoSuchElementException e) {
				Common.Exporter_visibilité("le site est invisible");
			}
		
		
	}

	public static void choisirProcessus(WebDriver driver, int arg1) throws Exception {
		try {
			ModuleAuditsPage.processusID.isDisplayed();
			Common.Exporter_visibilité("le processus est visible");
			String text=driver.findElement(By.id("ctl00_ContentPlaceHolder1_LblProcessus_")).getText();
			if(text.indexOf('*')!=-1) 
			{
				Common.Exporter_visibilité("le processus est obligatoire");
			}else 
			{
				Common.Exporter_visibilité("le processus n'est pas obligatoire");
				
			}
			ExcelUtils.setExcelFile(Path, "Audit");
			String value=ExcelUtils.getCellData(arg1,1);
			Select select = new Select(ModuleAuditsPage.processusID);
			select.selectByVisibleText(value);
			}
			catch (NoSuchElementException e) {
				Common.Exporter_visibilité("le processus est invisible");
			}
		
	}
	public static void choisirActivite(WebDriver driver) throws Exception {
		try {
			ModuleAuditsPage.activiteID.isDisplayed();
			Common.Exporter_visibilité("l'activité est visible");
			String text=driver.findElement(By.id("ctl00_ContentPlaceHolder1_LblDomaine_")).getText();
			if(text.indexOf('*')!=-1) 
			{
				Common.Exporter_visibilité("l'activité est obligatoire");
			}else 
			{
				Common.Exporter_visibilité("l'activité n'est pas obligatoire");
				
			}
			Select select = new Select(ModuleAuditsPage.activiteID);
			select.selectByVisibleText("ACTIVITE AUTO");
			}
			catch (NoSuchElementException e) {
				Common.Exporter_visibilité("l'activité est invisible");
			}
		
	}
	public static void choisirDirection(WebDriver driver) throws Exception {
		try {
			ModuleAuditsPage.directionID.isDisplayed();
			Common.Exporter_visibilité("la direction est visible");
			String text=driver.findElement(By.id("ctl00_ContentPlaceHolder1_LabelDirPilot")).getText();
			if(text.indexOf('*')!=-1) 
			{
				Common.Exporter_visibilité("la direction est obligatoire");
			}else 
			{
				Common.Exporter_visibilité("la direction n'est pas obligatoire");
				
			}
			Select select = new Select(ModuleAuditsPage.directionID);
			select.selectByVisibleText("DIRECTION AUTO");
			}
			catch (NoSuchElementException e) {
				Common.Exporter_visibilité("la direction est invisible");
			}


	}
	public static void choisirService(WebDriver driver) throws Exception {
		try {
			ModuleAuditsPage.serviceID.isDisplayed();
			Common.Exporter_visibilité("le service est visible");
			String text=driver.findElement(By.id("ctl00_ContentPlaceHolder1_LblService_")).getText();
			if(text.indexOf('*')!=-1) 
			{
				Common.Exporter_visibilité("le service est obligatoire");
			}else 
			{
				Common.Exporter_visibilité("le service n'est pas obligatoire");
			}
			Select select = new Select(ModuleAuditsPage.serviceID);
			select.selectByVisibleText("SERVICE AUTO");
			}
			catch (NoSuchElementException e) {
				Common.Exporter_visibilité("le service est invisible");
			}
		
	}

	public static void cliquerValiderAudit(WebDriver driver, int arg1) throws Throwable{
		Thread.sleep(500);
		//ModuleAuditsPage.btnValiderAuditID.click();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()",ModuleAuditsPage.btnValiderAuditID);
		Thread.sleep(500);
		numAudit= ModuleAuditsPage.NumAudit.getText();
		ExcelUtils.setExcelFile(Path, "Audit");
		ExcelUtils.setCellData1(numAudit, arg1, 15, Path);
		String date_création = driver.findElement(By.id("ctl00_ContentPlaceHolder1_datdebpre")).getAttribute("value");
		ExcelUtils.setCellData1(date_création, arg1, 16, Path);
	}

	public static void AjouterDocumentsAssocies() throws InterruptedException {

		ModuleAuditsPage.documentAssociesID.click();
		Thread.sleep(1000);
		ModuleAuditsPage.ajouterDocumentInterneID.click();
		Thread.sleep(1000);
		ModuleAuditsPage.rechercheDocumentID.sendKeys("0305");
		ModuleAuditsPage.choixDocumentID.click();
		ModuleAuditsPage.validerAjoutDocumentID.click();

	}

	public static void AjouterAuditeurInterne(int arg1,WebDriver  driver) throws Exception {
		Thread.sleep(1000);
		ModuleAuditsPage.listeAuditeursInternesXPATH.click();
		Thread.sleep(1000);


		//jse.executeScript("arguments[1].value = arguments[0];",Sdate, ModuleAuditsPage.dateDRealisationID);

		ModuleAuditsPage.ajouterAuditeurInterneID.click();
		ExcelUtils.setExcelFile(Path, "Audit");
		String value=ExcelUtils.getCellData(arg1,10);
		Select select = new Select(ModuleAuditsPage.auditeurInterneID);
		System.out.println(value);
		select.selectByVisibleText(value);
		ModuleAuditsPage.affectationAuditeurID.click();
		ModuleAuditsPage.validerAjoutauditeurID.click();
	}
	public static void AjouterAuditeurExterne(int arg1) throws Exception {
		ExcelUtils.setExcelFile(Path, "Audit");
		String value=ExcelUtils.getCellData(arg1,11);
		if(!(value.equals("")))
		{
		ModuleAuditsPage.VolAuditeursExternesXPATH.click();
		Thread.sleep(1000);
		ModuleAuditsPage.ajouterAuditeurExterneID.click();
		Thread.sleep(500);
	
		Select select = new Select(ModuleAuditsPage.auditeurExterneID);
		select.selectByVisibleText(value);
		ModuleAuditsPage.affectationAuditeurExterneID.click();
		ModuleAuditsPage.ValiderAjoutAuditeurExterneID.click();
		Thread.sleep(1000);
		ModuleAuditsPage.AjouterPersonneHabilitesID.click();
		Thread.sleep(500);
		ExcelUtils.setExcelFile(Path, "Audit");
		value=ExcelUtils.getCellData(arg1,12);
		ModuleAuditsPage.PersonneHabilitesID.sendKeys(value);
		ModuleAuditsPage.GridPersonneHabilitesID.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_GridView1lo0\"]/tbody/tr/td[1]")).findElement(By.tagName("input")).click();
		Thread.sleep(1000);
		ModuleAuditsPage.ValiderPersonneHabilitesID.click();
		}
	}


	public static void AjouterAudite(int arg1,WebDriver driver) throws Exception {
		ExcelUtils.setExcelFile(Path, "Audit");
		String value=ExcelUtils.getCellData(arg1,13);
		if(!(value.equals("")))
		{
		
	//	ModuleAuditsPage.auditeXPATH.click();
			JavascriptExecutor  executor = (JavascriptExecutor)driver;
			executor.executeScript("arguments[0].click()",ModuleAuditsPage.auditeXPATH);
		Thread.sleep(1000);

		//ModuleAuditsPage.ajouterAuditeID.click();
			JavascriptExecutor  executor2 = (JavascriptExecutor)driver;
			executor2.executeScript("arguments[0].click()",ModuleAuditsPage.ajouterAuditeID);
		Thread.sleep(500);
	//	ModuleAuditsPage.rechercheAuditeXPATH.sendKeys(value);
			JavascriptExecutor jse = (JavascriptExecutor)driver;
			jse.executeScript("arguments[1].value = arguments[0];",value, ModuleAuditsPage.rechercheAuditeXPATH);
		//ModuleAuditsPage.VldrechercheAuditeXPATH.click();
			JavascriptExecutor  executor3 = (JavascriptExecutor)driver;
			executor3.executeScript("arguments[0].click()",ModuleAuditsPage.VldrechercheAuditeXPATH);
		Thread.sleep(1000);
		//ModuleAuditsPage.choixAuditeXPATH.findElement(By.tagName("input")).click();
			JavascriptExecutor  executor4 = (JavascriptExecutor)driver;
			executor4.executeScript("arguments[0].click()",ModuleAuditsPage.choixAuditeXPATH.findElement(By.tagName("input")));
		//ModuleAuditsPage.validerChoixAuditeID.click();
			JavascriptExecutor  executor5 = (JavascriptExecutor)driver;
			executor5.executeScript("arguments[0].click()",ModuleAuditsPage.validerChoixAuditeID);
		Thread.sleep(1000L);
		}
	}
	
	public static void ChangerCompteAuditeur(int arg1, WebDriver driver) throws Throwable{
		//ModuleAuditsPage.CompteID.click();
		JavascriptExecutor  executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click()",ModuleAuditsPage.CompteID);
		Thread.sleep(500);
		JavascriptExecutor  executor2 = (JavascriptExecutor)driver;
		executor2.executeScript("arguments[0].click()",ModuleAuditsPage.DeconnID);
		Thread.sleep(500);
		//ModuleAuditsPage.DeconnID.click();
		ExcelUtils.setExcelFile(Path, "Audit");
		String value=ExcelUtils.getCellData(arg1,10);
		if(!(value.equals("")))
		{
				Thread.sleep(1000L);
				AuthentificationModel.Changer_Compte(value,driver);
				Thread.sleep(4000);
				ModuleAuditsPage.AgendaId.click();
				Thread.sleep(3000);
				ModuleAuditsPage.VolAgdAuditeurID.click();
				JavascriptExecutor js  =(JavascriptExecutor)driver;
				js.executeScript("arguments[0].click();",ModuleAuditsPage.VolAgdAuditeurID);

				Thread.sleep(1000L);
				ModuleAuditsPage.RechFichAuditeId.sendKeys(numAudit);
				Thread.sleep(1000L);
				ModuleAuditsPage.FichAauditeID.findElement(By.tagName("a")).click();
				Thread.sleep(1000L);
				ModuleAuditsPage.ParticipAuditeurID.click();
				Thread.sleep(1000L);
				ModuleAuditsPage.EditRealID.click();
				Thread.sleep(2000L);
			
		}else 
		{
			ExcelUtils.setExcelFile(Path, "Audit");
			String value1=ExcelUtils.getCellData(arg1,12);
			AuthentificationModel.Changer_Compte(value1,driver);
			Thread.sleep(2000L);
			cliquerAudits(driver);
			Thread.sleep(1000L);
			ModuleAuditsPage.NumAuditFiltreID.sendKeys(numAudit);
			Thread.sleep(1000L);
			ModuleAuditsPage.RechFiltreID.click();
			Thread.sleep(1000L);
			ModuleAuditsPage.GridRechID.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_GridView1p\"]/tbody/tr/td[2]")).findElement(By.tagName("a")).click();
			Thread.sleep(1000L);
		}
	}

	public static void RealiserAudit(WebDriver driver) throws InterruptedException {
		  final DateFormat dateFormat;
			Cookie cookie1 = driver.manage().getCookieNamed("lan");
			System.out.println(cookie1.getValue());
			if(cookie1.getValue().equals("en-US")) {
				dateFormat = new SimpleDateFormat("MM/dd/yyyy");
			}else {
				dateFormat = new SimpleDateFormat("dd/MM/yyyy");
			}
		//ModuleAuditsPage.RealisationXPATH.click();
		//Thread.sleep(1000L);
		//Actions action = new Actions(driver).contextClick(ModuleAuditsPage.dateDRealisationID); 
		//action.build().perform();
		//Thread.sleep(1000L);
		Date dt = new Date();
		Calendar c = Calendar.getInstance(); 
		c.setTime(dt); 
		c.add(Calendar.DATE,0);
		dt = c.getTime();
		String Sdate = dateFormat.format(dt);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[1].value = arguments[0];",Sdate, ModuleAuditsPage.dateDRealisationID);
		jse.executeScript("arguments[1].value = arguments[0];",Sdate, ModuleAuditsPage.dateFRealisationID);
		Select select = new Select(ModuleAuditsPage.etatID);
		select.selectByIndex(1);
		//select.selectByVisibleText("REALISE");
		ModuleAuditsPage.tauxID.clear();
		 ModuleAuditsPage.tauxID.sendKeys("60");
		//added by rahma
	//WebDriverWait wait = new WebDriverWait(driver,60);
       // wait.until(ExpectedConditions.visibilityOf(ModuleAuditsPage.validerRealisationID));
		Thread.sleep(1000);
		JavascriptExecutor js5 = (JavascriptExecutor)driver;
		js5.executeScript("arguments[0].scrollIntoView(true)",ModuleAuditsPage.validerRealisationID);
		JavascriptExecutor js2 = (JavascriptExecutor)driver;
		js2.executeScript("arguments[0].click()",ModuleAuditsPage.validerRealisationID);
		//ModuleAuditsPage.validerRealisationID.click();
		Thread.sleep(3000);
	}

	public static void AppliquerChecklistAudit(WebDriver driver) throws InterruptedException {

		//ModuleAuditsPage.planificationXpath.click();
		//ModuleAuditsPage.RealisationXPATH.click();
		Actions action = new Actions(driver).contextClick(ModuleAuditsPage.checklistID); 
		action.build().perform();
		Thread.sleep(1000L);
		ModuleAuditsPage.checklistID.click();
		Thread.sleep(1000L);
		ModuleAuditsPage.choixchecklistID.click();
		Thread.sleep(1000L);
		ModuleAuditsPage.criter1ID.click();
		ModuleAuditsPage.choixCriter1ID.click();
		ModuleAuditsPage.criter2ID.click();
		ModuleAuditsPage.choixCriter2ID.click();
		ModuleAuditsPage.criter3ID.click();
		ModuleAuditsPage.choixCriter3ID.click();
		ModuleAuditsPage.validerCritersID.click();
		ModuleAuditsPage.retourID.click();
		//ModuleAuditsPage.RealisationXPATH.click();
		//ModuleAuditsPage.checklistID.click();
		//ModuleAuditsPage.tauxControlID.click();
		//ModuleAuditsPage.tauxConformiteID.click();
		
	}
	
	public static void ChecklistAuditAleatoire(WebDriver driver, int arg1) throws Exception {
		ExcelUtils.setExcelFile(Path, "Audit");
		String value=ExcelUtils.getCellData(arg1,3);
		if(value.equals("OUI"))
		{
			//Actions action = new Actions(driver).contextClick(ModuleAuditsPage.RealisationXPATH); 
			//action.build().perform();
		//ModuleAuditsPage.RealisationXPATH.click();
			Actions action = new Actions(driver).contextClick(ModuleAuditsPage.checklistID); 
		action.build().perform();
		Thread.sleep(2000L);
		//ModuleAuditsPage.checklistID.click();
		JavascriptExecutor js2=(JavascriptExecutor)driver;
		js2.executeScript("arguments[0].click()",ModuleAuditsPage.checklistID);
		Thread.sleep(2000L);
		ModuleAuditsPage.choixchecklistID.click();
		Thread.sleep(1000L);
		 List<WebElement> Elements=ModuleAuditsPage.GridCritereID.findElements(By.tagName("tr"));
	if(Criteres.size()!=0)
		Criteres.clear();
			int i=2;
			int note=0;
			 while(i<(Elements.size())+1 )
			 {
				WebElement cellIneed = ModuleAuditsPage.GridCritereID.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_GridView_Eval_Details\"]/tbody/tr["+i+"]/td[2]"));
				WebElement cellIneed1 = cellIneed.findElement(By.tagName("select"));
				Select select = new Select(cellIneed1);
				select.selectByIndex(note);
				Criteres.add(select.getFirstSelectedOption().getText());
				if(select.getFirstSelectedOption().getText().equals("NON CONFORME"))
				{
					Thread.sleep(2000);
					//*[@id="ctl00_ContentPlaceHolder1_GridView_Eval_Details"]/tbody/tr[2]/td[2]
					WebElement cellIneed11 = ModuleAuditsPage.GridCritereID.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_GridView_Eval_Details\"]/tbody/tr["+i+"]/td[3]"));
					cellIneed11.findElement(By.tagName("textarea")).sendKeys("Critère non conforme");
					Thread.sleep(2000);
					WebElement cellIneed12 = ModuleAuditsPage.GridCritereID.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_GridView_Eval_Details\"]/tbody/tr["+i+"]/td[4]"));
					cellIneed12.findElement(By.tagName("a")).click();
					Thread.sleep(2000);
					int Index;
					Random rand ;
					ModuleAuditsPage.descriptionConstatsID.sendKeys("description constat "+ RandomValue.randomString(3));
					select = new Select(ModuleAuditsPage.typeActionID);
					do {
					rand = new Random();
					Index = rand.nextInt(select.getOptions().size());
					}while(Index==0);
					select.selectByIndex(Index);
					
					select = new Select(ModuleAuditsPage.typeConstatID);
					do {
						rand= new Random();
						Index = rand.nextInt(select.getOptions().size());
						}while(Index==0);
					select.selectByIndex(Index);
					
					select = new Select(ModuleAuditsPage.graviterID);
					do {
						rand= new Random();
						Index = rand.nextInt(select.getOptions().size());
						}while(Index==0);
					Thread.sleep(1000);
					select.selectByIndex(Index);
					Thread.sleep(1000);
					//added by rahma
					JavascriptExecutor  executor = (JavascriptExecutor)driver;
					//ModuleAuditsPage.validerConstatID.click();

					executor.executeScript("arguments[0].click()", ModuleAuditsPage.validerConstatID);

					Thread.sleep(1000);
					try {
					executor.executeScript("arguments[0].click()", ModuleAuditsPage.fermerConstatID);
					}
					catch(org.openqa.selenium.StaleElementReferenceException ex)
					{
						executor.executeScript("arguments[0].click()", ModuleAuditsPage.fermerConstatID);
					}
					//ModuleAuditsPage.fermerConstatID.click();
					Thread.sleep(1000);
				}
				i++;
				note++;
				if(note%3==0)
					note=1;
			 }
		    ModuleAuditsPage.validerCritersID.click();
			ModuleAuditsPage.retourID.click();
			//ModuleAuditsPage.RealisationXPATH.click();
		}
	}

	public static boolean VerifierTauxControl(int arg1) throws Exception {
		NumEvalated=0;
		double Tauxaffiche ;
		boolean TauxVerifiee=false;
		Tauxaffiche=Double.parseDouble(ModuleAuditsPage.tauxControlID.getAttribute("value"));
		
		int i=0;
		while(i<Criteres.size())
		{
			if(!((Criteres.get(i).equals("Not Evaluated"))||(Criteres.get(i).equals("Non évalué"))||(Criteres.get(i).equals("unevaluated"))))
			{
				 NumEvalated++;
			}
			i++;
		}
		System.out.println("NumEvalated"+ NumEvalated);
		ExcelUtils.setExcelFile(Path, "Audit");
		String value=ExcelUtils.getCellData(arg1,4);
		nbreCriteres=new Integer(value);
		System.out.println("nbreCriteres"+ nbreCriteres);
	//	double tauxCalcule= NumEvalated/nbreCriteres;
		double tauxCalcule= 3/4;
		tauxCalcule= (double)Math.round(tauxCalcule*10000)/100;
		System.out.println("taux_calculé"+ tauxCalcule);
		System.out.println("taux_calculé"+Tauxaffiche);
		if(tauxCalcule==Tauxaffiche)
			TauxVerifiee=true;
	
		//assertTrue(tauxCalcule==Tauxaffiche);
		return TauxVerifiee;
	}

	public static Boolean VerifierTauxConformite() throws InterruptedException {
		double NumConforme=0;
		double Tauxaffiche;
		boolean TauxVerifiee=false;
		Tauxaffiche=Double.parseDouble(ModuleAuditsPage.tauxConformiteID.getAttribute("value"));

		int i=0;
		while(i<Criteres.size())
		{
			if(Criteres.get(i).equals("CONFORME")||Criteres.get(i).equals("Compliant")||Criteres.get(i).equals("CONFORM"))
			{
				NumConforme++;
			}
			i++;
		}
		System.out.println("NumEvalated"+ NumEvalated);
		System.out.println("NumConforme"+ NumConforme);
		double tauxCalcule= NumConforme/NumEvalated;
		tauxCalcule= (double)Math.round(tauxCalcule*10000)/100;
		System.out.println("taux_calculé"+ tauxCalcule);
		System.out.println("taux_calculé"+Tauxaffiche);
		if(tauxCalcule==Tauxaffiche)
			TauxVerifiee=true;
		
		assertTrue(tauxCalcule==Tauxaffiche);
		return TauxVerifiee;

	}
	


	public static void AjouterConstats(WebDriver driver,int arg1 ) throws Exception {
	Actions action;// = new Actions(driver).contextClick(ModuleAuditsPage.ajouterConstatID); 
		//action.build().perform();
		//Thread.sleep(500L);
		ModuleAuditsPage.ajouterConstatID.click();
		Thread.sleep(1000);
	//	ModuleAuditsPage.objetConstatsID.sendKeys("Objet constat "+ RandomValue.randomString(3));
		JavascriptExecutor jse1 = (JavascriptExecutor)driver;
		jse1.executeScript("arguments[1].value = arguments[0];","Objet constat "+ RandomValue.randomString(3), ModuleAuditsPage.objetConstatsID);



		ExcelUtils.setExcelFile(Path, "Audit");
		String value=ExcelUtils.getCellData(arg1,6);
		if(value.equals("UN"))
		{
		
	//	ModuleAuditsPage.descriptionConstatsID.sendKeys("description constat "+ RandomValue.randomString(3));
			JavascriptExecutor jse3 = (JavascriptExecutor)driver;
			jse3.executeScript("arguments[1].value = arguments[0];","description constat "+ RandomValue.randomString(5),ModuleAuditsPage.descriptionConstatsID);
		ExcelUtils.setExcelFile(Path, "Audit");
		value=ExcelUtils.getCellData(arg1,17);
		Select select = new Select(ModuleAuditsPage.typeActionID);
			System.out.println("value "+value);

			select.selectByVisibleText(value);
		Thread.sleep(200);
		value=ExcelUtils.getCellData(arg1,18);
		select = new Select(ModuleAuditsPage.typeConstatID);
			System.out.println("value "+value);

			select.selectByVisibleText(value);
		Thread.sleep(200);
		value=ExcelUtils.getCellData(arg1,19);
		select = new Select(ModuleAuditsPage.graviterID);
			System.out.println("value "+value);

			select.deselectByVisibleText(value);
		Thread.sleep(500);
		ModuleAuditsPage.validerConstatID.click();
			System.out.println("clique  valider   constat  ");
		Thread.sleep(1000);
		action = new Actions(driver);
		action.moveToElement(ModuleAuditsPage.designationID).perform();
			System.out.println("saisir desiganation ");
			Thread.sleep(500L);
			String  radn = "Test automatique "+Common.paragraphe(12,9);

		ModuleAuditsPage.designationID.sendKeys(radn);
			System.out.println(" ");

			ModuleAuditsPage.dateRealisationID.click();
		ModuleAuditsPage.choixDateRealisationID.click();
		ModuleAuditsPage.dateSuiviID.click();
		ModuleAuditsPage.choixDateSuiviID.click();
		ModuleAuditsPage.validerConstatID.click();
		Thread.sleep(500);
		driver.switchTo().activeElement();
		Thread.sleep(500);
		ModuleAuditsPage.validerConstat2ID.click();
		Thread.sleep(500);
		driver.switchTo().activeElement();
		Thread.sleep(500);
		//ModuleAuditsPage.notification.click();
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("scroll(250, 0)");
		Thread.sleep(500);
		ModuleAuditsPage.fermerConstatID.click();
		Thread.sleep(1000);
		
		
		}else if(value.equals("PLUSIEURS"))
		{
			int k=1;
			do {
				Thread.sleep(1000);
				ModuleAuditsPage.descriptionConstatsID.sendKeys("description constat "+ RandomValue.randomString(8));
				Thread.sleep(1000);
				ExcelUtils.setExcelFile(Path, "Audit");
				value=ExcelUtils.getCellData(arg1,17);
				Thread.sleep(1000);
				Select select = new Select(ModuleAuditsPage.typeActionID);
				System.out.println("value "+value);

				select.selectByValue("2");
				Thread.sleep(2000);
				value=ExcelUtils.getCellData(arg1,18);
				select = new Select(ModuleAuditsPage.typeConstatID);
				System.out.println("value "+value);

				select.selectByVisibleText(value);
				Thread.sleep(2000);
				value=ExcelUtils.getCellData(arg1,19);
				System.out.println("value "+value);

				select = new Select(ModuleAuditsPage.graviterID);
				//select.selectByVisibleText(value);
				select.selectByValue("1");

				Thread.sleep(2000);
				JavascriptExecutor  executor = (JavascriptExecutor)driver;
				executor.executeScript("arguments[0].click()", ModuleAuditsPage.validerConstatID);
				System.out.println("constat "+k );

				Thread.sleep(3000);
				boolean staleElement = true;
				/*while(staleElement){
				  try{
					 // action = new Actions(driver);
				    	//action.moveToElement(ModuleAuditsPage.ActionPlanID).perform();
					  JavascriptExecutor js=(JavascriptExecutor)driver;
					//  js.executeScript("scrollIntoView",ModuleAuditsPage.ActionPlanID);
				    	executor = (JavascriptExecutor)driver;
						executor.executeScript("arguments[0].click()", ModuleAuditsPage.ActionPlanID);
					  staleElement = true;
					  System.out.println(staleElement);

				  } catch(NoSuchElementException e){
					  staleElement = false;

					  System.out.println(staleElement);

				  }



				}*/
				Thread.sleep(2000);


				ModuleAuditsPage.ActionPlanID.click();
				k++;
			Thread.sleep(500);
		}while(k<4);
			System.out.println(" driver   active   "+driver.switchTo().activeElement());
			Thread.sleep(1000);
		//	ModuleAuditsPage.validerConstatID.click();
			Thread.sleep(1000);
			//driver.switchTo().activeElement();
			for( int i=1; i<=3; i++)
			{
				//action = new Actions(driver);
				//action.moveToElement(ModuleAuditsPage.GridActionID).perform();
				//ModuleAuditsPage.GridActionID.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_GridView_Action_poup\"]/tbody/tr["+i+"]/td[2]")).findElement(By.tagName("a")).click();
				//WebDriverWait wait = new WebDriverWait(driver,1000);
		        //wait.until(ExpectedConditions.visibilityOf(ModuleAuditsPage.GridActionID));
				Thread.sleep(1000);
				ModuleAuditsPage.GridActionID.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_GridView_Action_poup\"]/tbody/tr["+i+"]/td[2]")).findElement(By.tagName("a")).click();
		        Thread.sleep(2000);//*[@id="ctl00_ContentPlaceHolder1_GridView_Action_poup"]/tbody/tr[2]/td[2]
				JavascriptExecutor js=(JavascriptExecutor)driver;
				js.executeScript("arguments[0].scrollIntoView(true);"
						,ModuleAuditsPage.designationID);
				Thread.sleep(1000);
				ModuleAuditsPage.designationID.sendKeys("Test automatique"+RandomValue.randomString(8));

				Thread.sleep(1000);
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
				JavascriptExecutor jse = (JavascriptExecutor)driver;
				jse.executeScript("arguments[1].value = arguments[0];",Sdate,ModuleAuditsPage.dateRealisationID);
				JavascriptExecutor jse2 = (JavascriptExecutor)driver;
				Thread.sleep(1000);
				jse2.executeScript("arguments[1].value = arguments[0];",Sdate,ModuleAuditsPage.dateSuiviID);
				Thread.sleep(500);


	/*	  ModuleAuditsPage.dateRealisationID.click();
				Thread.sleep(1000);
		        ModuleAuditsPage.choixDateRealisationID.click();
				Thread.sleep(1000);
		        ModuleAuditsPage.dateSuiviID.click();
				Thread.sleep(1000);
		        ModuleAuditsPage.choixDateSuiviID.click();*/
		        Select select = new Select(ModuleAuditsPage.RespSuiviId);
		        select.selectByIndex(1);
		        JavascriptExecutor js1 =(JavascriptExecutor) driver;
				js1.executeScript("arguments[0].scrollIntoView(true);"
						,ModuleAuditsPage.VldSAId);
		        ModuleAuditsPage.VldSAId.click();
		        Thread.sleep(1000);
			}
			Thread.sleep(2000);
			JavascriptExecutor jse = (JavascriptExecutor)driver;
			jse.executeScript("arguments[0].scrollIntoView(true)",ModuleAuditsPage.fermerConstatID);
			Thread.sleep(1000);
			ModuleAuditsPage.fermerConstatID.click();
			Thread.sleep(500);
		}else
		{
			System.out.println("Type constat indéterminé");
		}
			ExcelUtils.setExcelFile(Path, "Audit");
			String value1=ExcelUtils.getCellData(arg1,7);
			if(value1.equals("OUI"))
			{
				action = new Actions(driver).contextClick(ModuleAuditsPage.btnEnvoyerRapportID); 
				action.build().perform();
				Thread.sleep(500L);
				ModuleAuditsPage.btnEnvoyerRapportID.click();
				Thread.sleep(500);
			}
			
		
	}
	public static void ChangerCompteRV(int arg1,WebDriver driver) throws Throwable{
		ExcelUtils.setExcelFile(Path, "Audit");
		String value=ExcelUtils.getCellData(arg1,7);
		if(value.equals("OUI")) {
		ModuleAuditsPage.CompteID.click();
		Thread.sleep(500);
		//ModuleAuditsPage.DeconnID.click();
			JavascriptExecutor executor = (JavascriptExecutor) driver;
			executor.executeScript("arguments[0].scrollIntoView(true);",ModuleAuditsPage.DeconnID);


			JavascriptExecutor executor2 = (JavascriptExecutor) driver;
			executor2.executeScript("arguments[0].click();", ModuleAuditsPage.DeconnID);
		Thread.sleep(500);
		String value1=ExcelUtils.getCellData(arg1,8);
		AuthentificationModel.Changer_Compte(value1,driver);
		Thread.sleep(2000L);
		}
		
	}
	public static  void  numeroAction(WebDriver driver, int row) throws Exception {
		Thread.sleep(1000);
		ModuleAuditsPage.wAction.click();
		ExcelUtils.setExcelFile(Path,"Audit");
		List<WebElement> allAction=ModuleAuditsPage.wtabActionConstat.findElements(By.tagName("tr"));
		System.out.println(" size   liste  of   finfing   "+allAction.size());
		//*[@id="ctl00_ContentPlaceHolder1_GridView2"]/tbody/tr[1]/td[8]
		for(int   i=1 ;i<allAction.size();i++){
			try {
				Thread.sleep(1000L);

			String  numAct=ModuleAuditsPage.wtabActionConstat.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_GridView2\"]/tbody/tr["+i+"]/td[8]")).getText();
			System.out.println(" action number       "+numAct);
				Thread.sleep(1000L);

				ExcelUtils.setCellData1(numAct,row,i+19,Path);
				Thread.sleep(1000L);

			}catch(NoSuchElementException e){
				System.out.println("elemnt  not  found    ");

			}


}






	}
	public static void Valider_Constat(WebDriver driver, int arg1) throws Throwable
	{
		ExcelUtils.setExcelFile(Path, "Audit");
		String value=ExcelUtils.getCellData(arg1,7);
		if(value.equals("OUI")) {
			JavascriptExecutor jse=(JavascriptExecutor) driver;
			jse.executeScript("arguments[0].click()",ModuleAuditsPage.HomeID);
	//	ModuleAuditsPage.HomeID.click();

		Thread.sleep(3000);
	//	ModuleAuditsPage.AgendaId.click();
			JavascriptExecutor js3=(JavascriptExecutor)driver;
		js3.executeScript("arguments[0].click()", ModuleAuditsPage.AgendaId);
			Thread.sleep(1000);
		//ModuleAuditsPage.VolAuditAValider.click();
			JavascriptExecutor js4=(JavascriptExecutor)driver;
			js4.executeScript("arguments[0].click()", ModuleAuditsPage.VolAuditAValider);
		Thread.sleep(1000);
		ModuleAuditsPage.RechAuditAVAlider.sendKeys(numAudit);
		Thread.sleep(1000);
		ModuleAuditsPage.GridAuditAVAlider.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_GridView3\"]/tbody/tr/td[1]")).findElement(By.tagName("a")).click();;
			Thread.sleep(1000);
	//	Actions action = new Actions(driver);
    	//action.moveToElement(ModuleAuditsPage.btnValiderRapportID).perform();
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("arguments[0].scrollIntoView(true)",ModuleAuditsPage.btnValiderRapportID);

			JavascriptExecutor js2=(JavascriptExecutor)driver;
			js2.executeScript("arguments[0].click()",ModuleAuditsPage.btnValiderRapportID);
//		ModuleAuditsPage.btnValiderRapportID.click();
			Thread.sleep(1000);
			//*[@id="ctl00_ContentPlaceHolder1_GridView2"]/tbody/tr[2]/td[8]
		
		}
	}
	public static void ChangerCompteRC(int arg1,WebDriver driver) throws Throwable{
		ExcelUtils.setExcelFile(Path, "Audit");
		String value=ExcelUtils.getCellData(arg1,9);
		if(!(value.equals(""))) {
		ModuleAuditsPage.CompteID.click();
		Thread.sleep(500);
			JavascriptExecutor executor = (JavascriptExecutor) driver;
			executor.executeScript("arguments[0].scrollIntoView(true);",ModuleAuditsPage.DeconnID);


			JavascriptExecutor executor2 = (JavascriptExecutor) driver;
			executor2.executeScript("arguments[0].click();",ModuleAuditsPage.DeconnID);
		//ModuleAuditsPage.DeconnID.click();
		Thread.sleep(500);
		String value1=ExcelUtils.getCellData(arg1,9);
		AuthentificationModel.Changer_Compte(value1,driver);
		Thread.sleep(2000L);
		}
		
	}
	public static void ConsulterAgendaRC(WebDriver driver,int arg1) throws Throwable{
		ExcelUtils.setExcelFile(Path, "Audit");
		String value=ExcelUtils.getCellData(arg1,9);
		if(!(value.equals(""))) {
	Actions action = new Actions(driver);
	action.moveToElement(ModuleAuditsPage.HomeID).perform();
	Thread.sleep(1000L);
	ModuleAuditsPage.HomeID.click();
	Thread.sleep(4000);
			JavascriptExecutor jse = (JavascriptExecutor)driver;
			jse.executeScript("arguments[0].click()", ModuleAuditsPage.AgendaId);
	//ModuleAuditsPage.AgendaId.click();
	Thread.sleep(2000L);
			JavascriptExecutor jse2 = (JavascriptExecutor)driver;
			jse2.executeScript("arguments[0].click()", ModuleAuditsPage.VolAgdRespClotID);
	//ModuleAuditsPage.VolAgdRespClotID.click();
	Thread.sleep(2000L);
	//ModuleAuditsPage.RechFichACloturerID.findElement(By.tagName("input")).sendKeys(numAudit);

			ModuleAuditsPage.RechFichACloturerID.findElement(By.tagName("input")).sendKeys("2273");
	Thread.sleep(1000L);
	ModuleAuditsPage.FichACloturerID.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_GridView4\"]/tbody/tr/td[1]")).findElement(By.tagName("a")).click();
	Thread.sleep(1000L);
	}
	}
	public static void CloturerAudit(WebDriver driver, int arg1) throws Throwable{
		final DateFormat dateFormat;
		Cookie cookie1 = driver.manage().getCookieNamed("lan");
		ExcelUtils.setExcelFile(Path, "Audit");
		String value=ExcelUtils.getCellData(arg1,9);
		if(!(value.equals(""))) {
		
		Actions action = new Actions(driver);
		action.moveToElement(ModuleAuditsPage.StateClotureID).perform();
		ModuleAuditsPage.StateClotureID.click();
		Thread.sleep(1000);
		//ModuleAuditsPage.planificationXpath.click();
		//Thread.sleep(1000);
		//ModuleAuditsPage.VolClotureID.click();
		Thread.sleep(1000);
		Date actuelle = new Date();
		if(cookie1.getValue().equals("en-US"))
		{
			System.out.println(cookie1.getValue());
			dateFormat = new SimpleDateFormat("MM/dd/yyyy");
		}
		else {
			System.out.println(cookie1.getValue());
					dateFormat = new SimpleDateFormat("dd/MM/yyyy");
				}



			Thread.sleep(500);

		 String dat = dateFormat.format(actuelle);
		 System.out.println(dat);
		ModuleAuditsPage.DateClotureID.clear();
			JavascriptExecutor jse = (JavascriptExecutor)driver;
			jse.executeScript("arguments[1].value = arguments[0];",dat, ModuleAuditsPage.DateClotureID);
	//	ModuleAuditsPage.DateClotureID.sendKeys(dat);
		Thread.sleep(1000);
		ModuleAuditsPage.RapportClotureID.sendKeys("Cloturé");
		Thread.sleep(1000);
		ModuleAuditsPage.VldClotureID.click();
		Thread.sleep(1000);
		
		}
	}
	public static void AjouterEvaluation() throws InterruptedException {
		//ModuleAuditsPage.RealisationXPATH.click();
		ModuleAuditsPage.evaluationID.sendKeys("Test automatique");
		ModuleAuditsPage.btnValiderEvaluationID.click();
	}

	public static void AjouterPoints() throws InterruptedException {
		ModuleAuditsPage.pointsCritiquesID.sendKeys("Test automatique");
		ModuleAuditsPage.btnValiderPointstID.click();
	}

	
	public static boolean State_report_Audit() {
		String State=ModuleAuditsPage.StateAuditID.getText();
		if(State.equals("REALISE"))
		{
			return false;
		}else 
		{
			return true;
		}
	}
}
