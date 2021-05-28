package com.qualiprobdd.e2etests.Environnement.models;

import static org.testng.Assert.assertTrue;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import com.qualiprobdd.e2etests.PNC.pages.ModulePNCPage;
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

import com.qualiprobdd.e2etests.Environnement.pages.IncidentPage;
import com.qualiprobdd.e2etests.util.Common;
import com.qualiprobdd.e2etests.util.ExcelUtils;
import com.qualiprobdd.e2etests.util.RandomValue;



public class IncidentModel {

	
	
	public static void  Consulter_module_Environnement(WebDriver driver) throws Throwable 
	{
		//IncidentPage.MenuId.click();
		JavascriptExecutor  executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click()", IncidentPage.MenuId);
		Thread.sleep(200);
		Common.AccéderModule(15,0,0, driver);

	}
	public static void  Consulter_Module_Incident_environnemental(WebDriver driver) throws Throwable {
		Common.AccéderModule(15, 4, 0, driver);
	}
	public static void  Consulter_Module_incidents(WebDriver driver) throws Throwable {
	
		Common.AccéderModule(15,4, 1, driver);
	}
	public static void  ajouter_incident() throws Throwable {
		IncidentPage.AjtIncId.click();
		Common.Exporter_visibilité("Nouvelle Fiche Incident Environnemental");
		Common.Exporter_champ_A_masquer("Nouvelle Fiche Incident Environnemental");
	}
	public static void  désignation_Incident() throws Throwable {
		IncidentPage.DesigIncId.sendKeys("Incident AUTO "+RandomValue.randomString(10));
	}
	public static void  Choisir_type_Incident(String type) throws Throwable {
		Select select = new Select(IncidentPage.TypIncId);
		select.selectByVisibleText(type);
		
	}
	public static void  Choisir_Catégorie() throws Throwable 
	{
		Select select = new Select(IncidentPage.CatIncId);
		select.selectByVisibleText("Catégorie AUTO");
	}
	
	public static void  Date_Incident(WebDriver driver) throws Throwable 
	{
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
			JavascriptExecutor jse = (JavascriptExecutor)driver;
			jse.executeScript("arguments[1].value = arguments[0];",Sdate, IncidentPage.DateIncId);
		
		
	}
	
	public static void  Heure_Incident(WebDriver driver) throws Throwable {
		DateFormat format = new SimpleDateFormat("HH:mm");
		Date date1 = format.parse("10:00");
		String heure=format.format(date1);
		System.out.println(heure);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[1].value = arguments[0];",heure, IncidentPage.HeureIncId);
	
	}
	
	public static void  N_interne() throws Throwable 
	{
		int num=RandomValue.randomInt(5);
		IncidentPage.NinterId.sendKeys(String.valueOf(num));
	}
	
	public static void  Détecter_par() throws Throwable
	{
		IncidentPage.DeteIncId.sendKeys("AUTO");
	}
	
	public static void  Saisir_Origine () throws Throwable
	{
		try {
				IncidentPage.OrigIncId.isDisplayed();
				Common.Exporter_visibilité("l origine est visible");
				IncidentPage.OrigIncId.sendKeys("AUTO");	
			}
			catch (NoSuchElementException e) {
				Common.Exporter_visibilité("l origine est invisible");
			}
	}
	public static void  quantité_rejeté() throws Throwable
	{
		int num=RandomValue.randomInt(5);
		IncidentPage.QteIncId.sendKeys(String.valueOf(num));
	}
	public static void  Choisir_Lieu(String Lieu, WebDriver driver) throws Throwable {
		try {
			IncidentPage.LieuIncId.isDisplayed();
			Common.Exporter_visibilité("lieu est visible");
			String text=driver.findElement(By.id("ctl00_ContentPlaceHolder1_Label73")).getText();
			if(text.indexOf('*')!=-1) 
			{
				Common.Exporter_visibilité("le lieu est obligatoire");
			}else 
			{
				Common.Exporter_visibilité("le lieu n'est pas obligatoire");
			}
			Select select = new Select(IncidentPage.LieuIncId);
			select.selectByVisibleText(Lieu);
	
		}
		catch (NoSuchElementException e) {
			Common.Exporter_visibilité("lieu est invisible");
		}
		
		}
	public static void  Choisir_site(String site, WebDriver driver) throws Throwable {
		try {
			IncidentPage.SiteIncId.isDisplayed();
			Common.Exporter_visibilité("site est visible");
			String text=driver.findElement(By.id("ctl00_ContentPlaceHolder1_Label23")).getText();
			if(text.indexOf('*')!=-1) 
			{
				Common.Exporter_visibilité("le site est obligatoire");
			}else 
			{
				Common.Exporter_visibilité("le site n'est pas obligatoire");
				
			}
			try {
				
				IncidentPage.LieuIncId.isDisplayed();
				Common.Exporter_visibilité("site est lié au lieu");
			}
			catch (NoSuchElementException e) {
				
				Common.Exporter_visibilité("site non lié au lieu");
				Select select = new Select(IncidentPage.SiteIncId);
				select.selectByVisibleText(site);
			}
	
		}
		catch (NoSuchElementException e) {
			Common.Exporter_visibilité("site est invisible");
		}
		}
	
