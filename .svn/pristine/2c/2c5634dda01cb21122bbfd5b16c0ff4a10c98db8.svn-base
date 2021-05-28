package com.qualiprobdd.e2etests.agenda.Models;

import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;

import com.qualiprobdd.e2etests.Documentation.models.DocumentationModele;
import com.qualiprobdd.e2etests.Documentation.pages.DocumentationPage;
import com.qualiprobdd.e2etests.Environnement.models.IncidentModel;
import com.qualiprobdd.e2etests.Fournisseur.pages.EvalFourPage;
import com.qualiprobdd.e2etests.GRH.Models.SatisPersonnelModel;
import com.qualiprobdd.e2etests.PNC.models.ModulePNCModel;
import com.qualiprobdd.e2etests.ReclamationClient.Pages.ReclamationClientPage;
import com.qualiprobdd.e2etests.Risque.Models.RisqueOppModele;
import com.qualiprobdd.e2etests.Sécurité.Models.IncidentSecModel;
import com.qualiprobdd.e2etests.agenda.Page.PageSommerAgenda;
import com.qualiprobdd.e2etests.audit.pages.ModuleAuditsPage;
import com.qualiprobdd.e2etests.indicateur.pages.IndicateurPage;
import com.qualiprobdd.e2etests.moduleAction.models.FicheActionModele;
import com.qualiprobdd.e2etests.moduleReunion.pages.ModuleReunionPage;
import com.qualiprobdd.e2etests.util.Common;
import com.qualiprobdd.e2etests.util.ExcelUtils;



public class ModeleSommerAgenda {
	private static String Path = "resources/testData/TestData.xlsx";
	public static boolean etat = false;
	public static int ligne = 0;

	public static void consulter_agenda(int arg1, WebDriver driver) throws Throwable {

		switch (arg1) {

		default:
			System.out.println("Module  n' pas  trouve ");

		}

	}

	public static String s1, s2;

	public static void somme_agenda_documentation(WebDriver driver) throws Throwable {
		System.out.println("Agenda Documentation");
		int d = 0, e = 0, r = 0, v = 0, a = 0, di = 0, c = 0, re = 0, i = 0, doc = 0, co = 0,inf=0;
		Thread.sleep(5000);

		ExcelUtils.setExcelFile(Path, "ModuleVendu");
		ligne = ExcelUtils.GetLigneData1("Documentation");

		System.out.println("Module  et ?" + ExcelUtils.getCellData1(ligne, 1));
		if ("OUI".equals(ExcelUtils.getCellData1(ligne, 1))) {
			DocumentationModele.cliqueAgendaDocument(driver);
			s1 = PageSommerAgenda.widdoct.getText();

			System.out.println(" somme est " + s1);
			
			
			
			try {
				if (PageSommerAgenda.wdialogue.getText() != null) {
					d = Integer.parseInt(PageSommerAgenda.wdialogue.getText());
				}

			} catch (NoSuchElementException exception) {
				System.out.println("ne pas  trouve : ");

			}
			
			try {
				if (PageSommerAgenda.wDocInfo.getText() != null) {
					inf = Integer.parseInt(PageSommerAgenda.wDocInfo.getText());
				}

			} catch (NoSuchElementException exception) {
				System.out.println("ne pas  trouve : ");

			}

			try {
				if (PageSommerAgenda.wencours.getText() != null) {
					e = Integer.parseInt(PageSommerAgenda.wencours.getText());
				}

			} catch (NoSuchElementException exception) {
				System.out.println("ne pas  trouve : ");

			}
			try {
				if (PageSommerAgenda.wredacteur.getText() != null) {
					r = Integer.parseInt(PageSommerAgenda.wredacteur.getText());
				}

			} catch (NoSuchElementException exception) {
				System.out.println("ne pas  trouve : ");

			}
			try {
				if (PageSommerAgenda.wverificateur.getText() != null) {
					v = Integer.parseInt(PageSommerAgenda.wverificateur.getText());
				}

			} catch (NoSuchElementException exception) {
				System.out.println("ne pas  trouve : ");

			}
			try {
				if (PageSommerAgenda.wapprobateur.getText() != null) {
					a = Integer.parseInt(PageSommerAgenda.wapprobateur.getText());
				}

			} catch (NoSuchElementException exception) {
				System.out.println("ne pas  trouve : ");

			}
			try {
				if (PageSommerAgenda.wdiffusion.getText() != null) {
					di = Integer.parseInt(PageSommerAgenda.wdiffusion.getText());
				}

			} catch (NoSuchElementException exception) {
				System.out.println("ne pas  trouve : ");

			}
			try {
				if (PageSommerAgenda.wconsulter.getText() != null) {
					c = Integer.parseInt(PageSommerAgenda.wconsulter.getText());
				}

			} catch (NoSuchElementException exception) {
				System.out.println("ne pas  trouve : ");

			}
			try {
				if (PageSommerAgenda.wreviser.getText() != null) {
					re = Integer.parseInt(PageSommerAgenda.wreviser.getText());
				}

			} catch (NoSuchElementException exception) {
				System.out.println("ne pas  trouve : ");

			}
			try {
				if (PageSommerAgenda.winfo.getText() != null) {
					i = Integer.parseInt(PageSommerAgenda.winfo.getText());
				}

			} catch (NoSuchElementException exception) {
				System.out.println("ne pas  trouve : ");

			}
			try {
				if (PageSommerAgenda.wdocAconsulter.getText() != null) {
					doc = Integer.parseInt(PageSommerAgenda.wdocAconsulter.getText());
				}

			} catch (NoSuchElementException exception) {
				System.out.println("ne pas  trouve : ");

			}
			try {
				if (PageSommerAgenda.wcomm.getText() != null) {
					co = Integer.parseInt(PageSommerAgenda.wcomm.getText());
				}

			} catch (NoSuchElementException exception) {
				System.out.println("ne pas  trouve : ");

			}

			int somme = d + e + r + v + a + di + c + re + i + doc + co+inf;
			System.out.println("somme agenda " + somme);
			etat = s1.equals(String.valueOf(somme));

			System.out.println(s1);

			Common.Exporter_Sommer(s1, String.valueOf(somme), "docummentation", etat);

		} else {
			System.out.println("Module  non vendu");

		}
	}

