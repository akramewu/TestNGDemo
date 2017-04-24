import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class Logintest 
{
	public WebDriver driver;
	
    @BeforeTest 
    public void Startup()
    {
    	driver = new FirefoxDriver();
    	driver.get("http://toolsqa.com/automation-practice-form/");
    	System.out.println("Successfully open the website");
    }
    
	@Test //this will execute the test case
	public void FullName()
	{
		 WebElement firstName = driver.findElement(By.name("firstname"));
		  firstName.sendKeys("akramul");
		  
		  WebElement lastName = driver.findElement(By.name("lastname"));
		  lastName.sendKeys("islam");
		  
		  System.out.println("First Name & Last Name successfully insertet");
	}
	
	@Test
	public void Continents()
	{
		Select sel1 = new Select(driver.findElement(By.xpath(".//*[@id='continents']")));
		sel1.selectByIndex(4);
	}
	
	@AfterTest
	public void terminatetest()
	{
		//driver.close();
	}
}
