package com.qualiprobdd.e2etests.metrologie.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.qualiprobdd.e2etests.util.AbstractPage;

public class ModuleMetrologiePage extends AbstractPage {

    public ModuleMetrologiePage(WebDriver driver) {

        super(driver);
    }


    final static String equipement_recherche = "ctl00_ContentPlaceHolder1_Text_fCod_Dispo";
    final static String menuID = "ctl00_menuModal";
    final static String equipmentcode = "ctl00_ContentPlaceHolder1_Text_CodDis";
    final static String ajouter = "ctl00_ContentPlaceHolder1_Ajouter";
    final static String designation = "ctl00_ContentPlaceHolder1_Text_Desig";
    final static String date = "ctl00_ContentPlaceHolder1_Text_MES";
    final static String choixdate = "ctl00_ContentPlaceHolder1_CalendarExtender1_today";
    final static String serialnumber = "ctl00_ContentPlaceHolder1_Text_NSeri";
    final static String precision = "ctl00_ContentPlaceHolder1_Text_Preci";
    final static String range = "ctl00_ContentPlaceHolder1_Text_EtenMes";
    final static String ecartmax = "ctl00_ContentPlaceHolder1_Text_EMT";
    final static String consigne = "ctl00_ContentPlaceHolder1_TextBox11";
    final static String etat = "ctl00_ContentPlaceHolder1_Text_Etat";
    final static String fournisseur = "ctl00_ContentPlaceHolder1_select_frs1";
    final static String fournisseurRecherche = "ctl00_ContentPlaceHolder1_TextBox35";
    final static String fournisseurChoix = "ctl00_ContentPlaceHolder1_GridView7";
    final static String search = "ctl00_ContentPlaceHolder1_LinkButton52";
    final static String appareilcritique = "ctl00_ContentPlaceHolder1_DropDownListEquipCrit";
    final static String appareiltype = "ctl00_ContentPlaceHolder1_DDlTypeEquip";
    final static String historique = "ctl00_ContentPlaceHolder1_LabelAffectTmp";
    final static String historiqueajouter = "ctl00_ContentPlaceHolder1_LinkButton16";
    final static String calendrier = "ctl00_ContentPlaceHolder1_Img4";
    final static String datem = "ctl00_ContentPlaceHolder1_CalendarExtender6_today";
    final static String activite = "ctl00_ContentPlaceHolder1_lBDomaine_";
    final static String site = "ctl00_ContentPlaceHolder1_DropDownListSiteTmp";
    final static String dotation = "ctl00_ContentPlaceHolder1_DropDownListDotTmp";
    final static String location = "ctl00_ContentPlaceHolder1_TextBoxEmplacTmp";
    final static String validerh = "ctl00_ContentPlaceHolder1_LinkButton23";
    final static String validerfinal = "ctl00_ContentPlaceHolder1_Button1";
    final static String machinelist = "ctl00_ContentPlaceHolder1_Label_machine";
    final static String link = "ctl00_ContentPlaceHolder1_Link_ratt_machine";
    final static String add = "ctl00_ContentPlaceHolder1_LinkButton25";
    final static String addmachine = "ctl00_ContentPlaceHolder1_Text_mach";
    final static String recherchemachine = "ctl00_ContentPlaceHolder1_GridViewmachine_filter";
    final static String validermachine = "ctl00_ContentPlaceHolder1_LinkV_machine";
    final static String choixmachine = "ctl00_ContentPlaceHolder1_GridViewmachine";
    final static String valideraddmachine = "ctl00_ContentPlaceHolder1_Valider";
    final static String deletemachine = "ctl00_ContentPlaceHolder1_LinkButton29";
    final static String delmachine = "ctl00_ContentPlaceHolder1_GridViewpmachine_ctl03_CheckBox2";
    final static String typeoperation = "ctl00_ContentPlaceHolder1_Label47";
    final static String typeoperationadd = "ctl00_ContentPlaceHolder1_LinkButton7";
    final static String operationtype = "ctl00_ContentPlaceHolder1_List_Type";
    final static String operationfrequence = "ctl00_ContentPlaceHolder1_Text_Period";
    final static String operationalerte = "ctl00_ContentPlaceHolder1_TextBoxPrevention";
    final static String operationvalider = "ctl00_ContentPlaceHolder1_LinkButton51";
    final static String operationvaliderfinal = "ctl00_ContentPlaceHolder1_Lk_Valider";
    final static String operationreport = "ctl00_ContentPlaceHolder1_Label4";
    final static String operationajouter = "ctl00_ContentPlaceHolder1_Iajouter";
    final static String operationlocation = "ctl00_ContentPlaceHolder1_Text_ILieu";
    final static String operationreporttype = "ctl00_ContentPlaceHolder1_DropDownList1";
    final static String operationreportorganization = "ctl00_ContentPlaceHolder1_List_IOrgEV";
    final static String operationreportcomment = "ctl00_ContentPlaceHolder1_Text_Iconstat";
    final static String operationreportintervention = "ctl00_ContentPlaceHolder1_List_IResultat";
    final static String operationreportdecision = "ctl00_ContentPlaceHolder1_Text_IDecision";
    final static String operationreportobservation = "ctl00_ContentPlaceHolder1_Text_IObserv";
    final static String operationreportvalider = "ctl00_ContentPlaceHolder1_Ivalider";
    final static String tableEquipment = "ctl00_ContentPlaceHolder1_GridView1";
    final static String rechercheEquipment = "ctl00_ContentPlaceHolder1_Label14";
    final static String metrologieagenda = "ctl00_label_lb_disp";
    final static String metrologieaequi = "ctl00_ContentPlaceHolder1_num";
    final static String metrologiearecherche = "ctl00_ContentPlaceHolder1_GridView_disp_filter";
    final static String metrologiearechercheid = "//*[@id=\"ctl00_ContentPlaceHolder1_GridView_disp\"]/tbody/tr/td[1]";
    final static String metrologieRR = "ctl00_ContentPlaceHolder1_Label18";
    final static String metrologieRRADD = "ctl00_ContentPlaceHolder1_LinkButton414";
    final static String nombrepiece = "ctl00_ContentPlaceHolder1_Text_piece";
    final static String mesuredpiece = "ctl00_ContentPlaceHolder1_TextBox49";
    final static String folderref = "ctl00_ContentPlaceHolder1_TextBox_Dossier";
    final static String characteristic = "ctl00_ContentPlaceHolder1_TextBox50";
    final static String tolerance = "ctl00_ContentPlaceHolder1_TextBox52";
    final static String batch = "ctl00_ContentPlaceHolder1_TextBox12";
    final static String select = "ctl00_ContentPlaceHolder1_LinkButton_SelectOp1";
    final static String selectRecherche = "ctl00_ContentPlaceHolder1_TextBox67";
    final static String btnRecherche = "ctl00_ContentPlaceHolder1_LinkButton62";
    final static String operateur = "ctl00_ContentPlaceHolder1_GridView_Op1_ctl02_lb_mat";
    final static String BTNAJT = "//*[@id=\"ctl00_ContentPlaceHolder1_nouv_inter\"]/div[2]/div/div[8]/div/span/label/span[1]";
    final static String BTNVALIDER = "ctl00_ContentPlaceHolder1_LinkButton409";
    final static String mesureop11 = "ctl00_ContentPlaceHolder1_GridView11_ctl02_TextBox18";
    final static String mesureop22 = "ctl00_ContentPlaceHolder1_GridView11_ctl03_TextBox18";
    final static String mesureop33 = "ctl00_ContentPlaceHolder1_GridView11_ctl04_TextBox18";
    final static String recherchfiche = "ctl00_ContentPlaceHolder1_TextBox39";
    final static String recherchbtn = "ctl00_ContentPlaceHolder1_LinkButton48";
    final static String btnoverview = "ctl00_ContentPlaceHolder1_Lk_Aperçu";


