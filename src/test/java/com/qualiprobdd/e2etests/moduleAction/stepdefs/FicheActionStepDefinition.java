package com.qualiprobdd.e2etests.moduleAction.stepdefs;


import com.qualiprobdd.e2etests.Environnement.pages.ReportingEnvironnementPage;
import com.qualiprobdd.e2etests.agenda.Page.PageSommerAgenda;
import com.qualiprobdd.e2etests.moduleAction.models.FicheActionModele;
import com.qualiprobdd.e2etests.moduleAction.pages.FicheActionPage;
import com.qualiprobdd.e2etests.util.*;
import io.cucumber.java.en.*;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

import static org.testng.Assert.assertTrue;
public class FicheActionStepDefinition {
	
	public WebDriver driver;
	public String  NumAction ="";
	public String taux;
	private static String Path = "resources/testData/TestData.xlsx";
	private boolean Etatcloture;
	private int row;
	
	private Common common = new Common();
	public FicheActionStepDefinition() {
		driver = Setup.driver;
		PageFactory.initElements(driver, FicheActionPage.class);
		PageFactory.initElements(driver, PageSommerAgenda.class);

	}





	@Given("consulter  types d'action")
	public void consulter_types_d_action() throws Exception {
FicheActionModele.consulter_types_d_action(driver);
	}


	@Given("Ajouter  types d'action")
	public void ajouter_types_d_action() {
		FicheActionModele.ajouter_types_d_action();
	}


	@Given("saisir  type d'action")
	public void saisir_type_d_action() throws Exception {
		FicheActionModele.saisir_type_d_action(row);
	}


	@Given("clique   sur   valider")
	public void clique_sur_valider() throws InterruptedException {
		FicheActionModele.clique_sur_valider();
	}


	@Given("verifier  type d'action")
	public void verifier_type_d_action() throws Exception {
		FicheActionModele.verifier_type_d_action(row);
	}


	@Given("consulter  source d'action")
	public void consulter_source_d_action() throws Exception {
		FicheActionModele.consulter_source_d_action(driver);
	}

	@Given("^ajuter type de causeso$")
	public void ajuter_type_de_causeso() throws Throwable {
		FicheActionModele.ajouter_type_de_causes(driver);
	}


	@Given("Ajouter   source d'action")
	public void ajouter_source_d_action() {
		FicheActionModele.ajouter_source_d_action();
	}


	@Given("saisir   source d'action")
	public void saisir_source_d_action() throws Exception {
		FicheActionModele.saisir_source_d_action(row);
	}


	@Given("clique    source d'action")
	public void clique_source_d_action() {
		FicheActionModele.clique_source_d_action();
	}


	@Given("verifier   source d'action")
	public void verifier_source_d_action() throws Exception {
		FicheActionModele.verifier_source_d_action(row);
	}


	@Given("^ajouter type de causes$")
	public void ajouter_type_de_causes() throws Throwable {
		FicheActionModele.ajouter_type_de_causes(driver);
	}

	@Given("^saisir  type   de causes$")
	public void saisir_type_de_causes() throws Throwable {
		FicheActionModele.saisir_type_de_causes(row);
	}

	@Given("^verifier type de causes$")
	public void verifier_type_de_causes() throws Throwable {
		FicheActionModele.verifier_type_de_causes(row);
	}

	@Given("^ajouter  priorit??$")
	public void ajouter_priorit??() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		FicheActionModele.ajouter_priorit??(driver);
	}

	@Given("^saisir  priorit??$")
	public void saisir_priorit??() throws Throwable {
	FicheActionModele.saisir_priorit??(row);
	}

	@Given("^verifier priorit??$")
	public void verifier_priorit??() throws Throwable {
	FicheActionModele.verifier_priorit??(row);
	}

	@Given("^ajouter gravit??$")
	public void ajouter_gravit??() throws Throwable {
	FicheActionModele.ajouter_gravit??(driver);
	}

	@Given("^saisir  gravit??$")
	public void saisir_gravit??() throws Throwable {
	FicheActionModele.saisir_gravit??(row);
	}

	@Given("^verifier gravit??$")
	public void verifier_gravit??() throws Throwable {
	FicheActionModele.verifier_gravit??(row);
	}


	@When("^Consulter action a cloture$")
	public void consulter_action_a_cloture() throws Throwable {
		ExcelUtils.setExcelFile(Path, "Action");

		String NumAction = ExcelUtils.getCellData(row, 7);
		FicheActionPage.RechFiltreId.sendKeys(NumAction);
		//FicheActionPage.BtnRechFiltId.click();
		JavascriptExecutor executor = (JavascriptExecutor) driver;
	executor.executeScript("arguments[0].click()", FicheActionPage.BtnRechFiltId);
	Thread.sleep(1000L);
	//FicheActionPage.TableFiltreAction.findElement(By.tagName("a")).click();
	executor.executeScript("arguments[0].click()", FicheActionPage.TableFiltreAction.findElement(By.tagName("a")));
	Thread.sleep(1000L);
 
}

@When("^cliquer  sur   action   Cloture$")
public void cliquer_sur_action_Cloture() throws Throwable {
	JavascriptExecutor executor =(JavascriptExecutor)driver;
	executor.executeScript("arguments[0].click()", FicheActionPage.WbtnClot);
}

@When("^cliquer   sur  non cloture$")
public void cliquer_sur_non_cloture() throws Throwable {
	JavascriptExecutor executor =(JavascriptExecutor)driver;
	executor.executeScript("arguments[0].click()", FicheActionPage.wNOClot);
	JavascriptExecutor executor2 =(JavascriptExecutor)driver;
	Thread.sleep(500);
	FicheActionPage.dateCloture.click();	
	Thread.sleep(1000);
	FicheActionPage.choixDateCloture.click();
	Thread.sleep(500);
	FicheActionPage.rapportClotureID.sendKeys("Test Auto");
	executor2.executeScript("arguments[0].click()", FicheActionPage.wBtnValidNOclot);
	
	
}

