package com.qualiprobdd.e2etests.PNC.models;

import static org.testng.Assert.assertTrue;

import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qualiprobdd.e2etests.PNC.pages.ModulePNCPage;
import com.qualiprobdd.e2etests.util.Common;
import com.qualiprobdd.e2etests.util.ExcelUtils;
import com.qualiprobdd.e2etests.util.RandomValue;





    public class ModulePNCModel {
    	public static int row;
    	public static String Path = "resources/testData/TestData.xlsx";
    	private static String utilisateur;
    	public static boolean Investigation=false;
    	public static List<Float> couts=new ArrayList();
    	
    	
    	
    	
    	

 
    	public static void saisir_code_produit(WebDriver driver) throws Throwable {
    		 JavascriptExecutor  executor = (JavascriptExecutor)driver;
     		  executor.executeScript("arguments[0].click()", ModulePNCPage.WAjoutProd);
     		   int  irand=new Random().nextInt(899)  + 100;
     		  String  st =RandomValue.randomString(5);
     		 ModulePNCPage.WcodeProd.sendKeys(irand+st);
    	
    	}

    	public static void saisir_nom_produit_produit() throws Throwable {

    		  String  st =RandomValue.randomString(12);
      		 ModulePNCPage.WnomProd.sendKeys(st);
    		
    	}

    	public static void select_famille_de_produit() throws Throwable {
    	
    		Select select = new Select(ModulePNCPage.WFamProd);
    
    		select.selectByValue("3");
    		
    	}

    	public static  void cliquer_Valider_du_produit_ajouté(WebDriver driver) throws Throwable {
    		JavascriptExecutor  executor = (JavascriptExecutor)driver;
   		  executor.executeScript("arguments[0].click()", ModulePNCPage.WvalidProd);
    	}
    	
    	public static void cliquer_sur_paramétrage_PNC(WebDriver  driver) throws Throwable {
   		 JavascriptExecutor  executor = (JavascriptExecutor)driver;
  		  executor.executeScript("arguments[0].click()", ModulePNCPage.wparamtPnc);
   	  
   	}
    
    	public static void saisir_quantité_détectée() throws Throwable {
    		
    		  try {
    		        
        		  ModulePNCPage.wquntitedecteProd.sendKeys(ExcelUtils.getCellData1(row, 21));
        	  }catch (NoSuchElementException e) {
      				Common.Exporter_visibilité("le  quntite   produite est invisible");
      				}
    	    
    	}


    	public static  void saisir_quantité_produite() throws Throwable {
    		
    		ExcelUtils.setExcelFile(Path, "PNC");
    		
    		  try {
        
        		  ModulePNCPage.wquntitedecteProd.sendKeys(ExcelUtils.getCellData1(row, 21));
        	  }catch (NoSuchElementException e) {
      				Common.Exporter_visibilité("le  quntite   produite est invisible");
      				}
    	}


    	public static void saisir_quantité_détectée2() throws Throwable {
    		
    		  try {
    		        
        		  ModulePNCPage.qtdetecteP.sendKeys(ExcelUtils.getCellData1(row, 22));
        	  }catch (NoSuchElementException e) {
      				Common.Exporter_visibilité("le  quntite   produite est invisible");
      				}
    	    
    	}


    	public static  void saisir_quantité_produite2() throws Throwable {
    		
    		ExcelUtils.setExcelFile(Path, "PNC");
    		
    		  try {
        
        		  ModulePNCPage.wquntitedecteProd.sendKeys(ExcelUtils.getCellData1(row, 21));
        	  }catch (NoSuchElementException e) {
      				Common.Exporter_visibilité("le  quntite   produite est invisible");
      				}
    	}

 
    	public static void choisir_unite() throws Throwable {
    	
    	
  		  try {
  			ExcelUtils.setExcelFile(Path, "PNC");
    		ModulePNCPage.unitePNCP.sendKeys(ExcelUtils.getCellData1(row, 23));

      	
      	  }catch (NoSuchElementException e) {
    				Common.Exporter_visibilité("le  unite est invisible");
    				}
    	}
    	
    	public static void choisir_Un_seul_produit_un_seul_type_de_NC_ou_Plusieurs_produits_plusieurs_Types_de_NC(int   row,WebDriver  driver) throws Throwable {
    		ExcelUtils.setExcelFile(Path, "PNC");
    		String   choixparametré=ExcelUtils.getCellData1(1, 20);
    		System.out.println(choixparametré);
    		if(choixparametré.equals("seul")) {
    			 JavascriptExecutor  executor = (JavascriptExecutor)driver;
    	   		  executor.executeScript("arguments[0].click()", ModulePNCPage.wseul);
    		}else {
    			 JavascriptExecutor  executor = (JavascriptExecutor)driver;
    	   		  executor.executeScript("arguments[0].click()", ModulePNCPage.wplus);
    		}
    		JavascriptExecutor  executor = (JavascriptExecutor)driver;
	   		  executor.executeScript("arguments[0].click()", ModulePNCPage.wvalideParam);
	   		  
	   		  try {
	   			  
	   			JavascriptExecutor  executor2 = (JavascriptExecutor)driver;
		   		  executor2.executeScript("arguments[0].click()", ModulePNCPage.Confirm_Param);
	   		  }catch(NoSuchElementException exp) {
	   			  System.out.print("Rester même");
	   		  }
    		
    	
    	}

 
    	public static void cliquer_sur_ajouter_produit(WebDriver driver) throws Throwable {
    		JavascriptExecutor  executor = (JavascriptExecutor)driver;
	   		  executor.executeScript("arguments[0].click()",ModulePNCPage.wajoutProd);
    		
    	 
    	}

    	
    	public static void cliquer_sur_select_produit(WebDriver driver) throws Throwable {
    		JavascriptExecutor  executor = (JavascriptExecutor)driver;
	   		  executor.executeScript("arguments[0].click()",ModulePNCPage.wselctProdid);
    	}

    	public static void rechercher_produit() throws Throwable {
    		
    		 Thread.sleep(500);
       	  ModulePNCPage.wrecherche_produitPLus.sendKeys(ExcelUtils.getCellData(row,2));
       	  ModulePNCPage.btnrechercheproduit.click();
       	  Thread.sleep(500);
       	 
    	}

    	
    	public static void select_produit() throws Throwable {
    		 Thread.sleep(500);
    		 ModulePNCPage.produitPNC.findElement(By.tagName("a")).click();
          	  Thread.sleep(500);
    	}

    	
public static void valide_Taux_de_non_conformité2(WebDriver driver) throws Throwable {
   boolean  ok=false;
	try{
	if(ModulePNCPage.qtdetecteP.isDisplayed()) {
		
	ok =true;
}

}
catch (NoSuchElementException e) {
		Common.Exporter_visibilité("le taux   de  non  conformité  est invisible");
		}
	if   (ok==true) {
    		String qteprod = ModulePNCPage.qtdetecteP.getAttribute("value").replace(',', '.');
    		String qtedect = ModulePNCPage.wquntitedecteProd.getAttribute("value").replace(',', '.');

    		double qtéproduite = Double.parseDouble(qteprod);
    		double qtédetect = Double.parseDouble(qtedect);
    		Thread.sleep(500);
    		double taux_calcule =qtéproduite/qtédetect*100;
    	
    		System.out.println("Taux  calcule ===>"+ qtéproduite );
    	
    		System.out.println("Taux  calcule ===>"+qtédetect );
    	
    		System.out.println("Taux  calcule ===>"+taux_calcule);
    		
    	
    		JavascriptExecutor js = (JavascriptExecutor) driver;  

    	
    		String value = (String) js.executeScript("return arguments[0].value", ModulePNCPage.tauxPNCIdP);
    		double valtaux=Double.parseDouble(value);
    		System.out.print("====>double +"+valtaux);
    		DecimalFormat df = new DecimalFormat("#.##");
    		String intTaux =df.format(taux_calcule);
    		System.out.print("====> +"+intTaux);
    	
    		System.out.println("Taux  calcule ===>"+value);
    	
    		value=df.format(valtaux);
    		System.out.println("Taux  calcule ===>"+value);
    	
        		assertTrue(value.equals((intTaux)),"taux non   conformité");

    	
    		
	}
    		
    	
    	}

    	
    	public static void valide_Taux_de_non_conformité() throws Throwable {
    		 boolean  ok=false;
    			try{
    			if(ModulePNCPage.qtproduiteP.isDisplayed()) {
    				
    			ok =true;
    		}

    		}
    		catch (NoSuchElementException e) {
    				Common.Exporter_visibilité("le taux   de  non  conformité  est invisible");
    				}
    			if   (ok==true) {
    		String qteprod = ModulePNCPage.qtproduiteP.getAttribute("value").replace(',', '.');

    		Float qtéproduite = Float.parseFloat(qteprod);
    		int taux_calcule = (Integer.parseInt(ModulePNCPage.qtdetecteP.getAttribute("value")) / qtéproduite.intValue())*100;
    		if (ModulePNCPage.tauxPNCId.getAttribute("value").equals(Integer.toString(taux_calcule))) {
    			System.out.println("taux de conformité valide");
    		} else {
    			System.out.println("taux de conformité invalide");

    		}
    		assertTrue(ModulePNCPage.tauxPNCIdP.getAttribute("value").equals(Integer.toString(taux_calcule)),"taux non   conformité");
    	
    	}}

    
    	public static void valider_produit(WebDriver driver) throws Throwable {
    		JavascriptExecutor  executor = (JavascriptExecutor)driver;
	   		  executor.executeScript("arguments[0].click()",ModulePNCPage.wvaliderProd);
    	}

    
    	public static void clique_sur_ajouter_type_nc(WebDriver driver) throws Throwable {
    		
    		
    		JavascriptExecutor  executor = (JavascriptExecutor)driver;
	   		  executor.executeScript("arguments[0].click()",ModulePNCPage.wajouNC);
    	}

    
    	public static void select_type_nc() throws Throwable {
    		ExcelUtils.setExcelFile(Path, "PNC");
    		Select select = new Select(ModulePNCPage.typencIDP);
    		String typenc=ExcelUtils.getCellData(row,3);
    		select.selectByVisibleText(typenc);
    		Thread.sleep(200);
    	}

    	
    	public static void saisir_Pourcentage() throws Throwable {
    		
    		ExcelUtils.setExcelFile(Path, "PNC");
    	ModulePNCPage.wpourcentage.sendKeys(ExcelUtils.getCellData(row,24));
    		
    		Thread.sleep(200);
    		
    	  
    	}
    	 public  static  int i =0;
    	 
    	public static void select_type_n() throws Throwable {
    		ExcelUtils.setExcelFile(Path, "PNC");
    	
    		i++;
    		if(i==1) {
    			String typenc=ExcelUtils.getCellData(i,3);
    			Select select = new Select(ModulePNCPage.typencIDP);
        		select.selectByVisibleText(typenc);
    		}else if(i==2) {
    			Select select = new Select(ModulePNCPage.typencIDP);
    		String typenc=ExcelUtils.getCellData(2,3);
    		select.selectByVisibleText(typenc);}
    		else if(i==3) {
    			Select select = new Select(ModulePNCPage.typencIDP);
    			String typenc=ExcelUtils.getCellData(3,3);
        		select.selectByVisibleText(typenc);
    			
    		}
    		Thread.sleep(200);
    		System.out.println("i==="+i);
    	
    	}

    	
    	public static void saisir_Pourcentag(WebDriver driver) throws Throwable {
     		System.out.println("i==="+i);
        	
    		ExcelUtils.setExcelFile(Path, "PNC");
    	if(i==1){
        	ModulePNCPage.wpourcentage.sendKeys(ExcelUtils.getCellData(i,24));
        	Thread.sleep(200);
    		JavascriptExecutor  executor = (JavascriptExecutor)driver;
       		  executor.executeScript("arguments[0].click()",ModulePNCPage.WValidetypepnc);

    	} else if(i==2)
    	{
        	ModulePNCPage.wpourcentage.sendKeys(ExcelUtils.getCellData(i,24));
        	Thread.sleep(200);
    		JavascriptExecutor  executor = (JavascriptExecutor)driver;
       		  executor.executeScript("arguments[0].click()",ModulePNCPage.WValidetypepnc);
    		
    	}else if(i==3)
    	{
        	ModulePNCPage.wpourcentage.sendKeys(ExcelUtils.getCellData(3,24));
        	Thread.sleep(200);
    		JavascriptExecutor  executor = (JavascriptExecutor)driver;
       		  executor.executeScript("arguments[0].click()",ModulePNCPage.WValidetypepnc);
    	}
    	
    	
    		
    	
	   		  if (i==2) {
	   			  try {
		   			  assertTrue(!(ModulePNCPage.WValidetypepnc.isDisplayed()));

	   			  }
	   				 

	   			  catch(NoSuchElementException e1){
	   				 System.out.println("élément introuvable et pourcentage =100");
	   			  }
	   			  
	   		  }else if(i==3) {
	   			 
	   			try {
		   			  assertTrue(!(ModulePNCPage.WValidetypepnc.isDisplayed()));

	   			  }
	   			  catch(NoSuchElementException e1){
	   				 System.out.println("élément introuvable et pourcentage =100");
	   			  }
	   		  }else {
	   			  System.out.println("le pourcentage <100");}
	   		  
    		 
	   
    	  
    	}

    	public static   int  Sommepourcentage(String[] list) {
    		int  somme=0;
    	for(int  i=0;i<list.length;i++) {
    		try
    		    {
    			 System.out.println("somme = " + list[i]);
    			 if(list[i].contains("-")) {
    		   somme += Integer.parseInt(list[i+1].trim());

    		      System.out.println("somme = " + somme);}
    		    }
    		    catch (NumberFormatException nfe)
    		    {
    		      System.out.println("NumberFormatException: " + nfe.getMessage());
    		    }}
    		
    		return somme;
    	}
    	
    	public static void cliquer_sur_valider(WebDriver driver) throws Throwable {
    		JavascriptExecutor  executor = (JavascriptExecutor)driver;
	   		  executor.executeScript("arguments[0].click()",ModulePNCPage.wvaliderProd);
    	}
    	
     static int  k=1;
    public   static   void 	verfier_list_produit() {
    	for(int j=2;j<7;j++) {
    		
    		assertTrue(ModulePNCPage.wtableProdd.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_GridView_Produits\"]/tbody/tr["+k+"]/td["+j+"]")).getText()!="");
    		if (j==7) {
    	    	System.out.println("le type  nc est   "+ModulePNCPage.wtableProdd.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_GridView_Produits\"]/tbody/tr["+k+"]/td["+j+"]")).getText());

    			String strpour = ModulePNCPage.wtableProdd.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_GridView_Produits\"]/tbody/tr["+k+"]/td["+j+"]")).getText();
    			String[] listpour= strpour.split(" "); System.out.println("input string words separated by whitespace: " + strpour); 
    			System.out.println("output string: " + Arrays.toString(listpour));
    		
    		assertTrue(Sommepourcentage(listpour)==100);
    		}
    	}
    	
    	
    }
    	
    	
    	
    	
    	
    	
    	
    	
    	
	public static void cliquerProduitsnonconformes(WebDriver driver) throws Throwable 
	{
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,-250)", "");
		Thread.sleep(200);	
		Actions action = new Actions(driver);
		action.moveToElement(ModulePNCPage.menuID).perform();
		Thread.sleep(800);
		//ModulePNCPage.menuID.click();
		JavascriptExecutor js = (JavascriptExecutor)driver;
