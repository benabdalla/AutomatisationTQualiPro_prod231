package com.qualiprobdd.e2etests.Administration.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.w3c.dom.html.HTMLInputElement;

public class GestionAccesPage {


    public final static String ajoutEmp = "ctl00_ContentPlaceHolder1_Ajouter";
    public final static String sexe = "ctl00_ContentPlaceHolder1_sex";
    public final static String matEmp = "ctl00_ContentPlaceHolder1_textmatp";
    public final static String nomPrrenEmp = "ctl00_ContentPlaceHolder1_Textnomprep";
    public final static String createEmp = "ctl00_ContentPlaceHolder1_Button10";
    public final static String datenais = "ctl00_ContentPlaceHolder1_datenais";
    public final static String cinEmp = "ctl00_ContentPlaceHolder1_Cin";
    public final static String daterec = "ctl00_ContentPlaceHolder1_daterec";
public final static String telEmp="ctl00_ContentPlaceHolder1_tel";
public   final  static   String  sexEmp="ctl00_ContentPlaceHolder1_sex";
    public   final  static   String  etatCivileEmp="ctl00_ContentPlaceHolder1_sex";
    public   static   final  String formation  ="ctl00_ContentPlaceHolder1_Formint";
    public  static  final  String  garde="ctl00_ContentPlaceHolder1_TB_grade";
    public   static   final   String  titre="ctl00_ContentPlaceHolder1_TB_titleGrade";
    @FindBy(how = How.ID, using = titre)
    public static WebElement wtitre;
    @FindBy(how = How.ID, using = garde)
    public static WebElement wgarde;
    @FindBy(how = How.ID, using = formation)
    public static WebElement wformation;
    @FindBy(how = How.ID, using = etatCivileEmp)
    public static WebElement wetatCivileEmp;

    @FindBy(how = How.ID, using = sexEmp)
    public static WebElement wsexEmp;
    @FindBy(how = How.ID, using = telEmp)
    public static WebElement wtelEmp;
    @FindBy(how = How.ID, using = ajoutEmp)
    public static WebElement wajoutEmp;

    @FindBy(how = How.ID, using = matEmp)
    public static WebElement wmatEmp;

    @FindBy(how = How.ID, using = nomPrrenEmp)
    public static WebElement wnomPren;


    @FindBy(how = How.ID, using = createEmp)
   public  static WebElement wcreateEmp;
    
    @FindBy(how = How.ID, using = datenais)
   public  static WebElement wdatenais;
    
    @FindBy(how = How.ID, using = cinEmp)
    public static WebElement wcinEmp;
    
    @FindBy(how = How.ID, using = daterec)
    public static WebElement wdaterec;

    @FindBy(how = How.ID, using = sexe)
    public static WebElement wsexe;
 /* public final static String ajoutEmp = "ctl00_ContentPlaceHolder1_Ajouter";
    @FindBy()
    static WebElement w
    public final static String ajoutEmp = "ctl00_ContentPlaceHolder1_Ajouter";
    @FindBy()
    static WebElement w
    public final static String ajoutEmp = "ctl00_ContentPlaceHolder1_Ajouter";
    @FindBy()
    static WebElement w
    public final static String ajoutEmp = "ctl00_ContentPlaceHolder1_Ajouter";
    @FindBy()
    static WebElement w*/

}
