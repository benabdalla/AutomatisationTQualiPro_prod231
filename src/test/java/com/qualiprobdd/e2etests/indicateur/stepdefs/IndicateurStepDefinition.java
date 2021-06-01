package com.qualiprobdd.e2etests.indicateur.stepdefs;


import static org.testng.Assert.assertTrue;

import io.cucumber.java.en.*;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.qualiprobdd.e2etests.indicateur.models.IndicateurModel;
import com.qualiprobdd.e2etests.indicateur.pages.IndicateurPage;
import com.qualiprobdd.e2etests.util.AbstractPage;
import com.qualiprobdd.e2etests.util.Common;
import com.qualiprobdd.e2etests.util.ExcelUtils;
import com.qualiprobdd.e2etests.util.RTFUtil;
import com.qualiprobdd.e2etests.util.Setup;


public class IndicateurStepDefinition {

	protected static final Logger logger = LoggerFactory.getLogger(AbstractPage.class);
	public WebDriver driver;
	public String Compteur = "";
	public String N_Indicateur = "";
	int row;
	private static String Path = "resources/testData/TestData.xlsx";
	public String  path ="F:\\SVN\\AutomatisationTQualiPro_23\\resources\\Telechargement";
	public String  pathContext ="F:\\SVN\\AutomatisationTQualiPro_23\\resources\\Indicateur";
	boolean suivimanuel=false;
	String typeSuivi;
	String typerésultat;
	public IndicateurStepDefinition() {
		driver = Setup.driver;
		PageFactory.initElements(driver, IndicateurPage.class);
	}

	@When("^Consulter module indicateur$")
	public void consulter_module_indicateur() throws Throwable {
		IndicateurModel.cliquerIndicateur(driver);
		Compteur = IndicateurModel.getValeurCompteur();
	}

	@When("^cliquer sur ajouter un indicateur (\\d+)$")
	public void cliquer_sur_ajouter_un_indicateur(int arg1) throws Throwable {
		row=arg1;
		IndicateurModel.ajouterFicheIndicateur();
		Thread.sleep(1000L);
	}

	@When("^Saisir libellé$")
	public void saisir_libellé() throws Throwable {
		IndicateurModel.saisirlibelleIndicateur();
	}
	
	@When("^saisir date remise à zéro$")
	public void saisir_date_remise_à_zéro() throws Throwable
	{
		ExcelUtils.setExcelFile(Path, "Indicateur");
		String avecremise=ExcelUtils.getCellData(row,6);
		String dateremise=ExcelUtils.getCellData(row,7);
		IndicateurModel.saisirdateremiseàzéro(avecremise,dateremise,driver);
	}
	@When("^saisir périodicité de remise à zéro$")
	public void saisir_périodicité_de_remise_à_zéro() throws Throwable
	{
		ExcelUtils.setExcelFile(Path, "Indicateur");
		String avecremise=ExcelUtils.getCellData(row,6);
		String periodicite=ExcelUtils.getCellData(row,8);
		IndicateurModel.saisirpériodicitéremiseàzéro(avecremise, periodicite);
	}

	@When("^Saisir formule de calcul$")
	public void saisir_formule_de_calcul() throws Throwable {
		IndicateurModel.saisirFormuleIndicateur();
	}

	@When("^sélectionner type d indicateur$")
	public void sélectionner_type_d_indicateur() throws Throwable {
		ExcelUtils.setExcelFile(Path, "Indicateur");
		String type=ExcelUtils.getCellData(row,0);
		IndicateurModel.saisirtypeindicateur(type);

	}

	@When("^saisir date début$")
	public void saisir_date_début() throws Throwable {
		IndicateurModel.cliquerCalendrier(driver);
		Thread.sleep(1000);
	}

	@When("^Sélectionner responsable indicateur$")
	public void sélectionner_responsable_indicateur_possesseur_de_la_session() throws Throwable {
		Thread.sleep(1000);

		ExcelUtils.setExcelFile(Path, "Indicateur");
		String resp=ExcelUtils.getCellData(row,1);
		IndicateurModel.choixResponsableIndicateur(resp);

	}

