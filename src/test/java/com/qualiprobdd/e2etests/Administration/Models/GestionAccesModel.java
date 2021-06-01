package com.qualiprobdd.e2etests.Administration.Models;

import com.qualiprobdd.e2etests.Administration.Pages.GestionAccesPage;


import com.qualiprobdd.e2etests.util.Common;
import com.qualiprobdd.e2etests.util.ExcelUtils;

import io.cucumber.java.en.When;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.NoSuchElementException;
import java.util.Random;


public class GestionAccesModel {

    private static String Path = "resources/testData/TestData.xlsx";

    public static  void cliquer_sur_ajouter_fiche_employé() throws Throwable {

        GestionAccesPage.wajoutEmp.click();
    }


    public static  void saisir_matricule(int arg1) throws Throwable {
        ExcelUtils.setExcelFile(Path, "Input");
       String  mat=ExcelUtils.getCellData(arg1,1);

        Thread.sleep(500);



        GestionAccesPage.wmatEmp.sendKeys(mat);

    }


    public static  void saisir_NomPrenom_Employé(int row) throws Throwable {
        ExcelUtils.setExcelFile(Path, "Input");
        String  np=ExcelUtils.getCellData(row,1);

        Thread.sleep(500);



        GestionAccesPage.wnomPren.sendKeys(np);

    }


