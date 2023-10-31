package SalesforceSeptember;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Contacts extends BaseTest {

	public static void main(String[] args) throws Exception {
		//createnewContact();
		//createNewview();  //did not clear
		//recentlyCreated();
		//myContacts();
		//viewContactName();
		//ViewnameErrorMessage();
		//checkingCancelButton();
		newContactPage();
	}
	public static void createnewContact() {
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
			
			WebElement contact = driver.findElement(By.xpath("//a[@title='Contacts Tab']"));
			clickElement(contact, "contact");
			
			WebElement new_button = driver.findElement(By.xpath("//input[contains(@title,'New')]"));
			clickElement(new_button, "new_Element");
			WebElement first_name = driver.findElement(By.xpath("//input[@id='name_firstcon2']"));	
			enterText(first_name, "Neha", "FirstName");
			WebElement last_name = driver.findElement(By.xpath("//input[@id='name_lastcon2']"));	
			enterText(last_name, "Chivate", "LastName");
			WebElement account_name = driver.findElement(By.xpath("//input[@id='con4']"));	
			enterText(account_name, "Neha", "Accountname");
			
		    WebElement save = driver.findElement(By.xpath(" //td[@id='bottomButtonRow']//input[@title='Save']"));
		    clickElement(save, "SaveButton");
				 
			driver.close();

}
	public static void createNewview() throws Exception {
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
				
				WebElement contact = driver.findElement(By.xpath("//a[@title='Contacts Tab']"));
				clickElement(contact, "contact");
				
				WebElement Contactnewview = driver.findElement(By.xpath("//a[contains(text(),'Create New View')]"));
				clickElement(Contactnewview, "Contactnewview");
				
				WebElement ViewNames = driver.findElement(By.xpath("//input[@id='fname']"));
				enterText(ViewNames, "JOSH" , "ViewName");
				Thread.sleep(5000);
				WebElement ViewUniqueName = driver.findElement(By.xpath("//input[@id='devname']"));
				 //waitForVisibility(ViewUniqueName, 5, 2, " view unique textbox");
				//Thread.sleep(5000);
				
				 Thread.sleep(5000);
				enterText(ViewUniqueName, "EFGH" , "ViewUniqueName");
				
				WebElement save = driver.findElement(By.xpath("//div[@class='pbBottomButtons']//input[@title='Save']"));
				clickElement(save, "SaveButton");
				// driver.close();
				 
				 
		
	}
	
	public static void recentlyCreated() {
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
				
				WebElement contact = driver.findElement(By.xpath("//a[@title='Contacts Tab']"));
				clickElement(contact, "contact");
				WebElement RecentlyCreatedoption = driver.findElement(By.xpath("//select[@id='hotlist_mode']"));
				SelectfromDropDown(RecentlyCreatedoption, "Recently Created");	
	}
	
	public static void myContacts() {
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
				
				WebElement contact = driver.findElement(By.xpath("//a[@title='Contacts Tab']"));
				clickElement(contact, "contact");
				
				WebElement Mycontactview = driver.findElement(By.xpath("//select[@id='fcf']"));
				SelectfromDropDown(Mycontactview, "My Contacts");
				WebElement GoButton = driver.findElement(By.xpath("//input[@title='Go!']"));
				GoButton.click(); 
	}
	
	
	public static void viewContactName() {
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
				
				WebElement contact = driver.findElement(By.xpath("//a[@title='Contacts Tab']"));
				clickElement(contact, "contact");
				WebElement ContactNameclick = driver.findElement(By.xpath("//a[contains(text(),'Chivate, Neha')]"));
				clickElement(ContactNameclick, "Contact Name link");
		
	}
	
	public static void ViewnameErrorMessage() {
		
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
				
				WebElement contact = driver.findElement(By.xpath("//a[@title='Contacts Tab']"));
				clickElement(contact, "contact");
				WebElement Createnewview = driver.findElement(By.xpath("//a[contains(text(),'Create New View')]"));
				clickElement(Createnewview, "Createnewview");
				WebElement Uniquename = driver.findElement(By.xpath("//input[@id='devname']"));
				enterText(Uniquename, "EFGH" , "UniqueName");
				WebElement Save = driver.findElement(By.name("save"));
				Save.click();
				String actualmsg = driver.findElement(By.xpath("//div[contains(text(),'You must enter a value')]")).getText();
				String errormsg = "Error: You must enter a value";
				validateErrormsg(actualmsg, errormsg);
		
	}
	
	public static void checkingCancelButton() {
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
				
				WebElement contact = driver.findElement(By.xpath("//a[@title='Contacts Tab']"));
				clickElement(contact, "contact");
				WebElement Createnewview = driver.findElement(By.xpath("//a[contains(text(),'Create New View')]"));
				clickElement(Createnewview, "Createnewview");
				
				WebElement name = driver.findElement(By.name("fname"));
				enterText(name, "ABCD" , "Name");
				WebElement Uniquename = driver.findElement(By.xpath("//input[@id='devname']"));
				enterText(Uniquename, "EFGH" , "UniqueName");
				waitForVisibility(Uniquename, 5, 2, "Uniquename textbox");
				WebElement cancel = driver.findElement(By.xpath("//div[@class='pbBottomButtons']//input[@title='Cancel']"));
				clickElement(cancel, "cancel");
	}
	
	public static void newContactPage() {
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
				
				WebElement contact = driver.findElement(By.xpath("//a[@title='Contacts Tab']"));
				clickElement(contact, "contact");
				
				WebElement New = driver.findElement(By.xpath("//input[@title='New']"));
				clickElement(New, "New");
				
				WebElement LastName = driver.findElement(By.xpath("//input[@id='name_lastcon2']"));
				enterText(LastName, "Indian1" , "LastName");
				
				WebElement AccountName = driver.findElement(By.xpath("//input[@id='con4']"));
				enterText(AccountName, "Global Media1" , "AccountName");
				
				WebElement SaveandNew = driver.findElement(By.xpath("//td[@id='bottomButtonRow']//input[@title='Save & New']"));
				SaveandNew.click();
				
				
				
	}
}
