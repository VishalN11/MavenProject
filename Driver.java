package driver;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Common.common;
//import tests.TC01_search;
import tests.TC01_Login;
import tests.TC02_SendEmail;
import tests.TC03_Deletemail;

public class Driver
{

	public static WebDriver driver;
	static String browser;
	static String loginUrl;
	static String Inbox;
	
	
	 
	@BeforeTest	 
	public static void openbrowser()
	{
		//open browser
		browser = common.readJson("C:\\Users\\Pratiksha Ingle\\eclipse-workspace\\DataDriven\\src\\Config\\config.json", "browser");
		common.openBrowser(browser);	
		driver.manage().window().maximize();
	}
	
	 @Test
	public static void login() throws InterruptedException
	{
		
		loginUrl=common.readJson("C:\\Users\\Pratiksha Ingle\\eclipse-workspace\\DataDriven\\src\\Config\\config.json", "loginUrl");
		System.out.print(loginUrl);
		driver.get(loginUrl);
		TC01_Login LG= new TC01_Login();
		LG.Gmaillogin();
		Inbox=common.readJson("C:\\Users\\Pratiksha Ingle\\eclipse-workspace\\DataDriven\\src\\Config\\config.json", "inbox");
		driver.get(Inbox);
	}
	@Test
	public static void sendmail() throws InterruptedException
	{
	
		TC02_SendEmail SM= new 	TC02_SendEmail();
		SM.sendemail();
	}
	@Test
	public static void deletemail() throws InterruptedException
	{
	
		TC03_Deletemail DM= new TC03_Deletemail();
		DM.DelMail();
	}
	
	
	

	}