    final static String tableAg = "ctl00_ContentPlaceHolder1_GridView_disp";

    //ctl00_ContentPlaceHolder1_GridViewpmachine_ctl03_CheckBox2
    //ctl00_ContentPlaceHolder1_LabelAffectTmp
    //ctl00_ContentPlaceHolder1_Link_ratt_machine
    ////*[@id="ctl00_ContentPlaceHolder1_Link_ratt_machine"]
    // //*[@id="ctl00_ContentPlaceHolder1_GridViewmachine_filter"]/label/input
    //@FindBy (how=How.ID, using =metrologiefiltre)
    //public static WebElement wmetrologiefiltre;
    final static String idAMachine = "ctl00_ContentPlaceHolder1_Ajouter";
    final static String idMachine = "ctl00_ContentPlaceHolder1_Text_mach";
    final static String ValideMachine = "ctl00_ContentPlaceHolder1_Valider";
    final static String retourm = "ctl00_ContentPlaceHolder1_Annuler_Ajout";
    final static String retoure = "ctl00_ContentPlaceHolder1_Retour";
    final static String text_machine = "ctl00_ContentPlaceHolder1_Text_machine";
    final static String filtre = "ctl00_ContentPlaceHolder1_Valider_Filtre";
    final static String tabMachine = "ctl00_ContentPlaceHolder1_GridView1";
    final static String ajoutEtaBtn = "ctl00_ContentPlaceHolder1_Ajouter";
    final static String etatEquip = "ctl00_ContentPlaceHolder1_tb_type";
    final static String ListPrise = "ctl00_ContentPlaceHolder1_DropDownList1";
    final static String listAfficherAuniveau = "ctl00_ContentPlaceHolder1_DropDownList2";
    final static String RecheEta = "ctl00_ContentPlaceHolder1_tb_filtre_etat";
    final static String etaFilter = "ctl00_ContentPlaceHolder1_Filtre_Rechercher";
    final static String tabetat = "ctl00_ContentPlaceHolder1_GridView1";
    final static String ValEtat = "ctl00_ContentPlaceHolder1_Valider";
    final static String typeIn = "ctl00_ContentPlaceHolder1_Text_Type";
    //ctl00_ContentPlaceHolder1_Text_Type
    final static String idjour = "ctl00_ContentPlaceHolder1_TextBoxPrevention";
    final static String respoTypeInter = "ctl00_ContentPlaceHolder1_txtEditRS1";
    final static String rechTyIn = "ctl00_ContentPlaceHolder1_Text_FType";
    final static String tabTypIn = "ctl00_ContentPlaceHolder1_GridView1";
    final static String tabRech = "ctl00_ContentPlaceHolder1_GridView_Informes_filter";
    final static String GRidPerson = "ctl00_ContentPlaceHolder1_GridView18";

