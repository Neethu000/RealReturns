import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Register {
	
	public static void main(String[] args) throws InterruptedException {
	

	System.setProperty("webdriver.chrome.driver","chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	
	//URL
	driver.get("http://3.86.232.171/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.findElement(By.className("btn-secondary")).click();
	driver.findElement(By.id("sub3")).click();
	
	   WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	   //WebElement element = driver.findElement(By.xpath("//*[@id=\"Registerplan\"]/button"));
	   WebElement element = driver.findElement(By.xpath("//button[@value='Send OTP']"));
	
//	((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
//	 element.click();
	   
	   //WebElement element = driver.findElement(By.id("navigationPageButton"));
//	   Actions actions = new Actions(driver);
//	   actions.moveToElement(element).click().build().perform();
	   
	  // WebElement myelement = driver.findElement(By.id("navigationPageButton"));
//	   JavascriptExecutor jse2 = (JavascriptExecutor)driver;
//	   jse2.executeScript("arguments[0].scrollIntoView()", element); 

//	   ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
//	   element.click();
	   
	   //WebElement element = driver.findElement(By.id("yourElementId"));
//	   int attempts = 0;
//	   while (attempts < 3) {
//	       try {
//	           element.click();
//	           break;
//	       } catch (ElementClickInterceptedException e) {
//	           // Handle the exception or log the error message
//	       }
//	       attempts++;
//	   }
	   
	   int maxAttempts = 3;
	   for (int attempts = 0; attempts < maxAttempts; attempts++) {
	       try {
	           element.click();
	           break;
	       } catch (ElementClickInterceptedException e) {
	           // Handle the exception or log the error message
	       }
	   }

//	   Alert ChoosePlanAlert = driver.switchTo().alert();
      // Get the text of the alert and print it
//       System.out.println("Alert Text: " + ChoosePlanAlert.getText());
       // Accept the alert (click on the OK button)
//       simpleAlert.accept();
	   
       //OR
//	   System.out.println(driver.switchTo().alert().getText());
//	   driver.switchTo().alert().accept();
	   
	   driver.findElement(By.id("first_name")).sendKeys("Priya");
	   Thread.sleep(1000); 
	   driver.findElement(By.id("last_name")).sendKeys("Allam");
	   Thread.sleep(1000); 
	   driver.findElement(By.id("phone")).sendKeys("9010234567");
	   Thread.sleep(1000); 
	   driver.findElement(By.id("email")).sendKeys("priyanka123@gmail.com");
	   Thread.sleep(1000); 
	   driver.findElement(By.id("password-field1")).sendKeys("Priyanka123");
	   Thread.sleep(1000); 
	   driver.findElement(By.id("password-field")).sendKeys("Priyanka123");
	   Thread.sleep(1000); 
 	   driver.findElement(By.id("text1")).click();
 	   Thread.sleep(1000); 
 	   driver.findElement(By.xpath("//option[@value='8']")).click();
 	   Thread.sleep(1000); 
 	   driver.findElement(By.xpath("//input[@type='checkbox']")).click();
 
 	   WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(30));
 	   WebElement element1 = wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@value='Send OTP']")));
 	   element1.click();
 	
 	   System.out.println(driver.findElement(By.xpath("//*[@id=\"Registerform\"]/div[4]/div[2]")).getText());
 	   
	   driver.findElement(By.id("password-field1")).sendKeys("Priyanka123");
	   Thread.sleep(1000); 
	   driver.findElement(By.id("password-field1")).clear();
	   Thread.sleep(1000); 
	   driver.findElement(By.id("password-field")).sendKeys("Priyanka123");
	   Thread.sleep(1000); 
	   driver.findElement(By.id("password-field")).clear();
	   Thread.sleep(1000); 
	   driver.findElement(By.id("password-field1")).sendKeys("Priya.123");
	   Thread.sleep(1000); 
	   driver.findElement(By.id("password-field")).sendKeys("Priya.123");
	   Thread.sleep(1000); 
	   driver.findElement(By.id("text1")).click();
	   Thread.sleep(1000); 
	   driver.findElement(By.xpath("//option[@value='5']")).click();
	   Thread.sleep(1000); 
	   driver.findElement(By.xpath("//input[@type='checkbox']")).click();
	   Thread.sleep(1000); 
	   
	   int maxAttempts1 = 3;
	   for (int attempts = 0; attempts < maxAttempts1; attempts++) {
	       try {
	           WebElement sentotpbutton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@value='Send OTP']")));
	           sentotpbutton .click();
	           break;
	       } catch (ElementClickInterceptedException e) {
	           // Handle the exception or log the error message
	       }
	   }
      
		// already an user? Sign In //
		/*
		 * int maxAttempts1 = 3; for (int attempts = 0; attempts < maxAttempts1;
		 * attempts++) { try { driver.findElement(By.linkText("Sign In")).click();
		 * 
		 * } catch (ElementClickInterceptedException e) { // Handle the exception or log
		 * the error message } }
		 */
		Thread.sleep(3000);
		  
		/*
		 * driver.findElement(By.xpath("//div[@id='card-number']")).click();
		 * driver.findElement(By.
		 * xpath("//iframe[@title='Secure card number input frame']")).sendKeys(
		 * "1234567895105105105105100"); Thread.sleep(30000);
		 * 
		 * 
		 * driver.findElement(By.id("card-expiry")).click(); driver.findElement(By.
		 * xpath("//iframe[@title='Secure expiration date input frame']"
		 * )).sendKeys("54321"); Thread.sleep(20000);
		 * 
		 * driver.findElement(By.id("card-cvc")).click();
		 * driver.findElement(By.xpath("//iframe[@title='Secure CVC input frame']")).
		 * sendKeys("54321"); Thread.sleep(2000);
		 * 
		 * driver.findElement(By.id("card-zip")).click(); driver.findElement(By.
		 * xpath("//iframe[@title='Secure postal code input frame']")).sendKeys("54321")
		 * ; Thread.sleep(2000);
		 */
		 
		 
		 int maxAttempts2 = 3;
		   for (int attempts = 0; attempts < maxAttempts2; attempts++) {
		       try {
		           driver.findElement(By.id("submit-payment")).click();
		           break;
		       } catch (ElementClickInterceptedException e) {
		           // Handle the exception or log the error message
		       }
		   }
	
		 Thread.sleep(2000);
		 
		 
	
	 }
	
	}

