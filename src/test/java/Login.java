

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Login {

		static WebDriver driver = new ChromeDriver();

		public static void main(String[] args) throws InterruptedException {
			driver.get("https://login.salesforce.com/");
			driver.manage().window().maximize();
			String title = driver.getTitle();
			loginClearPassword();
			ValidUsernamevalidPassword();
			salesforcelogout();
			Thread.sleep(5000);
			passwordReset();
		}
		
			public static void loginClearPassword() throws InterruptedException {
			Thread.sleep(5000);
			WebElement Username = driver.findElement(By.id("username"));
		
			Username.sendKeys("chirag@home.com");

			WebElement Password = driver.findElement(By.id("password"));
			
			Password.clear();

			WebElement Login = driver.findElement(By.id("Login"));
			Login.click();
			
			Thread.sleep(5000L);
			
			System.out.println(driver.getTitle());
		
		
		
	}
		public static void ValidUsernamevalidPassword() throws InterruptedException {
			Thread.sleep(5000);
			WebElement Username = driver.findElement(By.id("username"));
		
			Username.sendKeys("chirag@home.com");

			WebElement Password = driver.findElement(By.id("password"));
			
			Password.sendKeys("belgaum84");

			WebElement Login = driver.findElement(By.id("Login"));
			Login.click();
			
			Thread.sleep(5000L);
			
			System.out.println(driver.getTitle());
			
		
		
	}
		 public static void salesforcelogout() throws InterruptedException {

				WebElement usermenudropdown = driver.findElement(By.id("userNavButton"));
				usermenudropdown.click();
				Thread.sleep(5000L);
				WebElement userLogout = driver.findElement(By.xpath("//*[@id=\"userNav-menuItems\"]/a[5]"));
				userLogout.click();

}
		 
		  public static void passwordReset() throws InterruptedException 
			{
				WebElement Username = driver.findElement(By.xpath("//*[@id=\"username\"]"));
				Thread.sleep(5000);
				Username.sendKeys("chirag@home.com");
				
				WebElement forgotPassword = driver.findElement(By.id("forgot_password_link"));
				forgotPassword.click();
				WebElement resetPasswordUsername = driver.findElement(By.id("un"));
				resetPasswordUsername.sendKeys("chirag@home.com");
				WebElement continueButton = driver.findElement(By.id("continue"));
				continueButton.click();
				WebElement returnTologin = driver.findElement(By.xpath("//*[@id=\"forgotPassForm\"]/a"));
				returnTologin.click();
				Thread.sleep(5000);
			}

			 
		  public static void Wrongpassword() throws InterruptedException{ 

			WebElement Username = driver.findElement(By.xpath("//*[@id=\"username\"]"));
			Thread.sleep(5000);
			Username.sendKeys("123");

			WebElement Password = driver.findElement(By.id("password"));
			Password.sendKeys("22131");
        	WebElement Login = driver.findElement(By.id("Login"));
            Login.click();
}
}