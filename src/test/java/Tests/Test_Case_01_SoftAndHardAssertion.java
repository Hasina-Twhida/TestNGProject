package Tests;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Test_Case_01_SoftAndHardAssertion{
	@BeforeSuite
	public void beforeSuite() {
	System.out.println("Before Suite Run");
	}
	@BeforeClass
	public void beforeClass() {
	System.out.println("  Before Class Run");
	}
	
	@BeforeMethod
	public void beforeMethod() {
	System.out.println("    Before Method Run");
	}
	@Test
	public void test_Case_01() {
	System.out.println("      Test test_Case_01()");
	System.out.println("      First assertion ");
	SoftAssert sa = new SoftAssert();
	sa.assertEquals("xyz", "xyz1");
	System.out.println("      Second assertion ");
	Assert.assertEquals("abc", "abc");//Assert.assertEquals is Hard Assertion & it will block next assertion or state00ment 
	//Hard Assertion fail then it will not run next Statement 
	System.out.println("      Test ");
	
    sa.assertAll();
		
	}
	@AfterMethod
	public void afterMethod() {
	System.out.println("    After Method Run");
	}
	@AfterClass
	public void afterClass() {
	System.out.println("  After Class Run");
	}
	
	@Test
	public void test_Case_02() {
		System.out.println("      Test test_Case_02()");
}
	@AfterSuite
	public void afterSuite() {
	System.out.println("after Suite Run");
	}
}