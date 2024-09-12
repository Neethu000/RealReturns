import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class MyProfile {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//URL
		driver.get("http://3.86.232.171/");
		
		//In Sign in screen
		driver.findElement(By.xpath("//h3[contains(text(),'Sign In ')]")).getText();
		System.out.println("Sign In Screen:"+driver.findElement(By.xpath("//h3[contains(text(),'Sign In')]")).getText());
		Assert.assertEquals(driver.findElement(By.xpath("//h3[contains(text(),'Sign In')]")).getText().replaceAll("\\s+", " ").trim(),"Sign In to Real Returns.ai");
		//Enter email
		driver.findElement(By.name("email")).sendKeys("allampriyanka94@gmail.com");
		Thread.sleep(1000);
		//Enter password
		driver.findElement(By.id("password-field")).sendKeys("Real.123");
		Thread.sleep(1000);
		//click on sign in button
		driver.findElement(By.className("btn")).click();
		Thread.sleep(1000);
		
		//Click on My Profile in Header Menu after sign in 
		driver.findElement(By.xpath("//li[@class='nav-item dropdown'][3]")).click();	
		Thread.sleep(1000);
		
		//Dropdown appears then click on my profile
		driver.findElement(By.linkText("My Profile")).click();
		System.out.println("My Profile Screen:"+driver.findElement(By.tagName("h4")).getText());
		Assert.assertEquals(driver.findElement(By.tagName("h4")).getText(),"My Profile");
	    //(driver.findElement(By.tagName("h4")).getText()", "My Profile");
	    
	}

}
