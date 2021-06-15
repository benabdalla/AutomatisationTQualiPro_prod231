package com.qualiprobdd.e2etests.Documentation.models;


import static org.testng.Assert.assertEquals;

import java.awt.*;
import java.sql.Driver;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.List;
import java.util.NoSuchElementException;

import com.qualiprobdd.e2etests.audit.pages.RepAuParTypePage;
import org.openqa.selenium.*;
import org.openqa.selenium.Point;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qualiprobdd.e2etests.Documentation.pages.DocumentationPage;
import com.qualiprobdd.e2etests.Fournisseur.pages.EvalFourPage;
import com.qualiprobdd.e2etests.PNC.pages.ModulePNCPage;
import com.qualiprobdd.e2etests.indicateur.pages.IndicateurPage;
import com.qualiprobdd.e2etests.util.Common;
import com.qualiprobdd.e2etests.util.ExcelUtils;
import com.qualiprobdd.e2etests.util.RandomValue;

public class DocumentationModele {
    private static int i;
    public static String dateEnvoi;
    static Date date;
    private static String Path = "resources/testData/TestData.xlsx";

    public static void cliqueBoiteDeDialogue(WebDriver driver) throws Throwable {
        Thread.sleep(1000);
        JavascriptExecutor jesExecutor=(JavascriptExecutor)driver;
        jesExecutor.executeScript("arguments[0].click()", DocumentationPage.menuID);
       // DocumentationPage.menuID.click();
        Thread.sleep(200);
        Common.AccéderModule(1, 0, 0, driver);
        Common.AccéderModule(1, 2, 0, driver);
    }

    public static void cliqueRedacteurSuperviseur(WebDriver driver) throws InterruptedException {
        Thread.sleep(200);
JavascriptExecutor jse =(JavascriptExecutor)driver;
jse.executeScript("arguments[0].click()",DocumentationPage.redacteurSuperviseurID);
       //  DocumentationPage.redacteurSuperviseurID.click();
    }

    public static void choixTypeDocument(int arg1) throws Exception {
        i = arg1;
        ExcelUtils.setExcelFile(Path, "Documentation");
        Thread.sleep(1000);
        Select select = new Select(DocumentationPage.typeDocumentID);
        Thread.sleep(1000);
        select.selectByVisibleText(ExcelUtils.getCellData(i, 0));
    }
    public static void saisirObjet() throws Exception {
        ExcelUtils.setExcelFile(Path, "Documentation");
        Thread.sleep(1000);
        DocumentationPage.objetID.sendKeys(ExcelUtils.getCellData(i, 1));
    }

    public static void choixFichier(WebDriver driver) throws Exception {
        Thread.sleep(1000);
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        //executor.executeScript("arguments[0].click()", DocumentationPage.btnChoisirFichierID);
        DocumentationPage.btnChoisirFichierID.click();
        System.out.println("===>  PIECE  JOINTE");

        Thread.sleep(1000);
        Runtime.getRuntime().exec("E:\\qualipro\\trunk\\AutomatisationTQualiPro_prod231\\resources\\Scripts\\joindreFichier.exe");
        Thread.sleep(1000);

    }

    public static void saisirMessage() throws Exception {
        ExcelUtils.setExcelFile(Path, "Documentation");
        DocumentationPage.messageID.sendKeys(ExcelUtils.getCellData(i, 2));
    }

    public static void cliqueEnvoiSuperviseur() {

        DocumentationPage.envoiSuperviseurID.click();
        date = new Date();
    }

    //added by rahma
    public static void cliqueBoiteEnvoi(WebDriver driver) throws InterruptedException {
        Thread.sleep(1000);

        WebElement BoiteEnvoi = driver.findElement(By.id("ctl00_ContentPlaceHolder1_Label1"));
        BoiteEnvoi.click();
        Thread.sleep(1000);
    }

