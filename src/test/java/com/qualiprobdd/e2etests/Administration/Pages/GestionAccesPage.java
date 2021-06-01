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
    public  static  final String AjoutFnEmp="ctl00_ContentPlaceHolder1_Button11";
    public  static final String  tabFnEmp="ctl00_ContentPlaceHolder1_fonctioon";
    public static  final String validerFan="ctl00_ContentPlaceHolder1_LinkButton15";
    public  static final String partEmp="ctl00_ContentPlaceHolder1_Label14";
    public  static final String btnAudti="ctl00_ContentPlaceHolder1_Audit";
    public  static final String btnSup="ctl00_ContentPlaceHolder1_supr";
    public  static final String btnRRh="ctl00_ContentPlaceHolder1_ChRRH";
    public  static  final  String  btnGroup="ctl00_ContentPlaceHolder1_Button7";
    public  static   final String tabgroupEmp="ctl00_ContentPlaceHolder1_GridViewabc";
    public   static  final  String validGroup="ctl00_ContentPlaceHolder1_LinkButton5";
    public  static  final  String btnvalidEmp="ctl00_ContentPlaceHolder1_LinkButton17";
    public  static  final  String   rechmat="ctl00_ContentPlaceHolder1_matp";
    public  static  final  String rechnp="";
    public  static  final  String retour="ctl00_ContentPlaceHolder1_LinkButton18";
    public  static  final  String btnreche="";
    @FindBy(how = How.ID, using =retour )
    public static WebElement wretour;
    @FindBy(how = How.ID, using =btnvalidEmp )
    public static WebElement wbtnvalidEmp;
    @FindBy(how = How.ID, using =validGroup )
    public static WebElement wvalidGroup;
    @FindBy(how = How.ID, using =tabgroupEmp )
    public static WebElement wtabgroupEmp;
    @FindBy(how = How.ID, using = btnGroup)
    public static WebElement wbtnGroup;
    @FindBy(how = How.ID, using = partEmp)
    public static WebElement wpartEmp;
    @FindBy(how = How.ID, using = btnAudti)
    public static WebElement wbtnAudti;
    @FindBy(how = How.ID, using = btnSup)
    public static WebElement wbtnSup;
    @FindBy(how = How.ID, using = btnRRh)
    public static WebElement wbtnRRh;
    @FindBy(how = How.ID, using = validerFan)
    public static WebElement wvaliderFan;
    @FindBy(how = How.ID, using = tabFnEmp)
    public static WebElement wtabFn;
    @FindBy(how = How.ID, using = AjoutFnEmp)
    public static WebElement wAjoutFnEmp;
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
