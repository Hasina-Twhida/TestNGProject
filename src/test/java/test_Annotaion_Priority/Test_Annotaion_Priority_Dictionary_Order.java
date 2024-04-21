package test_Annotaion_Priority;

import org.testng.annotations.Test;

public class Test_Annotaion_Priority_Dictionary_Order {
	//By Default Test executes in Dictionary order
	// The second consideration -if priority is set then 
	// Non priority super sit all
	// without priority test will execute then priority will come in consideration Test execute
	
	@Test(priority= 1)
	public void w() {
		System.out.println("w");
	}
	@Test(priority= 2)
	public void a() {
		System.out.println("a");
	}
	@Test(priority= 3)
	//@Test(priority= -3)
	public void b() {
		System.out.println("b");
	}
}
