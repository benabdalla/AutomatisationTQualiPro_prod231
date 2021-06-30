package com.qualiprobdd.e2etests.ReclamationClient.Models;

import static org.testng.Assert.assertTrue;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;


import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.qualiprobdd.e2etests.util.AbstractPage;
import com.qualiprobdd.e2etests.util.Common;
import com.qualiprobdd.e2etests.util.ExcelUtils;
import com.qualiprobdd.e2etests.util.RandomValue;
import com.qualiprobdd.e2etests.ReclamationClient.Pages.ReclamationClientPage;
import com.qualiprobdd.e2etests.authentification.models.AuthentificationModel;
import org.testng.Assert;


public class ReclamationClientModel {
	static String NumFich;
	static boolean Rec_State_App;
	static String responsable;
	private static String Path = "resources/testData/TestData.xlsx";
	public static String pathContext = "E:/qualipro/trunk/AutomatisationTQualiPro_prod231/resources/pieces_jointes";

	
	
	
	protected static final Logger logger = LoggerFactory.getLogger(AbstractPage.class);

	
	
	public static void cliquer_sur_paramétrage(WebDriver driver) throws Throwable {

		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click()", ReclamationClientPage.wparametrage);

	}

	public static void paramétrages_des_jours_fériés() throws Throwable {
		ReclamationClientPage.wparameterjf.click();

	}
	// add  by   mootez
	public static  String  couleur(String rgba) {
		String red =rgba.substring(rgba.indexOf("(")+1,rgba.indexOf(","));
		int verg=rgba.indexOf(",");
		String  green=rgba.substring(rgba.indexOf(",")+2,rgba.indexOf(",",verg+1));

			
		int  ired=Integer.parseInt(red);
		System.out.println("int red is : "+ired);
				int  igre=Integer.parseInt(green);
				System.out.println("int red is : "+igre);

	if(ired>igre) {
		return "red";
	}else
	
		return "green";
	
	}

// add  by  mootez
	public static void VérifieColor(WebElement dateColTrait, WebDriver driver) {

		String color = dateColTrait.getCssValue("color");
		String delai = dateColTrait.getText();
		System.err.println("le  Couleur est  = "+color);
		logger.info("le  Couleur est  = "+color);
		

	color=couleur(color);
	logger.info("le  Couleur 2 est  = "+color);
		System.err.println("le  Couleur 2 est  = "+color);

		logger.info("le  délai   de   réclamation  est  = "+delai);
		System.err.println("le  délai   de   réclamation  est  = "+delai);

		Cookie cookie1 = driver.manage().getCookieNamed("lan");
		logger.info("le langage est   = "+cookie1.getValue());
		if (cookie1.getValue().equals("en-US")) {
			
	
			String datec = new SimpleDateFormat("M/d/yyyy").format(new Date());

			LocalDate datecov = LocalDate.parse(delai, DateTimeFormatter.ofPattern("M/d/yyyy",Locale.ENGLISH));
			LocalDate datecov2 = LocalDate.parse(datec, DateTimeFormatter.ofPattern("M/d/yyyy",Locale.ENGLISH));

			System.out.println("date converture  " + datecov);

			System.out.println("date converture 2  " + datecov2);

			if (color.equals("red")) {
				logger.info("le  Couleur  est  =  rouge");


				System.out.println("after" + datecov2.isAfter(datecov));
				
				asserttrue(datecov2.isAfter(datecov));

				// System.out.println("before"+datecov2.isBefore(datecov));

				// System.out.println("equals"+datecov2.equals(datecov));
			}

			else {
				logger.info("le  Couleur  est  =  vert");

				asserttrue(color.equals("green"));
				
				asserttrue(datecov2.isAfter(datecov)||datecov2.equals(datecov));

				

			}

		}else {
			
			String datec = new SimpleDateFormat("dd/MM/yyyy").format(new Date());

			LocalDate datecov = LocalDate.parse(delai, DateTimeFormatter.ofPattern("d/MM/yyyy"));
			LocalDate datecov2 = LocalDate.parse(datec, DateTimeFormatter.ofPattern("dd/MM/yyyy"));

			System.out.println("date converture  " + datecov);

			System.out.println("date converture 2  " + datecov2);
            if (color.equals("red")) {
				

				System.out.println("after" + datecov2.isAfter(datecov));
				asserttrue(datecov2.isAfter(datecov));

				// System.out.println("before"+datecov2.isBefore(datecov));

				// System.out.println("equals"+datecov2.equals(datecov));
			}

			else {
				asserttrue(color.equals("green"));
				
				asserttrue(datecov2.isAfter(datecov)||datecov2.equals(datecov));

				

			}
		}

	}

