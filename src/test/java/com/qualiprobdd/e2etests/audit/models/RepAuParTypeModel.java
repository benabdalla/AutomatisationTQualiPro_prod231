package com.qualiprobdd.e2etests.audit.models;


import com.qualiprobdd.e2etests.audit.pages.ModuleAuditsPage;
import com.qualiprobdd.e2etests.audit.pages.RepAuParTypePage;
import com.qualiprobdd.e2etests.moduleAction.pages.FicheActionPage;
import com.qualiprobdd.e2etests.util.Common;
import com.qualiprobdd.e2etests.util.ExcelUtils;

import io.cucumber.java.en.When;
import org.joda.time.LocalDate;
import org.openqa.selenium.*;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;


public class RepAuParTypeModel {

    private static String Path = "resources/testData/TestData.xlsx";
    static HashMap<String, String> audit = new HashMap<String, String>();

    public static void consulter_reporting_Audit_par_type(WebDriver driver) throws InterruptedException {
        Thread.sleep(1000L);

        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();",
                FicheActionPage.wreporting.findElement(By.cssSelector("#menu_rep > div > div > ul > li > a > img")));
        JavascriptExecutor executor1 = (JavascriptExecutor) driver;
        executor1.executeScript("arguments[0].click();", FicheActionPage.wreporting.findElement(By.cssSelector("#menu_rep > div > div > ul > li > ul > li:nth-child(4) > a")));
        JavascriptExecutor executor2 = (JavascriptExecutor) driver;
        executor2.executeScript("arguments[0].click();", FicheActionPage.wreporting.findElement(By.cssSelector(" #menu_rep > div > div > ul > li > ul > li:nth-child(4) > ul > li:nth-child(7) > a")));
    }

    public static void saisir_Type_Audit(int arg1) throws Exception {

        ExcelUtils.setExcelFile(Path, "Audit");
        String value = ExcelUtils.getCellData(arg1, 5);
        Select select = new Select(RepAuParTypePage.wtypeAudit);
        select.selectByVisibleText(value);

    }


    public static void saisir_Champ_d_audit(int arg1) throws Exception {

        ExcelUtils.setExcelFile(Path, "Audit");
        String value = ExcelUtils.getCellData(arg1, 2);
        Select select = new Select(ModuleAuditsPage.typeAuditID);
        select.selectByVisibleText(value);

    }

    public static void clique_sur_rechercher_audit(WebDriver driver) throws InterruptedException {
        Thread.sleep(2000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", RepAuParTypePage.wrecherFilt);


    }

    public static void clique_sur_valider_rep(WebDriver driver) throws InterruptedException {
        JavascriptExecutor valid = (JavascriptExecutor) driver;
        valid.executeScript("arguments[0].click();", RepAuParTypePage.wbtnValide);
        Thread.sleep(1000);
    }

    public static void saisir_Site(WebDriver driver, int arg1) throws Exception {
        try {

            RepAuParTypePage.wsite.isDisplayed();
            Common.Exporter_visibilité("le site est visible");
            String text = driver.findElement(By.id("ctl00_ContentPlaceHolder1_lbsite2")).getText();
            if (text.indexOf('*') != -1) {
                Common.Exporter_visibilité("le site est obligatoire");
            } else {
                Common.Exporter_visibilité("le site n'est pas obligatoire");

            }
            Select select = new Select(RepAuParTypePage.wsite);
            ExcelUtils.setExcelFile(Path, "Audit");
            String value = ExcelUtils.getCellData(arg1, 0);
            select.selectByVisibleText(value);
        } catch (NoSuchElementException e) {
            Common.Exporter_visibilité("le site est invisible");
        }

    }


    public static void date_prévue_entre(WebDriver driver) throws InterruptedException {
        final DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date dt = new Date();
        Calendar c = Calendar.getInstance();
        c.add(Calendar.DATE, 0);
        String Sdate = dateFormat.format(dt);
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("arguments[1].value = arguments[0];", Sdate, RepAuParTypePage.wdatePrévueEntre);
        Thread.sleep(1000L);
        String Sdate2 = dateFormat.format(dt);
        JavascriptExecutor jse2 = (JavascriptExecutor) driver;
        jse2.executeScript("arguments[1].value = arguments[0];", Sdate, RepAuParTypePage.wdateEt);
        Thread.sleep(1000L);


    }


    public static void saisir_Champ_d_audit_de_filter(int arg1) throws Exception {
        ExcelUtils.setExcelFile(Path, "Audit");
        String value = ExcelUtils.getCellData(arg1, 2);
        Select select = new Select(RepAuParTypePage.wfilterChampAudit);
        select.selectByVisibleText(value);
    }
    public static void saisir_type_d_audit_de_filter(int arg1) throws Exception {
        ExcelUtils.setExcelFile(Path, "Audit");
        String value = ExcelUtils.getCellData(arg1, 5);
        Select select = new Select(RepAuParTypePage.wfilterTypeAudit);
        select.selectByVisibleText(value);
    }

    public static void recuperer_stattistique(int row) throws Exception {
        String s1 = RepAuParTypePage.wtabDonAudit.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_GridView1p\"]/tbody/tr[11]/td")).findElement(By.id("ctl00_ContentPlaceHolder1_GridView1p_ctl13_lblenreg")).getText();
        String s2 = s1.substring(0, s1.lastIndexOf(" "));
        String s3 = s2.substring(s2.lastIndexOf(" ") + 1, s2.length());
        String s4;
        System.out.println("s3 =" + s3);
        if (audit.size() == 0) {
            if (s3.length() > 3) {
                s4 = s3.substring(0, 0) + " " + s3.substring(1, s3.length());
                audit.put("audit planifier ", s4);
                System.out.println("audit planifier " + audit.get("audit planifier"));
            }
        } else if (audit.size() == 1) {
            audit.put("audit a realise", s3);

        } else {
            audit.put("audit non encore realise", s3);
        }
    }


    public static void saisir_etat_d_audit_de_filter(String string) {
        Select select = new Select(RepAuParTypePage.wfilterEtat);
        select.selectByVisibleText(string);

    }


    public static void vérifier_Numero_Audit_est_reporté(int row) throws Exception {
        String path = "E:\\qualipro\\trunk\\AutomatisationTQualiPro_prod231\\resources\\Telechargement\\CrystalReportViewer1.rtf";

        //  for (int i = 23; i < 26; i++) {
        //ExcelUtils.setExcelFile(Path, "Audit");
        //  String num = ExcelUtils.getCellData1(row, i);
        // System.out.println(" num   d'audit = " + num);
        Thread.sleep(800);
        Iterator<Map.Entry<String, String>> itr = audit.entrySet().iterator();

        while (itr.hasNext()) {
            Map.Entry<String, String> entry = itr.next();
            System.out.println("Key = " + entry.getKey() +
                    ", Value = " + entry.getValue());
            Assert.assertTrue(Common.ExisteWord(path, entry.getValue()));
        }


    }

    public static void consulter_reporting_de_Taux_De_Charges_Par_Auditeur(WebDriver driver) throws InterruptedException {
        Thread.sleep(1000L);

        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();",
                FicheActionPage.wreporting.findElement(By.cssSelector("#menu_rep > div > div > ul > li > a > img")));
        JavascriptExecutor executor1 = (JavascriptExecutor) driver;
        executor1.executeScript("arguments[0].click();", FicheActionPage.wreporting.findElement(By.cssSelector("#menu_rep > div > div > ul > li > ul > li:nth-child(4) > a")));
        JavascriptExecutor executor2 = (JavascriptExecutor) driver;
        executor2.executeScript("arguments[0].click();", FicheActionPage.wreporting.findElement(By.cssSelector(" #menu_rep > div > div > ul > li > ul > li:nth-child(4) > ul > li:nth-child(6) > a")));


    }


    public static void saisir_Type_Audit_de_taux(int  arg1) throws Exception {
        ExcelUtils.setExcelFile(Path, "Audit");
        String value = ExcelUtils.getCellData(arg1, 5);
        Select select = new Select(RepAuParTypePage.wtypeAuditTaux);

        select.selectByVisibleText(value);


    }
