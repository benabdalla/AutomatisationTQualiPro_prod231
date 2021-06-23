package com.qualiprobdd.e2etests.Formation.Models;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qualiprobdd.e2etests.Formation.Pages.DemandeFormationPage;
import com.qualiprobdd.e2etests.ReclamationClient.Pages.ReclamationClientPage;
import com.qualiprobdd.e2etests.authentification.models.AuthentificationModel;
import com.qualiprobdd.e2etests.moduleAction.models.DemandeActionModel;
import com.qualiprobdd.e2etests.moduleAction.pages.DemandeActionPage;
import com.qualiprobdd.e2etests.moduleAction.pages.FicheActionPage;
import com.qualiprobdd.e2etests.util.Common;
import com.qualiprobdd.e2etests.util.ExcelUtils;
import com.qualiprobdd.e2etests.util.RandomValue;





public class DemandeFormationModel {
	
	static String NumDFormation, utilisateur, demandeur;
	static boolean Rec_State_App;
	static String responsable;
	public static List<String> EnsResponsables;
	public static String Cpt_agenda_GRH;
	private static String Path = "resources/testData/TestData.xlsx";

	public static void consulter_MGRH(WebDriver driver) throws Throwable {
		Thread.sleep(1000);
		//DemandeFormationPage.MenuID.click();
		//added by rahma
		JavascriptExecutor  executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click()", DemandeFormationPage.MenuID);

		utilisateur=DemandeFormationPage.UtilisateurID.getAttribute("innerText");
		System.out.println("utilisateur 1:"+utilisateur);
		Thread.sleep(500L);
		Common.AccéderModule(12,0,0,driver);
		
	}

	public static void consulter_SM_Formation(WebDriver driver) throws Throwable {
		Common.AccéderModule(12, 2, 0, driver);
	}

	public static void consulter_SSM_DemandeFormation(WebDriver driver) throws Throwable {
		Common.AccéderModule(12,2,2,driver);
	}

	
	public static void cliquer_sur_ajouter_fiche_Dformation(WebDriver driver) throws Throwable {
		//DemandeFormationPage.BAjtID.click();
		//added by rahma
		JavascriptExecutor  executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click()", DemandeFormationPage.BAjtID);

		Thread.sleep(500L);
		Common.Exporter_visibilité("Nouvelle Fiche Demande Formation");
		Common.Exporter_champ_A_masquer("Nouvelle Fiche Demande Formation");
	}
	
	 public static void asserttrueF(Boolean incrementation) {
			System.out.println(incrementation);
		}
	
	public static void Verifier_demandeur(WebDriver driver) throws Throwable {
		
	boolean test=false;
		Select select = new Select(DemandeFormationPage.DemandeurID);
		//demandeur=select.getFirstSelectedOption().getText();
		demandeur=driver.findElement(By.id("ctl00_ContentPlaceHolder1_Lbldemandeur")).getText();
		System.out.println("demandeur 1:"+demandeur);
		if(demandeur.equals(utilisateur))
		{
			asserttrueF(test);
		}
	}

	
	public static void choisir_theme(String them) throws Throwable {
		Select select = new Select(DemandeFormationPage.ThemeID);
		select.selectByVisibleText("Espagnole");
	
	}

	
	public static void saisir_date_formation_prevu(WebDriver driver) throws Throwable {
		//DemandeFormationPage.DatPrevID.click();
		//added by rahma
		Actions action = new Actions(driver);
		action.moveToElement(DemandeFormationPage.DatPrevID).click().perform();
		//added by rahma
		action.moveToElement(DemandeFormationPage.DatSysID).click().perform();
		//DemandeFormationPage.DatSysID.click();
	}

	public static void choisir_organisme() throws Throwable {
		Select select = new Select(DemandeFormationPage.OrgID);
		select.selectByVisibleText("ORGANISME AUTO");
	}
	
	public static void choisir_societe() throws Throwable {
		try {
			DemandeFormationPage.SocID.isDisplayed();
		Select select = new Select(DemandeFormationPage.SocID);
		select.selectByVisibleText("SOCIETE AUTO");
		}catch (NoSuchElementException e) {
			Common.Exporter_visibilité("la societe est invisible");
		}
	}
	
	public static void choisir_site(String site, WebDriver driver) throws Throwable {
try {
			
			DemandeFormationPage.SiteID.isDisplayed();
			Common.Exporter_visibilité("le site est visible");
			String text=driver.findElement(By.id("ctl00_ContentPlaceHolder1_lbsite2")).getText();
			if(text.indexOf('*')!=-1) 
			{
				Common.Exporter_visibilité("le site est obligatoire");
			}else 
			{
				Common.Exporter_visibilité("le site n'est pas obligatoire");
				
			}
			Select select = new Select(DemandeFormationPage.SiteID);
			select.selectByVisibleText(site);
			}
			catch (NoSuchElementException e) {
				Common.Exporter_visibilité("le site est invisible");
			}
		
	}
	
