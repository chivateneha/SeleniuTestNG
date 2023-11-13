package SalesforceSeptember;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v115.browser.Browser;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CreateAccounts extends BaseTest {

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
	 public static void CreateNewAcc() {
		WebElement usernameEle = driver.findElement(By.id("username"));
		     waitForVisibility(usernameEle, 5, 2, "username textbox");
		        enterText(usernameEle,"chirag@home.com","username textbox");
		WebElement passwordEle = driver.findElement(By.id("password"));
				enterText(passwordEle, "belgaum84", "password Textbox");
		WebElement loginButtonEle = driver.findElement(By.id("Login"));
				clickElement(loginButtonEle,"login button");
			WebElement userName = driver.findElement(By.id("userNavLabel"));
	Assert.assertEquals(userName.getText(), "Neha Chivate");

	//a[text()='Accounts']
	WebElement AccountsTab =driver.findElement(By.xpath("//a[text()='Accounts']"));
	clickElement(AccountsTab,"Accounts Tab");
	System.out.println("Clicked on Accounts Tab");
	WebElement New = driver.findElement(By.xpath("//input[@name='new']"));
	clickElement(New,"New Button");
	System.out.println("Clicked on New tab");
	
	WebElement AccountNameEle = driver.findElement(By.id("acc2"));
	enterText(AccountNameEle,"Josh","Account Name");
	WebElement typeEle = driver.findElement(By.id("acc6"));
	clickElement(typeEle,"Type dropdown");
	SelectfromDropDown(typeEle, "Technology Partner");
	
	WebElement custPriority = driver.findElement(By.id("00NDm000005yNVK"));
	clickElement(custPriority,"Priority");
	SelectfromDropDown(custPriority, "High");
	
	WebElement SaveBtn = driver.findElement(By.xpath("//*[@id=\"topButtonRow\"]/input[1]"));
	clickElement(SaveBtn,"Save");
	System.out.println("Clicked on Save button");
	}

	 @Test
	 public static void CreateNewViewLink() {			WebElement usernameEle = driver.findElement(By.id("username"));
			     waitForVisibility(usernameEle, 5, 2, "username textbox");
			        enterText(usernameEle,"chirag@home.com","username textbox");
			WebElement passwordEle = driver.findElement(By.id("password"));
					enterText(passwordEle, "belgaum84", "password Textbox");
			WebElement loginButtonEle = driver.findElement(By.id("Login"));
					clickElement(loginButtonEle,"login button");
					
					WebElement AccountsTab =driver.findElement(By.xpath("//a[text()='Accounts']"));
					clickElement(AccountsTab,"Accounts Tab");
					System.out.println("Clicked on Accounts Tab");
					
					WebElement CreateNewView = driver.findElement(By.xpath("//*[@id=\"filter_element\"]/div/span/span[2]/a[2]"));
					clickElement(CreateNewView,"Create New View link");
					
					WebElement ViewName = driver.findElement(By.id("fname"));
					enterText(ViewName, "Anna", "View Name TextBox");
					 waitForVisibility(ViewName, 5, 2, "View name textbox");
					WebElement ViewUniqueName = driver.findElement(By.id("fname"));
					enterText(ViewUniqueName, " John", "View Unique Name TextBox");
					
					WebElement Savebtn = driver.findElement(By.xpath("//*[@id=\"editPage\"]/div[1]/table/tbody/tr/td[2]/input[2]"));
					clickElement(Savebtn,"Save Button");
					System.out.println("Clicked on save button");
	 }
	 
	 
	 @Test
	 public static void EditView() {
		
			WebElement usernameEle = driver.findElement(By.id("username"));
			     waitForVisibility(usernameEle, 5, 2, "username textbox");
			        enterText(usernameEle,"chirag@home.com","username textbox");
			WebElement passwordEle = driver.findElement(By.id("password"));
					enterText(passwordEle, "belgaum84", "password Textbox");
			WebElement loginButtonEle = driver.findElement(By.id("Login"));
					clickElement(loginButtonEle,"login button");
					

					WebElement AccountsTab =driver.findElement(By.xpath("//a[contains(text(),'Accounts')]"));
					clickElement(AccountsTab,"Accounts Tab");
					System.out.println("Clicked on Accounts Tab");
					WebElement View = driver.findElement(By.xpath("//select[@id='fcf']"));
					clickElement(View, "View");
					SelectfromDropDown(View, 2);
					WebElement EditLink = driver.findElement(By.linkText("Edit"));
					clickElement(EditLink, "EditLink");
					WebElement nameEle =driver.findElement(By.id("fname"));
					nameEle.clear();
					enterText(nameEle, "Mona", "ViewName");
					System.out.println("Viewname entered in the field");
					 waitForVisibility(nameEle, 5, 2, "name textbox");
					WebElement AvailField = driver.findElement(By.xpath("//select[@id='fcol1']"));
					clickElement(AvailField, "firstcolumn");
					
					WebElement fields = driver.findElement(By.xpath("//select[@id='fcol1']"));
					SelectfromDropDown(fields, "Account Name");	
					 waitForVisibility(fields, 5, 2, "fields dropdown");
					WebElement AddfieldsOperator = driver.findElement(By.xpath("//select[@id='fop1']"));
					SelectfromDropDown(AddfieldsOperator, "contains");
					 
					WebElement valuecol = driver.findElement(By.xpath("//input[@id='fval1']"));
					valuecol.clear();
					valuecol.sendKeys("<a>");
					
					WebElement Savebtn = driver.findElement(By.xpath("//body[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/div[2]/form[1]/div[3]/table[1]/tbody[1]/tr[1]/td[2]/input[1]"));
					clickElement(Savebtn, "save button");
				
	 }
	 
	 @Test
	 
	 public static void mergeAccounts() throws InterruptedException {
			WebElement usernameEle = driver.findElement(By.id("username"));
			     waitForVisibility(usernameEle, 5, 2, "username textbox");
			        enterText(usernameEle,"chirag@home.com","username textbox");
			WebElement passwordEle = driver.findElement(By.id("password"));
					enterText(passwordEle, "belgaum84", "password Textbox");
			WebElement loginButtonEle = driver.findElement(By.id("Login"));
					clickElement(loginButtonEle,"login button");
				
					WebElement AccountsTab =driver.findElement(By.xpath("//a[contains(text(),'Accounts')]"));
					clickElement(AccountsTab,"Accounts Tab");
					System.out.println("Clicked on Accounts Tab");
					WebElement Mergeacc = driver.findElement(By.xpath("//a[contains(text(),'Merge Accounts')]"));
					clickElement(Mergeacc, "Mergeaccount");
					WebElement SearchBox = driver.findElement(By.id("srch"));
					SearchBox.clear();
					enterText(SearchBox, "Josh", "FindAccounts");
					WebElement FindAcc = driver.findElement(By.name("srchbutton"));
					clickElement(FindAcc, "FindAcc");
					
					
				    WebElement checkbox1 = driver.findElement(By.xpath("//input[@id='cid0']"));
				    clickElement(checkbox1, "check box1 selected");
				    
				    WebElement checkbox2 = driver.findElement(By.xpath("//input[@id='cid1']"));
				    clickElement(checkbox2, "check box2 selected");
				 
				    WebElement Next = driver.findElement(By.xpath(" //tbody/tr[1]/td[2]/form[1]/div[1]/div[2]/div[5]/div[1]/input[1]"));
				    clickElement(Next, "Next Button");
				  //  waitForVisibility(Next, 5, 2, "Next button");
				    WebElement Merge = driver.findElement(By.xpath("//tbody/tr[1]/td[2]/form[1]/div[1]/div[2]/div[1]/div[1]/input[2]"));
				    clickElement(Merge, "Merge Button");
				    Thread.sleep(3000);
				    switchtoAlert(driver);
	 }
	 
	 @Test
	 public static void CreateAccountReport() throws InterruptedException {
			WebElement usernameEle = driver.findElement(By.id("username"));
			     waitForVisibility(usernameEle, 5, 2, "username textbox");
			        enterText(usernameEle,"chirag@home.com","username textbox");
			WebElement passwordEle = driver.findElement(By.id("password"));
					enterText(passwordEle, "belgaum84", "password Textbox");
			WebElement loginButtonEle = driver.findElement(By.id("Login"));
					clickElement(loginButtonEle,"login button");
					

        	WebElement AccountsTab =driver.findElement(By.xpath("//a[contains(text(),'Accounts')]"));
	         clickElement(AccountsTab,"Accounts Tab");
					System.out.println("Clicked on Accounts Tab");
					
					WebElement LastActivity = driver.findElement(By.xpath("//a[contains(text(),'Accounts with last activity > 30 days')]"));
					clickElement(LastActivity, "LastActivity");
					
					WebElement  drpdwnDateField = driver.findElement(By.xpath("//img[@id='ext-gen148']"));
					clickElement(drpdwnDateField, "dropdown");
					
					WebElement createddate = driver.findElement(By.xpath("//div[contains(text(),'Created Date')]"));
					clickElement(createddate, "createddate");
					WebElement startdate =  driver.findElement(By.name("startDate"));
					startdate.clear();
					enterText(startdate, "10/24/2023","calenderdata");
					WebElement enddate = driver.findElement(By.name("endDate"));
					enddate.clear();
					enterText(enddate, "10/24/2023", "calenderdata");
					WebElement save = driver.findElement(By.xpath("//button[@id='ext-gen49']"));
					save.click();
					
					WebElement Reportnames =  driver.findElement(By.name("reportName"));
					Reportnames.clear();
					enterText(Reportnames, "Neha", "ChangeReportName");
					WebElement ReportUniName =  driver.findElement(By.id("saveReportDlg_DeveloperName"));
					ReportUniName.clear();
					enterText(ReportUniName, "Neha", "ChangeReportUniqueName");
					Thread.sleep(4000);
				    WebElement Saveandrun = driver.findElement(By.xpath("//table[@id='dlgSaveAndRun']"));
				    clickElement(Saveandrun, "Saveandrun");
				    
					
					
					
					
					
					
					
					
					
	 }
}
