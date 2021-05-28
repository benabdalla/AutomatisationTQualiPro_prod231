package com.qualiprobdd.e2etests.GRH.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.qualiprobdd.e2etests.util.AbstractPage;

public class SatisPersonnelPage extends AbstractPage{
	public SatisPersonnelPage(WebDriver driver) 
	{
		super(driver);
	}
	final static String M_SATISFACTION_GRH_XPATH="//*[@id=\"cssmenu15\"]/div/div/ul/li[11]/ul/li[3]/a";
	final static String M_QUESTIONNAIRE_GRH_XPATH="//*[@id=\"cssmenu15\"]/div/div/ul/li[11]/ul/li[3]/ul/li[2]/a";
	final static String M_ENQUETE_GRH_XPATH="//*[@id=\"cssmenu15\"]/div/div/ul/li[11]/ul/li[3]/ul/li[1]/a";
	final static String TITRE_QUESTIONNAIRE_ID="ctl00_ContentPlaceHolder1_ListBox_TypeQ";
	final static String TYPE_ENQUETE_ID ="ctl00_ContentPlaceHolder1_ListBox_Type";
	final static String SITE_ID="ctl00_ContentPlaceHolder1_dd_site";
	final static String PROCESSUS_ID="ctl00_ContentPlaceHolder1_lBProcessus_";
	final static String ACTIVITE_ID="ctl00_ContentPlaceHolder1_lBDomaine_";
	final static String DIRECTION_ID="ctl00_ContentPlaceHolder1_LBDirection_";
	final static String SERVICE_ID="ctl00_ContentPlaceHolder1_lBService_";
	final static String VLD_ENQUETE_ID="ctl00_ContentPlaceHolder1_Valider";
	final static String RATTACHER_EMPLOYE_ID="ctl00_ContentPlaceHolder1_LinkButtonSelectEmp";
	final static String RECH_EMP_ID="//*[@id=\"ctl00_ContentPlaceHolder1_GridView_EmployeRat_filter\"]/label/input";
	final static String GRID_EMP_ID="ctl00_ContentPlaceHolder1_GridView_EmployeRat";
	final static String VLD_EMP_ID="ctl00_ContentPlaceHolder1_LinkButton9";
	final static String RATT_GROUP_EMP_ID="ctl00_ContentPlaceHolder1_LinkButtonSelectG";
	final static String RECH_GROUP_EMP_ID="//*[@id=\"ctl00_ContentPlaceHolder1_GridView_Groupe_filter\"]/label/input";
	final static String GRID_GROUP_EMP_ID="ctl00_ContentPlaceHolder1_GridView_Groupe";
	final static String VLD_GROUP_EMP_ID="ctl00_ContentPlaceHolder1_LinkButton5";
	final static String AJT_PERSONNE_HABILITE_ID="ctl00_ContentPlaceHolder1_LinkButtonAddHab";
	final static String RECH_PERSONNE_HABILITE_ID="//*[@id=\"ctl00_ContentPlaceHolder1_GridView_HabiliteRat_filter\"]/label/input";
	final static String GRID_PERSONNE_HABILITE_ID="ctl00_ContentPlaceHolder1_GridView_HabiliteRat";
	final static String VLD_PERSONNE_HABILITE_ID="ctl00_ContentPlaceHolder1_LinkButton8";
	final static String AJT_PIECE_JOINTE_ID="ctl00_ContentPlaceHolder1_PJ";
	final static String AGD_RH_ID="ctl00_LKB_badge_rh";
	//final static String AGD_RH_ID="ctl00_lb_form";

	final static String SP_ENQ_SAT_ID="Span7";
	final static String AGD_RECH_ENQ_ID="//*[@id=\"ctl00_ContentPlaceHolder1_GridView_Enquete_filter\"]/label/input";
	final static String AGD_GRID_ENQ_ID="ctl00_ContentPlaceHolder1_GridView_Enquete";
	final static String SP_ENQ_SAT_ENR_ID="Span8";
	final static String AGD_RECH_ENQ_ENR_ID="//*[@id=\"ctl00_ContentPlaceHolder1_GridView_EnregEnq_filter\"]/label/input";
	final static String AGD_GRID_ENQ_ENR_ID="ctl00_ContentPlaceHolder1_GridView_EnregEnq";
	
