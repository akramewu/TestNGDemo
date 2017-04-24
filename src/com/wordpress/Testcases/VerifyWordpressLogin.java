/**
 * 
 */
package com.wordpress.Testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.wordpress.Pages.LoginPage;
import com.wordpress.Pages.LogoutPage;

/**
 * @author Akram
 * 
 * 
 *
 */
public class VerifyWordpressLogin 
{
  WebDriver driver = new FirefoxDriver();
  
  @BeforeTest
  public void BrowserLaunch()
  {
	  driver.manage().window().maximize();
	  driver.get("https://en.wordpress.com/wp-login.php?redirect_to=https%3A%2F%2Fwordpress.com%2F");
  }
  
  @Test	
  public void verifyValidLogin()
  { 
	  LoginPage login = new LoginPage(driver);
	  login.typeUserName();
	  login.typePassword();
	  login.clickOnLoginButton();
  }
  
  @Test
  public void verifyValidLogout()
  {
	  LogoutPage logout = new LogoutPage(driver);
	  logout.ClickOnProfileButton();
	  logout.ClickOnSignOutButton();
  }
  
  @AfterTest
  public void BrowserTerminate()
  {
	driver.close();  
  }
}
