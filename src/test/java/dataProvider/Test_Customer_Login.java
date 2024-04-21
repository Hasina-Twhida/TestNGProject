package dataProvider;

import org.testng.Assert;
import org.testng.annotations.Test;


import base.Base;

public class Test_Customer_Login extends Base {
	@Test(dataProviderClass = DataProvider_Class.class, dataProvider = "allData")
	
	public static void customer_Login(String id, String passWord) {
		System.out.println("     login customer");
	
	    navigate("https://it.microtechlimited.com");
		click("//a[@href='elogin.php']");
		click("//a[@href='clogin.php']");
		fill("//input[@name='mailuid']", id );
		fill("//input[@name='pwd']", passWord );
	    click("//input[@name='login-submit']");
		String actuelWelcomeMessage = page.locator("//h2[2]").innerText();
		//assertion("//*[@id='divimg']/div/h2[2]", "Welcome David");// here we use assertEqueals for TestNG.
		String expectedwelcomeMessage="Welcome David";
	    Assert.assertEquals(actuelWelcomeMessage,expectedwelcomeMessage );

	   // tearDown();
	    

	}

}
