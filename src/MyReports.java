import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class MyReports {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver = new ChromeDriver();
			
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//driver.get("https://yiralifewebuat.azurewebsites.net/");
		driver.get("http://34.236.208.98/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		//In Sign in screen
		driver.findElement(By.xpath("//h3[contains(text(),'Sign In ')]")).getText();
		System.out.println("Sign In Screen:"+driver.findElement(By.xpath("//h3[contains(text(),'Sign In')]")).getText());
		Assert.assertEquals(driver.findElement(By.xpath("//h3[contains(text(),'Sign In')]")).getText().replaceAll("\\s+", " ").trim(),"Sign In to Real Returns.ai");
		//Enter email
		driver.findElement(By.name("email")).sendKeys("yiratest@gmail.com");
		Thread.sleep(1000);
		//Enter password
		driver.findElement(By.id("password-field")).sendKeys("Sateesh@123");
		Thread.sleep(1000);
		//click on sign in button
		driver.findElement(By.className("btn")).click();
		Thread.sleep(1000);
		
		//Click on My Reports in Header Menu
		driver.findElement(By.linkText("My Reports")).click(); 
		Thread.sleep(1000);
		
		//Click on Residential in My Reports Dropdown
		driver.findElement(By.linkText("Residential")).click(); 
		System.out.println("Residential Reports Screen:"+driver.findElement(By.cssSelector(".m-3.text__color")).getText());
		Assert.assertEquals(driver.findElement(By.cssSelector(".m-3.text__color")).getText(),"Residential Reports");
		driver.navigate().back();
		
		//Again Click on My Reports in Header Menu
	    driver.findElement(By.linkText("My Reports")).click(); 
	    Thread.sleep(1000);
	    
		//Click on Commercial in My Reports Dropdown
		driver.findElement(By.linkText("Commercial")).click();
		
		//Click on DSCR on Commercial Dropdown
		driver.findElement(By.linkText("DSCR")).click(); 
		System.out.println("DSCR Reports Screen:"+driver.findElement(By.className("m-3")).getText());
		Assert.assertEquals(driver.findElement(By.className("m-3")).getText(),"DSCR Reports");
		driver.navigate().back();
		Thread.sleep(2000);
		
		//Again Click on My Reports in Header Menu
	    driver.findElement(By.linkText("My Reports")).click(); 
	    Thread.sleep(1000);
	    
		//Click on Commercial in My Reports Dropdown
	    driver.findElement(By.linkText("Commercial")).click();
	    Thread.sleep(1000);
		
		//Click on ROI on Commercial Dropdown
		driver.findElement(By.linkText("ROI")).click(); 
		Thread.sleep(2000);
		System.out.println("ROI Reports Screen:"+driver.findElement(By.className("m-3")).getText());
		Assert.assertEquals(driver.findElement(By.className("m-3")).getText(),"ROI Reports");
		driver.navigate().back();
		
	}

}