    public static void cliquer_sur_valider_matricule(WebDriver driver) throws Throwable {

        JavascriptExecutor  js  = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].click()",GestionAccesPage.wcreateEmp);
        Thread.sleep(1000);

    }


    public static  void saisir_date_de_naissance(WebDriver driver) throws Throwable {
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
        jse.executeScript("arguments[1].value = arguments[0];",Sdate, GestionAccesPage.wdatenais);
        Thread.sleep(500);


    }


    public static  void saisir_N_CIN() throws Throwable {
        int nb;
        String  cin="";
        for(int  i=1;i<9;i++){
        Random random = new Random();

        nb = random.nextInt(9);
        cin+=nb;

        }
        System.out.println("le   numero   de   cin   est  ==>"+cin);
        Thread.sleep(200);
        GestionAccesPage.wcinEmp.sendKeys(cin);

    }


    public static  void saisir_date_dexpiration() throws Throwable {

    }

   
    public static void saisir_date_de_recrutement(WebDriver driver) throws Throwable {
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
        jse.executeScript("arguments[1].value = arguments[0];",Sdate, GestionAccesPage.wdatenais);
        Thread.sleep(500);
    }


    public static  void choisir_Site_employe() throws Throwable {

    }


    public static  void choisir_Processus_employe() throws Throwable {

    }


    public static  void choisir_Activite_employe() throws Throwable {

    }


    public static  void choisir_Direction_employe() throws Throwable {

    }


    public static  void choisir_saisir_Service_employe() throws Throwable {

    }


    public static  void saisir_telephone() throws Throwable {
        int nb;
        String  cin="";
        for(int  i=1;i<9;i++){
            Random random = new Random();

            nb = random.nextInt(9);
            cin+=nb;

        }
        System.out.println("le   numero   de   cin   est  ==>"+cin);
        Thread.sleep(200);
        GestionAccesPage.wtelEmp.sendKeys(cin);

    }


    public static  void choisir_Etat_civil() throws Throwable {
        Select slect=new Select(GestionAccesPage.wetatCivileEmp);
        slect.selectByValue("0");

    }


    public static  void choisir_sexe() throws Throwable {
        Select slect=new Select(GestionAccesPage.wsexEmp);
        slect.selectByValue("1");
    }


    public static  void saisir_Adresse_Mail() throws Throwable {

    }


    public static  void saisir_Formation_initiale() throws Throwable {

        String  formation = Common.paragraphe(12,12);
        GestionAccesPage.wformation.sendKeys("formation test  auto   "+formation);


    }


    public static  void saisir_Grade() throws Throwable {

        String  formation = Common.paragraphe(12,12);
        GestionAccesPage.wgarde.sendKeys("formation test  auto   "+formation);
    }


    public static void saisir_titre() throws Throwable {
        String  formation = Common.paragraphe(12,12);
        GestionAccesPage.wtitre.sendKeys("formation test  auto   "+formation);
    }


    public static  void choisir_type_de_travail() throws Throwable {

    }


    public static void ajouter_une_fonction(WebDriver driver) throws Throwable {
        Thread.sleep(200);
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        GestionAccesPage.wAjoutFnEmp.click();
        Boolean finBoucle = true;

        int i = GestionAccesPage.wtabFn.findElements(By.tagName("tr")).size() - 1;

        System.out.println(" size= " + i);



        for (int j = i; j > 0; j--) {
            Thread.sleep(200);
            System.out.println(" j= " + j);

            GestionAccesPage.wtabFn
                    .findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_fonctioon_wrapper\"]/div[2]/div/table/tbody/tr[" + j + "]/td[1]"))
                    .click();


        }
        JavascriptExecutor js =(JavascriptExecutor) driver;
        js.executeScript("arguments[0].click()",GestionAccesPage.wvaliderFan);


    }


    public static void Paramétrage_employé(WebDriver driver) throws Throwable {
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("arguments[0].click()", new Object[]{GestionAccesPage.wpartEmp});
        Thread.sleep(1000L);
        JavascriptExecutor jse2 = (JavascriptExecutor)driver;
        jse2.executeScript("arguments[0].click()", new Object[]{GestionAccesPage.wbtnAudti});
        Thread.sleep(1000L);
        JavascriptExecutor jse3 = (JavascriptExecutor)driver;
        jse3.executeScript("arguments[0].click()", new Object[]{GestionAccesPage.wbtnSup});
        Thread.sleep(1000L);
        JavascriptExecutor jse4 = (JavascriptExecutor)driver;
        jse4.executeScript("arguments[0].click()", new Object[]{GestionAccesPage.wbtnRRh});
    }

    public static void ajouter_group_de_travail_de_employé(WebDriver driver) throws InterruptedException {
        JavascriptExecutor jse4 = (JavascriptExecutor)driver;
        jse4.executeScript("arguments[0].click()", new Object[]{GestionAccesPage.wbtnGroup});
        int i = GestionAccesPage.wtabgroupEmp.findElements(By.tagName("tr")).size() - 1;
        System.out.println(" size= " + i);

        for(int j = i; j > 0; --j) {
            Thread.sleep(200L);
            System.out.println(" j= " + j);
            GestionAccesPage.wtabFn.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_GridViewabc_wrapper\"]/div[2]/div/table/tbody/tr[" + j + "]/td[1]")).click();
        }

        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].click()", new Object[]{GestionAccesPage.wvalidGroup});
    }

    public static void valider_fiche_Employé() throws Throwable {

    }


    public static  void consulter_menu_Administration() throws Throwable {

    }

    public static void consulter_sous_menu_Gestion_des_droits_d_accés() throws Throwable {

    }


    public static  void cliquer_sur_Employé() throws Throwable {

    }


    public static  void cliquer_sur_rechercher_employe() throws Throwable {

    }


    public static void selectionner_employe() throws Throwable {

    }


    public static void choisir_action() throws Throwable {

    }


    public static void ajouter_ajout() throws Throwable {

    }

    public static  void valider_affectation_acces() throws Throwable {

    }

    public static  void connecter_en_tant_que(int arg1) throws Throwable {

    }


    public static void consulter_action() throws Throwable {

    }


    public static void consulter_Demandes_dactions() throws Throwable {

    }


    public static  void vérifier_droits_acces_affecte() throws Throwable {

    }


    public static  void choisir_Demandes_dactions() throws Throwable {

    }


    public static void supprimer_ajout() throws Throwable {

    }


    public static  void vérifier_droits_acces_supprime() throws Throwable {

    }

}
