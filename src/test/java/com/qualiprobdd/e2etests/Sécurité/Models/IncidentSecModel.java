package com.qualiprobdd.e2etests.Sécurité.Models;

import static org.testng.Assert.assertTrue;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qualiprobdd.e2etests.Environnement.pages.IncidentPage;
import com.qualiprobdd.e2etests.Sécurité.Pages.IncidentSecPage;
import com.qualiprobdd.e2etests.util.Common;
import com.qualiprobdd.e2etests.util.ExcelUtils;
import com.qualiprobdd.e2etests.util.RandomValue;

public class IncidentSecModel {

    public static void Consulter_module_Securite(WebDriver driver) throws Throwable {
        Thread.sleep(1000);
        //IncidentSecPage.MenuId.click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click()", IncidentSecPage.MenuId);
        Thread.sleep(2000);
        Common.AccéderModule(16, 0, 0, driver);

    }


    public static void Consulter_Module_Incident_Securite(WebDriver driver) throws Throwable {
        Common.AccéderModule(16, 2, 0, driver);
    }

    public static void Consulter_Module_incidentsSec(WebDriver driver) throws Throwable {
        Common.AccéderModule(16, 2, 1, driver);

    }

    public static void ajouter_incidentSec() throws Throwable {
        IncidentSecPage.AjtIncId.click();
        Common.Exporter_visibilité("Nouvelle Fiche Incident Sécurité");
        Common.Exporter_champ_A_masquer("Nouvelle Fiche Incident Sécurité");
    }

    public static void désignation_Incident() throws Throwable {
        IncidentSecPage.DesigIncId.sendKeys("Incident AUTO " + RandomValue.randomString(10));
    }

    public static void Choisir_type_Incident(String type) throws Throwable {

        Select select = new Select(IncidentSecPage.TypIncId);
        select.selectByVisibleText(type);

    }

    public static void Choisir_Catégorie() throws Throwable {
        try {

            IncidentSecPage.CatIncId.isDisplayed();
            Common.Exporter_visibilité("catégorie est visible");
            Select select = new Select(IncidentSecPage.CatIncId);
            select.selectByVisibleText("Catégorie AUTO");
        } catch (NoSuchElementException e) {
            Common.Exporter_visibilité("catégorie est invisible");
        }
    }

    public static void Date_Incident(WebDriver driver) throws Throwable {
        final DateFormat dateFormat;
        Cookie cookie1 = driver.manage().getCookieNamed("lan");
        if (cookie1.getValue().equals("en-US")) {
            dateFormat = new SimpleDateFormat("MM/dd/yyyy");
        } else {
            dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        }
        Date dt = new Date();
        Calendar c = Calendar.getInstance();
        c.setTime(dt);
        c.add(Calendar.DATE, 0);
        dt = c.getTime();
        String Sdate = dateFormat.format(dt);
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("arguments[1].value = arguments[0];", Sdate, IncidentSecPage.DateIncId);
    }

    public static void Heure_Incident(WebDriver driver) throws Throwable {
        DateFormat format = new SimpleDateFormat("HH:mm");
        Date date1 = format.parse("10:00");
        String heure = format.format(date1);
        System.out.println(heure);
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("arguments[1].value = arguments[0];", heure, IncidentSecPage.HeureIncId);

    }

    public static void N_interne() throws Throwable {
        int num = RandomValue.randomInt(5);
        IncidentSecPage.NinterId.sendKeys(String.valueOf(num));
    }

    public static void Détecter_par() throws Throwable {
        IncidentSecPage.DeteIncId.sendKeys("AUTO");
    }

    public static void Selectionner_Semaine() throws Throwable {
        try {
            IncidentSecPage.SemaineIncId.isDisplayed();
            Common.Exporter_visibilité("semaine est visible");
            Select select = new Select(IncidentSecPage.SemaineIncId);
            select.selectByVisibleText("2");
        } catch (NoSuchElementException e) {
            Common.Exporter_visibilité("semaine est invisible");
        }
    }

