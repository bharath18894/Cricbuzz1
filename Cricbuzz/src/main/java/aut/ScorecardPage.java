package aut;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import cucumber.runtime.StepDefinition;
import stepDefinition.Step_Definition;

public class ScorecardPage {
	public static WebDriver driver=Step_Definition.driver;
	public static WebElement matchtitle;
	public static String matchTitletxt;
	public static WebElement scrstatus;
	public static String scrstatustxt;
	public static String color;
	public static WebElement innings_1Head;
	public static String[] ing1_Htxt;
	public static WebElement innings_1Title;
	public static String[] ing1_Titletxt;
	public static List<WebElement> innings_1playerscrcd;
	public static List<String[]> ing1_playertxt;
	public static WebElement innings_1FOW;
	public static String ing_1FoWtxt;
	public static String innings_1FOWplList;
	public static WebElement innings_1BOWTitle;
	public static String[] ing1_BOWTitletxt;
	public static List<WebElement> innings_1playerBowlscrcd;
	public static List<String[]> ing1_playerBowltxt;
	public static WebElement ing1_pptitle;
	public static String[] ing1_powerplaytitle;
	public static WebElement ing1_pptxt;
	public static String[] ing1_powerplaytxt;
	
	
	public static boolean ing2_present;
	public static WebElement innings_2Head;
	public static String[] ing2_Htxt;
	public static WebElement innings_2Title;
	public static String[] ing2_Titletxt;
	public static List<WebElement> innings_2playerscrcd;
	public static List<String[]> ing2_playertxt;
	public static WebElement innings_2FOW;
	public static String ing_2FoWtxt;
	public static String innings_2FOWplList;
	public static WebElement innings_2BOWTitle;
	public static String[] ing2_BOWTitletxt;
	public static List<WebElement> innings_2playerBowlscrcd;
	public static List<String[]> ing2_playerBowltxt;
	public static WebElement ing2_pptitle;
	public static String[] ing2_powerplaytitle;
	public static WebElement ing2_pptxt;
	public static String[] ing2_powerplaytxt;
	
	
	
	public static void Matchtitle() {
		try {
			matchtitle=driver.findElement(By.xpath("//h1[@class='cb-nav-hdr cb-font-18 line-ht24']"));
			matchTitletxt=matchtitle.getText();
		}
		catch(Exception e)
		{
			System.out.println("title error");
		}
	}
	
	
	
	
	public static void scorecardstatus() {

		
		try {
			scrstatus=driver.findElement(By.xpath("//div[@class='cb-col cb-scrcrd-status cb-col-100 cb-text-complete ng-scope']"));
			color="blue";
			
		}
		catch (Exception e) {
			scrstatus=driver.findElement(By.xpath("//div[@class='cb-col cb-scrcrd-status cb-col-100 cb-text-live ng-scope']"));
			color="red";
		}
		scrstatustxt=scrstatus.getText();
		
	}
	
	public static void innings_1Header() {
		try {
			innings_1Head=driver.findElement(By.xpath("//div[@id='innings_1']//child::div[@class='cb-col cb-col-100 cb-scrd-hdr-rw']"));
			List<WebElement> span=innings_1Head.findElements(By.tagName("span"));
			ing1_Htxt=new String[7];
			ing1_Htxt[0]=span.get(0).getText();
			ing1_Htxt[1]="";ing1_Htxt[2]="";ing1_Htxt[3]="";ing1_Htxt[4]="";ing1_Htxt[5]="";
			ing1_Htxt[6]=span.get(1).getText();
		}
		catch(Exception e) {
			System.out.println("error in innings_1Header()");
			
		}
	}
	
