package test_Annotaion_Priority;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class Test_Annotaion_Priority_DependsOnMethodsMutiplePriroty_SkipTest {
	//By Default Test executes in Dictionary order
	// The second consideration -if priority is set then 
	// Non priority super sit all
	// without priority test will execute then priority will come in consideration Test execute
	//
	@Test(priority= 1, dependsOnMethods="login")//dependsOnMethods always run first
	//but if it is fail then method W cann't pass due to  W depends on b
	public void order() {
		System.out.println("a");
		Assert.assertEquals(false,true);
	}
	@Test(priority= 2)
	public void login() {
		System.out.println("b");
		Assert.assertEquals(true,true);
	}
	@Test(priority= 3,dependsOnMethods="order")

	public void report() {
		System.out.println("c");
		//if (false)
	throw new SkipException("skipping the test");
	}
}