    final static String ValiderPersonner = "ctl00_ContentPlaceHolder1_LinkButton_ValiderEmp";
    final static String groupeTyp = "ctl00_ContentPlaceHolder1_LinkButton_selectgpe";
    final static String groupTable = "ctl00_ContentPlaceHolder1_GridView_Groupe";
    final  static  String  groupValid="ctl00_ContentPlaceHolder1_LinkButton41";
    final  static  String  ferme="ctl00_ContentPlaceHolder1_LinkButton_Retour";
    final static  String  AjoutOrg="ctl00_ContentPlaceHolder1_Ajouter_Ajouter";
    final static  String   orgV="ctl00_ContentPlaceHolder1_Text_Org";
    final  static   String   textRechOrg="ctl00_ContentPlaceHolder1_Text_FOrg";
    final   static   String  tabOrganis="ctl00_ContentPlaceHolder1_GridView1";
    final   static   String filterEq="ctl00_ContentPlaceHolder1_TxtTypeEquip";
    final  static String  RecherTyEquip="ctl00_ContentPlaceHolder1_Label49";
final  static  String tabTypeEquip="ctl00_ContentPlaceHolder1_GVListeType";
    @FindBy(how = How.ID, using =tabTypeEquip )
    public static WebElement wtabTypeEquip;
    @FindBy(how = How.ID, using =RecherTyEquip )
    public static WebElement wwRecherTyEquip;

