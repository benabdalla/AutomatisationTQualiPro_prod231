package com.qualiprobdd.e2etests.moduleAction.models;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qualiprobdd.e2etests.moduleAction.pages.ActSimplPage;
import com.qualiprobdd.e2etests.moduleAction.pages.DemandeActionPage;
import com.qualiprobdd.e2etests.moduleAction.pages.FicheActionPage;
import com.qualiprobdd.e2etests.util.Common;
import com.qualiprobdd.e2etests.util.ExcelUtils;

public class ActSimplModel {

	/* Public methods */

	private static String Path = "resources/testData/TestData.xlsx";

	public static void consulterFiltreActionsSimplifiée(WebDriver driver) throws InterruptedException {
		//FicheActionPage.btnAjouterAction.click();
		JavascriptExecutor  executor = (JavascriptExecutor)driver;
	 	executor.executeScript("arguments[0].click()", FicheActionPage.btnAjouterAction);
		Thread.sleep(1000L);
		//ActSimplPage.AjouterActSimplifiee.click();
		executor.executeScript("arguments[0].click()", ActSimplPage.AjouterActSimplifiee);
		Thread.sleep(1000L);
		Common.Exporter_visibilité("Nouvelle Fiche Action Simplifie");
		Common.Exporter_champ_A_masquer("Nouvelle Fiche Action Simplifie");
	}

	public static void service() throws Exception {
  		ExcelUtils.setExcelFile(Path, "ActSimpl");
		Select select = new Select(ActSimplPage.serviceActSimplifiee);
		select.selectByVisibleText(ExcelUtils.getCellData(1, 0));
	}

	public static void  resp_cloture() throws Exception {
        
		ExcelUtils.setExcelFile(Path, "ActSimpl");
		Select select = new Select(ActSimplPage.Respcloture);
		select.selectByVisibleText(ExcelUtils.getCellData(1, 1));
	}

	public static void validationActSimpl(WebDriver driver) throws InterruptedException {
		//ActSimplPage.VldenregactSimplifiee.click();
		JavascriptExecutor  executor = (JavascriptExecutor)driver;
	 	executor.executeScript("arguments[0].click()", ActSimplPage.VldenregactSimplifiee);
		Thread.sleep(1000L);
	}

	 public static void datecreation(WebDriver driver) throws Exception {
	     
		    //ActSimplPage.DatecreationActSimplifiee.click();
		 	JavascriptExecutor  executor = (JavascriptExecutor)driver;
		 	executor.executeScript("arguments[0].click()", ActSimplPage.DatecreationActSimplifiee);
			Thread.sleep(1000);
			//ActSimplPage.agendacreation.click();
			executor.executeScript("arguments[0].click()", ActSimplPage.agendacreation);
	  	}
	 
	 public static void ResponsableSuivi(WebDriver driver) throws Exception {
		 //ActSimplPage.VolDetailsActionId.click();
		 	JavascriptExecutor  executor = (JavascriptExecutor)driver;
		 	executor.executeScript("arguments[0].click()", ActSimplPage.VolDetailsActionId);
		 	Thread.sleep(1000);
		  //ActSimplPage.TypeRespSuiviId.click();
		    executor = (JavascriptExecutor)driver;
			executor.executeScript("arguments[0].click()", ActSimplPage.TypeRespSuiviId);
			Thread.sleep(1000);
			ExcelUtils.setExcelFile(Path, "ActSimpl");
			Select select = new Select(ActSimplPage.RespSuiviId);
			select.selectByVisibleText(ExcelUtils.getCellData(1,2));
	 }
	 public static void DateSuivi(WebDriver driver) throws Exception {
		   
		    WebDriverWait wait = new WebDriverWait(driver,30);
	        wait.until(ExpectedConditions.elementToBeClickable(ActSimplPage.DelaiSuiviId));
	        ActSimplPage.DelaiSuiviId.click();
	        JavascriptExecutor executor=(JavascriptExecutor)driver;
		   //executor.executeScript("arguments[0].click()", ActSimplPage.DelaiSuiviId);
					Thread.sleep(1000);
					wait.until(ExpectedConditions.elementToBeClickable(ActSimplPage.DateSuiviId));
					ActSimplPage.DateSuiviId.click();
					//executor.executeScript("arguments[0].click()", ActSimplPage.DateSuiviId);
					//ActSimplPage.BtnVldRespSuiviId.click();
					executor.executeScript("arguments[0].click()", ActSimplPage.BtnVldRespSuiviId);
					Thread.sleep(1000);
		 
	 }
	 
	 public static void VérifierRespSuivi() throws Exception {
			boolean VerifRespSuivi=FicheActionPage.responsableSuiviID.isDisplayed();
			System.out.println(VerifRespSuivi);
			if(VerifRespSuivi)
			{
				Select select = new Select(FicheActionPage.responsableSuiviID);
				System.out.println(select.getFirstSelectedOption().getText());
			}
	 }
	 
	 public static void VérifierDateSuivi() throws Exception {
			boolean VerifDateSuivi=ActSimplPage.AFFDateSuiviId.isDisplayed();
			System.out.println(VerifDateSuivi);
			if(VerifDateSuivi)
			{
				System.out.println(ActSimplPage.AFFDateSuiviId.getText());
			}
		 
	 }
		public static void clickAjouterSousActionModeleAction(WebDriver driver) {
			
			  //ActSimplPage.btnAjouterSousActionModeleAction.click();
			JavascriptExecutor executor=(JavascriptExecutor)driver;
			executor.executeScript("arguments[0].click()", ActSimplPage.btnAjouterSousActionModeleAction);
		}
	 
	 
	 




	
}
