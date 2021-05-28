package com.qualiprobdd.e2etests.GRH.Models;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.qualiprobdd.e2etests.Client.Page.SatisfClientPage;
import com.qualiprobdd.e2etests.Fournisseur.pages.EvalFourPage;
import com.qualiprobdd.e2etests.GRH.Pages.SatisPersonnelPage;
import com.qualiprobdd.e2etests.util.Common;
import com.qualiprobdd.e2etests.util.ExcelUtils;


public class SatisPersonnelModel {
	
	
	public static void Choisir_quest_enquete_personnel(String titre) throws Throwable
	{
		Select select = new Select(SatisPersonnelPage.SelectQuestPersonnelId);
		select.selectByVisibleText(titre);
	}
	
	public static void choisir_type_enquete(String mode, WebDriver driver) throws Throwable
	{
		Cookie cookie1 = driver.manage().getCookieNamed("lan");
		if(cookie1.getValue().equals("en-US")) 
		{
			if(mode.equals("ANONYME")) 
			{
				Select select = new Select(SatisPersonnelPage.TypeEnqueteId);
				select.selectByVisibleText("Confidential");
			}else 
			{
				Select select = new Select(SatisPersonnelPage.TypeEnqueteId);
				select.selectByVisibleText("Non-confidential");
			}
		
		}else 
		{
			if(mode.equals("ANONYME")) 
			{
			Select select = new Select(SatisPersonnelPage.TypeEnqueteId);
			select.selectByVisibleText("Confidentielle");
			}else 
			{
				Select select = new Select(SatisPersonnelPage.TypeEnqueteId);
				select.selectByVisibleText("Non confidentielle");
			}
			
		}
	}
	
	public static void choisir_site(WebDriver driver) throws Throwable
	{
try {
			
	SatisPersonnelPage.SiteId.isDisplayed();
			Common.Exporter_visibilité("le site est visible");
			String text=driver.findElement(By.id("ctl00_ContentPlaceHolder1_lbsite")).getText();
			if(text.indexOf('*')!=-1) 
			{
				Common.Exporter_visibilité("le site est obligatoire");
			}else 
			{
				Common.Exporter_visibilité("le site n'est pas obligatoire");
				
			}
			Select select = new Select(SatisPersonnelPage.SiteId);
			select.selectByVisibleText("SITE AUTO");
			}
			catch (NoSuchElementException e) {
				Common.Exporter_visibilité("le site est invisible");
			}
	}
	
	public static void choisir_processus(WebDriver driver) throws Throwable
	{
		try {
			SatisPersonnelPage.ProcessusId.isDisplayed();
			Common.Exporter_visibilité("le processus est visible");
			String text=driver.findElement(By.id("ctl00_ContentPlaceHolder1_LblProcessus_")).getText();
		if(text.indexOf('*')!=-1) 
		{
			Common.Exporter_visibilité("le processus est obligatoire");
		}else 
		{
			Common.Exporter_visibilité("le processus n'est pas obligatoire");
			
		}
		Select select = new Select(SatisPersonnelPage.ProcessusId);
		select.selectByVisibleText("PROCESSUS AUTO");
		}
		catch (NoSuchElementException e) {
			Common.Exporter_visibilité("le processus est invisible");
		}
	}
	
	public static void choisir_activité(WebDriver driver) throws Throwable
	{
		try {
				SatisPersonnelPage.ActiviteId.isDisplayed();
				Common.Exporter_visibilité("l'activité est visible");
				String text=driver.findElement(By.id("ctl00_ContentPlaceHolder1_LblDomaine_")).getText();
			if(text.indexOf('*')!=-1) 
			{
				Common.Exporter_visibilité("l'activité est obligatoire");
			}else 
			{
				Common.Exporter_visibilité("l'activité n'est pas obligatoire");
				
			}
			Select select = new Select(SatisPersonnelPage.ActiviteId);
			select.selectByVisibleText("ACTIVITE AUTO");
			}
			catch (NoSuchElementException e) {
				Common.Exporter_visibilité("l'activité est invisible");
			}
		
	}
	
	public static void choisir_direction(WebDriver driver) throws Throwable
	{
		try {
			SatisPersonnelPage.DirectionId.isDisplayed();
				Common.Exporter_visibilité("la direction est visible");
				String text=driver.findElement(By.id("ctl00_ContentPlaceHolder1_LabelDirPilot")).getText();
			if(text.indexOf('*')!=-1) 
			{
				Common.Exporter_visibilité("la direction est obligatoire");
			}else 
			{
				Common.Exporter_visibilité("la direction n'est pas obligatoire");
				
			}
			Select select = new Select(SatisPersonnelPage.DirectionId);
			select.selectByVisibleText("DIRECTION AUTO");
			}
			catch (NoSuchElementException e) {
				Common.Exporter_visibilité("la direction est invisible");
			}
	}
	
