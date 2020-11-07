package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import driver.Driver;

public class Sendemail
{
	public static WebElement ComposeBtn()
	{
		return Driver.driver.findElement(By.xpath("//div[text()='Compose']"));
	}
	
	public static WebElement ToemailTxt()
	{
		return Driver.driver.findElement(By.xpath("//textarea[contains(@aria-label,'To')]"));
	}
	
	public static WebElement SubjectTxt()
	{
		return Driver.driver.findElement(By.xpath("//input[contains(@aria-label,'Subject')]"));
	}
	
	public static WebElement SendBtn()
	{
		return Driver.driver.findElement(By.xpath("//div[text()='Send']"));
	}
	

}
