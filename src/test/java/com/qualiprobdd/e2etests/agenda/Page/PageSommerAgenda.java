package com.qualiprobdd.e2etests.agenda.Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.qualiprobdd.e2etests.util.AbstractPage;

public class PageSommerAgenda extends AbstractPage {

	public PageSommerAgenda(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public static final String metrologie = "ctl00_label_lb_disp";
	public static final String partierIntersse = "ctl00_label_LB_part";

	public static final String dialogue = "ctl00_ContentPlaceHolder1_Nbr_dialog";

	public static final String encours = "ctl00_ContentPlaceHolder1_Nbr_DocEncours";

	public static final String redacteur = "ctl00_ContentPlaceHolder1_Nbr_DocRedac";

	public static final String approbateur = "ctl00_ContentPlaceHolder1_Nbr_Approb";
	public static final String consulter = "ctl00_ContentPlaceHolder1_LinkButton5";
	public static final String diffusion = "ctl00_ContentPlaceHolder1_LbAttenteDiff";
	public static final String verificateur = "ctl00_ContentPlaceHolder1_Nbr_Verif";
	public static final String reviser = "ctl00_ContentPlaceHolder1_Nbr_Revis";
	public static final String info = "ctl00_ContentPlaceHolder1_Nbr_info";
	public static final String comm = "ctl00_ContentPlaceHolder1_Nbr_comment";
	public static final String docAconsulter = "ctl00_ContentPlaceHolder1_LinkButton6";
	public static final String iddoct = "ctl00_label_lb_doc";

	public static final String refuse = "ctl00_ContentPlaceHolder1_Label34";
	public static final String valider = "ctl00_ContentPlaceHolder1_num1";
	public static final String realise = "ctl00_ContentPlaceHolder1_num2";
	public static final String suivi = "ctl00_ContentPlaceHolder1_num3";
	public static final String audit = "ctl00_ContentPlaceHolder1_num4";
	public static final String cloture = "ctl00_ContentPlaceHolder1_Label_NumActClot";
	public static final String BD = "ctl00_ContentPlaceHolder1_num5";
	public static final String BDSuivi = "ctl00_ContentPlaceHolder1_Label13";
	public static final String idAgendaAction = "ctl00_label_lb_act";

	public static final String infoAudit = "ctl00_ContentPlaceHolder1_Label29";
	public static final String audite = "ctl00_ContentPlaceHolder1_num1";
	public static final String auditeur = "ctl00_ContentPlaceHolder1_num2";
	public static final String reportAudit = "ctl00_ContentPlaceHolder1_num_audit_report";
	public static final String AuditConsulter = "ctl00_ContentPlaceHolder1_num4";
	public static final String ClotAudit = "ctl00_ContentPlaceHolder1_num5";
	public static final String totalAudit = "ctl00_label_lb_aud";
	public static final String IndicateurSuivi = "ctl00_ContentPlaceHolder1_num1";

	public static final String IndecateurTotal = "ctl00_label_obj";
	public  static   final  String   IndiInfo="ctl00_ContentPlaceHolder1_num";

	public static final String indicteurFc = "ctl00_ContentPlaceHolder1_LblNumFC";

	public static final String RisqueTotal = "ctl00_label_lb_risq";
	public static final String EvalRisque = "ctl00_ContentPlaceHolder1_Lblevalrisq";

	public static final String InfoRisque = "ctl00_ContentPlaceHolder1_LabelNbInfo_forcefaibl";

	public static final String InfoEnju = "ctl00_ContentPlaceHolder1_LblEnjeuInfo";

	public static final String infoPnc = "ctl00_ContentPlaceHolder1_Label7";
	public static final String validerPNC = "ctl00_ContentPlaceHolder1_Label_NumValider";
	public static final String effectuePNC = "ctl00_ContentPlaceHolder1_LabelInvestReal";
	public static final String traitementPNc = "ctl00_ContentPlaceHolder1_num1";
	public static final String ApprovePNc = "ctl00_ContentPlaceHolder1_LabelInvestApp";
	public static final String traitPNC = "ctl00_ContentPlaceHolder1_num2";
	public static final String SuiviPnc = "ctl00_ContentPlaceHolder1_num3";
	public static final String FinalPNc = "ctl00_ContentPlaceHolder1_Label12";
	public static final String PNCTotal = "ctl00_label_lb_nconf";
	 public  static  final  String infoClient ="ctl00_ContentPlaceHolder1_Label6";
	 public  static  final  String  effCleint="ctl00_ContentPlaceHolder1_LabelInvestReal";
	 public  static  final  String suiviClient ="ctl00_ContentPlaceHolder1_num2";
	 public  static  final  String  traitementCleint="ctl00_ContentPlaceHolder1_num";
	 public  static  final  String  totalClient="ctl00_label_lb_rec";
	 
	public   static   final String  infoFro="ctl00_ContentPlaceHolder1_Label7";
	
public  static   final  String  totalFor ="ctl00_label_lb_frs";

public   static   final   String  infoReunion="ctl00_ContentPlaceHolder1_Label5";
public  static   final   String   planReun="ctl00_ContentPlaceHolder1_num";
public   static   final   String   totalReun="ctl00_label_lb_reun";
public  static   final  String  MetTrait ="ctl00_ContentPlaceHolder1_num";
public  static   final  String  MetRR ="ctl00_ContentPlaceHolder1_Label_NumRR";

 public  static   final  String GRHPLN ="ctl00_ContentPlaceHolder1_Label_NumHab";
 public  static   final  String  GRHREFU="ctl00_ContentPlaceHolder1_Num_Refuse";
 public  static   final  String  GRHVAL ="ctl00_ContentPlaceHolder1_num";
 public  static   final  String  GRHINFO="ctl00_ContentPlaceHolder1_Label29";
 public  static   final  String  GRHFORPL="ctl00_ContentPlaceHolder1_num2";
 public  static   final  String  GRHCHAUD="ctl00_ContentPlaceHolder1_num4";
 public  static   final  String  GRHFROID="ctl00_ContentPlaceHolder1_num3";
 public  static   final  String GRHPPRSO ="ctl00_ContentPlaceHolder1_LabelEnquete";
 public  static   final  String  GRHTRAIT="ctl00_ContentPlaceHolder1_Labeldemandedevisa";
 public  static   final  String  GRHRETOUR="ctl00_ContentPlaceHolder1_LblConfdate";
 public  static   final  String  GRHCIN="ctl00_ContentPlaceHolder1_Expi_passeport";
 public  static   final  String  GRHINFORMA="ctl00_ContentPlaceHolder1_Lblsoldeinfo";
 public  static   final  String GRHDES ="ctl00_ContentPlaceHolder1_Lblsolde_decision";
 public  static   final  String  GRHTOTAL="ctl00_label_lb_form";
 public  static   final String PIINFO ="ctl00_ContentPlaceHolder1_labelNbInfo";
 public  static   final String PITRAIT="ctl00_ContentPlaceHolder1_LabelNbTrait";
 
  public  static   final String  EnviInfo="ctl00_ContentPlaceHolder1_LabelNbInfo";
  public  static   final String EnvVAl ="ctl00_ContentPlaceHolder1_Label1";
  public  static   final String  EnvTrait="ctl00_ContentPlaceHolder1_num2";
  public  static   final String inciTrait ="ctl00_ContentPlaceHolder1_Label23";
  public  static   final String EnvClot ="ctl00_ContentPlaceHolder1_num3";
  public  static   final String  EnviTraitment="ctl00_ContentPlaceHolder1_num1";
  public  static   final String  Envtotal="ctl00_label_lb_env";
  
  public   static   final  String SecuEval="ctl00_ContentPlaceHolder1_Label_NumRisqEval";
  public   static   final  String SecuClot="ctl00_ContentPlaceHolder1_Label_NumRisque";
  public   static   final  String SecuInfo="ctl00_ContentPlaceHolder1_LabelNbInfo";
  public   static   final  String SecuVald="ctl00_ContentPlaceHolder1_Label18";
  public   static   final  String SecuTraitement="ctl00_ContentPlaceHolder1_num1";
  public   static   final  String SecuTrait="ctl00_ContentPlaceHolder1_num2";
  public   static   final  String SecuClotIn="ctl00_ContentPlaceHolder1_num3";
  public   static   final  String SecuUrg="ctl00_ContentPlaceHolder1_Label9";
  public   static   final  String SecuViste="ctl00_ContentPlaceHolder1_Label25";
  public   static   final  String SecuTotale="ctl00_label_lb_secur";
  public  static   final  String  DocInfo="ctl00_ContentPlaceHolder1_LinkButton_EnregInfo";
  public   static   final   String  TotalReg="ctl00_label_lbConfReg";
  public   static   final   String  RegEva="ctl00_ContentPlaceHolder1_LabelEnCours";

  public   static   final   String  ExsiReg="ctl00_ContentPlaceHolder1_LabelEnCours0";
 
  public  static final   String   SecuCor="ctl00_ContentPlaceHolder1_Label21";
  public   static   final   String recTrait ="ctl00_ContentPlaceHolder1_num1";
  public   static   final   String  recFinal="ctl00_ContentPlaceHolder1_LabelApprobFinal";
  public   static   final   String corige ="ctl00_ContentPlaceHolder1_Label4";
  public   static   final   String  dechet="ctl00_ContentPlaceHolder1_LabelApprobFinal";
  public  static   final String  EvaFormaParti="ctl00_ContentPlaceHolder1_Label28";
  @FindBy(how = How.ID, using = EvaFormaParti )
  public static WebElement wEvaFormaParti;
  public  static   final String EnriSatiPer="ctl00_ContentPlaceHolder1_LabelEnregEnq";
  @FindBy(how = How.ID, using = EnriSatiPer )
  public static WebElement wEnriSatiPer;
  
  @FindBy(how = How.ID, using = dechet )
  public static WebElement wEnEnvDechet;
  @FindBy(how = How.ID, using = corige )
  public static WebElement wEnEnvCorrige;
  
  @FindBy(how = How.ID, using = SecuCor )
  public static WebElement wSecuCor;
  @FindBy(how = How.ID, using = TotalReg )
  public static WebElement wTotalReg;
  @FindBy(how = How.ID, using = RegEva )
  public static WebElement wRegEval;
  @FindBy(how = How.ID, using = ExsiReg )
  public static WebElement wExiReg;
  
  @FindBy(how = How.ID, using = recTrait )
  public static WebElement wrecTrait;
  @FindBy(how = How.ID, using = recFinal )
  public static WebElement wRecFinal;
  @FindBy(how = How.ID, using = DocInfo )
  public static WebElement wDocInfo;

  @FindBy(how = How.ID, using = IndiInfo )
  public static WebElement wIndInfo;
  
  @FindBy(how = How.ID, using = SecuEval )
  public static WebElement wSecuEval;
  @FindBy(how = How.ID, using =SecuClot)
  public static WebElement wSecuClot;
  @FindBy(how = How.ID, using =SecuInfo )
  public static WebElement wSecuInfo;
  @FindBy(how = How.ID, using =SecuVald )
  public static WebElement wSecuVald;
  @FindBy(how = How.ID, using =SecuTraitement )
  public static WebElement wSecuTraitment;
  @FindBy(how = How.ID, using =SecuTrait )
  public static WebElement wSecuTrait;
  @FindBy(how = How.ID, using =SecuClotIn )
  public static WebElement wSecuclotIn;
  @FindBy(how = How.ID, using =SecuUrg )
  public static WebElement wSecuUrg;
  @FindBy(how = How.ID, using =SecuViste )
  public static WebElement wSecuViste;
  @FindBy(how = How.ID, using =SecuTotale )
  public static WebElement wSecuTotal;
 
  @FindBy(how = How.ID, using =EnviInfo )
  public static WebElement wEnvInfo;
  @FindBy(how = How.ID, using =EnvVAl )
  public static WebElement wEnvival;
  @FindBy(how = How.ID, using = EnviTraitment)
  public static WebElement wEnviTrait;
  @FindBy(how = How.ID, using =EnvTrait )
  public static WebElement wEnvtrait;
  @FindBy(how = How.ID, using =EnvClot)
  public static WebElement wEnEnvClot
  ;
  @FindBy(how = How.ID, using =inciTrait )
  public static WebElement wincidinetrait;
  @FindBy(how = How.ID, using =Envtotal )
  public static WebElement wEnvtotal;
  
 @FindBy(how = How.ID, using =PIINFO )
 public static WebElement wPIINFO;
 @FindBy(how = How.ID, using =PITRAIT )
 public static WebElement wPITRAIT;

 @FindBy(how = How.ID, using =GRHPLN )
 public static WebElement wGRHPLN;
 @FindBy(how = How.ID, using =GRHREFU )
 public static WebElement wGRHREFU; 
 @FindBy(how = How.ID, using =GRHVAL )
 public static WebElement wGRHVAL; 
 @FindBy(how = How.ID, using =GRHINFO )
 public static WebElement wGRHINFO; 
 @FindBy(how = How.ID, using =GRHFORPL )
 public static WebElement wGRHFORPL;
 @FindBy(how = How.ID, using =GRHCHAUD )
 public static WebElement wGRHCHAUD; 
 @FindBy(how = How.ID, using = GRHFROID)
 public static WebElement wGRHFROID;
 @FindBy(how = How.ID, using =GRHPPRSO )
 public static WebElement wGRHPRSO;
 @FindBy(how = How.ID, using = GRHTRAIT)
 public static WebElement wGRHTRAIT;
 
 @FindBy(how = How.ID, using = GRHRETOUR)
 public static WebElement wGRHRETOUR; 
 @FindBy(how = How.ID, using =GRHCIN )
 public static WebElement wGRHCIN;
 @FindBy(how = How.ID, using =GRHINFORMA )
 public static WebElement wGRHinforma;
 @FindBy(how = How.ID, using = GRHDES)
 public static WebElement wGRHDES;
 @FindBy(how = How.ID, using = GRHTOTAL)
 public static WebElement wGRHTOTAL;


@FindBy(how = How.ID, using =MetRR )
public static WebElement wMetRR;
@FindBy(how = How.ID, using =MetTrait )
public static WebElement wMetTrait;


@FindBy(how = How.ID, using =infoReunion )
public static WebElement winfoReunion;
@FindBy(how = How.ID, using =totalReun )
public static WebElement wtotalReun;

 @FindBy(how = How.ID, using =planReun )
	public static WebElement wplanReun;

@FindBy(how = How.ID, using =infoFro )
	public static WebElement winfoFro;
@FindBy(how = How.ID, using =totalFor )
	public static WebElement wtotalFort;
	
	 @FindBy(how = How.ID, using =infoClient )
		public static WebElement winfoClient;
	 @FindBy(how = How.ID, using =effCleint )
		public static WebElement weffClient;
	 @FindBy(how = How.ID, using =suiviClient )
		public static WebElement wsuiviClient;
	 @FindBy(how = How.ID, using =traitementCleint )
		public static WebElement wtraitementCleint;
	 @FindBy(how = How.ID, using =totalClient )
		public static WebElement wtotalClient;
	
	 
	 

	@FindBy(how = How.ID, using = FinalPNc)
	public static WebElement wfinalPNC;

	@FindBy(how = How.ID, using = infoPnc)
	public static WebElement winfoPNC;

	@FindBy(how = How.ID, using = validerPNC)
	public static WebElement wValiderPNC;
	@FindBy(how = How.ID, using = effectuePNC)
	public static WebElement weffectuePnc;

	@FindBy(how = How.ID, using = traitementPNc)
	public static WebElement wtraitementPNC;

	@FindBy(how = How.ID, using = ApprovePNc)
	public static WebElement wApprovePnc;

	@FindBy(how = How.ID, using = traitPNC)
	public static WebElement wtraitPNC;
	@FindBy(how = How.ID, using = SuiviPnc)
	public static WebElement wSuivPnc;

	@FindBy(how = How.ID, using = PNCTotal)
	public static WebElement wPNCTotal;

	@FindBy(how = How.ID, using = RisqueTotal)
	public static WebElement wRisqueTotal;
	@FindBy(how = How.ID, using = EvalRisque)
	public static WebElement wEvalRisque;
	@FindBy(how = How.ID, using = InfoRisque)
	public static WebElement wInfoRisque;
	@FindBy(how = How.ID, using = InfoEnju)
	public static WebElement wInfoInfoEnju;

	@FindBy(how = How.ID, using = IndicateurSuivi)
	public static WebElement wIndicateurSuivi;

	@FindBy(how = How.ID, using = IndecateurTotal)
	public static WebElement wIndecateurTotal;

	@FindBy(how = How.ID, using = indicteurFc)
	public static WebElement wIndecateurFc;

	@FindBy(how = How.ID, using = infoAudit)
	public static WebElement winfoAudit;

	@FindBy(how = How.ID, using = audite)
	public static WebElement waudite;
	@FindBy(how = How.ID, using = auditeur)
	public static WebElement wauditeur;
	@FindBy(how = How.ID, using = reportAudit)
	public static WebElement wreportAudit;
	@FindBy(how = How.ID, using = AuditConsulter)
	public static WebElement wAuditConsulter;
	@FindBy(how = How.ID, using = ClotAudit)
	public static WebElement wClotAudit;
	@FindBy(how = How.ID, using = totalAudit)
	public static WebElement wtotalAudit;

	@FindBy(how = How.ID, using = idAgendaAction)
	public static WebElement widAgendaAction;
	@FindBy(how = How.ID, using = realise)
	public static WebElement wrealise;

	@FindBy(how = How.ID, using = refuse)
	public static WebElement wrefuse;
	@FindBy(how = How.ID, using = valider)
	public static WebElement wvalider;
	@FindBy(how = How.ID, using = suivi)
	public static WebElement wSuivi;

	@FindBy(how = How.ID, using = audit)
	public static WebElement waudit;
	@FindBy(how = How.ID, using = cloture)
	public static WebElement wcloture;
	@FindBy(how = How.ID, using = BD)
	public static WebElement wBD;
	@FindBy(how = How.ID, using = BDSuivi)
	public static WebElement wBDSuivi;

	@FindBy(how = How.ID, using = iddoct)
	public static WebElement widdoct;

	@FindBy(how = How.ID, using = verificateur)
	public static WebElement wverificateur;
	@FindBy(how = How.ID, using = dialogue)
	public static WebElement wdialogue;
	@FindBy(how = How.ID, using = metrologie)
	public static WebElement wmetrologie;

	@FindBy(how = How.ID, using = encours)
	public static WebElement wencours;

	@FindBy(how = How.ID, using = redacteur)
	public static WebElement wredacteur;

	@FindBy(how = How.ID, using = approbateur)
	public static WebElement wapprobateur;

	@FindBy(how = How.ID, using = consulter)
	public static WebElement wconsulter;

	@FindBy(how = How.ID, using = diffusion)
	public static WebElement wdiffusion;

	@FindBy(how = How.ID, using = reviser)
	public static WebElement wreviser;

	@FindBy(how = How.ID, using = info)
	public static WebElement winfo;

	@FindBy(how = How.ID, using = comm)
	public static WebElement wcomm;

	@FindBy(how = How.ID, using = docAconsulter)
	public static WebElement wdocAconsulter;

	@FindBy(how = How.ID, using = partierIntersse)
	public static WebElement wpartierIntersse;

}