package com.qualiprobdd.e2etests.Client.models;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.qualiprobdd.e2etests.Client.Page.SatisfClientPage;
import com.qualiprobdd.e2etests.Fournisseur.pages.EvalFourPage;
import com.qualiprobdd.e2etests.GRH.Pages.SatisPersonnelPage;
import com.qualiprobdd.e2etests.ReclamationClient.Pages.ReclamationClientPage;
import com.qualiprobdd.e2etests.util.Common;
import com.qualiprobdd.e2etests.util.ExcelUtils;
import com.qualiprobdd.e2etests.util.RandomValue;

;

public class SatisfClientModel {
	public static List<String> informations = new ArrayList<String>();
	
	public static void consulter_SM_satisfactionclient(WebDriver driver) throws Throwable 
	{
		Common.AccéderModule(8, 3, 0, driver);
	}
	public static void consulter_SM_questionnaire(WebDriver driver) throws Throwable {
		Common.AccéderModule(8,3,3, driver);
	}
	
	public static void ajouter_questionnaire(WebDriver driver) throws Throwable {
		//SatisfClientPage.AjtQuestionnaireId.click();
		JavascriptExecutor  executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click()", SatisfClientPage.AjtQuestionnaireId);

		Thread.sleep(500);
	}
	
	public static void saisir_code_questionnaire(String code,int sub) throws Throwable 
	{
		/*String numcode = code.substring(sub);
		int num=Integer.parseInt(numcode);
		System.out.println(num);
		num++;
		System.out.println(num);
		String newcode=Integer.toString(num);
		String str = code.replaceAll(numcode, newcode);
		SatisfClientPage.CodeQuestionnaireId.sendKeys(str);*/
		informations.add(code);
		
		
		
	}
	
	public static void saisir_titre_questionnaire(String code, int sub) throws Throwable {
		/*String numcode = code.substring(sub);
		int num=Integer.parseInt(numcode);
		num++;
		String newcode=Integer.toString(num);
		String str = code.replaceAll(numcode, newcode);
		SatisfClientPage.TitreQuestionnaireId.sendKeys(str);*/
		informations.add(code);
	}
	
	public static void valider_questionnaire() throws Throwable {
		Thread.sleep(500);

		SatisfClientPage.VldQuestionnaireId.click();
		Thread.sleep(500);
	}
	
	public static void Ajouter_Introduction() throws Throwable {
		Thread.sleep(1000);
		SatisfClientPage.IntroId.click();
		Thread.sleep(1000);
		SatisfClientPage.DesIntroId.sendKeys("Bonjour");
		informations.add("Bonjour");
		Thread.sleep(500);
		SatisfClientPage.VldCompQuestionnaireId.click();
	}
	
	public static void Ajouter_fin(WebDriver driver) throws Throwable {
		//SatisfClientPage.FinId.click();
		WebElement Element=driver.findElement(By.cssSelector("*[id^='ctl00_ContentPlaceHolder1_Repeater1_ct'][id$='_Label_fin']"));
		JavascriptExecutor  executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click()", Element);


		Thread.sleep(500);
		SatisfClientPage.DesFinId.sendKeys("Merci pour votre collaboration");
		informations.add("Merci pour votre collaboration");
		Thread.sleep(500);
		executor.executeScript("arguments[0].click()", SatisfClientPage.VldCompQuestionnaireId);
		
	}
	
	public static void ajouter_sections(String nbrsection) throws Throwable {
		
		int nbrsec=Integer.parseInt(nbrsection);
		for(int i=1; i<=nbrsec; i++) 
		{
			SatisfClientPage.AjtSecId.click();
			SatisfClientPage.NomSecId.sendKeys("Section"+i);
			informations.add("Section"+i);
			
			SatisfClientPage.VldCompQuestionnaireId.click();
		}
	}
	