	public static void somme_agenda_Action(WebDriver driver) throws Throwable {
		int d = 0, e = 0, r = 0, v = 0, a = 0, di = 0, c = 0, re = 0, i = 0, doc = 0, co = 0,dk=0;

		Thread.sleep(5000);

		System.out.println("Agenda Action");
		ExcelUtils.setExcelFile(Path, "ModuleVendu");

		// ligne = ExcelUtils.GetLigneData1("Action");
		System.out.println("Module  et ?" + ExcelUtils.getCellData1(2, 1));

		if ("OUI".equals(ExcelUtils.getCellData1(2, 1))) {

			Thread.sleep(5000);

			if ("OUI".equals(ExcelUtils.getCellData1(2, 1))) {
				FicheActionModele.cliqueAgenda(driver);
				s1 = PageSommerAgenda.widAgendaAction.getText();

				System.out.println(" somme est " + s1);
				try {
					if (PageSommerAgenda.wrefuse.getText() != null) {
						d = Integer.parseInt(PageSommerAgenda.wrefuse.getText());
					}

				} catch (NoSuchElementException exception) {
					System.out.println("ne pas  trouve : ");

				}
				try {
					if (PageSommerAgenda.winfoAudit.getText() != null) {
						dk = Integer.parseInt(PageSommerAgenda.winfoAudit.getText());
					}

				} catch (NoSuchElementException exception) {
					System.out.println("ne pas  trouve : ");

				}

				try {
					if (PageSommerAgenda.wvalider.getText() != null) {
						e = Integer.parseInt(PageSommerAgenda.wvalider.getText());
					}

				} catch (NoSuchElementException exception) {
					System.out.println("ne pas  trouve : ");

				}

				try {
					if (PageSommerAgenda.wSuivi.getText() != null) {
						v = Integer.parseInt(PageSommerAgenda.wSuivi.getText());
					}

				} catch (NoSuchElementException exception) {
					System.out.println("ne pas  trouve : ");

				}
				try {
					if (PageSommerAgenda.waudit.getText() != null) {
						a = Integer.parseInt(PageSommerAgenda.waudit.getText());
					}

				} catch (NoSuchElementException exception) {
					System.out.println("ne pas  trouve : ");

				}
				try {
					if (PageSommerAgenda.wrealise.getText() != null) {
						di = Integer.parseInt(PageSommerAgenda.wrealise.getText());
					}

				} catch (NoSuchElementException exception) {
					System.out.println("ne pas  trouve : ");

				}
				try {
					if (PageSommerAgenda.wcloture.getText() != null) {
						c = Integer.parseInt(PageSommerAgenda.wcloture.getText());
					}

				} catch (NoSuchElementException exception) {
					System.out.println("ne pas  trouve : ");

				}
				try {
					if (PageSommerAgenda.wBD.getText() != null) {
						re = Integer.parseInt(PageSommerAgenda.wBD.getText());
					}

				} catch (NoSuchElementException exception) {
					System.out.println("ne pas  trouve : ");

				}
				try {
					if (PageSommerAgenda.wBDSuivi.getText() != null) {
						i = Integer.parseInt(PageSommerAgenda.wBDSuivi.getText());
					}

				} catch (NoSuchElementException exception) {
					System.out.println("ne pas  trouve : ");

				}

				int somme = d + e + r + v + a + di + c + re + i + doc + co+dk;
				System.out.println("somme agenda " + somme);
				etat = s1.equals(String.valueOf(somme));

				System.out.println(s1);

				Common.Exporter_Sommer(s1, String.valueOf(somme), "action", etat);

			} else {
				System.out.println("Module  non vendu");

			}
		}
	}

	public static void somme_agenda_Change_Control() throws Throwable {

		System.out.println("Agenda Change Control");

		Thread.sleep(5000);

		ExcelUtils.setExcelFile(Path, "ModuleVendu");

		ligne = ExcelUtils.GetLigneData1("Change Control");

		System.out.println("Module  et ?" + ExcelUtils.getCellData1(ligne, 1));
		if ("OUI".equals(ExcelUtils.getCellData1(ligne, 1))) {
			etat = true;
		} else {
			System.out.println("Module  non vendu");
			etat = false;
		}

	}