	public static void innings_1Title() {
		try {
		innings_1Title=driver.findElement(By.xpath("//div[@id='innings_1']//parent::div[@class='cb-col cb-col-100 cb-scrd-hdr-rw']//following-sibling::div[@class='cb-col cb-col-100 cb-scrd-sub-hdr cb-bg-gray']"));
		List<WebElement> div=innings_1Title.findElements(By.tagName("div"));
		ing1_Titletxt=new String[div.size()];
		
		for(int i=0;i<div.size();i++) {
			ing1_Titletxt[i]=div.get(i).getText();
		}
			
		}
		catch(Exception e) {
			System.out.println("error in innings_1Title()");
			
		}
	}
	public static void innings_1playerscrcd() {
		try {
			ing1_playertxt=new ArrayList<String[]>();
			List<WebElement> innings_1playerscrcd=driver.findElements(By.xpath("//div[@id='innings_1']//parent::div[@class='cb-col cb-col-100 cb-scrd-hdr-rw']//following-sibling::div[@class='cb-col cb-col-100 cb-scrd-itms']"));
			for(int i=0;i<innings_1playerscrcd.size();i++) {
				List<WebElement> div=innings_1playerscrcd.get(i).findElements(By.tagName("div"));
				String[] playwise=new String[div.size()];
				for(int j=0;j<div.size();j++) {
					//System.out.print(div.get(j).getText()+"\t");
					playwise[j]=div.get(j).getText();
				}
				ing1_playertxt.add(playwise);
			}

		//	System.out.println(ing1_playertxt.get(0)[0]);
	
		}
		catch(Exception e) {
			System.out.println("error in innings_1playerscrcd()");
		}
	}
	public static void innings_1FOW() {
		try {
		 innings_1FOW=driver.findElement(By.xpath("//div[@id='innings_1']//div[@class='cb-col cb-col-100 cb-ltst-wgt-hdr']//preceding-sibling::div[@class='cb-col cb-col-100 cb-scrd-sub-hdr cb-bg-gray text-bold']"));
		 ing_1FoWtxt=innings_1FOW.getText();
		 innings_1FOWplList=driver.findElement(By.xpath("//div[@id='innings_1']//parent::div[@class='cb-col cb-col-100 cb-col-rt cb-font-13']")).getText();
		}
		catch(Exception e) {
			System.out.println("error in innings_1FOW()");
		}
	}
	public static void innings_1BOWTitle() {
		try {
		innings_1BOWTitle=driver.findElement(By.xpath("(//div[@id='innings_1']//div[@class='cb-col cb-col-100 cb-scrd-sub-hdr cb-bg-gray'])[2]"));
		List<WebElement> div=innings_1BOWTitle.findElements(By.tagName("div"));
		ing1_BOWTitletxt=new String[div.size()];
		for(int i=0;i<div.size();i++) {
			ing1_BOWTitletxt[i]=div.get(i).getText();	
		}
		
	}
		catch(Exception e) {
			System.out.println("error in innings_1BOWTitle");
		}
	}
	
	public static void innings_1playerscrcdBowl() {
		try {
			ing1_playerBowltxt=new ArrayList<String[]>();
			List<WebElement> innings_1playerBowlscrcd=driver.findElements(By.xpath("//div[@id='innings_1']//child::div[@class='cb-col cb-col-100 cb-scrd-itms ']"));
			for(int i=0;i<innings_1playerBowlscrcd.size();i++) {
				List<WebElement> div=innings_1playerBowlscrcd.get(i).findElements(By.tagName("div"));
				String[] playwise=new String[div.size()];
				for(int j=0;j<div.size();j++) {
					//System.out.print(div.get(j).getText()+"\t");
					playwise[j]=div.get(j).getText();
				}
				ing1_playerBowltxt.add(playwise);
			}
			//test
		//System.out.println(ing1_playerBowltxt.get(4)[7]);
	
		} 
		catch(Exception e) {
			System.out.println("error in innings_1playerscrcdBowl()");
		}

	}
	
	public static void ing1_pptitle() {
		
		try {
	
		ing1_pptitle=driver.findElement(By.xpath("//div[@id='innings_1']//div//div[@class='cb-col cb-col-100 cb-scrd-sub-hdr cb-bg-gray text-bold']"));
		List<WebElement> div=ing1_pptitle.findElements(By.tagName("div"));
		ing1_powerplaytitle=new String[div.size()];
		for(int i=0;i<div.size();i++) {
			ing1_powerplaytitle[i]=div.get(i).getText();
		}
		ing1_pptxt=driver.findElement(By.xpath("//div[@id='innings_1']//div//div[@class='cb-col cb-col-100 cb-col-rt cb-font-13']"));
		List<WebElement> div1=ing1_pptxt.findElements(By.tagName("div"));
		ing1_powerplaytxt=new String[div1.size()];
		for(int i=0;i<div1.size();i++) {
			ing1_powerplaytxt[i]=div1.get(i).getText();
		}
		
		
		//System.out.println(ing1_powerplaytitle[2]);
		//System.out.println(ing1_powerplaytxt[1]);
		}

		catch(Exception e) {
			System.out.println("error in ing1_pptitle()");
		}
	}
	
	
	public static void innings_2Header() {
		try {
			innings_2Head=driver.findElement(By.xpath("//div[@id='innings_2']//child::div[@class='cb-col cb-col-100 cb-scrd-hdr-rw']"));
			ing2_present=true;
			List<WebElement> span=innings_2Head.findElements(By.tagName("span"));
			ing2_Htxt=new String[7];
			ing2_Htxt[0]=span.get(0).getText();
			ing2_Htxt[1]="";ing2_Htxt[2]="";ing2_Htxt[3]="";ing2_Htxt[4]="";ing2_Htxt[5]="";
			ing2_Htxt[6]=span.get(1).getText();
		}
		catch(Exception e) {
			ing2_present=false;
			System.out.println("error in innings_2Header()");
			
		}
	}
	
