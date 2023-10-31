package SalesforceSeptember;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v116.browser.Browser;

public class RandomScenarios extends BaseTest{

	public static void main(String[] args) throws Exception {
		//Verifylink();
	//	UpdateLastname();
		//customizeMyTabs();
		//BlockCalenderEvent();
		WeeklyRecurrencecheck();// 7:00pm doesnot select.
		
	}
	
	public static void Verifylink() throws Exception {
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
		WebElement Home = driver.findElement(By.xpath("//a[contains(text(),'Home')]"));
		clickElement(Home, "Home");
		Thread.sleep(3000);
		WebElement NameLink = driver.findElement(By.linkText("Neha Chivate"));
		clickElement(NameLink, "NameLink");
		Browser.close();
	}
	
	public static void UpdateLastname() throws InterruptedException {
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
		WebElement Home = driver.findElement(By.xpath("//a[contains(text(),'Home')]"));
		clickElement(Home, "Home");
		WebElement NameLink = driver.findElement(By.linkText("Neha Chivate"));
		clickElement(NameLink, "NameLink");
		Thread.sleep(5000);
		 WebElement Edit = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/div[2]/div[2]/div[1]/h3[1]/div[1]/div[1]/a[1]/img[1]"));
		 clickElement(Edit, "Edit");
		 Thread.sleep(5000);
		 WebElement frame = driver.findElement(By.xpath("//iframe[@id='contactInfoContentId']"));
		 switchFrame(frame, "fraame");
		 WebElement AboutTab = driver.findElement(By.xpath("//a[contains(text(),'About')]"));
		 clickElement(AboutTab, "About tab");
		 Thread.sleep(5000);
		 WebElement lastname = driver.findElement(By.xpath("//input[@id='lastName']"));
		 enterText(lastname, "ABCD", "lastname Textbox");
		 WebElement SaveAllBtn = driver.findElement(By.xpath("//body/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/input[1]"));
		 clickElement(SaveAllBtn, "Save All");
	}
	
	public static void customizeMyTabs() throws Exception {
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
		 WebElement AllTabs = driver.findElement(By.id("AllTab_Tab"));
		 clickElement(AllTabs, "AllTabs");
		   
		   WebElement Customizetab = driver.findElement(By.xpath("//input[contains(@title,'Customize My Tabs')]"));
		   clickElement(Customizetab, "Customizetab");
		   
		   WebElement Chatter = driver.findElement(By.xpath("//option[@value='Chatter']"));
		   clickElement(Chatter, "Chatter");
		   
		   WebElement leftarrow = driver.findElement(By.xpath("//tbody/tr[1]/td[2]/div[3]/a[1]/img[1]"));
		   clickElement(leftarrow, "leftarrow");
		   
		   WebElement save = driver.findElement(By.xpath("//input[@title='Save']"));
		   clickElement(save, "save");
		   Thread.sleep(5000);
		   
		   WebElement userNameDropDown = driver.findElement(By.id("userNavLabel"));
			clickElement(userNameDropDown, "NehaABCD");
			WebElement Logout = driver.findElement(By.xpath("//*[@id=\"userNav-menuItems\"]/a[5]"));
			clickElement(Logout, "log out");
			Thread.sleep(5000);
		  
		  
		   
		  
		   WebElement Uname1=driver.findElement(By.id("username"));
			enterText(Uname1, "chirag@home.com", "UserName");
			WebElement pwd1=driver.findElement(By.id("password"));
			enterText(pwd1, "belgaum84", "Password");
		    WebElement login1 = driver.findElement(By.id("Login"));
		    clickElement(login1, "login");
		   
		
	}
	
	public static void BlockCalenderEvent() throws Exception {
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
		WebElement Home = driver.findElement(By.xpath("//a[contains(text(),'Home')]"));
		clickElement(Home, "Home");
		
		WebElement datelink = driver.findElement(By.cssSelector("body.hasMotif.homeTab.homepage.ext-webkit.ext-chrome.sfdcBody.brandQuaternaryBgr:nth-child(2) div.bodyDiv.brdPalette.brandPrimaryBrd:nth-child(2) table.outer td.oRight div.bPageTitle:nth-child(2) div.ptBody.secondaryPalette div.greeting:nth-child(2) div.content span.pageDescription > a:nth-child(1)"));
		clickElement(datelink, "datelink");
		Thread.sleep(5000);


		WebElement endtime=driver.findElement(By.xpath("//input[@id='EndDateTime_time']"));
		clickElement(endtime,"endtime");
	//	driver.findElement(By.xpath("//input[@id='EndDateTime_time']")).click();
		WebElement SaveBtn = driver.findElement(By.xpath("//body[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/form[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/input[1]"));
		clickElement(SaveBtn, "Save button");
		Thread.sleep(8000);
		
		Browser.close();
	}
	
	public static void WeeklyRecurrencecheck() throws InterruptedException {
		
		
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
		WebElement Home = driver.findElement(By.xpath("//a[contains(text(),'Home')]"));
		clickElement(Home, "Home");
		
		WebElement datelink = driver.findElement(By.cssSelector("body.hasMotif.homeTab.homepage.ext-webkit.ext-chrome.sfdcBody.brandQuaternaryBgr:nth-child(2) div.bodyDiv.brdPalette.brandPrimaryBrd:nth-child(2) table.outer td.oRight div.bPageTitle:nth-child(2) div.ptBody.secondaryPalette div.greeting:nth-child(2) div.content span.pageDescription > a:nth-child(1)"));
		clickElement(datelink, "datelink");
		Thread.sleep(5000);
		WebElement TimeLink = driver.findElement(By.xpath("//a[contains(text(),'7:00 PM')]"));
		clickElement(TimeLink, "7pm link");
		
		WebElement subjectCombo = driver.findElement(By.xpath("//tbody/tr[2]/td[2]/div[1]/a[1]/img[1]"));
		clickElement(subjectCombo, "lookUpWindow");

		driver.findElement(By.xpath("//img[@title='Subject Combo (New Window)']")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		String currentHandle = driver.getWindowHandle();
		windowHandles.remove(currentHandle);
		String newHandle = windowHandles.iterator().next();
		driver.switchTo().window(newHandle);
		driver.findElement(By.xpath("//a[@href='javascript:pickValue(4);']")).click();
		driver.switchTo().window(currentHandle);
		Thread.sleep(5000);
		WebElement endtime=driver.findElement(By.xpath("//input[@id='EndDateTime_time']"));
		clickElement(endtime,"7:00pm");
		
		
		WebElement recurrence=driver.findElement(By.id("IsRecurrence"));
		clickElement(recurrence,"recurrence");
		WebElement freq=driver.findElement(By.id("rectypeftw"));
		clickElement(freq, "reccurencetype");
		Thread.sleep(5000);
		WebElement endDate=driver.findElement(By.xpath("//input[@id='RecurrenceEndDateOnly']"));
		enterText(endDate,"11/12/2023","End Date textbox");
		WebElement save=driver.findElement(By.xpath("//td[@id='topButtonRow']//input[@title='Save']"));
		clickElement(save,"save");
		
		
	}

	
	
	
	
	

}