	public static void décrire_question(String typeQues, int j, String obli, String multi) throws Throwable
	{
		if(typeQues.equals("Numérique")||typeQues.equals("Numerical"))
		{
			SatisfClientPage.VarNumId.sendKeys("question"+j);
			SatisfClientPage.LibNumId.sendKeys("Années d\'expériences");
			informations.add("Années d\'expériences");
			SatisfClientPage.LimInfNumId.sendKeys("0");
			SatisfClientPage.LimSupNumId.sendKeys("100");
			int s=RandomValue.randomInt(100);
			if(s%2==0) 
			{
				SatisfClientPage.RepOblId.click();
			}
			
		}
		else if(typeQues.equals("Ouverte")||typeQues.equals("Open-ended question")) 
		{
			SatisfClientPage.VarOuvId.sendKeys("question"+j);
			SatisfClientPage.LibOuvId.sendKeys("Avez vous des remarques?");
			informations.add("Avez vous des remarques?");
			int s=RandomValue.randomInt(100);
			if(s%2==0) 
			{
				SatisfClientPage.RepOblOuvId.click();
			}
		}
		else if(typeQues.equals("Choix multiple")||typeQues.equals("Multiple choice")) {
			SatisfClientPage.VarCmId.sendKeys("question"+j);
			SatisfClientPage.LibCmId.sendKeys("Sexe");
			informations.add("Sexe");
			SatisfClientPage.ModCmId.sendKeys("Femme");
			informations.add("Femme");
			SatisfClientPage.AddModCmId.click();
			SatisfClientPage.ModCmId.sendKeys("Homme");
			informations.add("Homme");
			SatisfClientPage.AddModCmId.click();
			if(obli.equals("VRAI")) 
			{
				SatisfClientPage.RepOblCmId.click();
			}
			if(multi.equals("FAUX")) 
			{
				SatisfClientPage.RepMultCmId.click();
			}
		}
		else if(typeQues.equals("Matrice simple")||typeQues.equals("Simple matrix")) {
			SatisfClientPage.VarMsId.sendKeys("question"+j);
			SatisfClientPage.LibMsId.sendKeys("Expérience Qualipro");
			informations.add("Expérience Qualipro");
			SatisfClientPage.LigneMsId.sendKeys("Ligne 1");
			SatisfClientPage.AddLigneMsId.click();
			SatisfClientPage.LigneMsId.sendKeys("Ligne 2");
			SatisfClientPage.AddLigneMsId.click();
			SatisfClientPage.ColMsId.sendKeys("Colonne 1");
			SatisfClientPage.AddColMsId.click();
			SatisfClientPage.ColMsId.sendKeys("Colonne 2");
			SatisfClientPage.AddColMsId.click();
			if(obli.equals("VRAI")) 
			{
				SatisfClientPage.RepOblMsId.click();
			}
			if(multi.equals("FAUX")) 
			{
				SatisfClientPage.RepMulMsId.click();
			}
		}
		else if(typeQues.equals("Matrice double")||typeQues.equals("Double matrix (Importance – Satisfaction)")) {
			SatisfClientPage.VarMdId.sendKeys("question"+j);
			SatisfClientPage.LibMdId.sendKeys("Niveau de satisfaction");
			informations.add("Niveau de satisfaction");
			SatisfClientPage.LigneMdId.sendKeys("ligne1");
			SatisfClientPage.AddLigneMdId.click();
			SatisfClientPage.LigneMdId.sendKeys("ligne2");
			SatisfClientPage.AddLigneMdId.click();
			SatisfClientPage.ColImpMdId.sendKeys("colonne importance 1");
			SatisfClientPage.AddColImpMdId.click();
			SatisfClientPage.ColImpMdId.sendKeys("colonne importance 2");
			SatisfClientPage.AddColImpMdId.click();
			SatisfClientPage.ColSatMdId.sendKeys("colonne satisfaction 1");
			SatisfClientPage.AddColSatMdId.click();
			SatisfClientPage.ColSatMdId.sendKeys("colonne satisfaction 2");
			SatisfClientPage.AddColSatMdId.click();
			if(obli.equals("VRAI")) 
			{
				SatisfClientPage.RepOblMdId.click();
			}
		}
		else if(typeQues.equals("Matrice multiple")||typeQues.equals("Multiple matrix")) 
		{
			SatisfClientPage.VarMMId.sendKeys("question"+j);
			SatisfClientPage.LibMMId.sendKeys("Domaines d\'affectation utilisés");
			informations.add("Domaines d\'affectation utilisés");
			SatisfClientPage.LigneMMId.sendKeys("ligne1");
			SatisfClientPage.AddLigneMMId.click();
			SatisfClientPage.LigneMMId.sendKeys("ligne2");
			SatisfClientPage.AddLigneMMId.click();
			SatisfClientPage.ColMMId.sendKeys("colonne1");
			SatisfClientPage.AddColMMId.click();
			SatisfClientPage.ColMMId.sendKeys("colonne2");
			SatisfClientPage.AddColMMId.click();
			SatisfClientPage.ModaMMId.sendKeys("modalité 1");
			SatisfClientPage.AddModMMId.click();
			SatisfClientPage.ModaMMId.sendKeys("modalité 2");
			SatisfClientPage.AddModMMId.click();
			SatisfClientPage.ModaMM1Id.sendKeys("modalité 1");
			SatisfClientPage.AddModMM1Id.click();
			SatisfClientPage.ModaMM1Id.sendKeys("modalité 2");
			SatisfClientPage.AddModMM1Id.click();
			int s=RandomValue.randomInt(100);
			if(s%2==0) 
			{
				SatisfClientPage.RepOblMMId.click();
			}
		}
	}
	
