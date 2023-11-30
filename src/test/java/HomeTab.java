import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class HomeTab {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriver driver = new EdgeDriver();
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
		  	
	       
	        Thread.sleep(5000); 
	    //   driver.findElement(By.xpath("//a[text()='Home']")).click();
	       driver.findElement(By.partialLinkText("Home")).click();
	        
	        WebElement name = driver.findElement(By.id("name"));
	        name.sendKeys("Neha");
	        
	        WebElement Fathername = driver.findElement(By.id("lname"));
	        Fathername.sendKeys("Kininge");
	        Thread.sleep(5000);
	        WebElement PostalAddress = driver.findElement(By.id("postaladdress"));
	        PostalAddress.sendKeys("Belgaum, Karnataka");
	       
	        Thread.sleep(5000);
	        WebElement PersonalAddress = driver.findElement(By.id("personaladdress"));
	        PersonalAddress.sendKeys("Texas, usa");
	        //WebElement FemaleRadio = driver.findElement(By.xpath("//input[@value='female']"));
	        WebElement FemaleRadio = driver.findElement(By.cssSelector("#radiobut"));
	        FemaleRadio.click();		
	           Thread.sleep(5000); 
	        WebElement dropDownmenuCity = driver.findElement(By.id("city"));
	        Select City=new Select(dropDownmenuCity);
	        City.selectByVisibleText("GOA");
	        
	        Thread.sleep(5000);
	        WebElement dropDownmenuCourse = driver.findElement(By.id("course"));
	        Select Course=new Select(dropDownmenuCourse);
	        Course.selectByVisibleText("MCA");
	        Thread.sleep(5000);         
	        WebElement dropDownmenuDistrict = driver.findElement(By.id("district"));
	        Select District=new Select(dropDownmenuDistrict);
	        District.selectByVisibleText("BIHAR");
	        Thread.sleep(5000);
	        WebElement dropDownmenuState = driver.findElement(By.id("state"));
	        Select State=new Select(dropDownmenuState);
	        State.selectByVisibleText("PATNA");
	        
	        Thread.sleep(5000);
	        WebElement Pincode = driver.findElement(By.id("pincode"));
	        Pincode.sendKeys("77581");
	        Thread.sleep(5000);
	        WebElement Emailid = driver.findElement(By.id("emailid"));
	        Emailid.sendKeys("xyz@gmail.com");
	        WebElement SubmitButton = driver.findElement(By.xpath("//*[@id=\"user_div\"]/div[2]/div/span/button"));
	        SubmitButton.click();
	        
	        Thread.sleep(10000);
	       driver.close();
		}
	}

