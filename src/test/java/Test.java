import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test {
	
	static WebDriver driver = new EdgeDriver();
	
	public static  void login() throws InterruptedException {
		
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
					  	System.out.println(driver.getCurrentUrl());
					  	Thread.sleep(5000);
		
	}
	
	public static void SwitchToTab() throws InterruptedException {
		System.out.println(driver.getCurrentUrl());
		WebElement switchToTab = driver.findElement(By.xpath("//button[contains(text(),'Switch To')]"));
		  Actions action =new Actions(driver);
		   action.moveToElement(switchToTab).build().perform();
		   Thread.sleep(5000);
		
	}
	
	public static void Alerts() {
		System.out.println(driver.getCurrentUrl());
		 
		  WebElement alert = driver.findElement(By.xpath("//a[text()='Alert']"));
		   alert.click();

		
	}
	

	public static void main(String[] args) throws InterruptedException	
	{
		login();
		Thread.sleep(5000);
		SwitchToTab();
		Alerts();
		
			 
	}

}
