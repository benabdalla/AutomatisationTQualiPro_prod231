package com.qualiprobdd.e2etests.Risque.Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.qualiprobdd.e2etests.util.AbstractPage;



public class RisqueOppPage extends AbstractPage {

	public RisqueOppPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		super(driver);
	}

	final static String MENU_ID = "ctl00_menuModal";
	final static String risqueOpp = "#cssmenu15 > div > div > ul > li:nth-child(6) > a";

	final static String ficherRisquOpp = "#cssmenu15 > div > div > ul > li.AspNet-Menu-WithChildren.open > ul > li:nth-child(2) > ul > li:nth-child(1) > a";
	final static String sousRisqueopp = "	#cssmenu15 > div > div > ul > li.AspNet-Menu-WithChildren.open > ul > li:nth-child(2)";
	final static String AjouteRisque = "ctl00_ContentPlaceHolder1_Ajouter_Ajouter";

	final static String object = "ctl00_ContentPlaceHolder1_tb_designation";
	final static String objectif = "ctl00_ContentPlaceHolder1_tb_objectif";
	final static String source = "ctl00_ContentPlaceHolder1_Tb_source";
	final static String Evenment = "ctl00_ContentPlaceHolder1_Tb_evenement";
	final static String enjeu = "ctl00_ContentPlaceHolder1_Tb_enjeu";
	final static String ListDomaine = "ctl00_ContentPlaceHolder1_DropDownListDomaine";
	final static String Processus = "ctl00_ContentPlaceHolder1_lBProcessus_";
	final static String activite = "ctl00_ContentPlaceHolder1_lBDomaine_";
	final static String drection = "ctl00_ContentPlaceHolder1_ListBox_Direction";
	final static String Service = "ctl00_ContentPlaceHolder1_lBService_";
	final static String imapct = "ctl00_ContentPlaceHolder1_DropDownList_Impact";
	final static String site = "ctl00_ContentPlaceHolder1_listBoxSite";
	final static String validerRisque = "ctl00_ContentPlaceHolder1_Button3";
	final static String Numfiche = "ctl00_ContentPlaceHolder1_tb_numFiche";
	
	final static String retour = "ctl00_ContentPlaceHolder1_LinkButton5";
	final static String rechercher = "ctl00_ContentPlaceHolder1_Tb_filtre_num";
	final static String btnrechercher = "ctl00_ContentPlaceHolder1_Label117";
	final static String idfich = "ctl00_ContentPlaceHolder1_GridView1_ctl02_LB_id";
	final static String validerBrut = "ctl00_ContentPlaceHolder1_valid_note_crit_brut";
	final static String agendaRisque = "ctl00_label_lb_risq";
	final static String evaluationResiduelle = "ctl00_ContentPlaceHolder1_Label32";

	final static String recherFichCree = "#ctl00_ContentPlaceHolder1_GridView6_filter > label > input";
	final static String idFicheCree = "ctl00_ContentPlaceHolder1_GridView6_ctl29_LinkButton1";

	final static String x = "ctl00_ContentPlaceHolder1_gv_risqcretere_ctl02_ListBox_note";
	final static String y = "ctl00_ContentPlaceHolder1_gv_risqcretere_ctl03_ListBox_note";
	final static String confi = "ctl00_ContentPlaceHolder1_lk_confeval";
	
	final static String ficherRech = "ctl00_ContentPlaceHolder1_GridView6_ctl32_LinkButton1";
	final static String evabrut = "ctl00_ContentPlaceHolder1_Lk_ajtcrit";
	final static String validerEva = "ctl00_ContentPlaceHolder1_valid_note_crit_brut";
	final static String btnEva = "ctl00_ContentPlaceHolder1_Lk_ajtcrit";
	final static String gridFich = "ctl00_ContentPlaceHolder1_GridView6";
	final static String idfich2 = "ctl00_ContentPlaceHolder1_GridView6_ctl28_LinkButton1";
	final static String modif = "ctl00_ContentPlaceHolder1_editer1";
	
	final static String validerEvamd = "ctl00_ContentPlaceHolder1_div_valid_note_crit_resid";

	final static String validerEvaAg = "ctl00_ContentPlaceHolder1_valid_note_crit";
	final static String grid ="ctl00_ContentPlaceHolder1_gv_risqcretere";
	final static String matrice = "//*[@id=\"ctl00_ContentPlaceHolder1_id_tb_crit\"]";
	//*[@id="ctl00_ContentPlaceHolder1_id_tb_crit"]
	
	
	final  static   String  matriceRe="ctl00_ContentPlaceHolder1_id_tb_crit_resid";
	final static String evalutionBrut = "ctl00_ContentPlaceHolder1_Label_Traitement";


	
	final static String evalR = "ctl00_ContentPlaceHolder1_Label33";
	final  static   String  evalRbtn="ctl00_ContentPlaceHolder1_Lk_ajtcrit_resid";
	final  static   String   gridRe="ctl00_ContentPlaceHolder1_gv_risqcretere_resid";
	final  static   String  validR="ctl00_ContentPlaceHolder1_valid_note_crit_resid";
	//final static String evaluationBrutAganda = "ctl00_ContentPlaceHolder1_Label_Traitement";
	final static String desision = "ctl00_ContentPlaceHolder1_DLL_Decision";
	final static String evalutionBrutAganda="ctl00_ContentPlaceHolder1_sp_evalBrut";
	final static String validerevalutionBrutAgenda="ctl00_ContentPlaceHolder1_valid_note_crit_brut";
	final static String ScoreBrut="ctl00_ContentPlaceHolder1_TextBox_Score";
	final static String SeuilBrut="ctl00_ContentPlaceHolder1_Label_seuil";
	final static String ResultatBrut="ctl00_ContentPlaceHolder1_Label_seuil";
	final static String ResultatBrutNo="ctl00_ContentPlaceHolder1_lb_sign_brut";
	final static String MatResultatBrut="ctl00_ContentPlaceHolder1_lb_acc_brut";
	final static String MatResultatBrutIN="ctl00_ContentPlaceHolder1_Lb_risque_interm";


	final static String ScoreResid="ctl00_ContentPlaceHolder1_TextBox_Score_resid";
	
	final static String SeuilResid="ctl00_ContentPlaceHolder1_Label_seuilres";
	final static String ResultatResid="ctl00_ContentPlaceHolder1_lb_acc_resid";
	final static String ResultatResidNo="ctl00_ContentPlaceHolder1_lb_sign_resid";
	final static String ResultatResidIN="ctl00_ContentPlaceHolder1_lb_sign_resid_inter";

	final static String RadioRisque="ctl00_ContentPlaceHolder1_RadioButtonListType_0";

	@FindBy(how = How.ID, using = RadioRisque)
	public static WebElement wRadioRisque;
	
	
	@FindBy(how = How.ID, using = ResultatResidIN)
	public static WebElement wResultatResidIN;
	


	@FindBy(how = How.ID, using = MatResultatBrut)
	public static WebElement wMatResultatBrut;
	@FindBy(how = How.ID, using = MatResultatBrutIN)
	public static WebElement wMatResultatBrutIN;
	

	
	@FindBy(how = How.ID, using = ResultatResid)
	public static WebElement wResultatResid;
	
	@FindBy(how = How.ID, using = ResultatResidNo)
	public static WebElement wResultatResidNo;

	 
		

	

	
	@FindBy(how = How.ID, using = ScoreResid)
	public static WebElement wScoreResid;
	
	@FindBy(how = How.ID, using = SeuilResid)
	public static WebElement wSeuilResid;
	

	@FindBy(how = How.ID, using = ResultatBrut)
	public static WebElement wResultatBrut;
	
	@FindBy(how = How.ID, using = ResultatBrutNo)
	public static WebElement wResultatBrutNo;

	 
		

	

	
	@FindBy(how = How.ID, using = ScoreBrut)
	public static WebElement wScoreBrut;
	
	@FindBy(how = How.ID, using = SeuilBrut)
	public static WebElement wSeuilBrut;
	

	
	@FindBy(how = How.ID, using = validerevalutionBrutAgenda)
	public static WebElement wvaliderevalutionBrutAgenda;

	@FindBy(how = How.ID, using = desision)
	public static WebElement wdesiosion;

	
	@FindBy(how = How.ID, using = evalutionBrutAganda)
	public static WebElement wevaluationBrutAganda;

	@FindBy(how = How.ID, using = evaluationResiduelle)
	public static WebElement wevaluationBrut;
	
	@FindBy(how = How.ID, using = validR)
	public static WebElement wvalidRe;
	
	
	@FindBy(how = How.ID, using = evalutionBrutAganda)
	public static WebElement wevalutionBrutAganda;
	
	@FindBy(how = How.ID, using = gridRe)
	public static WebElement wgridRe;
	
	
	@FindBy(how = How.ID, using = evalRbtn)
	public static WebElement wevalRbtn;
	
	@FindBy(how = How.ID, using = evalR)
	public static WebElement wevalR;

	@FindBy(how = How.ID, using = gridFich)
	public static WebElement wgridFich;

	@FindBy(how = How.XPATH, using = matrice)
	public static WebElement wmatrice;
	
	@FindBy(how = How.ID, using = matriceRe)
	public static WebElement wmatriceRe;


	@FindBy(how = How.ID, using = grid)
	public static WebElement wgrid;

	@FindBy(how = How.ID, using = modif)
	public static WebElement wmodif;
			@FindBy(how = How.ID, using = validerEvamd)
			public static WebElement wvaliderEvamd;
	@FindBy(how = How.ID, using = validerEvaAg)
	public static WebElement wvaliderEvaAg;

	@FindBy(how = How.ID, using = idfich2)
	public static WebElement widfich2;

	@FindBy(how = How.ID, using = btnEva)
	public static WebElement wbtnEva;

	@FindBy(how = How.ID, using = evabrut)
	public static WebElement wevabrut;

	@FindBy(how = How.ID, using = ficherRech)
	public static WebElement wficherRech;

	@FindBy(how = How.ID, using = confi)
	public static WebElement wconf;

	@FindBy(how = How.ID, using = idfich)
	public static WebElement widfich;

	@FindBy(how = How.ID, using = validerEva)
	public static WebElement wvaliderEva;

	@FindBy(how = How.ID, using = x)
	public static WebElement wx;

	@FindBy(how = How.ID, using = y)
	public static WebElement wy;

	@FindBy(how = How.CSS, using = recherFichCree)
	public static WebElement wrecherFichCree;

	

	@FindBy(how = How.ID, using = agendaRisque)
	public static WebElement WagendaRisque;

	@FindBy(how = How.ID, using = btnrechercher)
	public static WebElement Wbtnrecher;

	@FindBy(how = How.ID, using = rechercher)
	public static WebElement Wrecher;

	@FindBy(how = How.ID, using = retour)
	public static WebElement Wretour;
	@FindBy(how = How.ID, using = Numfiche)
	public static WebElement WNumfiche;

	@FindBy(how = How.ID, using = AjouteRisque)
	public static WebElement WAjouteRisque;
	@FindBy(how = How.ID, using = imapct)
	public static WebElement Wimpact;
	@FindBy(how = How.ID, using = site)
	public static WebElement Wsite;
	@FindBy(how = How.ID, using = validerRisque)
	public static WebElement WvaliderFicherRisque;

	@FindBy(how = How.ID, using = object)
	public static WebElement wobject;
	@FindBy(how = How.ID, using = objectif)
	public static WebElement wobjectif;
	@FindBy(how = How.ID, using = source)
	public static WebElement Wsource;
	@FindBy(how = How.ID, using = Evenment)
	public static WebElement wevenment;
	@FindBy(how = How.ID, using = enjeu)
	public static WebElement Wenjeu;
	@FindBy(how = How.ID, using = ListDomaine)
	public static WebElement WListDomaine;
	@FindBy(how = How.ID, using = Processus)
	public static WebElement WProcessus;
	@FindBy(how = How.ID, using = activite)
	public static WebElement Wactivite;
	@FindBy(how = How.ID, using = drection)
	public static WebElement Wdrection;
	@FindBy(how = How.ID, using = Service)
	public static WebElement Wservice;

	@FindBy(how = How.ID, using = MENU_ID)
	public static WebElement menuID;

	@FindBy(how = How.CSS, using = risqueOpp)
	public static WebElement WrisqueOpp;

	@FindBy(how = How.CSS, using = sousRisqueopp)
	public static WebElement WsousRisquOpp;

	@FindBy(how = How.CSS, using = ficherRisquOpp)
	public static WebElement WficherRisqueopp;

	@FindBy(how = How.LINK_TEXT, using = "Risque Opportunité")
	public static WebElement LWficherRisqueopp;

}
