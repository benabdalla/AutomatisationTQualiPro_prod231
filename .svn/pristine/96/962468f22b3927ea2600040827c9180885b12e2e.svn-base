package com.qualiprobdd.e2etests.metrologie.model;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

import com.qualiprobdd.e2etests.ReclamationClient.Pages.ReclamationClientPage;
import cucumber.api.java.en.When;
import gherkin.lexer.Th;
import org.apache.tools.ant.taskdefs.Java;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.server.handler.SendKeys;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qualiprobdd.e2etests.PNC.pages.ModulePNCPage;
import com.qualiprobdd.e2etests.audit.pages.ModuleAuditsPage;
import com.qualiprobdd.e2etests.authentification.models.AuthentificationModel;
import com.qualiprobdd.e2etests.indicateur.pages.IndicateurPage;
import com.qualiprobdd.e2etests.metrologie.page.ModuleMetrologiePage;
import com.qualiprobdd.e2etests.util.Common;
import com.qualiprobdd.e2etests.util.ExcelUtils;
import com.qualiprobdd.e2etests.util.RandomValue;
import org.testng.Assert;

public class ModuleMetrologieModel {

    /* Public methods */

    private static String Path = "resources/testData/TestData.xlsx";
    public static List<String> informations = new ArrayList<String>();


    public static void clique_sur_ajouter_machine() {
        ModuleMetrologiePage.widAMachine.click();


    }

