package dataProvider;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.Base;

public class DataProvider_Class extends Base {
	/*
	 * @Test(dataProvider = "passData")//we don't need any more we can remove @Test
	 * from line 9 to 11 public void receiveData(String id, String passWord) {
	 * System.out.println("Received Data " + id + "--" + passWord); }
	 */

	@DataProvider(name = "allData")
	public Object[][] passData(Method m) {// here Method is default parameter in playwright & m is variable

		Object[][] data = null;// here we declare object as a globally make sure that value should null
		if (m.getName().equals("test_Employee_Login")) {
			data = new Object[1][2];
			data[0][0] = "testpilot@gmail.com";
			data[0][1] = "1234";

		} else if (m.getName().equals("customer_Login")) {
			data = new Object[1][2];
			data[0][0] = "david@gmail.com";
			data[0][1] = "1234";
		}
		return data;

	}

}