	public static void somme_agenda_Audit(WebDriver driver) throws Throwable {

		System.out.println("Agenda Audit");
		int d = 0, e = 0, r = 0, v = 0, a = 0, di = 0, c = 0, re = 0, i = 0, doc = 0, co = 0;
		Thread.sleep(5000);

		ExcelUtils.setExcelFile(Path, "ModuleVendu");

		ligne = ExcelUtils.GetLigneData1("Audit");

		System.out.println("Module  et ?" + ExcelUtils.getCellData1(ligne, 1));
		if ("OUI".equals(ExcelUtils.getCellData1(ligne, 1))) {
		try {	ModuleAuditsPage.AgendaId.click();}
		catch(NoSuchElementException exp) {
			System.out.println("agenda   introuvable  ");
		}catch(ElementNotInteractableException exp) {
			System.out.println(" agenda   introuvable");
		}

			s1 = PageSommerAgenda.wtotalAudit.getText();

			System.out.println(" somme est " + s1);
			try {
				if (PageSommerAgenda.winfoAudit.getText() != null) {
					d = Integer.parseInt(PageSommerAgenda.winfoAudit.getText());
				}

			} catch (NoSuchElementException exception) {
				System.out.println("ne pas  trouve : ");

			}

			try {
				if (PageSommerAgenda.waudite.getText() != null) {
					e = Integer.parseInt(PageSommerAgenda.waudite.getText());
				}

			} catch (NoSuchElementException exception) {
				System.out.println("ne pas  trouve : ");

			}

			try {
				if (PageSommerAgenda.wauditeur.getText() != null) {
					v = Integer.parseInt(PageSommerAgenda.wauditeur.getText());
				}

			} catch (NoSuchElementException exception) {
				System.out.println("ne pas  trouve : ");

			}
			try {
				if (PageSommerAgenda.wAuditConsulter.getText() != null) {
					a = Integer.parseInt(PageSommerAgenda.wAuditConsulter.getText());
				}

			} catch (NoSuchElementException exception) {
				System.out.println("ne pas  trouve : ");

			}
			try {
				if (PageSommerAgenda.wClotAudit.getText() != null) {
					di = Integer.parseInt(PageSommerAgenda.wClotAudit.getText());
				}

			} catch (NoSuchElementException exception) {
				System.out.println("ne pas  trouve : ");

			}

			try {
				if (PageSommerAgenda.wreportAudit.getText() != null) {
					i = Integer.parseInt(PageSommerAgenda.wreportAudit.getText());
				}

			} catch (NoSuchElementException exception) {
				System.out.println("ne pas  trouve : ");

			}
			try {
				if (PageSommerAgenda.wSuivi.getText() != null) {
					re = Integer.parseInt(PageSommerAgenda.wSuivi.getText());
				}

			} catch (NoSuchElementException exception) {
				System.out.println("ne pas  trouve : ");

			}

			int somme = d + e + r + v + a + di + c + re + i + doc + co;
			System.out.println("somme agenda " + somme);
			etat = s1.equals(String.valueOf(somme));

			System.out.println(s1);

			Common.Exporter_Sommer(s1, String.valueOf(somme), "audit", etat);

		} else {
			System.out.println("Module  non vendu");

		}
	}

	public static void somme_agenda_Indicateur(WebDriver driver) throws Throwable {

		System.out.println("Agenda Indicateur");
		int d = 0, e = 0,f=0;
		Thread.sleep(5000);

		ExcelUtils.setExcelFile(Path, "ModuleVendu");

		ligne = ExcelUtils.GetLigneData1("Indicateur");

		System.out.println("Module  et ?" + ExcelUtils.getCellData1(ligne, 1));
		if ("OUI".equals(ExcelUtils.getCellData1(ligne, 1))) {
			JavascriptExecutor executor = (JavascriptExecutor) driver;
			executor.executeScript("arguments[0].click()", IndicateurPage.agendaIndicateur_ID);

			s1 = PageSommerAgenda.wIndecateurTotal.getText();

			System.out.println(" somme est " + s1);
			try {
				if (PageSommerAgenda.wIndecateurFc.getText() != null) {
					d = Integer.parseInt(PageSommerAgenda.wIndecateurFc.getText());
				}

			} catch (NoSuchElementException exception) {
				System.out.println("ne pas  trouve : ");

			}

			try {
				if (PageSommerAgenda.wIndicateurSuivi.getText() != null) {
					e = Integer.parseInt(PageSommerAgenda.wIndicateurSuivi.getText());
				}


			} catch (NoSuchElementException exception) {
				System.out.println("ne pas  trouve : ");

			}
			try {
				if (PageSommerAgenda.wIndInfo.getText() != null) {
					f = Integer.parseInt(PageSommerAgenda.wIndInfo.getText());
				}

			} catch (NoSuchElementException exception) {
				System.out.println("ne pas  trouve : ");

			}


			int somme = d + e+f;
			System.out.println("somme agenda " + somme);
			etat = s1.equals(String.valueOf(somme));

			System.out.println(s1);

			Common.Exporter_Sommer(s1, String.valueOf(somme), "Indicateur", etat);

		} else {
			System.out.println("Module  non vendu");

		}
	}

	public static void somme_agenda_Risque_Opportunité(WebDriver driver) throws Throwable {
		System.out.println("Agenda Risquer ");
		int d = 0, e = 0, r = 0, v = 0;

		Thread.sleep(5000);

		ExcelUtils.setExcelFile(Path, "ModuleVendu");

		ligne = ExcelUtils.GetLigneData1("Risque Opportunité");

		System.out.println("Module  et ?" + ExcelUtils.getCellData1(ligne, 1));
		if ("OUI".equals(ExcelUtils.getCellData1(ligne, 1))) {
			RisqueOppModele.clique_sur_agenda_Risque(driver);

			s1 = PageSommerAgenda.wRisqueTotal.getText();

			System.out.println(" somme est " + s1);
			try {
				if (PageSommerAgenda.wEvalRisque.getText() != null) {
					d = Integer.parseInt(PageSommerAgenda.wEvalRisque.getText());
				}

			} catch (NoSuchElementException exception) {
				System.out.println("ne pas  trouve : ");

			}

			try {
				if (PageSommerAgenda.wInfoRisque.getText() != null) {
					e = Integer.parseInt(PageSommerAgenda.wInfoRisque.getText());
				}

			} catch (NoSuchElementException exception) {
				System.out.println("ne pas  trouve : ");

			}

			try {
				if (PageSommerAgenda.wInfoInfoEnju.getText() != null) {
					v = Integer.parseInt(PageSommerAgenda.wInfoInfoEnju.getText());
				}

			} catch (NoSuchElementException exception) {
				System.out.println("ne pas  trouve : ");

			}

			int somme = d + e + r + v;
			System.out.println("somme agenda " + somme);
			etat = s1.equals(String.valueOf(somme));

			System.out.println(s1);

			Common.Exporter_Sommer(s1, String.valueOf(somme), "Risque / Opp", etat);

		} else {
			System.out.println("Module  non vendu");

		}

	}