    public static void nombre_jour() throws Throwable {
        int num = RandomValue.randomInt(5);
        IncidentSecPage.NbreJourIncId.sendKeys(String.valueOf(num));
    }

    public static void Choisir_site(String site, WebDriver driver) throws Throwable {
        try {
            IncidentSecPage.SiteIncId.isDisplayed();
            Common.Exporter_visibilité("site est visible");
            String text = driver.findElement(By.id("ctl00_ContentPlaceHolder1_Label9")).getText();
            if (text.indexOf('*') != -1) {
                Common.Exporter_visibilité("le site est obligatoire");
            } else {
                Common.Exporter_visibilité("le site n'est pas obligatoire");

            }
            Select select = new Select(IncidentSecPage.SiteIncId);
            select.selectByVisibleText(site);
        } catch (NoSuchElementException e) {
            Common.Exporter_visibilité("site est invisible");
        }

    }

    public static void Choisir_processus(String processus, WebDriver driver) throws Throwable {
        try {
            IncidentSecPage.ProcessIncId.isDisplayed();
            Common.Exporter_visibilité("processus est visible");
            String text = driver.findElement(By.id("ctl00_ContentPlaceHolder1_LblProcessus_")).getText();
            if (text.indexOf('*') != -1) {
                Common.Exporter_visibilité("le processus est obligatoire");
            } else {
                Common.Exporter_visibilité("le processus n'est pas obligatoire");
            }
            Select select = new Select(IncidentSecPage.ProcessIncId);
            select.selectByVisibleText(processus);

        } catch (NoSuchElementException e) {
            Common.Exporter_visibilité("processus est invisible");
        }
    }

    public static void Choisir_activité(WebDriver driver) throws Throwable {
        try {
            IncidentSecPage.ActIncId.isDisplayed();
            Common.Exporter_visibilité("l activité est visible");
            String text = driver.findElement(By.id("ctl00_ContentPlaceHolder1_LblDomaine_")).getText();
            if (text.indexOf('*') != -1) {
                Common.Exporter_visibilité("l activite est obligatoire");
            } else {
                Common.Exporter_visibilité("l activité n'est pas obligatoire");
            }
            Select select = new Select(IncidentSecPage.ActIncId);
            select.selectByVisibleText("ACTIVITE AUTO");

        } catch (NoSuchElementException e) {
            Common.Exporter_visibilité("l activite est invisible");
        }
    }

    public static void Choisir_direction(WebDriver driver) throws Throwable {
        try {
            IncidentSecPage.DirecIncId.isDisplayed();
            Common.Exporter_visibilité("direction est visible");
            String text = driver.findElement(By.id("ctl00_ContentPlaceHolder1_LabelDirPilot")).getText();
            if (text.indexOf('*') != -1) {
                Common.Exporter_visibilité("la direction est obligatoire");
            } else {
                Common.Exporter_visibilité("la direction n'est pas obligatoire");
            }
            Select select = new Select(IncidentSecPage.DirecIncId);
            select.selectByVisibleText("DIRECTION AUTO");

        } catch (NoSuchElementException e) {
            Common.Exporter_visibilité("la direction est invisible");
        }
    }

    public static void Choisir_service(WebDriver driver) throws Throwable {
        try {
            IncidentSecPage.ServIncId.isDisplayed();
            Common.Exporter_visibilité("service est visible");
            String text = driver.findElement(By.id("ctl00_ContentPlaceHolder1_LblService_")).getText();
            if (text.indexOf('*') != -1) {
                Common.Exporter_visibilité("le service est obligatoire");
            } else {
                Common.Exporter_visibilité("le service n'est pas obligatoire");
            }
            Select select = new Select(IncidentSecPage.ServIncId);
            select.selectByVisibleText("SERVICE AUTO");

        } catch (NoSuchElementException e) {
            Common.Exporter_visibilité("le service est invisible");
        }
    }

    public static void Choisir_secteur() throws Throwable {
        Select select = new Select(IncidentSecPage.SectIncId);
        select.selectByVisibleText("SECTEUR AUTO");
    }