    @FindBy(how = How.ID, using =filterEq )
    public static WebElement wfilterEq;

    @FindBy(how = How.ID, using = tabOrganis)

    public static WebElement wtabOrganis;
    @FindBy(how = How.ID, using = textRechOrg)

    public static WebElement wtextRechOrg;
    @FindBy(how = How.ID, using = orgV)

    public static WebElement worgV;
    @FindBy(how = How.ID, using = AjoutOrg)

    public static WebElement wAjoutOrg;
    @FindBy(how = How.ID, using = ferme)

    public static WebElement wferme;

    @FindBy(how = How.ID, using = groupValid)

    public static WebElement wgroupValid;
    @FindBy(how = How.ID, using = groupTable)

    public static WebElement wgroupTable;
    @FindBy(how = How.ID, using = groupeTyp)

    public static WebElement wgroupeTyp;

    @FindBy(how = How.ID, using = ValiderPersonner)

    public static WebElement wValiderPersonner;

    @FindBy(how = How.ID, using = GRidPerson)

    public static WebElement wGRidPerson;

    @FindBy(how = How.ID, using = tabRech)

    public static WebElement wtabRech;

    @FindBy(how = How.ID, using = tabTypIn)

    public static WebElement wtabTypIn;
    @FindBy(how = How.ID, using = rechTyIn)

    public static WebElement wrechTyIn;

    @FindBy(how = How.ID, using = respoTypeInter)

    public static WebElement wrespoTypeInter;
    @FindBy(how = How.ID, using = idjour)

    public static WebElement widjour;

    @FindBy(how = How.ID, using = typeIn)

    public static WebElement wtypeIn;

    @FindBy(how = How.ID, using = ValEtat)

    public static WebElement wValEtat;

    @FindBy(how = How.ID, using = tabetat)
    public static WebElement wtabetat;

    @FindBy(how = How.ID, using = etaFilter)
    public static WebElement wetaFilter;
    @FindBy(how = How.ID, using = RecheEta)
    public static WebElement wRecheEta;
    @FindBy(how = How.ID, using = retoure)
    public static WebElement wretoure;
    @FindBy(how = How.ID, using = ListPrise)
    public static WebElement wListPrise;

    @FindBy(how = How.ID, using = listAfficherAuniveau)
    public static WebElement wlistAfficherAuniveau;

    @FindBy(how = How.ID, using = etatEquip)
    public static WebElement wetatEquip;

    @FindBy(how = How.ID, using = ajoutEtaBtn)
    public static WebElement wajoutEtaBtn;


    @FindBy(how = How.ID, using = tabMachine)
    public static WebElement wtabMachine;

    @FindBy(how = How.ID, using = filtre)
    public static WebElement wfiltre;
    @FindBy(how = How.ID, using = text_machine)
    public static WebElement wtext_machine;
    @FindBy(how = How.ID, using = retourm)
    public static WebElement wretourm;
    @FindBy(how = How.ID, using = ValideMachine)
    public static WebElement wValideMachine;
    @FindBy(how = How.ID, using = idMachine)
    public static WebElement widMachine;
    @FindBy(how = How.ID, using = idAMachine)
    public static WebElement widAMachine;

    @FindBy(how = How.ID, using = tableAg)
    public static WebElement wtableAg;

    @FindBy(how = How.ID, using = btnoverview)
    public static WebElement wbtnoverview;