@When("^v??rfier  etat action Module$")
public void v??rfier_etat_action_Module() throws Throwable {
	ExcelUtils.setExcelFile(Path, "Action");
	String NumAction=ExcelUtils.getCellData(row,7);
	FicheActionPage.RechFiltreId.sendKeys(NumAction);
	//FicheActionPage.BtnRechFiltId.click();
	JavascriptExecutor executor =(JavascriptExecutor)driver;
	executor.executeScript("arguments[0].click()", FicheActionPage.BtnRechFiltId);
	Thread.sleep(1000L);
	
	//No,NON
	assertTrue("No".equals(FicheActionPage.wstatutClot.getText())||"NON".equals(FicheActionPage.wstatutClot.getText()));
}

@Then("^v??rfier etat   action  agenda$")
public void v??rfier_etat_action_agenda() throws Throwable {
	Thread.sleep(1000);
	FicheActionModele.cliqueAgenda(driver);
	Thread.sleep(1000L);
	
	JavascriptExecutor executor =(JavascriptExecutor)driver;
	executor.executeScript("arguments[0].click()", PageSommerAgenda.wcloture);
	
	Thread.sleep(1000L);
	ExcelUtils.setExcelFile(Path, "Action");
	String NumAction=ExcelUtils.getCellData(row,7);
	System.out.println("Action"+NumAction);
	FicheActionPage.rechercherActionCloturerXpath.findElement(By.tagName("input")).sendKeys(NumAction);
	assertTrue(FicheActionPage.choixActionCloturer.findElement(By.tagName("a")).getText().contains(NumAction));


}
	
	@And("^Consulter Action$")
	public void consulter_Action() throws Throwable {
		Thread.sleep(2000L);
		FicheActionModele.consulter_Action(driver);		
		Thread.sleep(2000L);
	}
	@When("^saisir (\\d+) action$")
	public void saisir_action(int arg1) throws Throwable {
		row=arg1;
	}
	@When("^cliquer sur ajouter Action d??taill??e$")
	public void cliquer_sur_ajouter_Action_d??taill??e() throws InterruptedException  {
		FicheActionModele.ajouter_action_d??taill??e(driver);
		Thread.sleep(2000L);	
	}
	


	@When("^Ajouter Source$")
	public void ajouter_Source() throws Throwable {
		FicheActionModele.selectionnerSourceModeleAction(row);
	}

	@When("^Saisir Date Cr??ation$")
	public void saisir_Date_Cr??ation() throws Throwable {
		FicheActionModele.choixDate(driver,row);
	}

	
	@When("^choisir Type Action$")
	public void choisir_Type_Action() throws Throwable {
		FicheActionModele.selectionnerTypeModeleAction(row);
	}
	
	@When("^Saisir D??signation$")
	public void saisir_D??signation() throws Throwable {
		FicheActionModele.designationModeleAction(row);
	}

	@When("^Saisir Description probl??me/objet$")
	public void saisir_Description_probl??me_objet() throws Throwable {
		FicheActionModele.saisirDescription(row);
	}
	
	@When("^Saisir A l origine de l action$")
	public void Saisir_A_l_origine_de_l_action() throws Throwable {
		FicheActionModele.origine_action();
	}
	
	@When("^choisir Produit$")
	public void choisir_Produit() throws Throwable {
		FicheActionModele.rattacher_produit(driver);
	}
	
	@When("^saisir Objectif$")
	public void saisir_Objectif() throws Throwable {
		FicheActionModele.objectif();
	}
	
	@When("^saisir r??f??rence Audit$")
	public void saisir_r??f??rence_Audit() throws Throwable {
		FicheActionModele.Ref_Audit(row);
	}

	@When("^choisir Types de causes$")
	public void choisir_Types_de_causes() throws Throwable {
		FicheActionModele.rattacher_Type_cause(driver,row);
	}

	@When("^Saisir Causes possibles$")
	public void saisir_Causes_possibles() throws Throwable {
		FicheActionModele.saisirCausesPossibles();
	}
	
	@When("^choisir Site$")
	public void choisir_Site() throws Throwable {
		FicheActionModele.selectionnerSiteModeleAction(driver,row);
	}

	@When("^Choisir Processus$")
	public void choisir_Processus() throws Throwable {
		FicheActionModele.selectionnerProcessus(driver,row);
	}

	@When("^choisir Activit??$")
	public void choisir_Activit??() throws Throwable {
		FicheActionModele.selectionnerActivite(driver,row);
	}

	@When("^choisir Direction$")
	public void choisir_Direction() throws Throwable {
		FicheActionModele.selectionnerDirection(driver,row);
	}
	
	@When("^choisir service$")
	public void choisir_service() throws Throwable {
		FicheActionModele.service(driver,row);
	}

	@When("^choisir un responsable de cl??ture$")
	public void choisir_un_responsable_de_cl??ture() throws Throwable {
		FicheActionModele.resp_cloture(row);
	}

	@When("^cliquer sur valider Action$")
	public void cliquer_sur_valider_Action() throws Throwable {
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_LinkButton17_Valider"));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click()", element);
		/*Actions action = new Actions(driver);
		action.moveToElement(FicheActionPage.btnValiderActionId).perform();
		Thread.sleep(500L);
		FicheActionModele.validerAjout();*/
		 Thread.sleep(500L);
	}

	@Then("^Fiche Action ajout??$")
	public void fiche_Action_ajout??() throws Throwable {
		
		Thread.sleep(1000L);
		
		WebElement num =driver.findElement(By.id("ctl00_ContentPlaceHolder1_nact"));
		//ctl00_ContentPlaceHolder1_nact
		String Num=num.getText();
		System.out.println("action numero: "+Num);
		Common.Exporter_visibilit??("Fiche Action:"+Num);
		Common.Exporter_champ_A_masquer("Fiche Action: "+Num);
		Boolean vide;
		if(Num.contentEquals(""))
		{
			 vide=false;
		} 
		else
		{
			 vide=true;
		}
		assertTrue(vide);
		NumAction=Num;
		ExcelUtils.setExcelFile(Path, "Action");
		ExcelUtils.setCellData1(Num, row,7, Path,"Action") ;
		Common.Exporter_numFiche(" num Action   "+Num);

	}
	@When("^choisir plusieurs responsables de suivi$")
	public void choisir_plusieurs_responsables_de_suivi() throws Throwable {
		
	  WebElement element = driver.findElement(By.id("spandetail"));
	    JavascriptExecutor executor = (JavascriptExecutor)driver;
	    executor.executeScript("arguments[0].click()", element);
	    Thread.sleep(500L);
		/*element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_Span1"));
		Actions action = new Actions(driver);
		action.moveToElement(element).perform();
		executor = (JavascriptExecutor)driver;
	    executor.executeScript("arguments[0].click()", element);
	    //FicheActionPage.palnActionXpath.click();*/
	    Thread.sleep(500L);
	    driver.findElement(By.id("ctl00_ContentPlaceHolder1_RadioButtonList3_1")).click();
	}
	
	@Then("^cliquer sur ajouter sous action$")
	public void cliquer_sur_ajouter_sous_action() throws Throwable {
		FicheActionModele.clickAjouterSousActionModeleAction(driver);
		Thread.sleep(1000L);
	}

	@When("^saisir d??signation sous action$")
	public void saisir_d??signation_sous_action() throws Throwable {
		
		FicheActionModele.saisirDesignationSousAct(row);
		
	}
	@When("^saisir responsable de r??alisation$")
	public void saisir_responsable_de_r??alisation() throws Throwable {
		
		FicheActionModele.selectionnerResponsableRealisation(row);
		Thread.sleep(1000L);
	}
	@When("^saisir d??lais de r??alisation$")
	public void saisir_d??lais_de_r??alisation() throws Throwable {

		FicheActionModele.choixDateSousActionModeleAction(driver);
		Thread.sleep(1000L);
	  
	}
	
	@When("^choisir un responsable de suivi$")
	public void choisir_un_responsable_de_suivi() throws Throwable {

		FicheActionModele.selectionnerResponsableSuivi(row);
		Thread.sleep(3000L);
	  
	}
	@When("^choisir d??lais de suivi$")
	public void choisir_d??lais_de_suivi() throws Throwable {

		//Thread.sleep(1000L);
		//FicheActionPage.d??lais_suivi.click();
		Thread.sleep(1000L);
		//FicheActionPage.choix_d??lais_suivi.click();

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
		Thread.sleep(1000);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[1].value = arguments[0];",Sdate, FicheActionPage.wdateSuiv);


		Thread.sleep(1000L);
	}
	
	@When("^choisir gravit?? action$")
	public void choisir_gravit??_action() throws Throwable {

		FicheActionModele.Gravite(row);
	}
	@When("^choisir Priorit?? SA$")
	public void choisir_Priorit??_SA() throws Throwable {

		FicheActionModele.Priorite(row);
	}
	@When("^saisir cout previ SA$")
	public void saisir_cout_previ_SA() throws Throwable {

		FicheActionModele.Cout_Prev();
	}
	@When("^saisir Risque SA$")
	public void saisir_Risque_SA() throws Throwable {

		FicheActionModele.Risque();
	}

	@When("^cliquer sur valider sous action$")
	public void cliquer_sur_valider_sous_action() throws Throwable {
		
		FicheActionModele.validerSousAction(driver);
		//Thread.sleep(4000L);
	    
	}

	@Then("^sous action ajout?? a la liste des sous actions$")
	public void sous_action_ajout??_a_la_liste_des_sous_actions() throws Throwable {
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.id("spandetail"))).perform();
		driver.findElement(By.id("spandetail")).click();
		Thread.sleep(200L);
		 //action = new Actions(driver);
		//action.moveToElement(FicheActionPage.desgSousActionModeleAction).perform();
		String verifDesignation = FicheActionPage.desgSousActionModeleAction.findElement(By.tagName("span")).getText();
		if(verifDesignation.contains("Designation Test Sous Action"))
		{
			System.out.println("sous action ajoute");
		}
	}
	
	
	@When("^Consulter agenda Action$")
	public void consulter_agenda_Action() throws Throwable {
		Thread.sleep(100L);
		Actions action = new Actions(driver);
		action.moveToElement(FicheActionPage.HomeID).perform();
		FicheActionPage.HomeID.click();
		Thread.sleep(1000L);
		FicheActionModele.cliqueAgenda(driver);
		Thread.sleep(1000L);
	}

	@And("^R??aliser Action$")
	public void R??aliser_Action() throws Throwable {
		FicheActionPage.ActionRealisationXpath.click();
		Thread.sleep(100L);
		ExcelUtils.setExcelFile(Path, "Action");
		String NumAction=ExcelUtils.getCellData(row,7);
		FicheActionModele.saisirNumActionRealisation(NumAction,driver);
		FicheActionModele.rechercherNumActionRealisation(driver);
		Thread.sleep(1000L);
		FicheActionModele.choixNumActionRealisation();
		Thread.sleep(1000L);
		FicheActionModele.saisirTauxRealisation();
		FicheActionModele.saisirDepenses();
		FicheActionModele.saisirCommentaire();
		FicheActionPage.dateRealisation.click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
		FicheActionPage.choixDateRealisation.click();
		FicheActionModele.validerRealisationAction(driver);
		Thread.sleep(1000L);
	}
	
	@And("^Suivi Action$")
	public void Suivi_Action() throws Throwable {
		FicheActionPage.ActionSuivreXpath.click();
		Thread.sleep(1000L);
		ExcelUtils.setExcelFile(Path, "Action");
		String NumAction=ExcelUtils.getCellData(row,7);
		FicheActionModele.saisirNumActionSuivre(NumAction);
		FicheActionModele.rechercherNumActionSuivre(driver);
		FicheActionModele.choixNumActionSuivren();
		FicheActionModele.saisirTauxEffi();
		FicheActionModele.saisirRapportEffi();
		Thread.sleep(1000L);
		FicheActionModele.validerSuivi(driver);
		Thread.sleep(3000L);
		FicheActionModele.cliqueAgenda(driver);
		Thread.sleep(3000L);
	}

	protected static final Logger logger = LoggerFactory.getLogger(AbstractPage.class);
	@And("^Cl??tur??e Action$")
	public void Cl??tur??e_Action() throws Throwable {
		FicheActionModele.cliqueAgenda(driver);

		if(Etatcloture)
		{
		
		FicheActionModele.choixNumActionCloturee(driver);
		Thread.sleep(1000L);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
		FicheActionModele.choixCloturee(driver);
		Thread.sleep(1000);
	
	
		 JavascriptExecutor executor = (JavascriptExecutor)driver;
	  // executor.executeScript("arguments[0].click()",FicheActionPage.dateCloture);
		 FicheActionPage.dateCloture.click();
		Thread.sleep(1000);

		logger.info("date  1");
		JavascriptExecutor executor2 = (JavascriptExecutor)driver;
	    executor2.executeScript("arguments[0].click()",FicheActionPage.choixDateCloture);
	    
		FicheActionPage.rapportClotureID.sendKeys("Test Auto");
		FicheActionModele.validerCloturee();
		Thread.sleep(1000L);
		//add click by rahma
		driver.findElement(By.id("spandetail")).click();;
		
		Actions action = new Actions(driver);
	
		WebElement element;
		try {
			element=driver.findElement(By.id("ctl00_ContentPlaceHolder1_coutpre"));
			element.isDisplayed();
			action.moveToElement(element).perform();
			WebElement element1=driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_GridView1\"]/tbody/tr/td[16]")).findElement(By.tagName("span"));
			assertTrue(element.getAttribute("value").contains(element1.getText()));
			Common.Exporter_champ_A_masquer("le champ cout prev total est visible");
			}
			catch (NoSuchElementException e) {
				Common.Exporter_champ_A_masquer("le champ cout prev total est invisible");
			}
		try {
		element=driver.findElement(By.id("ctl00_ContentPlaceHolder1_deptot"));
		element.isDisplayed();
		WebElement element1=driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_GridView1\"]/tbody/tr/td[17]")).findElement(By.tagName("input"));
		assertTrue(element.getAttribute("value").contains(element1.getAttribute("value")));
		}
		catch (NoSuchElementException e) {
			Common.Exporter_champ_A_masquer("le champ cout prev total est invisible");
		}
		}else {
			FicheActionPage.HomeID.click();
		}
	}

	@When("^Consulter action a traiter$")
	public void consulter_action_a_traiter() throws Throwable {
		Thread.sleep(1000);
		FicheActionModele.cliqueAgenda(driver);
		Thread.sleep(1000L);
		FicheActionPage.ActionRealisationXpath.click();
		
		Thread.sleep(1000L);
		ExcelUtils.setExcelFile(Path, "Action");
		String NumAction=ExcelUtils.getCellData(row,7);
		System.out.println("Action"+NumAction);
		Thread.sleep(1000);
		FicheActionModele.saisirNumActionRealisation(NumAction,driver);
		FicheActionModele.rechercherNumActionRealisation(driver);
		Thread.sleep(1000);
		//FicheActionPage.wbtnClosAct.findElement(By.tagName("a")).click();
		FicheActionModele.choixNumActionRealisation();
		
		Thread.sleep(1000L);
	}

	@When("^R??aliser action avec (\\d+)$")
	public void r??aliser_action_avec(int arg1) throws Throwable {
		ExcelUtils.setExcelFile(Path, "Action");
		taux=Integer.toString(arg1);
		  final DateFormat dateFormat;
			Cookie cookie1 = driver.manage().getCookieNamed("lan");
			if(cookie1.getValue().equals("en-US")) {
				dateFormat = new SimpleDateFormat("MM/dd/yyyy");
			}else {
				dateFormat = new SimpleDateFormat("dd/MM/yyyy");
			}
		FicheActionPage.tauxRealisation.clear();
		FicheActionPage.tauxRealisation.sendKeys("85");
		ExcelUtils.setCellData1(taux, row,20,Path,"Action");
		FicheActionModele.saisirDepenses();
		FicheActionModele.saisirCommentaire();
		//FicheActionModele.rattacher_intervenant(driver);
		Date dt = new Date();
		Calendar c = Calendar.getInstance(); 
		c.setTime(dt); 
		c.add(Calendar.DATE,0);
		dt = c.getTime();
		String Sdate = dateFormat.format(dt);
		ExcelUtils.setExcelFile(Path, "Action");
		ExcelUtils.setCellData1(Sdate, row ,19,Path,"Action");
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[1].value = arguments[0];",Sdate, FicheActionPage.SaisieDRealisation);
		
		Thread.sleep(500);
		String datesaisie=driver.findElement(By.id("ctl00_ContentPlaceHolder1_TextBox9")).getAttribute("value");
		ExcelUtils.setExcelFile(Path, "Action");
		ExcelUtils.setCellData1(datesaisie, row ,23,Path,"Action");
		Thread.sleep(500L);
		
		FicheActionModele.validerRealisationAction(driver);
		Thread.sleep(500);
		FicheActionModele.EnrTauxReal(driver, taux);
	
	}
	

	
	@When("^Consulter action a suivre$")
	public void consulter_action_a_suivre() throws Throwable {
		Thread.sleep(1000L);
		FicheActionPage.ActionSuivreXpath.click();
		Thread.sleep(1000L);
		ExcelUtils.setExcelFile(Path, "Action");
		String NumAction=ExcelUtils.getCellData(row,7);
		Thread.sleep(2000);
		FicheActionModele.saisirNumActionSuivre(NumAction);
		
		FicheActionModele.rechercherNumActionSuivre(driver);
		Thread.sleep(1000L);
		FicheActionModele.choixNumActionSuivren();
		Thread.sleep(1000L);
	
	}

	@Then("^v??rifier taux r??alisation$")
	public void v??rifier_taux_r??alisation() throws Throwable {
		System.out.println(taux);
		Thread.sleep(1000);
		System.out.println(FicheActionPage.AffTxReaId.getAttribute("value"));
		assertTrue(FicheActionPage.AffTxReaId.getAttribute("value").contains(taux));
	}
	
	@When("^suivre action avec (\\d+) et (\\d+)$")
	public void suivre_action_avec_et(int arg1, int arg2) throws Throwable {
		taux=Integer.toString(arg1);
		Thread.sleep(500);
		  JavascriptExecutor executor = (JavascriptExecutor)driver;
		    executor.executeScript("arguments[0].click()", FicheActionPage.EditTxReaId);
		
		Thread.sleep(1000L);
		FicheActionPage.NouvTxReaId.clear();
		Thread.sleep(1000L);
		FicheActionPage.NouvTxReaId.sendKeys(taux);
		ExcelUtils.setCellData1(taux, row ,20,Path,"Action");
		FicheActionPage.CommNouvTxReaId.sendKeys("n??cessite verification");
		Thread.sleep(500L);
		FicheActionPage.VldNvTxReaId.click();
		Thread.sleep(500L);
		taux=Integer.toString(arg2);
		Thread.sleep(500L);
		FicheActionPage.TauxEffiID.clear();
		Thread.sleep(500L);
		FicheActionPage.TauxEffiID.sendKeys(taux);
		Thread.sleep(500L);

		ExcelUtils.setCellData1(taux, row ,22,Path,"Action");
		Thread.sleep(500L);

		FicheActionPage.rapportEffiID.clear();
		Thread.sleep(500L);

		FicheActionPage.rapportEffiID.sendKeys("rapport efficacit??");
		Thread.sleep(500L);

		String Sdate=driver.findElement(By.id("ctl00_ContentPlaceHolder1_TextBox10")).getAttribute("value");
		Thread.sleep(500L);
		ExcelUtils.setExcelFile(Path, "Action");
		ExcelUtils.setCellData1(Sdate, row ,21,Path,"Action");
		ExcelUtils.setExcelFile(Path, "Action");
		ExcelUtils.setCellData1(Sdate, row ,19,Path,"Action");
		Thread.sleep(1000L);
		FicheActionModele.validerSuivi(driver);

	}
	
	@Then("^v??rifier taux r??alisation responsable traitement$")
	public void v??rifier_taux_r??alisation_responsable_traitement() throws Throwable {
		
		assertTrue(FicheActionPage.tauxRealisation.getAttribute("value").contains(taux));
		FicheActionPage.QttRetour1Id.click();
		Thread.sleep(1000L);
		
	}
	
	@When("^Consulter \"([^\"]*)\" a realiser$")
	public void consulter_a_realiser(String arg1) throws Throwable {
		NumAction=arg1;
		Thread.sleep(1000);
		FicheActionModele.cliqueAgenda(driver);
		Thread.sleep(1000L);
		FicheActionPage.ActionRealisationXpath.click();
		Thread.sleep(100L);
		FicheActionModele.saisirNumActionRealisation(arg1,driver);
		FicheActionModele.rechercherNumActionRealisation(driver);
		Thread.sleep(100L);
		FicheActionModele.choixNumActionRealisation();
		Thread.sleep(1000L);
		}
	@When("^Consulter \"([^\"]*)\" a suivre$")
	public void consulter_a_suivre(String arg1) throws Throwable {
		FicheActionPage.HomeID.click();
		Thread.sleep(1000L);
		FicheActionModele.cliqueAgenda(driver);
		Thread.sleep(1000L);
		FicheActionPage.ActionSuivreXpath.click();
		Thread.sleep(1000L);
		FicheActionModele.saisirNumActionSuivre(arg1);
		FicheActionModele.rechercherNumActionSuivre(driver);
		Thread.sleep(1000L);
		FicheActionModele.choixNumActionSuivren();
		Thread.sleep(1000L);
	
	}
	
	@Then("^delete file$")
	public void  delete_file() throws InterruptedException {
		System.out.println("delete file   RTF");
		  FileOutputStream fos = null;
	      
		  
	         // create new file output stream
	        
		java.nio.file.Path path2 = FileSystems.getDefault().getPath("E:\\qualipro\\trunk\\AutomatisationTQualiPro_prod231\\resources\\Telechargement\\CrystalReportViewer1.rtf");
	    System.err.println("files is  "+Files.exists(path2));

		try {
    System.err.println("files is  "+Files.exists(path2));
    fos = new FileOutputStream("E:\\qualipro\\trunk\\AutomatisationTQualiPro_prod231\\resources\\Telechargement\\CrystalReportViewer1.rtf");
    fos.close();
    Thread.sleep(1000);
    Files.delete(path2);
     } catch (NoSuchFileException x) {
         System.err.format("%s: no such" + " file or directory%n", path2);
     } catch (IOException x) {
         System.err.println(x);
     }
	}
	
	@When("^Consulter fiche action$")
	public void consulter_fiche_action() throws Throwable {
		ExcelUtils.setExcelFile(Path, "Action");
		String NumAction=ExcelUtils.getCellData(row,7);
		
		FicheActionModele.consulter_fiche(NumAction,driver);
	}

	@Then("^Exporter tracabilite$")
	public void exporter_tracabilite() throws Throwable {
		Thread.sleep(3000);
try {
		FicheActionPage.ExporterId.click();}
catch(NoSuchElementException exp) {
	System.err.println("element   not  found ");
}

try {
	JavascriptExecutor js = (JavascriptExecutor) driver;
		
    js.executeScript("arguments[0].scrollIntoView();", FicheActionPage.VldIntervId);
    JavascriptExecutor js2 = (JavascriptExecutor) driver;
	
    js2.executeScript("arguments[0].click();", FicheActionPage.VldIntervId);

   // executor.executeScript("arguments[0].click();",FicheActionPage.wchoixrept );


	}
catch(NoSuchElementException exp) {
System.err.println("element   not  found ");
}


		Thread.sleep(2000);

	//FicheActionPage.wchoixrept.click();
	
	//.click();
	
	//FicheActionPage.wexp.click();
	 JavascriptExecutor executor = (JavascriptExecutor)driver;
     executor.executeScript("arguments[0].click();",FicheActionPage.wchoixrept );
     Thread.sleep(1000);
     JavascriptExecutor executor2 = (JavascriptExecutor)driver;
     executor2.executeScript("arguments[0].click();",FicheActionPage.wselctRepo );
     Thread.sleep(1000);
     JavascriptExecutor executor1 = (JavascriptExecutor)driver;
     executor1.executeScript("arguments[0].click();",FicheActionPage.wexp );
	
	//driver.findElement(By.tagName("table")).findElement(By.tagName("tbody")).findElement(By.tagName("tr")).findElement(By.tagName("td")).findElement(By.tagName("nobr")).findElement(By.tagName("a")).click();
	/*	Screen s = new Screen();
		Screen s1 = new Screen();
		Screen s2 = new Screen();
		Screen s3 = new Screen();
		Thread.sleep(1000);
	

		try {
			Pattern pattern = new Pattern("E:\\qualipro\\trunk\\AutomatisationTQualiPro_prod231\\resources\\imgs\\Exporter_PV_reunion.PNG");
			Pattern pattern1 = new Pattern("E:\\qualipro\\trunk\\AutomatisationTQualiPro_prod231\\resources\\imgs\\combo_exporter_pv_reunion.PNG");
			Pattern pattern2 = new Pattern("resources/imgs/Choix_combo_PV_reunion.PNG");
			Pattern pattern3 = new Pattern("resources/imgs/Btn_exporter_PV_reunion.PNG");
			s1.click(pattern1);
			s2.click(pattern2);
			s3.click(pattern3);
			Thread.sleep(4000);
			
		} catch (FindFailed e) {
			e.printStackTrace();
		}*/
		Runtime.getRuntime().exec("E:\\qualipro\\trunk\\AutomatisationTQualiPro_prod231\\resources\\Scripts\\EnregistrerFichier.exe");
		Thread.sleep(3000);
	}

	@Then("^V??rifier (\\d+) et (\\d+)$")
	public void v??rifier_et(int arg1, int arg2) throws Throwable {
		List<String> informations = new ArrayList<String>();
		taux=Integer.toString(arg1);
		informations.add(taux);
		taux=Integer.toString(arg2);
		informations.add(taux);
		
		String path = "E:\\qualipro\\trunk\\AutomatisationTQualiPro_prod231\\resources\\Telechargement\\CrystalReportViewer1.rtf";
		String fileData = null;
		Thread.sleep(5000);
		fileData = RTFUtil.ReadRTFFile(path);
		System.out.println("********************************TRACABILITE**************************************" + fileData);

		for (int i = 0; i < informations.size(); i++) {
			int j = i + 1;
			System.out.println("l'information " + j + ":" + informations.get(i));
			System.out.println("Existe: " + common.ExisteWord(path, informations.get(i)));
			assertTrue(common.ExisteWord(path, informations.get(i)));
		}
		driver.navigate().back();
		
	}
	

	@Then("^V??rifier etat action realis??$")
	public void v??rifier_etat_action_realis??() throws Throwable {
		JavascriptExecutor  executor = (JavascriptExecutor)driver;
	    executor.executeScript("arguments[0].click()", FicheActionPage.HomeID);
	
			Thread.sleep(1000L);
			FicheActionModele.cliqueAgenda(driver);
			Thread.sleep(1000L);
			JavascriptExecutor  executor2 = (JavascriptExecutor)driver;
		    executor2.executeScript("arguments[0].click()", PageSommerAgenda.wrealise);
			
			///FicheActionPage.ActionRealisationXpath.click();
			Thread.sleep(1000L);
			
			ExcelUtils.setExcelFile(Path, "Action");
			String NumAction=ExcelUtils.getCellData(row,7);
			
			if(Integer.parseInt(taux)<100)
			{
				FicheActionModele.saisirNumActionRealisation(NumAction,driver);
				Thread.sleep(1000L);
				FicheActionModele.rechercherNumActionRealisation(driver);
				Thread.sleep(2000L);
			assertTrue(FicheActionPage.ActionRealiserId.findElement(By.tagName("a")).getText().contains(NumAction));
			}else
			{
				try {
					FicheActionPage.FiltreRealiseId.isDisplayed();
				FicheActionPage.FiltreRealiseId.sendKeys(NumAction);
				Thread.sleep(1000L);
				
				assertTrue(driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_GridView1\"]/tbody/tr/td")).getText().contains("Aucun ??l??ment ?? afficher")||driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_GridView1\"]/tbody/tr/td")).getText().contains("No matching records found"));
				}
				catch (NoSuchElementException e) {
					System.out.println("aucun element n'est afficher");
				}
				}
	    
	}

	@When("^suivre action avec (\\d+)$")
	public void suivre_action_avec(int arg1) throws Throwable {
		FicheActionPage.ActionSuivreXpath.click();
		Thread.sleep(1000L);
		taux=Integer.toString(arg1);
		FicheActionPage.TauxEffiID.clear();
		FicheActionPage.TauxEffiID.sendKeys(taux);
		FicheActionModele.saisirRapportEffi();
		Thread.sleep(1000L);
		FicheActionModele.validerSuivi(driver);

	}

	@Then("^V??rifier etat action suivi$")
	public void v??rifier_etat_action_suivi() throws Throwable {
		Etatcloture=false;
		Thread.sleep(1000L);
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", FicheActionPage.HomeID);
	//	FicheActionPage.HomeID.click();
		Thread.sleep(1000L);
		FicheActionModele.cliqueAgenda(driver);
		Thread.sleep(1000L);
		JavascriptExecutor executor2 = (JavascriptExecutor)driver;
		executor2.executeScript("arguments[0].click();", FicheActionPage.ActionSuivreXpath);
		//FicheActionPage.ActionSuivreXpath.click();
		Thread.sleep(1000L);
		ExcelUtils.setExcelFile(Path, "Action");
		String NumAction=ExcelUtils.getCellData(row,7);
		if(Integer.parseInt(taux)<100)
		{
			
			FicheActionModele.saisirNumActionSuivre(NumAction);
			FicheActionModele.rechercherNumActionSuivre(driver);
			Thread.sleep(1000L);
			
			assertTrue(FicheActionPage.choixNumActionSuivre.getText().contains(NumAction));
		}else {
			Thread.sleep(2000);
		
			  JavascriptExecutor executor23 = (JavascriptExecutor)driver;
	        executor23.executeScript("arguments[0].click();", FicheActionPage.ActionCloturerXpath);
			
			Thread.sleep(1000);

			FicheActionPage.rechercherActionCloturerXpath.findElement(By.tagName("input")).sendKeys(NumAction);
	
		
			//FicheActionModele.choixNumActionCloturee();	
			Thread.sleep(1000);
			Etatcloture=true;
			Thread.sleep(1000);
		assertTrue(FicheActionPage.choixActionCloturer.findElement(By.tagName("a")).getText().contains(NumAction));
			
		}
	}
	
	@When("^cliquer sur bilan des actions$")
	public void cliquer_sur_bilan_des_actions() throws Throwable {

		  JavascriptExecutor executor = (JavascriptExecutor)driver;
	      executor.executeScript("arguments[0].click();",FicheActionPage.wreporting.findElement(By.cssSelector("#menu_rep > div > div > ul > li > a > img")) );
	      JavascriptExecutor executor1 = (JavascriptExecutor)driver;
	      executor1.executeScript("arguments[0].click();",FicheActionPage.wreporting.findElement(By.cssSelector("#menu_rep > div > div > ul > li > ul > li:nth-child(21) > a")) );
		 JavascriptExecutor executor2 = (JavascriptExecutor)driver;
	       executor2.executeScript("arguments[0].click();",FicheActionPage.wreporting.findElement(By.cssSelector("#menu_rep > div > div > ul > li > ul > li:nth-child(2) > ul > li:nth-child(1) > a")) );
		
		

		Thread.sleep(1000L);
		
	}
	
	@When("^r??cup??rer filtre reporting$")
	public void r??cup??rer_filtre_reporting() throws Throwable {
		FicheActionModele.initializer_filtre_Bilan_action(row);
	}
	
	
	@When("^saisir filtre reporting$")
	public void saisir_filtre_reporting() throws Throwable 
	{
		//Object obj=FicheActionPage.class.newInstance();
		/*FicheActionPage pageclass = FicheActionPage.class.newInstance();
		for (Field field : FicheActionPage.class.getDeclaredFields())
		{
			System.out.println(field.getName());
			System.out.println(field.get(pageclass));
		}*/
		FicheActionModele.initializer_filtre_Bilan_action(1);
		
		Iterator <Map.Entry<String, String>>iterator = FicheActionModele.filtre_repor.entrySet().iterator();
        while (iterator.hasNext()) {
        	Map.Entry mapentry = (Map.Entry) iterator.next();
        	System.out.print("element  :  "+ mapentry.getKey().toString());
        	System.out.println("contune  :  "+ mapentry.getValue().toString());
			Common.remplir_filtre_by_id(driver, mapentry.getKey().toString(), mapentry.getValue().toString());
		}
        WebElement element=driver.findElement(By.id("ctl00_ContentPlaceHolder1_LinkButton11"));
       
    	//This will scroll the page till the element is found	
    	 JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", element);
        js.executeScript("arguments[0].click()", element);
    	
        Thread.sleep(500);
       
	}
	
	@When("^choisir \"([^\"]*)\" de r??alisation des actions$")
	public void choisir_de_r??alisation_des_actions(String arg1) throws Throwable 
	{
		if(arg1.equals("NON REALISEE"))
		{
			driver.findElement(By.id("ctl00_ContentPlaceHolder1_RadioButtonList_Real_0")).click();
		}else if(arg1.equals("REALISEE"))
		{
			driver.findElement(By.id("ctl00_ContentPlaceHolder1_RadioButtonList_Real_1")).click();
		}
		else {
			System.out.println("type r??alisation incorrecte");
		}
	}
	@When("^choisir \"([^\"]*)\" de cloture des actions$")
	public void choisir_de_cloture_des_actions(String arg1) throws Throwable 
	{
		if(arg1.equals("NON CLOTUREE"))
		{
			driver.findElement(By.id("ctl00_ContentPlaceHolder1_RadioButtonList_Clot_0")).click();
		}else if(arg1.equals("CLOTUREE"))
		{
			driver.findElement(By.id("ctl00_ContentPlaceHolder1_RadioButtonList_Clot_1")).click();
		}
		else {
			System.out.println("type cloture incorrecte");
		}
	}
	@When("^choisir \"([^\"]*)\" bilan des actions$")
	public void choisir_bilan_des_actions(String arg1) throws Throwable 
	{
		if(arg1.equals("MODELE 1"))
		{
			driver.findElement(By.id("ctl00_ContentPlaceHolder1_RadioButtonList_Modele_0")).click();
		}else if (arg1.equals("MODELE 2"))
		{
			driver.findElement(By.id("ctl00_ContentPlaceHolder1_RadioButtonList_Modele_1")).click();
		}else if(arg1.equals("MODELE 3"))
		{
			driver.findElement(By.id("ctl00_ContentPlaceHolder1_RadioButtonList_Modele_2")).click();
		}
		else {
			System.out.println("modele incorrecte");
		}
	}
	@When("^choisir \"([^\"]*)\" de regroupement des actions$")
	public void choisir_de_regroupement_des_actions(String arg1) throws Throwable 
	{
		if(arg1.equals("SOURCE"))
		{
			driver.findElement(By.id("ctl00_ContentPlaceHolder1_R_groupe_0")).click();
		}else if (arg1.equals("DECLENCHEUR"))
		{
			driver.findElement(By.id("ctl00_ContentPlaceHolder1_R_groupe_1")).click();
		}else if(arg1.equals("TYPE"))
		{
			driver.findElement(By.id("ctl00_ContentPlaceHolder1_R_groupe_2")).click();
		}else if(arg1.equals("PRODUIT"))
		{
			driver.findElement(By.id("ctl00_ContentPlaceHolder1_R_groupe_3")).click();
		}else if (arg1.equals("SITE"))
		{
			driver.findElement(By.id("ctl00_ContentPlaceHolder1_R_groupe_4")).click();
		}else if(arg1.equals("RESP.REAL"))
		{
			driver.findElement(By.id("ctl00_ContentPlaceHolder1_R_groupe_5")).click();
		}else {
			System.out.println("type regroupement incorrecte");
		}
	}

	@Then("^Exporter les donn??es$")
	public void exporter_les_donn??es() throws Throwable {
	
		/*JavascriptExecutor jsExecutor = (JavascriptExecutor)driver;
		String currentFrame = (String) jsExecutor.executeScript("return self.name");
		System.out.println(currentFrame);
		 List<WebElement> elements =driver.findElements(By.tagName("table"));
		 System.out.println(elements.size());
		 int i=0;
		 while(i<elements.size())
		 {
			 String id = elements.get(i).getAttribute("id");
			 System.out.println(id);
			 if(id.contains("bobjid_1560876287447_dialog")) 
			 {
				 System.out.println("yes");
				 WebElement td=elements.get(i).findElement(By.id("td_dialog_bobjid_1560874207391_dialog"));
				 System.out.println(td.getAttribute("id"));
			 }
			 i++;
		 }*/
		 //WebElement table= driver.findElement(By.id("bobjid_1560874207391_dialog"));
		 //WebElement td=table.findElement(By.id("td_dialog_bobjid_1560874207391_dialog"));
		 //System.out.println(td.getAttribute("id"));
		
	/*	 Screen s = new Screen();
			Screen s1 = new Screen();
			Screen s2 = new Screen();
			Screen s3 = new Screen();
			try {
				Pattern pattern  = new Pattern("resources/imgs/Exporter_PV_reunion.PNG");
				Pattern pattern1 = new Pattern("resources/imgs/combo_exporter_pv_reunion.PNG");
				Pattern pattern2 = new Pattern("resources/imgs/Choix_combo_PV_reunion.PNG");
				Pattern pattern3 = new Pattern("resources/imgs/Btn_exporter_PV_reunion.PNG");
				s.click(pattern);
				s1.click(pattern1);
				s2.click(pattern2);
				s3.click(pattern3);
			} catch (FindFailed e) {
				e.printStackTrace();
			}*/
		//  JavascriptExecutor executor = (JavascriptExecutor)driver;
	     // executor.executeScript("arguments[0].click();",FicheActionPage.wexport );
		//  driver.findElement(By.linkText("Exporter")).click();
		
	    //*[@id="iconMenu_icon_bobjid_1604052822944_dialog_combo"]/tbody/tr/td[2]
	}

	@Then("^v??rifier les donn??es rapport$")
	public void v??rifier_les_donn??es_rapport() throws Throwable {
	String name1 = "bilan_action";
	ExcelUtils.setExcelFile(Path, "Action");
	String num_action=ExcelUtils.getCellData(1,7);
	Common.V??rifier_donn??es(name1,num_action);
	}
	
	@When("^Consulter reporting Etat des actions par responsable$")
	public void consulter_reporting_Etat_des_actions_par_responsable() throws Throwable {
		//driver.get("http://10.66.245.30/w23/action/rapport/FiltreEtatResp.aspx");
		
		Thread.sleep(1000L); 
		PageFactory.initElements(driver, FicheActionPage.class);
		  JavascriptExecutor executor = (JavascriptExecutor)driver;
	      executor.executeScript("arguments[0].click();",FicheActionPage.wreporting.findElement(By.cssSelector("#menu_rep > div > div > ul > li > a > img")) );
	      JavascriptExecutor executor1 = (JavascriptExecutor)driver;
	      executor1.executeScript("arguments[0].click();",FicheActionPage.wreporting.findElement(By.cssSelector("#menu_rep > div > div > ul > li > ul > li:nth-child(2) > a")) );
	      JavascriptExecutor executor2 = (JavascriptExecutor)driver;
	      executor2.executeScript("arguments[0].click();",FicheActionPage.wreporting.findElement(By.cssSelector("#menu_rep > div > div > ul > li > ul > li:nth-child(2) > ul > li:nth-child(6) > a")) );

	}

	@When("^r??cup??rer filtre reporting Etat action$")
	public void r??cup??rer_filtre_reporting_Etat_action() throws Throwable {
		FicheActionModele.initializer_filtre_Etat_action(Path);
		
	}

	@Then("^v??rifier les donn??es rapport Etat action$")
	public void v??rifier_les_donn??es_rapport_Etat_action() throws Throwable {
		String name1 = "Etat_action";
		ExcelUtils.setExcelFile(Path, "Action");
		String num_action=ExcelUtils.getCellData(row,7);
		Common.V??rifier_donn??es(name1,num_action);
	}
