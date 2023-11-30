package SalesforceSeptember;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v116.browser.Browser;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CreateOPTY extends BaseTest {
	@BeforeMethod()
	public static void launchBrowser() {
		System.out.println("******login_to_SalesForce automation script started***********");
	    launchBrowser("chrome");
		maximiseBrowser();
		goToUrl("https://login.salesforce.com/");
		
	}
	
	@AfterMethod()
	public static void tearDown() {
		closeBrowser();
		System.out.println("******login_to_salesForce automation script ended***********");
	
	}
	
	@Test
	public static void ClickOpportunities() throws InterruptedException {
	WebElement usernameEle = driver.findElement(By.id("username"));
	     waitForVisibility(usernameEle, 5, 2, "username textbox");
	        enterText(usernameEle,"chirag@home.com","username textbox");
	WebElement passwordEle = driver.findElement(By.id("password"));
			enterText(passwordEle, "belgaum84", "password Textbox");
	WebElement loginButtonEle = driver.findElement(By.id("Login"));
			clickElement(loginButtonEle,"login button");
			String actualTitle = driver.getTitle();
		
			WebElement Opportunities = driver.findElement(By.xpath("//li[@id='Opportunity_Tab']"));
			clickElement(Opportunities, "Opportunities");
			Thread.sleep(5000);
			WebElement Opportunitiesdrpdwn = driver.findElement(By.xpath("//select[@id='fcf']"));
			clickElement(Opportunitiesdrpdwn, "Opportunities dropdown menu");
			String list = Opportunitiesdrpdwn.getText();
			System.out.println(list);
			Thread.sleep(5000);
}
	@Test
	public static void createNewOpty() throws InterruptedException {
	
		WebElement usernameEle = driver.findElement(By.id("username"));
		     waitForVisibility(usernameEle, 5, 2, "username textbox");
		        enterText(usernameEle,"chirag@home.com","username textbox");
		WebElement passwordEle = driver.findElement(By.id("password"));
				enterText(passwordEle, "belgaum84", "password Textbox");
		WebElement loginButtonEle = driver.findElement(By.id("Login"));
				clickElement(loginButtonEle,"login button");
				String actualTitle = driver.getTitle();
			
				WebElement Opportunities = driver.findElement(By.xpath("//li[@id='Opportunity_Tab']"));
				clickElement(Opportunities, "Opportunities");

             WebElement newBtn = driver.findElement(By.xpath("//tbody/tr[1]/td[2]/input[1]"));
             clickElement(newBtn, "New Button");
             WebElement OppName = driver.findElement(By.xpath("//input[@id='opp3']"));
             enterText(OppName, "neha", "opportunity name Textbox");
             WebElement LookupWindow = driver.findElement(By.xpath("//img[@title='Account Name Lookup (New Window)']"));
             clickElement(LookupWindow, "Look up ");
     		String oldWindow = driver.getWindowHandle();
     		
     		Set<String> getAllWindows = driver.getWindowHandles();
     		String[] getWindow = getAllWindows.toArray(new String[getAllWindows.size()]);
     		driver.switchTo().window(getWindow[1]);
     		Thread.sleep(3000);
    		
    		driver.switchTo().frame("searchFrame");
    		driver.findElement(By.id("lksrch")).sendKeys("abcd");
    		driver.findElement(By.xpath("//input[@name='go']")).click();
    		
           SwitchTodefaultFrame(driver);
           driver.switchTo().frame("resultsFrame");
    		Thread.sleep(5000);
    		driver.findElement(By.xpath("//tr[@class='dataRow even last first']/th/a")).click();
    		
    		driver.switchTo().window(getWindow[0]);
    		
		
    		Thread.sleep(8000);
    		
    	
    		driver.findElement(By.xpath("//input[@id='opp9']")).click();
    	WebElement today=driver.findElement(By.xpath("//a[@class='calToday']"));
    		today.click();
    		Actions action = new Actions(driver);
    		action.sendKeys(Keys.ESCAPE).build().perform();
    		WebElement Stage = driver.findElement(By.xpath("//select[@id='opp11']"));
    		Stage.click();
    		
    		Select dropdown = new Select(Stage);
    		dropdown.selectByValue("Qualification");
    		Thread.sleep(4000);
    		driver.findElement(By.xpath("//input[@id='opp12']")).sendKeys("80");
    		Thread.sleep(6000);
    	
     		}
	
	@Test
	public static void OpportunityPipelineReport() throws Exception {
		System.out.println("******login_to_SalesForce automation script started***********");
		String expected="Home Page ~ Salesforce - Developer Edition";
		launchBrowser("chrome");
		maximiseBrowser();
		goToUrl("https://login.salesforce.com/");
		WebElement usernameEle = driver.findElement(By.id("username"));
		     waitForVisibility(usernameEle, 5, 2, "username textbox");
		        enterText(usernameEle,"chirag@home.com","username textbox");
		WebElement passwordEle = driver.findElement(By.id("password"));
				enterText(passwordEle, "belgaum84", "password Textbox");
		WebElement loginButtonEle = driver.findElement(By.id("Login"));
				clickElement(loginButtonEle,"login button");
				String actualTitle = driver.getTitle();
		
			WebElement Opportunities = driver.findElement(By.xpath("//li[@id='Opportunity_Tab']"));
			clickElement(Opportunities, "Opportunities");
			Thread.sleep(3000);
			WebElement OpportunityPipeline = driver.findElement(By.xpath("//a[contains(text(),'Opportunity Pipeline')]"));
			clickElement(OpportunityPipeline, "Opportunity Pipeline");
			Thread.sleep(10000);
			System.out.println(" completed");
			
			}
	
	@Test
	public static void OpportunityPipelineStuckReport() throws Exception {
		String expected="Home Page ~ Salesforce - Developer Edition";
		WebElement usernameEle = driver.findElement(By.id("username"));
		     waitForVisibility(usernameEle, 5, 2, "username textbox");
		        enterText(usernameEle,"chirag@home.com","username textbox");
		WebElement passwordEle = driver.findElement(By.id("password"));
				enterText(passwordEle, "belgaum84", "password Textbox");
		WebElement loginButtonEle = driver.findElement(By.id("Login"));
				clickElement(loginButtonEle,"login button");
				String actualTitle = driver.getTitle();
		
			WebElement Opportunities = driver.findElement(By.xpath("//li[@id='Opportunity_Tab']"));
			clickElement(Opportunities, "Opportunities");
			Thread.sleep(3000);
			WebElement StuckOpp = driver.findElement(By.xpath("//a[contains(text(),'Stuck Opportunities')]"));
			clickElement(StuckOpp, "StuckOpp");
			Thread.sleep(10000);
			System.out.println(" completed");
	}
	
	@Test
	public static void QuarterlySummary() throws Exception {
		String expected="Home Page ~ Salesforce - Developer Edition";
		WebElement usernameEle = driver.findElement(By.id("username"));
		     waitForVisibility(usernameEle, 5, 2, "username textbox");
		        enterText(usernameEle,"chirag@home.com","username textbox");
		WebElement passwordEle = driver.findElement(By.id("password"));
				enterText(passwordEle, "belgaum84", "password Textbox");
		WebElement loginButtonEle = driver.findElement(By.id("Login"));
				clickElement(loginButtonEle,"login button");
				String actualTitle = driver.getTitle();
		
			WebElement Opportunities = driver.findElement(By.xpath("//li[@id='Opportunity_Tab']"));
			clickElement(Opportunities, "Opportunities");
			Thread.sleep(3000);
			WebElement dropdown1 = driver.findElement(By.xpath("//select[@id='quarter_q']"));
			SelectfromDropDown(dropdown1,"Next FQ");
			
			WebElement include = driver.findElement(By.xpath("//select[@id='open']"));
			clickElement(include, "include");
			
			WebElement dropdown2 = driver.findElement(By.xpath("//select[@id='open']"));
			SelectfromDropDown(include, "Open Opportunities");
			
			WebElement RunReport = driver.findElement(By.xpath("//input[@title='Run Report']"));
			clickElement(RunReport, "RunReport");
			System.out.println("completed");
		}
			
	}
