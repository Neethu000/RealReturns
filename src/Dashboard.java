import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Dashboard {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//click on URL
		driver.get("http://34.236.208.98/");
		//enter email
		driver.findElement(By.name("email")).sendKeys("allampriyanka94@gmail.com");
		Thread.sleep(1000);
		//enter password
		driver.findElement(By.id("password-field")).sendKeys("Real.123");
		Thread.sleep(1000);
		//click on sign in button
		driver.findElement(By.className("btn")).click();
		Thread.sleep(1000);
		//Dashboard appear then clcik on dashbord in header menu
		driver.findElement(By.linkText("Dashboard")).click();
		System.out.println("Dashboard Screen:"+driver.findElement(By.tagName("h3")).getText());
		Assert.assertEquals(driver.findElement(By.tagName("h3")).getText(),"Dashboard");
		Thread.sleep(1000);
		
		//In Dashboard screen click on Residential Investments
		driver.findElement(By.xpath("//a[@class='btn btn-dark btn-sm reprot__title'][1]")).click();
		System.out.println("Residential Screen:"+driver.findElement(By.tagName("h4")).getText());
		Assert.assertEquals(driver.findElement(By.tagName("h4")).getText(), "RESIDENTIAL INVESTMENT ANALYSIS");

		driver.navigate().back();
		
		//In Dashboard screen,click on Commercial Investments then appear Dropdown 
		driver.findElement(By.xpath("//a[@href='#'][normalize-space()='Create New Report']")).click();
		Thread.sleep(1000);
		
		//In Dashboard,click DSCR in dropdown
		driver.findElement(By.linkText("DSCR")).click();
		System.out.println("DSCR Screen:"+driver.findElement(By.tagName("h4")).getText());
		Assert.assertEquals(driver.findElement(By.tagName("h4")).getText(),"Debt Service Coverage Ratio (DSCR) Analysis");
		driver.navigate().back();
		
		//In Dashboard screen,click on Commercial Investments then appear Dropdown 
		driver.findElement(By.xpath("//a[@href='#'][normalize-space()='Create New Report']")).click();
		
		//In Dashboard,click ROI in dropdown
		driver.findElement(By.linkText("ROI")).click();
		System.out.println("ROI Screen:"+driver.findElement(By.tagName("h4")).getText());
		Assert.assertEquals(driver.findElement(By.tagName("h4")).getText(),"COMMERCIAL INVESTMENT ANALYSIS (ROI)");
		driver.navigate().back();
		
		}

}