	public static void  Choisir_processus(String processus, WebDriver driver) throws Throwable {
		try {
			IncidentPage.ProcessIncId.isDisplayed();
			Common.Exporter_visibilité("processus est visible");
			String text=driver.findElement(By.id("ctl00_ContentPlaceHolder1_LblProcessus_")).getText();
			if(text.indexOf('*')!=-1) 
			{
				Common.Exporter_visibilité("le processus est obligatoire");
			}else 
			{
				Common.Exporter_visibilité("le processus n'est pas obligatoire");
			}
			Select select = new Select(IncidentPage.ProcessIncId);
			select.selectByVisibleText(processus);
	
		}
		catch (NoSuchElementException e) {
			Common.Exporter_visibilité("processus est invisible");
		}
		}
	public static void  Choisir_activité(WebDriver driver) throws Throwable {
		try {
			IncidentPage.ActIncId.isDisplayed();
			Common.Exporter_visibilité("l activité est visible");
			String text=driver.findElement(By.id("ctl00_ContentPlaceHolder1_LblDomaine_")).getText();
			if(text.indexOf('*')!=-1) 
			{
				Common.Exporter_visibilité("l activite est obligatoire");
			}else 
			{
				Common.Exporter_visibilité("l activité n'est pas obligatoire");
			}
			Select select = new Select(IncidentPage.ActIncId);
			select.selectByVisibleText("ACTIVITE AUTO");
	
		}
		catch (NoSuchElementException e) {
			Common.Exporter_visibilité("l activite est invisible");
		}
		}
	public static void  Choisir_direction(WebDriver driver) throws Throwable {
		try {
			IncidentPage.DirecIncId.isDisplayed();
			Common.Exporter_visibilité("direction est visible");
			String text=driver.findElement(By.id("ctl00_ContentPlaceHolder1_LabelDirPilot")).getText();
			if(text.indexOf('*')!=-1) 
			{
				Common.Exporter_visibilité("la direction est obligatoire");
			}else 
			{
				Common.Exporter_visibilité("la direction n'est pas obligatoire");
			}
			Select select = new Select(IncidentPage.DirecIncId);
			select.selectByVisibleText("DIRECTION AUTO");
	
		}
		catch (NoSuchElementException e) {
			Common.Exporter_visibilité("la direction est invisible");
		}
	}
	public static void  Choisir_service(WebDriver driver) throws Throwable {
		try {
			IncidentPage.ServIncId.isDisplayed();
			Common.Exporter_visibilité("service est visible");
			String text=driver.findElement(By.id("ctl00_ContentPlaceHolder1_LblService_")).getText();
			if(text.indexOf('*')!=-1) 
			{
				Common.Exporter_visibilité("le service est obligatoire");
			}else 
			{
				Common.Exporter_visibilité("le service n'est pas obligatoire");
			}
			Select select = new Select(IncidentPage.ServIncId);
			select.selectByVisibleText("SERVICE AUTO");
	
		}
		catch (NoSuchElementException e) {
			Common.Exporter_visibilité("le service est invisible");
		}
	}
	public static void  Choisir_secteur() throws Throwable {
		Select select = new Select(IncidentPage.SectIncId);
		select.selectByVisibleText("SECTEUR AUTO");
	}
	public static void  poste_travail() throws Throwable {
		try {
		IncidentPage.PostIncId.isDisplayed();
		Common.Exporter_visibilité("la poste est visible");
		Select select = new Select(IncidentPage.PostIncId);
		select.selectByVisibleText("POSTE AUTO");

	}
	catch (NoSuchElementException e) {
		Common.Exporter_visibilité("la poste est invisible");
	}
		
	}
	public static void  description_Incident() throws Throwable {
		IncidentPage.DescIncId.sendKeys("Description incident");
	}
	public static void _description_cause() throws Throwable {
		IncidentPage.DescCausId.sendKeys("description cause");
	}
	public static void  Saisir_conséquences() throws Throwable {
		IncidentPage.DescConsId.sendKeys("Description conséquence");
	}
	public static void  type_conséquence(WebDriver driver) throws Throwable {
		IncidentPage.RattTypConsId.click();
		WebDriverWait wait = new WebDriverWait(driver,60);
        wait.until(ExpectedConditions.visibilityOf(IncidentPage.RechTypConsId));
		IncidentPage.RechTypConsId.sendKeys("TYPE CONSEQUENCE AUTO");
		wait = new WebDriverWait(driver,60);
        wait.until(ExpectedConditions.visibilityOf(IncidentPage.GridTypConsId));
		IncidentPage.GridTypConsId.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_GridView_TypeConseq_Rat\"]/tbody/tr/td[1]")).findElement(By.tagName("input")).click();
		IncidentPage.VldRattTypConsId.click();
		
		
	}
	public static void  type_cause(WebDriver driver) throws Throwable {
		//IncidentPage.RattTypCauseId.click();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()",IncidentPage.RattTypCauseId);
		WebDriverWait wait = new WebDriverWait(driver,60);
        wait.until(ExpectedConditions.visibilityOf(IncidentPage.RechTypCauseId));
		IncidentPage.RechTypCauseId.sendKeys("TYPE CAUSE AUTO");
		wait = new WebDriverWait(driver,60);
        wait.until(ExpectedConditions.visibilityOf(IncidentPage.GridTypCauseId));
		IncidentPage.GridTypCauseId.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_GridView_TypeCause_Rat\"]/tbody/tr/td[1]")).findElement(By.tagName("input")).click();
		IncidentPage.VldTypeCauseId.click();
	}
	
	public static void  Choisir_Gravité() throws Throwable 
	{
		Select select = new Select(IncidentPage.GravIncId);
		select.selectByVisibleText("Critique");
	}
	public static void  Cout_estimé() throws Throwable 
	{
		try {
			IncidentPage.CoutIncId.isDisplayed();
			Common.Exporter_visibilité("le cout est visible");
			Select select = new Select(IncidentPage.CoutIncId);
			select.selectByVisibleText("1000");

		}
		catch (NoSuchElementException e) {
			Common.Exporter_visibilité("le cout est invisible");
		}
	}
	public static void  Choisir_ISPS() throws Throwable
	{
		try {
			IncidentPage.IsPsIncId.isDisplayed();
			Common.Exporter_visibilité("ISPS est visible");
			Select select = new Select(IncidentPage.IsPsIncId);
			select.selectByVisibleText("NON");

		}
		catch (NoSuchElementException e) {
			Common.Exporter_visibilité("ISPS est invisible");
		}
	}
	public static void  Choisir_source() throws Throwable {
		try {
			IncidentPage.SourceIncId.isDisplayed();
			Common.Exporter_visibilité("la source est visible");
			Select select = new Select(IncidentPage.SourceIncId);
			select.selectByVisibleText("SOURCE INCIDENT AUTO");

		}
		catch (NoSuchElementException e) {
			Common.Exporter_visibilité("la source est invisible");
		}
	}
	public static void  Actions_immédiates() throws Throwable {
		IncidentPage.ActImmId.sendKeys("Action immédiate");
	}
	public static void  Valider_fiche(WebDriver driver) throws Throwable {
		Actions action = new Actions(driver);
		action.moveToElement(IncidentPage.VldFichIncId).perform();

		JavascriptExecutor  executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click()", IncidentPage.VldFichIncId);

		
		Thread.sleep(500);
	}
	public static void Rattacher_conformité_réglementaire(WebDriver driver) throws Throwable {
		Actions action = new Actions(driver);
		action.moveToElement(IncidentPage.SPConfRegId).perform();
		IncidentPage.SPConfRegId.click();
		Thread.sleep(500);
		IncidentPage.RattConfId.click();
		Thread.sleep(200);
		IncidentPage.RechConfId.sendKeys("7");
		IncidentPage.GridConfId.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_Gd_conf\"]/tbody/tr/td[1]")).findElement(By.tagName("input")).click();
		IncidentPage.VldConfId.click();
	}
	public static void Rattacher_aspect(WebDriver driver) throws Throwable {
		Actions action = new Actions(driver);
		action.moveToElement(IncidentPage.SPAspectId).perform();
		IncidentPage.SPAspectId.click();
		Thread.sleep(500);
		IncidentPage.RattAspId.click();
		Thread.sleep(200);
		IncidentPage.RechAspId.sendKeys("10");
		IncidentPage.GridAspId.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_GridView2\"]/tbody/tr/td[1]")).findElement(By.tagName("input")).click();
		IncidentPage.VldAspId.click();
	}
	public static void Rattacher_situation_urgence(WebDriver driver) throws Throwable {
		Actions action = new Actions(driver);
		action.moveToElement(IncidentPage.SPSituUrgId).perform();
		IncidentPage.SPSituUrgId.click();
		Thread.sleep(500);
		IncidentPage.RattSitUrgId.click();
		Thread.sleep(200);
		IncidentPage.RechSitUrgId.sendKeys("12");
		IncidentPage.GridSitUrgId.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_GridView5\"]/tbody/tr/td[1]")).findElement(By.tagName("input")).click();
		IncidentPage.VldSitUrgId.click();
	}
	public static void  rattacher_règle_sécurité() throws Throwable { 
		
	}
	public static void  rattacher_pièce_jointe() throws Throwable {
		
	}
	public static void  rattacher_personne_informer() throws Throwable {
		
	}
	public static void  rattacher_action() throws Throwable 
	{
		
	}
	
	public static void consulter_agenda(WebDriver driver) throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver,3000);
        wait.until(ExpectedConditions.visibilityOf(IncidentPage.AgdEnvId));

	   IncidentPage.AgdEnvId.click();
	   Thread.sleep(3000);
	}

	
	public static void consulter_Incident_à_valider(String num,WebDriver driver) throws Throwable {
	   //IncidentPage.SPIncAVldId.click();
		//addd by rahma
		JavascriptExecutor  executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click()", IncidentPage.SPIncAVldId);

	   Thread.sleep(500);
	   IncidentPage.RechIncAVldId.sendKeys(num);
	   Thread.sleep(500);
	   IncidentPage.GridIncAVldId.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_GridView1\"]/tbody/tr/td[1]")).findElement(By.tagName("a")).click();

	}
	
	public static void consulter_Incident_à_corriger(String num) throws Throwable {
		   IncidentPage.SPIncACorrId.click();
		   Thread.sleep(500);
		   IncidentPage.RechIncACorrId.sendKeys(num);
		   Thread.sleep(500);
		   IncidentPage.GridIncACorrId.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_GridView2\"]/tbody/tr/td[1]")).findElement(By.tagName("a")).click();

		}
	
	public static void consulter_Incident_à_décider(String num,WebDriver driver) throws Throwable {
		   //IncidentPage.SPIncADecId.click();
		Thread.sleep(1500);
		   JavascriptExecutor js =(JavascriptExecutor)driver;
		   js.executeScript("arguments[0].click()", IncidentPage.SPIncADecId);
		   Thread.sleep(500);
		   IncidentPage.RechIncADecId.sendKeys(num);
		   Thread.sleep(500);
		   IncidentPage.GridIncADecId.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_listeNC\"]/tbody/tr/td[1]")).findElement(By.tagName("a")).click();

		}

	
  	  public static void decisionDeValidation(String deci, String Path,int row) throws Throwable
  	  {
  		if(deci.equals("Refus"))
  		{
  			IncidentPage.CommVldIncId.sendKeys("Refus");
  			IncidentPage.RefusIncId.click();
  		
  		}else if(deci.equals("Correction")) {
  			IncidentPage.CommVldIncId.sendKeys("Correction");
  			IncidentPage.CorrIncId.click();
  			
  		
  		}else if(deci.equals("Validation")) 
  		{
  			 ExcelUtils.setExcelFile(Path, "IncidentEnv");
  			 Select select = new Select(IncidentPage.ChxDecideurId);
    	  	 select.selectByVisibleText(ExcelUtils.getCellData(row,5));
  			IncidentPage.CommVldIncId.sendKeys("OK");
  			IncidentPage.ValidationIncId.click();
  		}	
  	  }

	public static void vérifier_que_l_état_de_la_fiche_incident_suit(String arg1, WebDriver driver) throws Throwable {
		WebElement etat= driver.findElement(By.id("ctl00_ContentPlaceHolder1_Label_Etat"));
		if(arg1.equals("Refus"))
		{
 			System.out.println("Fiche Incident refusé par le responsable validation");
 			assertTrue(etat.getText().contains("Refusée")||etat.getText().contains("Refused"));
		
		}else if(arg1.equals("Correction")) {
			System.out.println("Fiche Incident envoyé pour correction par le responsable validation");
			assertTrue(etat.getText().contains("En attente de correction")||etat.getText().contains("Waiting for correction"));
	
		}else if(arg1.equals("Validation")) {
			System.out.println("Fiche incident validé par le responsable validation");
			assertTrue(etat.getText().contains("En attente de décision")||etat.getText().contains("Waiting for decision"));
		}else if(arg1.equals("Corrige")) {
			System.out.println("Fiche incident corrige par le déclencheur ");
			assertTrue(etat.getText().contains("En attente de validation")||etat.getText().contains("Waiting for approval"));
	
		}else if(arg1.equals("Pass. resp. Trait."))
		{
			System.out.println("Décision de Traitement est prise");
			assertTrue(etat.getText().contains("En attente de traitement")||etat.getText().contains("Waiting for disposition"));
			
		}
		else if(arg1.equals("Pass. resp. Clot."))
		{
			System.out.println("Décision de Traitement est prise");
			assertTrue(etat.getText().contains("En attente de clôture")||etat.getText().contains("Waiting for closure"));
			
		}else if(arg1.equals("Cloturée"))
		{
			System.out.println("Fiche incident cloturée");
			assertTrue(etat.getText().contains("Clôturée")||etat.getText().contains("Closed"));
			
		}
	}
	
	
	public static void choisir_responsable_traitement(String Resp) throws Throwable {
	    IncidentPage.SelectRespTraitId.click();
	    Thread.sleep(200);
	    IncidentPage.RechRespTraitId.sendKeys(Resp);
	    Thread.sleep(200);
	    IncidentPage.VldRechRespTraitId.click();
	    Thread.sleep(200);
	    IncidentPage.GridRespTraitId.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_G5\"]/tbody/tr[2]/td[1]")).findElement(By.tagName("a")).click();
	    Thread.sleep(200);
	}

	public static void choisir_responsable_clôture(WebDriver driver, String RespClot) throws Throwable {
	    //driver.findElement(By.id("sp_decision")).click();
	    Select select = new Select(IncidentPage.RespClotId);
	  	select.selectByVisibleText(RespClot);
	    
	}

	
	public static void choisir_délai_de_traitement(WebDriver driver) throws Throwable {
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
			c.add(Calendar.DATE,2);
			dt = c.getTime();
			String Sdate = dateFormat.format(dt);
			JavascriptExecutor jse = (JavascriptExecutor)driver;
			jse.executeScript("arguments[1].value = arguments[0];",Sdate, IncidentPage.DelaiTraitId);
	}


	public static void saisir_cause_incident() throws Throwable {
			IncidentPage.CauseDecIncId.sendKeys("Cause Traitement incident");
	}

	
	public static void saisir_traitement_incident() throws Throwable {
	    IncidentPage.TraitDecIncId.sendKeys("Traitement décision incident");
	}

	public static void choisir_type_décision(WebDriver driver) throws Throwable {
		try 
		{
			IncidentPage.AccDecId.isDisplayed();
			Common.Exporter_visibilité("les type de décision accident est visible");
			JavascriptExecutor  executor = (JavascriptExecutor)driver;
			executor.executeScript("arguments[0].click()", IncidentPage.AccDecId);

		}catch (NoSuchElementException e) {
			Common.Exporter_visibilité("les type de décision accident est invisible");
		}
		
		try 
		{
			IncidentPage.NCADecId.isDisplayed();
			Common.Exporter_visibilité("les type de décision NC est visible");
			JavascriptExecutor  executor = (JavascriptExecutor)driver;
			executor.executeScript("arguments[0].click()", IncidentPage.NCADecId);	
		}catch (NoSuchElementException e) {
			Common.Exporter_visibilité("les type de décision NC est invisible");
		}
	 
	}

	public static void valider_décision(WebDriver driver) throws Throwable {
		Thread.sleep(500);
		JavascriptExecutor  executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click()",  IncidentPage.VldDecId);	
	}
	

	public static void consulter_traitement_des_incidents(String num,WebDriver driver) throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver,120);
        wait.until(ExpectedConditions.visibilityOf(IncidentPage.SpIncATraitId));

		   IncidentPage.SpIncATraitId.click();
		   Thread.sleep(500);
		   IncidentPage.RechIncATraitId.sendKeys(num);
		   IncidentPage.GridIncATraitId.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_GridView5\"]/tbody/tr/td[1]")).findElement(By.tagName("a")).click();
	}

	public static void cocher_incident_traité() throws Throwable {
		IncidentPage.EtatIncATraitId.click();
		Thread.sleep(200);
		
	}

	public static void saisir_cout(WebDriver driver) throws Throwable {
		//driver.findElement(By.id("sp_trait")).click();
		try 
		{
			IncidentPage.CoutTraitIncId.isDisplayed();
			Common.Exporter_visibilité("le cout de traitement est visible");
			IncidentPage.CoutTraitIncId.sendKeys("1000");
		}catch (NoSuchElementException e) {
			Common.Exporter_visibilité("le cout de traitement est invisible");
		}
	}


	public static void saisir_rapport_traitement(WebDriver driver) throws Throwable {
		//added by rahma
		WebDriverWait wait = new WebDriverWait(driver,60);
        wait.until(ExpectedConditions.visibilityOf(IncidentPage.RapTraitIncId));

		IncidentPage.RapTraitIncId.sendKeys("Rapport traitement");
	}
	
	public static void valider_le_traitement(WebDriver driver) throws Throwable {
		//IncidentPage.VldTraitIncId.click();
		//added by rahma
		Thread.sleep(100);
		
		if(IncidentPage.VldTraitIncId.isDisplayed())
		{
			IncidentPage.VldTraitIncId.click();
		}
		else 
		{
		JavascriptExecutor  executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click()", IncidentPage.VldTraitIncId);
		}

	}
	
	public static void consulter_incidents_a_cloturer(String num ) throws Throwable {
		   IncidentPage.SpIncAClotId.click();
		   Thread.sleep(500);
		   IncidentPage.RechIncAClotId.sendKeys(num);
		   IncidentPage.GridIncAClotId.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_GridView6\"]/tbody/tr/td[1]")).findElement(By.tagName("a")).click();
	}

	public static void cocher_incident_cloturé() throws Throwable {
		IncidentPage.EtatIncAClotId.click();
		Thread.sleep(200);
		
	}


	public static void saisir_rapport_cloture(WebDriver driver) throws Throwable {
		//driver.findElement(By.id("sp_clot")).click();
		//Thread.sleep(200);
		//added by rahma
		WebDriverWait wait = new WebDriverWait(driver,60);
		WebElement element = wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.id("ctl00_ContentPlaceHolder1_Txt_RAP_CLOT")));
		element.sendKeys("Rapport cloture");
	}
	
	public static void valider_le_cloture() throws Throwable {
		
		IncidentPage.VldClotIncId.click();
	}

	
}