	public static void somme_agenda_Pnc(WebDriver driver) throws Throwable {

		System.out.println("Agenda Pnc");
		int d = 0, e = 0, r = 0, v = 0, a = 0, di = 0, c = 0, re = 0, i = 0, doc = 0, co = 0;

		Thread.sleep(5000);

		ExcelUtils.setExcelFile(Path, "ModuleVendu");

		ligne = ExcelUtils.GetLigneData1("PNC");

		System.out.println("Module  et ?" + ExcelUtils.getCellData1(ligne, 1));
		if ("OUI".equals(ExcelUtils.getCellData1(ligne, 1))) {
			ModulePNCModel.consulter_agendaPNC(driver);

			s1 = PageSommerAgenda.wPNCTotal.getText();

			System.out.println(" somme est " + s1);
			try {
				if (PageSommerAgenda.winfoPNC.getText() != null) {
					d = Integer.parseInt(PageSommerAgenda.winfoPNC.getText());
				}

			} catch (NoSuchElementException exception) {
				System.out.println("ne pas  trouve : ");

			}

			try {
				if (PageSommerAgenda.wValiderPNC.getText() != null) {
					e = Integer.parseInt(PageSommerAgenda.wValiderPNC.getText());
				}

			} catch (NoSuchElementException exception) {
				System.out.println("ne pas  trouve : ");

			}

			try {
				if (PageSommerAgenda.weffectuePnc.getText() != null) {
					v = Integer.parseInt(PageSommerAgenda.weffectuePnc.getText());
				}

			} catch (NoSuchElementException exception) {
				System.out.println("ne pas  trouve : ");

			}
			try {
				if (PageSommerAgenda.wtraitementPNC.getText() != null) {
					a = Integer.parseInt(PageSommerAgenda.wtraitementPNC.getText());
				}

			} catch (NoSuchElementException exception) {
				System.out.println("ne pas  trouve : ");

			}
			try {
				if (PageSommerAgenda.wtraitPNC.getText() != null) {
					di = Integer.parseInt(PageSommerAgenda.wtraitPNC.getText());
				}

			} catch (NoSuchElementException exception) {
				System.out.println("ne pas  trouve : ");

			}

			try {
				if (PageSommerAgenda.wSuivPnc.getText() != null) {
					i = Integer.parseInt(PageSommerAgenda.wSuivPnc.getText());
				}

			} catch (NoSuchElementException exception) {
				System.out.println("ne pas  trouve : ");

			}
			try {
				if (PageSommerAgenda.wApprovePnc.getText() != null) {
					co = Integer.parseInt(PageSommerAgenda.wApprovePnc.getText());
				}

			} catch (NoSuchElementException exception) {
				System.out.println("ne pas  trouve : ");

			}
			try {
				if (PageSommerAgenda.wfinalPNC.getText() != null) {
					doc = Integer.parseInt(PageSommerAgenda.wfinalPNC.getText());
				}

			} catch (NoSuchElementException exception) {
				System.out.println("ne pas  trouve : ");

			}
			int somme = d + e + r + v + a + di + c + re + i + doc + co;
			System.out.println("somme agenda " + somme);
			etat = s1.equals(String.valueOf(somme));

			System.out.println(s1);

			Common.Exporter_Sommer(s1, String.valueOf(somme), "PNC", etat);

		} else {
			System.out.println("Module  non vendu");

		}

	}

	public static void somme_agenda_client() throws Throwable {

		System.out.println("Agenda client");
		int d = 0, e = 0, r = 0, v = 0, a = 0, di = 0, c = 0, re = 0, i = 0, doc = 0, co = 0,kaz=0;

		Thread.sleep(5000);

		ExcelUtils.setExcelFile(Path, "ModuleVendu");

		ligne = ExcelUtils.GetLigneData1("Client");

		System.out.println("Module  et ?" + ExcelUtils.getCellData1(ligne, 1));
		if ("OUI".equals(ExcelUtils.getCellData1(ligne, 1))) {
			try {	ReclamationClientPage.AgdID.click();}
			catch(NoSuchElementException exp) {
				System.out.println("agenda   introuvable  ");
			}catch(ElementNotInteractableException exp) {
				System.out.println(" agenda   introuvable");
			}

			s1 = PageSommerAgenda.wtotalClient.getText();

			System.out.println(" somme est " + s1);
			try {
				if (PageSommerAgenda.winfoClient.getText() != null) {
					d = Integer.parseInt(PageSommerAgenda.winfoClient.getText());
				}

			} catch (NoSuchElementException exception) {
				System.out.println("ne pas  trouve : ");

			}

			try {
				if (PageSommerAgenda.weffClient.getText() != null) {
					e = Integer.parseInt(PageSommerAgenda.weffClient.getText());
				}

			} catch (NoSuchElementException exception) {
				System.out.println("ne pas  trouve : ");

			}

			try {
				if (PageSommerAgenda.wsuiviClient.getText() != null) {
					v = Integer.parseInt(PageSommerAgenda.wsuiviClient.getText());
				}

			} catch (NoSuchElementException exception) {
				System.out.println("ne pas  trouve : ");

			}
			try {
				if (PageSommerAgenda.wtraitementCleint.getText() != null) {
					a = Integer.parseInt(PageSommerAgenda.wtraitementCleint.getText());
				}

			} catch (NoSuchElementException exception) {
				System.out.println("ne pas  trouve : ");

			}
			try {
				if (PageSommerAgenda.wrecTrait.getText() != null) {
					co= Integer.parseInt(PageSommerAgenda.wrecTrait.getText());
				}

			} catch (NoSuchElementException exception) {
				System.out.println("ne pas  trouve : ");

			}
			try {
				if (PageSommerAgenda.wRecFinal.getText() != null) {
					doc= Integer.parseInt(PageSommerAgenda.wRecFinal.getText());
				}

			} catch (NoSuchElementException exception) {
				System.out.println("ne pas  trouve : ");

			}
			try {
				if (PageSommerAgenda.wApprovePnc.getText() != null) {
					kaz= Integer.parseInt(PageSommerAgenda.wApprovePnc.getText());
				}

			} catch (NoSuchElementException exception) {
				System.out.println("ne pas  trouve : ");

			}


			int somme = d + e + v + a+doc+co+kaz;
			System.out.println("somme agenda " + somme);
			etat = s1.equals(String.valueOf(somme));

			System.out.println(s1);

			Common.Exporter_Sommer(s1, String.valueOf(somme), "Cleint", etat);

		} else {
			System.out.println("Module  non vendu");

		}

	}