	public static void choisir_service(WebDriver driver) throws Throwable
	{

		try {
			SatisPersonnelPage.ServiceId.isDisplayed();
			Common.Exporter_visibilité("le service est visible");
			String text=driver.findElement(By.id("ctl00_ContentPlaceHolder1_LblService_")).getText();
			if(text.indexOf('*')!=-1) 
			{
				Common.Exporter_visibilité("le service est obligatoire");
			}else 
			{
				Common.Exporter_visibilité("le service n'est pas obligatoire");
			}
			Select select = new Select(SatisPersonnelPage.ServiceId);
			select.selectByVisibleText("SERVICE AUTO");
			}
			catch (NoSuchElementException e) {
				Common.Exporter_visibilité("le service est invisible");
			}
	}
	public static void valider_enquete() throws Throwable
	{
		SatisPersonnelPage.VldEnqueteId.click();
	}
	public static void ajouter_coef_quest_jauge(String Path1, WebDriver driver, int row) throws Throwable
	{
		
		ExcelUtils.setExcelFile(Path1,"enquetePersonnel");
		WebElement cellIneed;
		Actions action = new Actions(driver);
		action.moveToElement(SatisfClientPage.GridQuestJaugeId).perform();
		Thread.sleep(500);
		List<WebElement> allRows=SatisfClientPage.GridQuestJaugeId.findElements(By.tagName("tr"));
		int i=1;
		if(allRows.size()==2) {
			String coef=ExcelUtils.getCellData(row,2);
			cellIneed = SatisfClientPage.GridQuestJaugeId.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_GridView_sastis\"]/tbody/tr/td[2]"));
			cellIneed.findElement(By.tagName("input")).sendKeys(coef);
		}
		
		else {
			while(i<allRows.size()) 
			{
				int j=row+i-1;
				int k=i+1;
				String coef=ExcelUtils.getCellData(j,2);
				cellIneed = SatisfClientPage.GridQuestJaugeId.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_GridView_sastis\"]/tbody/tr["+k+"]/td[2]"));
				cellIneed.findElement(By.tagName("input")).sendKeys(coef);
				i++;
			}
		}
		driver.findElement(By.id("ctl00_ContentPlaceHolder1_LinkButton14")).click();
		
	}
	
	public static void rattacher_personnel(String Path1, WebDriver driver, int row) throws Throwable
	{
		ExcelUtils.setExcelFile(Path1,"EnquetePersonnel");
		String personnel;
		int i=0;
		do {
		personnel=ExcelUtils.getCellData(row+i,3);
		if(!(personnel.equals(""))) {
		SatisPersonnelPage.RattEmpId.click();
		Thread.sleep(500);
		SatisPersonnelPage.RechEmpId.clear();
		SatisPersonnelPage.RechEmpId.sendKeys(personnel);
		SatisPersonnelPage.GridEmpId.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_GridView_EmployeRat\"]/tbody/tr/td[1]")).findElement(By.tagName("input")).click();
		SatisPersonnelPage.VldEmpId.click();
		i++;
		}
		}while(!(personnel.equals("")));
	
		i=0;
		do {
		personnel=ExcelUtils.getCellData(row+i,4);
		if(!(personnel.equals(""))) {
		SatisPersonnelPage.RattGroupEmpId.click();
		Thread.sleep(500);
		SatisPersonnelPage.RechGroupEmpId.clear();
		SatisPersonnelPage.RechGroupEmpId.sendKeys(personnel);
		SatisPersonnelPage.GridGroupEmpId.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_GridView_Groupe\"]/tbody/tr/td[1]")).findElement(By.tagName("input")).click();
		SatisPersonnelPage.VldGroupEmpId.click();
		i++;
		}
		}while(!(personnel.equals("")));
		
	
	}
	
	public static void rattacher_personne_habilités_à_enregistrer_réponse(String Path1, WebDriver driver, int row) throws Throwable
	{
		ExcelUtils.setExcelFile(Path1,"EnquetePersonnel");
		String personnel;
		int i=0;
		do {
		personnel=ExcelUtils.getCellData(row+i,5);
		if(!(personnel.equals(""))) {
		SatisPersonnelPage.AjtPersHabilId.click();
		Thread.sleep(500);
		SatisPersonnelPage.RechPersHabiId.clear();
		SatisPersonnelPage.RechPersHabiId.sendKeys(personnel);
		SatisPersonnelPage.GridPersHabilitId.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_GridView_HabiliteRat\"]/tbody/tr/td[1]")).findElement(By.tagName("input")).click();
		SatisPersonnelPage.VldPersHabilitId.click();
		i++;
		}
		}while(!(personnel.equals("")));
	}
	
	public static void consulter_agenda_RH() throws Throwable
	{
		SatisPersonnelPage.AgendaRHId.click();
		Thread.sleep(500);
	}
	
	public static void consulter_enquête_à_répondre(String ref) throws Throwable
	{
		SatisPersonnelPage.SPAGDENQSATId.click();
		Thread.sleep(500);
		SatisPersonnelPage.AgdRechEnqId.sendKeys(ref);
		Thread.sleep(500);
		SatisPersonnelPage.AgdGridEnqId.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_GridView_Enquete\"]/tbody/tr/td[1]")).findElement(By.tagName("a")).click();
		Thread.sleep(500);
	}
	
	public static void consulter_enquête_à_enregistrer_réponse(String ref) throws Throwable
	{
		SatisPersonnelPage.SpEnqSatENregId.click();
		Thread.sleep(500);
		SatisPersonnelPage.AgdRechEnqEnregId.sendKeys(ref);
		Thread.sleep(500);
		SatisPersonnelPage.AgdGridEnqEnrgiId.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_GridView_EnregEnq\"]/tbody/tr/td[1]")).findElement(By.tagName("a")).click();
		Thread.sleep(500);
	}
	
	
	
	
}
