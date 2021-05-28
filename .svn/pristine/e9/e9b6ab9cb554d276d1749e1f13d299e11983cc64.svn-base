package com.qualiprobdd.e2etests.indicateur.models;

import static org.testng.Assert.assertTrue;

import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qualiprobdd.e2etests.indicateur.pages.IndicateurPage;
import com.qualiprobdd.e2etests.util.Common;
import com.qualiprobdd.e2etests.util.ExcelUtils;




public class IndicateurModel {
	public static String[] mots;

	/* Public methods */

	/* Public methods */

	public static void cliquerIndicateur(WebDriver driver) throws Throwable {
		Thread.sleep(800);
	//	IndicateurPage.menuID.click();
		JavascriptExecutor js  = (JavascriptExecutor) driver ;
		js.executeScript("arguments[0].click()",IndicateurPage.menuID);
		Thread.sleep(200);
		Common.AccéderModule(5, 0,0, driver);
		Common.AccéderModule(5, 1,0, driver);
	}


	public static void ajouterFicheIndicateur() throws InterruptedException {
		Thread.sleep(1000);
		IndicateurPage.btajouterIndID.click();
		Common.Exporter_visibilité("Nouvelle Fiche Indicateur");
		Common.Exporter_champ_A_masquer("Nouvelle Fiche Indicateur");
	}
	

	public static void saisirlibelleIndicateur() throws InterruptedException {
		Thread.sleep(1000);
		IndicateurPage.btlibellindicateurID.sendKeys(generate(10));
	}

	public static void saisirFormuleIndicateur() {

		IndicateurPage.btFormulecalcul.sendKeys("Description formule de calcul");
	}

	public static void saisirtypeindicateur(String type) {

		Select select = new Select(IndicateurPage.btTypeindictaeurID);
		select.selectByVisibleText(type);
	}

	public static String getValeurCompteur() {

		return IndicateurPage.CptagendaIndicateur_ID.getText();

	}

	public static void cliquerCalendrier(WebDriver driver) throws Throwable {
		 String Sdate = "01/01/2018";
				System.out.println(Sdate);
				JavascriptExecutor jse = (JavascriptExecutor)driver;
				jse.executeScript("arguments[1].value = arguments[0];",Sdate, IndicateurPage.btCalendrierID);
	}

	public static void choisirDate() {

		IndicateurPage.btChoixdateID.click();
	}

	public static void choixResponsableIndicateur(String Resp) throws Throwable {

		IndicateurPage.responsableindicateurplus_ID.click();
		Thread.sleep(200);
		IndicateurPage.rechercherresponsableindicateur_XPATH.sendKeys(Resp);
		IndicateurPage.vldrechercherresponsableindicateur_XPATH.click();
		Thread.sleep(500);
		IndicateurPage.choixresponsableindicateur_ID.findElement(By.tagName("input")).click();
		IndicateurPage.btnvaliderresponsableindicateur_ID.click();
		
	}

	public static void selectionnerPeriodiciteSuivi(String Perio) {
		Select select = new Select(IndicateurPage.btnperiodiciteSuivi_ID);
		select.selectByVisibleText(Perio);
		
	}

