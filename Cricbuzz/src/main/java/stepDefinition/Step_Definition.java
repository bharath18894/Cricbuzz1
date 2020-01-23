package stepDefinition;


import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import aut.Demotest;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class Step_Definition {
	public static WebDriver driver;
	String URL;

	@Given("^Cricbuzz HomePage$")
	public void givenmethod() {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\ChromeDriverMaster\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://cricbuzz.com");
	}
	@When("^Select ongoing match$")
	public void titlehomepage() {
		driver.findElement(By.xpath("//a[@class='cb-hm-mnu-itm' and @title='Live Cricket Score']")).click();
		
	}
	@Then("^Select scorecard module of the match$")
	public void matchpage() {
		driver.findElement(By.xpath("//div[@class='cb-col cb-col-100 cb-lv-main'][3]//child::nav[@class='cb-col-100 cb-col padt5']//a[2]")).click();
		URL=driver.getCurrentUrl();
		//Demotest.test("https://www.cricbuzz.com/live-cricket-scorecard/23092/prs-vs-syt-46th-match-big-bash-league-2019-20");
		
	}
	
	@Then("^get the details$")
	public void getdata() {
		Demotest.test(URL);
		
		
		
	}
	@Then("^Extract Data and store in Excel Sheet$")
	public void excel() {
		Demotest.excel();
	}
	
	@And("^close the browser$")
		public void close() {
			driver.close();
		}
	}