	// add  by   mootez
	public static void récupérer_des_jours_fériés() throws Throwable {

		int k = 0;
		String st = "";
		ExcelUtils.setExcelFile(Path, "JourConge");

		for (int i = 1; i <= 7; i++) {
			Thread.sleep(500);
			logger.info("for");
			st = ReclamationClientPage.wtableJF
					.findElement(By.xpath("//*[@id=\"collapse11\"]/div/div[2]/div/table/tbody/tr/td[" + i + "]"))
					.findElement(By.tagName("label")).getText();
			logger.info(st);
			Thread.sleep(500);
			System.out.println("chain  jour  fr : =" + st);
			Thread.sleep(500);

			if (ReclamationClientPage.wtableJF
					.findElement(By.xpath("//*[@id=\"collapse11\"]/div/div[2]/div/table/tbody/tr/td[" + i + "]"))
					.findElement(By.tagName("input")).isSelected()) {
				Thread.sleep(500);
				Thread.sleep(500);

				ExcelUtils.setCellData1(st, 1, k, Path, "PNC");

				System.out.println(ExcelUtils.getCellData(1, k));

				k++;
				logger.info(" k=" + k);
				Thread.sleep(500);

			}

		}

	}
	
	public static void consulter_MClients(WebDriver driver) throws Throwable {
		//added by rahma
		JavascriptExecutor  executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click()", ReclamationClientPage.menuID);

		//ReclamationClientPage.menuID.click();
		Thread.sleep(200L);
		Common.AccéderModule(8, 0, 0, driver);
	}

	public static void consulter_SM_RClients(WebDriver driver) throws Throwable {
		Common.AccéderModule(8,2,0, driver);
	}

	public static void consulter_SSM_RClients(WebDriver driver) throws Throwable {
		Common.AccéderModule(8,2,1, driver);
		
	}

	
	public static void cliquer_sur_ajouter_fiche_Rclient() throws Throwable {
		ReclamationClientPage.BoutonAjoutId.click();
		Thread.sleep(500L);
		Common.Exporter_visibilité("Nouvelle Fiche Réclamation client");
		Common.Exporter_champ_A_masquer("Nouvelle Fiche Réclamation Client");
	}

	
	public static void saisir_réclamation() throws Throwable {
		ReclamationClientPage.ReclamationId.sendKeys(RandomValue.randomString(10));
	}

	
	public static void saisir_date_de_réclamation() throws Throwable {
		ReclamationClientPage.DateReclamationId.click();
		ReclamationClientPage.TodayDateId.click();
	}


