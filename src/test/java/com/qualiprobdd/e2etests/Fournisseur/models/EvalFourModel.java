package com.qualiprobdd.e2etests.Fournisseur.models;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.nio.file.Path;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.qualiprobdd.e2etests.Fournisseur.pages.EvalFourPage;
import com.qualiprobdd.e2etests.util.Common;
import com.qualiprobdd.e2etests.util.ExcelUtils;


public class EvalFourModel {
	private static String Path = "resources/testData/TestData.xlsx";
	static int randomNum;

	public static boolean typProduit=true;
	public static void Consulter_Fournisseur(WebDriver driver) throws Throwable{
		JavascriptExecutor  executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click()", EvalFourPage.menuID);
		Thread.sleep(500);
		Common.AccéderModule(9,0,0,driver);
	}
	public static void Consulter_Evaluation_Fournisseur(WebDriver driver) throws Throwable
	{
		Common.AccéderModule(9,1,0,driver);
		
	}
	public static void Ajouter_evaluation()
	{
		EvalFourPage.AjouterID.click();
		Common.Exporter_visibilité("Nouvelle Fiche Evaluation Fournisseur");
		Common.Exporter_champ_A_masquer("Nouvelle Fiche Evaluation Fournisseur");
	}
	public static void Selectionner_fournisseur(String arg1,WebDriver driver) throws Throwable
	{
		//EvalFourPage.SelectFrnEvalID.click();
		Thread.sleep(1000);
		JavascriptExecutor  executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click()",EvalFourPage.SelectFrnEvalID);
		Thread.sleep(1000);
		EvalFourPage.RechFrnEvalID.sendKeys(arg1);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		//jse.executeScript("arguments[1].value = arguments[0];",arg1, EvalFourPage.RechFrnEvalID);
		Thread.sleep(1000);
		//EvalFourPage.ChxFrnEvalID.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_GridView5\"]/tbody/tr/td[1]")).findElement(By.tagName("a")).click();
		JavascriptExecutor  executor5 = (JavascriptExecutor)driver;
		executor5.executeScript("arguments[0].click()",EvalFourPage.ChxFrnEvalID.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_GridView5\"]/tbody/tr/td[1]")).findElement(By.tagName("a")));
	}
	public static void Selectionner_type_produit(String arg1) throws InterruptedException {
		Thread.sleep(1000);

		Select select = new Select(EvalFourPage.ChxTypPdtID);
		select.selectByVisibleText(arg1);
	}
	public static void Selectionner_date_création(WebDriver driver) throws InterruptedException {
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
		c.add(Calendar.DATE,-7);
		dt = c.getTime();
		String Sdate = dateFormat.format(dt);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[1].value = arguments[0];",Sdate, EvalFourPage.ChxDteCreaID);
	}
	public static void Choisir_site(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		try {
			
			EvalFourPage.siteID.isDisplayed();
			Common.Exporter_visibilité("le site est visible");
			String text=driver.findElement(By.id("ctl00_ContentPlaceHolder1_lbsite2")).getText();
			if(text.indexOf('*')!=-1) 
			{
				Common.Exporter_visibilité("le site est obligatoire");
			}else 
			{
				Common.Exporter_visibilité("le site n'est pas obligatoire");
				
			}
			Select select = new Select(EvalFourPage.siteID);
			select.selectByVisibleText("SITE AUTO");
			}
			catch (NoSuchElementException e) {
				Common.Exporter_visibilité("le site est invisible");
			}
	}
	public static void Choisir_processus(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		try {
			EvalFourPage.processusID.isDisplayed();
		Common.Exporter_visibilité("le processus est visible");
		String text=driver.findElement(By.id("ctl00_ContentPlaceHolder1_LblProcessus_")).getText();
		if(text.indexOf('*')!=-1) 
		{
			Common.Exporter_visibilité("le processus est obligatoire");
		}else 
		{
			Common.Exporter_visibilité("le processus n'est pas obligatoire");
			
		}
		Select select = new Select(EvalFourPage.processusID);
		select.selectByVisibleText("PROCESSUS AUTO");
		}
		catch (NoSuchElementException e) {
			Common.Exporter_visibilité("le processus est invisible");
		}
	}
	public static void Choisir_activité(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		try {
			EvalFourPage.activiteID.isDisplayed();
			Common.Exporter_visibilité("l'activité est visible");
			String text=driver.findElement(By.id("ctl00_ContentPlaceHolder1_LblDomaine_")).getText();
			if(text.indexOf('*')!=-1) 
			{
				Common.Exporter_visibilité("l'activité est obligatoire");
			}else 
			{
				Common.Exporter_visibilité("l'activité n'est pas obligatoire");
				
			}
			Select select = new Select(EvalFourPage.activiteID);
			select.selectByVisibleText("ACTIVITE AUTO");
			}
			catch (NoSuchElementException e) {
				Common.Exporter_visibilité("l'activité est invisible");
			}
		
	}
	public static void Choisir_direction(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		try {
			EvalFourPage.directionID.isDisplayed();
			Common.Exporter_visibilité("la direction est visible");
			String text=driver.findElement(By.id("ctl00_ContentPlaceHolder1_LabelDirPilot")).getText();
			if(text.indexOf('*')!=-1) 
			{
				Common.Exporter_visibilité("la direction est obligatoire");
			}else 
			{
				Common.Exporter_visibilité("la direction n'est pas obligatoire");
				
			}
			Select select = new Select(EvalFourPage.directionID);
			select.selectByVisibleText("DIRECTION AUTO");
			}
			catch (NoSuchElementException e) {
				Common.Exporter_visibilité("la direction est invisible");
			}
	}
	public static void Choisir_service(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		try {
			EvalFourPage.serviceID.isDisplayed();
			Common.Exporter_visibilité("le service est visible");
			String text=driver.findElement(By.id("ctl00_ContentPlaceHolder1_LblService_")).getText();
			if(text.indexOf('*')!=-1) 
			{
				Common.Exporter_visibilité("le service est obligatoire");
			}else 
			{
				Common.Exporter_visibilité("le service n'est pas obligatoire");
			}
			Select select = new Select(EvalFourPage.serviceID);
			select.selectByVisibleText("SERVICE AUTO");
			}
			catch (NoSuchElementException e) {
				Common.Exporter_visibilité("le service est invisible");
			}
	}
	public static void Valider_Evaluation(WebDriver driver)throws Exception
	{
		Thread.sleep(1000);
		JavascriptExecutor  executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click()",EvalFourPage.VldAjtID);
		//EvalFourPage.VldAjtID.click();
	}
	
	public static void verifier_creation_evaluation_FRN() throws Exception
	{
		
	}
	public static void Rattacher_PJ() throws Exception
	{
		EvalFourPage.AjtPJID.click();
		Thread.sleep(1000);
		EvalFourPage.ObjPJID.sendKeys("pièce jointe");
		EvalFourPage.BTNAjtPJID.click();
		Thread.sleep(500);
		Runtime.getRuntime().exec("E:\\qualipro\\trunk\\AutomatisationTQualiPro_prod\\resources\\Scripts\\joindreFichier.exe");
		Thread.sleep(500);
		EvalFourPage.ValdAjtPJID.click();
	}
	
	public static void Rattacher_NC(WebDriver driver) throws Throwable
	{
		Thread.sleep(1000);
		//EvalFourPage.SpnNCID.click();
		JavascriptExecutor  executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click()", EvalFourPage.SpnNCID);
		Thread.sleep(500);
		//EvalFourPage.RattNCID.click();
		JavascriptExecutor  executor2 = (JavascriptExecutor)driver;
		executor2.executeScript("arguments[0].click()",EvalFourPage.RattNCID);
		Thread.sleep(500);
		try {
		EvalFourPage.GridNCID.isDisplayed();
		int row=EvalFourPage.GridNCID.findElements(By.tagName("tr")).size();
		if(row==2)
		EvalFourPage.GridNCID.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_GridView3\"]/tbody/tr/td[1]")).findElement(By.tagName("input")).click();
		else {
			EvalFourPage.GridNCID.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_GridView3\"]/tbody/tr[1]/td[1]")).findElement(By.tagName("input")).click();
		}
			EvalFourPage.VldRattNCID.click();
		}catch (NoSuchElementException e) {
			System.out.println("Ce fournisseur n'admet pas des non conformité");
			EvalFourPage.QttRattNCID.click();
		}
		
	}
	public static void Rattacher_RF(WebDriver driver) throws Throwable
	{
		JavascriptExecutor  executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click()", EvalFourPage.SpnRFID);
		Thread.sleep(500);
		//EvalFourPage.RattRFID.click();
		JavascriptExecutor  executor2 = (JavascriptExecutor)driver;
		executor2.executeScript("arguments[0].click()",EvalFourPage.RattRFID);
		Thread.sleep(1000);
		try {
		EvalFourPage.GridRFID.isDisplayed();
		int row=EvalFourPage.GridRFID.findElements(By.tagName("tr")).size();
		if(row==2)
		EvalFourPage.GridRFID.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_GridView_recfr\"]/tbody/tr/td[1]")).findElement(By.tagName("input")).click();
		else {
			EvalFourPage.GridRFID.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_GridView_recfr\"]/tbody/tr[1]/td[1]")).findElement(By.tagName("input")).click();
		}
			EvalFourPage.VldRattRFID.click();
		}catch (NoSuchElementException e) {
			System.out.println("Ce fournisseur n'admet pas des réclamations");
			EvalFourPage.QttRattRFID.click();
		}
	}
	
	public static void Consulter_agenda(WebDriver driver) throws Throwable
	{
		Thread.sleep(500);
		//EvalFourPage.AgdFrnID.click();
		JavascriptExecutor  executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click()",EvalFourPage.AgdFrnID);
		Thread.sleep(500);
		//EvalFourPage.AgdAvalFrnID.click();
		JavascriptExecutor  executor2 = (JavascriptExecutor)driver;
		executor2.executeScript("arguments[0].click()", EvalFourPage.AgdAvalFrnID);
	}
	
	public static void consulter_type_produit(String typ_pdt, WebDriver driver) throws Throwable 
	{
		//System.out.println(typ_pdt);
		WebElement cellIneed;
		WebElement cellIneed1;
		String type_name;
		Actions action = new Actions(driver);
		action.moveToElement(EvalFourPage.GridTypPdtID).perform();
		Thread.sleep(500);
		List<WebElement> allRows=EvalFourPage.GridTypPdtID.findElements(By.tagName("tr"));
		int i=1;
		while(i<allRows.size()) 
		{
			cellIneed = EvalFourPage.GridTypPdtID.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_GridView_TypeProd\"]/tbody/tr["+i+"]/td"));
			cellIneed1 = cellIneed.findElement(By.tagName("a"));
			type_name=cellIneed1.getText();
			//System.out.println(type_name);
			if(typ_pdt.contains(type_name)) 
			{
				System.out.println(" click  -->"+cellIneed1.getText());
				cellIneed1.click();
				Thread.sleep(500);
				break;
			}
			i++;
		 }
		
		 if(i==allRows.size()) {
			 System.out.println("Vous n'êtes pas responsable à ce type de produit");
			 typProduit=false;
		 } 
	}

	public static void Evaluer_critère(String crit,String Num_Eval, WebDriver driver, String note,int arg3) throws Throwable
	{
		Thread.sleep(1000);
		WebElement cellIneed3 = null;
     	WebElement cellIneed2=null;

		if(typProduit==true) 
		{

			List<WebElement> allRows=EvalFourPage.GridEvalFrnAgdID.findElements(By.tagName("tr"));
			List<WebElement> allCols=EvalFourPage.GridTypPdtID.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_GridView1\"]/tbody/tr[1]")).findElements(By.tagName("td"));
			int i=allRows.size()-1;
			System.out.println("size of  list = "+allRows.size());
			System.out.println("size of  list coll = "+allCols.size());
			int j=arg3;

			//	WebElement cellIneed = EvalFourPage.GridEvalFrnAgdID.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_GridView1\"]/tbody/tr["+i+"]/td[1]"));
			//	WebElement cellIneed1 = cellIneed.findElement(By.tagName("a"));
				//if(cellIneed1.getText().equals(Num_Eval))
			//	{
				//	System.out.println("je suit la fiche"+cellIneed1.getText());
				//	 int j=6;


