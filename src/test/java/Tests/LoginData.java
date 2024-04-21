package Tests;

import org.testng.annotations.DataProvider;

public class LoginData {
@DataProvider
	public String [][] loginCredential() {
	String [][] loginData =new String [3][2];
	
	loginData[0][0]="id1";
	loginData[0][1]="Pass1";
	loginData[1][0]="id1";
	loginData[1][1]="Pass1";
	loginData[2][0]="id1";
	loginData[2][1]="Pass1";
	return loginData;
	}

}