    @FindBy(how = How.ID, using = recherchbtn)
    public static WebElement wrecherchbtn;

    @FindBy(how = How.ID, using = recherchfiche)
    public static WebElement wrecherchfiche;

    @FindBy(how = How.ID, using = mesureop33)
    public static WebElement wmesureop33;

    @FindBy(how = How.ID, using = mesureop22)
    public static WebElement wmesureop22;

    @FindBy(how = How.ID, using = mesureop11)
    public static WebElement wmesureop11;

    @FindBy(how = How.ID, using = BTNVALIDER)
    public static WebElement wBTNVALIDER;

    @FindBy(how = How.ID, using = BTNAJT)
    public static WebElement wBTNAJT;

    @FindBy(how = How.ID, using = operateur)
    public static WebElement woperateur;

    @FindBy(how = How.ID, using = btnRecherche)
    public static WebElement wbtnRecherche;

    @FindBy(how = How.ID, using = selectRecherche)
    public static WebElement wselectRecherche;

    @FindBy(how = How.ID, using = select)
    public static WebElement wselect;

    @FindBy(how = How.ID, using = batch)
    public static WebElement wbatch;

    @FindBy(how = How.ID, using = tolerance)
    public static WebElement wtolerance;

    @FindBy(how = How.ID, using = characteristic)
    public static WebElement wcharacteristic;

    @FindBy(how = How.ID, using = folderref)
    public static WebElement wfolderref;

    @FindBy(how = How.ID, using = mesuredpiece)
    public static WebElement wmesuredpiece;

    @FindBy(how = How.ID, using = nombrepiece)
    public static WebElement wnombrepiece;

    @FindBy(how = How.ID, using = metrologieRRADD)
    public static WebElement wmetrologieRRADD;

    @FindBy(how = How.ID, using = metrologieRR)
    public static WebElement wmetrologieRR;

    @FindBy(how = How.ID, using = metrologiearechercheid)
    public static WebElement wmetrologiearechercheid;

    @FindBy(how = How.ID, using = metrologiearecherche)
    public static WebElement wmetrologiearecherche;

    @FindBy(how = How.ID, using = metrologieaequi)
    public static WebElement wmetrologieaequi;

    @FindBy(how = How.ID, using = metrologieagenda)
    public static WebElement wmetrologieagenda;

    @FindBy(how = How.ID, using = equipement_recherche)
    public static WebElement wequipement_recherche;

    @FindBy(how = How.ID, using = tableEquipment)
    public static WebElement wtableEquipment;