	public static String convertir_type(String type1, WebDriver driver)throws Throwable
	{
		String type2= type1;
		Cookie cookie1 = driver.manage().getCookieNamed("lan");
		if(cookie1.getValue().equals("en-US")) {
			if(type1.equals("Numérique")) 
			{
				type2="Numerical";
			}else if(type1.equals("Ouverte")) 
			{
				type2="Open-ended question";
			}else if(type1.equals("Choix multiple")) 
			{
				type2="Multiple choice";
			}else if(type1.equals("Matrice simple")) 
			{
				type2="Simple matrix";
			}else if(type1.equals("Matrice double")) 
			{
				type2="Double matrix (Importance – Satisfaction)";
			}else if(type1.equals("Matrice multiple")) 
			{
				type2="Multiple matrix";
			}
		}
		return type2;
	}
	
	public static void ajouter_questions(String Path1, int row, WebDriver driver) throws Throwable {
		ExcelUtils.setExcelFile(Path1, "Questionnaire");
		String nbrQuestion=ExcelUtils.getCellData(row,3);
		String nbrsection=ExcelUtils.getCellData(row,2);
		int nbrsec=Integer.parseInt(nbrsection);
		int nbrquest=Integer.parseInt(nbrQuestion);
		String type=ExcelUtils.getCellData(row,4);
		type=convertir_type(type,driver);
		String quest_type=ExcelUtils.getCellData(row,5);
		String oblig=ExcelUtils.getCellData(row,6);
		String multi=ExcelUtils.getCellData(row,7);
		int questtype=Integer.parseInt(quest_type);
		int Sec_ques=nbrquest/nbrsec;
		int j=1;
		int k=1;
		int L=1;
		int num=1;
		while(!(type.equals("FIN"))){
			
			if(questtype==0)
			{
				type=ExcelUtils.getCellData(row+j,4);
				type=convertir_type(type,driver);
				quest_type=ExcelUtils.getCellData(row+j,5);
				questtype=Integer.parseInt(quest_type);
				L=1;
				j++;
			}else {
				
				//System.out.println("L"+  L);
				WebElement ele= driver.findElement(By.id("ctl00_ContentPlaceHolder1_Repeater1_ctl0"+k+"_CheckBox2"));
				JavascriptExecutor  executor = (JavascriptExecutor)driver;
				executor.executeScript("arguments[0].click()", ele);
				Thread.sleep(500);
				executor = (JavascriptExecutor)driver;
				executor.executeScript("arguments[0].click()", SatisfClientPage.AjtQuestId);
				Select select = new Select(SatisfClientPage.TypeQuestId);
				select.selectByVisibleText(type);
				Thread.sleep(500);
				décrire_question(type,num,oblig,multi);
				executor = (JavascriptExecutor)driver;
				executor.executeScript("arguments[0].click()", SatisfClientPage.VldCompQuestionnaireId);
				if((L==questtype))
				{
					type=ExcelUtils.getCellData(row+j,4);
					type=convertir_type(type,driver);
					if(!(type.equals("FIN"))) 
					{
						quest_type=ExcelUtils.getCellData(row+j,5);
						questtype=Integer.parseInt(quest_type);
						oblig=ExcelUtils.getCellData(row+j,6);
						multi=ExcelUtils.getCellData(row+j,7);
						L=1;
						j++;
					}
				}else 
				{
					L++;
				}
					//System.out.println("L"+  L);
					//System.out.println("Sec_ques"+  Sec_ques);
					//System.out.println("num"+  num);
				if((num%Sec_ques==0)&&(k<nbrsec))
				{
					k++;
					
				}
				num++;
			}
		}
		
	}
	