    public static void poste_travail() throws Throwable {
        try {
            IncidentSecPage.PostIncId.isDisplayed();
            Common.Exporter_visibilité("la poste est visible");
            Select select = new Select(IncidentSecPage.PostIncId);
            select.selectByVisibleText("POSTE AUTO");

        } catch (NoSuchElementException e) {
            Common.Exporter_visibilité("la poste est invisible");
        }

    }

    public static void description_Incident() throws Throwable {
        IncidentSecPage.DescIncId.sendKeys("Description incident");
    }

    public static void _description_cause() throws Throwable {
        IncidentSecPage.DescCausId.sendKeys("description cause");
    }

    public static void Saisir_conséquences() throws Throwable {
        IncidentSecPage.DescConsId.sendKeys("Description conséquence");
    }

    public static void type_conséquence() throws Throwable {
        IncidentSecPage.RattTypConsId.click();
        Thread.sleep(500);
        IncidentSecPage.RechTypConsId.sendKeys("TYPE CONSEQUENCE AUTO");
        Thread.sleep(200);
        IncidentSecPage.GridTypConsId.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_GridView_TypeConseq_Rat\"]/tbody/tr/td[1]")).findElement(By.tagName("input")).click();
        IncidentSecPage.VldRattTypConsId.click();


    }

    public static void type_cause() throws Throwable {
        IncidentSecPage.RattTypCauseId.click();
        Thread.sleep(500);
        IncidentSecPage.RechTypCauseId.sendKeys("TYPE CAUSE AUTO");
        Thread.sleep(200);
        IncidentSecPage.GridTypCauseId.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_GridView_TypeCause_Rat\"]/tbody/tr/td[1]")).findElement(By.tagName("input")).click();
        IncidentSecPage.VldTypeCauseId.click();
    }

    public static void cause_typique() throws Throwable {
        try {
            IncidentSecPage.RattCauseTypId.isDisplayed();
            Common.Exporter_visibilité("cause typique est visible");
            IncidentSecPage.RattCauseTypId.click();
            Thread.sleep(500);
            IncidentSecPage.RechCauseTypId.sendKeys("test auto selenium");
            Thread.sleep(200);
            IncidentSecPage.GridCauseTypId.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_GridView_CauseTyp_R\"]/tbody/tr/td[1]")).findElement(By.tagName("input")).click();
            IncidentSecPage.VldCauseTypId.click();
        } catch (NoSuchElementException e) {
            Common.Exporter_visibilité("cause typique est invisible");
        }
    }

    public static void SITE_LIAISON() throws Throwable {
        try {
            IncidentSecPage.RattSiteLiaiId.isDisplayed();
            Common.Exporter_visibilité("site de lésion est visible");
            IncidentSecPage.RattSiteLiaiId.click();
            Thread.sleep(500);
            IncidentSecPage.RechSiteLiaiId.sendKeys("Site Lésion AUTO");
            Thread.sleep(200);
            IncidentSecPage.GridSiteLiaiTypId.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_GridView_SiteDeLesionRat\"]/tbody/tr/td[1]")).findElement(By.tagName("input")).click();
            IncidentSecPage.VldSiteLiaiId.click();
        } catch (NoSuchElementException e) {
            Common.Exporter_visibilité("site de lésion est invisible");
        }
    }

    public static void Choisir_Gravité() throws Throwable {
        try {
            IncidentSecPage.GravIncId.isDisplayed();
            Common.Exporter_visibilité("la Gravité est visible");
            Select select = new Select(IncidentSecPage.GravIncId);
            select.selectByVisibleText("Critique");
        } catch (NoSuchElementException e) {
            Common.Exporter_visibilité("la gravité est invisible");
        }
    }

    public static void Cout_estimé() throws Throwable {
        try {
            IncidentSecPage.CoutIncId.isDisplayed();
            Common.Exporter_visibilité("le cout est visible");
            Select select = new Select(IncidentSecPage.CoutIncId);
            select.selectByVisibleText("1000");

        } catch (NoSuchElementException e) {
            Common.Exporter_visibilité("le cout est invisible");
        }
    }

    public static void Choisir_ISPS() throws Throwable {
        try {
            IncidentSecPage.IsPsIncId.isDisplayed();
            Common.Exporter_visibilité("ISPS est visible");
            Select select = new Select(IncidentSecPage.IsPsIncId);
            select.selectByVisibleText("NON");

        } catch (NoSuchElementException e) {
            Common.Exporter_visibilité("ISPS est invisible");
        }
    }

    public static void Choisir_evenement_déclencheur() throws Throwable {
        try {

            IncidentSecPage.EvnDecIncId.isDisplayed();
            Common.Exporter_visibilité("evenement dec est visible");
            Select select = new Select(IncidentSecPage.EvnDecIncId);
            select.selectByVisibleText("EVENEMENT AUTO");
        } catch (NoSuchElementException e) {
            Common.Exporter_visibilité("evenement dec est invisible");
        }
    }

    public static void Actions_immédiates() throws Throwable {
        IncidentSecPage.ActImmId.sendKeys("Action immédiate");
    }

    public static void Valider_fiche(WebDriver driver) throws Throwable {

        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click()", IncidentSecPage.VldFichIncId);

        Thread.sleep(500);
    }

    public static void Rattacher_personne_concerné(WebDriver driver) throws Throwable {

        Actions action = new Actions(driver);
        action.moveToElement(IncidentSecPage.SPPersConCId).perform();
        IncidentSecPage.SPPersConCId.click();
        Thread.sleep(500);
        try {

            IncidentSecPage.RattPersConId.isDisplayed();
            IncidentSecPage.RattPersConId.click();
            Thread.sleep(200);
            IncidentSecPage.RechPersConId.sendKeys("AUTO1");
            IncidentSecPage.VldRechPersConId.click();
            Thread.sleep(200);
            IncidentSecPage.GridPersConId.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_GridView_emp\"]/tbody/tr[2]/td[1]")).findElement(By.tagName("input")).click();
            IncidentSecPage.VldPersConId.click();
        } catch (NoSuchElementException e) {
            Common.Exporter_visibilité("personne concernée interne est invisible");
        }

        IncidentSecPage.AjtConId.click();
        IncidentSecPage.NomConId.sendKeys("Concernant ajoiutéé");
        IncidentSecPage.OrgConId.sendKeys("Organismeajoutée");
        IncidentSecPage.VldConId.click();

    }

    public static void Rattacher_témoins(WebDriver driver) throws Throwable {
        //driver.findElement(By.id("sp_collapseTem")).click();
        Actions action = new Actions(driver);
        action.moveToElement(IncidentSecPage.SPTemoinsId).perform();
        Thread.sleep(500);
        IncidentSecPage.SPTemoinsId.click();
        Thread.sleep(500);
        action.moveToElement(IncidentSecPage.RattTemId).perform();
        Thread.sleep(500);
        IncidentSecPage.RattTemId.click();
        Thread.sleep(500);
        IncidentSecPage.RechTemId.sendKeys("AUTO1");
        IncidentSecPage.VldRechTemId.click();
        IncidentSecPage.GridTemId.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_GridView4\"]/tbody/tr[2]/td[1]")).findElement(By.tagName("input")).click();
        IncidentSecPage.VldTemId.click();

    }

    public static void Rattacher_conformité_réglementaire(WebDriver driver) throws Throwable {

        Actions action = new Actions(driver);
        action.moveToElement(IncidentSecPage.SPConfRegId).perform();
        Thread.sleep(500);
        IncidentSecPage.SPConfRegId.click();
        Thread.sleep(500);
        action.moveToElement(IncidentSecPage.RattConfId).perform();
        Thread.sleep(500);
        IncidentSecPage.RattConfId.click();
        Thread.sleep(500);
        IncidentSecPage.RechConfId.sendKeys("7");
        IncidentSecPage.GridConfId.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_Gd_conf\"]/tbody/tr/td[1]")).findElement(By.tagName("input")).click();
        IncidentSecPage.VldConfId.click();
    }

    public static void Rattacher_risque(WebDriver driver) throws Throwable {
        Thread.sleep(800);
        Actions action = new Actions(driver);
        action.moveToElement(IncidentSecPage.SPRisqueId).perform();
        Thread.sleep(200);
        IncidentSecPage.SPRisqueId.click();
        Thread.sleep(200);
        action.moveToElement(IncidentSecPage.RattRisId).perform();
        Thread.sleep(200);
        IncidentSecPage.RattRisId.click();
        Thread.sleep(200);
        IncidentSecPage.RechRisId.sendKeys("312");
        IncidentSecPage.GridRisId.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_GridView9\"]/tbody/tr/td[1]")).findElement(By.tagName("input")).click();
        IncidentSecPage.VldRisId.click();
    }

    public static void Rattacher_situation_urgence(WebDriver driver) throws Throwable {

        Actions action = new Actions(driver);
        action.moveToElement(IncidentSecPage.SPSituUrgId).perform();
        Thread.sleep(200);
        IncidentSecPage.SPSituUrgId.click();
        Thread.sleep(200);
        action.moveToElement(IncidentSecPage.RattSitUrgId).perform();
        Thread.sleep(200);
        IncidentSecPage.RattSitUrgId.click();
        Thread.sleep(200);
        IncidentSecPage.RechSitUrgId.sendKeys("1");
        IncidentSecPage.GridSitUrgId.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_G4\"]/tbody/tr/td[1]")).findElement(By.tagName("input")).click();
        IncidentSecPage.VldSitUrgId.click();
    }

    public static void rattacher_règle_sécurité(WebDriver driver) throws Throwable {

        Actions action = new Actions(driver);
        action.moveToElement(IncidentSecPage.SPRegSecId).perform();
        Thread.sleep(500);
        IncidentSecPage.SPRegSecId.click();
        Thread.sleep(500);
        action = new Actions(driver);
        action.moveToElement(IncidentSecPage.AvecRegSecId).perform();
        IncidentSecPage.AvecRegSecId.click();
        Thread.sleep(200);
        action.moveToElement(IncidentSecPage.VldRegSecId).perform();
        IncidentSecPage.VldRegSecId.click();
    }

    public static void rattacher_pièce_jointe(WebDriver driver) throws Throwable {
        WebElement PJ = driver.findElement(By.id("ctl00_ContentPlaceHolder1_Pieces_jointes"));
        Actions action = new Actions(driver);
        action.moveToElement(PJ).perform();
        Thread.sleep(200);
        PJ.click();
        driver.findElement(By.id("ctl00_ContentPlaceHolder1_LinkButton19")).click();
        driver.findElement(By.id("ctl00_ContentPlaceHolder1_TextBox8")).sendKeys("Pièce jointe");
        driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_Panel_ajtpj\"]/div[2]/div[2]/div/div/span")).click();
        Thread.sleep(500);
        Runtime.getRuntime().exec("E:\\qualipro\\trunk\\AutomatisationTQualiPro_prod231\\resources\\Scripts\\joindreFichier1.exe");
        Thread.sleep(500);
        driver.findElement(By.id("ctl00_ContentPlaceHolder1_LinkButton21")).click();
        Thread.sleep(500);
        driver.findElement(By.id("ctl00_ContentPlaceHolder1_LinkButton22")).click();
        Thread.sleep(500);
        driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_LinkButton10\"]/span")).click();
    }

    public static void rattacher_personne_informer(WebDriver driver) throws Throwable {
        driver.findElement(By.id("ctl00_ContentPlaceHolder1_LinkButton_Informe")).click();
        Thread.sleep(500);
        driver.findElement(By.id("ctl00_ContentPlaceHolder1_LinkButton28")).click();
        Thread.sleep(500);
        driver.findElement(By.id("ctl00_ContentPlaceHolder1_TextBox15")).sendKeys("AUTO");
        Thread.sleep(500);
        driver.findElement(By.id("ctl00_ContentPlaceHolder1_LinkButton80")).click();
        Thread.sleep(500);
        driver.findElement(By.id("ctl00_ContentPlaceHolder1_GridView10")).findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_GridView10\"]/tbody/tr[2]/td[1]")).findElement(By.tagName("input")).click();
        Thread.sleep(500);
        driver.findElement(By.id("ctl00_ContentPlaceHolder1_LinkButton40")).click();
        Thread.sleep(500);
        driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_LinkButton_Retour\"]/span")).click();
        Thread.sleep(500);
    }


    public static void rattacher_action(WebDriver driver) throws Throwable {
        driver.findElement(By.id("ctl00_ContentPlaceHolder1_Lb_rattach_action")).click();
        Thread.sleep(500);
        driver.findElement(By.id("ctl00_ContentPlaceHolder1_LinkButton16")).click();
        Thread.sleep(500);
        driver.findElement(By.id("ctl00_ContentPlaceHolder1_TextBox33")).sendKeys("25432");
        Thread.sleep(500);
        driver.findElement(By.id("ctl00_ContentPlaceHolder1_LinkButton79")).click();
        Thread.sleep(500);
        driver.findElement(By.id("ctl00_ContentPlaceHolder1_GridView7")).findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_GridView7\"]/tbody/tr[2]/td[1]")).findElement(By.tagName("input")).click();
        Thread.sleep(500);
        driver.findElement(By.id("ctl00_ContentPlaceHolder1_LinkButton18")).click();
        Thread.sleep(500);
        driver.findElement(By.id("ctl00_ContentPlaceHolder1_LinkButton15")).click();
        Thread.sleep(500);
    }

    public static void consulter_agenda(WebDriver driver) throws Throwable {
        WebDriverWait wait = new WebDriverWait(driver, 2000);
        wait.until(ExpectedConditions.visibilityOf(IncidentSecPage.AgdSecId));
        IncidentSecPage.AgdSecId.click();
        Thread.sleep(1000);
    }


    public static void consulter_Incident_à_valider(String num, WebDriver driver) throws Throwable {
        //IncidentSecPage.SPIncAVldId.click();
        //addd by rahma
        Thread.sleep(3000);
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click()", IncidentSecPage.SPIncAVldId);

        Thread.sleep(3000);
        System.out.println(" num  fich  incident: " + num);
        try {
            IncidentSecPage.RechIncAVldId.findElement(By.tagName("input")).sendKeys(num);
            Thread.sleep(1000);
        } catch (NoSuchElementException ecp) {
            driver.findElement(By.id("ctl00_ContentPlaceHolder1_GridView3_filter")).
                    findElement(By.tagName("input")).sendKeys(num);
        }
        IncidentSecPage.GridIncAVldId.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_GridView3\"]/tbody/tr/td[1]")).findElement(By.tagName("a")).click();

    }

    public static void consulter_Incident_à_corriger(String num) throws Throwable {
        IncidentSecPage.SPIncACorrId.click();
        Thread.sleep(500);
        IncidentSecPage.RechIncACorrId.sendKeys(num);
        Thread.sleep(500);
        IncidentSecPage.GridIncACorrId.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_GridView2\"]/tbody/tr/td[1]")).findElement(By.tagName("a")).click();

    }

    public static void consulter_Incident_à_décider(String num) throws Throwable {
        Thread.sleep(2000);
        IncidentSecPage.SPIncADecId.click();
        Thread.sleep(500);
        IncidentSecPage.RechIncADecId.sendKeys(num);
        Thread.sleep(500);
        IncidentSecPage.GridIncADecId.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_GridView8\"]/tbody/tr/td[1]")).findElement(By.tagName("a")).click();

    }


    public static void decisionDeValidation(String deci, String Path, int row, WebDriver driver) throws Throwable {
        if (deci.equals("Refus")) {
            IncidentSecPage.CommVldIncId.sendKeys("Refus");
            IncidentSecPage.RefusIncId.click();

        } else if (deci.equals("Correction")) {
            IncidentSecPage.CommVldIncId.sendKeys("Correction");
            IncidentSecPage.CorrIncId.click();


        } else if (deci.equals("Validation")) {
            ExcelUtils.setExcelFile(Path, "IncidentSec");
            try {
                Select select = new Select(driver.findElement(By.id("ctl00_ContentPlaceHolder1_Depa0")));
                select.selectByVisibleText("AUTO1");
            } catch (NoSuchElementException exp) {
                Select select = new Select(driver.findElement(By.id("ctl00_ContentPlaceHolder1_listBoxDecid")));
                select.selectByVisibleText("AUTO1");
            }
            String para = Common.paragraphe(15, 100);
            Thread.sleep(800);
            try {
                IncidentSecPage.CommVldIncId2.sendKeys(para);
            } catch (NoSuchElementException exp) {
                IncidentSecPage.CommVldIncId.sendKeys(para);
            }
            Thread.sleep(800);


            //IncidentSecPage.ValidationIncId.click();
        }
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("arguments[0].click()", IncidentSecPage.ValidationIncId);
    }

    public static void vérifier_que_l_état_de_la_fiche_incident_suit(String arg1, WebDriver driver) throws Throwable {
        WebElement etat = driver.findElement(By.id("ctl00_ContentPlaceHolder1_Label_Etat"));
        if (arg1.equals("Refus")) {
            System.out.println("Fiche Incident refusé par le responsable validation");
            assertTrue(etat.getText().contains("Refusée") || etat.getText().contains("Refused"));

        } else if (arg1.equals("Correction")) {
            System.out.println("Fiche Incident envoyé pour correction par le responsable validation");
            assertTrue(etat.getText().contains("En attente de correction") || etat.getText().contains("Waiting for correction"));

        } else if (arg1.equals("Validation")) {
            System.out.println("Fiche incident validé par le responsable validation");
            assertTrue(etat.getText().contains("En attente de décision") || etat.getText().contains("Waiting for decision"));
        } else if (arg1.equals("Corrige")) {
            System.out.println("Fiche incident corrige par le déclencheur ");
            assertTrue(etat.getText().contains("En attente de validation") || etat.getText().contains("Waiting for approval"));

        } else if (arg1.equals("Pass. resp. Trait.")) {
            System.out.println("Décision de Traitement est prise");
            assertTrue(etat.getText().contains("En attente de traitement") || etat.getText().contains("Waiting for disposition"));

        } else if (arg1.equals("Pass. resp. Clot.")) {
            System.out.println("Décision de Traitement est prise");
            assertTrue(etat.getText().contains("En attente de clôture") || etat.getText().contains("Waiting for closure"));

        } else if (arg1.equals("Cloturée")) {
            System.out.println("Fiche incident cloturée");
            assertTrue(etat.getText().contains("Clôturée") || etat.getText().contains("Closed"));

        }
    }


    public static void choisir_responsable_traitement(String Resp) throws Throwable {
        IncidentSecPage.SelectRespTraitId.click();
        Thread.sleep(200);
        IncidentSecPage.RechRespTraitId.sendKeys(Resp);
        Thread.sleep(200);
        IncidentSecPage.VldRechRespTraitId.click();
        Thread.sleep(200);
        IncidentSecPage.GridRespTraitId.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_GridView12\"]/tbody/tr[2]/td[1]")).findElement(By.tagName("a")).click();
        Thread.sleep(200);
    }

    public static void choisir_responsable_clôture(WebDriver driver, String RespClot) throws Throwable {
        //driver.findElement(By.id("sp_decision")).click();
        Select select = new Select(IncidentSecPage.RespClotId);
        select.selectByVisibleText(RespClot);

    }


    public static void choisir_délai_de_traitement(WebDriver driver) throws Throwable {
        final DateFormat dateFormat;
        Cookie cookie1 = driver.manage().getCookieNamed("lan");
        if (cookie1.getValue().equals("en-US")) {
            dateFormat = new SimpleDateFormat("MM/dd/yyyy");
        } else {
            dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        }
        Date dt = new Date();
        Calendar c = Calendar.getInstance();
        c.setTime(dt);
        c.add(Calendar.DATE, 2);
        dt = c.getTime();
        String Sdate = dateFormat.format(dt);
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("arguments[1].value = arguments[0];", Sdate, IncidentSecPage.DelaiTraitId);
    }


    public static void saisir_cause_incident() throws Throwable {
        IncidentSecPage.CauseDecIncId.sendKeys("Cause Traitement incident");
    }


    public static void saisir_traitement_incident() throws Throwable {
        IncidentSecPage.TraitDecIncId.sendKeys("Traitement décision incident");
    }


    public static void valider_décision(WebDriver driver) throws Throwable {
        Thread.sleep(500);
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click()", IncidentSecPage.VldDecId);
    }


    public static void consulter_traitement_des_incidents(String num, WebDriver driver) throws Throwable {
        WebDriverWait wait = new WebDriverWait(driver, 60);
        wait.until(ExpectedConditions.visibilityOf(IncidentSecPage.SpIncATraitId));

        IncidentSecPage.SpIncATraitId.click();
        Thread.sleep(500);
        IncidentSecPage.RechIncATraitId.sendKeys(num);
        IncidentSecPage.GridIncATraitId.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_GridView1\"]/tbody/tr/td[1]")).findElement(By.tagName("a")).click();
    }

    public static void cocher_incident_traité() throws Throwable {
        IncidentSecPage.EtatIncATraitId.click();
        Thread.sleep(200);

    }

    public static void saisir_cout(WebDriver driver) throws Throwable {
        //driver.findElement(By.id("sp_trait")).click();
        try {
            IncidentSecPage.CoutTraitIncId.isDisplayed();
            Common.Exporter_visibilité("le cout de traitement est visible");
            IncidentSecPage.CoutTraitIncId.sendKeys("1000");
        } catch (NoSuchElementException e) {
            Common.Exporter_visibilité("le cout de traitement est invisible");
        }
    }


    public static void saisir_rapport_traitement(WebDriver driver) throws Throwable {
        //added by rahma
        WebDriverWait wait = new WebDriverWait(driver, 60);
        wait.until(ExpectedConditions.visibilityOf(IncidentSecPage.RapTraitIncId));

        IncidentSecPage.RapTraitIncId.sendKeys("Rapport traitement");
    }

    public static void valider_le_traitement(WebDriver driver) throws Throwable {
        //IncidentSecPage.VldTraitIncId.click();
        //added by rahma
        Thread.sleep(100);

        if (IncidentSecPage.VldTraitIncId.isDisplayed()) {
            IncidentSecPage.VldTraitIncId.click();
        } else {
            JavascriptExecutor executor = (JavascriptExecutor) driver;
            executor.executeScript("arguments[0].click()", IncidentSecPage.VldTraitIncId);
        }

    }

    public static void consulter_incidents_a_cloturer(String num) throws Throwable {
        IncidentSecPage.SpIncAClotId.click();
        Thread.sleep(500);
        IncidentSecPage.RechIncAClotId.sendKeys(num);
        IncidentSecPage.GridIncAClotId.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_GridView2\"]/tbody/tr/td[1]")).findElement(By.tagName("a")).click();
    }

    public static void cocher_incident_cloturé() throws Throwable {
        IncidentSecPage.EtatIncAClotId.click();
        Thread.sleep(200);

    }


    public static void saisir_rapport_cloture(WebDriver driver) throws Throwable {
        //driver.findElement(By.id("sp_clot")).click();
        Thread.sleep(200);
        //added by rahma

        String para = Common.paragraphe(13, 20);
        Thread.sleep(1000);
        try {
            //WebDriverWait wait = new WebDriverWait(driver,60);
            WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_tb_comm"));
            element.sendKeys(para);
        } catch (NoSuchElementException exp) {
            IncidentSecPage.RapClotIncId2.sendKeys(para);
        }
    }

    public static void valider_le_cloture(WebDriver driver) throws Throwable {

        //.click();
        Thread.sleep(200);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        try {
            js.executeScript("arguments[0].click()", IncidentSecPage.VldClotIncId2);
        } catch (NoSuchElementException exp) {

            js.executeScript("arguments[0].click()", driver.findElement(By.id("ctl00_ContentPlaceHolder1_Lk_CLOT")));
        }
    }


}
