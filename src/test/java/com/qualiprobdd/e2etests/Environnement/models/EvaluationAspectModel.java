package com.qualiprobdd.e2etests.Environnement.models;

import com.qualiprobdd.e2etests.Environnement.pages.EvaluationAspectPage;
import com.qualiprobdd.e2etests.Formation.Pages.FormationPage;
import com.qualiprobdd.e2etests.moduleAction.pages.ActSimplPage;
import com.qualiprobdd.e2etests.util.Common;
import com.qualiprobdd.e2etests.util.ExcelUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.codestory.simplelenium.DomElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.time.LocalDateTime;

public class EvaluationAspectModel {
    static String Demandeur, utilisateurs, NumFormation;
    static boolean participe;
    private static String
            Path = "resources/testData/TestData.xlsx";
    private static int arg1;


    public static void consulter_Sous_Module_Aspects(WebDriver driver) throws Throwable {
        Thread.sleep(500L);
        Common.AccéderModule(15, 0, 0, driver);
        Common.AccéderModule(15,1,0, driver);

    }


    public static void consulter_Sous_Module_Evaluation_des_aspects(WebDriver driver) throws Exception {
        Common.AccéderModule(15,1,1, driver);
    }


    public static void cliquer_sur_ajouter_Evaluation_aspect() throws Throwable {
        Thread.sleep(1000L);
        EvaluationAspectPage.wcliquer_sur_ajouter_Evaluation_aspect.click();

    }

    public static void sélectionner_Aspect_EVALUATION(int row) throws Throwable  {
       // Thread.sleep(2000);
        //ExcelUtils.setExcelFile(Path, "EvaluationAspect");
       //String  st =ExcelUtils.getCellData(row, 0);
        //EvaluationAspectPage.wsélectionner_Aspect_EVALUATION.sendKeys(st);
        ExcelUtils.setExcelFile(Path, "EvaluationAspect");
        String value=ExcelUtils.getCellData(row,0);
        System.out.println(" value =  "+value);
        Select select = new Select(EvaluationAspectPage.wsélectionner_Aspect_EVALUATION);
        select.selectByVisibleText(value);

    }

    public static void sélectionner_Facteur(int row)  throws Throwable  {
        Thread.sleep(2000);
        ExcelUtils.setExcelFile(Path, "EvaluationAspect");
        String  st =ExcelUtils.getCellData(row, 1);
        System.out.println(" st   "+st);
        Select select = new Select(EvaluationAspectPage.wsélectionner_Facteur);
        select.selectByValue("69");

    }


    public static void sélectionner_Lieu(int row) throws Throwable{
        Thread.sleep(2000);
        ExcelUtils.setExcelFile(Path, "EvaluationAspect");
        String  st =ExcelUtils.getCellData(row, 2);
        System.out.println(" st   "+st);
        Select select = new Select(EvaluationAspectPage.wsélectionner_Lieu);
        select.selectByValue("2019");


    }


    public static void sélectionner_condition(int row) throws Throwable {

        Thread.sleep(2000);
        ExcelUtils.setExcelFile(Path, "EvaluationAspect");
        String  st =ExcelUtils.getCellData(row, 4);
        System.out.println(" st   "+st);
        Select select = new Select(EvaluationAspectPage.wsélectionner_condition);
        select.selectByValue("77");

    }


    public static void cliquer_sur_valider_Evaluation_aspect(int  row ) throws Exception {
        EvaluationAspectPage.wcliquer_sur_valider_Evaluation_aspect.click();
        Thread.sleep(2000);
        String   NumFichAsp=EvaluationAspectPage.widnumfich.getText();
        System.out.println(" num   de  fiche  est   "+NumFichAsp);
        ExcelUtils.setExcelFile(Path, "EvaluationAspect");
        ExcelUtils.setCellData1(NumFichAsp,row, 5,Path);
    }


    public static void vérifier_Evaluation_aspect_ajouté(int row) throws Throwable {
        Thread.sleep(2000);
        EvaluationAspectPage.wBoutton_retour_Aspect_EVALUATION.click();
        Thread.sleep(1000);
        ExcelUtils.setExcelFile(Path, "EvaluationAspect");
        String   st =ExcelUtils.getCellData1(row, 5);


        Thread.sleep(2000);
        EvaluationAspectPage.wremplir_le_champ_N_Aspect.sendKeys(st);
        EvaluationAspectPage.wRechercher_Aspect_EVALUATION.click();
        String st11=EvaluationAspectPage.wTab_Aspect_EVALUATION.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_GridView1p\"]/tbody/tr[2]/td[3]")).getText();

        Assert.assertTrue(st.equals(st11));

        Thread.sleep(1000);

    }
}