    @FindBy(how = How.ID, using = menuID)
    public static WebElement wmenuID;
    @FindBy(how = How.ID, using = equipmentcode)
    public static WebElement wequipmentcode;
    @FindBy(how = How.ID, using = ajouter)
    public static WebElement wajouter;
    @FindBy(how = How.ID, using = designation)
    public static WebElement wdesignation;
    @FindBy(how = How.ID, using = date)
    public static WebElement wdate;
    @FindBy(how = How.ID, using = choixdate)
    public static WebElement wchoixdate;
    @FindBy(how = How.ID, using = serialnumber)
    public static WebElement wserialnumber;
    @FindBy(how = How.ID, using = precision)
    public static WebElement wpreciasion;
    @FindBy(how = How.ID, using = range)
    public static WebElement wrange;
    @FindBy(how = How.ID, using = ecartmax)
    public static WebElement wecartmax;
    @FindBy(how = How.ID, using = consigne)
    public static WebElement wconsigne;
    @FindBy(how = How.ID, using = etat)
    public static WebElement wetat;
    @FindBy(how = How.ID, using = fournisseur)
    public static WebElement wfournisseur;
    @FindBy(how = How.ID, using = fournisseurRecherche)
    public static WebElement wfournisseurRecherche;
    @FindBy(how = How.ID, using = fournisseurChoix)
    public static WebElement wfournisseurChoix;
    @FindBy(how = How.ID, using = search)
    public static WebElement wsearch;
    @FindBy(how = How.ID, using = appareilcritique)
    public static WebElement wappareilcritique;
    @FindBy(how = How.ID, using = appareiltype)
    public static WebElement wappareiltype;
    @FindBy(how = How.ID, using = historique)
    public static WebElement whistorique;
    @FindBy(how = How.ID, using = historiqueajouter)
    public static WebElement whistoriqueajouter;
    @FindBy(how = How.ID, using = calendrier)
    public static WebElement wcalendrier;
    @FindBy(how = How.ID, using = datem)
    public static WebElement wdatem;
    @FindBy(how = How.ID, using = activite)
    public static WebElement wactivite;
    @FindBy(how = How.ID, using = site)
    public static WebElement wsite;
    @FindBy(how = How.ID, using = dotation)
    public static WebElement wdotation;
    @FindBy(how = How.ID, using = location)
    public static WebElement wlocation;
    @FindBy(how = How.ID, using = validerh)
    public static WebElement wvaliderh;
    @FindBy(how = How.ID, using = validerfinal)
    public static WebElement wvaliderfinal;
    @FindBy(how = How.ID, using = machinelist)
    public static WebElement wmachinelist;
    @FindBy(how = How.ID, using = link)
    public static WebElement wlink;
    @FindBy(how = How.ID, using = add)
    public static WebElement wadd;
    @FindBy(how = How.ID, using = addmachine)
    public static WebElement waddmachine;
    @FindBy(how = How.ID, using = recherchemachine)
    public static WebElement wrecherchemachine;
    @FindBy(how = How.ID, using = validermachine)
    public static WebElement wvalidermachine;
    @FindBy(how = How.ID, using = choixmachine)
    public static WebElement wchoixmachine;
    @FindBy(how = How.ID, using = valideraddmachine)
    public static WebElement wvalideraddmachine;
    @FindBy(how = How.ID, using = deletemachine)
    public static WebElement wdeletemachine;
    @FindBy(how = How.ID, using = delmachine)
    public static WebElement wdelmachine;
    @FindBy(how = How.ID, using = typeoperation)
    public static WebElement wtypeoperation;
    @FindBy(how = How.ID, using = typeoperationadd)
    public static WebElement wtypeoperationadd;
    @FindBy(how = How.ID, using = operationtype)
    public static WebElement woperationtype;
    @FindBy(how = How.ID, using = operationfrequence)
    public static WebElement woperationfrequence;
    @FindBy(how = How.ID, using = operationalerte)
    public static WebElement woperationalerte;
    @FindBy(how = How.ID, using = operationvalider)
    public static WebElement woperationvalider;
    @FindBy(how = How.ID, using = operationvaliderfinal)
    public static WebElement woperationvaliderfinal;
    @FindBy(how = How.ID, using = operationreport)
    public static WebElement woperationreport;
    @FindBy(how = How.ID, using = operationajouter)
    public static WebElement woperationajouter;
    @FindBy(how = How.ID, using = operationlocation)
    public static WebElement woperationlocation;
    @FindBy(how = How.ID, using = operationreporttype)
    public static WebElement woperationreporttype;
    @FindBy(how = How.ID, using = operationreportorganization)
    public static WebElement woperationreportorganization;
    @FindBy(how = How.ID, using = operationreportcomment)
    public static WebElement woperationreportcomment;
    @FindBy(how = How.ID, using = operationreportintervention)
    public static WebElement woperationreportintervention;
    @FindBy(how = How.ID, using = operationreportdecision)
    public static WebElement woperationreportdecision;
    @FindBy(how = How.ID, using = operationreportobservation)
    public static WebElement woperationreportobservation;
    @FindBy(how = How.ID, using = operationreportvalider)
    public static WebElement woperationreportvalider;
    @FindBy(how = How.ID, using = rechercheEquipment)
    public static WebElement wrechercheEquipment;


}