js.executeScript("arguments[0].click()",ModulePNCPage.menuID);
		Thread.sleep(200);		
		Common.AccéderModule(7,0,0,driver);
		Thread.sleep(200);	
		Common.AccéderModule(7,1,0,driver);

		
	}
	public static void ModifierParamétragePNC() throws Throwable
	{
		ModulePNCPage.ParamSociaux.click();
		Thread.sleep(500);
		ModulePNCPage.ParamPNC.click();
		ExcelUtils.setExcelFile(Path, "PNC");
		String param=ExcelUtils.getCellData(row,20);
		if(param.equals("MONO"))
		{
			if(ModulePNCPage.MonoPnc.getAttribute("value").equals("1")) {
			ModulePNCPage.MonoPnc.click();
			Thread.sleep(500);
			ModulePNCPage.Vld_Param.click();
			Thread.sleep(500);
			ModulePNCPage.Confirm_Param.click();
			Thread.sleep(500);
			}else
			{
				ModulePNCPage.FermerParam.click();	
				Thread.sleep(500);
			}
		}else 
		{
			
			if(ModulePNCPage.PlusieursPNC.getAttribute("value").equals("0")) {
				ModulePNCPage.PlusieursPNC.click();
				Thread.sleep(500);
				ModulePNCPage.Vld_Param.click();
				Thread.sleep(500);
				}else
				{
					ModulePNCPage.FermerParam.click();	
					Thread.sleep(500);
				}
		}
		
		
		
		
	}
	public static void ajouterFichePNC(WebDriver driver ) throws InterruptedException
	{
		Thread.sleep(1000);
		//ModulePNCPage.ajouterPNCID.click();
		JavascriptExecutor js  =(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();",ModulePNCPage.ajouterPNCID);

		Common.Exporter_visibilité("Nouvelle Fiche PNC");
		Common.Exporter_champ_A_masquer("Nouvelle Fiche PNC");
	}
	public static void définir_code_PNC(int arg1) throws Throwable
	{
		row=arg1;
	}
	public static void descriptionPNCID () throws InterruptedException {

		ModulePNCPage.descriptionPNCID.sendKeys("test description PNC");
	}
	public static void actimmediatesID() throws InterruptedException{

		ModulePNCPage.actimmediatesID.sendKeys("action immediates numéro");
	}
	public static void refinterneID() {
		  try {
			ModulePNCPage.refinterneID.isDisplayed();
    		ModulePNCPage.refinterneID.sendKeys("002");
  			Common.Exporter_champ_A_masquer("le champ ref interne est visible");
  			}
  			catch (NoSuchElementException e) {
  				Common.Exporter_champ_A_masquer("le champ ref interne est invisible");
  			}
	}
	
	
	public static void livraisonID(WebDriver driver) throws InterruptedException {
		//En utilisant le Calendrier
		//ModulePNCPage.livraisonID.click();
		//Thread.sleep(1000);
		//ModulePNCPage.choixdateLivraison_ID.click();
		//En utilisant le champ de text
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
		jse.executeScript("arguments[1].value = arguments[0];",Sdate, ModulePNCPage.TextlivraisonID);
	}

	public static void detectionIDe(WebDriver driver) throws InterruptedException {

		//ModulePNCPage.detectionID.click();
		Thread.sleep(1000);
		//ModulePNCPage.Choixdatedetection_ID.click();


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
				jse.executeScript("arguments[1].value = arguments[0];",Sdate, ModulePNCPage.Choixdatedetection_ID);
				Thread.sleep(500);


	}

	public static void choixdetectionpXPATH1() throws Exception {
		try {
			ModulePNCPage.detectionpersonID.isDisplayed();
			Common.Exporter_champ_A_masquer("detecté par est visible");
			Select select = new Select(ModulePNCPage.detectionpersonID);
			select.selectByValue("Testeur auto");
		}
			catch (NoSuchElementException e) {
				Common.Exporter_visibilité("detecté par est invisible");
			}
		
	}
	
    public static void TypeNCID() throws Exception {
    	ExcelUtils.setExcelFile(Path, "PNC");
		Select select = new Select(ModulePNCPage.typencID);
		String typenc=ExcelUtils.getCellData(row,3);
		select.selectByVisibleText(typenc);
		Thread.sleep(200);
	
	}
	
      public static void gravitePNC() throws Exception {
		
		Select select = new Select(ModulePNCPage.graviteID);
		select.selectByVisibleText("MAJEUR");
	
	}
	
      public static void siteNC(WebDriver driver) throws Exception {
		try {
			
			ModulePNCPage.siteNC.isDisplayed();
			Common.Exporter_visibilité("le site est visible");
			String text=driver.findElement(By.id("ctl00_ContentPlaceHolder1_lbsite2")).getText();
			if(text.indexOf('*')!=-1) 
			{
				Common.Exporter_visibilité("le site est obligatoire");
			}else 
			{
				Common.Exporter_visibilité("le site n'est pas obligatoire");
				
			}
			 ExcelUtils.setExcelFile(Path, "PNC");
		  		Select select = new Select(ModulePNCPage.siteNC);
		  		select.selectByVisibleText(ExcelUtils.getCellData(row,0));	
			}
			catch (NoSuchElementException e) {
				Common.Exporter_visibilité("le site est invisible");
			}
    	 
}
      
      public static void sélectionner_la_ISPS() throws Throwable {
    	  try {
  			
  			ModulePNCPage.wISPS.isDisplayed();
  			Common.Exporter_visibilité("le site est visible");
  		
  		
  			 ExcelUtils.setExcelFile(Path, "PNC");
  		  		Select select = new Select(ModulePNCPage.wISPS);
  		  		select.selectByValue("1");	
  			}
  			catch (NoSuchElementException e) {
  				Common.Exporter_visibilité("le site est invisible");
  			}
		}	
      
      
      public static void processusNC(WebDriver driver) throws Exception {
    	  try {
    		  ModulePNCPage.processusNC.isDisplayed();
  			Common.Exporter_visibilité("le processus est visible");
  			String text=driver.findElement(By.id("ctl00_ContentPlaceHolder1_LblProcessus_")).getText();
  			if(text.indexOf('*')!=-1) 
  			{
  				Common.Exporter_visibilité("le processus est obligatoire");
  			}else 
  			{
  				Common.Exporter_visibilité("le processus n'est pas obligatoire");
  				
  			}
  		  ExcelUtils.setExcelFile(Path, "PNC");
  		  Select select = new Select(ModulePNCPage.processusNC);
  		  select.selectByVisibleText(ExcelUtils.getCellData(row,1));
  			}
  			catch (NoSuchElementException e) {
  				Common.Exporter_visibilité("le processus est invisible");
  			}
    	
}
 
      public static void activiteNC(WebDriver driver) throws Exception {
    		try {
    			ModulePNCPage.activiteNC.isDisplayed();
    			Common.Exporter_visibilité("l'activité est visible");
    			String text=driver.findElement(By.id("ctl00_ContentPlaceHolder1_LblDomaine_")).getText();
    			if(text.indexOf('*')!=-1) 
    			{
    				Common.Exporter_visibilité("l'activité est obligatoire");
    			}else 
    			{
    				Common.Exporter_visibilité("l'activité n'est pas obligatoire");
    				
    			}
    			Select select = new Select(ModulePNCPage.activiteNC);
        		select.selectByVisibleText("ACTIVITE AUTO");
    			}
    			catch (NoSuchElementException e) {
    				Common.Exporter_visibilité("l'activité est invisible");
    			}
    		
      }
      public static void directionNC(WebDriver driver) throws Exception {
    	  try {
    		  ModulePNCPage.directionNC.isDisplayed();
  				Common.Exporter_visibilité("la direction est visible");
  			String text=driver.findElement(By.id("ctl00_ContentPlaceHolder1_LabelDirPilot")).getText();
  			if(text.indexOf('*')!=-1) 
  			{
  				Common.Exporter_visibilité("la direction est obligatoire");
  			}else 
  			{
  				Common.Exporter_visibilité("la direction n'est pas obligatoire");
  				
  			}
  			Select select = new Select(ModulePNCPage.directionNC);
    		select.selectByVisibleText("DIRECTION AUTO");
    		Thread.sleep(1000);
  			}
  			catch (NoSuchElementException e) {
  				Common.Exporter_visibilité("la direction est invisible");
  			}
    		
  }
      public static void serviceNC(WebDriver driver) throws Exception {
    	  try {
    		  ModulePNCPage.serviceNC.isDisplayed();
  			Common.Exporter_visibilité("le service est visible");
  			String text=driver.findElement(By.id("ctl00_ContentPlaceHolder1_LblService_")).getText();
  			if(text.indexOf('*')!=-1) 
  			{
  				Common.Exporter_visibilité("le service est obligatoire");
  			}else 
  			{
  				Common.Exporter_visibilité("le service n'est pas obligatoire");
  			}
  			Select select = new Select(ModulePNCPage.serviceNC);
    		select.selectByVisibleText("SERVICE AUTO");
    		Thread.sleep(1000);
  			}
  			catch (NoSuchElementException e) {
  				Common.Exporter_visibilité("le service est invisible");
  				}
      		}
      
      public static void numeroOF2(WebDriver driver) throws InterruptedException {
    	  try {
    		  ModulePNCPage.numeroOFP.isDisplayed();
  			Common.Exporter_visibilité("le  numero of est visible");
  			String text=driver.findElement(By.id("ctl00_ContentPlaceHolder1_LblService_")).getText();
  			if(text.indexOf('*')!=-1) 
  			{
  				Common.Exporter_visibilité("le numero of est obligatoire");
  			}else 
  			{
  				Common.Exporter_visibilité("le  numero of n'est pas obligatoire");
  			}
  			
  			
  			int random_int = (int)(Math.random() *(9999 - 1000000 + 1) + 1000000);
  			String st=String.valueOf(random_int);
  			Thread.sleep(1000);
  			ModulePNCPage.numeroOFP.sendKeys("999999999");
  			JavascriptExecutor jse = (JavascriptExecutor)driver;
			jse.executeScript("arguments[1].value = arguments[0];",st,ModulePNCPage.numeroOFP);


    		Thread.sleep(1000);
  			}
  			catch (NoSuchElementException e) {
  				Common.Exporter_visibilité("le  numero of est invisible");
  				}
      		}
  		
  	
      public static void numeroLot2(String Path,WebDriver driver) throws Throwable {
    	  System.out.println(" numero lot");
    	  try {
    		  ModulePNCPage.numerolot.isDisplayed();
  			Common.Exporter_visibilité("le  numero Lot est visible");
  			String text=driver.findElement(By.id("ctl00_ContentPlaceHolder1_LblService_")).getText();
  			if(text.indexOf('*')!=-1) 
  			{
  				Common.Exporter_visibilité("le numero Lot est obligatoire");
  			}else 
  			{
  				Common.Exporter_visibilité("le  numero Lot n'est pas obligatoire");
  			}
  			int random_int = (int)(Math.random() *(9999 - 1000000 + 1) + 1000000);
  			Thread.sleep(1000);
  
  			String st= String.valueOf(random_int);
  			Thread.sleep(1000);
  			System.out.println("numro   lot :"+st);
  			JavascriptExecutor jse = (JavascriptExecutor)driver;
			jse.executeScript("arguments[1].value = arguments[0];",st, ModulePNCPage.numerolotP);
  			//ModulePNCPage.numerolotP.sendKeys("55");

    		Thread.sleep(1000);
  			}
  			catch (NoSuchElementException e) {
  				Common.Exporter_visibilité("le  numero Lot est invisible");
  				}
    		
    	}
      
      
      public static void numeroOF() {
    	  try {
    		  ModulePNCPage.numeroOF.isDisplayed();
  			ModulePNCPage.numeroOF.sendKeys("10");
  			Common.Exporter_champ_A_masquer("le champ numeroOF est visible");
  			}
  			catch (NoSuchElementException e) {
  				Common.Exporter_champ_A_masquer("le champ numeroOF est invisible");
  			}
  		
  	}
      public static void numeroLot(String Path) throws Throwable {
    	  try {
    		  ExcelUtils.setExcelFile(Path, "PNC");
    		  ModulePNCPage.numerolot.isDisplayed();
    		  ModulePNCPage.numerolot.sendKeys("210");
    		  ExcelUtils.setCellData1( ModulePNCPage.numerolot.getText(),1,18,Path, "PNC") ;
  			Common.Exporter_champ_A_masquer("le champ numerolot est visible");
  			}
  			catch (NoSuchElementException e) {
  				Common.Exporter_champ_A_masquer("le champ numerolot est invisible");
  			}
    		
    	}
   
      
      public static void produitPNC(WebDriver driver) throws Exception {
    	  ExcelUtils.setExcelFile(Path, "PNC");
    	  Thread.sleep(1000);
    
    	  JavascriptExecutor js = (JavascriptExecutor) driver;
 		 js.executeScript("arguments[0].click()", ModulePNCPage.choixproduit);
    	  Thread.sleep(1000);
    	  ModulePNCPage.rechercheproduit.sendKeys(ExcelUtils.getCellData(row,2));
    	  JavascriptExecutor js1= (JavascriptExecutor) driver;
  		 js1.executeScript("arguments[0].click()",  ModulePNCPage.btnrechercheproduit);
    	  Thread.sleep(3000);
    	  ModulePNCPage.produitPNC.findElement(By.tagName("a")).click();
    	  Thread.sleep(1000);
      }
      
      
      
      public static void qtdetecte() throws Throwable {
    	Thread.sleep(2000);
    	  try {
      		
    	  		ModulePNCPage.qtdetecte.sendKeys("150");

      	  }catch (NoSuchElementException e) {
    				Common.Exporter_visibilité("le quntite detecte");
    				}
  	}
     
      public static void qtproduite() throws InterruptedException {
		  Thread.sleep(2000);

		  try {
    		
      		ModulePNCPage.qtproduite.sendKeys("1000");

    	  }catch (NoSuchElementException e) {
  				Common.Exporter_visibilité("le quntite produit");
  				}
      }
      public static void unitePNC()  {
    	  try {
      		
    	  		ModulePNCPage.unitePNC.sendKeys("Pcs");

      	  }catch (NoSuchElementException e) {
    				Common.Exporter_visibilité("le unite produit");
    				}
  		
    }
      public static void FournisseurPNC() throws Throwable  {
    		
    	  try {
    		  ModulePNCPage.serviceNC.isDisplayed();
    	  ModulePNCPage.FrnRechId.click();
    		Thread.sleep(500);
    		ModulePNCPage.FrnRefId.findElement(By.tagName("input")).sendKeys("FRN_AUTO");
    		Thread.sleep(500);
    		ModulePNCPage.FrnChxId.findElement(By.tagName("a")).click();
    		Thread.sleep(500);
    	  }catch (NoSuchElementException e) {
  				Common.Exporter_visibilité("le fournisseur est invisible");
  				}
    	
    		
      }
      public static void clientPNC() throws Throwable  {
    	  ExcelUtils.setExcelFile(Path, "PNC");
    	  if(ExcelUtils.getCellData(row,9).equals("CLIENT"))
    	  {
    		ModulePNCPage.DetectCltId.click();
    		Thread.sleep(500);
    		ModulePNCPage.CltSelectId.click();
    		Thread.sleep(500);
    		ModulePNCPage.CltRechId.sendKeys("CLIENT AUTO");
    		Thread.sleep(500);
    		ModulePNCPage.CltChxId.findElement(By.tagName("a")).click();
    		Thread.sleep(500);
    	  }
    		
      }
      public static void sourcePNC() throws Exception {
  		
  		Select select = new Select(ModulePNCPage.sourcePNC);
  		select.selectByVisibleText("Source MF");
    }
      public static void atelierPNC() throws Exception {
    	  try {
    		  ModulePNCPage.atelierPNC.isDisplayed();
    		  Select select = new Select(ModulePNCPage.atelierPNC);
    	  		select.selectByVisibleText("usine 1");
  			Common.Exporter_champ_A_masquer("le champ atelier est visible");
  			}
  			catch (NoSuchElementException e) {
  				Common.Exporter_champ_A_masquer("le champ atelier est invisible");
  			}
  
    }
      public static void originePNC() throws Exception {
    	  try {
    		  ModulePNCPage.originePNC.isDisplayed();
    		  Select select = new Select(ModulePNCPage.originePNC);
      		select.selectByValue("Testeur auto");
  			Common.Exporter_champ_A_masquer("le champ origine est visible");
  			}
  			catch (NoSuchElementException e) {
  				Common.Exporter_champ_A_masquer("le champ origine est invisible");
  			}
 
      }
      public static void cliquervaldenrgNC(WebDriver driver) throws Exception {
    	//  Actions action = new Actions(driver);
    		//action.moveToElement(ModulePNCPage.valdenrgNC).perform();
    		//ModulePNCPage.valdenrgNC.click();
    		Thread.sleep(1000L);
            JavascriptExecutor js = (JavascriptExecutor) driver;

    		 js.executeScript("arguments[0].scrollIntoView();", ModulePNCPage.valdenrgNC);
    		 js.executeScript("arguments[0].click()", ModulePNCPage.valdenrgNC);
    		 //JavascriptExecutor  executor = (JavascriptExecutor)driver;
			 // executor.executeScript("arguments[0].click()", ModulePNCPage.VldInvID);

  	
  		Thread.sleep(1000L);
  	
  	}
      public static void choixtypedecause(WebDriver driver) throws Exception {

		  Thread.sleep(1000L);

    		ModulePNCPage.rattachertycause.click();
    		Thread.sleep(1000L);
    		//ModulePNCPage.choixtycause.click();
    	    driver.findElement(By.id("ctl00_ContentPlaceHolder1_GridView9_ctl02_CheckBox1")).click();
    		ModulePNCPage.vldtypecause.click();
    		}

    	
      public static void actualisation() {

  		ModulePNCPage.actualisationhome.click();
  		
  	}
      public static void consulter_agendaPNC(WebDriver driver) throws Exception {
    	  WebDriverWait wait = new WebDriverWait(driver,2000);
          wait.until(ExpectedConditions.visibilityOf(ModulePNCPage.agendaPNC));
          JavascriptExecutor js = (JavascriptExecutor) driver;
	
          js.executeScript("arguments[0].scrollIntoView();",ModulePNCPage.agendaPNC);
          JavascriptExecutor  executor = (JavascriptExecutor)driver;
		  executor.executeScript("arguments[0].click()", ModulePNCPage.agendaPNC);
    		Thread.sleep(2000L);
      }
      
      public static void consulter_PNC_validation(WebDriver driver) throws Exception {
    	  WebDriverWait wait = new WebDriverWait(driver,60);
          wait.until(ExpectedConditions.visibilityOf(ModulePNCPage.PNCVLD));

          JavascriptExecutor js =(JavascriptExecutor)driver;
          js.executeScript("arguments[0].click();",ModulePNCPage.PNCVLD);
    	//	ModulePNCPage.PNCVLD.click();
      }
    	  public static void consulterPNCàvalider(int num,WebDriver driver) throws Exception {
    		  Thread.sleep(9000);
    		  row=num;
    		  System.err.println(" row   "+row  );
    		  ExcelUtils.setExcelFile(Path, "PNC");
    		  Thread.sleep(1000);
			  String numFish=ExcelUtils.getCellData(row,15);
			  System.err.println(" numFish  "+numFish  );
			  Thread.sleep(2000);
			  ModulePNCPage.recherchernumPNC.sendKeys(numFish);

			  //  JavascriptExecutor jse = (JavascriptExecutor)driver;
			 // jse.executeScript("arguments[1].value = arguments[0];",numFish, ModulePNCPage.recherchernumPNC);
			  Thread.sleep(2000);
			//  JavascriptExecutor jse2 = (JavascriptExecutor)driver;
			 // jse2.executeScript("arguments[0].click();", ModulePNCPage.recherchernumPNC);


		  }
    	  public static void cliquersurPNCàvalider() throws Throwable {
    		  utilisateur =ModulePNCPage.UtilisateurID.getAttribute("innerText");
    		  ExcelUtils.setExcelFile(Path, "PNC");
    		  String RespVald=ExcelUtils.getCellData(row,5);
    		  Boolean isPresent = ModulePNCPage.NumPNC_VLD.findElements(By.tagName("a")).size() > 0;
    		  if((isPresent==true)&&(utilisateur.equals(RespVald)))
    		  {
    			  ModulePNCPage.NumPNC_VLD.findElement(By.tagName("a")).click();
    		  }else if((isPresent==true)&&(!(utilisateur.equals(RespVald)))) 
    		  {
    			  
    			  assertTrue(utilisateur.contains(RespVald));
    		  }
    		  else if((isPresent==false)&&((utilisateur.equals(RespVald)))) 
    		  {
    			  System.out.println("Si le type admet deux responsable, La fiche PNC  est validé par un autre responsable sinon vérifier bug");
    		  }else if ((isPresent==false)&&(!(utilisateur.equals(RespVald)))) 
    		  {
    			  System.out.println("vous n'etes pas responsable validation pour cette fiche");
    		  }
  			}
    	  public static void commentairevalidation()  {
        		
        		ModulePNCPage.commentaireVLD.sendKeys(Common.paragraphe(12,10));
          }
    	  public static void decideurPNC() throws Exception {
  	  		
  	  		Select select = new Select(ModulePNCPage.choixdecideur);
  	  		select.selectByVisibleText("AUTO");
  	    }
    	  public static void decisionDeValidation(String deci,WebDriver driver) throws Throwable
    	  {
    		  Thread.sleep(3000);
    		if(deci.equals("Refus"))
    		{
    			ModulePNCPage.commentaireVLD.sendKeys("Refus");
    			ModulePNCPage.boutonrefuser.click();
    		
    		}else if(deci.equals("Correction")) {
    			ModulePNCPage.commentaireVLD.sendKeys("Correction");
    			ModulePNCPage.boutoncorrection.click();
    		
    		}else if(deci.equals("Validation")) 
    		{
    			 Thread.sleep(3000);
    			 ExcelUtils.setExcelFile(Path, "PNC");
    			 
    			//Select select = new Select(ModulePNCPage.choixdecideur);
      	  		//select.selectByVisibleText(ExcelUtils.getCellData(row,6));
    			 ((JavascriptExecutor)driver).executeScript("var select = arguments[0]; for(var i = 0; i < select.options.length; i++){ if(select.options[i].text == arguments[1]){ select.options[i].selected = true; } }",ModulePNCPage.choixdecideur, ExcelUtils.getCellData(row,6));

    			ModulePNCPage.commentaireVLD.sendKeys(Common.paragraphe(12,10));
    			JavascriptExecutor js =(JavascriptExecutor) driver;
    			js.executeScript("arguments[0].click()",ModulePNCPage.boutonvalider1);
    			ModulePNCPage.boutonvalider1.click();
    		}	
    	  }
    	  
    	  public static void consulter_PNC_correction() throws Exception {
      		ModulePNCPage.PNCCRG.click();
        }
      	  public static void consulterPNCàcorriger(int num) throws Exception {
      		  Thread.sleep(100L);
      		  row=num;
      		  ExcelUtils.setExcelFile(Path, "PNC");
      		  ModulePNCPage.recherchernumPNCCRG.sendKeys(ExcelUtils.getCellData(row,15));
      		}
      	  public static void cliquersurPNCàcorriger() throws Throwable {
      			  ModulePNCPage.NumPNC_CRG.findElement(By.tagName("a")).click();
      		
    			}
    	

    
    	  public static void partievalidée()  
    	  {	
        		ModulePNCPage.boutonvalider1.click();
          }
    	  
    	  public static void cliquerdecisonPNC(WebDriver driver) throws Exception {
    		     
    		    ModulePNCPage.agendaPNC.click();
    		    Thread.sleep(500L);
               // ModulePNCPage.PNCdecision.click();
                JavascriptExecutor js =(JavascriptExecutor)driver;
                js.executeScript("arguments[0].click();",ModulePNCPage.PNCdecision);
			  Thread.sleep(9000);


		  }

    	  public static void consulterPNC_decidion(int num) throws Exception {
    		  Thread.sleep(9000);
    		  row=num;
      		  ExcelUtils.setExcelFile(Path, "PNC");
    			ModulePNCPage.recherchernumdec.sendKeys(ExcelUtils.getCellData(row,15));
    		}
    	  public static void cliquersurPNC_decision() throws InterruptedException {
			  Thread.sleep(500);
  			ModulePNCPage.numpncdec.findElement(By.tagName("a")).click();
  		}
    	  
    
    	  public static void Nécessite_investigation() throws Throwable 
    	  {
    		  ExcelUtils.setExcelFile(Path, "PNC");
    		  if(ExcelUtils.getCellData(row,10).equals("OUI"))
    		  {
    			  	Investigation=true;
    			  	ModulePNCPage.ChxInvID.click();
    		 	Thread.sleep(500);
    		 	//ModulePNCPage.VolDECID.click();
    		 	//Thread.sleep(500);
    		  }else 
    		  {
    			  System.out.println("PNC ne nécessite pas investigation");
    		  }
    		  
    	  }

 
    	  public static void ResponsableInvestigation(WebDriver driver) throws Throwable 
    	  {
    		  if(Investigation)
    		  {
    		    ExcelUtils.setExcelFile(Path, "PNC");
    		    Thread.sleep(3000);

    		    WebDriverWait wait = new WebDriverWait(driver,60);
    	        wait.until(ExpectedConditions.visibilityOf(ModulePNCPage.RespInvId));

     			Select select = new Select(ModulePNCPage.RespInvId);
       	  		select.selectByVisibleText(ExcelUtils.getCellData(row,11));
    		  }
    	  }

    	  public static void DélaiInvestigation(WebDriver driver) throws Throwable 
    	  {
    		  if(Investigation)
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
				c.add(Calendar.DATE,1);
				dt = c.getTime();
				String Sdate = dateFormat.format(dt);
				System.out.println(Sdate);
				JavascriptExecutor jse = (JavascriptExecutor)driver;
				jse.executeScript("arguments[1].value = arguments[0];",Sdate, ModulePNCPage.DelaiInvId);
				Thread.sleep(500);
    		  }
    	  }

    	
    	  public static void PlanInvestigation(WebDriver driver) throws Throwable 
    	  {
    		  if(Investigation)
    		  {
    			  //ModulePNCPage.JdreFichierId.click();
    			  JavascriptExecutor  executor = (JavascriptExecutor)driver;
    			  executor.executeScript("arguments[0].click()", driver.findElement(By.id("ctl00_ContentPlaceHolder1_FileUpload2")));
    			  Thread.sleep(1000);
    			  Runtime.getRuntime().exec("E:\\qualipro\\trunk\\AutomatisationTQualiPro_prod231\\resources\\Scripts\\joindreFichier1.exe");
    			  Thread.sleep(1000);
    		  }
    	  }

    	  
    	  public static void ApprobateurInvestigation() throws Throwable 
    	  {
    		  if(Investigation)
    		  {
    			  ExcelUtils.setExcelFile(Path,"PNC");
    			  Select select = new Select(ModulePNCPage.AppInvID);
    			  select.selectByVisibleText(ExcelUtils.getCellData(row,12));
    			  Thread.sleep(500);
     	  	  }
    	  }

    	 
    	  public static void validerInvestigation(WebDriver driver) throws Throwable
    	  {
    		  if(Investigation)
    		  {
    			//  Actions action = new Actions(driver);
    				//action.moveToElement(ModulePNCPage.VldInvID).perform();
				  JavascriptExecutor  executor2 = (JavascriptExecutor)driver;
				  executor2.executeScript("arguments[0].scrollIntoView(true);", ModulePNCPage.VldInvID);
				  Thread.sleep(200);
    			  JavascriptExecutor  executor = (JavascriptExecutor)driver;
    			  executor.executeScript("arguments[0].click()", ModulePNCPage.VldInvID);

    			}
    	  }
    	  public static void cliquerInvestigationPNC(WebDriver driver) throws Exception {
    		  if(Investigation)
    		  {
 		     
  		    ModulePNCPage.agendaPNC.click();
  		  WebDriverWait wait = new WebDriverWait(driver,60);
          wait.until(ExpectedConditions.visibilityOf(ModulePNCPage.VolInvID));
              ModulePNCPage.VolInvID.click();
              Thread.sleep(100L);
  	  	}
    		  }

  	  public static void consulterPNC_investigation(int num) throws Exception {
  		 if(Investigation)
		  {
  			 Thread.sleep(100L);
		 
  			 row=num;
    		  ExcelUtils.setExcelFile(Path, "PNC");
  			ModulePNCPage.rechNumPNCInvID.sendKeys(ExcelUtils.getCellData(row,15));
  			Thread.sleep(200L);
  			}
  		}
  	  public static void cliquersurPNC_investigation()  throws Exception{
  		 if(Investigation)
		  {
			ModulePNCPage.NumPNCInvID.findElement(By.tagName("a")).click();
			Thread.sleep(200L);
			}
		}
	  public static void Rapport_investigation() throws Exception {
		  if(Investigation)
		  {
			ModulePNCPage.RappInvID.sendKeys("Investigation");
			Thread.sleep(200L);
		}
			
		}
  	  public static void cliquerAppInvestigationPNC() throws Exception {
  		 if(Investigation)
		  {    
		    ModulePNCPage.agendaPNC.click();
		    Thread.sleep(500L);
            ModulePNCPage.VolAppInv.click();
            Thread.sleep(100L);
            }
	  	}

	  public static void consulterPNC_Appinvestigation(int num) throws Exception {
		  if(Investigation)
		  {
		  Thread.sleep(100L);
		  row=num;
  		  ExcelUtils.setExcelFile(Path, "PNC");
			ModulePNCPage.RechNumPNCAppInv.sendKeys(ExcelUtils.getCellData(row,15));
		}
		  }
	  public static void cliquersurPNC_Appinvestigation() throws Exception {
		  if(Investigation)
		  {
			ModulePNCPage.NumPNCAppInv.findElement(By.tagName("a")).click();
			Thread.sleep(500);
			}
		}
	  public static void ApprobationInvestigation(WebDriver driver) throws Exception {
		  if(Investigation)
		  {
			ModulePNCPage.ChxAppInvPNC.click();
			
		}
		}
    	  public static void causePNC() throws Exception {
    		  Thread.sleep(100L);
    		  ModulePNCPage.pnc_cause.sendKeys("cause 1");
    		  
    	    }
    	  
    	  public static void resptraitement() throws Throwable  {
    		  ExcelUtils.setExcelFile(Path, "PNC");
    		  ModulePNCPage.ajout_resp_trait.click();
    		  Select select = new Select(ModulePNCPage.nom_resptraitement);
  	  		select.selectByVisibleText(ExcelUtils.getCellData(row,16));
      		
        }
    	  public static void typeresptraitement() throws Throwable {
    		  ExcelUtils.setExcelFile(Path, "PNC");
    		  if(ExcelUtils.getCellData(row,17).equals("NON")) 
    		  {
    			  ModulePNCPage.TypeRespTraitId.click();
    		  }
    	  }
    	  public static void delaistraitement(WebDriver driver) throws InterruptedException {
    		    Thread.sleep(100L);
    			ModulePNCPage.delaistraitement.click();
    			Thread.sleep(1000L);
    			
    			
    			//added by rahma
    			if(driver.findElement(By.id("ctl00_ContentPlaceHolder1_CalendarExtender12_container")).isDisplayed()) {
    				System.out.println("calender is displayed");
    				ModulePNCPage.choix_delaistraitement.click();
    			}
    			else
    			{
    				System.out.println("calender not displayed");
    				JavascriptExecutor  executor = (JavascriptExecutor)driver;
    				executor.executeScript("arguments[0].click()", ModulePNCPage.choix_delaistraitement);
    			}
    		}
    	  public static void traitementPNC()  {
        		
    		  ModulePNCPage.traitementpnc.sendKeys("traitement 1");
    		  ModulePNCPage.validationtraitement.click();
    		  //ModulePNCPage.Paneldécision.click();
          }
      public static void choisir_typetraitement() throws Throwable  {
    	  ExcelUtils.setExcelFile(Path, "PNC");
    	  
    		String   choixparametré=ExcelUtils.getCellData1(1, 20);
    		System.out.println(choixparametré);
    		if(choixparametré.equals("seul")) {
    	  Select select = new Select(ModulePNCPage.typetraitement);
  	  	  select.selectByVisibleText(ExcelUtils.getCellData(row,4));}
    		else {
    			 Select select = new Select(ModulePNCPage.wtyeTraitPlusProduit.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_GridView_TypeTrait_wrapper\"]/div[2]/div/table/tbody/tr[1]/td[3]")).findElement(By.tagName("select")));
    	  	  	  select.selectByValue("81");
    	  	  	  Thread.sleep(500);
    	  	  	 Select select2 = new Select(ModulePNCPage.wtyeTraitPlusProduit.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_GridView_TypeTrait_wrapper\"]/div[2]/div/table/tbody/tr[2]/td[3]")).findElement(By.tagName("select")));
   	  	  	  select2.selectByValue("82");
    		}
  	  	  
      		
        }
      public static void choisir_resp_suivi(WebDriver driver) throws Exception  {
    	  Actions action = new Actions(driver);
    		action.moveToElement(ModulePNCPage.respsuivi).perform();

    	  ExcelUtils.setExcelFile(Path, "PNC"); 
 		 Select select = new Select(ModulePNCPage.respsuivi);
	  		select.selectByVisibleText(ExcelUtils.getCellData(row,19));
     }
      public static void validation_respsuivi(WebDriver driver) throws Exception {
    	  JavascriptExecutor executor = (JavascriptExecutor)driver;
			executor.executeScript("arguments[0].click()", ModulePNCPage.valdrespsuivi);
 	  		
 	  		//Thread.sleep(1000L);
 	  		//ModulePNCPage.Paneldécision.click();
 		
      }
      public static void cliquerDecTraitAvalider() throws Throwable {
    	  ModulePNCPage.agendaPNC.click();
		    Thread.sleep(500L);
          ModulePNCPage.volValDecTrait.click();
          Thread.sleep(100L);
      }
      public static void consulterPNC_VALD_dec_trait(int num) throws Throwable {
    	  row=num;
    	  ExcelUtils.setExcelFile(Path, "PNC");
		  Thread.sleep(1000L);
			ModulePNCPage.RechNumValDecTrait.findElement(By.tagName("input")).sendKeys(ExcelUtils.getCellData(row,15));
			Thread.sleep(100L);
    	  utilisateur =ModulePNCPage.UtilisateurID.getAttribute("innerText");
		  String RespVald=ExcelUtils.getCellData(row,6);
		  Boolean isPresent = ModulePNCPage.NumValdecTrait.findElements(By.tagName("a")).size() > 0;
		  if((isPresent==true)&&(utilisateur.equals(RespVald)))
		  {
			  ModulePNCPage.NumValdecTrait.findElement(By.tagName("a")).click();
		  }else if((isPresent==true)&&(!(utilisateur.equals(RespVald)))) 
		  {
			  
			  assertTrue(utilisateur.contains(RespVald));
		  }
		  else if((isPresent==false)&&((utilisateur.equals(RespVald)))) 
		  {
			  System.out.println("Si le type admet deux responsable, La fiche PNC  est validé par un autre responsable sinon vérifier bug");
		  }else if ((isPresent==false)&&(!(utilisateur.equals(RespVald)))) 
		  {
			  System.out.println("vous n'etes pas responsable validation pour cette fiche");
		  }
    	  row=num;
		 
      }
      public static void cliquersurPNC_VALD_dec_trait() throws Throwable {
    	  ModulePNCPage.NumValdecTrait.findElement(By.tagName("a")).click();
			Thread.sleep(500);
    	  
      }
      public static void ChoixValidationDécisionTraitement(String dec, WebDriver driver) throws Throwable {
    	 if(dec.equals("val. Dec. Trait")) 
    	 {
    		 	Actions action = new Actions(driver);
    			action.moveToElement(ModulePNCPage.valdDecTrait).perform();
    			Thread.sleep(1000);
    			//JavascriptExecutor  executor = (JavascriptExecutor)driver;
    			//executor.executeScript("arguments[0].click()", ModulePNCPage.valdDecTrait);
    			ModulePNCPage.valdDecTrait.click();
    			Thread.sleep(1000);

    	 }else 
    	 {
    		 Actions action = new Actions(driver);
 			action.moveToElement(ModulePNCPage.MotifRefusDecTrait).perform();
 			
    		 ModulePNCPage.MotifRefusDecTrait.sendKeys("Refus");
    		 JavascriptExecutor  executor = (JavascriptExecutor)driver;
  			executor.executeScript("arguments[0].click()",ModulePNCPage.RefusDecTrait);
    	
    	 }
    	  
      }
      
      public static void traitement_PNC() throws Exception{
		  Thread.sleep(1000L);
    	    ModulePNCPage.agendaPNC.click();
    	    Thread.sleep(1000L);
	  		ModulePNCPage.PNCàtraiter.click();
		  Thread.sleep(1000);
    }
      public static void consulterPNC_àtraiter(int num) throws Exception{
    	  Thread.sleep(1000L);
    	  row=num;
		  ExcelUtils.setExcelFile(Path, "PNC");
			ModulePNCPage.rechercherNumPNCtrait.sendKeys(ExcelUtils.getCellData(row,15));
			Thread.sleep(500);
		}
	  public static void cliquersurPNC_traitée() {

		ModulePNCPage.NumPNCtraitée.findElement(By.tagName("a")).click();
	}
	  public static void cliquersurPHASE_traitée() {

			ModulePNCPage.Phasetraitée.click();
		}
	  public static void PANELTRAITEMENTPNC()  {
    	  
	  		ModulePNCPage.PaneltraitementPNC.click();
  }
	  public static void rapporttraitement()  throws InterruptedException {
    		
    		ModulePNCPage.Rapporttraitement.sendKeys(Common.paragraphe(12,10));

     Thread.sleep(1000);
      }
	  public static void Date_traitement(WebDriver driver) throws InterruptedException {

			//ModulePNCPage.Datetraitement.click();
			//ModulePNCPage.Choixdatetraitement.click();
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
		  jse.executeScript("arguments[1].value = arguments[0];",Sdate, ModulePNCPage.Choixdatetraitement);
		  Thread.sleep(500);



		}
	  public static void cout_traitement() throws Throwable {
		  try {
			  ModulePNCPage.Coutdetraitement.isDisplayed();
  			  Common.Exporter_champ_A_masquer("le champ cout de traitement est visible");
  			 ExcelUtils.setExcelFile(Path, "PNC");
  			  if(!(ModulePNCPage.Coutdetraitement.isEnabled())) 
  			  {
  				  if(ExcelUtils.getCellData(row,17).equals("NON"))
  				  {
  					  System.out.println("Vous n'êtes pas premier responsable traitement");
  				  }else 
  				  {
  					  System.out.println("Bug: cout de traitement doit être accessible");
  				  }
  				  
  			  }else 
  			  {
  				  if(ExcelUtils.getCellData(row,17).equals("OUI"))
  				  {
  					  ModulePNCPage.Coutdetraitement.sendKeys("1500");
  				  }else 
  				  {
  					  System.out.println("Bug: cout de traitement doit être inaccessible");
  				  }

  				
  			  }
  			}
  			catch (NoSuchElementException e) {
  				Common.Exporter_champ_A_masquer("le champ cout de traitement est invisible");
  			}
		  
		 
		}
	  public static void quantitérejetée() throws Throwable  {
		  ExcelUtils.setExcelFile(Path, "PNC");
		  try {
			  if(ExcelUtils.getCellData(row,17).equals("OUI"))
			  {
				  ModulePNCPage.Quantitérejetée.sendKeys("90");
			  }else 
			  {
				  System.out.println("Bug: quantité rejetée doit être inaccessible");
			  }
		  }catch(NoSuchElementException exp) {
			  if(ExcelUtils.getCellData(row,17).equals("NON"))
			  {
				  System.out.println("Vous n'êtes pas premier responsable traitement");
			  }else 
			  {
				  System.out.println("Bug: quantité rejetée doit être accessible");
			  } 
		  }
		
			 
			  
	
		  
			  

			 
		 
  		
  		
    }
	  public static void quantitéacceptée() throws Throwable  {
		  ExcelUtils.setExcelFile(Path, "PNC");
		  
		  try {
			  if(ExcelUtils.getCellData(row,17).equals("OUI"))
			  {
				  ModulePNCPage.Quantitéacceptée.sendKeys("50");
			  }else 
			  {
				  System.out.println("Bug: quantité acceptée doit être inaccessible");
			  }  
			  
			  
			
		  }catch(NoSuchElementException exp)
		  {
			  if(ExcelUtils.getCellData(row,17).equals("NON"))
			  {
				  System.out.println("Vous n'êtes pas premier responsable traitement");
			  }else 
			  {
				  System.out.println("Bug: quantité acceptée doit être accessible");
			  } 
		  }

	  		
	  		
	    }
	  public static void quantitédégradée() throws Throwable  {
		  ExcelUtils.setExcelFile(Path, "PNC");
		  try {
			  if(ExcelUtils.getCellData(row,17).equals("OUI"))
			  {
				  ModulePNCPage.Quantitédégradée.sendKeys("10");
			  }else 
			  {
				  System.out.println("Bug: quantité dégradée doit être inaccessible");
			  }
		  }catch (NoSuchElementException e) {
			  if(ExcelUtils.getCellData(row,17).equals("NON"))
			  {
				  System.out.println("Vous n'êtes pas premier responsable traitement");
			  }else 
			  {
				  System.out.println("Bug: quantité dégradée doit être accessible");
			  }
		}
		 
			

	  		
	  		
	    }
	  public static void pourcentagedépréciation() throws Throwable  {
		  ExcelUtils.setExcelFile(Path, "PNC");
		  try {
			  
			  if(ExcelUtils.getCellData(row,17).equals("OUI"))
			  {
				  ModulePNCPage.Pourcentagedépréciation.sendKeys("1");
			  }else 
			  {
				  System.out.println("Bug: Pourcentage dépréciation doit être inaccessible");
			  }

		  }catch(NoSuchElementException exp) {
			  if(ExcelUtils.getCellData(row,17).equals("NON"))
			  {
				  System.out.println("Vous n'êtes pas premier responsable traitement");
			  }else 
			  {
				  System.out.println("Bug: Pourcentage dépréciation doit être accessible");
			  }  
		  }
		
			  
			  
			
		  
	  		
	  		
	    }
	  public static void VérifierTaux() throws Throwable{
		  ExcelUtils.setExcelFile(Path, "PNC");
		  String detection=ExcelUtils.getCellData(row,9);
		  if(detection.equals("CLIENT"))
		  {
		  Float ValeurRejetée;
		  Float ValeurDéclassée;
		  Float CoutTotal;
		  ExcelUtils.setExcelFile(Path, "PNC");
		  Float PMP=Float.valueOf(ExcelUtils.getCellData(row,13));
		  Float PV=Float.valueOf(ExcelUtils.getCellData(row,14));
		  if(ExcelUtils.getCellData(row,9).equals("INTERNE")) 
		  {
			  ValeurRejetée=PMP*Float.valueOf(ModulePNCPage.Quantitérejetée.getAttribute("value"));
			  ValeurDéclassée=PMP*Float.valueOf(ModulePNCPage.Quantitédégradée.getAttribute("value"))*Float.valueOf(ModulePNCPage.Pourcentagedépréciation.getAttribute("value"));
			  ValeurDéclassée=ValeurDéclassée/100;
		  }else 
		  {
			  ValeurRejetée=PV*Float.valueOf(ModulePNCPage.Quantitérejetée.getAttribute("value"));
			  ValeurDéclassée=PV*Float.valueOf(ModulePNCPage.Quantitédégradée.getAttribute("value"))*Float.valueOf(ModulePNCPage.Pourcentagedépréciation.getAttribute("value"));
			  ValeurDéclassée=ValeurDéclassée/100;
		  }
		 
		  
		  try {
			  ModulePNCPage.Coutdetraitement.isDisplayed();
			  Common.Exporter_champ_A_masquer("le champ cout total est visible");
			  CoutTotal=ValeurRejetée + ValeurDéclassée + Float.valueOf(ModulePNCPage.Coutdetraitement.getAttribute("value"));
		  }
			catch (NoSuchElementException e) {
				CoutTotal=ValeurRejetée + ValeurDéclassée;
			}
		  System.out.println("Valeur rejetée"+ValeurRejetée );
		  System.out.println("Valeur déclassé"+ValeurDéclassée);
		  //System.out.println("cout total"+CoutTotal);
		  assertTrue(ModulePNCPage.ValeurRejetéeId.getAttribute("Value").equals(Integer.toString(ValeurRejetée.intValue())));
		  assertTrue(ModulePNCPage.ValeurDéclasséeId.getAttribute("Value").equals(Integer.toString(ValeurDéclassée.intValue())));
		  try {
			  ModulePNCPage.CoutTotalId.isDisplayed();
			  assertTrue(ModulePNCPage.CoutTotalId.getAttribute("Value").equals(Integer.toString(CoutTotal.intValue())));
			  }
			  catch (NoSuchElementException e) {
	  				Common.Exporter_champ_A_masquer("le champ cout total est invisible");
	  			}
		  } 
	  }
	  public static void valdationtraitement()  {
	  		
	  		ModulePNCPage.validationtraitementPNC.click();
	    }
	  public static void consulterPNCàcloturer(int num) throws Throwable{
		  row=num;
		  Thread.sleep(100L);
		  ExcelUtils.setExcelFile(Path, "PNC");
			ModulePNCPage.Rechercher_NumPNCcloturée.findElement(By.tagName("input")).sendKeys(ExcelUtils.getCellData(row,15));
			
		}
	  public static void cliquersurPNCàcloturer() throws Throwable{
		  Thread.sleep(100L);
		ModulePNCPage.Num_PNCcloturée.findElement(By.tagName("a")).click();
	}
	  public static void cloture_PNC() throws InterruptedException {

			ModulePNCPage.PNCcloturée.click();
			
			
		} 
	  public static void Rapport_cloture_PNC() {
		  
		   ModulePNCPage.Rapportcloture.sendKeys("ok pour ce rapport");
		
		} 
	  public static void Validation_cloture_PNC() {

			ModulePNCPage.validationcloture.click();
		} 
	  public static void consulterPNCàapprouver() {
			
			ModulePNCPage.PNCà_approuver.click();
		}

      public static void recherche_PNCàapprouver(int num) throws Throwable {
    	  row=num;
		  Thread.sleep(100L);
		  ExcelUtils.setExcelFile(Path, "PNC");
			ModulePNCPage.Rechercher_NumPNCà_approuver.findElement(By.tagName("input")).sendKeys(ExcelUtils.getCellData(row,15));
		}
      
	  public static void cliquersurPNCàapprouver()throws InterruptedException {
		  Thread.sleep(100L);
		ModulePNCPage.Num_PNCapprouvée.findElement(By.tagName("a")).click();
	}
	  
	  public static void Approbation_PNC() throws InterruptedException {

			ModulePNCPage.PNCapprouvée.click();
			//Thread.sleep(1000L);
			//ModulePNCPage.PanelapprobationPNC.click();
		} 
	  
	  public static void Rapport_approbation_PNC() {

			ModulePNCPage.Rapportapprobation.sendKeys("ok pour ce rapport 2");
		
		} 
	  
	  public static void Validation_approbation_PNC(WebDriver driver) {
		  JavascriptExecutor js = (JavascriptExecutor) driver;

	       	
	        js.executeScript("arguments[0].scrollIntoView();", ModulePNCPage.validationapprobation);
	        

	  	  JavascriptExecutor js2 = (JavascriptExecutor) driver;
	  	 js2.executeScript("arguments[0].click();", ModulePNCPage.validationapprobation);
	  	  
			//ModulePNCPage.validationapprobation.click();
		} 
	  
	  public static void Recherche_Fiche_PNC(WebDriver driver) throws Throwable {
		  	ExcelUtils.setExcelFile(Path, "PNC");
			ModulePNCPage.NFichePNC.sendKeys(ExcelUtils.getCellData(row,15));
			JavascriptExecutor  executor = (JavascriptExecutor)driver;
			executor.executeScript("arguments[0].click()",ModulePNCPage.rechercheModulePNC);
			Thread.sleep(500L);
		} 
	  public static void Consulter_FichePNC() throws InterruptedException {

			ModulePNCPage.numerofichePNC.click();
			Thread.sleep(1000L);
		}
	  public static void Consulter_aperçuFichePNC() throws InterruptedException {

			ModulePNCPage.aperçuPNC.click();
			Thread.sleep(1000L);
		}
	  //Amira
		/*public static void initializer_filtre_Bilan_PNC(String Path) throws Throwable {

			ExcelUtils.setExcelFile(Path, "PNC");
			filtre_repor.put(ModulePNCPage.btn_Produit_Bilan_PNC_id,ExcelUtils.getCellData(1,2));
			filtre_repor.put(ModulePNCPage.btn_Lot_Bilan_PNC_id,ExcelUtils.getCellData(1,*****));
			filtre_repor.put(ModulePNCPage.selec_Type_NonConformité_Bilan_PNC_id,ExcelUtils.getCellData(1,16));
			filtre_repor.put(ModulePNCPage.selec_Atelier_Bilan_PNC_id,ExcelUtils.getCellData(1,****));
			filtre_repor.put(ModulePNCPage.selec_Type_traitement_Bilan_PNC_id,ExcelUtils.getCellData(1,15));
			filtre_repor.put(ModulePNCPage.selec_Resp_traitement_Bilan_PNC_id,ExcelUtils.getCellData(1,1));
			filtre_repor.put(ModulePNCPage.selec_Source_Bilan_PNC_id,ExcelUtils.getCellData(1,****));
			filtre_repor.put(ModulePNCPage.selec_Famille_produit_Bilan_PNC_id,ExcelUtils.getCellData(1,****));
			filtre_repor.put(ModulePNCPage.selec_Gravité_Bilan_PNC_id,ExcelUtils.getCellData(1,****));
			filtre_repor.put(ModulePNCPage.selec_Site_Bilan_PNC_id,ExcelUtils.getCellData(1,19));
			filtre_repor.put(ModulePNCPage.selec_Processus_Bilan_PNC_id,ExcelUtils.getCellData(1,18));
			filtre_repor.put(ModulePNCPage.selec_Activité_Bilan_PNC_id,ExcelUtils.getCellData(1,****));
			filtre_repor.put(ModulePNCPage.selec_Direction_Bilan_PNC_id,ExcelUtils.getCellData(1,****));
			filtre_repor.put(ModulePNCPage.del_DateDétection1_Bilan_PNC_id,ExcelUtils.getCellData(1,****));
			filtre_repor.put(ModulePNCPage.del_DateDétection2_Bilan_PNC_id,ExcelUtils.getCellData(1,****));
		}*/



}
    	  