//Amira
	@When("^Consulter reporting liste des actions r??alis??es par personne$")
	public void consulter_reporting_liste_des_actions_r??alis??es_par_personne() throws Throwable {
	//	driver.get("http://10.66.245.30/w23/action/rapport/FilteEtatnbreactionparpersonne.aspx");
		Thread.sleep(1000L);

		  JavascriptExecutor executor = (JavascriptExecutor)driver;
	      executor.executeScript("arguments[0].click();",FicheActionPage.wreporting.findElement(By.cssSelector("#menu_rep > div > div > ul > li > a > img")) );
	      JavascriptExecutor executor1 = (JavascriptExecutor)driver;
	      executor1.executeScript("arguments[0].click();",FicheActionPage.wreporting.findElement(By.cssSelector("#menu_rep > div > div > ul > li > ul > li:nth-child(2) > a")) );
	      JavascriptExecutor executor2 = (JavascriptExecutor)driver;
	      executor2.executeScript("arguments[0].click();",FicheActionPage.wreporting.findElement(By.cssSelector(" #menu_rep > div > div > ul > li > ul > li:nth-child(2) > ul > li:nth-child(2) > a")) );

	     
	}

	@When("^r??cup??rer filtre reporting liste des actions realisees par personne$")
	public void r??cup??rer_filtre_reporting_liste_des_actions_realisees_par_personne() throws Throwable {
		FicheActionModele.initializer_filtre_action_par_personne(Path);
	}
	
	@Then("^v??rifier les donn??es rapport liste des actions realisees par personne$")
	public void v??rifier_les_donn??es_rapport_liste_des_actions_realisees_par_personne() throws Throwable {
		String name1 = "Liste_action_r??alis??e_par_personne";
		ExcelUtils.setExcelFile(Path, "Action");
		String num_action=ExcelUtils.getCellData(row,7);
		Common.V??rifier_donn??es(name1,num_action);
		//VldIntervId
	}
	

@When("^r??cup??rer \"([^\"]*)\" reporting$")
public void r??cup??rer_reporting(String arg1) throws Throwable {
	FicheActionModele.initializer_filtre_Bilan_action(Path,arg1);
}


}

	
