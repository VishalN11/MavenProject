package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import java.util.List;

import driver.Driver;

public class DeleteEmail
{
	
	
	
	public static WebElement Searchbox()
	{
		return Driver.driver.findElement(By.xpath("//input[@aria-label='Search mail' and @name='q']"));
	}
	public static WebElement Searchbtn()
	{
		return Driver.driver.findElement(By.xpath("//button[@aria-label='Search mail']"));
	}
	
		
	public static WebElement deletebtn()
	{
			
		//return Driver.driver.findElement(By.xpath("//div[@aria-label='Delete']"));
		//return Driver.driver.findElement(By.xpath("//div[@data-tooltip='Delete']"));
		return Driver.driver.findElement(By.xpath("//div[2]/div[1]/div/div/div[2]/div[3]/div"));
		
		/*List<WebElement> trs = driver.findElements (By.xpath(""));--List Traversing

    for(WebElement tr:trs)
     {

              List<WebElement> tds = tr.findElements (By.tagname("td"));
                for(WebElement td:tds)
                 {
                       td.click();
                       break;
                 }
          break;*/

     }
		
		
	}	   
	
	


