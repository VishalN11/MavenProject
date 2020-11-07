package tests;
import Common.common;

public class TC03_Deletemail 
{

	public void DelMail() throws InterruptedException
	{
		
		String subject;
		subject=common.readJson("C:\\Users\\Pratiksha Ingle\\eclipse-workspace\\DataDriven\\src\\data\\TC03_Sendemail","Subject");
		common.deletemailsearch(subject);

		//common.Selectchkbox(0);
		//common.deletemail();
		
	}
}