    public static void saisir_nom_de_machine(int row) throws Exception {
        String nomMachine = "machine " + RandomValue.randomString(10) + " " + RandomValue.randomString(6) + RandomValue.getRandomNumberInRange(0, 999);
        System.out.println(" nom  machine   est   " + nomMachine);
        ModuleMetrologiePage.widMachine.sendKeys(nomMachine);
        ExcelUtils.setExcelFile(Path, "Metrologie");
        ExcelUtils.setCellData1(nomMachine, row, 20, Path);
        ModuleMetrologiePage.wValideMachine.click();
        ModuleMetrologiePage.wretourm.click();
        ModuleMetrologiePage.wtext_machine.sendKeys(nomMachine);
        ModuleMetrologiePage.wfiltre.click();
        String nmM = ModuleMetrologiePage.wtabMachine.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_GridView1\"]/tbody/tr/td[2]")).getText();
        Assert.assertEquals(nmM, nomMachine);


    }


    public static void clique_sur_ajouter_etat_des_équipements() {
        ModuleMetrologiePage.wajoutEtaBtn.click();

    }

    public static void saisir_etat_des_équipement(int row) throws Exception {
        String nomMachine = "etat des_équipement " + RandomValue.randomString(10) + " " + RandomValue.randomString(9) + RandomValue.getRandomNumberInRange(0, 999);
        System.out.println(" nom  machine   est   " + nomMachine);
        ModuleMetrologiePage.wetatEquip.sendKeys(nomMachine);
        ExcelUtils.setExcelFile(Path, "Metrologie");
        ExcelUtils.setCellData1(nomMachine, row, 2, Path);
    }

    static ArrayList<String> l = new ArrayList<String>();

    public static void saisir_Prise_en_charge_au_niveau_de_l_agenda(WebDriver driver) {
        int valL = (int) (Math.random() * 2 + 1);
        System.out.println("selecet  number =  " + valL);
        Cookie cookie1 = driver.manage().getCookieNamed("lan");
        if (cookie1.getValue().equals("en-US")) {
            if (valL == 1) {
                l.add("Yes");
            } else {
                l.add("No");
            }

        } else {
            if (valL == 1) {
                l.add("OUI");
            } else {
                l.add("NON");
            }
        }


        Select prise = new Select(ModuleMetrologiePage.wListPrise);
        prise.selectByValue(String.valueOf(valL));


    }

    public static void saisir_Affiché_au_niveau_de_l_état_du_planning(int row, WebDriver driver) throws Exception {
        int valL = (int) (Math.random() * 2 + 1);
        System.out.println("selecet  number =  " + valL);
        Cookie cookie1 = driver.manage().getCookieNamed("lan");
        if (cookie1.getValue().equals("en-US")) {
            if (valL == 1) {
                l.add("Yes");
            } else {
                l.add("No");
            }

        } else {
            if (valL == 1) {
                l.add("OUI");
            } else {
                l.add("NON");
            }
        }

        Select prise = new Select(ModuleMetrologiePage.wlistAfficherAuniveau);
        prise.selectByValue(String.valueOf(valL));

        System.out.println("content liste  =  " + l);
        ModuleMetrologiePage.wValEtat.click();
        ModuleMetrologiePage.wretoure.click();
        ExcelUtils.setExcelFile(Path, "Metrologie");
        String st = ExcelUtils.getCellData1(row, 2);
        ModuleMetrologiePage.wRecheEta.sendKeys(st);
        ModuleMetrologiePage.wetaFilter.click();

        String etatEq = ModuleMetrologiePage.wtabetat.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_GridView1\"]/tbody/tr[1]/td[2]")).getText();

        String bol1 = ModuleMetrologiePage.wtabetat.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_GridView1\"]/tbody/tr[1]/td[3]")).getText();
        String bol2 = ModuleMetrologiePage.wtabetat.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_GridView1\"]/tbody/tr[1]/td[4]")).getText();
        Assert.assertEquals(etatEq, st);
        Assert.assertEquals(bol1, l.get(0));
        Assert.assertEquals(bol2, l.get(1));


    }


    public static void saisir_Type_intervention(int row) throws Exception {

        String typeInt ="type intervention " +RandomValue.randomString(10);
        System.out.println(" nom  machine   est   " + typeInt);
        //ModuleMetrologiePage.widMachine.sendKeys(typeInt);
        Thread.sleep(800);
        ExcelUtils.setExcelFile(Path, "Metrologie");
        ExcelUtils.setCellData1(typeInt, row, 21, Path);
        Thread.sleep(800);

        ModuleMetrologiePage.wtypeIn.sendKeys(typeInt);

    }


    public static void saisir_Prévention_d_alerte() {
        ModuleMetrologiePage.widjour.sendKeys("0");

    }


    public static void saisir_Responsable_type_intervention(int row, WebDriver driver) throws Exception {
        ExcelUtils.setExcelFile(Path, "Metrologie");
        String respo = ExcelUtils.getCellData1(row, 45);
        System.out.println(" responsable " + respo + " row " + row);
        ModuleMetrologiePage.wrespoTypeInter.sendKeys(respo);
        Thread.sleep(500);
        //	ModuleMetrologiePage.wtypeIn.sendKeys(respo);
        ModuleMetrologiePage.wvalideraddmachine.click();

        JavascriptExecutor js2 = (JavascriptExecutor) driver;
        js2.executeScript("arguments[0].click()", ReclamationClientPage.AjtPiId);
        Thread.sleep(500L);
        //ReclamationClientPage.AjtEmpId.click();

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click()", driver.findElement(By.id("ctl00_ContentPlaceHolder1_LinkButton_selectemp")));


        for (int i = 1; i <= 10; i++) {
            System.out.println(" i == " + i);


            Thread.sleep(100);
            //	ModuleMetrologiePage.wtabRech.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_GridView18_wrapper\"]/div[1]/div[2]/div/label/input")).sendKeys("zinouba");
            ModuleMetrologiePage.wGRidPerson.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_GridView18_wrapper\"]/div[2]/div/table/tbody/tr[" + i + "]/td[1]")).
                    findElement(By.tagName("input")).click();
            Thread.sleep(50);
        }
        ModuleMetrologiePage.wValiderPersonner.click();

        JavascriptExecutor js4 = (JavascriptExecutor) driver;
     //   js4.executeScript("arguments[0].click()", driver.findElement(By.id("ctl00_ContentPlaceHolder1_LinkButton_selectemp")));
        ModuleMetrologiePage.wtabRech.findElement(By.tagName("input")).sendKeys("MILA");
        ModuleMetrologiePage.wGRidPerson.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_GridView18_wrapper\"]/div[2]/div/table/tbody/tr[1]/td[1]")).
                findElement(By.tagName("input")).click();

        ModuleMetrologiePage.wValiderPersonner.click();
        Thread.sleep(1000);
        ModuleMetrologiePage.wgroupeTyp.click();
        for (int i = 1; i <= 10; i++) {
            System.out.println(" i == " + i);



            Thread.sleep(100);
            //	ModuleMetrologiePage.wtabRech.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_GridView18_wrapper\"]/div[1]/div[2]/div/label/input")).sendKeys("zinouba");
            ModuleMetrologiePage.wgroupTable.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_GridView_Groupe\"]/tbody/tr["+i+"]/td[1]")).
                    findElement(By.tagName("input")).click();
            Thread.sleep(50);
        }
        ModuleMetrologiePage.wgroupValid.click();
        ModuleMetrologiePage.wferme.click();

    }

    public static void verefier_Type_intervention(int row) throws Exception {

        ModuleMetrologiePage.wretourm.click();
        ModuleMetrologiePage.wrechTyIn.click();
        ExcelUtils.setExcelFile(Path, "Metrologie");
        String typ = ExcelUtils.getCellData1(row, 21);

        ModuleMetrologiePage.wrechTyIn.sendKeys(typ);
        ModuleMetrologiePage.wfiltre.click();
        String st1 = ModuleMetrologiePage.wtabTypIn.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_GridView1\"]/tbody/tr[1]/td[3]")).getText();
        String st2 = ModuleMetrologiePage.wtabTypIn.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_GridView1\"]/tbody/tr[1]/td[4]")).getText();
        String st3 = ModuleMetrologiePage.wtabTypIn.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_GridView1\"]/tbody/tr[1]/td[5]")).getText();
        Assert.assertEquals(st1, typ);
        ExcelUtils.setExcelFile(Path, "Metrologie");
        String resp = ExcelUtils.getCellData1(row, 45);
        Assert.assertEquals(st2, resp);

        Assert.assertEquals(st3, "0");

    }


    public static void cliquer_sur_ajouter_organiseme() {
ModuleMetrologiePage.wAjoutOrg.click();

    }


    public static void saisir_organiseme(int   row) throws Exception {
        String typeInt = "type intervention " + RandomValue.randomString(10) + " " + RandomValue.randomString(6) + RandomValue.getRandomNumberInRange(0, 999);
        System.out.println(" nom  organisme   est   " + typeInt);
        //ModuleMetrologiePage.widMachine.sendKeys(typeInt);
        ExcelUtils.setExcelFile(Path, "Metrologie");
        ExcelUtils.setCellData1(typeInt, row, 27, Path);
        ModuleMetrologiePage.worgV.sendKeys(typeInt);

        ModuleMetrologiePage.wvalideraddmachine.click();

        ModuleMetrologiePage.wretourm.click();
        ModuleMetrologiePage.wtextRechOrg.sendKeys(typeInt);
        ModuleMetrologiePage.wfiltre.click();
        String  st1 =ModuleMetrologiePage.wtabOrganis.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_GridView1_wrapper\"]/div[2]/div/table/tbody/tr[1]/td[3]")).getText();
        Assert.assertEquals(st1,typeInt);

    }


    public static void cliquer_sur_ajouter_Type_d_équipement() {
        ModuleMetrologiePage.wAjoutOrg.click();

    }

    public static void saisir_Type_d_équipement(int row) throws Exception {
        String typeInt = "type intervention " + RandomValue.randomString(10) + " " + RandomValue.randomString(6) + RandomValue.getRandomNumberInRange(0, 999);
        System.out.println(" nom  machine   est   " + typeInt);
        //ModuleMetrologiePage.widMachine.sendKeys(typeInt);
        ExcelUtils.setExcelFile(Path, "Metrologie");
        ExcelUtils.setCellData1(typeInt, row, 21, Path);
        ModuleMetrologiePage.wtypeIn.sendKeys(typeInt);
        ModuleMetrologiePage.wvalideraddmachine.click();

        ModuleMetrologiePage.wretourm.click();
        ModuleMetrologiePage.wfilterEq.sendKeys(typeInt);
        Thread.sleep(500);
        ModuleMetrologiePage.wfiltre.click();
        String st=ModuleMetrologiePage.wtabTypeEquip.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_GVListeType_wrapper\"]/div[2]/div/table/tbody/tr/td[3]")).findElement(By.tagName("span")).getText();
        Assert.assertEquals(st,typeInt);

    }


    public static void cliquer_sur_module_Métrologie(WebDriver driver) throws Throwable {
        Thread.sleep(1000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click()", ModuleMetrologiePage.wmenuID);
        //ModuleMetrologiePage.wmenuID.click();


        Thread.sleep(200);
        Common.AccéderModule(11, 0, 0, driver);

        Common.Exporter_visibilité("Nouvelle Fiche Metrologie");
        Common.Exporter_champ_A_masquer("Nouvelle Fiche Metrologie");


    }

    public static void cliquer_sur_ajouter_fiche() throws Throwable {
       Thread.sleep(800);
        ModuleMetrologiePage.wajouter.click();
        Thread.sleep(800);

    }


    public static void cliquer_sur_sous_module_équipement_de_mesure() throws Throwable {


    }


    public static void saisir_Code_équipement(int row) throws Throwable {
        String test = "test_Auto_" + RandomValue.randomString(10);
        ExcelUtils.setExcelFile(Path, "Metrologie");
        ModuleMetrologiePage.wequipmentcode.sendKeys(test);
        ExcelUtils.setCellData1(test, row, 0, Path);


    }

    public static void saisir_Désignation_équipement(int row) throws Throwable {
        String test = "test_AUTO";
        ModuleMetrologiePage.wdesignation.sendKeys(test);
        ExcelUtils.setExcelFile(Path, "Metrologie");
        ExcelUtils.setCellData1(test, row, 1, Path);


    }


    public static void saisir_Date_mise_en_service(WebDriver driver) throws Throwable {



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
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("arguments[1].value = arguments[0];",Sdate,ModuleMetrologiePage.wdate);
        Thread.sleep(500);

    }


    public static void choisir_Etat(WebDriver driver, int row) throws Throwable {
        ExcelUtils.setExcelFile(Path, "Metrologie");
        Select source = new Select(ModuleMetrologiePage.wetat);
        source.selectByVisibleText(ExcelUtils.getCellData1(row, 2));


    }


    public static void saisir_N_de_série(int row) throws Throwable {
        String test = "10";
        ModuleMetrologiePage.wserialnumber.sendKeys(test);
        ExcelUtils.setExcelFile(Path, "Metrologie");
        ExcelUtils.setCellData1(test, row, 3, Path);

    }


    public static void saisir_Précision_Résolution(int row) throws Throwable {
        String test = "Tes_AUTO";
        ModuleMetrologiePage.wpreciasion.sendKeys(test);
        ExcelUtils.setExcelFile(Path, "Metrologie");
        ExcelUtils.setCellData1(test, row, 4, Path);

    }


    public static void saisir_Etendue_de_mesure(int row) throws Throwable {
        String test = "Test_AUTO";
        ModuleMetrologiePage.wrange.sendKeys(test);
        ExcelUtils.setExcelFile(Path, "Metrologie");
        ExcelUtils.setCellData1(test, row, 5, Path);

    }


    public static void saisir_Ecart_maximal_toléré(int row) throws Throwable {
        String test = "30";
        ModuleMetrologiePage.wecartmax.sendKeys(test);
        ExcelUtils.setExcelFile(Path, "Metrologie");
        ExcelUtils.setCellData1(test, row, 6, Path);

    }


    public static void saisir_Consigne(int row) throws Throwable {
        String test = "Test_AUTO";
        ModuleMetrologiePage.wconsigne.sendKeys(test);
        ExcelUtils.setExcelFile(Path, "Metrologie");
        ExcelUtils.setCellData1(test, row, 7, Path);

    }


    public static void saisir_Consigne_Commentaire_type_équipement() throws Throwable {

    }


    public static void sélectionner_Fournisseur(int row,WebDriver driver) throws Throwable {
        try {
            ModuleMetrologiePage.wfournisseur.isDisplayed();
            ModuleMetrologiePage.wfournisseur.click();
            Thread.sleep(500);
            String test = "FRN_AUTO";
            //ModuleMetrologiePage.wfournisseurRecherche.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_GridView_disp_filter\"]/label/input")).sendKeys(test);
            ModuleMetrologiePage.wfournisseurRecherche.sendKeys(test);
            ExcelUtils.setExcelFile(Path, "Metrologie");
            ExcelUtils.setCellData1(test, row, 8, Path);
            ModuleMetrologiePage.wsearch.click();
            Thread.sleep(1000);
            JavascriptExecutor je =(JavascriptExecutor) driver;
            je.executeScript("arguments[0].click()",ModuleMetrologiePage.wfournisseurChoix.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_p_frs\"]/div/div/div/div[2]/table/tbody/tr[1]/td[1]")));
            Thread.sleep(500);
        } catch (NoSuchElementException e) {
            Common.Exporter_visibilité("le fournisseur est invisible");
        }

    }


    public static void choisir_Appareil_critique(int row) throws Throwable {
        ExcelUtils.setExcelFile(Path, "Metrologie");
        Select source = new Select(ModuleMetrologiePage.wappareilcritique);
       // source.selectByVisibleText(ExcelUtils.getCellData1(row, 9));
        source.selectByValue("1");

    }

    public static void choisir_Type_équipement(int row) throws Throwable {
        ExcelUtils.setExcelFile(Path, "Metrologie");
        Select source = new Select(ModuleMetrologiePage.wappareiltype);
       // source.selectByVisibleText(ExcelUtils.getCellData1(row, 10));
        source.selectByValue("1");
    }


    public static void cliquer_sur_Historique_des_affectations() throws Throwable {
	/*JavascriptExecutor executor =(JavascriptExecutor)driver;
	executor.executeScript("arguments[0].click()", ModuleMetrologiePage.whistorique);
	Thread.sleep(1000L);
	executor.executeScript("arguments[0].click()", ModuleMetrologiePage.whistoriqueajouter);
	Thread.sleep(1000L);*/
        ModuleMetrologiePage.whistorique.click();
        Thread.sleep(500);
        ModuleMetrologiePage.whistoriqueajouter.click();
        Thread.sleep(500);

    }

    public static void choisir_une_date_historique() throws Throwable {
        ModuleMetrologiePage.wcalendrier.click();
        Thread.sleep(1000);
        ModuleMetrologiePage.wdatem.click();

    }


    public static void choisir_un_site_historique(int row) throws Throwable {
        ExcelUtils.setExcelFile(Path, "Metrologie");
        Select source = new Select(ModuleMetrologiePage.wsite);
        source.selectByValue("15");
       // source.selectByVisibleText(ExcelUtils.getCellData1(row, 16));


    }


    public static void choisir_dotation_historique(int row) throws Throwable {
        ExcelUtils.setExcelFile(Path, "Metrologie");
        Select source = new Select(ModuleMetrologiePage.wdotation);
        source.selectByValue("2");

        //source.selectByVisibleText(ExcelUtils.getCellData1(row, 17));

    }


    public static void choisir_Emplacement_intervention_historique(int row) throws Throwable {
        ExcelUtils.setExcelFile(Path, "Metrologie");
        String test = "Test_Auto";
        ModuleMetrologiePage.wlocation.sendKeys(test);
        ExcelUtils.setCellData1(test, row, 18, Path);


    }

    public static void cliquer_sur_validerh() throws Throwable {
        ModuleMetrologiePage.wvaliderh.click();


    }

    public static void cliquer_sur_valider_historique() throws Throwable {
        ModuleMetrologiePage.wvaliderfinal.click();

    }

    public static void cliquer_sur_machine_list() throws Throwable {
        ModuleMetrologiePage.wmachinelist.click();

    }


    public static void cliquer_sur_link(WebDriver driver, int row) throws Throwable {
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click()", ModuleMetrologiePage.wlink);
        Thread.sleep(1000L);
        //ModuleMetrologiePage.wrecherchemachine.findElement(By.tagName("test")).click();
        //ModuleMetrologiePage.wrecherchemachine.findElement(By.tagName("span")).findElement(By.tagName("input")).click();
        WebElement btn = driver.findElement(By.cssSelector("#ctl00_ContentPlaceHolder1_GridViewmachine_filter > label > input"));

        ExcelUtils.setExcelFile(Path, "Metrologie");

        String test = ExcelUtils.getCellData1( row, 20);
        btn.sendKeys(test);

        executor.executeScript("arguments[0].click()", ModuleMetrologiePage.wchoixmachine.
                findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_GridViewmachine_wrapper\"]/div[2]/div/table/tbody/tr/td[1]")).findElement(By.tagName("input")));

        Thread.sleep(1000);
        ModuleMetrologiePage.wvalidermachine.click();


    }


    public static void cliquer_sur_add(int row) throws Throwable {
        Thread.sleep(1000L);
        ModuleMetrologiePage.wadd.click();
	/*JavascriptExecutor executor =(JavascriptExecutor)driver;
	executor.executeScript("arguments[0].click()", ModuleMetrologiePage.wadd);
	Thread.sleep(1000L);*/
        ModuleMetrologiePage.waddmachine.sendKeys("TEST");
        ModuleMetrologiePage.wvalideraddmachine.click();
        ModuleMetrologiePage.wadd.click();
        ExcelUtils.setExcelFile(Path, "Metrologie");
        String machine = "machine_Met_" + RandomValue.randomString(10);
        ModuleMetrologiePage.waddmachine.sendKeys(machine);

        ExcelUtils.setCellData1(machine, row, 20, Path);

        ModuleMetrologiePage.wvalideraddmachine.click();

    }


    public static void cliquer_sur_delete(WebDriver driver) throws Throwable {
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click()", ModuleMetrologiePage.wdelmachine);

        ModuleMetrologiePage.wdeletemachine.click();

    }

    public static void ajouter_liste_type_d_operation(WebDriver driver, int row) throws Throwable {
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click()", ModuleMetrologiePage.wtypeoperation);
        Thread.sleep(1000L);
        executor.executeScript("arguments[0].click()", ModuleMetrologiePage.wtypeoperationadd);
        Thread.sleep(1000L);
        ExcelUtils.setExcelFile(Path, "Metrologie");
        //executor.executeScript("arguments[0].click()", ModuleMetrologiePage.woperationtype);
        Select source = new Select(ModuleMetrologiePage.woperationtype);
        source.selectByVisibleText(ExcelUtils.getCellData1(row, 21));
        String test = "10";
        ModuleMetrologiePage.woperationfrequence.sendKeys(test);
        ExcelUtils.setCellData1(test, row, 23, Path);
        //ModuleMetrologiePage.woperationalerte.sendKeys("30");
        executor.executeScript("arguments[0].click()", ModuleMetrologiePage.woperationvalider);


    }

    public static void valider_fiche_operation(WebDriver driver) throws Throwable {
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click()", ModuleMetrologiePage.woperationvaliderfinal);

    }

    public static void ajouter_operation_report(int row, WebDriver driver) throws Throwable {
	/*ModuleMetrologiePage.woperationreport.click();
	Thread.sleep(1000);
	ModuleMetrologiePage.woperationajouter.click();
	Thread.sleep(1000);*/
        Thread.sleep(1000);
        String test = "Auto";
        //driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_GridView_disp\"]/tbody/tr/td[1]")).click();

        driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_nouv_inter\"]/div[2]/div/div[8]/div/span/label/span[1]")).click();
        //driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_GridView_disp\"]/tbody/tr/td[1]")).click();
        Thread.sleep(1000);
        Runtime.getRuntime().exec("E:\\qualipro\\trunk\\AutomatisationTQualiPro_prod231\\resources\\Scripts\\joindreFichier1.exe");
        Thread.sleep(1000);
        ModuleMetrologiePage.woperationlocation.sendKeys(test);
        ExcelUtils.setExcelFile(Path, "Metrologie");
        ExcelUtils.setCellData1(test, row, 25, Path);
        Select source = new Select(ModuleMetrologiePage.woperationreporttype);
        source.selectByVisibleText(ExcelUtils.getCellData1(row, 26));
        //source.selectByValue("34");
        Select sourc = new Select(ModuleMetrologiePage.woperationreportorganization);
        sourc.selectByVisibleText(ExcelUtils.getCellData1(row, 27));
        //sourc.selectByValue("31");
        String test1 = "test_Auto";
        ModuleMetrologiePage.woperationreportcomment.sendKeys(test1);
        ExcelUtils.setCellData1(test1, row, 28, Path);
        Select sourcee = new Select(ModuleMetrologiePage.woperationreportintervention);
        sourcee.selectByVisibleText(ExcelUtils.getCellData1(row, 29));
        //sourcee.selectByValue("1");
        String test2 = "Test_AUTO";
        String test3 = "Test__Auto";
        ModuleMetrologiePage.woperationreportdecision.sendKeys(test2);
        ExcelUtils.setCellData1(test2, row, 31, Path);
        ModuleMetrologiePage.woperationreportobservation.sendKeys(test3);
        ExcelUtils.setCellData1(test3, row, 32, Path);
        ModuleMetrologiePage.woperationreportvalider.click();

        //**************
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        //jse.executeScript("scroll(250, 0)");

        //executor.executeScript("arguments[0].click()", ModuleMetrologiePage.woperationvaliderfinal);
        //jse.executeScript("arguments[0].click()", ModuleMetrologiePage.wBTNAJT);
        //ModuleMetrologiePage.wBTNAJT.click();

        //driver.findElement(By.id("ctl00_ContentPlaceHolder1_LB_vald_ajtpiec")).click();
        //driver.findElement(By.xpath("//*[@id=\"myModalPJ\"]/div/div/div[1]/button")).click();

    }


    public static void rechecher_equipement(int row) throws Throwable {
       Thread.sleep(800);
        ExcelUtils.setExcelFile(Path, "Metrologie");
        ModuleMetrologiePage.wequipement_recherche.sendKeys(ExcelUtils.getCellData1(row, 0));
        ModuleMetrologiePage.wrechercheEquipment.click();

    }

    public static void vérifier_l_ajout_de_la_fiche(int row) throws Throwable {
        ExcelUtils.setExcelFile(Path, "Metrologie");
        String codeEqui = ModuleMetrologiePage.wtableEquipment.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_Panel22\"]/div/div/div/div[2]/table/tbody/tr[1]/td[2]")).getText();
        String statutequi = ModuleMetrologiePage.wtableEquipment.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_GridView1\"]/tbody/tr[1]/td[5]")).getText();
        String siteequi = ModuleMetrologiePage.wtableEquipment.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_GridView1\"]/tbody/tr[1]/td[6]")).getText();
        String locationequi = ModuleMetrologiePage.wtableEquipment.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_GridView1\"]/tbody/tr[1]/td[7]")).getTagName();
        String equitype = ModuleMetrologiePage.wtableEquipment.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_GridView1\"]/tbody/tr[1]/td[8]")).getTagName();


        //*[@id="ctl00_ContentPlaceHolder1_GridView1"]/tbody/tr[1]/td[7]
        String expectedcode = ExcelUtils.getCellData(row, 0);
        String expectedstatu = ExcelUtils.getCellData(row, 2);
        String expectedsite = ExcelUtils.getCellData(row, 16);
        String expectedlocation = ExcelUtils.getCellData(row, 18);
        String expectedtype = ExcelUtils.getCellData(row, 10);
	

	/*assertTrue(codeEqui.contains(expectedcode));
	assertTrue(statutequi.contains(expectedstatu));
	assertTrue(siteequi.contains(expectedsite));
	//assertTrue(locationequi.contains(expectedlocation));
	//assertTrue(equitype.contains(expectedtype));*/
        assertEquals(codeEqui, expectedcode);
        Common.Exporter_numFiche(" code   fiche  equipment   : "+codeEqui);
        assertEquals(statutequi, expectedstatu);
        //assertEquals(siteequi, expectedsite);
        //assertEquals(locationequi, expectedlocation);
        //assertEquals(equitype, expectedtype);

    }

    public static void consulter_agenda_metrologie(int row, WebDriver driver) throws Throwable {
        ModuleMetrologiePage.wmetrologieagenda.click();
        ModuleMetrologiePage.wmetrologieaequi.click();

    }


    public static void cliquer_sur_operation_report(int row, WebDriver driver) throws Throwable {
        System.out.println("ligne " + row);
        ExcelUtils.setExcelFile(Path, "Metrologie");
        String test = ExcelUtils.getCellData1(row, 0);
        System.out.println("code   equipement " + test);

        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("arguments[0].click()", ModuleMetrologiePage.wmetrologiearecherche.findElement(By.tagName("label")).findElement(By.tagName("input")));
        Thread.sleep(5000);
	/*JavascriptExecutor jse2 = (JavascriptExecutor)driver;
	jse2.executeScript("arguments[1].value = arguments[0];",test, ModuleMetrologiePage.wmetrologiearecherche.findElement(By.tagName("label")).findElement(By.tagName("input")));
	 ModuleMetrologiePage.wmetrologiearecherche.findElement(By.tagName("label")).findElement(By.tagName("input")).click();*/

        //ModuleMetrologiePage.wmetrologiearecherche.findElement(By.tagName("label")).findElement(By.tagName("input")).click();
        ModuleMetrologiePage.wmetrologiearecherche.findElement(By.tagName("label")).findElement(By.tagName("input")).sendKeys(test);

        //ModuleMetrologiePage.wmetrologiearechercheid.click();
        Thread.sleep(1000);
        WebElement elm = ModuleMetrologiePage.wtableAg.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_GridView_disp_wrapper\"]/div[2]/div/table/tbody/tr/td[1]"));
        elm.findElement(By.tagName("a")).click();
        Thread.sleep(1000);

    }


    public static void cliquer_sur_R_R(int row, WebDriver driver) throws Throwable {

        ModuleMetrologiePage.wmetrologieRR.click();
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click()", ModuleMetrologiePage.wmetrologieRRADD);
        String test = "3";
        ModuleMetrologiePage.wnombrepiece.sendKeys(test);
        ExcelUtils.setExcelFile(Path, "Metrologie");
        ExcelUtils.setCellData1(test, row, 37, Path);
        String test2 = "50";
        Thread.sleep(1000);
        ModuleMetrologiePage.wmesuredpiece.sendKeys(test2);
        ExcelUtils.setCellData1(test2, row, 34, Path);
        String test3 = "test_AUTO";
        ModuleMetrologiePage.wfolderref.sendKeys(test3);
        ExcelUtils.setCellData1(test3, row, 35, Path);
        String test4 = "test_AUTO";
        ModuleMetrologiePage.wcharacteristic.sendKeys(test4);
        ExcelUtils.setCellData1(test4, row, 36, Path);
        String test5 = "test_AUTO";
        ModuleMetrologiePage.wtolerance.sendKeys(test5);
        ExcelUtils.setCellData1(test5, row, 39, Path);
        String test6 = "test_AUTO";
        ModuleMetrologiePage.wbatch.sendKeys(test6);
        ExcelUtils.setCellData1(test6, row, 40, Path);
        ModuleMetrologiePage.wselect.click();
        //executor.executeScript("arguments[0].click()", ModuleMetrologiePage.wselect);
        String test7 = "sabrine bondka";
        ModuleMetrologiePage.wselectRecherche.sendKeys(test7);
        ModuleMetrologiePage.wbtnRecherche.click();
        ModuleMetrologiePage.woperateur.click();
        ExcelUtils.setCellData1(test7, row, 42, Path);
        ModuleMetrologiePage.wBTNVALIDER.click();
        ModuleMetrologiePage.wmesureop11.sendKeys("29");
        ModuleMetrologiePage.wmesureop22.sendKeys("27");
        ModuleMetrologiePage.wmesureop33.sendKeys("30");
        ModuleMetrologiePage.wBTNVALIDER.click();


    }

    public static void rechercher_le_code_de_la_fiche(int row, WebDriver driver) throws Throwable {
        ExcelUtils.setExcelFile(Path, "Metrologie");
        ModuleMetrologiePage.wrecherchfiche.sendKeys(ExcelUtils.getCellData1(row, 0));
        ModuleMetrologiePage.wrecherchbtn.click();
        driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_GridView1\"]/tbody/tr[1]/td[2]")).click();
        ModuleMetrologiePage.wbtnoverview.click();


    }


}