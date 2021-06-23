package com.qualiprobdd.e2etests.util;

import static org.testng.Assert.assertTrue;

import java.io.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;

import javax.swing.text.BadLocationException;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.qualiprobdd.e2etests.authentification.models.AuthentificationModel;

public class Common {

	protected static final Logger logger = LoggerFactory.getLogger(AbstractPage.class);

	/**
	 * 
	 * Scroll bottom of the Page
	 * 
	 */



	// add by mootez
	public static int delai(String d1, String d2) {

		if (d1 != "" && d2 == "") {
			return Integer.parseInt(d1);

		} else if (d1 != "" && d2 != "") {
			return Integer.parseInt(d1);

		} else {
			return Integer.parseInt(d2);
		}
	}
	public  static   String paragraphe(int taileMot,int NumberMot){


	String   para="";
    	  	 for(int i=0 ;i<NumberMot;i++){


		para=para+" "+RandomValue.randomString(taileMot);
	}
    	  	 System.err.println(" comm : "+para);
    	  	 return para;
}
	// add by mootez
	public static DayOfWeek jfr(String day) {

		String upDay = day.toUpperCase();

		switch (upDay) {
		case "MONDAY":
		case "LUNDI":
			return DayOfWeek.MONDAY;

		case "TUESDAY":
		case "MARDDI":
			return DayOfWeek.TUESDAY;
		case "WEDNESDAY":
		case "MERCREDI":
			return DayOfWeek.WEDNESDAY;
		case "THURSDAY":
		case "JEUDI":
			return DayOfWeek.THURSDAY;
		case "FRIDAY":
		case "VENDREDI":
			return DayOfWeek.FRIDAY;

		case "SATURDAY":
		case "SAMEDI":
			return DayOfWeek.SATURDAY;
		case "SUNDAY":
		case "DIMANCHE":
			return DayOfWeek.SUNDAY;
		default:
			return null;

		}

	}

// add  by   mootez
	public static String datejrf(LocalDate date, int days, String day1, String day2, String formatdt) {
		LocalDate result = date;

		int addedDays = 0;
		while (addedDays < days) {
			result = result.plusDays(1);
			if (!(result.getDayOfWeek() == jfr(day1) || result.getDayOfWeek() == jfr(day2))) {
				++addedDays;
			}
		}

		return result.format(DateTimeFormatter.ofPattern(formatdt));

	}

	public void scrollerPage() throws Throwable {

		for (int second = 0;; second++) {
			if (second >= 60) {
				break;
			}
			((JavascriptExecutor) AbstractPage.driver).executeScript("window.scrollBy(0,400)", "");

		}
	}

	/**
	 * Scroll the page up when x is positive and y is negative and down when both
	 * are positive.
	 * 

	 */
	public void scrollToTop() {
		JavascriptExecutor javascriptExecutor = (JavascriptExecutor) AbstractPage.driver;
		javascriptExecutor.executeScript("window.scrollTo(" + 0 + "," + 0 + ")", "");
	}

	// Go back
	public void goBack() throws Throwable {

		AbstractPage.driver.navigate().back();
	}

	// Refresh browser
	public void refreshBrowser() throws Throwable {

		AbstractPage.driver.navigate().refresh();
	}

	/**
	 * 
	 * Drag And Drop
	 * 
	 */
	public void DragAndDrop() {

		WebElement source = AbstractPage.driver.findElement(By.xpath(""));
		WebElement target = AbstractPage.driver.findElement(By.xpath(""));
		Actions actions = new Actions(AbstractPage.driver);
		actions.dragAndDrop(source, target).perform();

	}

	public void TabHandling() {

		String parentWindowsHandle = AbstractPage.driver.getWindowHandle();
		System.out.println("parentWindowsHandle" + parentWindowsHandle);

		for (String childTab : AbstractPage.driver.getWindowHandles()) {
			AbstractPage.driver.switchTo().window(childTab);
		}
	}

	/**
	 *

	 */
	public static void UploadFileNoInput(WebElement fileInput2) {
		((JavascriptExecutor) AbstractPage.driver)
				.executeScript("HTMLInputElement.prototype.click = function() {                     "
						+ "  if(this.type !== 'file') HTMLElement.prototype.click.call(this);  "
						+ "};                                                                  ");
		fileInput2.click();
		AbstractPage.driver.findElement(By.cssSelector("")).sendKeys("path to file");
	}

