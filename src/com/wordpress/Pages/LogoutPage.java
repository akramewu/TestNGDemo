/**
 * 
 */
package com.wordpress.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * @author Akram
 *
 */
public class LogoutPage 
{
	WebDriver driver;
	
	By profileButton = By.className("gravatar"
			+ "");
	By signOutButton = By.xpath(".//*[@id='secondary']/ul/div[2]/button");
	
	public LogoutPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void ClickOnProfileButton()
	{
		driver.findElement(profileButton).click();
	}
	
	public void ClickOnSignOutButton()
	{
		driver.findElement(signOutButton).click();
	}

}
