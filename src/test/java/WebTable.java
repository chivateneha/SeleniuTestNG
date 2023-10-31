import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebTable {
	static WebDriver driver = new EdgeDriver();
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		login();
		Widget();
		
	}
		public static void login() {
			driver.manage().window().maximize();
					driver.get("https://selenium-prd.firebaseapp.com/");
						
						String title = driver.getTitle();
						System.out.println(title);
			 WebElement email = driver.findElement(By.id("email_field"));	
			 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	          wait.until(ExpectedConditions.visibilityOf(email));

	  		if (email.isDisplayed()) {
	  			email.clear();
	  			email.sendKeys("admin123@gmail.com");
	  			System.out.println("email is entered in the username field");
	  		} else {
	  			System.out.println("email element is not displayed");
	  		}
			WebElement password = driver.findElement(By.cssSelector("#password_field"));

	  		if (password.isDisplayed()) {
	  			password.clear();
	  			password.sendKeys("admin123");
	  			System.out.println("password is entered in the username field");
	  		} else {
	  			System.out.println("password element is not displayed");
	  		}
			 WebElement Login = driver.findElement(By.tagName("Button"));
			 if(Login.isEnabled()) {
				
				 Login.click();
					System.out.println("button is clicked");
					}
			 else {
				 System.out.println("Button is not clicked");
			 }
				System.out.println(driver.getCurrentUrl());
				
		}
		public static void Widget() {
			WebElement widget=driver.findElement(By.xpath("//button[contains(text(),'Widget')]"));
			 WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(5));
	          wait1.until(ExpectedConditions.visibilityOf(widget));
		
			Actions action=new Actions(driver);
			action.moveToElement(widget).build().perform();
			
			WebElement Table = driver.findElement(By.xpath("//a[text()='Table']"));
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	          wait.until(ExpectedConditions.visibilityOf(Table));
	          Table.click();
	          
	          WebElement tabledata=driver.findElement(By.xpath("//table/tbody"));
	  		List<WebElement> listOfheaders= tabledata.findElements(By.xpath("//tr/th"));
	  		for(WebElement ele:listOfheaders) {
	  			System.out.print(ele.getText()+ "-----");
	  		}
	  		System.out.println();
	  		List<WebElement> listOfdata= tabledata.findElements(By.xpath("//td"));
	  		for(WebElement ele:listOfdata) {
	  			System.out.println(ele.getText());
	  		}
	  		
	  		System.out.println("completed");
	  		
	  	}
	}