	/**
	 *
	 * handle alert pop-up
	 */

	public void handleAlertPopUp() {

		String mainPage = AbstractPage.driver.getWindowHandle();

		Alert alt = AbstractPage.driver.switchTo().alert(); // to move control to alert popup

		alt.accept(); // to click on ok.

		alt.dismiss(); // to click on cancel.

		// Then move the control back to main web page-

		AbstractPage.driver.switchTo().window(mainPage); // to switch back to main page.

	}

	/**
	 *
	 * right Click
	 */
	public void rightClick() {

		WebElement wE = AbstractPage.driver.findElement(By.xpath(""));
		Actions act = new Actions(AbstractPage.driver); // where driver is WebDriver type

		act.moveToElement(wE).perform();

		act.contextClick().perform();
	}

	/**
	 *
	 * Double Click
	 */

	public void doubleClick() {

		WebElement wE = AbstractPage.driver.findElement(By.xpath(""));
		Actions act = new Actions(AbstractPage.driver);

		act.doubleClick(wE);
	}

	/**
	 *
	 * Calcul Taux
	 */

	/**
	 *
	 * Vérifier si une information existe dans une fichier RTF
	 * 
	 * @throws BadLocationException
	 * @throws IOException 
	 */
	public static Boolean ExisteWord(String path, String info) throws BadLocationException, IOException {
		Boolean Existe = false;

		String fileData;
		try {
			fileData = RTFUtil.ReadRTFFile(path);
			if (fileData.contains(info)) {
				Existe = true;
		
			}
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}
		return Existe;
	}
	public  static  int  nbExiste(String path, String word) throws IOException {


		// int   nbw=Common.nbExiste(path,"Champ Audit Auto");
		// System.out.println(" occurence  est  "+nbw);
		int count = 0;
		File file = new File(path);
		FileInputStream fileStream = new FileInputStream(file);
		InputStreamReader input = new InputStreamReader(fileStream);
		BufferedReader reader = new BufferedReader(input);
		while(reader.readLine() != null){
			String words= reader.readLine();
			//System.out.println("words = "+words);
			if(words.contains(word)){
				count++;
				String newword=words.substring(words.indexOf(word)+word.length(),words.length());
				if(newword.contains(word)){
					count++;

				}
			}

		}
	return count;

	}

	/**
	 *
	 * Générer nom du fichier
	 */

	public static String GenererNom(String context, String info, String extention) {
		String Nom = "";
		DateFormat dateFormat = new SimpleDateFormat("dd_MM_yyyy_HH_mm");
		Date date = new Date();
		String DateSystem = dateFormat.format(date);

		Nom = context + "_" + info + "_" + DateSystem + extention;

		return Nom;
	}

	/**
	 *
	 * Déterminer nombre des fichiers
	 */

	public static String[] NbrFils(String path) {

		File file = new File(path);
		String liste[] = file.list();
		if (liste != null) {
			return liste;
		} else {
			System.err.println("Nom de repertoire invalide");
			return null;
		}

	}




	public static void Changer_Compte(String username,WebDriver driver) throws Exception {

		String Path = "resources/testData/TestData.xlsx";

		ExcelUtils.setExcelFile(Path, "Input");
		int RowNum = ExcelUtils.GetLigneData(username);
		System.out.println("num ligne" + RowNum);
		AuthentificationModel.saisirLogin(RowNum, 2,driver);
		AuthentificationModel.saisirPW(RowNum, 3,driver);
		AuthentificationModel.clickOuvrirSession(driver);
		Thread.sleep(2000L);
	}

	/**
	 *
	 * Supprimer des fichiers
	 */

	public static void deleteFile(String path) {

		File file = new File(path);
		File[] liste = file.listFiles();

		if (liste != null) {
			for (int i = 0; i < liste.length; i++) {
			
				
				liste[i].delete();
				
			}
		} else {
			System.err.println("Nom de repertoire invalide");
		}

	}

	/**
	 *
	 * Renommer un fichier
	 */

	public static void RenameFile(File file, String Nom, String path) {
		String dest = path + "\\" + Nom;
		file.renameTo(new File(dest));
	}