	public static void selectionnerTypeSuivi(String Suivi, String formule, WebDriver driver) throws Throwable {
		Select select = new Select(IndicateurPage.btnTypesuiviID);
		Cookie cookie1 = driver.manage().getCookieNamed("lan");
		JavascriptExecutor executor=(JavascriptExecutor)driver;
		if(cookie1.getValue().equals("en-US"))
		{
			if(Suivi.equals("Suivi manuel"))
			{
				select.selectByVisibleText("Manual follow up");
			
			}else if(Suivi.equals("Formule de Calcul"))
			{
				select.selectByVisibleText("Calculation formula");
			}
				
			else if(Suivi.equals("Données de Qualipro"))
			{
				select.selectByVisibleText("Qualipro data");
			}
		
		}else
		{
			select.selectByVisibleText(Suivi);
		}


		if(Suivi.equals("Formule de Calcul")||Suivi.equals("Calculation method (Formula)")) 
		{
			
			IndicateurPage.EditFormule_ID.click();
			mots = formule.split(" ");
			for(int i=0;i<mots.length;i++)
			{ 
				if(mots[i].equals("(")||mots[i].equals(")")) 
				{
					Select select1 = new Select(IndicateurPage.parenthFormule_ID);
					select1.selectByValue(mots[i]);
					IndicateurPage.VldParenthFormule_ID.click();
				}
				else if(mots[i].equals("+")||mots[i].equals("-")||mots[i].equals("*")||mots[i].equals("/"))
				{
					Select select1 = new Select(IndicateurPage.OpFormule_ID);
					select1.selectByValue(mots[i]);
					IndicateurPage.ValdContFormule_ID.click();
					
				}
				else if(estUnEntier(mots[i]))
				{
					IndicateurPage.ValFormule_ID.sendKeys(mots[i]);
					IndicateurPage.ValdContFormule_ID.click();
				}
				else 
				{
					mots[i]=mots[i].replace("I","");
					Select select1 = new Select(IndicateurPage.IndFormule_ID);
					select1.selectByValue(mots[i]);
					IndicateurPage.ValdContFormule_ID.click();
					
				}
				
			}
			
			//IndicateurPage.EnregFormule_ID.click();
			executor.executeScript("arguments[0].click()",IndicateurPage.EnregFormule_ID);
			executor.executeScript("arguments[0].click()",driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_LinkButton30\"]/span")) );
			//driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_LinkButton30\"]/span")).click();
		}
		else if (Suivi.equals("Données de Qualipro")||Suivi.equals("Qualipro data"))
		{
			//IndicateurPage.ChxData_ID.click();
			Thread.sleep(1000);
			executor.executeScript("arguments[0].click()",IndicateurPage.ChxData_ID);
			Thread.sleep(500);
			//driver.findElement(By.id("ctl00_ContentPlaceHolder1_lnkparamimport2")).click();
			Thread.sleep(500);
			IndicateurPage.RechData_ID.sendKeys(formule);
			IndicateurPage.SelectData_ID.findElement(By.tagName("a")).click();
			Thread.sleep(500);
			IndicateurPage.VldData_ID.click();
		}

	}
	
	public static boolean estUnEntier(String chaine) {
	try {
		Integer.parseInt(chaine);
	} catch (NumberFormatException e){
		return false;
	}

	return true;
}
	public static void selectionnerTypeResultat(String TypRes, WebDriver driver) {
		
		Select select = new Select(IndicateurPage.btntyperesultat_ID);
		Cookie cookie1 = driver.manage().getCookieNamed("lan");
		if(cookie1.getValue().equals("en-US"))
		{
			if(TypRes.equals("DERNIERE VALEUR"))
			{
				select.selectByVisibleText("Last value");
			
			}else if(TypRes.equals("MOYENNE PONDEREE"))
			{
				select.selectByVisibleText("Weighted average");
			}
				
			else if(TypRes.equals("Moyenne simple"))
			{
				select.selectByVisibleText("Simple average");
			}
			else if(TypRes.equals("VALEUR CUMULEE"))
			{
				select.selectByValue("1");
			}	
			else if(TypRes.equals("OUI/NON"))
			{
				select.selectByVisibleText("Yes/No");
			}
		
		}else
		{
			select.selectByVisibleText(TypRes);
		}
		
	}
	
	

	public static void choisirvaleurCible(String ValCib, String TypRes, WebDriver driver) throws InterruptedException {
		if(TypRes.equals("OUI/NON"))
		{
				WebElement Element=driver.findElement(By.id("ctl00_ContentPlaceHolder1_List_Valeur_ON"));
				Select select = new Select(Element);
			   select.selectByVisibleText(ValCib);
			   
		}else {
			//split divise la chaine en un ensemble de mots
	       //s'il y a un espace et les mis dans un tableau
	       mots = ValCib.split(" ");
	       if(mots[0].contains("\""))
	       {
	    	   mots[0]="=";
	       }
	       Thread.sleep(1000);
	       Select select = new Select(IndicateurPage.btnOperateurValeurcible_ID);
		   select.selectByVisibleText(mots[0]);
		   //IndicateurPage.btnOperateurValeurcible_ID.click();
		   //IndicateurPage.btnOperateurValeurcible_XPATH.click();
		   IndicateurPage.Valeurcible_ID.sendKeys(mots[1]);
		   
		}
	}

	public static String generate(int length) {
		String pass = "testAUTO";
		String chars = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
		for (int x = 0; x < length; x++) {
			int i = (int) Math.floor(Math.random() * 62);
			pass += chars.charAt(i);
		}
		System.out.println(pass);
		return pass;
	}

	public static void saisirUnite() {

		IndicateurPage.Unite_ID.sendKeys("%");
	}

	public static void saisirSite(WebDriver driver) {
		try {	
			IndicateurPage.choixSite_ID.isDisplayed();
			Common.Exporter_visibilité("le site est visible");
			String text=driver.findElement(By.id("ctl00_ContentPlaceHolder1_Label23")).getText();
			if(text.indexOf('*')!=-1) 
			{
				Common.Exporter_visibilité("le site est obligatoire");
			}else 
			{
				Common.Exporter_visibilité("le site n'est pas obligatoire");
				
			}
			Select select = new Select(IndicateurPage.choixSite_ID);
			select.selectByVisibleText("SITE AUTO");
			}
			catch (NoSuchElementException e) {
				Common.Exporter_visibilité("le site est invisible");
			}
	}
	

	public static void selectionnerProcessus(WebDriver driver) {
		try {
			IndicateurPage.choixPROCESSUS_ID.isDisplayed();
			Common.Exporter_visibilité("le processus est visible");
			String text=driver.findElement(By.id("ctl00_ContentPlaceHolder1_LblProcessus_")).getText();
			if(text.indexOf('*')!=-1) 
			{
				Common.Exporter_visibilité("le processus est obligatoire");
			}else 
			{
				Common.Exporter_visibilité("le processus n'est pas obligatoire");
				
			}
			Select select = new Select(IndicateurPage.choixPROCESSUS_ID);
			select.selectByVisibleText("PROCESSUS AUTO");
			}
			catch (NoSuchElementException e) {
				Common.Exporter_visibilité("le processus est invisible");
			}
	}
	public static void selectionnerActivite(WebDriver driver) {
		try {
			IndicateurPage.choixACTIVITE_ID.isDisplayed();
			Common.Exporter_visibilité("l'activité est visible");
			String text=driver.findElement(By.id("ctl00_ContentPlaceHolder1_LblDomaine_")).getText();
			if(text.indexOf('*')!=-1) 
			{
				Common.Exporter_visibilité("l'activité est obligatoire");
			}else 
			{
				Common.Exporter_visibilité("l'activité n'est pas obligatoire");
				
			}
			Select select = new Select(IndicateurPage.choixACTIVITE_ID);
			select.selectByVisibleText("ACTIVITE AUTO");
			}
			catch (NoSuchElementException e) {
				Common.Exporter_visibilité("l'activité est invisible");
			}
		
	}
	public static void selectionnerDirection(WebDriver driver) {
		try {
			IndicateurPage.choixDIRECTION_ID.isDisplayed();
			Common.Exporter_visibilité("la direction est visible");
			String text=driver.findElement(By.id("ctl00_ContentPlaceHolder1_Label86")).getText();
			if(text.indexOf('*')!=-1) 
			{
				Common.Exporter_visibilité("la direction est obligatoire");
			}else 
			{
				Common.Exporter_visibilité("la direction n'est pas obligatoire");
				
			}
			Select select = new Select(IndicateurPage.choixDIRECTION_ID);
			select.selectByVisibleText("DIRECTION AUTO");
			}
			catch (NoSuchElementException e) {
				Common.Exporter_visibilité("la direction est invisible");
			}

	}
	
	public static void saisirpériodicitéremiseàzéro(String trouve, String périodicité) throws Throwable
	{
		if(trouve.equals("OUI")) 
		{
		Select select = new Select(IndicateurPage.perioderemiseàzéro);
		select.selectByVisibleText(périodicité);
		}
	}
	
	public static void saisirdateremiseàzéro(String trouve, String dateremise, WebDriver driver) throws Throwable 
	{
		final DateFormat dateFormat = new SimpleDateFormat("MM/yyyy");
		if(trouve.equals("OUI")) 
		{
			SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
	        Date date = formatter.parse(dateremise);
			String Sdate = dateFormat.format(date);
			JavascriptExecutor jse = (JavascriptExecutor)driver;
			jse.executeScript("arguments[1].value = arguments[0];",Sdate, IndicateurPage.dateremisezéro);
		}
		
	}
	
	public static void service(WebDriver driver) throws Exception {
		try {
			IndicateurPage.choixSERVICE_ID.isDisplayed();
			Common.Exporter_visibilité("le service est visible");
			String text=driver.findElement(By.id("ctl00_ContentPlaceHolder1_LblService_")).getText();
			if(text.indexOf('*')!=-1) 
			{
				Common.Exporter_visibilité("le service est obligatoire");
			}else 
			{
				Common.Exporter_visibilité("le service n'est pas obligatoire");
			}
			Select select = new Select(IndicateurPage.choixSERVICE_ID);
			select.selectByVisibleText("SERVICE AUTO");
			}
			catch (NoSuchElementException e) {
				Common.Exporter_visibilité("le service est invisible");
			}
	}

	public static void cliquerSurValider(WebDriver driver) {
		  JavascriptExecutor executor = (JavascriptExecutor)driver;
			executor.executeScript("arguments[0].click()", IndicateurPage.BtnValidationIndicateur_ID);
	}

	public static void cliquerSurAgenda(WebDriver driver)throws Exception {
		Thread.sleep(1000);
		  JavascriptExecutor executor = (JavascriptExecutor)driver;
		  executor.executeScript("arguments[0].click()", IndicateurPage.agendaIndicateur_ID);
	}

	public static void RattacherAxePolitique(WebDriver driver) {
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click()", IndicateurPage.rattacherAxePolitique_ID);
		executor.executeScript("arguments[0].click()", IndicateurPage.choixAxePolitique_XPATH);
		executor.executeScript("arguments[0].click()", IndicateurPage.btajouterpoli);

	}

	public static void ajouterDetail(WebDriver driver) {

		//IndicateurPage.ajouterDetailID.click();
		JavascriptExecutor executor=(JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click()",IndicateurPage.ajouterDetailID);
	}
	public static void getNumIndicateur() {

		//ctl00_ContentPlaceHolder1_TextBox1
	}
	
	public static void ConsulterFiche(String numIndicateur) throws Throwable
	{
			
			IndicateurPage.filtre_rech_ind.sendKeys(numIndicateur);
			 Thread.sleep(500);
			IndicateurPage.btnrechind.click();
			 Thread.sleep(500);
		    IndicateurPage.GridInd.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_GridView1\"]/tbody/tr/td[2]")).findElement(By.tagName("a")).click();
		    Thread.sleep(1000);
		    IndicateurPage.enregistrement.click();
		    Thread.sleep(500);
		    IndicateurPage.suivi_panel.click();
		    Thread.sleep(500);
		}
	
	
	public static void consulterIndicateur(String typeSuivi,String typerésultat, String NumInd, WebDriver driver) throws Throwable 
	{
		
		if(typeSuivi.equals("Suivi manuel")||typeSuivi.equals("Données de Qualipro")) 
		{
			cliquerSurAgenda(driver);
		}else
		{
			//ConsulterFiche(NumInd);
			Thread.sleep(1000);
			  JavascriptExecutor executor = (JavascriptExecutor)driver;
			  executor.executeScript("arguments[0].click()", IndicateurPage.agendaIndicateur_ID);
			  Thread.sleep(1000);
			driver.findElement(By.id("ctl00_ContentPlaceHolder1_Label11")).click();
			Thread.sleep(200);
			driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_GridViewFormCalcul_filter\"]/label/input")).sendKeys(NumInd);
			Thread.sleep(200);
			driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_GridViewFormCalcul\"]/tbody/tr/td[1]")).findElement(By.tagName("a")).click();
			Thread.sleep(1000);
		    IndicateurPage.enregistrement.click();
		    Thread.sleep(500);
		    IndicateurPage.suivi_panel.click();
		    Thread.sleep(500);
		}
	}

	
	
	public static void verifierIncrémentationCompteur(String typeSuivi,String typerésultat, String Compteur) throws Throwable {
		if(typeSuivi.equals("Suivi manuel")||typeSuivi.equals("Données de Qualipro")) 
		{
		boolean inc = false;
		String compteur;
		// DocumentationModele.cliqueAgendaDocument();
		compteur = getValeurCompteur();
		System.out.println("Valeur compteur increment est: " + compteur);
		if (Integer.parseInt(compteur) > Integer.parseInt(Compteur)) {
			inc = true;
		}
		}
		//AssertTrue(inc);
	}

	
	public static void vérifier_l_état_de_suivi(String typeSuivi,String typerésultat, String Indicateur, WebDriver driver) throws Throwable 
	{	
		if(typeSuivi.equals("Suivi manuel")||typeSuivi.equals("Données de Qualipro")) 
		{
	
		driver.findElement(By.xpath("//*[@id=\"accordion\"]/div[1]/div[1]/h4/a/span")).click();
		Thread.sleep(1000);
		try {
			WebElement etat = driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_GridView1_filter\"]/label/input"));
			etat.isDisplayed();
			System.out.println("Indicateur non encore suivi");
			Thread.sleep(1000);
			etat.sendKeys(Indicateur);
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_GridView1\"]/tbody/tr/td[1]")).findElement(By.tagName("a")).click();
		}catch (NoSuchElementException e) {
			System.out.println("Indicateur suivi");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"accordion\"]/div[2]/div[1]/h4/a/span")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_GridView2_filter\"]/label/input")).sendKeys(Indicateur);
			WebElement etat = driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_GridView2\"]/tbody/tr/td[1]"));
			Thread.sleep(1000);
			etat.findElement(By.tagName("a")).click();
		}
		
		}

	}
	
	
	public static void Vérifier_valeur_résultante_dépendamment(String arg1, String arg2, String arg3, String typerésultat,WebDriver driver) throws Throwable
	{
		if(typerésultat.equals("DERNIERE VALEUR")||typerésultat.equals("OUI/NON")) 
		{
			Thread.sleep(1000);
			IndicateurPage.RechAnneeSuivi.sendKeys(arg2);
			Thread.sleep(1000);
			//added by rahma
			WebDriverWait wait = new WebDriverWait(driver,60);
	        wait.until(ExpectedConditions.visibilityOf(IndicateurPage.GridSuivi));
			int row=IndicateurPage.GridSuivi.findElements(By.tagName("tr")).size();
			if(row==2)
			{
				//String ValREs=IndicateurPage.GridSuivi.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_G2\"]/tbody/tr/td[4]")).findElement(By.tagName("span")).getText();
				String ValSaisie=IndicateurPage.GridSuivi.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_G2\"]/tbody/tr/td[3]")).findElement(By.tagName("span")).getText();
				//assertTrue(ValREs.contains(ValSaisie));
			}else 
			{
				int i=1;
				do {
				String periode =IndicateurPage.GridSuivi.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_G2\"]/tbody/tr["+i+"]/td[1]")).findElement(By.tagName("a")).getText();
					if(periode.equals(arg3))
					{
						//String ValREs=IndicateurPage.GridSuivi.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_G2\"]/tbody/tr["+i+"]/td[4]")).findElement(By.tagName("span")).getText();
						String ValSaisie=IndicateurPage.GridSuivi.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_G2\"]/tbody/tr["+i+"]/td[3]")).findElement(By.tagName("span")).getText();
						//assertTrue(ValREs.contains(ValSaisie));
					}
					i++;
				}while(i<=row-1);
			}
		}
		else if(typerésultat.equals("MOYENNE PONDEREE"))
		{
			
			int row=IndicateurPage.GridSuivi.findElements(By.tagName("tr")).size();
			if(row==2)
			{
				String ValREs=IndicateurPage.GridSuivi.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_G2\"]/tbody/tr/td[5]")).findElement(By.tagName("span")).getText();
				String Quantite=IndicateurPage.GridSuivi.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_G2\"]/tbody/tr/td[4]")).findElement(By.tagName("span")).getText();
				String ValSaisie=IndicateurPage.GridSuivi.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_G2\"]/tbody/tr/td[3]")).findElement(By.tagName("span")).getText();
				float Moyen=(Float.valueOf(ValSaisie)*Float.valueOf(Quantite))/Float.valueOf(Quantite);
				assertTrue(ValREs.contains(String.valueOf(Moyen)));
			}else 
			{
				//int i=row-1;
				float som_Quantite=0;
				float Somme=0;
				float Moyen;
				for (int j=1; j<=row-1;j++)
				{
					String Quantite=IndicateurPage.GridSuivi.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_G2\"]/tbody/tr["+j+"]/td[4]")).findElement(By.tagName("span")).getText();
					String ValSaisie=IndicateurPage.GridSuivi.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_G2\"]/tbody/tr["+j+"]/td[3]")).findElement(By.tagName("span")).getText();
					Moyen=(Float.valueOf(ValSaisie)*Float.valueOf(Quantite));
					//System.out.println("Moyen"+Moyen);
					som_Quantite=som_Quantite+Float.valueOf(Quantite);
					//System.out.println("SQuantite"+som_Quantite);
					Somme=Somme+Moyen;
					//System.out.println("Somme"+Somme);
				}
				//driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_G2\"]/thead/tr/th[2]")).click();
				Moyen=Somme/som_Quantite;
				String amountDoubleFormated = new DecimalFormat("0.00").format(Moyen);
				Double moy = Double.valueOf(amountDoubleFormated);
				//System.out.println("Moyen"+String.valueOf(moy));
				IndicateurPage.RechAnneeSuivi.sendKeys(arg2);
				Thread.sleep(500);
				int row1=IndicateurPage.GridSuivi.findElements(By.tagName("tr")).size();
				if(row1==2)
				{
					String ValREs=IndicateurPage.GridSuivi.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_G2\"]/tbody/tr/td[5]")).findElement(By.tagName("span")).getText();
					//System.out.println("ValRes"+ValREs);
					assertTrue(ValREs.contains(String.valueOf(moy)));
				}else 
				{
				int i=1;
				do {
					String periode =IndicateurPage.GridSuivi.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_G2\"]/tbody/tr["+i+"]/td[1]")).findElement(By.tagName("a")).getText();
					if(periode.equals(arg3))
					{
						String ValREs=IndicateurPage.GridSuivi.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_G2\"]/tbody/tr["+i+"]/td[5]")).findElement(By.tagName("span")).getText();
						//System.out.println("ValRes"+ValREs);
						assertTrue(ValREs.contains(String.valueOf(moy)));
						}
					i++;
			}while(i<row1);
				}
		}
		}
		else if(typerésultat.equals("Moyenne simple")) 
		{
			
			int row=IndicateurPage.GridSuivi.findElements(By.tagName("tr")).size();
			if(row==2)
			{
				String ValREs=IndicateurPage.GridSuivi.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_G2\"]/tbody/tr/td[4]")).findElement(By.tagName("span")).getText();
				String ValSaisie=IndicateurPage.GridSuivi.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_G2\"]/tbody/tr/td[3]")).findElement(By.tagName("span")).getText();
				assertTrue(ValREs.contains(ValSaisie));
			}else 
			{
				int i=row-1;
				float Somme=0;
				float Moyen;
				for (int j=1; j<=i;j++)
				{
					String ValSaisie=IndicateurPage.GridSuivi.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_G2\"]/tbody/tr["+j+"]/td[3]")).findElement(By.tagName("span")).getText();
					Somme=Somme+Float.valueOf(ValSaisie);
				}
				Moyen=Somme/i;
				IndicateurPage.RechAnneeSuivi.sendKeys(arg2);
				Thread.sleep(500);
				int row1=IndicateurPage.GridSuivi.findElements(By.tagName("tr")).size();
				if(row1==2)
				{
					String ValREs=IndicateurPage.GridSuivi.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_G2\"]/tbody/tr/td[4]")).findElement(By.tagName("span")).getText();
					assertTrue(ValREs.contains(String.valueOf(Moyen)));
				}else 
				{
				i=1;
				do {
					String periode =IndicateurPage.GridSuivi.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_G2\"]/tbody/tr["+i+"]/td[1]")).findElement(By.tagName("a")).getText();
					if(periode.equals(arg3))
					{
						String ValREs=IndicateurPage.GridSuivi.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_G2\"]/tbody/tr["+i+"]/td[4]")).findElement(By.tagName("span")).getText();
						assertTrue(ValREs.contains(String.valueOf(Moyen)));
					}
					i++;
				}while(i<row1);
				}
			}
		}
		else if(typerésultat.equals("VALEUR CUMULEE")) 
		{
			int row=IndicateurPage.GridSuivi.findElements(By.tagName("tr")).size();
			if(row==2)
			{
				String ValREs=IndicateurPage.GridSuivi.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_G2\"]/tbody/tr/td[4]")).findElement(By.tagName("span")).getText();
				String ValSaisie=IndicateurPage.GridSuivi.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_G2\"]/tbody/tr/td[3]")).findElement(By.tagName("span")).getText();
				assertTrue(ValREs.contains(ValSaisie));
			}else 
			{
				int i=row-1;
				float Somme=0;
				for (int j=1; j<=i;j++)
				{
					String ValSaisie=IndicateurPage.GridSuivi.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_G2\"]/tbody/tr["+j+"]/td[3]")).findElement(By.tagName("span")).getText();
					Somme=Somme+Float.valueOf(ValSaisie);
				}
				
				IndicateurPage.RechAnneeSuivi.sendKeys(arg2);
				Thread.sleep(500);
				int row1=IndicateurPage.GridSuivi.findElements(By.tagName("tr")).size();
				if(row1==2)
				{
					String ValREs=IndicateurPage.GridSuivi.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_G2\"]/tbody/tr/td[4]")).findElement(By.tagName("span")).getText();
					assertTrue(ValREs.contains(String.valueOf(Somme)));
				}else 
				{
				i=1;
				do {
					String periode =IndicateurPage.GridSuivi.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_G2\"]/tbody/tr["+i+"]/td[1]")).findElement(By.tagName("a")).getText();
					if(periode.equals(arg3))
					{
						String ValREs=IndicateurPage.GridSuivi.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_G2\"]/tbody/tr["+i+"]/td[4]")).findElement(By.tagName("span")).getText();
						assertTrue(ValREs.contains(String.valueOf(Somme)));
					}
					i++;
				}while(i<row1);
				}
				
				
			}
			
		}
		
	}
	
	

	
	public static void cliquer_sur_ajouter_détail_de_suivi_de_l_indicateur(String typeSuivi,WebDriver driver) throws Throwable 
	{
		if(typeSuivi.equals("Suivi manuel")||typeSuivi.equals("Données de Qualipro")) 
		{
		JavascriptExecutor executor=(JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click()",IndicateurPage.suivi);
		//IndicateurPage.suivi.click();
		Thread.sleep(1000);
		IndicateurModel.ajouterDetail(driver);
		}
	}

	public static void sélectionner_choisi(String typeSuivi, String arg1) throws Throwable {
		if(typeSuivi.equals("Suivi manuel")||typeSuivi.equals("Données de Qualipro"))
		{
			
			Select select = new Select(IndicateurPage.hebdomadaire_XPATH);
			select.selectByVisibleText(arg1);
		}
	}
	
	public static void saisir_année(String typeSuivi, String arg1) throws Throwable {
		if(typeSuivi.equals("Suivi manuel")||typeSuivi.equals("Données de Qualipro"))
		{	
			
			IndicateurPage.annee_ID.click();
			IndicateurPage.annee_ID.sendKeys(arg1);
		}
	}



	
	public static void saisir_indicateur(String typeSuivi,String typerésultat, String NumInd, WebDriver driver,String arg1) throws Throwable {
		if(typeSuivi.equals("Suivi manuel"))
		{
			if(typerésultat.equals("OUI/NON")) 
			{
				WebElement element= driver.findElement(By.id("ctl00_ContentPlaceHolder1_ListON"));
				Select select = new Select(element);
				   select.selectByVisibleText(arg1);
				
			}else 
			{
					IndicateurPage.valeur_ID.sendKeys(arg1);
		
			}
		if(typerésultat.equals("MOYENNE PONDEREE")) 
		{
			driver.findElement(By.id("ctl00_ContentPlaceHolder1_Qte")).sendKeys("3");
		}
		}
	}
	

	public static void cliquer_bouton_importer(String typeSuivi,String typerésultat, WebDriver driver) throws Throwable {
		if(typeSuivi.equals("Données de Qualipro"))
		{
			if(typerésultat.equals("MOYENNE PONDEREE")) 
			{
				driver.findElement(By.id("ctl00_ContentPlaceHolder1_Qte")).sendKeys("3");
			}
			
			//driver.findElement(By.id("ctl00_ContentPlaceHolder1_Linkbutton33")).click();
			JavascriptExecutor executor=(JavascriptExecutor)driver;
			executor.executeScript("arguments[0].click()",driver.findElement(By.id("ctl00_ContentPlaceHolder1_Linkbutton33")));
		}
	}
	

	public static void Vérifier_moyenne_indicateur(String typeSuivi,String typerésultat, String arg1) throws Throwable {
		if(typeSuivi.equals("Données de Qualipro"))
		{
			assertTrue(IndicateurPage.valeur_ID.getAttribute("value").contains(arg1));
		}
	}
	

	public static void saisir_rapport(String typeSuivi) throws Throwable {
		if(typeSuivi.equals("Suivi manuel")||typeSuivi.equals("Données de Qualipro")) 
		{
			IndicateurPage.rapport_ID.sendKeys("test auto établi");
		}
	}



	
	public static void cliquer_sur_valider_Detail(String typeSuivi,WebDriver driver) throws Throwable {
		if(typeSuivi.equals("Suivi manuel")||typeSuivi.equals("Données de Qualipro"))
		{
			JavascriptExecutor  executor = (JavascriptExecutor)driver;
			executor.executeScript("arguments[0].click()",IndicateurPage.btnValiderDetail_ID);
			Thread.sleep(200);
		}
	}
	
	
	
	public static void vérifier_indicateur(String arg1, WebDriver driver) throws Throwable {
		System.out.println(" arg1  == "+arg1);
		WebElement element=driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_Panel19\"]/div/div[3]/span/label"));
		System.out.println(" element     == "+element.getText() );
		assertTrue(element.getText().contains(arg1));
		System.out.println(element.getText());
	}
	
	

	
	public static void VérifierFormuleSuivi(String typerésultat, WebDriver driver, String path) throws Throwable {
		String periode, annee,valeur;
		Calendar c = Calendar.getInstance();
        int anneCourante = c.get(Calendar.YEAR);
		ExcelUtils.setExcelFile(path, "SuiviIndicateur");
		if(typerésultat.equals("DERNIERE VALEUR")) 
		{
			int row=IndicateurPage.GridSuivi.findElements(By.tagName("tr")).size();
			if(row==2)
			{
				periode=ExcelUtils.getCellData(1,0);
				annee=ExcelUtils.getCellData(1,1);
				valeur=ExcelUtils.getCellData1(1, 5);
				String periode1=IndicateurPage.GridSuivi.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_G2\"]/tbody/tr/td[1]")).findElement(By.tagName("span")).getText();
				String annee1=IndicateurPage.GridSuivi.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_G2\"]/tbody/tr/td[2]")).findElement(By.tagName("span")).getText();
				String ValSaisie=IndicateurPage.GridSuivi.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_G2\"]/tbody/tr/td[3]")).findElement(By.tagName("span")).getText();
				ValSaisie=ValSaisie.replace(',','.');
				assertTrue(annee1.contains(annee));
				assertTrue(periode1.contains(periode));
				assertTrue(ValSaisie.contains(valeur));;
				if (annee.contains(Integer.toString(anneCourante))) {
					String Moy_GEN=IndicateurPage.MoyenGeneID.getAttribute("value");
					assertTrue(Moy_GEN.contains(valeur));
					
				}else {
					String Moy_GEN=IndicateurPage.MoyenGeneID.getAttribute("value");
					Moy_GEN=Moy_GEN.replace(',','.');
					assertTrue(Moy_GEN.contains("0"));
				}
			}else 
			{
				//driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_G2\"]/thead/tr/th[1]")).click();
				JavascriptExecutor executor=(JavascriptExecutor)driver;
				executor.executeScript("arguments[0].click()",driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_G2\"]/thead/tr/th[1]")));
				Thread.sleep(200);
				//driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_G2\"]/thead/tr/th[2]")).click();
				executor.executeScript("arguments[0].click()",driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_G2\"]/thead/tr/th[2]")));
				Thread.sleep(200);
				int i=1;
				do {
					periode=ExcelUtils.getCellData(i,0);
					annee=ExcelUtils.getCellData(i,1);
					valeur=ExcelUtils.getCellData1(i, 5);
					String Annee1 =IndicateurPage.GridSuivi.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_G2\"]/tbody/tr["+i+"]/td[2]")).findElement(By.tagName("a")).getText();
					assertTrue(Annee1.equals(annee));
					String periode1 =IndicateurPage.GridSuivi.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_G2\"]/tbody/tr["+i+"]/td[1]")).findElement(By.tagName("a")).getText();
					assertTrue(periode1.equals(periode));
					String ValSaisie=IndicateurPage.GridSuivi.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_G2\"]/tbody/tr["+i+"]/td[3]")).findElement(By.tagName("span")).getText();
					ValSaisie=ValSaisie.replace(',','.');
					assertTrue(ValSaisie.contains(valeur));
					
					if((i==row-1) & (annee.contains(Integer.toString(anneCourante)))) {
						String Moy_GEN=IndicateurPage.MoyenGeneID.getAttribute("value");
						Moy_GEN=Moy_GEN.replace(',','.');
						assertTrue(Moy_GEN.contains(valeur));
						
					}else if ((i==row-1) & (!(annee.contains(Integer.toString(anneCourante))))) {
						String Moy_GEN=IndicateurPage.MoyenGeneID.getAttribute("value");
						assertTrue(Moy_GEN.contains("0"));
					}

					i++;
				}while(i<=row-1);
			}
		}
		
		else if(typerésultat.equals("Moyenne simple")) 
		{
			//driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_G2\"]/thead/tr/th[1]")).click();
			JavascriptExecutor executor=(JavascriptExecutor)driver;
			executor.executeScript("arguments[0].click()",driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_G2\"]/thead/tr/th[1]")));
			Thread.sleep(200);
			//driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_G2\"]/thead/tr/th[2]")).click();
			executor.executeScript("arguments[0].click()",driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_G2\"]/thead/tr/th[2]")));
			Thread.sleep(200);
			int row=IndicateurPage.GridSuivi.findElements(By.tagName("tr")).size();
			if(row==2)
			{
				periode=ExcelUtils.getCellData(1,0);
				annee=ExcelUtils.getCellData(1,1);
				valeur=ExcelUtils.getCellData1(1, 5);
				String periode1=IndicateurPage.GridSuivi.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_G2\"]/tbody/tr/td[1]")).findElement(By.tagName("span")).getText();
				String annee1=IndicateurPage.GridSuivi.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_G2\"]/tbody/tr/td[2]")).findElement(By.tagName("span")).getText();
				String ValSaisie=IndicateurPage.GridSuivi.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_G2\"]/tbody/tr/td[3]")).findElement(By.tagName("span")).getText();
				ValSaisie=ValSaisie.replace(',','.');
				String ValREs=IndicateurPage.GridSuivi.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_G2\"]/tbody/tr/td[4]")).findElement(By.tagName("span")).getText();
				ValREs=ValREs.replace(',','.');
				assertTrue(annee1.contains(annee));
				assertTrue(periode1.contains(periode));
				assertTrue(ValSaisie.contains(valeur));
				assertTrue(ValREs.contains(ValSaisie));
				if(annee.contains(Integer.toString(anneCourante))){
					String Moy_GEN=IndicateurPage.MoyenGeneID.getAttribute("value");
					Moy_GEN=Moy_GEN.replace(',','.');
					assertTrue(Moy_GEN.contains(valeur));
					
				}else {
					String Moy_GEN=IndicateurPage.MoyenGeneID.getAttribute("value");
					assertTrue(Moy_GEN.contains("0"));
				}
			}else 
			{
				float Somme=0;
				float Moyen;
				float Somme1=0;
				float Moyen1;
				int j=0;
				int i=1;
				do {
					ExcelUtils.setExcelFile(path, "SuiviIndicateur");
					periode=ExcelUtils.getCellData(i,0);
					ExcelUtils.setExcelFile(path, "SuiviIndicateur");
					annee=ExcelUtils.getCellData(i,1);
					ExcelUtils.setExcelFile(path, "SuiviIndicateur");
					valeur=ExcelUtils.getCellData1(i, 5);
					String Annee1 =IndicateurPage.GridSuivi.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_G2\"]/tbody/tr["+i+"]/td[2]")).findElement(By.tagName("a")).getText();
					assertTrue(Annee1.equals(annee));
					String periode1 =IndicateurPage.GridSuivi.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_G2\"]/tbody/tr["+i+"]/td[1]")).findElement(By.tagName("a")).getText();
					assertTrue(periode1.equals(periode));
					String ValSaisie=IndicateurPage.GridSuivi.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_G2\"]/tbody/tr["+i+"]/td[3]")).findElement(By.tagName("span")).getText();
					ValSaisie=ValSaisie.replace(',','.');
					assertTrue(ValSaisie.contains(valeur));
					Somme=Somme+Float.valueOf(ValSaisie);
					Moyen=Somme/i;
					String MoyenString = String.format ("%.2f", Moyen);
					String ValREs=IndicateurPage.GridSuivi.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_G2\"]/tbody/tr["+i+"]/td[4]")).findElement(By.tagName("span")).getText();
					ValREs=ValREs.replace(',','.');
					assertTrue(MoyenString.contains(ValREs));
					if(annee.contains(Integer.toString(anneCourante))) 
					{
						j=j+1;
						Somme1=Somme1+Float.valueOf(ValSaisie);
						Moyen1=Somme1/j;
						String MoyenString1 = String.format ("%.2f", Moyen1);
						if(i==row-1) 
						{
							String Moy_GEN=IndicateurPage.MoyenGeneID.getAttribute("value");
							Moy_GEN=Moy_GEN.replace(',','.');
							assertTrue(Moy_GEN.contains(MoyenString1));
						}
					}
					if(j==0)
					{
						String Moy_GEN=IndicateurPage.MoyenGeneID.getAttribute("value");
						assertTrue(Moy_GEN.contains("0"));
					}
					i++;
				}while(i<=row-1);
				
				}
		}

		else if(typerésultat.equals("VALEUR CUMULEE")) 
		{
			int row=IndicateurPage.GridSuivi.findElements(By.tagName("tr")).size();
			if(row==2)
			{
				periode=ExcelUtils.getCellData(1,0);
				annee=ExcelUtils.getCellData(1,1);
				valeur=ExcelUtils.getCellData1(1, 5);
				String periode1=IndicateurPage.GridSuivi.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_G2\"]/tbody/tr/td[1]")).findElement(By.tagName("span")).getText();
				String annee1=IndicateurPage.GridSuivi.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_G2\"]/tbody/tr/td[2]")).findElement(By.tagName("span")).getText();
				String ValSaisie=IndicateurPage.GridSuivi.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_G2\"]/tbody/tr/td[3]")).findElement(By.tagName("span")).getText();
				ValSaisie=ValSaisie.replace(',','.');
				String ValREs=IndicateurPage.GridSuivi.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_G2\"]/tbody/tr/td[4]")).findElement(By.tagName("span")).getText();
				ValREs=ValREs.replace(',','.');
				assertTrue(annee1.contains(annee));
				assertTrue(periode1.contains(periode));
				assertTrue(ValSaisie.contains(valeur));
				assertTrue(ValREs.contains(ValSaisie));
				if(annee.contains(Integer.toString(anneCourante))){
					String Moy_GEN=IndicateurPage.MoyenGeneID.getAttribute("value");
					assertTrue(Moy_GEN.contains(valeur));
					
				}else {
					String Moy_GEN=IndicateurPage.MoyenGeneID.getAttribute("value");
					assertTrue(Moy_GEN.contains("0"));
				}
			}else 
			{
				
				float Somme=0;
				
				int i=1;
				
				do {
					//driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_G2\"]/thead/tr/th[1]")).click();
					JavascriptExecutor executor=(JavascriptExecutor)driver;
					executor.executeScript("arguments[0].click()",driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_G2\"]/thead/tr/th[1]")));
					Thread.sleep(200);
					//driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_G2\"]/thead/tr/th[2]")).click();
					executor.executeScript("arguments[0].click()",driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_G2\"]/thead/tr/th[2]")));
					Thread.sleep(200);
					periode=ExcelUtils.getCellData(i,0);
					annee=ExcelUtils.getCellData(i,1);
					valeur=ExcelUtils.getCellData1(i, 5);
					String Annee1 =IndicateurPage.GridSuivi.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_G2\"]/tbody/tr["+i+"]/td[2]")).findElement(By.tagName("a")).getText();
					assertTrue(Annee1.equals(annee));
					String periode1 =IndicateurPage.GridSuivi.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_G2\"]/tbody/tr["+i+"]/td[1]")).findElement(By.tagName("a")).getText();
					assertTrue(periode1.equals(periode));
					String ValSaisie=IndicateurPage.GridSuivi.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_G2\"]/tbody/tr["+i+"]/td[3]")).findElement(By.tagName("span")).getText();
					ValSaisie=ValSaisie.replace(',','.');
					assertTrue(ValSaisie.contains(valeur));
					Somme=Somme+Float.valueOf(ValSaisie);
					String SommeString = String.format ("%.2f", Somme);
					String ValREs=IndicateurPage.GridSuivi.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_G2\"]/tbody/tr["+i+"]/td[4]")).findElement(By.tagName("span")).getText();
					ValREs=ValREs.replace(',','.');
					assertTrue(ValREs.contains(SommeString));
						if(i==row-1) 
						{
							SommeString = String.format ("%.1f", Somme);
							String Moy_GEN=IndicateurPage.MoyenGeneID.getAttribute("value");
							Moy_GEN=Moy_GEN.replace(',','.');
							System.out.println("s"+SommeString);
							System.out.println("M"+Moy_GEN);
							assertTrue(Moy_GEN.contains(SommeString));
						}
					
					i++;
				}while(i<=row-1);
				
				}
		}
	}

	
	public static  void rattacher_une_action() throws Throwable {
		IndicateurPage.plusAction.click();
		Thread.sleep(500);
		IndicateurPage.rattacherAction_ID.click();
		Thread.sleep(500);
		IndicateurPage.RechercherAction_ID.sendKeys("25380");
		Thread.sleep(500);
		IndicateurPage.VldRechercherAction_ID.click();
		Thread.sleep(500);
		IndicateurPage.action_XPATH.click();
		Thread.sleep(500);
		IndicateurPage.btnValiderRattacherAction_ID.click();
	}


	public static void rattacher_fiche_risque_opportunité() throws Throwable {
		IndicateurPage.listeRisques.click();
		Thread.sleep(500);
		IndicateurPage.rattacherRisque_ID.click();	
		Thread.sleep(500);
		IndicateurPage.risque_XPATH.findElement(By.tagName("span")).findElement(By.tagName("input")).click();
		Thread.sleep(500);
		IndicateurPage.btnValiderChoixRisque_ID.click();
	}


	public static void rechercher_fiche_indicateur_déjà_créer(String typeSuivi, String indicateur, WebDriver driver) throws Throwable {
		if(typeSuivi.equals("Suivi manuel")||typeSuivi.equals("Données de Qualipro"))
		{
		IndicateurModel.cliquerIndicateur(driver);
			Thread.sleep(500);
		IndicateurPage.NIndicateurFiltre_ID.sendKeys(indicateur);
		Thread.sleep(500);
		IndicateurPage.btnRechercherIdicateur_ID.click();
		driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_GridView1\"]/tbody/tr/td[2]/a")).click();
		}
	}

	
	public static void rattacher_pièces_jointes(WebDriver driver) throws Throwable {
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("scroll(250, 0)"); 
		driver.findElement(By.id("ctl00_ContentPlaceHolder1_LinkButton29")).click();
		Thread.sleep(500);
		driver.findElement(By.id("ctl00_ContentPlaceHolder1_LinkButton46")).click();
		driver.findElement(By.id("ctl00_ContentPlaceHolder1_tb_obj")).sendKeys("Test Auto");	
		driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_Panel_ajtpj\"]/div[2]/div[2]/div/div/span/label/span[2]")).click();
		Runtime.getRuntime().exec("E:\\qualipro\\trunk\\AutomatisationTQualiPro_prod\\resources\\Scripts\\joindreFichier.exe");
		driver.findElement(By.id("ctl00_ContentPlaceHolder1_LB_vald_ajtpiec")).click();
		driver.findElement(By.xpath("//*[@id=\"myModalPJ\"]/div/div/div[1]/button")).click();
	}

}