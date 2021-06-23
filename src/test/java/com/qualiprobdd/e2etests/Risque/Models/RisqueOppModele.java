package com.qualiprobdd.e2etests.Risque.Models;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;

import com.qualiprobdd.e2etests.Risque.Page.RisqueOppPage;
import com.qualiprobdd.e2etests.util.AbstractPage;
import com.qualiprobdd.e2etests.util.Common;
import com.qualiprobdd.e2etests.util.ExcelUtils;
import com.qualiprobdd.e2etests.util.RandomValue;


import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class RisqueOppModele {

	protected static final Logger logger = LoggerFactory.getLogger(AbstractPage.class);

	private static String Path = "resources/testData/TestData.xlsx";

	public static void cliquer_sur_module_Risque_Opportunité(WebDriver driver) throws InterruptedException {
		System.out.println("driver : ----->");
		Thread.sleep(500);
		JavascriptExecutor executor2 = (JavascriptExecutor) driver;
		executor2.executeScript("arguments[0].click()", RisqueOppPage.menuID);

	}

	public static void cliquer_sur_sous_module_risque_Opportunité(WebDriver driver) throws Throwable {
		// Write code here that turns the phrase above into concrete actions

		Common.AccéderModule(6, 0, 0, driver);

		Common.AccéderModule(6, 2, 0, driver);

		Common.AccéderModule(6, 2, 1, driver);

	}

	public static void cliquer_sur_ajouter_Risque_Opportunité(WebDriver driver) throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		Thread.sleep(500);
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click()", RisqueOppPage.WAjouteRisque);
	}

	public static void saisir_Objet_d_incertitude(int row,WebDriver  driver) throws Exception {

		ExcelUtils.setExcelFile(Path, "RisqueOpp");

		//RisqueOppPage.wRadioRisque.click();
		Thread.sleep(800);
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click()",RisqueOppPage.wRadioRisque);
		String st = RandomValue.randomString(10);
		System.out.println(" object" + st);
		RisqueOppPage.wobject.sendKeys(st);
		ExcelUtils.setCellData1(st, row, 11, Path, "RisqueOpp");
	}

	public static void saisir_Objectif(WebDriver driver, int row) throws Exception {

		try {

			ExcelUtils.setExcelFile(Path, "RisqueOpp");

			String st = RandomValue.randomString(20);
			System.out.println(" objectif" + st);
			if (RisqueOppPage.wobjectif.isDisplayed()) {
				RisqueOppPage.wobjectif.sendKeys(st);
				Common.Exporter_visibilité("l'activité est visible");

				ExcelUtils.setCellData1(st, row, 10, Path, "RisqueOpp");

				String text = driver.findElement(By.id("ctl00_ContentPlaceHolder1_Label_obj")).getText();
				if (text.indexOf('*') != -1) {
					Common.Exporter_visibilité("l'activité est obligatoire");
				} else {
					Common.Exporter_visibilité("l'activité n'est pas obligatoire");

				}

			}

		} catch (NoSuchElementException e) {
			Common.Exporter_visibilité("l'activité est invisible");

		}

	}

	public static void saisir_Source_Cause(WebDriver driver, int row) throws Exception {

		try {

			ExcelUtils.setExcelFile(Path, "RisqueOpp");

			String st = RandomValue.randomString(150);

			if (RisqueOppPage.Wsource.isDisplayed()) {

				Common.Exporter_visibilité("l'activité est visible");

				RisqueOppPage.Wsource.sendKeys(st);
				System.out.println(" _Source_Cause" + st);

				ExcelUtils.setCellData1(st, row, 12, Path, "PNC");

				String text = driver.findElement(By.id("ctl00_ContentPlaceHolder1_Label_cause")).getText();
				if (text.indexOf('*') != -1) {
					Common.Exporter_visibilité("l'activité est obligatoire");
				} else {
					Common.Exporter_visibilité("l'activité n'est pas obligatoire");

				}

			}

		} catch (NoSuchElementException e) {
			Common.Exporter_visibilité("l'activité est invisible");

		}

	}

	public static void saisir_Evènement_Contexte(WebDriver driver, int row) throws Exception {

		try {

			ExcelUtils.setExcelFile(Path, "RisqueOpp");

			String st = RandomValue.randomString(150);
			if (RisqueOppPage.wevenment.isDisplayed()) {
				RisqueOppPage.wevenment.sendKeys(st);
				System.out.println(" Evènement_Contexte" + st);
				ExcelUtils.setCellData1(st, row, 13, Path, "RisqueOpp");

				String text = driver.findElement(By.id("ctl00_ContentPlaceHolder1_Label_cont")).getText();
				if (text.indexOf('*') != -1) {
					Common.Exporter_visibilité("l'activité est obligatoire");
				} else {
					Common.Exporter_visibilité("l'activité n'est pas obligatoire");

				}

			}

		}

		catch (NoSuchElementException e) {
			Common.Exporter_visibilité("l'activité est invisible");

		}

	}

	public static void saisir_Enjeu_Conséquence(WebDriver driver, int row) throws Exception {

		try {

			ExcelUtils.setExcelFile(Path, "RisqueOpp");

			String st = RandomValue.randomString(20);

			if (RisqueOppPage.Wenjeu.isDisplayed()) {
				System.out.println(" enjeu" + st);
				RisqueOppPage.Wenjeu.sendKeys(st);
				ExcelUtils.setCellData1(st, row, 15, Path, "RisqueOpp");

				String text = driver.findElement(By.id("ctl00_ContentPlaceHolder1_Label31")).getText();
				if (text.indexOf('*') != -1) {
					Common.Exporter_visibilité("l'activité est obligatoire");
				} else {
					Common.Exporter_visibilité("l'activité n'est pas obligatoire");

				}

			}

		}

		catch (NoSuchElementException e) {
			Common.Exporter_visibilité("l'activité est invisible");

		}

	}

	public static void saisir_Domaine_de_risque(WebDriver driver, int row) throws Exception {
		// Write code here that turns the phrase above into concrete actions

		try {

			ExcelUtils.setExcelFile(Path, "RisqueOpp");

			if (RisqueOppPage.WListDomaine.isDisplayed()) {
				System.out.println(" domaine  de   risque");
				RisqueOppPage.WListDomaine.sendKeys(ExcelUtils.getCellData1(row, 6));

				String text = driver.findElement(By.id("ctl00_ContentPlaceHolder1_Label_DomRis")).getText();
				if (text.indexOf('*') != -1) {
					Common.Exporter_visibilité("l'activité est obligatoire");
				} else {
					Common.Exporter_visibilité("l'activité n'est pas obligatoire");

				}

			}

		}

		catch (NoSuchElementException e) {
			Common.Exporter_visibilité("l'activité est invisible");

		}
	}

	public static void saisir_Type_dimpact_des_risques(WebDriver driver, int row) throws Exception {
		// Write code here that turns the phrase above into concrete actions

		try {

			ExcelUtils.setExcelFile(Path, "RisqueOpp");

			if (RisqueOppPage.Wimpact.isDisplayed()) {
				System.out.println(" impact  de   risque");
				RisqueOppPage.Wimpact.sendKeys(ExcelUtils.getCellData1(row, 2));

				String text = driver.findElement(By.id("ctl00_ContentPlaceHolder1_Label_impact")).getText();
				if (text.indexOf('*') != -1) {
					Common.Exporter_visibilité("l'activité est obligatoire");
				} else {
					Common.Exporter_visibilité("l'activité n'est pas obligatoire");

				}

			}

		}

		catch (NoSuchElementException e) {
			Common.Exporter_visibilité("l'activité est invisible");

		}
	}

	public static void saisir_Site(WebDriver driver, int row) throws Exception {
		// Write code here that turns the phrase above into concrete actions

		try {

			ExcelUtils.setExcelFile(Path, "RisqueOpp");

			if (RisqueOppPage.Wsite.isDisplayed()) {

				System.out.println(" site");
				RisqueOppPage.Wsite.sendKeys(ExcelUtils.getCellData1(row, 1));

				String text = driver.findElement(By.id("ctl00_ContentPlaceHolder1_Label99")).getText();
				if (text.indexOf('*') != -1) {
					Common.Exporter_visibilité("l'activité est obligatoire");
				} else {
					Common.Exporter_visibilité("l'activité n'est pas obligatoire");

				}

			}

		}

		catch (NoSuchElementException e) {
			Common.Exporter_visibilité("l'activité est invisible");

		}
	}

	public static void saisir_Processus(WebDriver driver, int row) throws Exception {
		// Write code here that turns the phrase above into concrete actions

		try {

			ExcelUtils.setExcelFile(Path, "RisqueOpp");

			if (RisqueOppPage.WProcessus.isDisplayed()) {

				System.out.println(" Processus");
				RisqueOppPage.WProcessus.sendKeys(ExcelUtils.getCellData1(row, 0));

				String text = driver.findElement(By.id("ctl00_ContentPlaceHolder1_LblProcessus_")).getText();
				if (text.indexOf('*') != -1) {
					Common.Exporter_visibilité("l'activité est obligatoire");
				} else {
					Common.Exporter_visibilité("l'activité n'est pas obligatoire");

				}

			}

		}

		catch (NoSuchElementException e) {
			Common.Exporter_visibilité("l'activité est invisible");

		}
	}

	public static void saisir_Activité(WebDriver driver, int row) throws Exception {
		// Write code here that turns the phrase above into concrete actions

		try {

			ExcelUtils.setExcelFile(Path, "RisqueOpp");

			if (RisqueOppPage.Wactivite.isDisplayed()) {

				System.out.println(" Activite");
				RisqueOppPage.Wactivite.sendKeys(ExcelUtils.getCellData1(row, 4));
				String text = driver.findElement(By.id("ctl00_ContentPlaceHolder1_LblDomaine_")).getText();
				if (text.indexOf('*') != -1) {
					Common.Exporter_visibilité("l'activité est obligatoire");
				} else {
					Common.Exporter_visibilité("l'activité n'est pas obligatoire");

				}

			}

		}

		catch (NoSuchElementException e) {
			Common.Exporter_visibilité("l'activité est invisible");

		}
	}

	public static void saisir_Direction(WebDriver driver, int row) throws Exception {
		// Write code here that turns the phrase above into concrete actions

		try {

			ExcelUtils.setExcelFile(Path, "RisqueOpp");

			if (RisqueOppPage.Wdrection.isDisplayed()) {

				System.out.println("direction");
				RisqueOppPage.Wdrection.sendKeys(ExcelUtils.getCellData1(row, 3));

				String text = driver.findElement(By.id("ctl00_ContentPlaceHolder1_LabelDir")).getText();
				if (text.indexOf('*') != -1) {
					Common.Exporter_visibilité("l'activité est obligatoire");
				} else {
					Common.Exporter_visibilité("l'activité n'est pas obligatoire");

				}

			}

		}

		catch (NoSuchElementException e) {
			Common.Exporter_visibilité("l'activité est invisible");

		}
	}

	public static void saisir_Service(WebDriver driver, int row) throws Exception {
		ExcelUtils.setExcelFile(Path, "RisqueOpp");

		try {

			ExcelUtils.setExcelFile(Path, "RisqueOpp");

			if (RisqueOppPage.Wactivite.isDisplayed()) {

				System.out.println(" services");
				RisqueOppPage.Wservice.sendKeys(ExcelUtils.getCellData1(row, 3));

				String text = driver.findElement(By.id("ctl00_ContentPlaceHolder1_LblService_")).getText();
				if (text.indexOf('*') != -1) {
					Common.Exporter_visibilité("l'activité est obligatoire");
				} else {
					Common.Exporter_visibilité("l'activité n'est pas obligatoire");

				}

			}

		}

		catch (NoSuchElementException e) {
			Common.Exporter_visibilité("l'activité est invisible");

		}
	}
      @org.testng.annotations.Test
	public static void cliquer_valider(WebDriver driver) throws InterruptedException {
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight)");
		JavascriptExecutor executor2 = (JavascriptExecutor) driver;


		executor2.executeScript("arguments[0].click()", RisqueOppPage.WvaliderFicherRisque);
	

	}

	@org.testng.annotations.Test
	public static void verifier_l_ajout_de_la_fiche(WebDriver driver, int row) throws Exception {
		ExcelUtils.setExcelFile(Path, "RisqueOpp");
		String Numfich = "";
		boolean Ok = false;

		Numfich = RisqueOppPage.WNumfiche.getText();
		System.out.println(" numero  ficher risque -->" + Numfich);

		System.out.println("ficher  Risque   et   " + Numfich == "");
		System.out.println("ficher  Risque   et   " + Numfich !=" ");
		
		Ok = Numfich !=" ";
		assertEquals(true, Ok, "fiche ne  pas   crée");
		Assert.assertTrue(Ok, "fiche ne  pas   crée");
	

		ExcelUtils.setCellData1(Numfich, row, 14, Path, "RisqueOpp");
		// WebDriverWait wait = new WebDriverWait(driver,60);

		/*
		 * JavascriptExecutor executor2 = (JavascriptExecutor) driver;
		 * executor2.executeScript("arguments[0].click()",
		 * RisqueOppPage.WvaliderFicherRisque); Thread.sleep(500);
		 * 
		 * JavascriptExecutor executor3 = (JavascriptExecutor) driver;
		 * executor3.executeScript("arguments[0].click()", RisqueOppPage.Wretour);
		 * Thread.sleep(500);
		 * RisqueOppPage.Wrecher.sendKeys(ExcelUtils.getCellData1(row, 14));
		 * 
		 * JavascriptExecutor executor4 = (JavascriptExecutor) driver;
		 * executor4.executeScript("arguments[0].click()", RisqueOppPage.Wbtnrecher);
		 * Thread.sleep(500); JavascriptExecutor executor5 = (JavascriptExecutor)
		 * driver; executor5.executeScript("arguments[0].click()",
		 * RisqueOppPage.widfich); Thread.sleep(500); ExcelUtils.setExcelFile(Path,
		 * "RisqueOpp");
		 */

	}

	public static void clique_sur_agenda_Risque(WebDriver driver) throws InterruptedException {
		JavascriptExecutor executor5 = (JavascriptExecutor) driver;
		executor5.executeScript("arguments[0].click()", RisqueOppPage.WagendaRisque);
		Thread.sleep(500);
	}

	public static void cliquer_sur_Liste_des_évaluation_des_risques_Opportunités_résiduel_le_s_brut_e_s(
			WebDriver driver) throws InterruptedException {
		JavascriptExecutor executor5 = (JavascriptExecutor) driver;
		executor5.executeScript("arguments[0].click()", RisqueOppPage.wevaluationBrut);
		Thread.sleep(500);
	}

	static WebElement element35 = null;

	public static void rechercher_un_fichier_risque_Opportunité(WebDriver driver, int row) throws Exception {
		ExcelUtils.setExcelFile(Path, "RisqueOpp");

		// )
		RisqueOppPage.wrecherFichCree.sendKeys(ExcelUtils.getCellData1(row, 14));
		element35 = RisqueOppPage.wgridFich
				.findElement(By.xpath(
						"//*[@id=\"ctl00_ContentPlaceHolder1_GridView6_wrapper\"]/div[2]/div/table/tbody/tr/td[1]"))
				.findElement(By.tagName("a"));

	}

	public static void cliquer_sur_fiche_risque_Opportunité(WebDriver driver) {

		JavascriptExecutor executor5 = (JavascriptExecutor) driver;
		executor5.executeScript("arguments[0].click()", element35);
	}

	public static void choisier_les_notes_agenda(int row) throws Exception {
		ExcelUtils.setExcelFile(Path, "RisqueOpp");

		System.out.println(ExcelUtils.getCellData1(row, 18));
		List<WebElement> allRows = RisqueOppPage.wgrid.findElements(By.tagName("tr"));
		int i = 1;
		int j = 18;
		while (i < allRows.size()) {
			WebElement element = RisqueOppPage.wgrid
					.findElement(
							By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_gv_risqcretere\"]/tbody/tr[" + i + "]/td[2]"))
					.findElement(By.tagName("select"));
			Select select = new Select(element);
			select.selectByVisibleText(ExcelUtils.getCellData1(row, j));
			Thread.sleep(500);
			i++;
			j++;

		}

	}

	public static void cliquer_valider_evaluation_brute(WebDriver driver) throws Exception {

		JavascriptExecutor executor5 = (JavascriptExecutor) driver;
		executor5.executeScript("arguments[0].click()", RisqueOppPage.wvaliderevalutionBrutAgenda);

	}

	public static void ajouter_decision(WebDriver driver, int row) throws Exception {
		System.out.println(" alert  is " + RisqueOppPage.wconf.isDisplayed());

		if (RisqueOppPage.wconf.isDisplayed()) {
			JavascriptExecutor executor = (JavascriptExecutor) driver;
			executor.executeScript("arguments[0].click()", RisqueOppPage.wconf);
			System.out.println("clique ");

			ExcelUtils.setExcelFile(Path, "RisqueOpp");

			// WebElement element =driver.findElement(By.id(""));
			Select select = new Select(RisqueOppPage.wdesiosion);
			select.selectByVisibleText(ExcelUtils.getCellData1(row, 16));
			System.out.println("risque  acceptable ");

			String st = RandomValue.randomString(150);

			driver.findElement(By.id("ctl00_ContentPlaceHolder1_tb_decision_com")).sendKeys(st);
			ExcelUtils.setCellData1(st, row, 17, Path, "RisqueOpp");

			JavascriptExecutor executor8 = (JavascriptExecutor) driver;
			executor8.executeScript("arguments[0].click()",
					driver.findElement(By.id("ctl00_ContentPlaceHolder1_valider_decision")));

		}

	}

	public static void verifier_evaluation_brut(WebDriver driver) {
		JavascriptExecutor executor = (JavascriptExecutor) driver;

		executor.executeScript("arguments[0].click()", RisqueOppPage.wevalutionBrutAganda);
		System.out.println("cliquer sur risque evaluation brut ");

	}

	public static void cliquer_sur_évaluer(WebDriver driver) throws InterruptedException {
		// JavascriptExecutor executor6 = (JavascriptExecutor)driver;
		// executor6.executeScript("arguments[0].click()",wevaluationBrut);

		JavascriptExecutor executor5 = (JavascriptExecutor) driver;
		executor5.executeScript("arguments[0].click()", RisqueOppPage.wmodif);

		Thread.sleep(500);
		JavascriptExecutor executor6 = (JavascriptExecutor) driver;
		executor6.executeScript("arguments[0].click()", RisqueOppPage.wevabrut);
		Thread.sleep(500);

	}

	public static void rechercher_filtre_risque_opportunité(WebDriver driver, int row) throws Exception {

		ExcelUtils.setExcelFile(Path, "RisqueOpp");

		System.out.println(" numero  ficher risque " + RisqueOppPage.WNumfiche.getText());

		ExcelUtils.setCellData1(RisqueOppPage.WNumfiche.getText(), row, 14, Path, "RisqueOpp");
		Thread.sleep(500);

		JavascriptExecutor executor2 = (JavascriptExecutor) driver;
		executor2.executeScript("arguments[0].click()", RisqueOppPage.WvaliderFicherRisque);
		Thread.sleep(500);

		JavascriptExecutor executor3 = (JavascriptExecutor) driver;
		executor3.executeScript("arguments[0].click()", RisqueOppPage.Wretour);
		Thread.sleep(500);
		RisqueOppPage.Wrecher.sendKeys(ExcelUtils.getCellData1(row, 14));

		JavascriptExecutor executor4 = (JavascriptExecutor) driver;
		executor4.executeScript("arguments[0].click()", RisqueOppPage.Wbtnrecher);
		Thread.sleep(500);
		JavascriptExecutor executor5 = (JavascriptExecutor) driver;
		executor5.executeScript("arguments[0].click()", RisqueOppPage.widfich);
		Thread.sleep(500);
		ExcelUtils.setExcelFile(Path, "RisqueOpp");

	}

	public static void cliquer_sur_Evaluation_brute(WebDriver driver) {
		JavascriptExecutor executor4 = (JavascriptExecutor) driver;
		executor4.executeScript("arguments[0].click()", RisqueOppPage.wevabrut);

		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click()", RisqueOppPage.wbtnEva);

	}

	public static void verifier_matrice_saisie_à_partir_de_l_agenda(WebDriver driver, int row) throws Throwable {
		String id = "ctl00_ContentPlaceHolder1_tblmat";
		trait_matrice(driver, id, row, 18);

	}

	public static void rechercher_un_fichier_risque_Opportunité_module(WebDriver driver, int row) throws Exception {
		ExcelUtils.setExcelFile(Path, "RisqueOpp");

		RisqueOppPage.Wrecher.sendKeys(ExcelUtils.getCellData1(row, 14));

		JavascriptExecutor executor4 = (JavascriptExecutor) driver;
		executor4.executeScript("arguments[0].click()", RisqueOppPage.Wbtnrecher);
		Thread.sleep(500);
		JavascriptExecutor executor5 = (JavascriptExecutor) driver;
		executor5.executeScript("arguments[0].click()", RisqueOppPage.widfich);
		Thread.sleep(500);

	}

	public static void cliquer_Evaluation_résiduelle(WebDriver driver) {
		JavascriptExecutor executor5 = (JavascriptExecutor) driver;
		executor5.executeScript("arguments[0].click()", RisqueOppPage.wevalR);

	}

	public static void choisier_les_notes(int row) throws Exception {
		ExcelUtils.setExcelFile(Path, "RisqueOpp");

		System.out.println(ExcelUtils.getCellData1(row, 20));
		List<WebElement> allRows = RisqueOppPage.wgridRe.findElements(By.tagName("tr"));
		int i = 1;
		int j = 20;
		// *[@id="ctl00_ContentPlaceHolder1_gv_risqcretere_resid_wrapper"]/div[2]/div/table/tbody/tr[1]/td[2]
		while (i < allRows.size()) {
			WebElement element = RisqueOppPage.wgridRe.findElement(By.xpath(
					"//*[@id=\"ctl00_ContentPlaceHolder1_gv_risqcretere_resid_wrapper\"]/div[2]/div/table/tbody/tr[" + i
							+ "]/td[2]"))
					.findElement(By.tagName("select"));
			Select select = new Select(element);
			select.selectByVisibleText(ExcelUtils.getCellData1(row, j));
			Thread.sleep(500);
			i++;
			j++;

		}
		System.out.println("fin choisier  l  x  et  y  ");

		Thread.sleep(500);

	}

	public static void cliquerEva(WebDriver driver) {
		JavascriptExecutor executor2 = (JavascriptExecutor) driver;
		executor2.executeScript("arguments[0].click()", RisqueOppPage.wevalRbtn);

		System.out.println("fin choisier  l   edite evaluer  x  et   y     ");

	}

	public static void evaleuerRes(WebDriver driver) throws InterruptedException {
		Thread.sleep(500);
		JavascriptExecutor executor5 = (JavascriptExecutor) driver;
		executor5.executeScript("arguments[0].click()", RisqueOppPage.wvalidRe);
		System.out.println("cliquer    sur   evaluer  ");
		Thread.sleep(500);

	}

	public static void trait_matrice(WebDriver driver, String id, int row, int col) throws Throwable {
		int i = 1, j = 1, tr = 0, td = 0;
		WebElement matriceRe = driver.findElement(By.id(id));
		// WebElement table =
		// matriceRe.findElement(By.id("ctl00_ContentPlaceHolder1_ligne_matrice_resid")).findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_ligne_matrice_resid\"]/td[3]")).findElement(By.tagName("table"));
		List<WebElement> allRows = matriceRe.findElements(By.tagName("tr"));
		List<WebElement> allCols = matriceRe.findElements(By.tagName("td"));
		// *[@id="ctl00_ContentPlaceHolder1_tblmat"]/tbody/tr[1]/td[1]
		//
		String x = "", y = "", imgx = "", imgy = "";


		ExcelUtils.setExcelFile(Path, "RisqueOpp");

		String xe = ExcelUtils.getCellData1(row, col);
		col++;
		String ye = ExcelUtils.getCellData1(row, col);
		System.out.println("xe= " + xe);
		System.out.println("ye= " + ye);

		int n = allRows.size();
		System.out.println("n=" + n);
		WebElement element = null, element2 = null;
		Thread.sleep(500);
		while (i < allRows.size()) {
			element = matriceRe.findElement(By.xpath("//*[@id=\"" + id + "\"]/tbody/tr[" + i + "]/td[1]"))
					.findElement(By.tagName("span"));
			Thread.sleep(500);

			x = element.getText();

			System.out.println("x=" + x);
			if (x.equals(xe)) {

				imgx = element.getText();
				System.out.println("imgx=" + imgx);
				tr = i-1;
				System.out.println("tr=" + tr);
				break;
			}
			i++;
		}
		j = 1;
		while (j < allCols.size()) {

			element2 = matriceRe.findElement(By.xpath("//*[@id=\"" + id + "\"]/tbody/tr[" + n + "]/td[" + j + "]"))
					.findElement(By.tagName("span"));
			Thread.sleep(500);
			y = element2.getText();

			System.out.println("y=" + y);

			if (y.equals(ye)) {
				imgy = element2.getText();
				System.out.println("imgy=" + imgy);
				td = j;
				System.out.println("td=" + td);
				break;
			}			Thread.sleep(500);

			j++;

		}
		Thread.sleep(200);
//*[@id="ctl00_ContentPlaceHolder1_tblmat_resid"]/tbody/tr[5]/td[11]
		WebElement image_matrice = driver
				.findElement(By.xpath("//*[@id=\"" + id + "\"]/tbody/tr[" + tr + "]/td[" + td + "]"))
				.findElement(By.tagName("img"));
			Thread.sleep(200);
		String src_img = image_matrice.getAttribute("src");
		System.out.println("src= " + src_img);
		System.out.println("src= yellowx " + src_img.contains("yellowx"));
		System.out.println("src= green " + src_img.contains("greenx"));
		System.out.println("src=" + src_img.contains("redx"));
		Assert.assertTrue(src_img.contains("redx") || src_img.contains("yellowx") || src_img.contains("greenx"));

		try {
			if (driver.findElement(By.id("ctl00_ContentPlaceHolder1_lb_acc_resid")).isDisplayed()
					|| RisqueOppPage.wMatResultatBrut.isDisplayed()) {
				assertTrue(src_img.contains("greenx"));
			}

		} catch (Exception e) {
			System.out.println("is   is   not Acceptable ");
		}

		try {
			if (driver.findElement(By.id("ctl00_ContentPlaceHolder1_lb_sign_resid")).isDisplayed()
					|| RisqueOppPage.wResultatBrutNo.isDisplayed()) {
				assertTrue(src_img.contains("redx"));
			}
		} catch (Exception e) {
			System.out.println("is   not Significant  ");

		}

		try {
			if (matriceRe
					.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_id_tb_crit_resid\"]/tbody/tr[1]/td"))
					.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_lb_sign_resid_inter\"]")).isDisplayed()
					|| RisqueOppPage.wMatResultatBrutIN.isDisplayed()) {
				assertTrue(src_img.contains("yellowx"));
			}

		} catch (Exception e) {
			System.out.println("is  not Intermediate   ");
		}

	}

	public static void verifier_matrice(WebDriver driver, int row) throws Throwable {

		String id = "ctl00_ContentPlaceHolder1_tblmat_resid";
		trait_matrice(driver, id, row, 20);
	}

	public static void verifier_formule_saisie_a_partir_de_l_agenda(WebDriver driver) throws Throwable {

		logger.info(RisqueOppPage.wScoreBrut.getAttribute("value"));

		int score = Integer.parseInt(RisqueOppPage.wScoreBrut.getAttribute("value"));

		logger.info(RisqueOppPage.wSeuilBrut.getAttribute("value"));

		int seuil = Integer.parseInt(RisqueOppPage.wSeuilBrut.getAttribute("value"));

		if (score < seuil) {
			Assert.assertTrue(RisqueOppPage.wResultatBrut.isDisplayed());
		} else {
			Assert.assertTrue(RisqueOppPage.wResultatBrutNo.isDisplayed());
		}

	}

	public static void verifier_matrice_formule(WebDriver driver) throws Throwable {

		logger.info(RisqueOppPage.wScoreResid.getAttribute("value"));

		int score = Integer.parseInt(RisqueOppPage.wScoreResid.getAttribute("value"));

		int seuil = Integer.parseInt(RisqueOppPage.wSeuilResid.getAttribute("value"));
		logger.info(RisqueOppPage.wSeuilResid.getAttribute("value"));

		if (score < seuil) {
			Assert.assertTrue(RisqueOppPage.wResultatResid.isDisplayed());
		} else {
			Assert.assertTrue(RisqueOppPage.wResultatResidNo.isDisplayed());
		}

	}

}
