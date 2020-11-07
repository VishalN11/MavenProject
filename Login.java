package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import driver.Driver;

public class Login 
{
	public static WebElement usernameTextBox()
	{
		return Driver.driver.findElement(By.xpath("//input[@id='identifierId']"));
	}
	
	public static WebElement NextBtn()
	{
		return Driver.driver.findElement(By.xpath("//div[@id='identifierNext']"));
	}
	
	public static WebElement passwordTextBox()
	{
		return Driver.driver.findElement(By.xpath("//input[@name='password']"));
	}
	
	public static WebElement passwordNextBtn()
	{
		return Driver.driver.findElement(By.xpath("//div[@id='passwordNext']"));
	}
	
	public static WebElement profileicon()
	{
		return Driver.driver.findElement(By.xpath("//a[contains(@aria-label,'Google Account: Ishwari Nimbalkar')]"));
	}
	
	public static WebElement signout()
	{
		return Driver.driver.findElement(By.xpath("//a[text()='Sign out']"));
	}
	
	

}
