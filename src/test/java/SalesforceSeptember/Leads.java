package SalesforceSeptember;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v116.browser.Browser;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Leads extends BaseTest{
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
	public static void LeadTab() {
		String expected="Home Page ~ Salesforce - Developer Edition";
		WebElement usernameEle = driver.findElement(By.id("username"));
		     waitForVisibility(usernameEle, 5, 2, "username textbox");
		        enterText(usernameEle,"chirag@home.com","username textbox");
		WebElement passwordEle = driver.findElement(By.id("password"));
				enterText(passwordEle, "belgaum84", "password Textbox");
		WebElement loginButtonEle = driver.findElement(By.id("Login"));
		clickElement(loginButtonEle,"login button");
				WebElement Leads = driver.findElement(By.xpath("//a[@title='Leads Tab']"));
				clickElement(Leads, "Leads");
	}			
				
	@Test
    public static void LeadsDrpdown() {
		String expected="Home Page ~ Salesforce - Developer Edition";
				WebElement usernameEle = driver.findElement(By.id("username"));
		     waitForVisibility(usernameEle, 5, 2, "username textbox");
		        enterText(usernameEle,"chirag@home.com","username textbox");
		WebElement passwordEle = driver.findElement(By.id("password"));
				enterText(passwordEle, "belgaum84", "password Textbox");
		WebElement loginButtonEle = driver.findElement(By.id("Login"));
				clickElement(loginButtonEle,"login button");
				WebElement Leads = driver.findElement(By.xpath("//a[@title='Leads Tab']"));
				clickElement(Leads, "Leads");
				WebElement LeadSelect = driver.findElement(By.xpath("//select[@id='fcf']"));
			    clickElement(LeadSelect, "LeadSelect");
			    Select view = new Select(driver.findElement(By.xpath("//select[@id='fcf']")));
			    List<WebElement> view1 = view.getOptions();
				  System.out.println(view1.size());
				   for (int i = 0; i < view1.size(); i++) {
				        System.out.println(view1.get(i).getText());

				    }
    }
	
	@Test
		public static void DefaultView() throws Exception {
			String expected="Home Page ~ Salesforce - Developer Edition";
			WebElement usernameEle = driver.findElement(By.id("username"));
			     waitForVisibility(usernameEle, 5, 2, "username textbox");
			        enterText(usernameEle,"chirag@home.com","username textbox");
			WebElement passwordEle = driver.findElement(By.id("password"));
					enterText(passwordEle, "belgaum84", "password Textbox");
			WebElement loginButtonEle = driver.findElement(By.id("Login"));
					clickElement(loginButtonEle,"login button");
					WebElement Leads = driver.findElement(By.xpath("//a[@title='Leads Tab']"));
					clickElement(Leads, "Leads");
					 Thread.sleep(2000);
					WebElement LeadSelect = driver.findElement(By.xpath("//select[@id='fcf']"));
				    clickElement(LeadSelect, "LeadSelect");
//				    WebElement myoption = driver.findElement(By.xpath("//select[@id='fcf']"));
//				    SelectfromDropDown(myoption,"Today's Leads");
				    Select view = new Select(driver.findElement(By.xpath("//select[@id='fcf']")));
					view.selectByIndex(3);
				    Thread.sleep(3000);


					WebElement UserMenu = driver.findElement(By.xpath("//span[@id='userNavLabel']"));
					SelectfromDropDown(UserMenu, "UserMenu drop down");
					WebElement logout = driver.findElement(By.xpath("//a[contains(text(),'Logout')]"));
					clickElement(logout, "logout");
					
					Thread.sleep(2000);
					WebElement usernameEle1 = driver.findElement(By.id("username"));
				     waitForVisibility(usernameEle1, 5, 2, "username textbox");
				        enterText(usernameEle1,"chirag@home.com","username textbox");
				WebElement passwordEle1 = driver.findElement(By.id("password"));
						enterText(passwordEle1, "belgaum84", "password Textbox");
						WebElement loginButtonEle1 = driver.findElement(By.id("Login"));
						clickElement(loginButtonEle1,"login button");
						WebElement Leads1 = driver.findElement(By.xpath("//a[@title='Leads Tab']"));
						clickElement(Leads1 , "Leads");
			
		}
	@Test
		public static void TodaysLead() throws Exception {
			String expected="Home Page ~ Salesforce - Developer Edition";
			WebElement usernameEle = driver.findElement(By.id("username"));
			     waitForVisibility(usernameEle, 5, 2, "username textbox");
			        enterText(usernameEle,"chirag@home.com","username textbox");
			WebElement passwordEle = driver.findElement(By.id("password"));
					enterText(passwordEle, "belgaum84", "password Textbox");
			WebElement loginButtonEle = driver.findElement(By.id("Login"));
					clickElement(loginButtonEle,"login button");
					WebElement Leads = driver.findElement(By.xpath("//a[@title='Leads Tab']"));
					clickElement(Leads, "Leads");
					 Thread.sleep(2000);
					
						WebElement LeadSelect = driver.findElement(By.xpath("//select[@id='fcf']"));
						clickElement(LeadSelect, "LeadSelect");
						Select view = new Select(driver.findElement(By.xpath("//select[@id='fcf']")));
						view.selectByIndex(3);
						WebElement gobutton = driver.findElement(By.xpath("//span[@class='fBody']//input[@name='go']"));
				        gobutton.click();
			
			
			
		}
		@Test
		public static void CreateNewLead() throws Exception {
			String expected="Home Page ~ Salesforce - Developer Edition";
			WebElement usernameEle = driver.findElement(By.id("username"));
			     waitForVisibility(usernameEle, 5, 2, "username textbox");
			        enterText(usernameEle,"chirag@home.com","username textbox");
			WebElement passwordEle = driver.findElement(By.id("password"));
					enterText(passwordEle, "belgaum84", "password Textbox");
			WebElement loginButtonEle = driver.findElement(By.id("Login"));
					clickElement(loginButtonEle,"login button");
					WebElement Leads = driver.findElement(By.xpath("//a[@title='Leads Tab']"));
					clickElement(Leads, "Leads");
					 Thread.sleep(2000);
					 WebElement newBtn = driver.findElement(By.xpath("//tbody/tr[1]/td[2]/input[1]"));
					 clickElement(newBtn, "new"); clickElement(newBtn, "new ");
					 Thread.sleep(5000);
					// WebElement FirstName = driver.findElement(By.id("name_firstlea2"));
						// waitForVisibility(FirstName, 5, 2, "lastName textbox");
						 //enterText(FirstName, "AAAA", "first Name Textbox");
					 WebElement lastName = driver.findElement(By.cssSelector("#name_lastlea2"));
					// waitForVisibility(lastName, 5, 2, "lastName textbox");
					 enterText(lastName, "ABCD", "Last Name Textbox");
					 Thread.sleep(5000);
					 WebElement companyName = driver.findElement(By.id("lea3"));
					 //waitForVisibility(companyName, 5, 2, "company textbox");
					 enterText(companyName, "ABCD", "company Name Textbox");
					 
					 Thread.sleep(5000);
					 WebElement SaveBtn = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/form[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/input[1]"));
					 clickElement(SaveBtn, "save"); 			
			
			
			
		}
}

