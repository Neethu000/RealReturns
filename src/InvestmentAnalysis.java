import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


public class InvestmentAnalysis {

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
	driver.findElement(By.name("email")).sendKeys("allampriyanka94@gmail.com");
	Thread.sleep(1000);
	//Enter password
	driver.findElement(By.id("password-field")).sendKeys("Real.123");
	Thread.sleep(1000);
	//click on sign in button
	driver.findElement(By.className("btn")).click();
	Thread.sleep(1000);
	
	//Click on Investment Analysis in Header menu on Dashboard
	driver.findElement(By.linkText("Investment Analysis")).click();
	Thread.sleep(1000);
	
	//click on Residential in Investment Analysis Dropdown
	driver.findElement(By.linkText("Residential")).click();
	System.out.println("Residential Screen:"+driver.findElement(By.tagName("h4")).getText());
	Assert.assertEquals(driver.findElement(By.tagName("h4")).getText(), "RESIDENTIAL INVESTMENT ANALYSIS");
	driver.navigate().back();
	
	//Again click on  Residential in Investment Analysis Dropdown 
	driver.findElement(By.linkText("Investment Analysis")).click();
	Thread.sleep(2000);
	
	//click on Commercial in Investment Analysis Dropdown
	driver.findElement(By.linkText("Commercial")).click();
	Thread.sleep(2000);
	
	//click on DSCR in Commercial Dropdown
	driver.findElement(By.linkText("DSCR")).click();
	System.out.println("DSCR Screen:"+driver.findElement(By.tagName("h4")).getText());
	Assert.assertEquals(driver.findElement(By.tagName("h4")).getText(),"Debt Service Coverage Ratio (DSCR) Analysis");
	Thread.sleep(2000);
	driver.navigate().back();
	
	//Again click on Commercial in Investment Analysis Dropdown
	driver.findElement(By.linkText("Investment Analysis")).click();
	driver.findElement(By.linkText("Commercial")).click();
	Thread.sleep(2000);
	
	//click on ROI in Commercial Dropdown
	driver.findElement(By.linkText("ROI")).click();
	System.out.println("ROI Screen:"+driver.findElement(By.tagName("h4")).getText());
	Assert.assertEquals(driver.findElement(By.tagName("h4")).getText(),"COMMERCIAL INVESTMENT ANALYSIS (ROI)");
	driver.navigate().back();
	Thread.sleep(2000);

	
	//My Profile
	//driver.findElement(By.xpath("//li[@class='nav-item dropdown'][3]")).click();	
	//Thread.sleep(1000);
	
	//driver.close();
	//driver.quit();
	
	
		
		
	}

}