	/**
	 *
	 * Déplacer un fichier
	 */

	public static void MoveFile(String From, String To) {

		File file = new File(From);
		File[] liste = file.listFiles();
		triFileDecroissant(liste);
		String dest = To + "\\" + liste[0].getName();
		liste[0].renameTo(new File(dest));

	}

	/**
	 *
	 * Tri un tableau (tri decroissant)
	 */

	public static void triBulleDecroissant(long tableau[]) {
		int longueur = tableau.length;
		long tampon = 0;
		boolean permut;

		do {

			permut = false;
			for (int i = 0; i < longueur - 1; i++) {

				if (tableau[i] < tableau[i + 1]) {

					tampon = tableau[i];
					tableau[i] = tableau[i + 1];
					tableau[i + 1] = tampon;
					permut = true;
				}
			}
		} while (permut);
	}

	/**
	 *
	 * Tri des fichiers (tri decroissant)
	 */
	public static void triFileDecroissant(File[] files) {

		// Arrays.sort(files, Comparator.comparingLong(File::lastModified).reversed());

		Comparator<File> FileComparator = Comparator.comparingLong(File::lastModified);

		Arrays.sort(files, FileComparator.reversed());

	}

	/**
	 *
	 * Renommer_Deplacer un fichier
	 */

	public static void RenomerDeplacer(String nom, String path, String pathContext) {
		File file = new File(path);
		File[] files = file.listFiles();
		try {
			// Tri les fichiers selon la date de modification
			Common.triFileDecroissant(files);

			// Renommer la fichier

			Common.RenameFile(files[1], nom, path);

			// Deplacer la fichier
			Common.MoveFile(path, pathContext);
		} catch (java.lang.ArrayIndexOutOfBoundsException e) {
			System.out.println(" file size");
		}
	}

	/**
	 * @throws BadLocationException
	 * @throws InterruptedException
	 *
	 *
	 */

/*	public static void F(WebDriver driver, String url, String code, String f1, String libelle, String libelledoc)
			throws BadLocationException, InterruptedException {

		driver.get(url);
		Thread.sleep(1000);
		driver.findElement(By.id(code)).sendKeys(f1);
		driver.findElement(By.id(libelle)).sendKeys(libelledoc);
		driver.findElement(By.id("ctl00_ContentPlaceHolder1_LinkButton11")).click();
		driver.findElement(By.id("IconImg_CrystalReportViewer1_toptoolbar_export")).click();
		Thread.sleep(500);

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
		} catch (FindFailed e) {
			e.printStackTrace();
		}

	}*/

	public static void remplir_filtre_by_id(WebDriver driver, String identifiant, String contenu)
			throws BadLocationException, InterruptedException, Throwable {
		WebElement element = null;
		// try {
		// element=driver.findElement(By.xpath(identifiant));
		// element.isDisplayed();
		System.out.println("elem " + identifiant);
		if (identifiant.contains("_xpath")) {
			try {
				element = driver.findElement(By.xpath(identifiant));
			} catch (NoSuchElementException e) {
				System.out.println("not  visible");
			}
		} else {
			try {
				element = driver.findElement(By.id(identifiant));
			} catch (NoSuchElementException e) {
				System.out.println("not  visible");
			}
		}

		if (identifiant.contains("selec_")) {
			try {
				Select select = new Select(element);
				select.selectByVisibleText(contenu);
			} catch (NoSuchElementException e) {
				System.out.println("not  visible");
			}

		} else if (identifiant.contains("btn_")) {

			element.click();
		} else if (identifiant.contains("btnS_")) {
			element.click();
		} else {
			if (contenu.contains("/")) {
				final Date dateFormat;
				String Sdate="";
  				Cookie cookie1 = driver.manage().getCookieNamed("lan");
  				
  				if(cookie1.getValue().equals("en-US")) {
  					dateFormat = new SimpleDateFormat("MM/dd/yyyy").parse(contenu);
  					Sdate =new SimpleDateFormat("MM/dd/yyyy").format(dateFormat);
  				}else {
  					dateFormat = new SimpleDateFormat("dd/MM/yyyy").parse(contenu);
  					 Sdate = new SimpleDateFormat("MM/dd/yyyy").format(dateFormat);
  				}
    		
				//String Sdate = dateFormat.format(dateFormat);
				System.out.println(Sdate);
				
				try {
					JavascriptExecutor jse = (JavascriptExecutor)driver;
					jse.executeScript("arguments[1].value = arguments[0];",Sdate,element);
					Thread.sleep(500);
									} catch (JavascriptException e) {

					System.out.println("is   null  element  ");

				}
    		  }
				
				
				

			/*	// System.out.println(identifiant + "je suis la");
				Date date1 = new SimpleDateFormat("dd/MM/yyyy").parse(contenu);
				String Sdate = new SimpleDateFormat("MM/dd/yyyy").format(date1);
				System.out.println(Sdate);
				try {
					element.sendKeys(Sdate);
				} catch (java.lang.NullPointerException e) {

					System.out.println("is   null  element  ");

				}*/
			 else {
				// System.out.println(identifiant + "je suis labas");
				try {
					element.sendKeys(contenu);
				} catch (java.lang.NullPointerException e) {

					System.out.println("is   null  element  ");

				}
			}
		}
		// }
		// catch (NoSuchElementException e) {
		// Common.Exporter_visibilité("le champ est invisible");}

	}

