package com.qualiprobdd.e2etests.Sécurité.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class IncidentSecPage {
	final static String MENU_ID ="ctl00_menuModal";
	final static String HOME_ID="ctl00_LinkButtonHome";
	final static String MENU_SEC_XPATH="//*[@id=\"cssmenu15\"]/div/div/ul/li[14]/a";
	final static String MENU_INC_SEC_XPATH="//*[@id=\"cssmenu15\"]/div/div/ul/li[14]/ul/li[2]/a";
	final static String MENU_INCS_XPATH="//*[@id=\"cssmenu15\"]/div/div/ul/li[14]/ul/li[2]/ul/li[1]/a";
	final static String AJT_INCS_ID="ctl00_ContentPlaceHolder1_Ajouter";
	
	final static String DESIGNATION_INC_ID="ctl00_ContentPlaceHolder1_TextBoxDesig";
	final static String TYP_INC_ID="ctl00_ContentPlaceHolder1_dd_type_incident";
	final static String CAT_INC_ID="ctl00_ContentPlaceHolder1_dd_categorie";
	final static String HEURE_INC_ID="ctl00_ContentPlaceHolder1_Text_HeureR";
	final static String DATE_INC_ID="ctl00_ContentPlaceHolder1_datenais";
	final static String DETEC_INC_ID="ctl00_ContentPlaceHolder1_txtEditDetect";
	final static String NINTER_INC_ID="ctl00_ContentPlaceHolder1_ninter";
	final static String SEMAINE_INC_ID="ctl00_ContentPlaceHolder1_DropDownList_semaines";
	final static String NBRE_JOUR_INC="ctl00_ContentPlaceHolder1_tb_nomjour";
	final static String SITE_INC_ID="ctl00_ContentPlaceHolder1_dd_site";
	final static String PROCESSUS_INC_ID="ctl00_ContentPlaceHolder1_lBProcessus_";
	final static String ACTIVITE_INC_ID="ctl00_ContentPlaceHolder1_lBDomaine_";
	final static String DIRECTION_INC_ID="ctl00_ContentPlaceHolder1_ListBox_Direction";
	final static String SERVICE_INC_ID="ctl00_ContentPlaceHolder1_lBService_";
	final static String SECTEUR_INC_ID="ctl00_ContentPlaceHolder1_dd_sect";
	final static String POST_INC_ID="ctl00_ContentPlaceHolder1_dd_posteTravail";
	
	
	final static String DESC_INC_ID="ctl00_ContentPlaceHolder1_tb_descinc";
	final static String GRAV_INC_ID="ctl00_ContentPlaceHolder1_dd_gravite";
	final static String ISPS_INC_ID="ctl00_ContentPlaceHolder1_LbISPS";
	final static String DESC_CAUS_ID="ctl00_ContentPlaceHolder1_tb_descaus";
	final static String COUT_INC_ID="ctl00_ContentPlaceHolder1_DDLcout";
	final static String EVN_DEC_INC_ID="ctl00_ContentPlaceHolder1_DropDownList_event";
	final static String DESC_CONS_ID="ctl00_ContentPlaceHolder1_tb_descon";
	final static String ACT_IMM_ID="ctl00_ContentPlaceHolder1_tb_actimm";
	
	final static String RATT_TYP_CONS_XPATH="//*[@id=\"ctl00_ContentPlaceHolder1_LinkButton53\"]/span";
	final static String RECH_TYP_CONS_XPATH="//*[@id=\"ctl00_ContentPlaceHolder1_GridView_TypeConseq_Rat_filter\"]/label/input";
	final static String GRID_TYP_CONS_ID="ctl00_ContentPlaceHolder1_GridView_TypeConseq_Rat";
	final static String VLD_RATT_TYP_CONS_ID="ctl00_ContentPlaceHolder1_LinkButton58";
	
	final static String RATT_TYP_CAUSE_XPATH="//*[@id=\"ctl00_ContentPlaceHolder1_LinkButton50\"]/span";
	final static String RECH_TYP_CAUSE_XPATH="//*[@id=\"ctl00_ContentPlaceHolder1_GridView_TypeCause_Rat_filter\"]/label/input";
	final static String GRID_TYPE_CAUSE_ID="ctl00_ContentPlaceHolder1_GridView_TypeCause_Rat";
	final static String VLD_TYPE_CAUSE_ID="ctl00_ContentPlaceHolder1_LinkButton62";
	
	final static String RATT_SITE_LIAI_XPATH="//*[@id=\"ctl00_ContentPlaceHolder1_Btn_siteDeLesionPlus\"]/span";
	final static String RECH_SITE_LIAI_XPATH="//*[@id=\"ctl00_ContentPlaceHolder1_GridView_SiteDeLesionRat_filter\"]/label/input";
	final static String GRID_SITE_LIAI_ID="ctl00_ContentPlaceHolder1_GridView_SiteDeLesionRat";
	final static String VLD_SITE_LIAI_ID="ctl00_ContentPlaceHolder1_Btn_validerSiteDeLesion";
	
	final static String RATT_CAUSE_TYP_XPATH="//*[@id=\"ctl00_ContentPlaceHolder1_Btn_CauseTypPlus\"]/span";
	final static String RECH_CAUSE_TYP_XPATH="//*[@id=\"ctl00_ContentPlaceHolder1_GridView_CauseTyp_R_filter\"]/label/input";
	final static String GRID_CAUSE_TYP_ID="ctl00_ContentPlaceHolder1_GridView_CauseTyp_R";
	final static String VLD_CAUSE_TYP_ID="ctl00_ContentPlaceHolder1_Btn_validerCauseTyp";
	
	final static String VLD_FICH_INC_ID="ctl00_ContentPlaceHolder1_Valider";
	
	final static String SP_CONF_REG_XPATH="sp_collapseConf";
	final static String SP_PERS_CONCER_XPATH="sp_collapsePers";
	final static String SP_TEMOINS_XPATH="sp_collapseTem";
	final static String SP_RISQUE_XPATH="sp_collapseRisq";
	final static String SP_SITU_URG_XPATH="sp_collapseSitUrg";
	final static String SP_REG_SEC_XPATH="sp_collapseRule";
	
	final static String RATT_CONF_ID="ctl00_ContentPlaceHolder1_LK_select_act1";
	final static String RECH_CONF_XPATH="//*[@id=\"ctl00_ContentPlaceHolder1_Gd_conf_filter\"]/label/input";
	final static String GRID_CONF_ID="ctl00_ContentPlaceHolder1_Gd_conf";
	final static String VLD_CONF_ID="ctl00_ContentPlaceHolder1_Valid_prog_conf";
	
	final static String RATT_PERS_CONC_ID="ctl00_ContentPlaceHolder1_Ajout_ListDiff";
	final static String RECH_PERS_CONC_XPATH="ctl00_ContentPlaceHolder1_TextBox17";
	final static String VLD_RECH_PERS_CONC_XPATH="ctl00_ContentPlaceHolder1_LinkButton82";
	final static String GRID_PERS_CONC_ID="ctl00_ContentPlaceHolder1_GridView_emp";
	final static String VLD_PERS_CONC_XPATH="ctl00_ContentPlaceHolder1_Valider_LD";
	final static String AJT_CONC_ID="ctl00_ContentPlaceHolder1_LinkButton64";
	final static String NOM_CONC_ID="ctl00_ContentPlaceHolder1_TextBoxNomExt";
	final static String ORGA_CONC_ID="ctl00_ContentPlaceHolder1_TextBoxOrgExt";
	final static String VLD_CONC_ID="ctl00_ContentPlaceHolder1_LinkButtonValidExt";
	
	final static String RATT_TEM_ID="ctl00_ContentPlaceHolder1_LinkButton8";
	final static String RECH_TEM_XPATH="ctl00_ContentPlaceHolder1_TextBox21";
	final static String VLD_RECH_TEM_XPATH="ctl00_ContentPlaceHolder1_LinkButton83";
	final static String GRID_TEM_ID="ctl00_ContentPlaceHolder1_GridView4";
	final static String VLD_TEM_XPATH="ctl00_ContentPlaceHolder1_LinkButton12";
	
	final static String RATT_RIS_ID="ctl00_ContentPlaceHolder1_LinkButton42";
	final static String RECH_RIS_XPATH="//*[@id=\"ctl00_ContentPlaceHolder1_GridView9_filter\"]/label/input";
	final static String GRID_RIS_ID="ctl00_ContentPlaceHolder1_GridView9";
	final static String VLD_RIS_XPATH="ctl00_ContentPlaceHolder1_LinkButton48";
	
	final static String RATT_SIT_URG_ID="ctl00_ContentPlaceHolder1_LinkButton11";
	final static String RECH_SIT_URG_XPATH="//*[@id=\"ctl00_ContentPlaceHolder1_G4_filter\"]/label/input";
	final static String GRID_SIT_URG_ID="ctl00_ContentPlaceHolder1_G4";
	final static String VLD_SIT_URG_ID="ctl00_ContentPlaceHolder1_Lk_valid_act";
	
	final static String AVEC_REG_SEC_ID="ctl00_ContentPlaceHolder1_rblRule_1";
	final static String VLD_REG_SEC_ID="ctl00_ContentPlaceHolder1_LinkButton_ValidRegle";
	
	
	
	final static String AGD_SEC_ID="ctl00_lb_secur";
	final static String SP_INC_A_VLD_XPATH="//*[@id=\"ctl00_ContentPlaceHolder1_Panel_IncidValider\"]/div[1]/h4/a/span";
	final static String RECH_INC_A_VLD_XPATH="ctl00_ContentPlaceHolder1_GridView1_filter";
	final static String GRID_INC_A_VLD_ID="ctl00_ContentPlaceHolder1_GridView3";
	final static String VLD_INC_ID="ctl00_ContentPlaceHolder1_LinkButton70";

	final static String CORR_INC_ID="ctl00_ContentPlaceHolder1_LinkButton413";
	final static String REF_INC_ID="ctl00_ContentPlaceHolder1_LinkButton66";
	final static String COMM_VLD_ID="ctl00_ContentPlaceHolder1_TextBox_MotifR";
	final static String CHX_DEC_ID="ctl00_ContentPlaceHolder1_Depa0";
	final static String CHX_DEC_ID2="ctl00_ContentPlaceHolder1_listBoxDecid";
	final static String idCom="ctl00_ContentPlaceHolder1_TextBoxCommentValid";
	final static String SP_INC_A_CORR_XPATH="//*[@id=\"ctl00_ContentPlaceHolder1_Panel_IncidCorriger\"]/div[1]/h4/a/span";
	final static String RECH_INC_A_CORR_XPATH="//*[@id=\"ctl00_ContentPlaceHolder1_GridView4_filter\"]/label/input";
	final static String GRID_INC_A_CORR_ID="ctl00_ContentPlaceHolder1_GridView2";
	final static String SP_INC_A_DEC_XPATH="//*[@id=\"ctl00_ContentPlaceHolder1_Panel_DeciTrait\"]/div[1]";
	final static String RECH_INC_A_DEC_XPATH="//*[@id=\"ctl00_ContentPlaceHolder1_GridView8_filter\"]/label/input";
	final static String GRID_INC_A_DEC_ID="ctl00_ContentPlaceHolder1_GridView8";
	final static String SELEC_RESP_TRAIT_ID="ctl00_ContentPlaceHolder1_Lk_resp_trait";
	final static String RECH_RESP_TRAIT_XPATH="ctl00_ContentPlaceHolder1_TextBox16";
	final static String VLD_RECH_RESP_TRAIT_XPATH="ctl00_ContentPlaceHolder1_LinkButton81";
	final static String GRID_RESP_TRAIT_ID="ctl00_ContentPlaceHolder1_GridView12";
	final static String RESP_CLOT_ID="ctl00_ContentPlaceHolder1_listBoxRespClot";
	final static String DELAI_TAIT_ID="ctl00_ContentPlaceHolder1_Txt_delai_trait";
	final static String CAUSE_DEC_INC_ID="ctl00_ContentPlaceHolder1_Txt_cause";
	final static String TRAIT_DEC_INC_ID="ctl00_ContentPlaceHolder1_Txt_trait";
	//final static String ACC_DEC_ID="ctl00_ContentPlaceHolder1_RB_trait_1";
	//final static String NC_DEC_ID="ctl00_ContentPlaceHolder1_RB_trait_2";
	final static String VLD_DEC_ID="ctl00_ContentPlaceHolder1_Lk_valid_trait";
	
	final static String SP_INC_A_TRAIT_XPATH="//*[@id=\"ctl00_ContentPlaceHolder1_Panel_IncidTrait\"]/div[1]/h4/a/span";
	final static String RECH_INC_A_TRAIT_XPATH="//*[@id=\"ctl00_ContentPlaceHolder1_GridView1_filter\"]/label/input";
	final static String GRID_INC_A_TRAIT_ID="ctl00_ContentPlaceHolder1_GridView1";
	final static String ETAT_INC_A_TRAIT_ID="ctl00_ContentPlaceHolder1_rb_traitee_1";
	final static String DATE_TRAIT_INC_ID="ctl00_ContentPlaceHolder1_Txt_date_trait";
	final static String COUT_TRAIT_INC_ID="ctl00_ContentPlaceHolder1_Txt_cout_trait";
	final static String RAP_TRAIT_INC_ID="ctl00_ContentPlaceHolder1_Txt_Rap_Trait";
	final static String VLD_TRAIT_INC_ID="ctl00_ContentPlaceHolder1_Lk_trait";
	
	final static String SP_INC_A_CLOT_XPATH="//*[@id=\"ctl00_ContentPlaceHolder1_Panel_IncidClot\"]/div[1]/h4/a/span";
	final static String RECH_INC_A_CLOT_XPATH="//*[@id=\"ctl00_ContentPlaceHolder1_GridView2_filter\"]/label/input";
	final static String GRID_INC_A_CLOT_ID="ctl00_ContentPlaceHolder1_GridView2";
	final static String ETAT_INC_A_CLOT_ID="ctl00_ContentPlaceHolder1_rb_cloture_1";
	final static String RAP_CLOT_INC_ID="ctl00_ContentPlaceHolder1_tb_comm";
	final static String RAP_CLOT_INC_ID2="ctl00_ContentPlaceHolder1_Txt_RAP_CLOT";
	final static String VLD_CLOT_INC_ID="ctl00_ContentPlaceHolder1_LinkButton_Clot";
	final static String VLD_CLOT_INC_ID2="ctl00_ContentPlaceHolder1_Lk_CLOT";
	
	
	
	
	@FindBy(how = How.ID, using =MENU_ID)
	public static WebElement MenuId;
	@FindBy(how = How.ID, using =HOME_ID)
	public static WebElement HomeId;
	
	@FindBy(how = How.XPATH, using =MENU_SEC_XPATH)
	public static WebElement MenuSecId;
	@FindBy(how = How.XPATH, using =MENU_INC_SEC_XPATH)
	public static WebElement MenuIncSecId;
	@FindBy(how = How.XPATH, using =MENU_INCS_XPATH)
	public static WebElement MenuIncSId;
	@FindBy(how = How.ID, using =AJT_INCS_ID)
	public static WebElement AjtIncId;
	
	
	@FindBy(how = How.ID, using =DESIGNATION_INC_ID)
	public static WebElement DesigIncId;
	@FindBy(how = How.ID, using =TYP_INC_ID)
	public static WebElement TypIncId;
	@FindBy(how = How.ID, using =CAT_INC_ID)
	public static WebElement CatIncId;
	@FindBy(how = How.ID, using =HEURE_INC_ID)
	public static WebElement HeureIncId;
	@FindBy(how = How.ID, using =DATE_INC_ID)
	public static WebElement DateIncId;
	@FindBy(how = How.ID, using =DETEC_INC_ID)
	public static WebElement DeteIncId;
	@FindBy(how = How.ID, using =NINTER_INC_ID)
	public static WebElement NinterId;
	@FindBy(how = How.ID, using =SEMAINE_INC_ID)
	public static WebElement SemaineIncId;
	@FindBy(how = How.ID, using =NBRE_JOUR_INC)
	public static WebElement NbreJourIncId;
	@FindBy(how = How.ID, using =SITE_INC_ID)
	public static WebElement SiteIncId;
	@FindBy(how = How.ID, using =PROCESSUS_INC_ID)
	public static WebElement ProcessIncId;
	@FindBy(how = How.ID, using =ACTIVITE_INC_ID)
	public static WebElement ActIncId;
	@FindBy(how = How.ID, using =DIRECTION_INC_ID)
	public static WebElement DirecIncId;
	@FindBy(how = How.ID, using =SERVICE_INC_ID)
	public static WebElement ServIncId;
	@FindBy(how = How.ID, using =SECTEUR_INC_ID)
	public static WebElement SectIncId;
	@FindBy(how = How.ID, using =POST_INC_ID)
	public static WebElement PostIncId;
	@FindBy(how = How.ID, using =DESC_INC_ID)
	public static WebElement DescIncId;
	@FindBy(how = How.ID, using =GRAV_INC_ID)
	public static WebElement GravIncId;
	@FindBy(how = How.ID, using =ISPS_INC_ID)
	public static WebElement IsPsIncId;
	@FindBy(how = How.ID, using =DESC_CAUS_ID)
	public static WebElement DescCausId;
	@FindBy(how = How.ID, using =COUT_INC_ID)
	public static WebElement CoutIncId;
	@FindBy(how = How.ID, using =EVN_DEC_INC_ID)
	public static WebElement EvnDecIncId;
	@FindBy(how = How.ID, using =DESC_CONS_ID)
	public static WebElement DescConsId;
	@FindBy(how = How.ID, using =ACT_IMM_ID)
	public static WebElement ActImmId;
	
	@FindBy(how = How.XPATH, using =RATT_TYP_CONS_XPATH)
	public static WebElement RattTypConsId;
	@FindBy(how = How.XPATH, using =RECH_TYP_CONS_XPATH)
	public static WebElement RechTypConsId;
	@FindBy(how = How.ID, using =GRID_TYP_CONS_ID)
	public static WebElement GridTypConsId;
	@FindBy(how = How.ID, using =VLD_RATT_TYP_CONS_ID)
	public static WebElement VldRattTypConsId;
	
	@FindBy(how = How.XPATH, using =RATT_TYP_CAUSE_XPATH)
	public static WebElement RattTypCauseId;
	@FindBy(how = How.XPATH, using =RECH_TYP_CAUSE_XPATH)
	public static WebElement RechTypCauseId;
	@FindBy(how = How.ID, using =GRID_TYPE_CAUSE_ID)
	public static WebElement GridTypCauseId;
	@FindBy(how = How.ID, using =VLD_TYPE_CAUSE_ID)
	public static WebElement VldTypeCauseId;
	
	@FindBy(how = How.XPATH, using =RATT_CAUSE_TYP_XPATH)
	public static WebElement RattCauseTypId;
	@FindBy(how = How.XPATH, using =RECH_CAUSE_TYP_XPATH)
	public static WebElement RechCauseTypId;
	@FindBy(how = How.ID, using =GRID_CAUSE_TYP_ID)
	public static WebElement GridCauseTypId;
	@FindBy(how = How.ID, using =VLD_CAUSE_TYP_ID)
	public static WebElement VldCauseTypId;
	
	@FindBy(how = How.XPATH, using =RATT_SITE_LIAI_XPATH)
	public static WebElement RattSiteLiaiId;
	@FindBy(how = How.XPATH, using =RECH_SITE_LIAI_XPATH)
	public static WebElement RechSiteLiaiId;
	@FindBy(how = How.ID, using =GRID_SITE_LIAI_ID)
	public static WebElement GridSiteLiaiTypId;
	@FindBy(how = How.ID, using =VLD_SITE_LIAI_ID)
	public static WebElement VldSiteLiaiId;
	
	
	@FindBy(how = How.ID, using =VLD_FICH_INC_ID)
	public static WebElement VldFichIncId;
	
	
	@FindBy(how = How.ID, using =SP_CONF_REG_XPATH)
	public static WebElement SPConfRegId;
	@FindBy(how = How.ID, using =SP_RISQUE_XPATH)
	public static WebElement SPRisqueId;
	@FindBy(how = How.ID, using =SP_TEMOINS_XPATH)
	public static WebElement SPTemoinsId;
	@FindBy(how = How.ID, using =SP_PERS_CONCER_XPATH)
	public static WebElement SPPersConCId;
	
	
	
	@FindBy(how = How.ID, using =SP_SITU_URG_XPATH)
	public static WebElement SPSituUrgId;
	@FindBy(how = How.ID, using =SP_REG_SEC_XPATH)
	public static WebElement SPRegSecId;
	@FindBy(how = How.ID, using =RATT_CONF_ID)
	public static WebElement RattConfId;
	@FindBy(how = How.XPATH, using =RECH_CONF_XPATH)
	public static WebElement RechConfId;
	@FindBy(how = How.ID, using =GRID_CONF_ID)
	public static WebElement GridConfId;
	@FindBy(how = How.ID, using =VLD_CONF_ID)
	public static WebElement VldConfId;
	@FindBy(how = How.ID, using =RATT_RIS_ID)
	public static WebElement RattRisId;
	@FindBy(how = How.XPATH, using =RECH_RIS_XPATH)
	public static WebElement RechRisId;
	@FindBy(how = How.ID, using =GRID_RIS_ID)
	public static WebElement GridRisId;
	@FindBy(how = How.ID, using =VLD_RIS_XPATH)
	public static WebElement VldRisId;
	@FindBy(how = How.ID, using =RATT_TEM_ID)
	public static WebElement RattTemId;
	@FindBy(how = How.ID, using =RECH_TEM_XPATH)
	public static WebElement RechTemId;
	@FindBy(how = How.ID, using =VLD_RECH_TEM_XPATH)
	public static WebElement VldRechTemId;
	@FindBy(how = How.ID, using =GRID_TEM_ID)
	public static WebElement GridTemId;
	@FindBy(how = How.ID, using =VLD_TEM_XPATH)
	public static WebElement VldTemId;
	@FindBy(how = How.ID, using =RATT_PERS_CONC_ID)
	public static WebElement RattPersConId;
	@FindBy(how = How.ID, using =RECH_PERS_CONC_XPATH)
	public static WebElement RechPersConId;
	@FindBy(how = How.ID, using =VLD_RECH_PERS_CONC_XPATH)
	public static WebElement VldRechPersConId;
	@FindBy(how = How.ID, using =GRID_PERS_CONC_ID)
	public static WebElement GridPersConId;
	@FindBy(how = How.ID, using =VLD_PERS_CONC_XPATH)
	public static WebElement VldPersConId;
	
	
	@FindBy(how = How.ID, using = AJT_CONC_ID)
	public static WebElement AjtConId;
	@FindBy(how = How.ID, using =NOM_CONC_ID)
	public static WebElement NomConId;
	@FindBy(how = How.ID, using =ORGA_CONC_ID)
	public static WebElement OrgConId;
	@FindBy(how = How.ID, using =VLD_CONC_ID)
	public static WebElement VldConId;
	
	
	@FindBy(how = How.ID, using =RATT_SIT_URG_ID)
	public static WebElement RattSitUrgId;
	@FindBy(how = How.XPATH, using =RECH_SIT_URG_XPATH)
	public static WebElement RechSitUrgId;
	@FindBy(how = How.ID, using =GRID_SIT_URG_ID)
	public static WebElement GridSitUrgId;
	@FindBy(how = How.ID, using =VLD_SIT_URG_ID)
	public static WebElement VldSitUrgId;
	@FindBy(how = How.ID, using =AVEC_REG_SEC_ID)
	public static WebElement AvecRegSecId;
	@FindBy(how = How.ID, using =VLD_REG_SEC_ID)
	public static WebElement VldRegSecId;
	
	
	
	@FindBy(how = How.ID, using =AGD_SEC_ID)
	public static WebElement AgdSecId;
	@FindBy(how = How.XPATH, using =SP_INC_A_VLD_XPATH)
	public static WebElement SPIncAVldId;
	@FindBy(how = How.ID, using =RECH_INC_A_VLD_XPATH)
	public static WebElement RechIncAVldId;
	@FindBy(how = How.ID, using =GRID_INC_A_VLD_ID)
	public static WebElement GridIncAVldId;
	@FindBy(how = How.ID, using =VLD_INC_ID)
	public static WebElement ValidationIncId;
	@FindBy(how = How.ID, using =CORR_INC_ID)
	public static WebElement CorrIncId;
	@FindBy(how = How.ID, using =REF_INC_ID)
	public static WebElement RefusIncId;
	@FindBy(how = How.ID, using =COMM_VLD_ID)
	public static WebElement CommVldIncId;
	@FindBy(how = How.ID, using =idCom)
	public static WebElement CommVldIncId2;
	@FindBy(how = How.ID, using =CHX_DEC_ID2)
	public static WebElement ChxDecideurId2;
	@FindBy(how = How.ID, using =CHX_DEC_ID)
	public static WebElement ChxDecideurId;
	@FindBy(how = How.XPATH, using =SP_INC_A_CORR_XPATH)
	public static WebElement SPIncACorrId;
	@FindBy(how = How.XPATH, using =RECH_INC_A_CORR_XPATH)
	public static WebElement RechIncACorrId;
	@FindBy(how = How.ID, using =GRID_INC_A_CORR_ID)
	public static WebElement GridIncACorrId;
	@FindBy(how = How.XPATH, using =SP_INC_A_DEC_XPATH)
	public static WebElement SPIncADecId;
	@FindBy(how = How.XPATH, using =RECH_INC_A_DEC_XPATH)
	public static WebElement RechIncADecId;
	@FindBy(how = How.ID, using =GRID_INC_A_DEC_ID)
	public static WebElement GridIncADecId;
	@FindBy(how = How.ID, using =SELEC_RESP_TRAIT_ID)
	public static WebElement SelectRespTraitId;
	@FindBy(how = How.ID, using = RECH_RESP_TRAIT_XPATH)
	public static WebElement RechRespTraitId;
	@FindBy(how = How.ID, using = VLD_RECH_RESP_TRAIT_XPATH)
	public static WebElement VldRechRespTraitId;
	@FindBy(how = How.ID, using =GRID_RESP_TRAIT_ID)
	public static WebElement GridRespTraitId;
	@FindBy(how = How.ID, using =RESP_CLOT_ID)
	public static WebElement RespClotId;
	@FindBy(how = How.ID, using =DELAI_TAIT_ID)
	public static WebElement DelaiTraitId;
	@FindBy(how = How.ID, using =CAUSE_DEC_INC_ID)
	public static WebElement CauseDecIncId;
	@FindBy(how = How.ID, using =TRAIT_DEC_INC_ID)
	public static WebElement TraitDecIncId;
	@FindBy(how = How.ID, using =VLD_DEC_ID)
	public static WebElement VldDecId;
	
	@FindBy(how = How.XPATH, using =SP_INC_A_TRAIT_XPATH)
	public static WebElement SpIncATraitId;
	@FindBy(how = How.XPATH, using =RECH_INC_A_TRAIT_XPATH)
	public static WebElement RechIncATraitId;
	@FindBy(how = How.ID, using =GRID_INC_A_TRAIT_ID)
	public static WebElement GridIncATraitId;
	@FindBy(how = How.ID, using =ETAT_INC_A_TRAIT_ID)
	public static WebElement EtatIncATraitId;
	@FindBy(how = How.ID, using =DATE_TRAIT_INC_ID)
	public static WebElement DateIncATraitId;
	@FindBy(how = How.ID, using =COUT_TRAIT_INC_ID)
	public static WebElement CoutTraitIncId;
	@FindBy(how = How.ID, using =RAP_TRAIT_INC_ID)
	public static WebElement RapTraitIncId;
	@FindBy(how = How.ID, using =VLD_TRAIT_INC_ID)
	public static WebElement VldTraitIncId;
	
	@FindBy(how = How.XPATH, using =SP_INC_A_CLOT_XPATH)
	public static WebElement SpIncAClotId;
	@FindBy(how = How.XPATH, using =RECH_INC_A_CLOT_XPATH)
	public static WebElement RechIncAClotId;
	@FindBy(how = How.ID, using =GRID_INC_A_CLOT_ID)
	public static WebElement GridIncAClotId;
	@FindBy(how = How.ID, using =ETAT_INC_A_CLOT_ID)
	public static WebElement EtatIncAClotId;
	@FindBy(how = How.ID, using =RAP_CLOT_INC_ID)
	public static WebElement RapClotIncId;
	@FindBy(how = How.ID, using =RAP_CLOT_INC_ID2)
	public static WebElement RapClotIncId2;
	@FindBy(how = How.ID, using =VLD_CLOT_INC_ID)
	public static WebElement VldClotIncId;
	@FindBy(how = How.ID, using =VLD_CLOT_INC_ID2)
	public static WebElement VldClotIncId2;

}

