package dataProvider;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.Base;

public class EMP_LogingPage extends Base {
	@Test(dataProviderClass = DataProvider_Class.class, dataProvider = "allData")
	public static void test_Employee_Login(String id, String passWord) {

		navigate("https://it.microtechlimited.com");

		click("//a[@href='elogin.php']");

		fill("//input[@name='mailuid']", id);

		fill("//input[@name='pwd']", passWord);

		click("//input[@name='login-submit']");

		// Assertion EMP Id
		String employeeId = innerText("//h2[1]");
		Assert.assertEquals(employeeId, "Employee Id: 102");
		System.out.println(employeeId);

		// Assertion Welcome Test
		String welcomeTest = page.textContent("//h2[@style='text-align:center;']");
		Assert.assertEquals(welcomeTest, "Welcome Test ");
		System.out.println(welcomeTest);

	}

}