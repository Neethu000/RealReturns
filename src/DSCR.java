import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DSCR {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		

	System.setProperty("webdriver.chrome.driver","chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
				
	driver.get("http://34.236.208.98/");
	            //SignIn
	driver.findElement(By.cssSelector("input[placeholder=\"Enter Your Email\"]")).sendKeys("absk7777@gmail.com");
	driver.findElement(By.xpath("//input[@placeholder=\"Password\"]")).sendKeys("Real.123");
	driver.findElement(By.xpath("//button[text()='Sign In']")).click();
	            //Investment analysis clicking
			    //driver.findElement(By.xpath("//a[@class='nav-link dropdown-toggle text__color mt-2'][1]")).click();
	driver.findElement(By.linkText("Investment Analysis")).click();
				//Commercial selecting
				//driver.findElement(By.xpath("//a[@class='dropdown-item dropdown-item-toggle text__color'][1]")).click();
	driver.findElement(By.linkText("Commercial")).click();
				//DSCR selecting
	driver.findElement(By.linkText("DSCR")).click();

	try {
				//get the displaying Limit over text 
	String limitOverText = driver.findElement(By.xpath("//div[@class='alert alert-danger alert-dismissible fade show']")).getText();
				//print the limit over text
	System.out.println(limitOverText);
				
	} catch (NoSuchElementException e) {
		
	//-------------------------Property Details----------------------------------//
		
	driver.findElement(By.id("borrower_name")).sendKeys("Oakwood Apartments");
	driver.findElement(By.id("approximate_sq_footage")).sendKeys("60,000");
	//PropertyType
	WebElement PropertyType = driver.findElement(By.id("property_type"));
	Select Propertydrop = new Select(PropertyType);
	Propertydrop.selectByVisibleText("Mixed-Use");
	//NoOfUnits
    WebElement NumOfUnits = driver.findElement(By.id("no_units"));
	Select Unitdrop = new Select(NumOfUnits);
	Unitdrop.selectByVisibleText("30");
	
	//---------------------------LoanTerms--------------------------------------//
	//Loan terms dropdown clicking
	driver.findElement(By.xpath("//button[@class='accordion-button collapsed bg-darkk text__color' and @aria-controls='flush-collapseTwo']")).click();
	//Property value
	driver.findElement(By.id("property_value")).sendKeys("6,000,000");
	WebElement Year = driver.findElement(By.name("amortization_years"));
	Select YearDrop = new Select(Year);
	YearDrop.selectByVisibleText("30");
	driver.findElement(By.id("interest_rate")).clear();
	driver.findElement(By.id("interest_rate")).sendKeys("4.5");
	Thread.sleep(5000);
	
	//---------------------Income(For clicking using for loop)---------------------//
	//dropdown clicking
	WebElement income = driver.findElement(By.xpath("//button[@class='accordion-button collapsed bg-darkk text__color' and @aria-controls='flush-collapseThree']"));
	int maxAttempts = 3;
    for (int attempts = 0; attempts < maxAttempts; attempts++) {
	try {
    income.click();
	break;
	} catch (ElementClickInterceptedException e1) {
	// Handle the exception or log the error message
    }
	}
    driver.findElement(By.id("gross_annual_rental")).sendKeys("720,000");
	driver.findElement(By.id("other_income")).sendKeys("25,000");
	
	//-----------------------Annual Operating Expenses----------------------------//
	//AOExp dropdown clicking 
	driver.findElement(By.xpath("//button[@class='accordion-button collapsed bg-darkk text__color' and @aria-controls='flush-collapseFour']")).click();
	//UTILITIES / TELEPHONE
	WebElement utilies = driver.findElement(By.id("utilities_telephone"));
	utilies.clear();
	utilies.sendKeys("20,000"); 
	//REPAIRS AND MAINTENANCE
	WebElement repairs=  driver.findElement(By.id("repairs_maintenance"));
	repairs.clear();
	repairs.sendKeys("30,000"); 
	//SALARIES / LEGAL / ADMIN
	WebElement salaries=  driver.findElement(By.id("salaries_legal"));
	salaries.clear();
	salaries.sendKeys("40,000"); 
	//SNOW / TRASH
	WebElement snow=  driver.findElement(By.id("snow_trash"));
	snow.clear();
	snow.sendKeys("10,000"); 
	//R.E. TAXES
	WebElement taxes=  driver.findElement(By.id("re_taxes"));
	taxes.clear();
	taxes.sendKeys("30,000");
	//INSURANCE
	WebElement insurance=  driver.findElement(By.id("insurance"));
	insurance.clear();
	insurance.sendKeys("35,000");
	//OTHER OPERATING EXP
	WebElement other=  driver.findElement(By.id("other_operating_exp"));
	other.clear();
	other.sendKeys("15,000");
	//ANNUAL OPERATING EXP
	WebElement annual=  driver.findElement(By.id("annual_operating_exp"));
	annual.clear();
	annual.sendKeys("170,000");
	//MGMT FEES
	WebElement mgmt=  driver.findElement(By.id("mgmt_fees"));
	mgmt.clear();
	mgmt.sendKeys("35,000");
	Thread.sleep(3000);
	
    //Save DSCR Analysis button
	WebElement save = driver.findElement(By.id("alert-warning"));
	int maAttempts = 3;
	for (int attempts = 0; attempts < maAttempts; attempts++) {
	try {
	save.click();
	break;
	} catch (ElementClickInterceptedException e2) {
    // Handle the exception or log the error message
    }
	}
				//In alert box, clicking on save analysis button
	driver.findElement(By.xpath("//button[text()='Save Analysis']")).click();
				//get the displaying success text
    String SuccessText=driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible fade show']")).getText();
				//Print the success text
	System.out.println(SuccessText);		
	}
	
	//driver.quit();
	}
	}


