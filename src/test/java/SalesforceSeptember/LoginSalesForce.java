package SalesforceSeptember;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginSalesForce extends BaseTest{

	public static void main(String[] args) {
		//validlogin_to_Salesforce();
		//loginClearPassword();
		RememberMe();
	}
		public static void validlogin_to_Salesforce() {
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
					
					WebElement TitleEle = driver.findElement(By.xpath("/html/head/title"));
					//waitForVisibility(TitleEle, 5, 2, "Page Title");
					String actualTitle = driver.getTitle();
					String expectedTitle = "Home Page ~ Salesforce - Developer Edition";
					if(actualTitle.equalsIgnoreCase(expectedTitle)) {
					System.out.println("User is on home page");
					}
					else {
						System.out.println("home page is not Lunched");
					}
					closeBrowser();
					System.out.println("******login_to_salesForce automation script ended***********");
				}
	public static void loginClearPassword() {

		System.out.println("******login_to_SalesForce automation script started***********");
	   
		launchBrowser("chrome");
		maximiseBrowser();
		goToUrl("https://login.salesforce.com/");
		WebElement usernameEle = driver.findElement(By.id("username"));
		waitForVisibility(usernameEle, 5, 2, "username textbox");
		enterText(usernameEle,"chirag@home.com","username textbox");
		WebElement passwordEle = driver.findElement(By.id("password"));
		passwordEle.clear();
		System.out.println("password element cliccked");
				WebElement loginButtonEle = driver.findElement(By.id("Login"));
				clickElement(loginButtonEle,"login button");
				
				String errormessage = driver.findElement(By.xpath("//div[@id='error']")).getText();
				if (errormessage.equals("Please enter your password.")){
					System.out.println("TestCase passed: Error message is been be displayed");
				}
				else {
					System.out.println("Testcase failed: Error message is not been be displayed");
				}
				
				closeBrowser();
				System.out.println("******login_to_salesForce automation script ended***********");
			
		
	}
	
	public static void RememberMe() {
		System.out.println("******login_to_SalesForce automation script started***********");
		//String expected="Home Page ~ Salesforce - Developer Edition";
		launchBrowser("chrome");
		maximiseBrowser();
		goToUrl("https://login.salesforce.com/");
		WebElement usernameEle = driver.findElement(By.id("username"));
		waitForVisibility(usernameEle, 5, 2, "username textbox");
		enterText(usernameEle,"chirag@home.com","username textbox");
		WebElement passwordEle = driver.findElement(By.id("password"));
				enterText(passwordEle, "belgaum84", "password Textbox");
				WebElement RememberMeCheckBox= driver.findElement(By.id("rememberUn"));
				selectCheckBox(RememberMeCheckBox, "remember me");
       
				WebElement loginButtonEle = driver.findElement(By.id("Login"));
				clickElement(loginButtonEle,"login button");
				
				
				WebElement usermenudropdown = driver.findElement(By.id("userNavButton"));
				clickElement(usermenudropdown, "dropdown menu");
				waitForVisibility(usermenudropdown, 5, 2, "usermenu dropdown");
				WebElement userLogout = driver.findElement(By.xpath("//*[@id=\"userNav-menuItems\"]/a[5]"));
				clickElement(userLogout, "Log out");

	}
	 public static void Forgotpassword4a(){ 

		 System.out.println("******login_to_SalesForce automation script started***********");
			//String expected="Home Page ~ Salesforce - Developer Edition";
			launchBrowser("chrome");
			maximiseBrowser();
			goToUrl("https://login.salesforce.com/");
			WebElement usernameEle = driver.findElement(By.id("username"));
			waitForVisibility(usernameEle, 5, 2, "username textbox");
			enterText(usernameEle,"chirag@home.com","username textbox");
			WebElement forgotPassword = driver.findElement(By.id("forgot_password_link"));
			clickElement(forgotPassword, "forgot password link");
			WebElement resetPasswordUsername = driver.findElement(By.id("un"));
			enterText(resetPasswordUsername,"chirag@home.com", "UserName box");
			WebElement continueButton = driver.findElement(By.id("continue"));
			clickElement(continueButton, "Continue Button");
			WebElement returnTologin = driver.findElement(By.xpath("//*[@id=\"forgotPassForm\"]/a"));
			clickElement(returnTologin, "return to login");
	
	 }
	
	 public static void Wrongpassword4b(){ 
		 System.out.println("******login_to_SalesForce automation script started***********");
			//String expected="Home Page ~ Salesforce - Developer Edition";
			launchBrowser("chrome");
			maximiseBrowser();
			goToUrl("https://login.salesforce.com/");
			WebElement usernameEle = driver.findElement(By.id("username"));
			waitForVisibility(usernameEle, 5, 2, "username textbox");
			enterText(usernameEle,"123","username textbox");
			WebElement passwordEle = driver.findElement(By.id("password"));
					enterText(passwordEle, "22131 ", "password Textbox");
					WebElement loginButtonEle = driver.findElement(By.id("Login"));
					clickElement(loginButtonEle,"login button");
		}
		
			

		
}