public  static  void clique_sur_valider_rep_taux(WebDriver driver) throws InterruptedException {
    JavascriptExecutor executor = (JavascriptExecutor) driver;
    executor.executeScript("arguments[0].click();",RepAuParTypePage.wbtnvalidTaux);
    Thread.sleep(1000);
}

    public static void vérifier_est_reporté_de_taux(int row) throws Exception {
        String path = "E:\\qualipro\\trunk\\AutomatisationTQualiPro_prod231\\resources\\Telechargement\\CrystalReportViewer1.rtf";
        ExcelUtils.setExcelFile(Path, "Audit");
          String type= ExcelUtils.getCellData1(row,5);
        ExcelUtils.setExcelFile(Path, "Audit");
        String Num= ExcelUtils.getCellData1(row,15);
        Assert.assertTrue(Common.ExisteWord(path,type));
        Assert.assertTrue(Common.ExisteWord(path,type));
        for (int i = 27; i < 26; i++) {
            ExcelUtils.setExcelFile(Path, "Audit");
             String num = ExcelUtils.getCellData1(row, i);
            System.out.println(" num   d'audit = " + num);
        Assert.assertTrue(Common.ExisteWord(path,num));
        } }

    public static  void consulter_reporting_de_Programme_d_Audit(WebDriver driver) throws InterruptedException {
        Thread.sleep(1000L);

        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();",
                FicheActionPage.wreporting.findElement(By.cssSelector("#menu_rep > div > div > ul > li > a > img")));
        JavascriptExecutor executor1 = (JavascriptExecutor) driver;
        executor1.executeScript("arguments[0].click();", FicheActionPage.wreporting.findElement(By.cssSelector("#menu_rep > div > div > ul > li > ul > li:nth-child(4) > a")));
        JavascriptExecutor executor2 = (JavascriptExecutor) driver;
        executor2.executeScript("arguments[0].click();", FicheActionPage.wreporting.findElement(By.cssSelector(" #menu_rep > div > div > ul > li > ul > li:nth-child(4) > ul > li:nth-child(5) > a")));


    }

    public static void saisir_Type_de_programme_d_audit(int  arg1) throws Exception {
        ExcelUtils.setExcelFile(Path, "Audit");
        String value = ExcelUtils.getCellData(arg1, 5);
        Select select = new Select(RepAuParTypePage.wtypAuditProgrammAnnu);
        select.selectByVisibleText(value);

    }

    public static  void saisir_Champ_de_programme_d_audit(int  arg1) throws Exception {
        ExcelUtils.setExcelFile(Path, "Audit");
        String value = ExcelUtils.getCellData(arg1, 2);
        Select select = new Select(RepAuParTypePage.wchampAuditProgrammAnnu);
        select.selectByVisibleText(value);
    }


    public static  void date_prévue_entre_et_programme_d_audit(WebDriver driver) throws InterruptedException {

        final DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date dt = new Date();
        Calendar c = Calendar.getInstance();
        c.add(Calendar.DATE, 0);
        String Sdate = dateFormat.format(dt);
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("arguments[1].value = arguments[0];", Sdate, RepAuParTypePage.wdateProgAnnu);
        Thread.sleep(1000L);
        String Sdate2 = dateFormat.format(dt);
        JavascriptExecutor jse2 = (JavascriptExecutor) driver;
        jse2.executeScript("arguments[1].value = arguments[0];", Sdate, RepAuParTypePage.wdataetAnnu);
        Thread.sleep(1000L);
    }

    public static void vérifier_est_reporté_de_programme_d_audit(int  row) throws Exception {

        String path = "E:\\qualipro\\trunk\\AutomatisationTQualiPro_prod231\\resources\\Telechargement\\CrystalReportViewer1.rtf";
        ExcelUtils.setExcelFile(Path, "Audit");
        String champ= ExcelUtils.getCellData1(row,2);
        ExcelUtils.setExcelFile(Path, "Audit");
        Assert.assertTrue(2==Common.nbExiste(path,champ));
        Assert.assertTrue(Common.ExisteWord(path,"AUTO1"));
        Assert.assertTrue(Common.ExisteWord(path,"1"));
        String etat= ExcelUtils.getCellData1(row,27);
        Assert.assertTrue(Common.ExisteWord(path,champ));
        Assert.assertTrue(Common.ExisteWord(path,etat));
        LocalDate date =new LocalDate();
        int year=date.getYear();
      int day =date.getDayOfMonth();
        Assert.assertTrue(Common.ExisteWord(path,String.valueOf(day)));
        Assert.assertTrue(Common.ExisteWord(path,String.valueOf(year)));



}}