	@When("^sélectionner périodicité de suivi$")
	public void sélectionner_périodicité_de_suivi() throws Throwable {
		ExcelUtils.setExcelFile(Path, "Indicateur");
		String periode=ExcelUtils.getCellData(row,2);
		IndicateurModel.selectionnerPeriodiciteSuivi(periode);

	}

	@When("^sélectionner type de suivi$")
	public void sélectionner_type_de_suivi_manuel() throws Throwable {
		ExcelUtils.setExcelFile(Path, "Indicateur");
		String typesuivi=ExcelUtils.getCellData(row,3);
		String formule=ExcelUtils.getCellData(row,4);
		IndicateurModel.selectionnerTypeSuivi(typesuivi,formule,driver);
	}

	@When("^sélectionner type de résultat$")
	public void sélectionner_type_de_résultat_derniere_valeur() throws Throwable {
		ExcelUtils.setExcelFile(Path, "Indicateur");
		String typeresultat=ExcelUtils.getCellData(row,5);
		IndicateurModel.selectionnerTypeResultat(typeresultat,driver);

	}

	@When("^saisir valeur cible$")
	public void saisir_valeur_cible() throws Throwable {
		ExcelUtils.setExcelFile(Path, "Indicateur");
		String cible=ExcelUtils.getCellData(row,9);
		typerésultat=ExcelUtils.getCellData(row,5);
		IndicateurModel.choisirvaleurCible(cible, typerésultat, driver);
	}

	@When("^saisir unité$")
	public void saisir_unité() throws Throwable {
		IndicateurModel.saisirUnite();
	}

	@When("^saisir Limite critique$")
	public void saisir_Limite_critique() throws Throwable {

	}

	@When("^saisir coefficient$")
	public void saisir_coefficient() throws Throwable {

	}

	@When("^saisir Site Ind$")
	public void saisir_Site_Ind() throws Throwable {

		IndicateurModel.saisirSite(driver);
	}

	@When("^saisir Processus Ind$")
	public void saisir_Processus_Ind() throws Throwable {
		IndicateurModel.selectionnerProcessus(driver);
	}
	
	@When("^saisir activite Ind$")
	public void saisir_activite_Ind() throws Throwable {
		IndicateurModel.selectionnerActivite(driver);
	}

	@When("^saisir Direction Ind$")
	public void saisir_Direction_Ind() throws Throwable {
		IndicateurModel.selectionnerDirection(driver);
	}

	@When("^saisir Service Ind$")
	public void saisir_Service_Ind() throws Throwable {
		IndicateurModel.service(driver);
	}

	@When("^cliquer sur valider indicateur$")
	public void cliquer_sur_valider_indicateur() throws Throwable {
		IndicateurModel.cliquerSurValider(driver);
		Thread.sleep(1000);
		WebElement N_indicateur = driver.findElement(By.id("ctl00_ContentPlaceHolder1_TextBox1"));
		N_Indicateur = N_indicateur.getText();		
			ExcelUtils.setExcelFile(Path, "Indicateur");
			ExcelUtils.setCellData1(N_indicateur.getText(), row , 10 , Path) ;
			Common.Exporter_visibilité("Fiche indicateur:"+ N_Indicateur);
			Common.Exporter_champ_A_masquer("Fiche indicateur: "+ N_Indicateur);
			Common.Exporter_numFiche("Fiche indicateur:"+N_Indicateur);
	}

	@When("^cliquer sur accueil indicateur$")
	public void cliquer_sur_accueil_indicateur() throws Throwable {
		Compteur=IndicateurModel.getValeurCompteur();
		IndicateurPage.homeID.click();
		Thread.sleep(1000);
	}