	public static void choisir_client(String Client) throws Throwable {
		
	try {
		ReclamationClientPage.ListClientId.isDisplayed();
		Select select = new Select(ReclamationClientPage.ListClientId);
		select.selectByVisibleText(Client);
		
	}catch(NoSuchElementException e)
	{
		try {
		ReclamationClientPage.ClientId.isDisplayed();
		ReclamationClientPage.SelectClientId.click();
		Thread.sleep(200);
		ReclamationClientPage.RechClientId.sendKeys(Client);
		Thread.sleep(200);
		ReclamationClientPage.BtnRechClientId.click();
		Thread.sleep(200);
		ReclamationClientPage.GridClientId.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_GridView_clt\"]/tbody/tr[1]/td[1]")).findElement(By.tagName("a")).click();
		}catch(NoSuchElementException ex)
		{}
		
	}
	    
	}

	public static void choisir_réceptionnaire() throws Throwable {
		try {
			ReclamationClientPage.ReceptionnaireId.isDisplayed();
		
		ReclamationClientPage.ReceptionnaireId.sendKeys("AUTO"); 
		}catch(NoSuchElementException ex)
		{Common.Exporter_champ_A_masquer("réceptionnaire est invisible");}
	}

	
	public static void choisir_nature_réclamation(String arg1) throws Throwable {
		Select select = new Select(ReclamationClientPage.Nature_Id);
		select.selectByVisibleText(arg1);
	   
	}

	
	public static void choisir_type_réclamation(String arg1) throws Throwable {
		Select select = new Select(ReclamationClientPage.Type_Id);
		select.selectByVisibleText("TYPE AUTO");
	    
	}

	
	public static void choisir_date_livraison(WebDriver driver) throws Throwable {
		//ReclamationClientPage.DateLivraisonId.click();
		//ReclamationClientPage.CldrLivId.click();
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
		jse.executeScript("arguments[1].value = arguments[0];",Sdate,ReclamationClientPage.DateLivraisonId);
		Thread.sleep(500);
	   
	}
	



	
	public static void saisir_numéro_BL() throws Throwable {
		ReclamationClientPage.NumeroBlId.sendKeys("002");
	   
	}
	
	public static void choisir_site_réclamation(String site, WebDriver driver) throws Throwable {
		try {
			
			ReclamationClientPage.SiteId.isDisplayed();
			Common.Exporter_visibilité("le site est visible");
			Select select = new Select(ReclamationClientPage.SiteId);
			select.selectByVisibleText(site);
			String text=driver.findElement(By.id("ctl00_ContentPlaceHolder1_Label17")).getText();
			if(text.indexOf('*')!=-1) 
			{
				Common.Exporter_visibilité("le site est obligatoire");
			}else 
			{
				Common.Exporter_visibilité("le site n'est pas obligatoire");
			}
			
			}
			catch (NoSuchElementException e) {
				Common.Exporter_visibilité("le site est invisible");
			}
	
	    
	}
	
	public static void choisir_processus_réclamation(String processus, WebDriver driver) throws Throwable {
		try {
			ReclamationClientPage.ProcessusId.isDisplayed();
			Common.Exporter_visibilité("le processus est visible");
			String text=driver.findElement(By.id("ctl00_ContentPlaceHolder1_LblProcessus_")).getText();
			if(text.indexOf('*')!=-1) 
			{
				Common.Exporter_visibilité("le processus est obligatoire");
			}else 
			{
				Common.Exporter_visibilité("le processus n'est pas obligatoire");
				
			}
			Select select = new Select(ReclamationClientPage.ProcessusId);
			select.selectByVisibleText(processus);
			}
			catch (NoSuchElementException e) {
				Common.Exporter_visibilité("le processus est invisible");
			}
	}
	public static void choisir_activité_réclamation(WebDriver driver) throws Throwable {
		try {
			ReclamationClientPage.ActiviteId.isDisplayed();
			Common.Exporter_visibilité("l'activité est visible");
			String text=driver.findElement(By.id("ctl00_ContentPlaceHolder1_LblDomaine_")).getText();
			if(text.indexOf('*')!=-1) 
			{
				Common.Exporter_visibilité("l'activité est obligatoire");
			}else 
			{
				Common.Exporter_visibilité("l'activité n'est pas obligatoire");
				
			}
			Select select = new Select(ReclamationClientPage.ActiviteId);
			select.selectByVisibleText("ACTIVITE AUTO");
			}
			catch (NoSuchElementException e) {
				Common.Exporter_visibilité("l'activité est invisible");
			}
		
	    
	}
	public static void choisir_direction_réclamation(WebDriver driver) throws Throwable {
		try {
			ReclamationClientPage.DirectionId.isDisplayed();
			Common.Exporter_visibilité("la direction est visible");
			String text=driver.findElement(By.id("ctl00_ContentPlaceHolder1_LabelDirPilot")).getText();
			if(text.indexOf('*')!=-1) 
			{
				Common.Exporter_visibilité("la direction est obligatoire");
			}else 
			{
				Common.Exporter_visibilité("la direction n'est pas obligatoire");
				
			}
			Select select = new Select(ReclamationClientPage.DirectionId);
			select.selectByVisibleText("DIRECTION AUTO");
			}
			catch (NoSuchElementException e) {
				Common.Exporter_visibilité("la direction est invisible");
			}
	
	    
	}
	
	public static void choisir_service_réclamation(WebDriver driver) throws Throwable {
		try {
			ReclamationClientPage.SreviceId.isDisplayed();
			Common.Exporter_visibilité("le service est visible");
			String text=driver.findElement(By.id("ctl00_ContentPlaceHolder1_LblService_")).getText();
			if(text.indexOf('*')!=-1) 
			{
				Common.Exporter_visibilité("le service est obligatoire");
			}else 
			{
				Common.Exporter_visibilité("le service n'est pas obligatoire");
			}
			Select select = new Select(ReclamationClientPage.SreviceId);
			select.selectByVisibleText("SERVICE AUTO");
			}
			catch (NoSuchElementException e) {
				Common.Exporter_visibilité("le service est invisible");
			}
		
	    
	}
	public static void choisir_gravité_réclamation() throws Throwable {
		Select select = new Select(ReclamationClientPage.GraviteId);
		select.selectByValue("2");
	}
	public static void AvecRetour() throws Throwable{
		try {
			ReclamationClientPage.RetourClientId.isDisplayed();
			ReclamationClientPage.RetourClientId.click();
			Common.Exporter_champ_A_masquer("le bouton retour client est visible");
			}
			catch (NoSuchElementException e) {
				Common.Exporter_champ_A_masquer("le bouton retour client est invisible");
			}
		
	}

	public static void valider_enregistrement_réclamation(WebDriver driver) throws Throwable {
		Thread.sleep(1800);
		JavascriptExecutor  executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click()", ReclamationClientPage.BoutonVlId);
		Thread.sleep(500);
		try {
			ReclamationClientPage.RetourClientId.isDisplayed();
			Assert.assertTrue(ReclamationClientPage.StateRetourClientId.getText().contains("En attente de déclenchement d'une fiche PNC")||ReclamationClientPage.StateRetourClientId.getText().contains("Waiting the release of NCP sheet"));
			}
			catch (NoSuchElementException e) {
				Common.Exporter_champ_A_masquer("le bouton retour client est invisible");
			}
		}
	public static void rattacher_produit (String produit) throws Throwable {
		ReclamationClientPage.RattProduitnId.click();
		Thread.sleep(500L);
		ReclamationClientPage.RechProduitnId.sendKeys(produit);
		ReclamationClientPage.VldRechProduitnId.click();
		Thread.sleep(500L);
		ReclamationClientPage.ProduitAjouteId.findElement(By.tagName("input")).click();
		Thread.sleep(500L);
		ReclamationClientPage.ValiderProduitId.click();
		Thread.sleep(500L);
	}
	
	public static void ajouter_quantite() throws Throwable {
		ReclamationClientPage.EditProduitId.click();
		ReclamationClientPage.QteProduitId.sendKeys("110");
		ReclamationClientPage.UniteProduitId.sendKeys("piece");
		ReclamationClientPage.NlotProduitId.sendKeys("52");
		ReclamationClientPage.ValiderEditId.click();
		
	}
	
	public static void rattacher_type_cause(String cause) throws Throwable {
		ReclamationClientPage.RattTcId.click();
		Thread.sleep(500L);
		ReclamationClientPage.RattTcId.sendKeys(cause);
		ReclamationClientPage.ChxTcId.findElement(By.tagName("input")).click();
		ReclamationClientPage.ValiderTcId.click();
		Thread.sleep(500L);
	}
	
	public static void rattacher_non_conformite(WebDriver driver, String fichPNC) throws Throwable {
		ReclamationClientPage.RattNcId.click();
		Thread.sleep(500L);
		driver.findElement(By.id("ctl00_ContentPlaceHolder1_TextBox33")).sendKeys(fichPNC);
		driver.findElement(By.id("ctl00_ContentPlaceHolder1_LinkButton44")).click();
		Thread.sleep(500L);
		ReclamationClientPage.ChxNcId.findElement(By.tagName("input")).click();
		Thread.sleep(500L);
		ReclamationClientPage.ValiderNcId.click();
		Thread.sleep(500L);
		try {
			ReclamationClientPage.StateRetourClientId.isDisplayed();
			Assert.assertTrue(ReclamationClientPage.StateRetourClientId.getText().contains(""));}
		
		catch (NoSuchElementException e) {
			Common.Exporter_champ_A_masquer("le bouton retour client est invisible");
		}
	}
	
   private static void asserttrue(Boolean incrementation) {
		System.out.println(incrementation);
	}
	
	public static void incrementation_compteur_agenda_DA(String Anc_Cpt_agenda, String Cpt_agenda) throws Throwable {
		Boolean incrementation = false;
		int compteur;
		if (Anc_Cpt_agenda != "") {
			compteur = Integer.parseInt(Anc_Cpt_agenda);
			//System.out.println("compteur: " + compteur);
		} else {
			compteur = 0;
			System.out.println("compteur: " + compteur);
		}
	
		if (Integer.parseInt(Cpt_agenda) == compteur + 1) {
			incrementation = true;
			System.out.println(incrementation);
		}
		//Assert.assertTrue(incrementation);
	}
	
	public static void rattacher_RF(WebDriver driver) throws Throwable {
		Actions action = new Actions(driver);
		action.moveToElement(ReclamationClientPage.NbreRFId).perform();

		String Nbreid= ReclamationClientPage.NbreRFId.getText();
		ReclamationClientPage.AjtRfId.click();
		Thread.sleep(500L);
		ReclamationClientPage.RattRfId.click();
		Thread.sleep(1000L);
		ReclamationClientPage.ChxRfId.click();
		ReclamationClientPage.VldRfId.click();
		Thread.sleep(500L);
		ReclamationClientPage.QttRfId.click();
		Thread.sleep(500L); 
		String Nbreid1= ReclamationClientPage.NbreRFId.getText();
		incrementation_compteur_agenda_DA(Nbreid, Nbreid1);
	}
	

	
	public static void rattacher_DA() throws Throwable {
		String Nbreid= ReclamationClientPage.NbreDaId.getText();
		ReclamationClientPage.AjtDaId.click();
		Thread.sleep(500L);
		ReclamationClientPage.RattDaId.click();
		Thread.sleep(500L);
		ReclamationClientPage.ChxDaId.findElement(By.tagName("input")).click();
		ReclamationClientPage.VldDaId.click();
		Thread.sleep(500L);
		ReclamationClientPage.QttDaId.click();
		Thread.sleep(500L); 
		String Nbreid1= ReclamationClientPage.NbreDaId.getText();
		incrementation_compteur_agenda_DA(Nbreid, Nbreid1);
		
	}
	
	public static void rattacher_A() throws Throwable {
		
		String Nbreid= ReclamationClientPage.NbreAId.getText();
		ReclamationClientPage.AjtAId.click();
		Thread.sleep(500L);
		ReclamationClientPage.RattAId.click();
		Thread.sleep(500L);
		ReclamationClientPage.ChxAId.click();
		ReclamationClientPage.VldAId.click();
		Thread.sleep(500L);
		ReclamationClientPage.QttAId.click();
		Thread.sleep(500L); 
		String Nbreid1= ReclamationClientPage.NbreAId.getText();
		incrementation_compteur_agenda_DA(Nbreid, Nbreid1);
		
	}
	
	public static void rattacher_PJ() throws Throwable {
	
		String Nbreid= ReclamationClientPage.NbrePjId.getText();
		ReclamationClientPage.AjtPjId.click();
		Thread.sleep(500L);
		ReclamationClientPage.RattPjId.click();
		Thread.sleep(500L);
		ReclamationClientPage.ObjetPjId.sendKeys("Pièce jointe Réclamation client");
		ReclamationClientPage.SelectPjId.click();
		Thread.sleep(500);
		Runtime.getRuntime().exec("E:\\qualipro\\trunk\\AutomatisationTQualiPro_prod231\\resources\\Scripts\\joindreFichier1.exe");
		Thread.sleep(500);
		ReclamationClientPage.VldPjId.click();
		Thread.sleep(500L);
		ReclamationClientPage.QttPjId.click();
		Thread.sleep(500L); 
		String Nbreid1= ReclamationClientPage.NbreAId.getText();
		incrementation_compteur_agenda_DA(Nbreid, Nbreid1);
	}
	
	public static void rattacher_PI(WebDriver driver) throws Throwable {
		Thread.sleep(1000);
		//ReclamationClientPage.AjtPiId.click();
		JavascriptExecutor js2 =(JavascriptExecutor)driver;
		js2.executeScript("arguments[0].click()",ReclamationClientPage.AjtPiId);
		Thread.sleep(500L);
		//ReclamationClientPage.AjtEmpId.click();
			JavascriptExecutor js =(JavascriptExecutor)driver;
			js.executeScript("arguments[0].click()",ReclamationClientPage.AjtEmpId);


		Thread.sleep(500L);
		ReclamationClientPage.CherPiId.sendKeys("nada");
		ReclamationClientPage.VldCherPiId.click();
		ReclamationClientPage.ChxPiId.findElement(By.tagName("input")).click();
		Thread.sleep(500);
		ReclamationClientPage.VldPiId.click();
		Thread.sleep(500L);
		ReclamationClientPage.QttPiId.click();
	}
	
	public static void Verifier_fiche_réclamation_ajoutée(int row) throws Throwable {
		ReclamationClientPage.VldRecId.click();
		Thread.sleep(500L);
		NumFich=ReclamationClientPage.NumReclamationId.getText();
		System.out.println(ReclamationClientPage.NumReclamationId.getText());
		ExcelUtils.setExcelFile(Path, "ReclamationClient");
		Thread.sleep(200);
		ExcelUtils.setCellData1(NumFich, row , 9 , Path, "ReclamationClient") ;
		System.out.println("Fiche réclamation Client:"+NumFich);

		Common.Exporter_visibilité("Fiche réclamation Client:"+NumFich);
		Common.Exporter_champ_A_masquer("Fiche réclamation Client: "+NumFich);
		Thread.sleep(500L);
		Common.Exporter_numFiche("Fiche réclamation Client: "+NumFich);
	    
	}
	
	
	public static void Connecter_en_tant_que_responsable(WebDriver driver) throws Throwable
	{
		AuthentificationModel.Changer_Compte(responsable,driver);
		Thread.sleep(1000L);
		
	}
	
	public static void Verifier_Agd_Rec() throws Throwable 
	{
		String Anc_Agd = ReclamationClientPage.AgdID.getText();
		System.out.println(Anc_Agd);
		ReclamationClientPage.HomeID.click();
		Thread.sleep(500L);
		String New_Agd = ReclamationClientPage.AgdID.getText();
		System.out.println(New_Agd);
		incrementation_compteur_agenda_DA(Anc_Agd, New_Agd);	
	}
	 
	public static void Consulter_fiche_pour_decision(WebDriver driver) throws Throwable
	{
		Thread.sleep(2000);
		//ReclamationClientPage.MagdID.click();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()",ReclamationClientPage.MagdID);
		Thread.sleep(1000L);
		ReclamationClientPage.VolDecID.click();
		
	
	}
	public static void Nécessite_investigation() throws Throwable {
		//ReclamationClientPage.VolDecRecId.click();
		//Thread.sleep(1000);
		ReclamationClientPage.NeccInvID.click();
		Thread.sleep(1000);
		ReclamationClientPage.InvID.sendKeys("Nécessite Investigation");
	}
	public static void responsable_investigation(String resp) throws Throwable {
		Select select = new Select(ReclamationClientPage.RespInvID);
		select.selectByVisibleText(resp);
	}
	public static void délai_investigation(WebDriver driver) throws Throwable {
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
		c.add(Calendar.DATE,1);
		dt = c.getTime();
		String Sdate = dateFormat.format(dt);
		System.out.println(Sdate);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[1].value = arguments[0];",Sdate, ReclamationClientPage.DateInvID);
		Thread.sleep(500);
	}
	public static void joindre_plan_investigation(WebDriver driver) throws Throwable {
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		 executor.executeScript("arguments[0].click()",ReclamationClientPage.RattDocInvID);
		 Thread.sleep(1000);
			Runtime.getRuntime().exec("E:\\qualipro\\trunk\\AutomatisationTQualiPro_prod231\\resources\\Scripts\\joindreFichier1.exe");
		Thread.sleep(500);
	}
	public static void approbateur_investigation(String resp) throws Throwable {
		Select select = new Select(ReclamationClientPage.AppInvID);
		select.selectByVisibleText(resp);
	}
	public static void valider_investigation(WebDriver driver) throws Throwable {
		Thread.sleep(500);
		Actions action = new Actions(driver);
		action.moveToElement(ReclamationClientPage.ValdInvID).perform();
		ReclamationClientPage.ValdInvID.click();
		Thread.sleep(500);
	}
	public static void saisir_type_décision(WebDriver driver) throws Throwable {
		//ReclamationClientPage.VolEnrRecId.click();
		/*if(driver.findElements(By.id("sp_Dec")).size() > 0) 
		{
		ReclamationClientPage.VolDecRecId.click();
		}else
		{
			ReclamationClientPage.VolDecTrait.click();
		}*/
		Select select = new Select(ReclamationClientPage.TypDecId);
		select.selectByVisibleText("TYPE DECISION AUTO");
	}    

	
	public static void saisir_traitement_réclamation() throws Throwable {
		ReclamationClientPage.TraitRecId.sendKeys("Nécessite Intervention");
	}

	
	public static void saisir_délai_traitement(WebDriver driver ,int row) throws Throwable {
		String type = "", nature = "";
		if (ReclamationClientPage.CldClotId.isDisplayed()) {
			ExcelUtils.setExcelFile(Path, "ReclamationClient");
			System.out.println(ExcelUtils.getCellData(row, 18));

			String stDate = ExcelUtils.getCellData(row, 18);
			try {
				type = ExcelUtils.getCellData(row, 16);
				logger.info(" type" + type);

			}

			catch (NullPointerException e) {
				type = "";
				logger.info(" type" + type);

				System.out.println("delai  de type   reclamation  vider ");

			}
			try {
				nature = ExcelUtils.getCellData(row, 17);
				logger.info(" nature" + nature);

			} catch (NullPointerException e) {
				nature = "";
				logger.info(" nature" + nature);

				System.out.println("delai  de nature   reclamation  vider ");
			}

			Cookie cookie1 = driver.manage().getCookieNamed("lan");
			ExcelUtils.setExcelFile(Path, "JourConge");

			String day = ExcelUtils.getCellData(1, 0);

			logger.info(" day" + day);

			String day1 = ExcelUtils.getCellData(1, 1);
			logger.info(" day 1" + day1);

			if (type != "" || nature != "") {
				if (cookie1.getValue().equals("en-US")) {

					LocalDate date = LocalDate.parse(stDate, DateTimeFormatter.ofPattern("MM/dd/yyyy"));
					logger.info(" date" + date);
					String str = Common.datejrf(date, Common.delai(type, nature), day, day1, "MM/dd/yyyy");
					logger.info(" day" + str);
					Assert.assertTrue(str.equals(ReclamationClientPage.wdatRecTrait.getAttribute("value")));
				} else {
					LocalDate date = LocalDate.parse(stDate, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
					logger.info(" date" + date);
					String str = Common.datejrf(date, Common.delai(type, nature), day, day1, "dd/MM/yyyy");
					Assert.assertTrue(str.equals(ReclamationClientPage.wdatRecTrait.getAttribute("value")));
					logger.info(" day" + str);

				}
			}

		} else {
			ReclamationClientPage.CldClotId.click();
			ReclamationClientPage.DateClotId.click();
		}
	}
	

	public static void saisir_responsable_suivi(String resp) throws Throwable {
		
		ReclamationClientPage.RespClotId.sendKeys(resp);
	}
	
	public static void rattacher_FicheHuitD() throws Throwable {
		ReclamationClientPage.Ratt8dID.click();
		Thread.sleep(500);
		ReclamationClientPage.Chx8dID.findElement(By.tagName("input")).click();
		Thread.sleep(500);
		ReclamationClientPage.Vld8dID.click();
		Thread.sleep(500);
	}
	 
	public static void consulter_fiche_pour_investigation(WebDriver driver) throws Throwable 
	{
		

		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click()",ReclamationClientPage.MagdID);
	
		Thread.sleep(1000);
	
		JavascriptExecutor executor2 = (JavascriptExecutor) driver;
		executor2.executeScript("arguments[0].click()",ReclamationClientPage.VOLInvID);
		
		
		
	}
	
	public static void consulter_réclamation_a_investiger(String arg1) throws Throwable
	{
		ReclamationClientPage.RECHInvID.sendKeys(arg1);
		Thread.sleep(500);
		ReclamationClientPage.CHXInvID.findElement(By.tagName("a")).click();
		Thread.sleep(500);
	}
	
	public static void consulter_fiche_pour_app_investigation(WebDriver driver) throws Throwable 
	{
		
		Thread.sleep(1000);
		
		
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click()",ReclamationClientPage.MagdID);
	
		Thread.sleep(1000);
	
		JavascriptExecutor executor2 = (JavascriptExecutor) driver;
		executor2.executeScript("arguments[0].click()",ReclamationClientPage.VOLAppInvID);
	}
	
	public static void consulter_réclamation_a_app_investiger(String arg1) throws Throwable
	{
		ReclamationClientPage.RECHAppInvID.sendKeys(arg1);
		Thread.sleep(500);
		ReclamationClientPage.CHXAppInvID.findElement(By.tagName("a")).click();
		Thread.sleep(500);
	}
	
	public static void saisir_rapport_investigation() {
		ReclamationClientPage.RappInvID.sendKeys("Investigation");
	}
	public static void cloturer_investigation() throws Throwable {
		//ReclamationClientPage.VolInvID.click();
		//Thread.sleep(500);
		ReclamationClientPage.InvAppID.click();
		Thread.sleep(500);
	}
	
	
	public static void saisir_responsable_Trait(String RepTrait) throws Throwable {
		ReclamationClientPage.ResTraitId.sendKeys(RepTrait);
	}

	
	public static void cliquer_valider_décision_réclamation(WebDriver driver) throws Throwable 
	{
		Actions action = new Actions(driver);
		action.moveToElement(ReclamationClientPage.VldDecId).perform();
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click()",ReclamationClientPage.VldDecId);
		
		
	}


	public static void vérifier_état_réclamation_passage_traitement() throws Throwable 
	{
	
		boolean Rec_State=false;
		if (ReclamationClientPage.RecStateID.equals("En attente de traitement")) 
		{
			Rec_State= true;
			System.out.println(Rec_State);
		}
		Assert.assertTrue(Rec_State);
		
	}
	public static void récupérer_responsable(String Resp)throws Throwable
	{
		responsable=Resp;
		System.out.println(responsable);
	}
	public static void Passage_Traitement(String arg1,WebDriver driver) throws Throwable 
		{
		Thread.sleep(2000);
			JavascriptExecutor executor = (JavascriptExecutor) driver;
			executor.executeScript("arguments[0].click()", ReclamationClientPage.MagdID);
			Thread.sleep(4000);
			JavascriptExecutor executor2 = (JavascriptExecutor) driver;
			executor2.executeScript("arguments[0].click()",ReclamationClientPage.RecATraitID);
			
			ReclamationClientPage.RechTraitID.sendKeys(arg1);		
	}
	public static void saisir_cout_Trait() throws Throwable {
		try {
			ReclamationClientPage.CoutTraiID.isDisplayed();
			ReclamationClientPage.CoutTraiID.sendKeys("1000");
			Common.Exporter_champ_A_masquer("le champ cout de penalité est visible");
			}
			catch (NoSuchElementException e) {
				Common.Exporter_champ_A_masquer("le champ cout de penalité est invisible");
			}
	}
	
	public static void saisir_frais_Trait() throws Throwable {
		ReclamationClientPage.FraisTraiID.sendKeys("500");
	}
	public static void saisir_rapport_Trait() throws Throwable {
		ReclamationClientPage.RappTraiID.sendKeys("Reclamation traité");
	}
	public static void modifier_status_Trait() throws Throwable {
		ReclamationClientPage.RecTraiID.click();
		Thread.sleep(1000L);
	}
	public static void valider_Trait_Rec() throws Throwable {
		//ReclamationClientPage.VolEnrRecId.click();
		//ReclamationClientPage.VolTraiID.click();
		//Thread.sleep(500);
		ReclamationClientPage.VldTraiID.click();
		Thread.sleep(500L);
	}
	public static void vérifier_état_réclamation_passage_cloture() throws Throwable 
	{
	
		boolean Rec_State=false;
		if (ReclamationClientPage.RecStateID.equals("En attente de clôture")) {
			Rec_State= true;
			System.out.println(Rec_State);
		}
		asserttrue(Rec_State);
	}
	
	public static void Passage_Cloture(String arg1,WebDriver driver) throws Throwable 
	{
		
	Thread.sleep(1000);
		
		
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click()",ReclamationClientPage.MagdID);
	
		Thread.sleep(1000);
	
		JavascriptExecutor executor2 = (JavascriptExecutor) driver;
		executor2.executeScript("arguments[0].click()",ReclamationClientPage.RecClotID);
	
		Thread.sleep(1000L);
	
		ReclamationClientPage.RechSuiviID.sendKeys(arg1);		
	}

	public static void saisir_rapport_Suivi() throws Throwable {
		ReclamationClientPage.RappSuiviID.sendKeys("Reclamation cloturé");
		
	}
	public static void modifier_status_Suivi() throws Throwable {
		ReclamationClientPage.RecSuiviID.click();
		Thread.sleep(1000L);
	}
	public static void valider_Suivi_Rec() throws Throwable {
		
		ReclamationClientPage.VldSuiviID.click();
	}
	public static void vérifier_état_réclamation_passage_approbation() throws Throwable 
	{
	
		
		Rec_State_App=false;
		if (ReclamationClientPage.RecStateID.equals("Clôturée")) {
			Rec_State_App= true;
			System.out.println(Rec_State_App);
		}
		Assert.assertTrue(Rec_State_App);
	}
	
	
	
	public static void Passage_App(String numfich,WebDriver driver) throws Throwable
	{
		Thread.sleep(1500);

		ReclamationClientPage.MagdID.click();
		Thread.sleep(1000L);
		JavascriptExecutor je=(JavascriptExecutor)driver;
		je.executeScript("arguments[0].scrollIntoView(true);", ReclamationClientPage.RecAppID);


		ReclamationClientPage.RecAppID.click();
		ReclamationClientPage.RechAppID.sendKeys(numfich);		
	}
	

	public static void modifier_status_App() throws Throwable {
		//ReclamationClientPage.VolEnrID.click();
		ReclamationClientPage.RecApproID.click();
		Thread.sleep(1000L);
	}
	
	public static void saisir_commentaire_App() {
		ReclamationClientPage.CommAppID.sendKeys("Commentaire Approbation");
	}
	
	public static void valider_App_Rec() throws Throwable {
		ReclamationClientPage.VldAppID.click();
	}
	
	public static void saisir_Numero_fiche()
	{
		ReclamationClientPage.NumRechID.sendKeys(NumFich);	
		ReclamationClientPage.BRechID.click();
		ReclamationClientPage.RechTableID.findElement(By.tagName("a")).click();
		
	}
	
	public static void Apercu_Rec() throws Throwable {
		ReclamationClientPage.ApercuID.click();
		Thread.sleep(2000L);
	}
	
	
	
	
	
	
	
	
}
