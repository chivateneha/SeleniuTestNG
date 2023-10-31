package SalesforceSeptember;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class UserMenuSalesforce extends BaseTest {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//usermenudropdownVerfy();
		//ChangeLastNameOnMyProfile();
		//PostFile();
		//AddPhoto();
		//MySettings();
		//EmailLink();
		PostLink();
		//DeveloperConsol();
		//logoutSfdc();
		
	}
	public static void usermenudropdownVerfy() {
		
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
				WebElement userNameDropDown = driver.findElement(By.id("userNavLabel"));
				clickElement(userNameDropDown, "NehaABCD"); 
				 waitForVisibility(userNameDropDown, 5, "usermenu dropdown");
				 String dropdownverify=driver.findElement(By.xpath("//div[@id='userNav-menuItems']")).getText();
					System.out.println(dropdownverify);
					closeBrowser();
				}
	
	public static void ChangeLastNameOnMyProfile(){

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
				WebElement userNameDropDown = driver.findElement(By.id("userNavLabel"));
				clickElement(userNameDropDown, "NehaABCD"); 
				 waitForVisibility(userNameDropDown, 5, "usermenu dropdown");
				 String dropdownverify=driver.findElement(By.xpath("//div[@id='userNav-menuItems']")).getText();
				System.out.println(dropdownverify);
				WebElement MyProfileEle = driver.findElement(By.xpath("//a[text()='My Profile']"));
				clickElement(MyProfileEle, "My Profile"); 
					
				WebElement EditProfile = driver.findElement(By.xpath("//a[contains(@class,'contactInfoLaunch editLink')]"));
				waitForVisibility(EditProfile, 5, "Edit button");
					clickElement(EditProfile, " Edit Button"); 
			WebElement profileIframe = driver.findElement(By.id("contactInfoContentId"));
			switchFrame(profileIframe, "AboutTab");
				driver.findElement(By.id("aboutTab")).click();
					
				WebElement lastnameEle = driver.findElement(By.id("lastName"));
				lastnameEle.clear();
                 enterText(lastnameEle, "Chivate", "lastname");
				 WebElement SaveAllButton = driver.findElement(By.xpath("//input[@value='Save All']"));
				  clickElement(SaveAllButton, " Save all Button"); 
				  
	}
	
	public static void PostLink() throws Exception { 
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
				WebElement userNameDropDown = driver.findElement(By.id("userNavLabel"));
				clickElement(userNameDropDown, "NehaABCD"); 
				 waitForVisibility(userNameDropDown, 5, "usermenu dropdown");
				 String dropdownverify=driver.findElement(By.xpath("//div[@id='userNav-menuItems']")).getText();
				System.out.println(dropdownverify);
				WebElement MyProfileEle = driver.findElement(By.xpath("//a[text()='My Profile']"));
				clickElement(MyProfileEle, "My Profile"); 
                Thread.sleep(5000);
				 WebElement PostLink = driver.findElement(By.id("publisherAttachTextPost"));
	             //waitForVisibility(PostLink, 4, "Post");
				 clickElement(PostLink, "Post");
				
				
				  WebElement postLinkIframe = driver.findElement(By.xpath("/html[1]/body[1]/p[1]"));
				 // waitForVisibility(PostLink, 4, "Post");
				  switchFrame( postLinkIframe, "postbody");
				  Thread.sleep(5000);
				  WebElement postBody = driver.findElement(By.xpath("//html[1]/body[1]"));
				  clickElement(postBody, "Post");  
					enterText(postBody, "This is 2034", "PostText");
					SwitchTodefaultFrame(driver);
					WebElement ShareButton = driver.findElement(By.xpath("//input[@id='publishersharebutton']"));
					clickElement(ShareButton, "ShareButton");
					System.out.println("Posted is shared");
					//closeBrowser();
				  
					
				}
	
	public static void PostFile() throws InterruptedException {
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
		WebElement loginButtonEle = driver.findElement(By.id("Login"));
				clickElement(loginButtonEle,"login button");
				WebElement userNameDropDown = driver.findElement(By.id("userNavLabel"));
				clickElement(userNameDropDown, "NehaABCD"); 
				 waitForVisibility(userNameDropDown, 5, "usermenu dropdown");
				 String dropdownverify=driver.findElement(By.xpath("//div[@id='userNav-menuItems']")).getText();
				System.out.println(dropdownverify);
				WebElement MyProfileEle = driver.findElement(By.xpath("//a[text()='My Profile']"));
				clickElement(MyProfileEle, "My Profile"); 
				WebElement FileLink = driver.findElement(By.xpath("//span[contains(@class,'publisherattachtext')][contains(text(),'File')]"));
				clickElement(FileLink, "FileLink");
				System.out.println("Clicked on filelink");
				Thread.sleep(5000);
				//waitForVisibility(FileLink, 10, 2, "FileLink");
				WebElement UploadFile = driver.findElement(By.xpath("//a[@id='chatterUploadFileAction']"));
				 //waitForVisibility(UploadFile, 10, 2,"Upload File from computer");
				clickElement(UploadFile, "UploadFile");
				Thread.sleep(5000);
				System.out.println("clicked on uploadfile button on computer");
				WebElement choosefile = driver.findElement(By.xpath("//input[@id='chatterFile']"));
				
				enterText(choosefile, "C:\\ReadWriteFile\\readFile.txt","chooseFile");
				Thread.sleep(5000);
				//waitForVisibility(choosefile, 10, 2,"choose file");
				System.out.println("choosefile option is selected");
				WebElement Share = driver.findElement(By.id("publishersharebutton"));
				 //waitForVisibility(Share, 5, "ShareButton");
				clickElement(Share, "ShareButton");
		
	}
	
	public static void AddPhoto() throws Exception {
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
				WebElement userNameDropDown = driver.findElement(By.id("userNavLabel"));
				clickElement(userNameDropDown, "NehaABCD"); 
				 waitForVisibility(userNameDropDown, 5, "usermenu dropdown");
				 String dropdownverify=driver.findElement(By.xpath("//div[@id='userNav-menuItems']")).getText();
				System.out.println(dropdownverify);
				WebElement MyProfileEle = driver.findElement(By.xpath("//a[text()='My Profile']"));
				clickElement(MyProfileEle, "My Profile"); 
				
				WebElement addPhotoLink = driver.findElement(By.id("displayBadge"));
				mouseOver(driver, addPhotoLink);
				WebElement AddPhoto = driver.findElement(By.xpath("//a[@id='uploadLink']"));
				clickElement(AddPhoto, "AddPhotolink");
				WebElement iframe = driver.findElement(By.id("uploadPhotoContentId"));
				switchFrameid(driver, "uploadPhotoContentId");
				Thread.sleep(5000);
				WebElement choosefileoption = driver.findElement(By.id("//*[@id='j_id0:uploadFileForm:uploadInputFile\']"));
				
	           enterText(choosefileoption, "C:\\Users\\Chiva\\OneDrive\\Pictures\\bloom-blossom-close-up-863963.JPG", "Upload photo");
				WebElement save = driver.findElement(By.xpath("//*[@id='j_id0:uploadFileForm:uploadBtn']"));
				Thread.sleep(5000);
				clickElement(save, "save");
				//driver.close();
				System.out.println("completed successfully");

			}
	
	public static void MySettings() {
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
				WebElement userNameDropDown = driver.findElement(By.id("userNavLabel"));
				clickElement(userNameDropDown, "NehaABCD");
				WebElement MySettings = driver.findElement(By.xpath("//*[@id=\"userNav-menuItems\"]/a[2]"));
				MySettings.click();
				String expectedUrl = driver.getCurrentUrl();
				String actualUrl = "https://tekarch-c9-dev-ed.develop.my.salesforce.com/ui/setup/Setup?setupid=PersonalSetup";
				if(actualUrl.equalsIgnoreCase(expectedUrl)) {
					System.out.println("User is on MySettings page");
				}
				else {
					System.out.println("MySettings page is not Lunched");
				}
				WebElement Personal = driver.findElement(By.xpath("//*[@id=\"PersonalInfo_font\"]"));
				Personal.click();
				WebElement LoginHistory = driver.findElement(By.xpath("//*[@id=\"LoginHistory_font\"]"));
				LoginHistory.click();
				
				WebElement History6months= driver.findElement(By.xpath("//*[@id=\"RelatedUserLoginHistoryList_body\"]/div/a"));
				History6months.click();
				
				WebElement DisplayandLayout = driver.findElement(By.xpath("//*[@id=\"DisplayAndLayout_font\"]"));
				DisplayandLayout.click();
				WebElement CustomizeMyTabs = driver.findElement(By.xpath("//*[@id=\"CustomizeTabs_font\"]"));
				CustomizeMyTabs.click();
				WebElement dropdown = driver.findElement(By.id("p4"));
				SelectfromDropDown(dropdown, "Salesforce Chatter");
				
				WebElement dropdown2 = driver.findElement(By.id("duel_select_0"));
				waitForVisibility(dropdown2, 10, 2,"Available Tabs");
				SelectfromDropDown(dropdown2, "Reports");
				WebElement addButton = driver.findElement(By.xpath("//*[@id=\"duel_select_0_right\"]/img"));
				addButton.click();
	}
	public static void EmailLink() {
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
				WebElement userNameDropDown = driver.findElement(By.id("userNavLabel"));
				clickElement(userNameDropDown, "NehaABCD");
				WebElement MySettings = driver.findElement(By.xpath("//*[@id=\"userNav-menuItems\"]/a[2]"));
				MySettings.click();
				String expectedUrl = driver.getCurrentUrl();
				String actualUrl = "https://tekarch-c9-dev-ed.develop.my.salesforce.com/ui/setup/Setup?setupid=PersonalSetup";
				if(actualUrl.equalsIgnoreCase(expectedUrl)) {
					System.out.println("User is on MySettings page");
				}
				else {
					System.out.println("MySettings page is not Lunched");
				}
	
	WebElement Email = driver.findElement(By.id("EmailSetup"));
	Email.click();
	WebElement MyEmailSettings = driver.findElement(By.id("EmailSettings_font"));
	MyEmailSettings.click();

	WebElement emailName = driver.findElement(By.id("sender_name"));
	emailName.clear();
	emailName.sendKeys("Neha chivate");
	WebElement emailAddress = driver.findElement(By.id("sender_name"));
	emailAddress.clear();
	emailAddress.sendKeys("Chivateneha@gmail.com");
	WebElement Bcc_radioButton = driver.findElement(By.id("auto_bcc1"));
	Bcc_radioButton.click();
	WebElement Savebutton = driver.findElement(By.name("save"));
	Savebutton.click();	
	
	WebElement CalenderNReminders = driver.findElement(By.id("CalendarAndReminders"));
	CalenderNReminders.click();

	WebElement ActivityReminders = driver.findElement(By.xpath("//*[@id=\"Reminders_font\"]"));
	ActivityReminders.click();
	
	WebElement openReminder = driver.findElement(By.className("btn"));
	openReminder.click();
	
	closeBrowser();
	}
	
	public static void DeveloperConsol() {
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
				WebElement userNameDropDown = driver.findElement(By.id("userNavLabel"));
				clickElement(userNameDropDown, "NehaABCD");
				WebElement developerconsole=driver.findElement(By.linkText("Developer Console"));
				waitForVisibility(developerconsole, 5, 2, "Developer Window");
				developerconsole.click();
				//waitForVisibility(developerconsole, 5, 2, "Developer Window");
				String your_title = "Developer Console";
				String currentWindow = driver.getWindowHandle();  //will keep current window to switch back
				for(String winHandle : driver.getWindowHandles()){
				   if (driver.switchTo().window(winHandle).getTitle().equals(your_title)) {
					   closeBrowser();
				     break;
				   } 
				   
				//driver.switchTo().window(window[1]).close();
				//driver.switchTo().Window(developerconsole).
				closeBrowser();
				System.out.println("developerconsole completed");
				
	}
				
	}
					public static void logoutSfdc() throws InterruptedException {
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
							
				
					
					WebElement userName = driver.findElement(By.id("userNavLabel"));
					Assert.assertEquals(userName.getText(), "Neha Chivate");

					WebElement usermenudropdown = driver.findElement(By.id("userNavButton"));
					usermenudropdown.click();
					Thread.sleep(5000L);
					WebElement userLogout = driver.findElement(By.xpath("//*[@id=\"userNav-menuItems\"]/a[5]"));
					userLogout.click();
					System.out.println("User Logged out of Salesforce");
					closeBrowser();
	
	}
}
	
