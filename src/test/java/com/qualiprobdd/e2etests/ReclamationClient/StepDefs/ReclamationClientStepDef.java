package com.qualiprobdd.e2etests.ReclamationClient.StepDefs;
import com.qualiprobdd.e2etests.ReclamationClient.Models.ReclamationClientModel;
import com.qualiprobdd.e2etests.ReclamationClient.Pages.ReclamationClientPage;
import com.qualiprobdd.e2etests.authentification.models.AuthentificationModel;
import com.qualiprobdd.e2etests.util.Common;
import com.qualiprobdd.e2etests.util.ExcelUtils;
import com.qualiprobdd.e2etests.util.RTFUtil;
import com.qualiprobdd.e2etests.util.Setup;
import io.cucumber.java.en.*;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class ReclamationClientStepDef {


	public WebDriver driver;
	private static String Path = "resources/testData/TestData.xlsx";
	static int row;
	private Common common = new Common();

	public ReclamationClientStepDef() {
		driver = Setup.driver;
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		PageFactory.initElements(driver, ReclamationClientPage.class);
	}

	@When("^cliquer sur paramétrage globale$")
	public void cliquer_sur_paramétrage_globale() throws Throwable {
		ReclamationClientModel.cliquer_sur_paramétrage(driver);
	}


	@When("^Paramétrages des jours fériés$")
	public void paramétrages_des_jours_fériés() throws Throwable {
		ReclamationClientModel.paramétrages_des_jours_fériés();

	}

	@Then("^récupérer des jours fériés$")
	public void récupérer_des_jours_fériés() throws Throwable {
		ReclamationClientModel.récupérer_des_jours_fériés();
	}

	@When("^Consulter module clients$")
	public void consulter_module_clients() throws Throwable {

		ReclamationClientModel.consulter_MClients(driver);
	}

	@When("^consulter sous module réclamations clients$")
	public void consulter_sous_module_réclamations_clients() throws Throwable {
		ReclamationClientModel.consulter_SM_RClients(driver);
	}

	@When("^consulter filtre réclamations clients$")
	public void consulter_filtre_réclamations_clients() throws Throwable {
		ReclamationClientModel.consulter_SSM_RClients(driver);
	}

	@When("^ajouter (\\d+) fiche réclamation client$")
	public void ajouter_fiche_réclamation_client(int arg1) throws Throwable {
		row=arg1;
		ReclamationClientModel.cliquer_sur_ajouter_fiche_Rclient();
	}

	@When("^Saisir la réclamation$")
	public void saisir_la_réclamation() throws Throwable {
		ReclamationClientModel.saisir_réclamation();
	}

	@When("^Saisir date de réclamation$")
	public void saisir_date_de_réclamation() throws Throwable {
		ReclamationClientModel.saisir_date_de_réclamation();
	}

	@When("^choisir client$")
	public void choisir_client() throws Throwable {
		String Client="CLIENT AUTO";
		ReclamationClientModel.choisir_client(Client);
	}

	@When("^Choisir réceptionnaire$")
	public void choisir_réceptionnaire() throws Throwable {
		ReclamationClientModel.choisir_réceptionnaire();
	}

	@When("^choisir la nature de la réclamation$")
	public void choisir_la_nature_de_la_réclamation() throws Throwable {
		ExcelUtils.setExcelFile(Path, "ReclamationClient");
		String NatureR=ExcelUtils.getCellData(row, 7);
		ReclamationClientModel.choisir_nature_réclamation(NatureR);
	}

	@When("^choisir le type de la réclamation$")
	public void choisir_le_type_de_la_réclamation() throws Throwable {
		ExcelUtils.setExcelFile(Path, "ReclamationClient");
		String TypeR=ExcelUtils.getCellData(row, 6);
		ReclamationClientModel.choisir_type_réclamation(TypeR);
	}

	@When("^choisir la date de la livraison$")
	public void choisir_la_date_de_la_livraison() throws Throwable {
		ReclamationClientModel.choisir_date_livraison(driver);
	}

	@When("^saisir le numéro de BL$")
	public void saisir_le_numéro_de_BL() throws Throwable {
		ReclamationClientModel.saisir_numéro_BL();
	}

	@When("^choisir la gravité de la réclamation$")
	public void choisir_la_gravité_de_la_réclamation() throws Throwable {
		ReclamationClientModel.choisir_gravité_réclamation();
	}

	@When("^choisir site de la réclamation$")
	public void choisir_site_de_la_réclamation() throws Throwable {
		ExcelUtils.setExcelFile(Path, "ReclamationClient");
		String site=ExcelUtils.getCellData(row, 0);
		ReclamationClientModel.choisir_site_réclamation(site, driver);

	}

	@When("^choisir processus de la réclamation$")
	public void choisir_processus_de_la_réclamation() throws Throwable {
		ExcelUtils.setExcelFile(Path, "ReclamationClient");
		String processus=ExcelUtils.getCellData(row, 1);
		ReclamationClientModel.choisir_processus_réclamation(processus, driver);

	}

	@When("^choisir Direction de la réclamation$")
	public void choisir_Direction_de_la_réclamation() throws Throwable {

		ReclamationClientModel.choisir_direction_réclamation(driver);

	}
	@When("^choisir Activité de la réclamation$")
	public void choisir_Activité_de_la_réclamation() throws Throwable {

		ReclamationClientModel.choisir_activité_réclamation(driver);

	}
	@When("^choisir service de la réclamation$")
	public void choisir_service_de_la_réclamation() throws Throwable {

		ReclamationClientModel.choisir_service_réclamation(driver);
	}
	@When("^choisir Avec retour client$")
	public void choisir_Avec_retour_client() throws Throwable {

		ReclamationClientModel.AvecRetour();
	}


	@When("^cliquer sur valider enregistrement réclamation$")
	public void cliquer_sur_valider_enregistrement_réclamation() throws Throwable {
		ReclamationClientModel.valider_enregistrement_réclamation(driver);

		Thread.sleep(100L);
	}

	@When("rattacher un produit$")
	public void rattacher_un_produit () throws Throwable
	{

		//Actions action = new Actions(driver);
		//	action.moveToElement(ReclamationClientPage.RattProduitnId).perform();
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].scrollIntoView(true);",ReclamationClientPage.RattProduitnId);
		Thread.sleep(100L);
		ExcelUtils.setExcelFile(Path, "ReclamationClient");
		String produit=ExcelUtils.getCellData(row, 14);
		ReclamationClientModel.rattacher_produit(produit);

	}

	@When("^ajouter quantité et l’unité et numéro de BL$")
	public void ajouter_quantité_et_l_unité_et_numéro_de_BL() throws Throwable {
		Actions action = new Actions(driver);
		action.moveToElement(ReclamationClientPage.EditProduitId).perform();
		Thread.sleep(100L);
		ReclamationClientModel.ajouter_quantite();
	}

	@When("^rattacher des types de causes réclamation$")
	public void rattacher_des_types_de_causes_réclamation() throws Throwable {
		//Actions action = new Actions(driver);
		//action.moveToElement(ReclamationClientPage.RattTcId).perform();
		Thread.sleep(500);

		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].scrollIntoView(true);",ReclamationClientPage.RattTcId);


		Thread.sleep(100L);
		ExcelUtils.setExcelFile(Path, "ReclamationClient");
		String cause=ExcelUtils.getCellData(row, 15);
		ReclamationClientModel.rattacher_type_cause(cause);
	}

	@When("^rattacher des fiches de nonconformités$")
	public void rattacher_des_fiches_de_nonconformités() throws Throwable {
		Actions action = new Actions(driver);
		action.moveToElement(ReclamationClientPage.RattNcId).perform();
		Thread.sleep(100L);
		ExcelUtils.setExcelFile(Path, "ReclamationClient");
		String exe=ExcelUtils.getCellData(row,10);
		ReclamationClientModel.rattacher_non_conformite(driver,exe);
	}

	@When("^rattacher des réclamations fournisseurs$")
	public void rattacher_des_réclamations_fournisseurs() throws Throwable {
		ReclamationClientModel.rattacher_RF(driver);
		//Thread.sleep(300);
		//assertTrue(driver.findElement(By.id("ctl00_ContentPlaceHolder1_num_Rec_frs")).getText().contains("1"));
	}

	@When("^rattacher des demandes actions$")
	public void rattacher_des_demandes_actions() throws Throwable {
		ReclamationClientModel.rattacher_DA();
		//Thread.sleep(300);
		//assertTrue(driver.findElement(By.id("ctl00_ContentPlaceHolder1_num_d_act")).getText().contains("1"));
	}

	@When("^rattacher des actions$")
	public void rattacher_des_actions() throws Throwable {
		ReclamationClientModel.rattacher_A();
		//Thread.sleep(300);
		//assertTrue(driver.findElement(By.id("ctl00_ContentPlaceHolder1_Label_nb_action")).getText().contains("1"));
	}

	@When("^rattacher des pièces jointes$")
	public void rattacher_des_pièces_jointes() throws Throwable {
		ReclamationClientModel.rattacher_PJ();
		//Thread.sleep(500);
		//assertTrue(driver.findElement(By.id("ctl00_ContentPlaceHolder1_num_pj")).getText().contains("1"));
	}

	@When("^rattacher des personnes à informer$")
	public void rattacher_des_personnes_à_informer() throws Throwable {
		Thread.sleep(500L);
		ReclamationClientModel.rattacher_PI(driver);
		Thread.sleep(500L);
	}
	@Then("^Fiche réclamation client est ajoutée$")
	public void fiche_réclamation_client_est_ajoutée() throws Throwable{
		ReclamationClientModel.Verifier_fiche_réclamation_ajoutée(row);
		Thread.sleep(100L);
	}

	@Then("^Récupérer Responsable Décision$")
	public void Récupérer_Responsable_Décision() throws Throwable{
		ExcelUtils.setExcelFile(Path, "ReclamationClient");
		String RespDec=ExcelUtils.getCellData(row,2);
		ReclamationClientModel.récupérer_responsable(RespDec);
		Thread.sleep(100L);
	}

	@Then("^incrémentation compteur agenda réclamations clients$")
	public void incrémentation_compteur_agenda_réclamations_clients() throws Throwable {
		ReclamationClientModel.Verifier_Agd_Rec();
		Thread.sleep(100L);
	}



	@When("^Connecter en tant que Responsable Décision RecClient$")
	public void Connecter_en_tant_que_Responsable_Décision_RecClients() throws Throwable
	{
		ExcelUtils.setExcelFile(Path, "ReclamationClient");
		String resp=ExcelUtils.getCellData(row,2);
		AuthentificationModel.Changer_Compte(resp,driver);
	}

	@When("^Consulter agenda réclamations qui nécessitent des décisions$")
	public void consulter_agenda_réclamations_qui_nécessitent_des_décisions() throws Throwable {
		ReclamationClientModel.Consulter_fiche_pour_decision(driver);

	}

	@When("^Cliquer (\\d+) décision de traitement$")
	public void cliquer_décision_de_traitement(int arg1) throws Throwable {
		Thread.sleep(3000);
		row=arg1;

		Thread.sleep(500);
		ExcelUtils.setExcelFile(Path, "ReclamationClient");
		String value=ExcelUtils.getCellData(row,9);
		System.out.println("value :"+value);
		Thread.sleep(1000);
		JavascriptExecutor  executor2 = (JavascriptExecutor)driver;

		executor2.executeScript("arguments[0].click()", ReclamationClientPage.RechDecRecID.findElement(By.tagName("input")));
		Thread.sleep(1000);
		ReclamationClientPage.RechDecRecID.findElement(By.tagName("input")).sendKeys(value);;
		//ReclamationClientPage.RechDecRecID.click();
		Thread.sleep(1000);
		//ReclamationClientPage.RechDecRecID.sendKeys(value);
		Thread.sleep(1000);
		WebElement Element = ReclamationClientPage.TabDecRecID.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_GridView_dec\"]/tbody/tr/td[1]")).findElement(By.tagName("a"));
		//*[@id="ctl00_ContentPlaceHolder1_GridView_dec"]/tbody/tr/td[1]
		Thread.sleep(500);
		JavascriptExecutor  executor = (JavascriptExecutor)driver;

		executor.executeScript("arguments[0].click()", Element);

	}

	@When ("^cliquer sur réclamation qui Nécessite investigation$")
	public void cliquer_sur_réclamation_qui_Nécessite_investigation() throws Throwable{
		ReclamationClientModel.Nécessite_investigation();

	}
	@When ("^saisir responsable investigation réclamation$")
	public void saisir_responsable_investigation_réclamation() throws Throwable{
		ExcelUtils.setExcelFile(Path, "ReclamationClient");
		String resp=ExcelUtils.getCellData(row, 12);
		ReclamationClientModel.responsable_investigation(resp);

	}
	@When ("^saisir délai investigation réclamation$")
	public void saisir_délai_investigation_réclamation() throws Throwable{
		ReclamationClientModel.délai_investigation(driver);

	}
	@When ("^joindre plan investigation réclamation$")
	public void joindre_plan_investigation_réclamation() throws Throwable{
		ReclamationClientModel.joindre_plan_investigation(driver);

	}
	@When ("^choisir approbateur investigation réclamation$")
	public void choisir_approbateur_investigation_réclamation() throws Throwable{
		ExcelUtils.setExcelFile(Path, "ReclamationClient");
		String resp=ExcelUtils.getCellData(row, 13);
		ReclamationClientModel.approbateur_investigation(resp);
	}
	@When ("^valider partie investigation réclamation$")
	public void valider_partie_investigation_réclamation() throws Throwable{
		//driver.findElement(By.id("sp_Invest")).click();
		//Thread.sleep(500);
		ReclamationClientModel.valider_investigation(driver);
	}

	@When("^saisir le responsable de traitement Reclamation$")
	public void saisir_le_responsable_de_traitement_Reclamation() throws Throwable {
		ExcelUtils.setExcelFile(Path, "ReclamationClient");
		String RespTrait=ExcelUtils.getCellData(row,3);
		Select select = new Select(ReclamationClientPage.wrespoTrait);
		select.selectByVisibleText(ExcelUtils.getCellData1(row,3));
		//ReclamationClientModel.saisir_responsable_Trait(RespTrait);
	}

	@When("^saisir le type de la décision$")
	public void saisir_le_type_de_la_décision() throws Throwable {
		ReclamationClientModel.saisir_type_décision(driver);
	}

	@When("^saisir le traitement de la réclamation$")
	public void saisir_le_traitement_de_la_réclamation() throws Throwable {
		ReclamationClientModel.saisir_traitement_réclamation();
	}

	@When("^saisir le délai de traitement$")
	public void saisir_le_délai_de_traitement() throws Throwable {
		ReclamationClientModel.saisir_délai_traitement(driver, row);
	}

	@When("^saisir le responsable de suivi$")
	public void saisir_le_responsable_de_suivi() throws Throwable {
		ExcelUtils.setExcelFile(Path, "ReclamationClient");
		String RespSuivi=ExcelUtils.getCellData1(row,4);
		System.out.println("respo  suivi"+ExcelUtils.getCellData1(row,4));
		Thread.sleep(500);


		ReclamationClientModel.saisir_responsable_suivi(RespSuivi);
	}
	@When("^rattacher fiche huit D$")
	public void rattacher_fiche_huit_D() throws Throwable{
		ReclamationClientModel.rattacher_FicheHuitD();
	}

	@When("^cliquer sur valider décision de la réclamation$")
	public void cliquer_sur_valider_décision_de_la_réclamation() throws Throwable {
		ReclamationClientModel.cliquer_valider_décision_réclamation(driver);
	}



	@Then("^vérifier l’état de la réclamation et son passage vers le traitement$")
	public void vérifier_l_état_de_la_réclamation_et_son_passage_vers_le_traitement() throws Throwable {
		ReclamationClientModel.vérifier_état_réclamation_passage_traitement();
	}
	@Then("^Récupérer Responsable Traitement$")
	public void Récupérer_Responsable_Traitement () throws Throwable
	{
		ExcelUtils.setExcelFile(Path, "ReclamationClient");
		String RespTrait=ExcelUtils.getCellData(row,3);
		ReclamationClientModel.récupérer_responsable(RespTrait);
	}

	@When("^Connecter en tant que Responsable Investigation RecClient$")
	public void Connecter_en_tant_que_Responsable_Investigation_RecClients() throws Throwable
	{
		ExcelUtils.setExcelFile(Path, "ReclamationClient");
		String resp=ExcelUtils.getCellData(row,2);
		AuthentificationModel.Changer_Compte(resp,driver);
	}

	@When("^consulter agenda réclamation qui nécessitent investigation$")
	public void consulter_agenda_réclamation_qui_nécessitent_investigation() throws Throwable
	{
		ReclamationClientModel.consulter_fiche_pour_investigation(driver);
	}

	@When("^consulter (\\d+) réclamation à investiger$")
	public void consulter_réclamation_à_investiger(int arg1) throws Throwable{
		row= arg1;
		ExcelUtils.setExcelFile(Path, "ReclamationClient");
		String exe=ExcelUtils.getCellData(row,9);
		ReclamationClientModel.consulter_réclamation_a_investiger(exe);
	}

	@When("^saisir rapport investigation réclamation$")
	public void saisir_rapport_investigation_réclamation() throws Throwable{
		ReclamationClientModel.saisir_rapport_investigation();
	}

	@When("^Connecter en tant que Approbateur investigation RecClient$")
	public void Connecter_en_tant_que_Approbateur_Investigation_RecClients() throws Throwable
	{
		ExcelUtils.setExcelFile(Path, "ReclamationClient");
		String resp=ExcelUtils.getCellData(row,2);
		AuthentificationModel.Changer_Compte(resp,driver);
	}

	@When("^consulter agenda investigation réclamation à approuver$")
	public void consulter_agenda_investigation_réclamation_à_approuver() throws Throwable
	{
		ReclamationClientModel.consulter_fiche_pour_app_investigation(driver);
	}
	@When("^consulter (\\d+) investigation réclamation à approuver$")
	public void consulter_investigation_réclamation_à_approuver(int arg1) throws Throwable
	{
		row= arg1;
		ExcelUtils.setExcelFile(Path, "ReclamationClient");
		String exe=ExcelUtils.getCellData(row,9);
		ReclamationClientModel.consulter_réclamation_a_app_investiger(exe);
	}
	@When("^cliquer sur approuvé investigation réclamation$")
	public void cliquer_sur_approuvé_investigation_réclamation() throws Throwable
	{
		ReclamationClientModel.cloturer_investigation();
	}

	@When("^cliquer sur (\\d+) réclamation pour traitement$")
	public void cliquer_sur_réclamation_pour_traitement(int arg1) throws Throwable {
		row= arg1;
		ExcelUtils.setExcelFile(Path, "ReclamationClient");
		String exe=ExcelUtils.getCellData(row,9);
		Thread.sleep(500);
		System.out.println("num de   fiche   "+exe);
		Thread.sleep(500);
		ReclamationClientModel.Passage_Traitement(exe,driver);
		Thread.sleep(500);
		WebElement tableRow = ReclamationClientPage.TableTraiID.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_GridView_trait\"]/tbody/tr"));
		WebElement cellIneed = tableRow.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_GridView_trait\"]/tbody/tr/td[1]"));
		WebElement cellIneed1 = cellIneed.findElement(By.tagName("a"));
		Thread.sleep(1000);
		// add  by   mootez
		WebElement dateColTrait =ReclamationClientPage.TableTraiID.findElement(By.
				xpath("//*[@id=\"ctl00_ContentPlaceHolder1_GridView_trait\"]/tbody/tr/td[1]")).
				//*[@id="ctl00_ContentPlaceHolder1_GridView_trait"]/tbody/tr/td[1]
				findElement(By.tagName("a"));
	//	ReclamationClientModel.VérifieColor(dateColTrait,driver);



		cellIneed1.click();
		//Thread.sleep(1000);
		//ReclamationClientPage.VolTraiID.click();

	}

	@When("^saisir le rapport de traitement Reclamation$")
	public void saisir_le_rapport_de_traitement_Reclamation() throws Throwable {
		ReclamationClientModel.saisir_rapport_Trait();

	}

	@When("^saisir le cout de pénalité$")
	public void saisir_le_cout_de_pénalité() throws Throwable {
		ReclamationClientModel.saisir_cout_Trait();
	}

	@When("^saisir les autres frais$")
	public void saisir_les_autres_frais() throws Throwable {
		ReclamationClientModel.saisir_frais_Trait();
	}

	@When("^cliquer sur valider partie traitement de la réclamation$")
	public void cliquer_sur_valider_partie_traitement_de_la_réclamation() throws Throwable {
		ReclamationClientModel.modifier_status_Trait();
		ReclamationClientModel.valider_Trait_Rec();
	}



	@Then("^vérifier le passage vers le clôture$")
	public void vérifier_le_passage_vers_le_clôture() throws Throwable {
		ReclamationClientModel.vérifier_état_réclamation_passage_cloture();
	}

	@Then ("^Vérifier les couts$")
	public void Vérifier_les_couts() throws Throwable{
		String CoutPNC,PenaliteCost;
		ExcelUtils.setExcelFile(Path, "ReclamationClient");
		CoutPNC=ExcelUtils.getCellData(row,11);
		try {
			ReclamationClientPage.CoutPncID.isDisplayed();

			//System.out.println("coutPNC"+ Integer.parseInt(ReclamationClientPage.CoutPncID.getAttribute("value")));
			Assert.assertTrue(ReclamationClientPage.CoutPncID.getAttribute("value").contains(CoutPNC));
			Common.Exporter_champ_A_masquer("le champ CNQ produit est visible");
		}
		catch (NoSuchElementException e) {
			Common.Exporter_champ_A_masquer("le champ CNQ produit est invisible");
		}
		try {
			ReclamationClientPage.CoutTraiID.isDisplayed();
			System.out.println("CoutTraiID"+Integer.parseInt(ReclamationClientPage.CoutTraiID.getAttribute("value")));
			PenaliteCost=ReclamationClientPage.CoutTraiID.getAttribute("value");
			Common.Exporter_champ_A_masquer("le champ cout de penalité est visible");
		}
		catch (NoSuchElementException e) {
			PenaliteCost="0";
			Common.Exporter_champ_A_masquer("le champ cout de penalité est invisible");
		}
		System.out.println("FraisTraiID"+Integer.parseInt(ReclamationClientPage.FraisTraiID.getAttribute("value")));
		Integer total= Integer.parseInt(CoutPNC)+Integer.parseInt(ReclamationClientPage.FraisTraiID.getAttribute("value"))+Integer.parseInt(PenaliteCost);
		System.out.println(total);
		Assert.assertTrue(ReclamationClientPage.CoutTotalID.getAttribute("value").contains(total.toString()));

	}

	@Then("^Récupérer Responsable Suivi$")
	public void Récupérer_Responsable_Suivi() throws Throwable
	{
		ExcelUtils.setExcelFile(Path, "ReclamationClient");
		String RespSuivi=ExcelUtils.getCellData(row,4);
		ReclamationClientModel.récupérer_responsable(RespSuivi);
	}

	@When("^cliquer sur (\\d+) réclamation à clôturer$")
	public void cliquer_sur_réclamation_à_clôturer(int arg1) throws Throwable {
		row= arg1;
		ExcelUtils.setExcelFile(Path, "ReclamationClient");
		String exe=ExcelUtils.getCellData(row,9);
		ReclamationClientModel.Passage_Cloture(exe,driver);
		WebElement tableRow = ReclamationClientPage.TableSuiviID.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_GridView_suiv\"]/tbody/tr"));
		WebElement cellIneed = tableRow.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_GridView_suiv\"]/tbody/tr/td[1]"));
		WebElement cellIneed1 = cellIneed.findElement(By.tagName("a"));
		cellIneed1.click();
	}


	@When("^saisir le rapport de clôture$")
	public void saisir_le_rapport_de_clôture() throws Throwable {
		ReclamationClientModel.saisir_rapport_Suivi();
		ReclamationClientModel.modifier_status_Suivi();
	}

	@When("^cliquer sur valider le clôture de la réclamation$")
	public void cliquer_sur_valider_le_clôture_de_la_réclamation() throws Throwable {

		ReclamationClientModel.valider_Suivi_Rec();
	}

	@Then("^vérifier le passage de la fiche vers l’approbation finale$")
	public void vérifier_le_passage_de_la_fiche_vers_l_approbation_finale() throws Throwable
	{
		ReclamationClientModel.vérifier_état_réclamation_passage_approbation();
	}

	@Then("^Récupérer Responsable Approbation$")
	public void Récupérer_Responsable_Approbation() throws Throwable
	{
		ExcelUtils.setExcelFile(Path, "ReclamationClient");
		String RespApp=ExcelUtils.getCellData(row,5);
		ReclamationClientModel.récupérer_responsable(RespApp);
	}


	@When("^Passage de la fiche (\\d+) vers l’approbation finale$")
	public void Passage_de_la_fiche_vers_l_approbation_finale(int arg1) throws Throwable {
		row= arg1;
		boolean test=true;
		ExcelUtils.setExcelFile(Path, "ReclamationClient");
		String exe=ExcelUtils.getCellData(row,9);
		ReclamationClientModel.Passage_App(exe,driver);
		WebElement tableRow = ReclamationClientPage.TableAppID.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_GridViewApprobFinal\"]/tbody/tr"));
		WebElement cellIneed = tableRow.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_GridViewApprobFinal\"]/tbody/tr/td[1]"));

		if(cellIneed.equals(null))
		{
			cellIneed = tableRow.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_GridViewApprobFinal\"]/tbody/tr/td"));
			System.out.println(cellIneed.getText());
			if(cellIneed.getText().equals("Aucun élément à afficher"))
			{
				test=false;
			}
		}
		if(test==true) {
			//added by rahma
			//WebDriverWait wait = new WebDriverWait(driver, 30);
			//WebElement cellIneed1 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\\\"ctl00_ContentPlaceHolder1_GridViewApprobFinal\\\"]/tbody/tr/td[1]/a")));
			//WebElement cellIneed1=driver.findElement(By.id("//*[@id=\"ctl00_ContentPlaceHolder1_GridViewApprobFinal\"]/tbody/tr/td[1]/a"));
			//cellIneed1.click();
			WebElement cellIneed1 = cellIneed.findElement(By.tagName("a"));
			JavascriptExecutor  executor = (JavascriptExecutor)driver;
			executor.executeScript("arguments[0].click()", cellIneed1);

			//cellIneed1.click();
		}else{
			System.out.println("vous n'êtes pas responsable approbation");
		}
	}

	@When("^cliquer sur réclamation pour approbation$")
	public void cliquer_sur_réclamation_pour_approbation() throws Throwable {
		ReclamationClientModel.modifier_status_App();
	}

	@When("^saisir le commentaire de l’approbateur final$")
	public void saisir_le_commentaire_de_l_approbateur_final() throws Throwable {
		ReclamationClientModel.saisir_commentaire_App();
	}

	@When("^cliquer sur réclamation approuvée$")
	public void cliquer_sur_réclamation_approuvée() throws Throwable {
		ReclamationClientModel.valider_App_Rec();
	}

	@When("^saisir Numéro fiche réclamation$")
	public void saisir_Numéro_fiche_réclamation() throws Throwable {
		ReclamationClientModel.saisir_Numero_fiche();
	}

	@When("^saisir Numéro fiche réclamation filtre$")
	public void saisir_Numéro_fiche_réclamation_filtre() throws Throwable {
		ReclamationClientModel.saisir_Numero_fiche();
	}

	@When("^saisir \"([^\"]*)\" réclamation filtre$")
	public void saisir_réclamation_filtre(String arg1) throws Throwable {
		ReclamationClientPage.NumRechID.sendKeys(arg1);
		ReclamationClientPage.BRechID.click();
		ReclamationClientPage.RechTableID.findElement(By.tagName("a")).click();
		Thread.sleep(1000);

	}


	@When("^cliquer sur aperçu fiche réclamation client$")
	public void cliquer_sur_aperçu_fiche_réclamation_client() throws Throwable {
		ReclamationClientModel.Apercu_Rec();
	}


