package Common;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.io.FileReader;
import java.util.List;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.junit.Assert;

import driver.Driver;
import pages.DeleteEmail;
import pages.Login;
import pages.Sendemail;

public class common

{
	static WebDriver driver;
	static WebElement element;

	
      public static String readJson(String filename,String Key)
      {
    	  
    	  String value=null;
    	  JSONParser parser=new JSONParser();
    	  String file=null;
    	  
    	  try 
    	  {
    		  file=filename;
    		  Object obj=parser.parse(new FileReader(file));
    		  JSONObject jsonObject = (JSONObject) obj;
    			 
	            value = (String) jsonObject.get(Key);
	 
	        } 
	        catch (Exception e)
	        {
	        	System.out.print("file not found" +file);
	            e.printStackTrace();
	        }
	        return value;
                 		  
    	  }

      public static void openBrowser(String browsername)
  	{
  		if(browsername.equals("Firefox"))
  		{
  			System.setProperty("webdriver.gecko.driver","C:\\Users\\Pratiksha Ingle\\eclipse-workspace\\SeleniumAutomation\\libs\\geckodriver.exe");
  			Driver.driver = new FirefoxDriver();
  		}
  	}
      public static void login(String username,String password) throws InterruptedException
  	{
    	  Thread.sleep(2000);
    	  Login.usernameTextBox().sendKeys(username);
    	  Login.NextBtn().click();
    	  Thread.sleep(2000);
    	  Login.passwordTextBox().sendKeys(password);
    	  Thread.sleep(2000);
    	  Login.passwordNextBtn().click();
    	  Thread.sleep(2000);
   
    	  
    
  		
  	}
      
      public static void logout() throws InterruptedException
      {
    	  Thread.sleep(2000);
    	  Login.profileicon().click();
    	  Login.signout().click();
    	  
      }
      
      public static void sendmail(String Toemail,String Subject) throws InterruptedException
      {
    	  Thread.sleep(6000);
    	  Sendemail.ComposeBtn().click();
    	  //WebElement waitID = (new WebDriverWait(Driver.driver,6000).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//textarea[contains(@aria-label,'To')]"))));
    	  Thread.sleep(9000);
    	  Sendemail.ToemailTxt().sendKeys(Toemail);
    	  Thread.sleep(6000);
    	  Sendemail.SubjectTxt().sendKeys(Subject);
    	  Sendemail.SendBtn().click();
    	      	  
      }
     
  	
      public static void deletemailsearch(String subject) throws InterruptedException
      {
    	  
    	  
    	  //Thread.sleep(60000);
    	  WebElement waitID = (new WebDriverWait(Driver.driver,80000).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@aria-label='Search mail' and @name='q']"))));
    	  DeleteEmail.Searchbox().sendKeys(subject);
    	  Thread.sleep(6000);    
    	  DeleteEmail.Searchbtn().click();
    	  Thread.sleep(50000);  	 
    	  common.Selectchkbox(2);
    	  //Thread.sleep(60000); 
    	  WebElement waitdel = (new WebDriverWait(Driver.driver,80000).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[2]/div[1]/div/div/div[2]/div[3]/div"))));
    	  DeleteEmail.deletebtn().click();
    	  
    	  /*
    	   Wait for specific element //poll after 500 ms
	       WebElement waitID = (new WebDriverWait(driver,10))
	    		   .until(ExpectedConditions.presenceOfElementLocated(By.name("q1")));
    	   */
    	   	  
    	     	  
      }
      public static void Selectchkbox(int number)
    	{
    	    List<WebElement> chk= Driver.driver.findElements(By.xpath("//div[@role='checkbox']"));
    		chk.get(number).click();
    			
    	}
      
      /*public static void deletemail() throws InterruptedException
      {
    	  Thread.sleep(3000);
    	  common.Selectchkbox(0);
    	  //DeleteEmail.deletebtn().click();
      }*/
      
}
    	  
    	  
      