	public static void somme_agenda_Fournisseur() throws Throwable {

		System.out.println("Agenda Fournisseur");
		int d = 0, e = 0, r = 0, v = 0, a = 0, di = 0, c = 0, re = 0, i = 0, doc = 0, co = 0;
		Thread.sleep(5000);

		ExcelUtils.setExcelFile(Path, "ModuleVendu");

		ligne = ExcelUtils.GetLigneData1("Fournisseur");

		System.out.println("Module  et ?" + ExcelUtils.getCellData1(ligne, 1));
		if ("OUI".equals(ExcelUtils.getCellData1(ligne, 1))) {

			try {	EvalFourPage.AgdFrnID.click();}
			catch(NoSuchElementException exp) {
				System.out.println("agenda   introuvable  ");
			}catch(ElementNotInteractableException exp) {
				System.out.println(" agenda   introuvable");
			}

			s1 = PageSommerAgenda.wtotalFort.getText();

			System.out.println(" somme est " + s1);
			try {
				if (PageSommerAgenda.winfoFro.getText() != null) {
					d = Integer.parseInt(PageSommerAgenda.winfoFro.getText());
				}

			} catch (NoSuchElementException exception) {
				System.out.println("ne pas  trouve : ");

			}

			int somme = d + e + v + a;
			System.out.println("somme agenda " + somme);
			etat = s1.equals(String.valueOf(somme));

			System.out.println(s1);

			Common.Exporter_Sommer(s1, String.valueOf(somme), "Fournisseur", etat);

		} else {
			System.out.println("Module  non vendu");

		}

	}

	public static void somme_agenda_Réunion() throws Throwable {
		System.out.println("Agenda Réunion");
		int d = 0, e = 0, r = 0, v = 0, a = 0, di = 0, c = 0, re = 0, i = 0, doc = 0, co = 0;

		Thread.sleep(5000);

		ExcelUtils.setExcelFile(Path, "ModuleVendu");

		ligne = ExcelUtils.GetLigneData1("Réunion");

		System.out.println("Module  et ?" + ExcelUtils.getCellData1(ligne, 1));
		if ("OUI".equals(ExcelUtils.getCellData1(ligne, 1))) {
			
			try {	ModuleReunionPage.cmptreunionID.click();}
			catch(NoSuchElementException exp) {
				System.out.println("agenda   introuvable  ");
			}catch(ElementNotInteractableException exp) {
				System.out.println(" agenda   introuvable");
			}
			Thread.sleep(5000);

		

				s1 = PageSommerAgenda.wtotalReun.getText();

				System.out.println(" somme est " + s1);
				try {
					if (PageSommerAgenda.winfoReunion.getText() != null) {
						d = Integer.parseInt(PageSommerAgenda.winfoReunion.getText());
					}

				} catch (NoSuchElementException exception) {
					System.out.println("ne pas  trouve : ");

				}
				try {
					if (PageSommerAgenda.wplanReun.getText() != null) {
						e = Integer.parseInt(PageSommerAgenda.wplanReun.getText());
					}

				} catch (NoSuchElementException exception) {
					System.out.println("ne pas  trouve : ");

				}


				int somme = d + e + v + a;
				System.out.println("somme agenda " + somme);
				etat = s1.equals(String.valueOf(somme));

				System.out.println(s1);

				Common.Exporter_Sommer(s1, String.valueOf(somme), "Réunion", etat);

			} else {
				System.out.println("Module  non vendu");

			}
	}

	public static void somme_agenda_Métrologie() throws Throwable {
		System.out.println("Agenda Métrologie");
		int d = 0, e = 0, r = 0, v = 0, a = 0, di = 0, c = 0, re = 0, i = 0, doc = 0, co = 0;

		Thread.sleep(5000);

		ExcelUtils.setExcelFile(Path, "ModuleVendu");

		ligne = ExcelUtils.GetLigneData1("Métrologie");

		System.out.println("Module  et ?" + ExcelUtils.getCellData1(ligne, 1));
		if ("OUI".equals(ExcelUtils.getCellData1(ligne, 1))) {
		try {	PageSommerAgenda.wmetrologie.click();}
		catch(ElementNotInteractableException exp) {
			System.out.println(" agenda   introuvable");
		}
		catch(NoSuchElementException exp) {
			System.out.println(" agenda   introuvable");
		}
		catch(StaleElementReferenceException exp) {
			System.out.println(" agenda   introuvable");
		}
		
		

			

					s1 = PageSommerAgenda.wmetrologie.getText();

					System.out.println(" somme est " + s1);
					try {
						if (PageSommerAgenda.wMetRR.getText() != null) {
							d = Integer.parseInt(PageSommerAgenda.wMetRR.getText());
						}

					} catch (NoSuchElementException exception) {
						System.out.println("ne pas  trouve : ");

					}
					try {
						if (PageSommerAgenda.wMetTrait.getText() != null) {
							e = Integer.parseInt(PageSommerAgenda.wMetTrait.getText());
						}

					} catch (NoSuchElementException exception) {
						System.out.println("ne pas  trouve : ");

					}


					int somme = d + e + v + a;
					System.out.println("somme agenda " + somme);
					etat = s1.equals(String.valueOf(somme));

					System.out.println(s1);

					Common.Exporter_Sommer(s1, String.valueOf(somme), "Métrologie", etat);

				} else {
					System.out.println("Module  non vendu");

				}
	
	}

