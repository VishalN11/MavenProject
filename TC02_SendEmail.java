package tests;

import Common.common;

public class TC02_SendEmail
{
   public void sendemail() throws InterruptedException
   {
	
	String TO;
    String Subject;
    TO=common.readJson("C:\\Users\\Pratiksha Ingle\\eclipse-workspace\\DataDriven\\src\\data\\TC03_Sendemail","Toemail");
	Subject=common.readJson("C:\\Users\\Pratiksha Ingle\\eclipse-workspace\\DataDriven\\src\\data\\TC03_Sendemail","Subject");
	common.sendmail(TO,Subject);
   }
}
