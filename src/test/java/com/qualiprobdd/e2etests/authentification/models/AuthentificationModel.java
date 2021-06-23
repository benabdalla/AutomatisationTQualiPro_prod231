package com.qualiprobdd.e2etests.authentification.models;

import com.qualiprobdd.e2etests.authentification.pages.AuthentificationPage;

import com.qualiprobdd.e2etests.util.ExcelUtils;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class AuthentificationModel {

    /* Public methods */
    private static String Path = "resources/testData/TestData.xlsx";

    public static void saisirLogin(int RowNum, int RowCol, WebDriver driver) throws Exception {

        ExcelUtils.setExcelFile(Path, "Input");
        String login = ExcelUtils.getCellData(RowNum, RowCol);
        System.err.println("login " + ExcelUtils.getCellData(RowNum, RowCol));
        Thread.sleep(500);

        //AuthentificationPage.loginID.sendKeys(login);
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("arguments[1].value = arguments[0];", login, AuthentificationPage.loginID);

    }

    public static void saisirLogin1(String id) {
        AuthentificationPage.loginID.sendKeys(id);

    }

    public static void sasirpw1(String id) {
        AuthentificationPage.motDePasse.sendKeys(id);

    }

    public static void saisirPW(int RowNum, int RowCol, WebDriver driver) throws Exception {
        ExcelUtils.setExcelFile(Path, "Input");
        String password = ExcelUtils.getCellData(RowNum, RowCol);
        System.err.println("password " + ExcelUtils.getCellData(RowNum, RowCol));
        //AuthentificationPage.motDePasse.sendKeys(password);
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("arguments[1].value = arguments[0];", password, AuthentificationPage.motDePasse);


    }

    public static void clickOuvrirSession(WebDriver driver) throws Exception {

JavascriptExecutor jse=(JavascriptExecutor)driver;
  jse.executeScript("arguments[0].click()", AuthentificationPage.Valider);
        //AuthentificationPage.Valider.click();

        Thread.sleep(5000L);
    }

    public static void Changer_Compte(String username, WebDriver driver) throws Exception {
        Thread.sleep(500);


        ExcelUtils.setExcelFile(Path, "Input");
        //String NewUser="nada";
        int RowNum = ExcelUtils.GetLigneData(username);
        System.out.println("num ligne " + RowNum);
        saisirLogin(RowNum, 2, driver);
        saisirPW(RowNum, 3, driver);
        Thread.sleep(2000L);
        clickOuvrirSession(driver);
        Thread.sleep(5000L);
    }

    public static void Changer_Compte(String module, int col, int row, WebDriver driver) throws Exception {
        ExcelUtils.setExcelFile(Path, module);
        String username = ExcelUtils.getCellData(row, col);
        if (!(username.equals(""))) {
            ExcelUtils.setExcelFile(Path, "Input");
            int RowNum = ExcelUtils.GetLigneData(username);
            //System.out.println("num ligne"+RowNum);
            saisirLogin(RowNum, 2, driver);
            saisirPW(RowNum, 3, driver);
            clickOuvrirSession(driver);
        }
        Thread.sleep(5000L);
    }

    public static void changer_langue() throws Throwable {
        AuthentificationPage.utilitaireID.click();
        AuthentificationPage.personnalisationId.click();
        AuthentificationPage.englisId.click();
        Thread.sleep(1000);
        AuthentificationPage.valider_Langue.click();
        Thread.sleep(1000);
        AuthentificationPage.HOMEID.click();
        Thread.sleep(1000);

    }


}