	public static void somme_agenda_GRH() throws Throwable {

		System.out.println("Agenda GRH");
		int d = 0, e = 0, r = 0, v = 0, a = 0, di = 0, c = 0, re = 0, i = 0, doc = 0, co = 0,MK=0,KM=0,ze=0,za=0;

		Thread.sleep(5000);
		ExcelUtils.setExcelFile(Path, "ModuleVendu");

		ligne = ExcelUtils.GetLigneData1("GRH");

		System.out.println("Module  et ?" + ExcelUtils.getCellData1(ligne, 1));
		if ("OUI".equals(ExcelUtils.getCellData1(ligne, 1))) {
			try {				SatisPersonnelModel.consulter_agenda_RH();
}
			catch(NoSuchElementException exp) {
				System.out.println(" agenda   introuvable");
			}catch(ElementNotInteractableException exp) {
				System.out.println(" agenda   introuvable");
			}
	
				s1 = PageSommerAgenda.wGRHTOTAL.getText();

				System.out.println(" somme est " + s1);
				try {
					if (PageSommerAgenda.wGRHPLN.getText() != null) {
						d = Integer.parseInt(PageSommerAgenda.wGRHPLN.getText());
					}

				} catch (NoSuchElementException exception) {
					System.out.println("ne pas  trouve : ");

				}

				try {
					if (PageSommerAgenda.wGRHINFO.getText() != null) {
						e = Integer.parseInt(PageSommerAgenda.wGRHINFO.getText());
					}

				} catch (NoSuchElementException exception) {
					System.out.println("ne pas  trouve : ");

				}
				try {
					if (PageSommerAgenda.wGRHVAL.getText() != null) {
						r = Integer.parseInt(PageSommerAgenda.wGRHVAL.getText());
					}

				} catch (NoSuchElementException exception) {
					System.out.println("ne pas  trouve : ");

				}
				try {
					if (PageSommerAgenda.wGRHREFU.getText() != null) {
						v = Integer.parseInt(PageSommerAgenda.wGRHREFU.getText());
					}

				} catch (NoSuchElementException exception) {
					System.out.println("ne pas  trouve : ");

				}
				try {
					if (PageSommerAgenda.wGRHinforma.getText() != null) {
						a = Integer.parseInt(PageSommerAgenda.wGRHinforma.getText());
					}

				} catch (NoSuchElementException exception) {
					System.out.println("ne pas  trouve : ");

				}
				try {
					if (PageSommerAgenda.wGRHFORPL.getText() != null) {
						di = Integer.parseInt(PageSommerAgenda.wGRHFORPL.getText());
					}

				} catch (NoSuchElementException exception) {
					System.out.println("ne pas  trouve : ");

				}
				try {
					if (PageSommerAgenda.wGRHCHAUD.getText() != null) {
						c = Integer.parseInt(PageSommerAgenda.wGRHCHAUD.getText());
					}

				} catch (NoSuchElementException exception) {
					System.out.println("ne pas  trouve : ");

				}
				try {
					if (PageSommerAgenda.wGRHFROID .getText() != null) {
						re = Integer.parseInt(PageSommerAgenda.wGRHFROID.getText());
					}

				} catch (NoSuchElementException exception) {
					System.out.println("ne pas  trouve : ");

				}
				try {
					if (PageSommerAgenda.wGRHPRSO.getText() != null) {
						i = Integer.parseInt(PageSommerAgenda.wGRHPRSO.getText());
					}

				} catch (NoSuchElementException exception) {
					System.out.println("ne pas  trouve : ");

				}
				try {
					if (PageSommerAgenda.wGRHTRAIT.getText() != null) {
						doc = Integer.parseInt(PageSommerAgenda.wGRHTRAIT.getText());
					}

				} catch (NoSuchElementException exception) {
					System.out.println("ne pas  trouve : ");

				}
				try {
					if (PageSommerAgenda.wGRHRETOUR.getText() != null) {
						co = Integer.parseInt(PageSommerAgenda.wGRHRETOUR.getText());
					}

				} catch (NoSuchElementException exception) {
					System.out.println("ne pas  trouve : ");

				}
				try {
					if (PageSommerAgenda.wGRHCIN.getText() != null) {
						KM = Integer.parseInt(PageSommerAgenda.wGRHCIN.getText());
					}

				} catch (NoSuchElementException exception) {
					System.out.println("ne pas  trouve : ");

				}
				try {
					if (PageSommerAgenda.wGRHDES.getText() != null) {
						MK = Integer.parseInt(PageSommerAgenda.wGRHDES.getText());
					}

				} catch (NoSuchElementException exception) {
					System.out.println("ne pas  trouve : ");

				}
				try {
					if (PageSommerAgenda.wEnriSatiPer.getText() != null) {
						ze = Integer.parseInt(PageSommerAgenda.wEnriSatiPer.getText());
					}

				} catch (NoSuchElementException exception) {
					System.out.println("ne pas  trouve : ");

				}

				try {
					if (PageSommerAgenda.wEvaFormaParti.getText() != null) {
						za = Integer.parseInt(PageSommerAgenda.wEvaFormaParti.getText());
					}

				} catch (NoSuchElementException exception) {
					System.out.println("ne pas  trouve : ");

				}

				int somme = d + e + r + v + a + di + c + re + i + doc + co+KM+MK+za+ze;
				System.out.println("somme agenda " + somme);
				etat = s1.equals(String.valueOf(somme));

				System.out.println(s1);

				Common.Exporter_Sommer(s1, String.valueOf(somme), "GRH", etat);

			} else {
				System.out.println("Module  non vendu");

			}
			
			
	}