	public static void choisir_processus(String process,WebDriver driver) throws Throwable {
		try {
			DemandeFormationPage.ProcessusID.isDisplayed();
			Common.Exporter_visibilité("le processus est visible");
			String text=driver.findElement(By.id("ctl00_ContentPlaceHolder1_LblProcessus_")).getText();
			if(text.indexOf('*')!=-1) 
			{
				Common.Exporter_visibilité("le processus est obligatoire");
			}else 
			{
				Common.Exporter_visibilité("le processus n'est pas obligatoire");
				
			}
			Select select = new Select(DemandeFormationPage.ProcessusID);
			select.selectByVisibleText(process);
			
			}
			catch (NoSuchElementException e) {
				Common.Exporter_visibilité("le processus est invisible");
			}
		
	}
	
	public static void choisir_activite(WebDriver driver) throws Throwable {
		try {
			DemandeFormationPage.ActiviteID.isDisplayed();
			Common.Exporter_visibilité("l'activité est visible");
			String text=driver.findElement(By.id("ctl00_ContentPlaceHolder1_LblDomaine_")).getText();
			if(text.indexOf('*')!=-1) 
			{
				Common.Exporter_visibilité("l'activité est obligatoire");
			}else 
			{
				Common.Exporter_visibilité("l'activité n'est pas obligatoire");
				
			}
			Select select = new Select(DemandeFormationPage.ActiviteID);
			select.selectByVisibleText("ACTIVITE AUTO");
			}
			catch (NoSuchElementException e) {
				Common.Exporter_visibilité("l'activité est invisible");
			}
	
	}
	
	public static void choisir_direction(WebDriver driver) throws Throwable {
		try {
			DemandeFormationPage.DIRECTIONID.isDisplayed();
			Common.Exporter_visibilité("la direction est visible");
			String text=driver.findElement(By.id("ctl00_ContentPlaceHolder1_LabelDir")).getText();
			if(text.indexOf('*')!=-1) 
			{
				Common.Exporter_visibilité("la direction est obligatoire");
			}else 
			{
				Common.Exporter_visibilité("la direction n'est pas obligatoire");
				
			}
			Select select = new Select(DemandeFormationPage.DIRECTIONID);
			select.selectByVisibleText("DIRECTION AUTO");
			}
			catch (NoSuchElementException e) {
				Common.Exporter_visibilité("la direction est invisible");
			}

	}
	
	public static void choisir_service(WebDriver driver) throws Throwable {
		try {
			DemandeFormationPage.ServiceID.isDisplayed();
			Common.Exporter_visibilité("le service est visible");
			String text=driver.findElement(By.id("ctl00_ContentPlaceHolder1_LblService_")).getText();
			if(text.indexOf('*')!=-1) 
			{
				Common.Exporter_visibilité("le service est obligatoire");
			}else 
			{
				Common.Exporter_visibilité("le service n'est pas obligatoire");
			}
			Thread.sleep(800);
			Select select = new Select(DemandeFormationPage.ServiceID);
			select.selectByVisibleText("SERVICE AUTO");
			}
			catch (NoSuchElementException e) {
				Common.Exporter_visibilité("le service est invisible");
			}
		
	}
	
	public static void choisir_typeFormation(String type) throws Throwable {
		try {
			DemandeFormationPage.TypeID.isDisplayed();
		Select select = new Select(DemandeFormationPage.TypeID);
		select.selectByVisibleText(type);
		}
		catch (NoSuchElementException e) {
			Common.Exporter_visibilité("le type formation est invisible");
		}
	}

	public static void saisir_formateur() throws Throwable {

		DemandeFormationPage.FormateurID.sendKeys("saphir consult");
	}
	public static void saisir_nbre_jour(String NJ) throws Throwable {

		DemandeFormationPage.NbreJourID.sendKeys(NJ);
	}

	public static void saisir_cout(String Cout) throws Throwable {
		DemandeFormationPage.CoutID.sendKeys(Cout);
	}

	public static void saisir_Lieu() throws Throwable {
		DemandeFormationPage.LieuID.sendKeys("Saphir Consult");
	   
	}
	
	public static void saisir_objectif(String Objectif) throws Throwable {
		DemandeFormationPage.ObjectifID.sendKeys(RandomValue.randomString(10));
	    
	}
	
	public static void ajouter_participant(WebDriver driver)throws Throwable {
		DemandeFormationPage.AjtParID.click();
		DemandeFormationPage.RechParID.sendKeys("AUTO");
		DemandeFormationPage.VldRechParID.click();
		//added by rahma
		JavascriptExecutor  executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click()", DemandeFormationPage.AjtParID);
		executor.executeScript("arguments[0].click()", DemandeFormationPage.RechParID);
		executor.executeScript("arguments[0].click()", DemandeFormationPage.VldRechParID);

	}
		