    public static void VerifierAjoutDansBoiteEnvoi(WebDriver driver) throws Throwable {

        Cookie cookie1 = driver.manage().getCookieNamed("lan");
        DateFormat dateFormat;
        if (cookie1.getValue().equals("en-US")) {
            dateFormat = new SimpleDateFormat("M/d/yyyy h:mm");
        } else {
            dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        }
       // SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");

        dateFormat.setTimeZone(TimeZone.getTimeZone("GMT+1"));

        String DateSystem = null;
        try {
            DateSystem = dateFormat.format(new Date());
            System.out.println("===>"+DateSystem);

        } catch (Exception e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }

        System.out.println("Date system est: " + DateSystem);
        Thread.sleep(1000);
        DocumentationPage.RechBoiteEnvoiID.sendKeys(DateSystem);

        WebDriverWait wait = new WebDriverWait(driver, 60);
        //wait.until(ExpectedConditions.visibilityOf(DocumentationPage.boiteEnvoiID));

        Actions action = new Actions(driver);
        action.moveToElement(DocumentationPage.boiteEnvoiID).perform();
        //wait.until(ExpectedConditions.visibilityOf(DocumentationPage.boiteEnvoiID.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_GridView_envoi\"]/tbody/tr[1]/td[4]"))));
        dateEnvoi = DocumentationPage.boiteEnvoiID.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_GridView_envoi\"]/tbody/tr[1]/td[4]")).getText();
        //Cookie cookie1 = driver.manage().getCookieNamed("lan");
        SimpleDateFormat formatter;
        if (cookie1.getValue().equals("en-US")) {
            formatter = new SimpleDateFormat("MM/dd/yyyy HH:mm");
        } else {
            formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        }
        Date date1 = formatter.parse(dateEnvoi);
        dateEnvoi = formatter.format(date1);
        ExcelUtils.setExcelFile(Path, "Documentation");
        ExcelUtils.setCellData1(dateEnvoi, i, 3, Path);
        System.out.println("Date est: " + dateEnvoi);
        assertEquals(DateSystem, dateEnvoi);
    }

    public static void cliqueAgendaDocument(WebDriver driver) throws Throwable {
        Thread.sleep(4000);
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click()", DocumentationPage.agendaDocumentID);
        Thread.sleep(1000);
    }

    public static void cliqueCompteurBoiteDialogue() {

        DocumentationPage.compteurBoiteDialogueID.click();
    }

    public static void cliqueConsulterMessage(WebDriver driver, int ligne) throws Throwable {
        ExcelUtils.setExcelFile(Path, "Documentation");
        driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_GridView_Rec_filter\"]/label/input")).sendKeys(ExcelUtils.getCellData(ligne, 3));
        Thread.sleep(500);
        driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_GridView_Rec\"]/tbody/tr/td[2]")).findElement(By.tagName("a")).click();
    }
    public static void cliqueConsulterMessage(WebDriver driver) throws Throwable {
        ExcelUtils.setExcelFile(Path, "Documentation");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_GridView_Rec_filter\"]/label/input")).sendKeys(ExcelUtils.getCellData(i, 3));
        Thread.sleep(500);
        driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_GridView_Rec\"]/tbody/tr/td[2]")).findElement(By.tagName("a")).click();
    }


    public static String getValeurCompteur() {
        System.out.println(DocumentationPage.compteurDocumentID.getText());

        return DocumentationPage.compteurDocumentID.getText();


    }

    public static void cliqueDocumentBoiteDialogue() {

        DocumentationPage.documentBoiteDialogueID.click();
    }

    public static void cliqueFichierJoint(WebDriver driver) throws Throwable {
        //Actions action = new Actions(driver);
        //action.moveToElement(DocumentationPage.fichierID).perform();
        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("arguments [0] .scrollIntoView ();", DocumentationPage.fichierID);
        Thread.sleep(1000);

        //DocumentationPage.fichierID.click();
        JavascriptExecutor js2 = (JavascriptExecutor) driver;
        js2.executeScript("arguments [0] .scrollIntoView ();", DocumentationPage.fichierID);
        Thread.sleep(1000);
    }

    public static void cliqueCreeDocument(WebDriver driver) throws InterruptedException {
        Thread.sleep(1000);
        JavascriptExecutor js2 = (JavascriptExecutor) driver;
        js2.executeScript("arguments [0] .scrollIntoView ();", DocumentationPage.fichierID);
        System.err.println("click 1   --->");
        try{
            DocumentationPage.creeDocumentID.click();
            System.err.println("click 2   --->");

        }catch (NoSuchElementException  exp){
            System.err.println(" déja  cliquer");
        }

    }

    public static String getType() throws Throwable {
        ExcelUtils.setExcelFile(Path, "Documentation");
        return (ExcelUtils.getCellData(i, 0));

    }

    public static void saisirSite() throws InterruptedException {
        Thread.sleep(1000);

        Select select = new Select(DocumentationPage.siteID);
        select.selectByValue("17");
    }

    public static void saisirProcessus() throws InterruptedException {
        Thread.sleep(1000);

        Select select = new Select(DocumentationPage.processusID);
        select.selectByValue("8");
    }

    public static void saisirMotCle() throws InterruptedException {
Thread.sleep(1000);
        DocumentationPage.motCleD.sendKeys("Test AUTO");
    }

    public static void cliqueValider(WebDriver driver) throws Throwable {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", DocumentationPage.validerID);
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click()", DocumentationPage.validerID);
        //DocumentationPage.validerID.click();
        Thread.sleep(500);
        String CodeDocument = DocumentationPage.codeDocumentsEncoursID.getAttribute("value");
        ExcelUtils.setExcelFile(Path, "Documentation");
        ExcelUtils.setCellData1(CodeDocument, i, 4, Path);
    }

    public static void cliqueValiderBas(WebDriver driver) throws Throwable {

        Thread.sleep(2000);
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click()", DocumentationPage.validerBasID);
        //DocumentationPage.validerBasID.click();
        Thread.sleep(2000);

    }

    public static void cliqueRedacteurBas(WebDriver driver) throws InterruptedException {
        Thread.sleep(3000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", DocumentationPage.redacteurBasD);
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click()", DocumentationPage.redacteurBasD);
        //DocumentationPage.redacteurBasD.click();
    }

    public static void cliqueAgendaRedacteur() {


        DocumentationPage.agendaRedacteurID.click();
    }

    public static void saisirCodeDocument() throws Throwable {
        ExcelUtils.setExcelFile(Path, "Documentation");
        Thread.sleep(1000);

        DocumentationPage.codeDocumentID.clear();
        Thread.sleep(1000);

        DocumentationPage.codeDocumentID.sendKeys(ExcelUtils.getCellData(i, 4));
        Thread.sleep(1000);
    }

    public static void saisirCodeDocumentEnCours() {
        DocumentationPage.codeDocumentsEncoursID.sendKeys("Doc_Test_" + RandomValue.randomInt(1000));
    }

    public static void cliqueVisualiserDocument(WebDriver driver) throws InterruptedException, AWTException {

        DocumentationPage.visualiserDocumentID.click();
        Thread.sleep(200);
        //
       /* Point coordinates = driver.findElement(By.id("toolbar")).getLocation();
        Robot robot = new Robot();
        robot.mouseMove(coordinates.getX(),coordinates.getY());
        DocumentationPage.wDocPdf.findElement(By.xpath("//*[@id=\"icon\"]/iron-icon")).click();
        Thread.sleep(200);*/

      //  driver.navigate().back();

    }

    public static void cliqueVerificateur() {

        DocumentationPage.verificateurID.click();
    }

    public static void cliqueAgendaVerifiacteur() {

        DocumentationPage.agendaVerificteurID.click();
    }

    public static void cliqueApprobateurBleu(WebDriver driver) throws InterruptedException {
       /* final DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date dt = new Date();
        Calendar c = Calendar.getInstance();
        c.add(Calendar.DATE, 0);
        String Sdate = dateFormat.format(dt);
        JavascriptExecutor jse = (JavascriptExecutor) driver;
      try{  jse.executeScript("arguments[1].value = arguments[0];", Sdate,driver.findElement(By.id(" ctl00_ContentPlaceHolder1_tb_date_applic")));
        Thread.sleep(1000L);}catch (NoSuchElementException )*/

        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click()", DocumentationPage.approbateurBleuID);

    }

    public static void cliqueAgendaApprobateur() {

        DocumentationPage.agendApprobateurID.click();
    }

    public static void cliqueDiffusion(WebDriver driver) throws InterruptedException {



        DocumentationPage.diffusionID.click();
    }

    public static void cliqueEnCours() throws InterruptedException {
        Thread.sleep(1000);
        DocumentationPage.enCoursId.click();
        Thread.sleep(1000);
    }

    public static void cliqueAConsulter() {

        DocumentationPage.aConsulterId.click();
    }

    public static void cliqueVisualiser(WebDriver driver) {


        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click()", DocumentationPage.visualiserBleuID);
    }

    public static void cliquejaiConsulte(WebDriver driver) throws InterruptedException {

        Thread.sleep(2000);
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click()", DocumentationPage.jaiConsulteID);
        //	DocumentationPage.jaiConsulteID.sendKeys(Keys.ENTER);
        Thread.sleep(2000);

    }

    public static void cliqueIconeDocumentsInternes(WebDriver driver) {

        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click()", DocumentationPage.iconeDocumentsInternesID);

    }

    public static void saisirCodeDocumentsInternes(WebDriver driver) throws Throwable {
        ExcelUtils.setExcelFile(Path, "Documentation");
        Thread.sleep(500);
        //	DocumentationPage.codeDocumentsInternesID.sendKeys(ExcelUtils.getCellData(i, 4));
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("arguments[1].value = arguments[0];", ExcelUtils.getCellData(i, 4), DocumentationPage.codeDocumentsInternesID);

    }

    public static void saisirCodeDocumentsInternes2(String arg1) throws Throwable {
        Thread.sleep(500);
        DocumentationPage.codeDocumentsInternesID.sendKeys(arg1);
    }

    public static void cliqueRechercheDocumentsInternes(WebDriver driver) throws InterruptedException {

        Thread.sleep(1000);
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click()", DocumentationPage.rechercheDocumentsInternesID);
    }

    public static void choisirDocumentsInternes(WebDriver driver) throws InterruptedException {
        Thread.sleep(1000);
     //   DocumentationPage.choixDocumentsInternesID.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_GridView1\"]/tbody/tr/td[2]")).findElement(By.tagName("a")).click();
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click()",DocumentationPage.choixDocumentsInternesID.findElement(By.cssSelector("#ctl00_ContentPlaceHolder1_GridView1_ctl02_LinkButton1 > font")));
    }//*[@id="ctl00_ContentPlaceHolder1_GridView1"]/tbody/tr[1]/td[2]



    public static void vérifier_taux() {
        String taux = DocumentationPage.TauxConsID.getText();
        String nbre = DocumentationPage.NbreConsID.getText();
    }

    public static void vérifier_taux(WebDriver driver) throws Exception {
        //WebElement elm=driver.findElement(By.cssSelector("#gg2 > svg > text:nth-child(6) > tspan"));
        //WebElement elm2=driver.findElement(By.cssSelector("#gg2 > svg > text:nth-child(6) > tspan"));

        WebElement elm = driver.findElement(By.xpath("//*[starts-with(@id,'gg2')]/*[local-name() = 'svg']//*[local-name() = 'text'][2]"));

        Thread.sleep(1000);
        //System.out.println("element taux:::"+elm2.hashCode());
        //System.out.println("element taux:::"+elm2.getLocation());

        Thread.sleep(1000);

        //WebElement elm1=driver.findElement(By.cssSelector("#gg1 > svg > text:nth-child(6) > tspan"));
        //WebElement elm3=driver.findElement(By.cssSelector("#gg1 > svg > text:nth-child(6) > tspan"));
        WebElement elm2 = driver.findElement(By.xpath("//*[starts-with(@id,'gg2')]/*[local-name() = 'svg']//*[local-name() = 'text'][2]"));
        WebElement elm1 = driver.findElement(By.xpath("//*[starts-with(@id,'gg1')]/*[local-name() = 'svg']//*[local-name() = 'text'][2]"));
        WebElement elm3 = driver.findElement(By.xpath("//*[starts-with(@id,'gg1')]/*[local-name() = 'svg']//*[local-name() = 'text'][2]"));
        String taux = elm2.getText();

        // System.out.println("element nbr:::"+elm3.hashCode());
        //System.out.println("element nbr:::"+elm3.getLocation());
        String nbre = elm3.getText();
        System.out.println("element nombre:::" + nbre);

        List<WebElement> rows = DocumentationPage.GridAccID.findElements(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_GridView3\"]/thead/tr"));
        int nbre_per_accuse = rows.size();
        if (nbre.contains("1")) {
            System.out.println("nombre de consultation incrémenté");
        } else {
            System.out.println("nombre de consultation non modifié");
        }
        int taux_cal = (Integer.parseInt(nbre) / nbre_per_accuse) * 100;
        if (taux.contains(String.valueOf(taux_cal))) {
            System.out.println("taux de consultation correcte");
        } else {
            System.out.println("taux de consultation incorrecte");
        }
    }

    public static void cliqueCommentaire() throws InterruptedException {
        Thread.sleep(1000);
        DocumentationPage.commentaireID.click();
    }

    public static void ajouterCommentaire(WebDriver driver) throws InterruptedException {
        Thread.sleep(1000);
        JavascriptExecutor jes=(JavascriptExecutor)driver;
        jes.executeScript("arguments[0].click()",DocumentationPage.ajouiterCommentaireID);
      //  DocumentationPage.ajouiterCommentaireID.click();
    }

    public static void saisirMessageSuperviseur() throws InterruptedException {
        Thread.sleep(1000);
        DocumentationPage.messageSuperviseurID.sendKeys("Test auto"+RandomValue.randomString(8));
    }

    public static void cliqueEnvoyerSuperviseur(WebDriver driver) throws InterruptedException {
        Thread.sleep(1000);
        //DocumentationPage.envoyerSuperviseurID.click();
        JavascriptExecutor jes=(JavascriptExecutor)driver;
        jes.executeScript("arguments[0].click()",DocumentationPage.envoyerSuperviseurID);
    }

    public static void cliqueRechercheDocuments() throws InterruptedException {
        Thread.sleep(1000);
        DocumentationPage.rechercheDocumentsID.click();
        Thread.sleep(1000);
    }

    public static void saisirCodeDocumentsAConsulter() throws Throwable {
        ExcelUtils.setExcelFile(Path, "Documentation");
        Thread.sleep(2000);
        System.out.println(" code   doc  : " + ExcelUtils.getCellData(i, 4));
        DocumentationPage.codeDocumentsAConsulterID.sendKeys(ExcelUtils.getCellData1(i, 4));


    }
}