/*	@When("^exporter le rapport reclamation$")
	public void exporter_le_rapport_reclamation() throws Throwable {
		ReclamationClientPage.ExporterID.click();
		Screen s = new Screen();
		Screen s1 = new Screen();
		Screen s2 = new Screen();
		Screen s3 = new Screen();
		try {
			Pattern pattern = new Pattern("resources/imgs/Exporter_PV_reunion.PNG");
			Pattern pattern1 = new Pattern("resources/imgs/combo_exporter_pv_reunion.PNG");
			Pattern pattern2 = new Pattern("resources/imgs/Choix_combo_PV_reunion.PNG");
			Pattern pattern3 = new Pattern("resources/imgs/Btn_exporter_PV_reunion.PNG");
			s.click(pattern);
			s1.click(pattern1);
			s2.click(pattern2);
			s3.click(pattern3);
			Thread.sleep(8000);
		} catch (FindFailed e) {
			e.printStackTrace();
		}

		Runtime.getRuntime().exec("C:\\Qualipro_Auto\\AutomatisationTQualiPro_23\\AutomatisationTQualiPro_23\\resources\\Scripts\\EnregistrerFichier.exe");
	}*/

	@Then("^vérifier \"([^\"]*)\"  existent$")
	public void vérifier_existent(String arg1) throws Throwable {
		Thread.sleep(2000);

		String path = "resources/Telechargement/CrystalReportViewer1.rtf";
		String fileData = null;
		fileData = RTFUtil.ReadRTFFile(path);
		System.out.println("**************************************PV************************************************" + fileData);

		System.out.println("Existe: " + common.ExisteWord(path, arg1));
		Assert.assertTrue(common.ExisteWord(path, arg1));

		driver.navigate().back();
	}



	@Then("^vérifier si toutes les données existent$")
	public void vérifier_si_toutes_les_données_existent() throws Throwable {
		/*Thread.sleep(8000);

		String path = "resources/Telechargement/CrystalReportViewer1.rtf";
		String fileData = null;
		fileData = RTFUtil.ReadRTFFile(path);
		System.out.println("**************************************PV************************************************" + fileData);

		for (int i = 0; i < informations.size(); i++) {
			int j = i + 1;
			System.out.println("l'information " + j + ":" + informations.get(i));
			System.out.println("Existe: " + common.ExisteWord(path, informations.get(i)));
			assertTrue(common.ExisteWord(path, informations.get(i)));
		}
		driver.navigate().back();*/

	}

	@When("^cliquer sur reporting réclamations clients$")
	public void cliquer_sur_reporting_réclamations_clients() throws Throwable {
	}

	@When("^cliquer sur bilan des réclamations$")
	public void cliquer_sur_bilan_des_réclamations() throws Throwable {

	}





}