	@When("^consulter agenda (\\d+) indicateur$")
	public void consulter_agenda_indicateur(int arg1) throws Throwable {
		row=arg1;
		ExcelUtils.setExcelFile(Path, "Indicateur");
		typeSuivi=ExcelUtils.getCellData(row,3);
		typerésultat=ExcelUtils.getCellData(row,5);
		N_Indicateur=ExcelUtils.getCellData(row, 10);
	IndicateurModel.consulterIndicateur(typeSuivi, typerésultat, N_Indicateur, driver);
	}
	@When("^verifier l incrémentation du compteur général et spécifique indicateur$")
	public void verifier_l_incrémentation_du_compteur_général_et_spécifique_indicateur() throws Throwable {
		IndicateurModel.verifierIncrémentationCompteur(typeSuivi, typerésultat, Compteur);
	}

	@When("^cliquer sur numero indicateur et vérifier l état de suivi$")
	public void cliquer_sur_numero_indicateur_et_vérifier_l_état_de_suivi() throws Throwable 
	{	
		IndicateurModel.vérifier_l_état_de_suivi(typeSuivi, typerésultat, N_Indicateur, driver);

	}
	
	@Then("^Vérifier valeur résultante dépendamment du \"([^\"]*)\" et \"([^\"]*)\" et \"([^\"]*)\"$")
	public void Vérifier_valeur_résultante_dépendamment_du_et_et(String arg1, String arg2, String arg3) throws Throwable
	{
		IndicateurModel.Vérifier_valeur_résultante_dépendamment(arg1, arg2, arg3, typerésultat,driver);
	}
	
	
	@When("^sélectionner axe politique$")
	public void sélectionner_axe_politique() throws Throwable {
		//IndicateurPage.enregistrement.click();
		//Thread.sleep(2000);
		IndicateurModel.RattacherAxePolitique(driver);
	}

	@When("^cliquer sur ajouter détail de suivi de l indicateur$")
	public void cliquer_sur_ajouter_détail_de_suivi_de_l_indicateur() throws Throwable {
	IndicateurModel.cliquer_sur_ajouter_détail_de_suivi_de_l_indicateur(typeSuivi,driver);
	}

	@When("^sélectionner \"([^\"]*)\" choisi$")
	public void sélectionner_choisi(String arg1) throws Throwable {
	IndicateurModel.sélectionner_choisi(typeSuivi, arg1);
	}
	
	@Given("^saisir \"([^\"]*)\" année$")
	public void saisir_année(String arg1) throws Throwable {
		IndicateurModel.saisir_année(typeSuivi, arg1);
	}



	@When("^saisir \"([^\"]*)\" indicateur$")
	public void saisir_indicateur(String arg1) throws Throwable {
		IndicateurModel.saisir_indicateur(typeSuivi, typerésultat, N_Indicateur, driver, arg1);
	}
	
	@When("^cliquer bouton importer$")
	public void cliquer_bouton_importer() throws Throwable {
		IndicateurModel.cliquer_bouton_importer(typeSuivi, typerésultat, driver);
	}
	
	@When("^Vérifier la \"([^\"]*)\" indicateur$")
	public void Vérifier_la_indicateur(String arg1) throws Throwable {
		//IndicateurModel.Vérifier_moyenne_indicateur(typeSuivi, typerésultat, arg1);
	}
	
	@When("^saisir rapport$")
	public void saisir_rapport() throws Throwable {
		IndicateurModel.saisir_rapport(typeSuivi);
	}

	@When("^rattacher fichier joint$")
	public void rattacher_fichier_joint() throws Throwable {
		
	}

	@When("^cliquer sur valider Detail$")
	public void cliquer_sur_valider_Detail() throws Throwable {
		IndicateurModel.cliquer_sur_valider_Detail(typeSuivi,driver);
	}
	
	@Then("^vérifier \"([^\"]*)\" indicateur$")
	public void vérifier_indicateur(String arg1) throws Throwable {
		IndicateurModel.vérifier_indicateur(arg1, driver);
	}
	
