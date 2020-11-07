package tests;
import Common.common;
import pages.Login;


public class TC01_Login 
{

	public void Gmaillogin() throws InterruptedException
	{
		
		String Username;
		String Password;
		Username=common.readJson("C:\\Users\\Pratiksha Ingle\\eclipse-workspace\\DataDriven\\src\\data\\Login.json","username");
		Password=common.readJson("C:\\Users\\Pratiksha Ingle\\eclipse-workspace\\DataDriven\\src\\data\\Login.json","password");
		common.login(Username, Password);
		
		
	}
	
}