	@FindBy(how = How.ID, using = AJT_PIECE_JOINTE_ID)
	public static WebElement AjtPJId;
	@FindBy(how = How.XPATH, using = M_SATISFACTION_GRH_XPATH)
	public static WebElement MSatisfactionGrhId;	
	@FindBy(how = How.XPATH, using = M_QUESTIONNAIRE_GRH_XPATH)
	public static WebElement MQuestionnaireGrhId;	
	@FindBy(how = How.XPATH, using = M_ENQUETE_GRH_XPATH)
	public static WebElement MEnqueteGrhId;
	@FindBy(how = How.ID, using = TITRE_QUESTIONNAIRE_ID)
	public static WebElement SelectQuestPersonnelId;	
	@FindBy(how = How.ID, using = TYPE_ENQUETE_ID )
	public static WebElement TypeEnqueteId;	
	@FindBy(how = How.ID, using = SITE_ID)
	public static WebElement SiteId;	
	@FindBy(how = How.ID, using = PROCESSUS_ID)
	public static WebElement ProcessusId;	
	@FindBy(how = How.ID, using = ACTIVITE_ID)
	public static WebElement ActiviteId;	
	@FindBy(how = How.ID, using = DIRECTION_ID)
	public static WebElement DirectionId;	
	@FindBy(how = How.ID, using = SERVICE_ID)
	public static WebElement ServiceId;	
	@FindBy(how = How.ID, using = VLD_ENQUETE_ID)
	public static WebElement VldEnqueteId;	
	@FindBy(how = How.ID, using = RATTACHER_EMPLOYE_ID)
	public static WebElement RattEmpId;	
	@FindBy(how = How.XPATH, using = RECH_EMP_ID)
	public static WebElement RechEmpId;	
	@FindBy(how = How.ID, using = GRID_EMP_ID)
	public static WebElement GridEmpId;	
	@FindBy(how = How.ID, using = VLD_EMP_ID)
	public static WebElement VldEmpId;	
	@FindBy(how = How.ID, using = RATT_GROUP_EMP_ID)
	public static WebElement RattGroupEmpId;	
	@FindBy(how = How.XPATH, using = RECH_GROUP_EMP_ID)
	public static WebElement RechGroupEmpId;	
	@FindBy(how = How.ID, using = GRID_GROUP_EMP_ID)
	public static WebElement GridGroupEmpId;	
	@FindBy(how = How.ID, using = VLD_GROUP_EMP_ID)
	public static WebElement VldGroupEmpId;	
	@FindBy(how = How.ID, using = AJT_PERSONNE_HABILITE_ID)
	public static WebElement AjtPersHabilId;	
	@FindBy(how = How.XPATH, using = RECH_PERSONNE_HABILITE_ID)
	public static WebElement RechPersHabiId;	
	@FindBy(how = How.ID, using = GRID_PERSONNE_HABILITE_ID)
	public static WebElement GridPersHabilitId;	
	@FindBy(how = How.ID, using = VLD_PERSONNE_HABILITE_ID)
	public static WebElement VldPersHabilitId;	
	@FindBy(how = How.ID, using = AGD_RH_ID)
	public static WebElement AgendaRHId;
	@FindBy(how = How.ID, using = SP_ENQ_SAT_ID)
	public static WebElement SPAGDENQSATId;
	@FindBy(how = How.XPATH, using = AGD_RECH_ENQ_ID)
	public static WebElement AgdRechEnqId;
	@FindBy(how = How.ID, using = AGD_GRID_ENQ_ID)
	public static WebElement AgdGridEnqId;
	@FindBy(how = How.ID, using = SP_ENQ_SAT_ENR_ID)
	public static WebElement SpEnqSatENregId;
	@FindBy(how = How.XPATH, using = AGD_RECH_ENQ_ENR_ID)
	public static WebElement AgdRechEnqEnregId;
	@FindBy(how = How.ID, using = AGD_GRID_ENQ_ENR_ID)
	public static WebElement AgdGridEnqEnrgiId;
	
	
}
