import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class SwitchTo{
static WebDriver driver =new EdgeDriver();;
	public static void main(String[] args) throws InterruptedException   {
		 login();
		 Thread.sleep(5000);
		 movetoSwitchtoTab();
		 alert();
	}

	public static void login() throws InterruptedException {
		// TODO Auto-generated method stub
	
		driver.manage().window().maximize();
		driver.get("https://selenium-prd.firebaseapp.com/");
		
		//String title = driver.getTitle();
		//System.out.println(title);
		
			Thread.sleep(5000);
	
		 WebElement email = driver.findElement(By.id("email_field"));
		 email.sendKeys("admin123@gmail.com");
		  WebElement password = driver.findElement(By.cssSelector("#password_field"));
		  password.sendKeys("admin123");
		  WebElement Login = driver.findElement(By.tagName("Button"));
		  	Login.click();
	
		}
	//public static void HomeTab() {
	//	WebElement homeTab = driver.findElement(By.partialLinkText("Home"));
		//homeTab.click();}
	
	public static void movetoSwitchtoTab(){
		
		WebElement switchToTab = driver.findElement(By.xpath("//button[contains(text(),'Switch To')]"));
		Actions action =new Actions(driver);
		action.moveToElement(switchToTab).build().perform();
	}
   public static void alert() {
	  
	WebElement alert = driver.findElement(By.xpath("//a[text()='Alert']"));
	   alert.click();
   }
   
   public static void clickonWindowAlert() throws InterruptedException {

		WebElement windowalert = driver.findElement(By.xpath("//button[text()='Window Alert']"));
		windowalert.click();
		Thread.sleep(5000);

		String alertText = driver.switchTo().alert().getText();
		System.out.println(alertText);
		
		driver.switchTo().alert().accept();

	}
	
	public static void clickonPromtAlert() {
		WebElement promtalert = driver.findElement(By.xpath("//button[text()='Promt Alert']"));
		promtalert.click();
		
		driver.switchTo().alert().sendKeys("Jnanesh");
		//driver.switchTo().alert().accept();
		driver.switchTo().alert().dismiss();
		
		WebElement AlertMessage = driver.findElement(By.id("Selenium"));
		String alertText = AlertMessage.getText();
		
		System.out.println(alertText);
		
	}
	
}