    public static void valider_demande_formation(WebDriver driver) throws Throwable {
    	//added by rahma
		Thread.sleep(500);
    	JavascriptExecutor  executor = (JavascriptExecutor)driver;
    	executor.executeScript("arguments[0].click()", DemandeFormationPage.BVldID);


		//DemandeFormationPage.BVldID.click();
	}
	
    public static void verifier_demande_formation() throws Throwable {
   
    		Thread.sleep(1000L);
    		NumDFormation =DemandeFormationPage.NumDFormationID.getText();
    		System.out.println("demande Formation N:"+ NumDFormation + "est Ajoute");
    		Common.Exporter_visibilité("Fiche demande formaton:"+NumDFormation);
    		Common.Exporter_champ_A_masquer("Fiche demande formation: "+NumDFormation);
    		asserttrueF(true);
    		Common.Exporter_numFiche("demande Formation N:"+ NumDFormation);
	}
    
   public static void Recuperer_RV(){
    	
    	EnsResponsables= new ArrayList();
		List<WebElement> rows_Table = DemandeFormationPage.RespTableID.findElements(By.tagName("tr"));
		int rowCount= rows_Table.size();
		for(int i=0;i<rowCount;i++) {
			List<WebElement> Column_Table = rows_Table.get(i).findElements(By.tagName("td"));
			if(Column_Table.size()!=0)
			{
			EnsResponsables.add(Column_Table.get(2).getText());
			System.out.println("responsable:" + Column_Table.get(1).getText() );
			}
		}
		System.out.println(" tous  le  respo   " + EnsResponsables );
			
    }
   
   public static String Recuperer_utilisateur() 
   {
	   return demandeur;
   }
   
   
   public static void Vérifier_RV(int row) throws Throwable{
	   boolean VerifResp=true;
	   int i=7,j=0;
		ExcelUtils.setExcelFile(Path, "Formation");
		
	   if(!(EnsResponsables.isEmpty()) )
	{
		String obj=ExcelUtils.getCellData(row,i);
		String curRes= EnsResponsables.get(j);
		if(!(obj.equals(curRes)))
	    {
			VerifResp=false;
		}
		i++;
		j++;

	}
	  // ExcelUtils.setCellData(NumDFormation,row,9);
	   asserttrueF(VerifResp);
   }
   
	public static void Verifier_compteur_agenda_DA(WebDriver driver) throws Throwable {
		Boolean incrementation = false;
		int compteur;
		String Cpt_agenda= DemandeFormationPage.CptAgdID.getText();
		if (Cpt_agenda != "") {
			compteur = Integer.parseInt(Cpt_agenda);
			System.out.println("compteur: " + compteur);
		} else {
			compteur = 0;
			System.out.println("compteur: " + compteur);
		}
		//DemandeFormationPage.HomeID.click();
		//added by rahma
		JavascriptExecutor  executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click()", DemandeFormationPage.HomeID);
		Thread.sleep(2000L); 
		System.out.println("compteur1 : " + DemandeFormationPage.CptAgdID.getText());
		if (Integer.parseInt(DemandeFormationPage.CptAgdID.getText()) == compteur + 1) {
			incrementation = true;
		}
		asserttrueF(incrementation);
	}
   
	public static void Acceder_Demande(WebDriver driver) throws Exception
	{
		//DemandeFormationPage.MAgdID.click();
		//added by rahma
		Thread.sleep(1000);
		JavascriptExecutor  executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click()", DemandeFormationPage.MAgdID);
		WebDriverWait wait = new WebDriverWait(driver,60);
        wait.until(ExpectedConditions.visibilityOf(DemandeFormationPage.AGDDFID));
		executor.executeScript("arguments[0].click()", DemandeFormationPage.AGDDFID);
		//DemandeFormationPage.AGDDFID.click();
		DemandeFormationPage.AgdRechID.sendKeys(NumDFormation);
		Thread.sleep(1000L);
		 //To find third row of table
		 WebElement tableRow = DemandeFormationPage.TableVdfID.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_GridView1\"]/tbody/tr"));
		    
		    //to get 3rd row's 2nd column data
		    WebElement cellIneed = tableRow.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_GridView1\"]/tbody/tr/td[1]"));
		    WebElement cellIneed1 = cellIneed.findElement(By.tagName("a"));
		    //added by rahma
			executor.executeScript("arguments[0].click()", cellIneed1);
		    //cellIneed1.click();
		Thread.sleep(1000L);
		//DemandeFormationPage.BoutValdDfID.click();
		executor.executeScript("arguments[0].click()", DemandeFormationPage.BoutValdDfID);
		Thread.sleep(1000L);
	}

		

	

   
   


}