	@When("^consulter (\\d+) indicateur$")
	public void consulter_indicateur(int arg1) throws Throwable {
		row=arg1;
		ExcelUtils.setExcelFile(Path, "Indicateur");
		typeSuivi=ExcelUtils.getCellData(row,3);
		typerésultat=ExcelUtils.getCellData(row,5);
		N_Indicateur=ExcelUtils.getCellData(row, 10);
	IndicateurModel.consulterIndicateur(typeSuivi, typerésultat, N_Indicateur, driver);
		
	}



	
	@Then("^Vérifier suivi formule est correcte selon \"([^\"]*)\"$")
	public void vérifier_suivi_formule_est_correcte_selon(String arg1) throws Throwable {
		if(!(arg1.equals("non encore suivi"))) {
			ExcelUtils.setExcelFile(Path, "Indicateur");
			typerésultat=ExcelUtils.getCellData(row,5);
			IndicateurModel.VérifierFormuleSuivi(typerésultat,driver,Path);
			}
	}

	@When("^rattacher une action$")
	public void rattacher_une_action() throws Throwable {
		IndicateurModel.rattacher_une_action();
	}

	@When("^rattacher fiche risque opportunité$")
	public void rattacher_fiche_risque_opportunité() throws Throwable {
		IndicateurModel.rattacher_fiche_risque_opportunité();
	}

	@When("^rechercher fiche indicateur déjà créer$")
	public void rechercher_fiche_indicateur_déjà_créer() throws Throwable {
		IndicateurModel.rechercher_fiche_indicateur_déjà_créer(typeSuivi, N_Indicateur, driver);
	}

	@When("^rattacher pièces jointes$")
	public void rattacher_pièces_jointes() throws Throwable {
		IndicateurModel.rattacher_pièces_jointes(driver);
	}


	@When("^vérifier l apercu$")
	public void vérifier_l_apercu() throws Throwable {
		Thread.sleep(1000);
		driver.findElement(By.id("ctl00_ContentPlaceHolder1_LinkButton11")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("ctl00_ContentPlaceHolder1_LinkButton7")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"IconImg_CrystalReportViewer1_toptoolbar_export\"]")).click();
		Screen s1 = new Screen();
		Screen s2 = new Screen();
		Screen s3 = new Screen();
		try {
			Pattern pattern1 = new Pattern("resources/imgs/combo_exporter_pv_reunion.PNG");
			Pattern pattern2 = new Pattern("resources/imgs/Choix_combo_PV_reunion.PNG");
			Pattern pattern3 = new Pattern("resources/imgs/Btn_exporter_PV_reunion.PNG");
			s1.click(pattern1);
			s2.click(pattern2);
			s3.click(pattern3);
			Thread.sleep(1000);
		} catch (FindFailed e) {
			e.printStackTrace();
		}
		Runtime.getRuntime().exec("E:\\qualipro\\trunk\\AutomatisationTQualiPro_prod\\resources\\Scripts\\EnregistrerFichier.exe");
		
		Thread.sleep(3000);

		//Générer un nom significatif pour le fichier téléchargé
		String nom =Common.GenererNom("Indicateur", N_Indicateur ,".rtf");		
						
		//Renommer et Deplacer la fichier	
		Common.RenomerDeplacer(nom, path, pathContext);
		
		String path = pathContext+"\\"+nom;
		String fileData = null;
		fileData = RTFUtil.ReadRTFFile(path);
		System.out.println(
				"**************************************Rapport************************************************" + fileData);
	
			System.out.println("l'information :" + N_Indicateur);
			System.out.println("Existe: " + Common.ExisteWord(path, N_Indicateur));
			boolean ext=Common.ExisteWord(path, N_Indicateur);
			assertTrue(ext, "");
		
		driver.navigate().back();
		Thread.sleep(1000);
		driver.findElement(By.id("ctl00_ContentPlaceHolder1_LinkButton8")).click();
	}


	@When("^cocher indicateur non cloturé en fin de fiche$")
	public void cocher_indicateur_non_cloturé_en_fin_de_fiche() throws Throwable {
		driver.findElement(By.id("ctl00_ContentPlaceHolder1_Ch_cloture")).click();
		
	}
}
