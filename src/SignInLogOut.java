import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SignInLogOut {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://3.86.232.171/");
		driver.findElement(By.cssSelector("input[placeholder=\"Enter Your Email\"]")).sendKeys("allampriyanka94@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder=\"Password\"]")).sendKeys("Real.123");
		driver.findElement(By.xpath("//button[text()='Sign In']")).click();
		//Dropdown
		driver.findElement(By.cssSelector("[class='nav-link dropdown-toggle']")).click();
		//Selecting Logout
		driver.findElement(By.linkText("Logout")).click();
		
	
	}
}
