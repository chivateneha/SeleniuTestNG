import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Interactions {
  static WebDriver driver = new EdgeDriver();
  
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		login();
		Thread.sleep(5000);
		InteractionsTab();
		Thread.sleep(5000);
		testsingleclick10times();
		
		testDoubleclick10times();
		Thread.sleep(2000);
		 DoubleClickButton();
	}
  public static void testsingleclick10times() throws InterruptedException {
		// TODO Auto-generated method stub
	  doubleclickTab();
	  Thread.sleep(5000);
	  for(int i=0; i<10;i++) {
		  singleclickbutton();
	  }
	  	
	}
  
  public static void testDoubleclick10times() throws InterruptedException {
		// TODO Auto-generated method stub
	  doubleclickTab();
	  Thread.sleep(5000);
	  for(int i=0; i<9;i++) {
		  DoubleClickButton();
	  }
	  }
public static void login() throws InterruptedException {
	
		 driver.get("https://selenium-prd.firebaseapp.com/");
		  driver.manage().window().maximize();
		  String title = driver.getTitle();
		  System.out.println(title);

		 WebElement email = driver.findElement(By.id("email_field"));
		  Thread.sleep(5000);
			
		  email.sendKeys("admin123@gmail.com");
		  
		  
		  WebElement password = driver.findElement(By.cssSelector("#password_field"));
		  password.sendKeys("admin123");
		 

		  
		  WebElement Login = driver.findElement(By.tagName("Button"));
		  	Login.click();
		  
  }
  
  public static void InteractionsTab() throws InterruptedException {
	  driver.findElement(By.partialLinkText("Home")).click();
	  WebElement interactions = driver.findElement(By.xpath("//*[@id=\"user_div\"]/div[1]/div[2]/button"));
	  Actions action = new Actions(driver);
	  action.moveToElement(interactions).build().perform();
	  Thread.sleep(5000);
		
	  
	//button[contains(text(),'Intractions')]"
  }
  
//  public static void dragAnddrop() {
//	 WebElement dragdrop = driver.findElement(By.xpath("//a[text()='Drag & Drop']"));
//	 dragdrop.click(); }
  public static void doubleclickTab() throws InterruptedException {	
	  WebElement doubleclick = driver.findElement(By.xpath("//a[normalize-space()='Double Click']"));
	  Thread.sleep(5000);
	 
	 Actions action = new Actions(driver);
	 action.doubleClick().build().perform();
	 doubleclick.click();
		   
  }
  public static void singleclickbutton() {
	  WebElement singleclick = driver.findElement(By.xpath("//button[text()='single Click'] "));
	  singleclick.click();
	  
		   
  }
  
  public static void DoubleClickButton() throws InterruptedException {
	  WebElement btndoubleclick = driver.findElement(By.xpath("//button[text()='Double Click']"));
		Thread.sleep(5000);
		Actions action = new Actions(driver);
		action.doubleClick(btndoubleclick).build().perform();
	}
  }