	public static void consulter_MEnquete(WebDriver driver) throws Throwable
	{
	Common.AccéderModule(8, 3, 2, driver);
	}
	
	public static void ajouetr_enquete() throws Throwable
	{
		Thread.sleep(500);
		SatisfClientPage.AjtEnqueteId.click();
	}
	
	public static void saisir_ref_enquete(String code,int sub) throws Throwable
	{
		/*String numcode = code.substring(sub);
		int num=Integer.parseInt(numcode);
		num++;
		String newcode=Integer.toString(num);
		String str = code.replaceAll(numcode, newcode);
		SatisfClientPage.RefEnqueteId.sendKeys(str);*/
		informations.add(code);
	}
	
	public static void Choisir_quest_enquete(String titre) throws Throwable
	{
		Select select = new Select(SatisfClientPage.SelectQuestionnaireId);
		select.selectByVisibleText(titre);
	}
	
	public static void saisir_date_debut_enquete(WebDriver driver) throws Throwable
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
		informations.add(Sdate);
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[1].value = arguments[0];",Sdate, SatisfClientPage.DebutEnqueteId);
	}
	
	public static void saisir_date_fin_enquete(WebDriver driver) throws Throwable
	{
		final DateFormat dateFormat;
		SimpleDateFormat df = new SimpleDateFormat("M/d/yyyy");

		Cookie cookie1 = driver.manage().getCookieNamed("lan");
		if(cookie1.getValue().equals("en-US")) {
			dateFormat = new SimpleDateFormat("MM/dd/yyyy");
		}else {
			dateFormat = new SimpleDateFormat("dd/MM/yyyy");

		}
		Date dt = new Date();
		Calendar c = Calendar.getInstance(); 
		c.setTime(dt); 
		c.add(Calendar.DATE,10);
		dt = c.getTime();
		String Sdate = dateFormat.format(dt);
		String date2= df.format(dt);
		System.err.println("date  est   "+ date2);
		informations.add(date2);
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[1].value = arguments[0];",Sdate, SatisfClientPage.FinEnqueteId);
		
	}
	
	public static void choisir_mode_enquete(String mode) throws Throwable
	{
		if(mode.equals("ANONYME")) 
		{
			SatisfClientPage.ModeAnonymeId.click();
		}
	}
	
	public static void valider_enquete(WebDriver driver) throws Throwable
	{
		JavascriptExecutor  executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click()", SatisfClientPage.VldEnqueteId);
		Thread.sleep(500);
	}
	
	public static void ajouter_coef_quest_jauge(String Path1, WebDriver driver, int row) throws Throwable
	{
		
		ExcelUtils.setExcelFile(Path1,"EnqueteClient");
	//	SatisfClientPage.SPQuesJaugeId.click();
		Thread.sleep(1000);
		JavascriptExecutor  executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click()", SatisfClientPage.SPQuesJaugeId);
		
		Thread.sleep(500);
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
				String coef=ExcelUtils.getCellData(j,2);
				cellIneed = SatisfClientPage.GridQuestJaugeId.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_GridView_sastis\"]/tbody/tr["+i+"]/td[2]"));
				cellIneed.findElement(By.tagName("input")).sendKeys(coef);
				i++;
			}
		}
		SatisfClientPage.VldCoeffJauge.click();
		
	}
	
	public static void rattacher_client(String Path1, WebDriver driver, int row) throws Throwable
	{
		
		ExcelUtils.setExcelFile(Path1,"EnqueteClient");
		String mode=ExcelUtils.getCellData(row,1);
		if(!(mode.equals("ANONYME")))
		{
		SatisfClientPage.SPClientId.click();
		Thread.sleep(500);
		String client;
		int i=0;
		do {
		client=ExcelUtils.getCellData(row+i,3);
		if(!(client.equals(""))) {
		SatisfClientPage.RattClientId.click();
		Thread.sleep(500);
		SatisfClientPage.RechClientId.clear();
		SatisfClientPage.RechClientId.sendKeys(client);
		SatisfClientPage.GridClientId.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_GridView3\"]/tbody/tr/td[1]")).findElement(By.tagName("input")).click();
		SatisfClientPage.RechClientId.clear();
		SatisfClientPage.VldClientId.click();
		i++;
		}}while(!(client.equals("")));
		}
		
		
	}
	
	public static void rattacher_action() throws Throwable
	{
		SatisfClientPage.SPActionId.click();
		Thread.sleep(500);
		SatisfClientPage.RattActionId.click();
		Thread.sleep(1000);
		SatisfClientPage.GridActionId.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_GridView6\"]/tbody/tr[1]/td[1]")).findElement(By.tagName("input")).click();
		Thread.sleep(500);
		SatisfClientPage.VldRattActionId.click();
		Thread.sleep(500);
	}
	
	public static void valider_compo_enquete(WebDriver driver) throws Throwable
	{
		JavascriptExecutor  executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click()", SatisfClientPage.VldEnqueteGenId);

	}

	public static void consulter_MEnregistrementRéponse(WebDriver driver) throws Throwable
	{
		Common.AccéderModule(8, 3, 1, driver);
		Thread.sleep(500);
	}

	public static void saisir_référence_enquête_à_répondre(String ref) throws Throwable {
		Thread.sleep(500);
		SatisfClientPage.RefEnqEnrRepId.sendKeys(ref);
	}

	public static void rechercher_enquête_à_répondre() throws Throwable {
		Thread.sleep(500);
		SatisfClientPage.RechEnqEnrRepId.click();
	}

	public static void consulter_fiche_enquête_à_répondre() throws Throwable {
		SatisfClientPage.GridEnqEnrRepId.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_GridView1\"]/tbody/tr/td[1]")).findElement(By.tagName("a")).click();
	}


	public static void enregistrer_réponses_client(String Path1, WebDriver driver, int row) throws Throwable 
	{
		ExcelUtils.setExcelFile(Path1,"Questionnaire");
		String numquestion=ExcelUtils.getCellData(row,3);
		int num=Integer.parseInt(numquestion);
		System.out.println("num question: "+num);
		int i=0;
		//driver.findElement(By.id("ctl00_ContentPlaceHolder1_LinkButtonNouvRep")).click();
		while(i<num) {
			Select select = new Select(SatisfClientPage.TypeQuesRepId);
			String type =select.getFirstSelectedOption().getText();
			int randnum;
			if(type.equals("Numérique")||type.equals("Numerical"))
			{
				int repnum=RandomValue.randomInt(100);
				System.out.println("rand num: "+repnum);
				SatisfClientPage.RepNumId.clear();
				SatisfClientPage.RepNumId.sendKeys(Integer.toString(repnum));
				Actions action = new Actions(driver);
				action.moveToElement(SatisfClientPage.VldRepId).perform();
				JavascriptExecutor  executor = (JavascriptExecutor)driver;
				executor.executeScript("arguments[0].click()", SatisfClientPage.VldRepId);
				
			}else if(type.equals("Ouverte")||type.equals("Open-ended question"))
			{
				SatisfClientPage.RepOuvId.clear();
				SatisfClientPage.RepOuvId.sendKeys(RandomValue.randomString(10));
				Actions action = new Actions(driver);
				action.moveToElement(SatisfClientPage.VldRepId).perform();
				
				JavascriptExecutor  executor = (JavascriptExecutor)driver;
				executor.executeScript("arguments[0].click()", SatisfClientPage.VldRepId);
			}else if(type.equals("Choix multiple")||type.equals("Multiple choice"))
			{
				randnum=RandomValue.randomInt(10000);
				if(randnum%2==0) {
				SatisfClientPage.RepCM1Id.click();
				}else 
				{
					SatisfClientPage.RepCM2Id.click();
				
				}
				Actions action = new Actions(driver);
				action.moveToElement(SatisfClientPage.VldRepId).perform();
				
				JavascriptExecutor  executor = (JavascriptExecutor)driver;
				executor.executeScript("arguments[0].click()", SatisfClientPage.VldRepId);
			}else if(type.equals("Matrice simple")||type.equals("Simple matrix"))
			{
				randnum=RandomValue.randomInt(10000);
				if(randnum%2==0) {
					SatisfClientPage.RepMSId.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_GridView_MatriceS\"]/tbody/tr[2]/td[2]")).findElement(By.tagName("span")).findElement(By.tagName("input")).click();
				}else 
				{
					SatisfClientPage.RepMSId.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_GridView_MatriceS\"]/tbody/tr[2]/td[3]")).findElement(By.tagName("span")).findElement(By.tagName("input")).click();
				
				}
				randnum=RandomValue.randomInt(10000);
				if(randnum%2==0) {
					SatisfClientPage.RepMSId.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_GridView_MatriceS\"]/tbody/tr[3]/td[2]")).findElement(By.tagName("span")).findElement(By.tagName("input")).click();
				}else 
				{
					SatisfClientPage.RepMSId.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_GridView_MatriceS\"]/tbody/tr[3]/td[3]")).findElement(By.tagName("span")).findElement(By.tagName("input")).click();
				
				}
				Actions action = new Actions(driver);
				action.moveToElement(SatisfClientPage.VldRepId).perform();
				
				JavascriptExecutor  executor = (JavascriptExecutor)driver;
				executor.executeScript("arguments[0].click()", SatisfClientPage.VldRepId);
			}else if(type.equals("Matrice double")||type.equals("Double matrix (Importance – Satisfaction)"))
			{
				randnum=RandomValue.randomInt(10000);
				if(randnum%2==0) {
					try {
					WebElement element=SatisfClientPage.RepMDId.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_GridView_MatriceD\"]/tbody/tr[1]/td[2]"));
					element.isDisplayed();
					element.findElement(By.tagName("span")).findElement(By.tagName("input")).click();
					}catch (NoSuchElementException e) {
						SatisfClientPage.RepMDId.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_GridView_MatriceD\"]/tbody/tr[2]/td[2]")).findElement(By.tagName("span")).findElement(By.tagName("input")).click();
					}
				}else 
				{
					try {
						WebElement element=SatisfClientPage.RepMDId.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_GridView_MatriceD\"]/tbody/tr[1]/td[3]"));
						element.isDisplayed();
						element.findElement(By.tagName("span")).findElement(By.tagName("input")).click();
					}catch (NoSuchElementException e) {
							SatisfClientPage.RepMDId.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_GridView_MatriceD\"]/tbody/tr[2]/td[3]")).findElement(By.tagName("span")).findElement(By.tagName("input")).click();
					}
				}
				randnum=RandomValue.randomInt(10000);
				if(randnum%2==0) {
					try {
						WebElement element=SatisfClientPage.RepMDId.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_GridView_MatriceD\"]/tbody/tr[1]/td[4]"));
						element.isDisplayed();
						element.findElement(By.tagName("span")).findElement(By.tagName("input")).click();
					}catch (NoSuchElementException e) {
							SatisfClientPage.RepMDId.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_GridView_MatriceD\"]/tbody/tr[2]/td[4]")).findElement(By.tagName("span")).findElement(By.tagName("input")).click();
					}
				}else 
				{
					try {
						WebElement element=SatisfClientPage.RepMDId.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_GridView_MatriceD\"]/tbody/tr[1]/td[5]"));
						element.isDisplayed();
						element.findElement(By.tagName("span")).findElement(By.tagName("input")).click();
					}catch (NoSuchElementException e) {
							SatisfClientPage.RepMDId.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_GridView_MatriceD\"]/tbody/tr[2]/td[5]")).findElement(By.tagName("span")).findElement(By.tagName("input")).click();
					}
				}
				randnum=RandomValue.randomInt(10000);
				if(randnum%2==0) {
					try {
						WebElement element=SatisfClientPage.RepMDId.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_GridView_MatriceD\"]/tbody/tr[1]/td[2]"));
						element.isDisplayed();
						SatisfClientPage.RepMDId.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_GridView_MatriceD\"]/tbody/tr[2]/td[2]")).findElement(By.tagName("span")).findElement(By.tagName("input")).click();
					}catch (NoSuchElementException e) {
							SatisfClientPage.RepMDId.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_GridView_MatriceD\"]/tbody/tr[3]/td[2]")).findElement(By.tagName("span")).findElement(By.tagName("input")).click();
					}
				}else 
				{
					try {
						WebElement element=SatisfClientPage.RepMDId.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_GridView_MatriceD\"]/tbody/tr[1]/td[3]"));
						element.isDisplayed();
						SatisfClientPage.RepMDId.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_GridView_MatriceD\"]/tbody/tr[2]/td[3]")).findElement(By.tagName("span")).findElement(By.tagName("input")).click();
					}catch (NoSuchElementException e) {
							SatisfClientPage.RepMDId.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_GridView_MatriceD\"]/tbody/tr[3]/td[3]")).findElement(By.tagName("span")).findElement(By.tagName("input")).click();
					}
				}
				randnum=RandomValue.randomInt(10000);
				if(randnum%2==0) {
				try {
						WebElement element=SatisfClientPage.RepMDId.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_GridView_MatriceD\"]/tbody/tr[1]/td[4]"));
						element.isDisplayed();
						SatisfClientPage.RepMDId.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_GridView_MatriceD\"]/tbody/tr[2]/td[4]")).findElement(By.tagName("span")).findElement(By.tagName("input")).click();
					}catch (NoSuchElementException e) {
							SatisfClientPage.RepMDId.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_GridView_MatriceD\"]/tbody/tr[3]/td[4]")).findElement(By.tagName("span")).findElement(By.tagName("input")).click();
					}
				}else 
				{
				try {
						WebElement element=SatisfClientPage.RepMDId.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_GridView_MatriceD\"]/tbody/tr[1]/td[5]"));
						element.isDisplayed();
						SatisfClientPage.RepMDId.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_GridView_MatriceD\"]/tbody/tr[2]/td[5]")).findElement(By.tagName("span")).findElement(By.tagName("input")).click();
					}catch (NoSuchElementException e) {
							SatisfClientPage.RepMDId.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_GridView_MatriceD\"]/tbody/tr[3]/td[5]")).findElement(By.tagName("span")).findElement(By.tagName("input")).click();
					}
				}
				Actions action = new Actions(driver);
				action.moveToElement(SatisfClientPage.VldRepId).perform();
				
				JavascriptExecutor  executor = (JavascriptExecutor)driver;
				executor.executeScript("arguments[0].click()", SatisfClientPage.VldRepId);
				
			}else if(type.equals("Matrice multiple")||type.equals("Multiple matrix"))
			{
				WebElement Ineed;
				int ind;
				try {
					WebElement element=SatisfClientPage.RepMMId.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_GridView_MatriceM\"]/tbody/tr[1]/td[2]"));
					element.isDisplayed();
					Ineed=SatisfClientPage.RepMMId.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_GridView_MatriceM\"]/tbody/tr[1]/td[2]")).findElement(By.tagName("select"));
				}catch (NoSuchElementException e) {
					Ineed=SatisfClientPage.RepMMId.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_GridView_MatriceM\"]/tbody/tr[2]/td[2]")).findElement(By.tagName("select"));
				}
				randnum=RandomValue.randomInt(10000);
				if(randnum%2==0) 
				{
					ind=1;
				}else {ind=2;}
				Select select2 = new Select(Ineed);
				select2.selectByIndex(ind);
				
				
				try {
					WebElement element=SatisfClientPage.RepMMId.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_GridView_MatriceM\"]/tbody/tr[1]/td[3]"));
					element.isDisplayed();
					Ineed=SatisfClientPage.RepMMId.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_GridView_MatriceM\"]/tbody/tr[1]/td[3]")).findElement(By.tagName("select"));
				}catch (NoSuchElementException e) {
					Ineed=SatisfClientPage.RepMMId.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_GridView_MatriceM\"]/tbody/tr[2]/td[3]")).findElement(By.tagName("select"));
				}
				randnum=RandomValue.randomInt(10000);
				if(randnum%2==0) 
				{
					ind=1;
				}else {ind=2;}
				select2 = new Select(Ineed);
				select2.selectByIndex(ind);
				
				try {
					WebElement element=SatisfClientPage.RepMMId.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_GridView_MatriceM\"]/tbody/tr[1]/td[2]"));
					element.isDisplayed();
					Ineed=SatisfClientPage.RepMMId.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_GridView_MatriceM\"]/tbody/tr[2]/td[2]")).findElement(By.tagName("select"));
				}catch (NoSuchElementException e) {
					Ineed=SatisfClientPage.RepMMId.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_GridView_MatriceM\"]/tbody/tr[3]/td[2]")).findElement(By.tagName("select"));
				}
				randnum=RandomValue.randomInt(10000);
				if(randnum%2==0) 
				{
					ind=1;
				}else {ind=2;}
				select2 = new Select(Ineed);
				select2.selectByIndex(ind);
				
				try {
					WebElement element=SatisfClientPage.RepMMId.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_GridView_MatriceM\"]/tbody/tr[1]/td[2]"));
					element.isDisplayed();
					Ineed=SatisfClientPage.RepMMId.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_GridView_MatriceM\"]/tbody/tr[2]/td[3]")).findElement(By.tagName("select"));
				}catch (NoSuchElementException e) {
					Ineed=SatisfClientPage.RepMMId.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_GridView_MatriceM\"]/tbody/tr[3]/td[3]")).findElement(By.tagName("select"));
				}
				
				randnum=RandomValue.randomInt(10000);
				if(randnum%2==0) 
				{
					ind=1;
				}else {ind=2;}
				select2 = new Select(Ineed);
				select2.selectByIndex(ind);
				Thread.sleep(500);
				Actions action = new Actions(driver);
				action.moveToElement(SatisfClientPage.VldRepId).perform();
				
				JavascriptExecutor  executor = (JavascriptExecutor)driver;
				executor.executeScript("arguments[0].click()", SatisfClientPage.VldRepId);
			}
			
			Thread.sleep(500);
			i++;
		}
	  
	}

	
	

}