	/*
	 * Get the text content from a DOM-element found by given selector. Make sure
	 * the element you want to request the text from is interactable; otherwise you
	 * will get an empty string as return value. If the element is disabled or not
	 * visible and you still want to receive the text content use
	 * utilisateur=DemandeFormationPage.UtilisateurID.getAttribute("innerText");
	 */

	/**
	 * Wait Element to be visible
	 */
	public static void waitElement(WebDriver driver, By by) throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(by));
	}

	/**
	 * Exporter visibilité des champs
	 */

	public static void Exporter_visibilité(String arg1) {
		File f = new File("E:/qualipro/trunk/AutomatisationTQualiPro_prod231/resources/ExportVisibilité.txt");
		try {
			FileWriter fw = new FileWriter(f, true);
			fw.write(arg1 + "\n");
			fw.flush();
			fw.close();
		} catch (IOException e) {
			System.out.println("Erreur lors de l'écriture dans le fichier ExportVisibilité");
		}
	}

	public static void Exporter_numFiche(String arg1) {
		File f = new File("E:/qualipro/trunk/AutomatisationTQualiPro_prod231/resources/ExportNumDeFiche.txt");
		try {
			FileWriter fw = new FileWriter(f, true);
			fw.write(arg1 + "\n");
			fw.flush();
			fw.close();
		} catch (IOException e) {
			System.out.println("Erreur lors de l'écriture dans le fichier ExportVisibilité");
		}
	}

	public static void Exporter_Sommer(String sommer1, String somme2, String Agenda, Boolean etat) {
		File f = new File("E:/qualipro/trunk/AutomatisationTQualiPro_prod231/resources/SommerAgenda.txt");
		try {
			FileWriter fw = new FileWriter(f, true);
			fw.write(Agenda + " :" + "\n");

			fw.write(sommer1 + " :" + "\n");
			fw.write(somme2 + " :" + "\n");
			fw.write(etat + " :" + "\n");
			fw.write("------------------------------------------------------------------->" + "\n");

			fw.flush();
			fw.close();
		} catch (IOException e) {
			System.out.println("Erreur lors de l'écriture dans le fichier SommerAgenda");
		}
	}

	/**
	 * Exporter les champs A masquer
	 */
	public static void Exporter_champ_A_masquer(String arg1) {
		File f1 = new File("E:/qualipro/trunk/AutomatisationTQualiPro_prod231/resources/champAmasquer.txt");
		try {
			FileWriter fw1 = new FileWriter(f1, true);
			fw1.write(arg1 + "\n");
			fw1.flush();
			fw1.close();
		} catch (IOException e) {
			System.out.println("Erreur lors de l'écriture dans le fichier champAmasquer");
		}
	}

	/**
	 * Vérifier si l'attribut est présent
	 */
	public static boolean isAttributePresent(WebElement element, String attribute) {
		Boolean result = false;
		try {
			String value = element.getAttribute(attribute);
			if (value != null) {
				result = true;
			}
		} catch (Exception e) {
		}

		return result;
	}

	/**
	 * Renommer un fichier
	 */
	public static void RenommerFichier(String file1, String file2) throws Throwable {

		File ancien = new File(file1);
		File nouveau = new File(file2);
		if (nouveau.exists()) {
			nouveau.delete();
		}
		if (ancien.exists()) {
			// rename the file
			boolean result = ancien.renameTo(nouveau);
			// check if the rename operation is success
			if (result) {
				System.out.println("Operation Success");
			} else {
				System.out.println("Operation failed");
			}

		} else {
			System.out.println("File does not exist");
		}

		ancien.delete();

	}

	public static String RenommerFichier1(String name, String file1, String file2) throws Throwable {
		String path = "E:\\qualipro\\trunk\\AutomatisationTQualiPro_prod231\\resources\\Telechargement\\CrystalReportViewer1.rtf";
		String pathContext = "E:\\qualipro\\trunk\\AutomatisationTQualiPro_prod231\\resources\\apercu";

		// Générer un nom significatif pour le fichier téléchargé
		String nom = Common.GenererNom(name, "", ".rtf");
		System.out.println(nom);

		// Renommer et Deplacer la fichier
		String dest = file2 + "\\" + nom;

		File ancien = new File(file1);
		File nouveau = new File(dest);

		if (nouveau.exists()) {
			nouveau.delete();
		}

		if (ancien.exists()) {
			// rename the file
			boolean result = ancien.renameTo(nouveau);
			// check if the rename operation is success
			if (result) {
				System.out.println("Operation Success");
			} else {
				System.out.println("Operation failed");
			}

		} else {
			System.out.println("File does not exist");
		}

		ancien.delete();

		return dest;
	}

	/**
	 * Vérifier existance des données dans les reporting
	 */
	public static void Vérifier_données(String name, String num) throws Throwable {
		String path = "E:\\qualipro\\trunk\\AutomatisationTQualiPro_prod231\\resources\\Telechargement\\CrystalReportViewer1.rtf";
		String pathContext = "E:\\qualipro\\trunk\\AutomatisationTQualiPro_prod231\\resources\\apercu";
		String fileData = null;
		// Générer un nom significatif pour le fichier téléchargé
		String nom = Common.GenererNom(name, "", ".rtf");
		System.out.println(nom);
		// Renommer et Deplacer la fichier
		String dest = pathContext + "\\" + nom;
		// System.out.println(dest);
		Thread.sleep(2000);
		Common.RenommerFichier(path, dest);
		Thread.sleep(2000);
		System.out.println(
				"**************************************" + name + "************************************************");
		System.out.println(dest);
		System.out.println(num);
		System.out.println("Existe: " + ExisteWord(dest, num));
		// name=dest;
		 assertTrue(ExisteWord(dest, num));

	}

	/**
	 * Cette fonction permet d'accéder à un module indépendemment de l'xpath
	 * 

	 * @throws Exception
	 */


	public static void AccéderModule(int row, int SM, int SSM, WebDriver driver) throws Exception {
		String Path1 = "resources/testData/TestData.xlsx";
		ExcelUtils.setExcelFile(Path1, "ModuleVendu");
		String pos = ExcelUtils.getCellData(row, 2);
		int pos1 = Integer.parseInt(pos);
		if (SM == 0) {
			WebElement element = driver.findElement(By.xpath("//*[@id=\"cssmenu15\"]/div/div/ul/li[" + pos1 + "]/a"));
			JavascriptExecutor executor = (JavascriptExecutor) driver;
			executor.executeScript("arguments[0].click()", element);
			Thread.sleep(500);

		} else if (SSM == 0) {
			WebElement element = driver
					.findElement(By.xpath("//*[@id=\"cssmenu15\"]/div/div/ul/li[" + pos1 + "]/ul/li[" + SM + "]/a"));
			JavascriptExecutor executor = (JavascriptExecutor) driver;
			executor.executeScript("arguments[0].click()", element);
			Thread.sleep(500);
		} else {
			WebElement element = driver.findElement(By.xpath(
					"//*[@id=\"cssmenu15\"]/div/div/ul/li[" + pos1 + "]/ul/li[" + SM + "]/ul/li[" + SSM + "]/a"));
			JavascriptExecutor executor = (JavascriptExecutor) driver;
			executor.executeScript("arguments[0].click()", element);
			Thread.sleep(500);
		}
	

	}

}
