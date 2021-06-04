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

	@Given("^ajouter  priorité$")
	public void ajouter_priorité() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		FicheActionModele.ajouter_priorité(driver);
	}

	@Given("^saisir  priorité$")
	public void saisir_priorité() throws Throwable {
	FicheActionModele.saisir_priorité(row);
	}

	@Given("^verifier priorité$")
	public void verifier_priorité() throws Throwable {
	FicheActionModele.verifier_priorité(row);
	}

	@Given("^ajouter gravité$")
	public void ajouter_gravité() throws Throwable {
	FicheActionModele.ajouter_gravité(driver);
	}

	@Given("^saisir  gravité$")
	public void saisir_gravité() throws Throwable {
	FicheActionModele.saisir_gravité(row);
	}

	@Given("^verifier gravité$")
	public void verifier_gravité() throws Throwable {
	FicheActionModele.verifier_gravité(row);
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

@When("^vérfier  etat action Module$")
public void vérfier_etat_action_Module() throws Throwable {
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

@Then("^vérfier etat   action  agenda$")
public void vérfier_etat_action_agenda() throws Throwable {
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
	@When("^cliquer sur ajouter Action détaillée$")
	public void cliquer_sur_ajouter_Action_détaillée() throws InterruptedException  {
		FicheActionModele.ajouter_action_détaillée(driver);
		Thread.sleep(2000L);	
	}
	


	@When("^Ajouter Source$")
	public void ajouter_Source() throws Throwable {
		FicheActionModele.selectionnerSourceModeleAction(row);
	}

	@When("^Saisir Date Création$")
	public void saisir_Date_Création() throws Throwable {
		FicheActionModele.choixDate(driver,row);
	}

	
	@When("^choisir Type Action$")
	public void choisir_Type_Action() throws Throwable {
		FicheActionModele.selectionnerTypeModeleAction(row);
	}
	
	@When("^Saisir Désignation$")
	public void saisir_Désignation() throws Throwable {
		FicheActionModele.designationModeleAction(row);
	}

	@When("^Saisir Description problème/objet$")
	public void saisir_Description_problème_objet() throws Throwable {
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
	
	@When("^saisir référence Audit$")
	public void saisir_référence_Audit() throws Throwable {
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

	@When("^choisir Activité$")
	public void choisir_Activité() throws Throwable {
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

	@When("^choisir un responsable de clôture$")
	public void choisir_un_responsable_de_clôture() throws Throwable {
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

	@Then("^Fiche Action ajouté$")
	public void fiche_Action_ajouté() throws Throwable {
		
		Thread.sleep(1000L);
		
		WebElement num =driver.findElement(By.id("ctl00_ContentPlaceHolder1_nact"));
		//ctl00_ContentPlaceHolder1_nact
		String Num=num.getText();
		System.out.println("action numero: "+Num);
		Common.Exporter_visibilité("Fiche Action:"+Num);
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
		ExcelUtils.setCellData1(Num, row,7, Path) ;
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

	@When("^saisir désignation sous action$")
	public void saisir_désignation_sous_action() throws Throwable {
		
		FicheActionModele.saisirDesignationSousAct(row);
		
	}
	@When("^saisir responsable de réalisation$")
	public void saisir_responsable_de_réalisation() throws Throwable {
		
		FicheActionModele.selectionnerResponsableRealisation(row);
		Thread.sleep(1000L);
	}
	@When("^saisir délais de réalisation$")
	public void saisir_délais_de_réalisation() throws Throwable {

		FicheActionModele.choixDateSousActionModeleAction(driver);
		Thread.sleep(1000L);
	  
	}
	
	@When("^choisir un responsable de suivi$")
	public void choisir_un_responsable_de_suivi() throws Throwable {

		FicheActionModele.selectionnerResponsableSuivi(row);
		Thread.sleep(3000L);
	  
	}
	@When("^choisir délais de suivi$")
	public void choisir_délais_de_suivi() throws Throwable {

		//Thread.sleep(1000L);
		//FicheActionPage.délais_suivi.click();
		Thread.sleep(1000L);
		//FicheActionPage.choix_délais_suivi.click();

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
	
	@When("^choisir gravité action$")
	public void choisir_gravité_action() throws Throwable {

		FicheActionModele.Gravite(row);
	}
	@When("^choisir Priorité SA$")
	public void choisir_Priorité_SA() throws Throwable {

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

	@Then("^sous action ajouté a la liste des sous actions$")
	public void sous_action_ajouté_a_la_liste_des_sous_actions() throws Throwable {
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

	@And("^Réaliser Action$")
	public void Réaliser_Action() throws Throwable {
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
	@And("^Clôturée Action$")
	public void Clôturée_Action() throws Throwable {
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

	@When("^Réaliser action avec (\\d+)$")
	public void réaliser_action_avec(int arg1) throws Throwable {
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
		ExcelUtils.setCellData1(taux, row,20,Path);
		FicheActionModele.saisirDepenses();
		FicheActionModele.saisirCommentaire();
		//FicheActionModele.rattacher_intervenant(driver);
		Date dt = new Date();
		Calendar c = Calendar.getInstance(); 
		c.setTime(dt); 
		c.add(Calendar.DATE,0);
		dt = c.getTime();
		String Sdate = dateFormat.format(dt);
		ExcelUtils.setCellData1(Sdate, row ,19,Path);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[1].value = arguments[0];",Sdate, FicheActionPage.SaisieDRealisation);
		
		Thread.sleep(500);
		String datesaisie=driver.findElement(By.id("ctl00_ContentPlaceHolder1_TextBox9")).getAttribute("value");
		ExcelUtils.setCellData1(datesaisie, row ,23,Path);
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

	@Then("^vérifier taux réalisation$")
	public void vérifier_taux_réalisation() throws Throwable {
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
		ExcelUtils.setCellData1(taux, row ,20,Path);
		FicheActionPage.CommNouvTxReaId.sendKeys("nécessite verification");
		Thread.sleep(500L);
		FicheActionPage.VldNvTxReaId.click();
		Thread.sleep(500L);
		taux=Integer.toString(arg2);
		Thread.sleep(500L);
		FicheActionPage.TauxEffiID.clear();
		Thread.sleep(500L);
		FicheActionPage.TauxEffiID.sendKeys(taux);
		Thread.sleep(500L);

		ExcelUtils.setCellData1(taux, row ,22,Path);
		Thread.sleep(500L);

		FicheActionPage.rapportEffiID.clear();
		Thread.sleep(500L);

		FicheActionPage.rapportEffiID.sendKeys("rapport efficacité");
		Thread.sleep(500L);

		String Sdate=driver.findElement(By.id("ctl00_ContentPlaceHolder1_TextBox10")).getAttribute("value");
		Thread.sleep(500L);

		ExcelUtils.setCellData1(Sdate, row ,21,Path);
		ExcelUtils.setCellData1(Sdate, row ,19,Path);
		Thread.sleep(1000L);
		FicheActionModele.validerSuivi(driver);

	}
	
	@Then("^vérifier taux réalisation responsable traitement$")
	public void vérifier_taux_réalisation_responsable_traitement() throws Throwable {
		
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
		Runtime.getRuntime().exec("E:\\qualipro\\trunk\\AutomatisationTQualiPro_prod\\resources\\Scripts\\EnregistrerFichier.exe");
		Thread.sleep(1000);
	}

	@Then("^Vérifier (\\d+) et (\\d+)$")
	public void vérifier_et(int arg1, int arg2) throws Throwable {
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
	

	@Then("^Vérifier etat action realisé$")
	public void vérifier_etat_action_realisé() throws Throwable {
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
				
				assertTrue(driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_GridView1\"]/tbody/tr/td")).getText().contains("Aucun élément à afficher")||driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_GridView1\"]/tbody/tr/td")).getText().contains("No matching records found"));
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

	@Then("^Vérifier etat action suivi$")
	public void vérifier_etat_action_suivi() throws Throwable {
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
	
	@When("^récupérer filtre reporting$")
	public void récupérer_filtre_reporting() throws Throwable {
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
	
	@When("^choisir \"([^\"]*)\" de réalisation des actions$")
	public void choisir_de_réalisation_des_actions(String arg1) throws Throwable 
	{
		if(arg1.equals("NON REALISEE"))
		{
			driver.findElement(By.id("ctl00_ContentPlaceHolder1_RadioButtonList_Real_0")).click();
		}else if(arg1.equals("REALISEE"))
		{
			driver.findElement(By.id("ctl00_ContentPlaceHolder1_RadioButtonList_Real_1")).click();
		}
		else {
			System.out.println("type réalisation incorrecte");
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

	@Then("^Exporter les données$")
	public void exporter_les_données() throws Throwable {
	
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

	@Then("^vérifier les données rapport$")
	public void vérifier_les_données_rapport() throws Throwable {
	String name1 = "bilan_action";
	ExcelUtils.setExcelFile(Path, "Action");
	String num_action=ExcelUtils.getCellData(1,7);
	Common.Vérifier_données(name1,num_action);
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

	@When("^récupérer filtre reporting Etat action$")
	public void récupérer_filtre_reporting_Etat_action() throws Throwable {
		FicheActionModele.initializer_filtre_Etat_action(Path);
		
	}

	@Then("^vérifier les données rapport Etat action$")
	public void vérifier_les_données_rapport_Etat_action() throws Throwable {
		String name1 = "Etat_action";
		ExcelUtils.setExcelFile(Path, "Action");
		String num_action=ExcelUtils.getCellData(row,7);
		Common.Vérifier_données(name1,num_action);
	}
//Amira
	@When("^Consulter reporting liste des actions réalisées par personne$")
	public void consulter_reporting_liste_des_actions_réalisées_par_personne() throws Throwable {
	//	driver.get("http://10.66.245.30/w23/action/rapport/FilteEtatnbreactionparpersonne.aspx");
		Thread.sleep(1000L);	
		
		  JavascriptExecutor executor = (JavascriptExecutor)driver;
	      executor.executeScript("arguments[0].click();",FicheActionPage.wreporting.findElement(By.cssSelector("#menu_rep > div > div > ul > li > a > img")) );
	      JavascriptExecutor executor1 = (JavascriptExecutor)driver;
	      executor1.executeScript("arguments[0].click();",FicheActionPage.wreporting.findElement(By.cssSelector("#menu_rep > div > div > ul > li > ul > li:nth-child(2) > a")) );
	      JavascriptExecutor executor2 = (JavascriptExecutor)driver;
	      executor2.executeScript("arguments[0].click();",FicheActionPage.wreporting.findElement(By.cssSelector(" #menu_rep > div > div > ul > li > ul > li:nth-child(2) > ul > li:nth-child(2) > a")) );

	     
	}

	@When("^récupérer filtre reporting liste des actions realisees par personne$")
	public void récupérer_filtre_reporting_liste_des_actions_realisees_par_personne() throws Throwable {
		FicheActionModele.initializer_filtre_action_par_personne(Path);
	}
	
	@Then("^vérifier les données rapport liste des actions realisees par personne$")
	public void vérifier_les_données_rapport_liste_des_actions_realisees_par_personne() throws Throwable {
		String name1 = "Liste_action_réalisée_par_personne";
		ExcelUtils.setExcelFile(Path, "Action");
		String num_action=ExcelUtils.getCellData(row,7);
		Common.Vérifier_données(name1,num_action);
		//VldIntervId
	}
	

@When("^récupérer \"([^\"]*)\" reporting$")
public void récupérer_reporting(String arg1) throws Throwable {
	FicheActionModele.initializer_filtre_Bilan_action(Path,arg1);
}
}

	
