package com.qualiprobdd.e2etests.audit.pages;

import com.qualiprobdd.e2etests.util.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class RepAuParTypePage extends AbstractPage {


    public RepAuParTypePage(WebDriver driver) {

        super(driver);
    }

    static final String typeAudit = "ctl00_ContentPlaceHolder1_ListBox2";

    static final String site = "ctl00_ContentPlaceHolder1_ListBox3";
    static final String datePrévueEntre = "ctl00_ContentPlaceHolder1_TextBox1";




    static final String dateEt = "ctl00_ContentPlaceHolder1_TextBox3";
    static final String btnValide = "ctl00_ContentPlaceHolder1_LinkButton11";
    static final String filterTypeAudit = "ctl00_ContentPlaceHolder1_Liste_type";
    static final String filterEtat = "ctl00_ContentPlaceHolder1_ListBox1p";
    static final String filterChampAudit = "ctl00_ContentPlaceHolder1_ListBox2p";
    static final String tabDonAudit = "ctl00_ContentPlaceHolder1_GridView1p";
    static final String recherFilt = "ctl00_ContentPlaceHolder1_Filtre_Rechercher";
    public static final String btnvalidTaux = "ctl00_ContentPlaceHolder1_valider";
    static final String typeAuditTaux = "ctl00_ContentPlaceHolder1_ListBox2";
    static final String dateProgAnnu = "ctl00_ContentPlaceHolder1_Tb_date1";
    static final String dataetAnnu = "ctl00_ContentPlaceHolder1_Tb_date2";
    static final String typAuditProgrammAnnu="ctl00_ContentPlaceHolder1_laud";
    static final  String  champAuditProgrammAnnu="ctl00_ContentPlaceHolder1_ListBox2";
    static  final   String chamAuditParEtat="ctl00_ContentPlaceHolder1_ListBox1";
    @FindBy(how = How.ID, using = chamAuditParEtat)
    public static WebElement wchamAuditParEtat;

    @FindBy(how = How.ID, using = dateProgAnnu)
    public static WebElement wdateProgAnnu;
    @FindBy(how = How.ID, using = dataetAnnu)
    public static WebElement wdataetAnnu;
    @FindBy(how = How.ID, using = typAuditProgrammAnnu)
    public static WebElement wtypAuditProgrammAnnu;
    @FindBy(how = How.ID, using = champAuditProgrammAnnu)
    public static WebElement wchampAuditProgrammAnnu;

    @FindBy(how = How.ID, using = btnvalidTaux)
    public static WebElement wbtnvalidTaux;
    @FindBy(how = How.ID, using = typeAuditTaux)
    public static WebElement wtypeAuditTaux;
    @FindBy(how = How.ID, using = recherFilt)
    public static WebElement wrecherFilt;
    @FindBy(how = How.ID, using = tabDonAudit)
    public static WebElement wtabDonAudit;
    @FindBy(how = How.ID, using = filterChampAudit)
    public static WebElement wfilterChampAudit;
    @FindBy(how = How.ID, using = btnValide)
    public static WebElement wbtnValide;
    @FindBy(how = How.ID, using = filterTypeAudit)
    public static WebElement wfilterTypeAudit;
    @FindBy(how = How.ID, using = filterEtat)
    public static WebElement wfilterEtat;
    @FindBy(how = How.ID, using = site)
    public static WebElement wsite;
    @FindBy(how = How.ID, using = datePrévueEntre)
    public static WebElement wdatePrévueEntre;
    @FindBy(how = How.ID, using = dateEt)
    public static WebElement wdateEt;
    @FindBy(how = How.ID, using = typeAudit)
    public static WebElement wtypeAudit;


}