	public static void somme_agenda_partie_interesséss(WebDriver driver) throws Throwable {

		System.out.println("Agenda Partie Interesséés");

		int d = 0, e = 0, r = 0, v = 0, a = 0, di = 0, c = 0, re = 0, i = 0, doc = 0, co = 0;

		Thread.sleep(5000);

		ExcelUtils.setExcelFile(Path, "ModuleVendu");

		ligne = ExcelUtils.GetLigneData1("Partie Interessées");

		System.out.println("Module  et ?" + ExcelUtils.getCellData1(ligne, 1));
		if ("OUI".equals(ExcelUtils.getCellData1(ligne, 1))) {
			JavascriptExecutor executor = (JavascriptExecutor) driver;
			executor.executeScript("arguments[0].click()", PageSommerAgenda.wpartierIntersse);


			

					s1 = PageSommerAgenda.wpartierIntersse.getText();

					System.out.println(" somme est " + s1);
					try {
						if (PageSommerAgenda.wPIINFO.getText() != null) {
							d = Integer.parseInt(PageSommerAgenda.wPIINFO.getText());
						}

					} catch (NoSuchElementException exception) {
						System.out.println("ne pas  trouve : ");

					}
					try {
						if (PageSommerAgenda.wPITRAIT.getText() != null) {
							e = Integer.parseInt(PageSommerAgenda.wPITRAIT.getText());
						}

					} catch (NoSuchElementException exception) {
						System.out.println("ne pas  trouve : ");

					}


					int somme = d + e + v + a;
					System.out.println("somme agenda " + somme);
					etat = s1.equals(String.valueOf(somme));

					System.out.println(s1);

					Common.Exporter_Sommer(s1, String.valueOf(somme), "PI", etat);

				} else {
					System.out.println("Module  non vendu");

				}
	}

	public static void somme_agenda_Achat() throws Throwable {
		System.out.println("Agenda Achat");

		Thread.sleep(5000);

		ExcelUtils.setExcelFile(Path, "ModuleVendu");

		ligne = ExcelUtils.GetLigneData1("Achat");

		System.out.println("Module  et ?" + ExcelUtils.getCellData1(ligne, 1));
		if ("OUI".equals(ExcelUtils.getCellData1(ligne, 1))) {
			// etat=true;
		} else {
			System.out.println("Module  non vendu");
			// etat=false;
		}

	}

	public static void somme_agenda_Environnement(WebDriver driver) throws Throwable {

		System.out.println("Agenda Envrionnement");
		int d = 0, e = 0, r = 0, v = 0, a = 0, di = 0, c = 0, re = 0, i = 0, doc = 0, co = 0,cab=0;

		Thread.sleep(5000);
		ExcelUtils.setExcelFile(Path, "ModuleVendu");

		ligne = ExcelUtils.GetLigneData1("Environnement");

		System.out.println("Module  et ?" + ExcelUtils.getCellData1(15, 1));
		if ("OUI".equals(ExcelUtils.getCellData1(15, 1))) {
			

			try {IncidentModel.consulter_agenda(driver);}
			catch(NoSuchElementException exp) {
				System.out.println("agenda   introuvable  ");
			}catch(ElementNotInteractableException exp) {
				System.out.println(" agenda   introuvable");
			}
				

						s1 = PageSommerAgenda.wEnvtotal.getText();

						System.out.println(" somme est " + s1);
						try {
							if (PageSommerAgenda.wEnvInfo.getText() != null) {
								d = Integer.parseInt(PageSommerAgenda.wEnvInfo.getText());
							}

						} catch (NoSuchElementException exception) {
							System.out.println("ne pas  trouve : ");

						}
						try {
							if (PageSommerAgenda.wEnvival.getText() != null) {
								e = Integer.parseInt(PageSommerAgenda.wEnvival.getText());
							}

						} catch (NoSuchElementException exception) {
							System.out.println("ne pas  trouve : ");

						}
						try {
							if (PageSommerAgenda.wEnviTrait.getText() != null) {
								r = Integer.parseInt(PageSommerAgenda.wEnviTrait.getText());
							}

						} catch (NoSuchElementException exception) {
							System.out.println("ne pas  trouve : ");

						}
						try {
							if (PageSommerAgenda.wEnvtrait.getText() != null) {
								v = Integer.parseInt(PageSommerAgenda.wEnvtrait.getText());
							}

						} catch (NoSuchElementException exception) {
							System.out.println("ne pas  trouve : ");

						}
						try {
							if (PageSommerAgenda.wincidinetrait.getText() != null) {
								a= Integer.parseInt(PageSommerAgenda.wincidinetrait.getText());
							}

						} catch (NoSuchElementException exception) {
							System.out.println("ne pas  trouve : ");

						}
						try {
							if (PageSommerAgenda.wEnEnvClot.getText() != null) {
								di = Integer.parseInt(PageSommerAgenda.wEnEnvClot.getText());
							}

						} catch (NoSuchElementException exception) {
							System.out.println("ne pas  trouve : ");

						}
						try {
							if (PageSommerAgenda.wEnEnvClot.getText() != null) {
								cab = Integer.parseInt(PageSommerAgenda.wEnEnvCorrige.getText());
							}

						} catch (NoSuchElementException exception) {
							System.out.println("ne pas  trouve : ");

						}
						
						


						int somme = d + e + v + a+r+di+cab;
						System.out.println("somme agenda " + somme);
						etat = s1.equals(String.valueOf(somme));

						System.out.println(s1);

						Common.Exporter_Sommer(s1, String.valueOf(somme), "Environnement", etat);

					} else {
						System.out.println("Module  non vendu");

					}

	}