//table[@id='ctl00_ContentPlaceHolder1_GridView1']/tbody/tr/td[6]

			try{

				if(allRows.size()<3){
					cellIneed2= EvalFourPage.GridEvalFrnAgdID.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_GridView1\"]/tbody/tr/td["+j+"]"));

					//*[@id="ctl00_ContentPlaceHolder1_GridView1"]/tbody/tr[2]/td[7]
				}else{
					                                                                         //*[@id="ctl00_ContentPlaceHolder1_GridView1"]/tbody/tr[3]/td[7]
					System.out.println("i   =    "+i);
					System.out.println("j   =    "+j);
					Thread.sleep(1000);
					//*[@id="ctl00_ContentPlaceHolder1_GridView1"]/tbody/tr[4]/td[7]
					cellIneed2= EvalFourPage.GridEvalFrnAgdID.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_GridView1\"]/tbody/tr["+i+"]/td["+j+"]"));

				}
					 cellIneed3 = cellIneed2.findElement(By.tagName("input"));}
					catch(NoSuchElementException exp){
						System.err.println(" finsh  for *--------------------> ");

					}
						 String attribute="readonly";
			System.err.println(" finsh  arg3 *--------------------> "+arg3);
						 String nom_cri=EvalFourPage.GridEvalFrnAgdID.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_GridView1\"]/thead/tr/th["+j+"]")).getText();
					System.out.println("je suit le critère qualipro"+nom_cri);
						System.out.println("je suit le critère excel"+crit);


							 Thread.sleep(2000);
							 if(arg3==6){


							 	ExcelUtils.setExcelFile(Path,"CritèreTypeProduit");

								 ExcelUtils.setCellData1(ExcelUtils.getCellData1(1,2),1,4,Path,"CritèreTypeProduit");
								 Thread.sleep(2000);

								 ExcelUtils.setCellData1(ExcelUtils.getCellData1(2,2),2,4,Path,"CritèreTypeProduit");

								 randomNum =  (int)(Math.random() *5);
								 System.out.println("le critère  random egal "+randomNum);

								 ExcelUtils.setCellData1(String.valueOf(randomNum),1,2,Path,"CritèreTypeProduit");
								 cellIneed3.clear();
							 cellIneed3.sendKeys(String.valueOf(randomNum));}

							 else{
								 ExcelUtils.setExcelFile(Path,"CritèreTypeProduit");
								 randomNum =  (int)(Math.random() *5);
								 System.out.println("le critère  random 2 egal "+randomNum);
								 Thread.sleep(2000);
								 ExcelUtils.setCellData1(String.valueOf(randomNum),2,2,Path,"CritèreTypeProduit");
								 cellIneed3.clear();
								 Thread.sleep(2000);
								 cellIneed3.sendKeys(String.valueOf(randomNum));}

							// JavascriptExecutor jse = (JavascriptExecutor)driver;
							// jse.executeScript("arguments[1].value = arguments[0];",note,cellIneed3 );




								 }
		Thread.sleep(1000);
		EvalFourPage.ValdEvalFrnAgdID.click();
						 }


	public static void consulter_fiche(String arg1,String arg2,String arg3) throws Throwable
	{Thread.sleep(1000);
		EvalFourPage.SelectFrnID.click();
		Thread.sleep(1000);
		EvalFourPage.RechSelectFrnID.click();
		Thread.sleep(1000);
		EvalFourPage.RechSelectFrnID.sendKeys(arg1);
		Thread.sleep(1000);
		EvalFourPage.GridSelectFrnID.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_GridView5_copie\"]/tbody/tr/td[1]")).findElement(By.tagName("a")).click();
		Select select = new Select(EvalFourPage.type_produitID);
		select.selectByVisibleText(arg2);
		Thread.sleep(1000);
		EvalFourPage.RechercherID.click();
		Thread.sleep(1000);
		EvalFourPage.RechRapEvalFrn.sendKeys(arg3);
		Thread.sleep(1000);
		EvalFourPage.ValdRechRapEvalFrn.click();
		List<WebElement> allRows=EvalFourPage.GridEvalFrnID.findElements(By.tagName("tr"));
		 int j=2;
		 while(j<=allRows.size())
		 {
			 Thread.sleep(1000);
			 WebElement cellIneed2 = EvalFourPage.GridEvalFrnAgdID.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_GridView1\"]/tbody/tr["+j+"]/td[2]"));
			 WebElement cellIneed3 = cellIneed2.findElement(By.tagName("a")); 
			 if(cellIneed3.getText().contains(arg3)) 
			 {
				 cellIneed3.click();
				 break;
			 }
			 j++;
		 }
	}
	public static void Vérifier_historique(WebDriver driver,int arg1)throws Throwable
	{
		if(arg1==7) {


			Cookie cookie1 = driver.manage().getCookieNamed("lan");
			Thread.sleep(1000);
			try {
				EvalFourPage.widEvaprePannel.click();
			} catch (NoSuchElementException exp) {
				Thread.sleep(500);

			}


			String nnote = EvalFourPage.NoteGlobaleID.getAttribute("value");
			int j = arg1;

				WebElement n1 = EvalFourPage.GridEvaluationID.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_GridView_EvalPrec\"]/tbody/tr[1]/td[3]")).findElement(By.tagName("span"));
				WebElement n2 = EvalFourPage.GridEvaluationID.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_GridView_EvalPrec\"]/tbody/tr[2]/td[3]")).findElement(By.tagName("span"));
			System.out.println("critere 1" + n1);
			System.out.println("critere 2" + n2);
				System.out.println("nnote golbal" );
				float gbl = Float.parseFloat(nnote);
				float gbl1 = Float.parseFloat(n1.getText());
				float gbl2 = Float.parseFloat(n1.getText());
			ExcelUtils.setExcelFile(Path, "CritèreTypeProduit");
			String nn1 =ExcelUtils.getCellData1(1,4);
			String nn2 =ExcelUtils.getCellData1(2,4);
			assertEquals(Float.parseFloat(nn1),gbl1);
			assertEquals(Float.parseFloat(nn2),gbl2);


			assertEquals(gbl, (gbl1 + gbl2) / 2);
			}

		}


	public static void Vérifier_note(String path, WebDriver driver,int arg1,int col) throws Throwable
	{
		Cookie cookie1 = driver.manage().getCookieNamed("lan");
		Thread.sleep(1000);
try{		EvalFourPage.SpnEvalFrnID.click();}
catch (NoSuchElementException exp){
	Thread.sleep(500);

}



		 String note_cal = "";
		 String nnote = EvalFourPage.NoteGlobaleID.getAttribute("value");
		 int j=arg1;



			 	WebElement cellIneed = EvalFourPage.GridEvaluationID.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_GridView2\"]/tbody/tr["+j+"]/td[1]"));
			 	WebElement cellIneed1 = cellIneed.findElement(By.tagName("span"));
			 	ExcelUtils.setExcelFile(path, "CritèreTypeProduit");
				String critere=ExcelUtils.getCellData(j,0);
				System.out.println(" j = "+j);
				String note=ExcelUtils.getCellData(1,2);
			 System.out.println("  note "+note+ j + "= j");
				System.out.println("critere"+cellIneed1.getText());

						WebElement cellIneed2 = EvalFourPage.GridEvaluationID.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_GridView2\"]/tbody/tr["+j+"]/td[3]")).findElement(By.tagName("span"));
						String champ_vide="-";
						if(cellIneed2.getText().contains(champ_vide)) 
						{
							assertTrue(nnote.contains(champ_vide));
							assertTrue(driver.findElement(By.id("ctl00_ContentPlaceHolder1_Lblmsg_evalfrs")).getText().contains("Evaluation not yet finalized")||
							driver.findElement(By.id("ctl00_ContentPlaceHolder1_Lblmsg_evalfrs")).getText().contains("Evaluation non encore finalisée"));
							note_cal="-";

						}



		 if(col==6)
		 {

		 assertTrue(nnote.contains("-"));
		 }else{
			 //note_cal=Float.toString(somme);
			 System.out.println("note_cal"+note_cal);
			/* if(cookie1.getValue().equals("fr-FR"))
			{
			 	note_cal=note_cal.replace(".", ",");
			}*/
			 Thread.sleep(1000);
			 WebElement n1 = EvalFourPage.GridEvaluationID.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_GridView2\"]/tbody/tr[1]/td[3]")).findElement(By.tagName("span"));
			 Thread.sleep(1000);
			 //*[@id="ctl00_ContentPlaceHolder1_GridView2"]/tbody/tr[2]/td[3]
        	 WebElement n2 = EvalFourPage.GridEvaluationID.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_GridView2\"]/tbody/tr[2]/td[3]")).findElement(By.tagName("span"));

			 System.out.println("nnote golbal"+note);
			 float  gbl=Float.parseFloat(nnote);
			 float  gbl1=Float.parseFloat(n1.getText());
			 float  gbl2=Float.parseFloat(n2.getText());
			 System.out.println("note1 "+ gbl1);
			 System.out.println("note2 "+ gbl2);
			 assertEquals(gbl,(gbl1+gbl2)/2);
		 }



}
	
	public static void consultertypeproduit(WebDriver driver) throws Throwable {
		Common.AccéderModule(9,4,0, driver);
	}

	public static void Ajoutertypeproduit() throws Throwable {
		EvalFourPage.AjtTypPdtID.click();
	}
	public static void  saisirNomType(String arg1,int sub, String Path, int row ) throws Throwable {
		String numcode = arg1.substring(sub);
		int num=Integer.parseInt(numcode);
		num++;
		String newcode=Integer.toString(num);
		String str = arg1.replaceAll(numcode, newcode);
		EvalFourPage.nomTypPdtID.sendKeys(str);
		ExcelUtils.setExcelFile(Path, "EvalFRN");
		ExcelUtils.setCellData1(str,row,1,Path,"EvalFRN");
		
	}

	public static void  saisir_la_periodicité(String arg1) throws Throwable {
		EvalFourPage.PeriodiciteID.sendKeys(arg1);
	}

	public static void saisirdatedébut(String arg1, WebDriver driver) throws Throwable {
		final DateFormat dateFormat;
		Cookie cookie1 = driver.manage().getCookieNamed("lan");
		if(cookie1.getValue().equals("en-US")) {
			dateFormat = new SimpleDateFormat("MM/dd/yyyy");
		}else {
			dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		}
	
		DateFormat format = new SimpleDateFormat("dd/MM/yyyy", Locale.FRANCE);
		Date date = format.parse(arg1);
		String Sdate = dateFormat.format(date);
		System.out.println(Sdate);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[1].value = arguments[0];",Sdate,EvalFourPage.DateDebutID );
		
	}

	public static void validertypeproduit() throws Throwable {
		EvalFourPage.VldAjtTypPdtID.click();
	}

	public static void consultercritèrespartype(WebDriver driver) throws Throwable {
		Common.AccéderModule(9, 7, 0, driver);
		//EvalFourPage.ModCritTypPdtID.click();
	}

	public static void selection_type_de_produit(String arg1) throws Throwable {
		Select select = new Select(EvalFourPage.SelectTypPdtID);
		select.selectByVisibleText(arg1);
	}

	public static void ajouter_criteres(String path) throws Throwable {
		 int j=1;
		 	String critere;
			String resp;
			String coef;
		 do
		 {
			 	EvalFourPage.AjtCritTypPdtID.click();
			 	Thread.sleep(500);
				//EvalFourPage.SpnCritTypProdID.click();
			 	ExcelUtils.setExcelFile(path, "CritèreTypeProduit");
				critere=ExcelUtils.getCellData(j,0);
				resp=ExcelUtils.getCellData(j,1);
				coef=ExcelUtils.getCellData(j,5);
				Thread.sleep(300);
				EvalFourPage.NomCritTypProdID.sendKeys(critere);
				Thread.sleep(200);
				EvalFourPage.CoefCritTypProdID.sendKeys(coef);
				Thread.sleep(200);
				EvalFourPage.VldCritTypProdID.click();
				Thread.sleep(300);
				EvalFourPage.SpnRespCritTypProdID.click();
				Thread.sleep(300);
				EvalFourPage.SelectEmpCritTypProdID.click();
				Thread.sleep(300);
				EvalFourPage.ChxEmpCritTypProdID.clear();
				Thread.sleep(200);
				EvalFourPage.ChxEmpCritTypProdID.sendKeys(resp);
				EvalFourPage.VldChxEmpCritTypProdID.click();
				EvalFourPage.GridEmpCritTypProdID.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_GridView2\"]/tbody/tr/td[1]")).findElement(By.tagName("input")).click();
				EvalFourPage.VldEmpCritTypProdID.click();
				Thread.sleep(300);
				EvalFourPage.RetourCritTypProdID.click();
				Thread.sleep(500);
				j++;
				critere=ExcelUtils.getCellData(j,0);
		 }while(!(critere.equals("")));
	}

	public static void consulter_Module_fournisseur(WebDriver driver) throws Throwable {
		Common.AccéderModule(9, 3, 0, driver);
		//EvalFourPage.ModuleFrnID.click();
	}

	public static void consulter_fiche_fournisseur(String arg1) throws Throwable {
		EvalFourPage.CodeModFrnID.sendKeys(arg1);
		EvalFourPage.RechModFrnID.click();
		EvalFourPage.GridModFrnID.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_GridView1\"]/tbody/tr/td[2]")).findElement(By.tagName("a")).click();
	}

	public static void ajouter_type_de_produit_agrée(WebDriver driver, String typepdt) throws Throwable{
		//Thread.sleep(500);
		EvalFourPage.SpnTypPdtMFrnID.click();
		List<WebElement> allRows1=driver.findElement(By.id("ctl00_ContentPlaceHolder1_GridView2")).findElements(By.tagName("tr"));
		int nombre;//allRows1.size()-1;*/
		WebElement  ele= driver.findElement(By.id("ctl00_ContentPlaceHolder1_GridView2")).findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_GridView2\"]/tbody/tr[12]/td"));
		String initialNombre=ele.findElement(By.tagName("div")).findElement(By.id("ctl00_ContentPlaceHolder1_GridView2_ctl13_lblenreg")).getText();
		System.out.println(initialNombre);
		Cookie cookie1 = driver.manage().getCookieNamed("lan");
		String nn;
		if(cookie1.getValue().equals("en-US")) {
			
			nn=initialNombre.substring(initialNombre.indexOf("of ")+1, initialNombre.indexOf(' ')-1);
		System.out.println(nn);}
		else {
			
			nn=initialNombre.substring(initialNombre.indexOf("sur ")+1, initialNombre.indexOf(' ')-1);
		}
		System.out.println(nn);
		Thread.sleep(500);
		EvalFourPage.EditTypPdtID.click();
		Thread.sleep(500);
		System.out.println(typepdt);
		driver.findElement(By.id("ctl00_ContentPlaceHolder1_TextBox33")).sendKeys(typepdt);
		driver.findElement(By.id("ctl00_ContentPlaceHolder1_LinkButton44")).click();
		Actions action = new Actions(driver);
		action.moveToElement(EvalFourPage.GridTypPdtFrnID).perform();
		List<WebElement> allRows=EvalFourPage.GridTypPdtFrnID.findElements(By.tagName("tr"));
		 int j=2;
		 while(j<allRows.size()) 
		 {
			 	WebElement cellIneed = EvalFourPage.GridTypPdtFrnID.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_GridView2\"]/tbody/tr["+j+"]/td[2]"));
			 	WebElement cellIneed1 = cellIneed.findElement(By.tagName("span"));
				if(cellIneed1.getText().equals(typepdt)) 
				{
						EvalFourPage.GridTypPdtFrnID.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_GridView2\"]/tbody/tr["+j+"]/td[1]")).findElement(By.tagName("input")).click();
						EvalFourPage.GridTypPdtFrnID.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_GridView2\"]/tbody/tr["+j+"]/td[3]")).findElement(By.tagName("input")).click();
						break;
				}
				j++;
		 }
		 Thread.sleep(500);
		 action = new Actions(driver);
		 action.moveToElement(EvalFourPage.VldTypPdtFrnID).perform();
		 Thread.sleep(500);
		 JavascriptExecutor  executor = (JavascriptExecutor)driver;
		 executor.executeScript("arguments[0].click()", EvalFourPage.VldTypPdtFrnID);

		 Thread.sleep(500);
		 allRows1=driver.findElement(By.id("ctl00_ContentPlaceHolder1_GridView2")).findElements(By.tagName("tr"));
			int nombre2=allRows1.size()-1;
			System.out.println(nombre2);
			//assertTrue(nombre2==nombre+1);
			EvalFourPage.homeID.click();
			Thread.sleep(500);
	}
	
	public static void supprimer_type_de_produit_agrée(WebDriver driver, String typepdt) throws Throwable{
		//Thread.sleep(500);
		//EvalFourPage.SpnTypPdtMFrnID.click();
		List<WebElement> allRows1=driver.findElement(By.id("ctl00_ContentPlaceHolder1_GridView2")).findElements(By.tagName("tr"));
		int nombre=allRows1.size()-1;
		Thread.sleep(500);
		driver.findElement(By.id("ctl00_ContentPlaceHolder1_TextBox33")).sendKeys(typepdt);
		driver.findElement(By.id("ctl00_ContentPlaceHolder1_LinkButton44")).click();
		
		Thread.sleep(500);
		WebElement cellIneed = driver.findElement(By.id("ctl00_ContentPlaceHolder1_GridView2")).findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_GridView2\"]/tbody/tr[2]/td[1]"));
		cellIneed.findElement(By.tagName("input")).click();
		Thread.sleep(500);
		driver.findElement(By.id("ctl00_ContentPlaceHolder1_LkSuppType")).click();
		 Thread.sleep(500);
		 //allRows1=driver.findElement(By.id("ctl00_ContentPlaceHolder1_GridView2")).findElements(By.tagName("tr"));
			//int nombre2=allRows1.size()-1;
			assertTrue(driver.findElement(By.id("ctl00_ContentPlaceHolder1_LblMsgSupptype")).getText().contains("This product type has been already used during previous evaluations of this supplier. You can't delete it !")||
					driver.findElement(By.id("ctl00_ContentPlaceHolder1_LblMsgSupptype")).getText().contains("Ce type de produit a déjà été utilisé lors des anciennes évaluations de ce fournisseur. Vous ne pouvez pas le supprimer !"));
			EvalFourPage.homeID.click();
			Thread.sleep(500);
	}

	public static void vérifier_existence_d_une_fiche_evaluation(String arg1, String arg2) throws Throwable {
	
		EvalFourPage.SelectFrnID.click();
		System.out.println("a1");
		Thread.sleep(3000);
		
	/*	WebDriverWait wait = new WebDriverWait(driver, 10);
		element = wait.until(
		ExpectedConditions.visibilityOfElementLocated(By.id("ctl00_ContentPlaceHolder1_GridView5_copie")));
		driver.findElement(By.id("ctl00_ContentPlaceHolder1_GridView5_copie")).sendKeys(arg1);	
	*/
		EvalFourPage.RechSelectFrnID.sendKeys(arg1);
		Thread.sleep(300);
		System.out.println("a2");
		EvalFourPage.GridSelectFrnID.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_GridView5_copie\"]/tbody/tr/td[1]")).findElement(By.tagName("a")).click();
		System.out.println("a3");
		Select select = new Select(EvalFourPage.type_produitID);
		System.out.println("a4");
		select.selectByVisibleText(arg2);
		System.out.println("a5");
		EvalFourPage.RechercherID.click();
		Thread.sleep(300);
		System.out.println("a6");
		try {
			
			EvalFourPage.GridEvalFrnID.isDisplayed();
			System.out.println("une fiche evaluation a été crée automatiquement");
			}
			catch (NoSuchElementException e) {
				System.out.println("la création automatique des fiches evaluations n est pas fonctionnel");
			}
			
	}
}