	public static void innings_2Title() {
		try {
		innings_2Title=driver.findElement(By.xpath("//div[@id='innings_2']//parent::div[@class='cb-col cb-col-100 cb-scrd-hdr-rw']//following-sibling::div[@class='cb-col cb-col-100 cb-scrd-sub-hdr cb-bg-gray']"));
		List<WebElement> div=innings_2Title.findElements(By.tagName("div"));
		ing2_Titletxt=new String[div.size()];
		
		for(int i=0;i<div.size();i++) {
			ing2_Titletxt[i]=div.get(i).getText();
		}
			
		}
		catch(Exception e) {
			System.out.println("error in innings_2Title()");
			
		}
	}
	public static void innings_2playerscrcd() {
		try {
			ing2_playertxt=new ArrayList<String[]>();
			List<WebElement> innings_2playerscrcd=driver.findElements(By.xpath("//div[@id='innings_2']//parent::div[@class='cb-col cb-col-100 cb-scrd-hdr-rw']//following-sibling::div[@class='cb-col cb-col-100 cb-scrd-itms']"));
			for(int i=0;i<innings_2playerscrcd.size();i++) {
				List<WebElement> div=innings_2playerscrcd.get(i).findElements(By.tagName("div"));
				String[] playwise=new String[div.size()];
				for(int j=0;j<div.size();j++) {
					//System.out.print(div.get(j).getText()+"\t");
					playwise[j]=div.get(j).getText();
				}
				ing2_playertxt.add(playwise);
			}

		//	System.out.println(ing1_playertxt.get(0)[0]);
	
		}
		catch(Exception e) {
			System.out.println("error in innings_2playerscrcd()");
		}
	}
	public static void innings_2FOW() {
		try {
		 innings_2FOW=driver.findElement(By.xpath("//div[@id='innings_2']//div[@class='cb-col cb-col-100 cb-ltst-wgt-hdr']//preceding-sibling::div[@class='cb-col cb-col-100 cb-scrd-sub-hdr cb-bg-gray text-bold']"));
		 ing_2FoWtxt=innings_2FOW.getText();
		 innings_2FOWplList=driver.findElement(By.xpath("//div[@id='innings_2']//parent::div[@class='cb-col cb-col-100 cb-col-rt cb-font-13']")).getText();
		}
		catch(Exception e) {
			//ing_2FoWtxt="error!";
			System.out.println("error in innings_2FOW()");
		}
	}
	public static void innings_2BOWTitle() {
		try {
		innings_2BOWTitle=driver.findElement(By.xpath("(//div[@id='innings_2']//div[@class='cb-col cb-col-100 cb-scrd-sub-hdr cb-bg-gray'])[2]"));
		List<WebElement> div=innings_2BOWTitle.findElements(By.tagName("div"));
		ing2_BOWTitletxt=new String[div.size()];
		for(int i=0;i<div.size();i++) {
			ing2_BOWTitletxt[i]=div.get(i).getText();
		//	System.out.println(ing2_BOWTitletxt[i]);
		}
		
	}
		catch(Exception e) {
			System.out.println("error in innings_2BOWTitle");
		}
	}
	
	public static void innings_2playerscrcdBowl() {
		try {
			ing2_playerBowltxt=new ArrayList<String[]>();
			List<WebElement> innings_2playerBowlscrcd=driver.findElements(By.xpath("//div[@id='innings_2']//child::div[@class='cb-col cb-col-100 cb-scrd-itms ']"));
			for(int i=0;i<innings_2playerBowlscrcd.size();i++) {
				List<WebElement> div=innings_2playerBowlscrcd.get(i).findElements(By.tagName("div"));
				String[] playwise=new String[div.size()];
				for(int j=0;j<div.size();j++) {
					//System.out.print(div.get(j).getText()+"\t");
					playwise[j]=div.get(j).getText();
				}
				ing2_playerBowltxt.add(playwise);
			}
			//test
		//System.out.println(ing1_playerBowltxt.get(4)[7]);
	
		} 
		catch(Exception e) {
			innings_2playerscrcdBowl();
			System.out.println("error in innings_2playerscrcdBowl()");
		}

	}
	
	public static void ing2_pptitle() {
		
		try {
	
		ing2_pptitle=driver.findElement(By.xpath("//div[@id='innings_2']//div//div[@class='cb-col cb-col-100 cb-scrd-sub-hdr cb-bg-gray text-bold']"));
		List<WebElement> div=ing2_pptitle.findElements(By.tagName("div"));
		ing2_powerplaytitle=new String[div.size()];
		for(int i=0;i<div.size();i++) {
			ing2_powerplaytitle[i]=div.get(i).getText();
		}
		ing2_pptxt=driver.findElement(By.xpath("//div[@id='innings_2']//div//div[@class='cb-col cb-col-100 cb-col-rt cb-font-13']"));
		List<WebElement> div1=ing2_pptxt.findElements(By.tagName("div"));
		ing2_powerplaytxt=new String[div1.size()];
		for(int i=0;i<div1.size();i++) {
			ing2_powerplaytxt[i]=div1.get(i).getText();
		}
		
		
		//System.out.println(ing2_powerplaytitle[2]);
		//System.out.println(ing2_powerplaytxt[1]);
		}

		catch(Exception e) {
			System.out.println("error in ing2_pptitle()");
		}
	}

	
	
	
	
	
	
	
	
	
	
	
	
	

}
