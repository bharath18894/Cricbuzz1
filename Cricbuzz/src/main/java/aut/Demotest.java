package aut;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demotest extends ScorecardPage{

	public static void test(String url) {
		
		
		driver.get(url);
	//	while(true) {
		ScorecardPage.Matchtitle();

		ScorecardPage.scorecardstatus();
		//test
//		System.out.println(ScorecardPage.scrstatustxt);
		
		//innings_1 
		ScorecardPage.innings_1Header();
		//test
//		System.out.println(ScorecardPage.ing1_Htxt[0]);
//		System.out.println(ScorecardPage.ing1_Htxt[1]);
		
		ScorecardPage.innings_1Title();
		//test
//		for(String s:ScorecardPage.ing1_Titletxt) {
//			System.out.println(s);}
		
		
		
		ScorecardPage.innings_1playerscrcd();
		//test
		//System.out.println(ScorecardPage.ing1_playertxt.get(5)[0]);
		
		ScorecardPage.innings_1FOW();
		//test
		//System.out.println(ScorecardPage.ing_1FoWtxt);
		//System.out.println(ScorecardPage.innings_1FOWplList);
		
		
		ScorecardPage.innings_1BOWTitle();
		//test
		//System.out.println(ScorecardPage.ing1_BOWTitletxt[2]);
		
		ScorecardPage.innings_1playerscrcdBowl();
		ScorecardPage.ing1_pptitle();
		
		System.out.println("----------------------------------------");
		
		//innings2
		
		ScorecardPage.innings_2Header();
		//test
//		System.out.println(ScorecardPage.ing2_Htxt[0]);
//		System.out.println(ScorecardPage.ing2_Htxt[1]);
		
		if(ing2_present) {
//		
		ScorecardPage.innings_2Title();
		//test
//		for(String s:ScorecardPage.ing2_Titletxt) {
//			System.out.println(s);}
		
		
		
		ScorecardPage.innings_2playerscrcd();
		//test
		//System.out.println(ScorecardPage.ing2_playertxt.get(2)[0]);
		
		ScorecardPage.innings_2FOW();
		//test
		//System.out.println(ScorecardPage.ing_2FoWtxt);
		//System.out.println(ScorecardPage.innings_2FOWplList);
		
		
		ScorecardPage.innings_2BOWTitle();
		//test
		//System.out.println(ScorecardPage.ing1_BOWTitletxt[2]);
		
		ScorecardPage.innings_2playerscrcdBowl();
		ScorecardPage.ing2_pptitle();
		
		}
	}
	
	public static void excel() {
		//Excel
		
		
		
		Cricbuzz_Excel excel=new Cricbuzz_Excel();
		
		Cricbuzz_Excel.excel_TitleMatch(ScorecardPage.matchTitletxt);
		Cricbuzz_Excel.excel_scrstatus(ScorecardPage.scrstatustxt);
		
		
		if(ScorecardPage.color.contains("blue")) {
		Cricbuzz_Excel.excel_Ing1Head(ScorecardPage.ing1_Htxt);
		Cricbuzz_Excel.excel_Ing1titletxt(ScorecardPage.ing1_Titletxt);
		Cricbuzz_Excel.excel_Ing1BATplTxt(ScorecardPage.ing1_playertxt);
		if(ScorecardPage.ing_1FoWtxt!=null) {
		Cricbuzz_Excel.excel_Ing1FOWHead(ScorecardPage.ing_1FoWtxt);
		Cricbuzz_Excel.excel_Ing1FOWtxt(ScorecardPage.innings_1FOWplList);
		}
		
		Cricbuzz_Excel.excel_Ing1titletxt(ScorecardPage.ing1_BOWTitletxt);
		Cricbuzz_Excel.excel_Ing1BATplTxt(ScorecardPage.ing1_playerBowltxt);
		if(ScorecardPage.ing1_powerplaytitle!=null) {
			Cricbuzz_Excel.excel_Ing1titletxt(ScorecardPage.ing1_powerplaytitle);
			Cricbuzz_Excel.excel_PPtxt(ScorecardPage.ing1_powerplaytxt);
			
		}
		
		if(ScorecardPage.ing2_present) {
		
		Cricbuzz_Excel.excel_Ing1Head(ScorecardPage.ing2_Htxt);
		Cricbuzz_Excel.excel_Ing1titletxt(ScorecardPage.ing2_Titletxt);
		Cricbuzz_Excel.excel_Ing1BATplTxt(ScorecardPage.ing2_playertxt);
		if(ScorecardPage.ing_2FoWtxt!=null) {
			Cricbuzz_Excel.excel_Ing1FOWHead(ScorecardPage.ing_2FoWtxt);
			Cricbuzz_Excel.excel_Ing1FOWtxt(ScorecardPage.innings_2FOWplList);
			}
		
		
		Cricbuzz_Excel.excel_Ing1titletxt(ScorecardPage.ing2_BOWTitletxt);
		Cricbuzz_Excel.excel_Ing1BATplTxt(ScorecardPage.ing2_playerBowltxt);
		if(ing2_powerplaytitle!=null) {
			Cricbuzz_Excel.excel_Ing1titletxt(ScorecardPage.ing2_powerplaytitle);
			Cricbuzz_Excel.excel_PPtxt(ScorecardPage.ing2_powerplaytxt);
			
		}
		}
		}
		else {
			if(ScorecardPage.ing2_present) {
				
				Cricbuzz_Excel.excel_Ing1Head(ScorecardPage.ing2_Htxt);
				Cricbuzz_Excel.excel_Ing1titletxt(ScorecardPage.ing2_Titletxt);
				Cricbuzz_Excel.excel_Ing1BATplTxt(ScorecardPage.ing2_playertxt);
				if(ScorecardPage.ing_2FoWtxt!=null) {
					Cricbuzz_Excel.excel_Ing1FOWHead(ScorecardPage.ing_2FoWtxt);
					Cricbuzz_Excel.excel_Ing1FOWtxt(ScorecardPage.innings_2FOWplList);
					}
				
				
				Cricbuzz_Excel.excel_Ing1titletxt(ScorecardPage.ing2_BOWTitletxt);
				Cricbuzz_Excel.excel_Ing1BATplTxt(ScorecardPage.ing2_playerBowltxt);
				if(ScorecardPage.ing2_powerplaytitle!=null) {
					Cricbuzz_Excel.excel_Ing1titletxt(ScorecardPage.ing2_powerplaytitle);
					Cricbuzz_Excel.excel_PPtxt(ScorecardPage.ing2_powerplaytxt);
					
					
					Cricbuzz_Excel.excel_Ing1Head(ScorecardPage.ing1_Htxt);
					Cricbuzz_Excel.excel_Ing1titletxt(ScorecardPage.ing1_Titletxt);
					Cricbuzz_Excel.excel_Ing1BATplTxt(ScorecardPage.ing1_playertxt);
					if(ing_1FoWtxt!=null) {
					Cricbuzz_Excel.excel_Ing1FOWHead(ScorecardPage.ing_1FoWtxt);
					Cricbuzz_Excel.excel_Ing1FOWtxt(ScorecardPage.innings_1FOWplList);
					}
					
					Cricbuzz_Excel.excel_Ing1titletxt(ScorecardPage.ing1_BOWTitletxt);
					Cricbuzz_Excel.excel_Ing1BATplTxt(ScorecardPage.ing1_playerBowltxt);
					if(ing1_powerplaytitle!=null) {
						Cricbuzz_Excel.excel_Ing1titletxt(ScorecardPage.ing1_powerplaytitle);
						Cricbuzz_Excel.excel_PPtxt(ScorecardPage.ing1_powerplaytxt);
						
					}
					
					
				}
		}
			else {
				Cricbuzz_Excel.excel_Ing1Head(ScorecardPage.ing1_Htxt);
				Cricbuzz_Excel.excel_Ing1titletxt(ScorecardPage.ing1_Titletxt);
				Cricbuzz_Excel.excel_Ing1BATplTxt(ScorecardPage.ing1_playertxt);
				if(ing_1FoWtxt!=null) {
				Cricbuzz_Excel.excel_Ing1FOWHead(ScorecardPage.ing_1FoWtxt);
				Cricbuzz_Excel.excel_Ing1FOWtxt(ScorecardPage.innings_1FOWplList);
				}
				
				Cricbuzz_Excel.excel_Ing1titletxt(ScorecardPage.ing1_BOWTitletxt);
				Cricbuzz_Excel.excel_Ing1BATplTxt(ScorecardPage.ing1_playerBowltxt);
				if(ing1_powerplaytitle!=null) {
					Cricbuzz_Excel.excel_Ing1titletxt(ScorecardPage.ing1_powerplaytitle);
					Cricbuzz_Excel.excel_PPtxt(ScorecardPage.ing1_powerplaytxt);
					
				}
				
			}
		
		}
		Cricbuzz_Excel.excel_close();
		
		
			
			

	if(Cricbuzz_Excel.foe) {
//		break;
	}
		
	
		
//		}
		
		
	}
		
		
		
		

}


