package dataProvider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider_Test {
	
	
	@Test(dataProvider ="loginCredential")
	public void testLogingFunctions1(String login,String password) {
		System.out.println("LoginID:"+ login);
		System.out.println("Password:"+ password);
		System.out.println("Success");
		
	}
	@DataProvider
	public String [][] loginCredential() {
	String [][] loginData =new String[4][2];
	
	loginData[0][0]="id1";
	loginData[0][1]="Pass1";
	loginData[1][0]="id2";
	loginData[1][1]="Pass2";
	loginData[2][0]="id3";
	loginData[2][1]="Pass3";
	loginData[3][0]="id3";
	loginData[3][1]="Pass3";
	return loginData;
	}


	}
