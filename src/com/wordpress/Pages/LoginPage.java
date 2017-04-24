/**
 * 
 */
package com.wordpress.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * @author Akram
 * 
 * This class will store all locators and methods of login page
 *
 */
public class LoginPage 
{
   WebDriver driver;
	
   By username = By.id("user_login");
   By password = By.xpath(".//*[@id='user_pass']");
   By loginButton = By.name("wp-submit");
   
   public LoginPage(WebDriver driver)
   {
   	this.driver = driver;
   }

   public void typeUserName()
   {
	   driver.findElement(username).sendKeys("akramewu");
   }
   
   public void typePassword()
   {
	   driver.findElement(password).sendKeys("Proxi123$");
   }
   
   public void clickOnLoginButton ()
   {
	   driver.findElement(loginButton).click();
   }
}