	public static void somme_agenda_Sécurite(WebDriver driver) throws Throwable {
		System.out.println("Agenda Securité");

		int d = 0, e = 0, r = 0, v = 0, a = 0, di = 0, c = 0, re = 0, i = 0, doc = 0, co = 0 ,q=0;

		Thread.sleep(5000);

		ExcelUtils.setExcelFile(Path, "ModuleVendu");

		ligne = ExcelUtils.GetLigneData1("Sécurité");

		System.out.println("Module  et ?" + ExcelUtils.getCellData1(ligne, 1));
		if ("OUI".equals(ExcelUtils.getCellData1(ligne, 1))) {
		
		 try {	 PageSommerAgenda.wSecuTotal.click();}
			catch(NoSuchElementException exp) {
				System.out.println(" agenda   introuvable");
			}catch(ElementNotInteractableException exp) {
				System.out.println(" agenda   introuvable");
			}


		 try {
				if (PageSommerAgenda.wSuivi.getText() != null) {
					v = Integer.parseInt(PageSommerAgenda.wSuivi.getText());
				}

			} catch (NoSuchElementException exception) {
				System.out.println("ne pas  trouve : ");

			}
					

							s1 =  PageSommerAgenda.wSecuTotal.getText();

							System.out.println(" somme est " + s1);
							try {
								if (PageSommerAgenda.wSecuInfo.getText() != null) {
									d = Integer.parseInt(PageSommerAgenda.wSecuInfo.getText());
								}

							} catch (NoSuchElementException exception) {
								System.out.println("ne pas  trouve : ");

							}
							try {
								if (PageSommerAgenda.wSecuCor.getText() != null) {
									q = Integer.parseInt(PageSommerAgenda.wSecuCor.getText());
								}

							} catch (NoSuchElementException exception) {
								System.out.println("ne pas  trouve : ");

							}
							try {
								if (PageSommerAgenda.wSecuVald.getText() != null) {
									e = Integer.parseInt(PageSommerAgenda.wSecuVald.getText());
								}

							} catch (NoSuchElementException exception) {
								System.out.println("ne pas  trouve : ");

							}
							try {
								if (PageSommerAgenda.wSecuEval.getText() != null) {
									r = Integer.parseInt(PageSommerAgenda.wSecuEval.getText());
								}

							} catch (NoSuchElementException exception) {
								System.out.println("ne pas  trouve : ");

							}
							
							try {
								if (PageSommerAgenda.wSecuClot.getText() != null) {
									a= Integer.parseInt(PageSommerAgenda.wSecuClot.getText());
								}

							} catch (NoSuchElementException exception) {
								System.out.println("ne pas  trouve : ");

							}
							try {
								if (PageSommerAgenda.wSecuclotIn.getText() != null) {
									di = Integer.parseInt(PageSommerAgenda.wSecuclotIn.getText());
								}

							} catch (NoSuchElementException exception) {
								System.out.println("ne pas  trouve : ");

							}
							try {
								if (PageSommerAgenda.wSecuTrait.getText() != null) {
									c = Integer.parseInt(PageSommerAgenda.wSecuTrait.getText());
								}

							} catch (NoSuchElementException exception) {
								System.out.println("ne pas  trouve : ");

							}
							try {
								if (PageSommerAgenda.wSecuTraitment.getText() != null) {
									re = Integer.parseInt(PageSommerAgenda.wSecuTraitment.getText());
								}

							} catch (NoSuchElementException exception) {
								System.out.println("ne pas  trouve : ");

							}
							try {
								if (PageSommerAgenda.wSecuUrg.getText() != null) {
									i = Integer.parseInt(PageSommerAgenda.wSecuUrg.getText());
								}

							} catch (NoSuchElementException exception) {
								System.out.println("ne pas  trouve : ");

							}
							try {
								if (PageSommerAgenda.wSecuViste.getText() != null) {
									doc = Integer.parseInt(PageSommerAgenda.wSecuViste.getText());
								}

							} catch (NoSuchElementException exception) {
								System.out.println("ne pas  trouve : ");

							}


							
							int somme = d + e + v + a+r+di+c+re+i+doc;
							System.out.println("somme agenda " + somme);
							etat = s1.equals(String.valueOf(somme));

							System.out.println(s1);

							Common.Exporter_Sommer(s1, String.valueOf(somme), "Sécurite", etat);

						} else {
							System.out.println("Module  non vendu");

						}

		
	}
	
	public static void somme_agenda_Réglementation(WebDriver driver) throws Throwable {
		System.out.println("Agenda Reglementation");

		int d = 0, e = 0, r = 0, v = 0, a = 0, di = 0, c = 0, re = 0, i = 0, doc = 0, co = 0;

		Thread.sleep(5000);

		ExcelUtils.setExcelFile(Path, "ModuleVendu");

		ligne = ExcelUtils.GetLigneData1("Réglementation");

		System.out.println("Module  et ?" + ExcelUtils.getCellData1(17, 1));
		if ("OUI".equals(ExcelUtils.getCellData1(17, 1))) {
		 

		 try {PageSommerAgenda.wTotalReg.click();}
			catch(NoSuchElementException exp) {
				System.out.println(" agenda   introuvable");
			}
		 catch(ElementNotInteractableException exp) {
				System.out.println(" agenda   introuvable");
			}



					

							s1 =   PageSommerAgenda.wTotalReg.getText();

							System.out.println(" somme est " + s1);
							try {
								if (PageSommerAgenda.wExiReg.getText() != null) {
									d = Integer.parseInt(PageSommerAgenda.wExiReg.getText());
								}

							} catch (NoSuchElementException exception) {
								System.out.println("ne pas  trouve : ");

							}
							try {
								if (PageSommerAgenda.wRegEval.getText() != null) {
									e = Integer.parseInt(PageSommerAgenda.wRegEval.getText());
								}

							} catch (NoSuchElementException exception) {
								System.out.println("ne pas  trouve : ");

							}
							

							
							int somme = d + e + v + a+r+di+c+re+i+doc;
							System.out.println("somme agenda " + somme);
							etat = s1.equals(String.valueOf(somme));

							System.out.println(s1);

							Common.Exporter_Sommer(s1, String.valueOf(somme), "Réglementation", etat);

						} else {
							System.out.println("Module  non vendu");

						}

		
	}

}
