import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


public class ForgotPassword {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

     //System.setProperty("webdriver.chrome.driver","chromedriver.exe");
     WebDriver driver = new ChromeDriver();
     driver.manage().window().maximize();
		
	 //URL
	 driver.get("http://3.86.232.171/");
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	 //SIGN IN
	 //driver.findElement(By.name("email")).sendKeys("yiratest@gmail.com");
	 //driver.findElement(By.id("password-field")).sendKeys("Sateesh@");
	 //driver.findElement(By.className("btn")).click();
	 //System.out.println(driver.findElement(By.name("p")).getText());
		 
	 //In sign in screen,click on forgot password
	 driver.findElement(By.linkText("Forgot Password?")).click();
	 System.out.println("Forgot Password Screen:"+driver.findElement(By.xpath("//h3[contains(text(),'Forgot Password')]")).getText());
	 Assert.assertEquals(driver.findElement(By.xpath("//h3[contains(text(),'Forgot Password')]")).getText().replaceAll("\\s+", " ").trim(),"Forgot Password Real Returns.ai");

	 Thread.sleep(3000);
	 
	 //In Reset password screen,enter email
	 driver.findElement(By.cssSelector("input[placeholder='Enter Your Email']")).sendKeys("allampriyanka94@gmail.com");
	 Thread.sleep(1000);
	 //In Reset password screen,click on send reset password button
	 driver.findElement(By.cssSelector("button[value='Send OTP']")).click();
	
	 //String verifymail = driver.findElement(By.xpath("//div[@class='alert alert-success']")).getText();
	 //System.out.println(verifymail);
	 // OR
	 System.out.println(driver.findElement(By.xpath("//div[@class='alert alert-success']")).getText());
	 Assert.assertEquals(driver.findElement(By.xpath("//div[@class='alert alert-success']")).getText(), "A Reset Password link is send to registered email");
	 
	 //Return to the sign In
	 //driver.findElement(By.linkText("Sign In")).click();
	 //Thread.sleep(1000);
		 
		
     
		
        
        
	}

}
