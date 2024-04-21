package dataProvider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {
	@Test(dataProvider="baly")
	public void plumRecivedByHasina(String Type,String Containing){
		System.out.println("recived plum from Baly"+Type+" "+  Containing);
	}
	@DataProvider
	public Object[]	[] baly(){
		Object[][]data =new Object [3][2];
		
		data [0][0] ="TypeGreen";
		data [0][1] ="ContaningSour";
		data [1][0] ="TypeYellow";
		data [1][1] ="ContaningSweet";
		data [2][0] ="TypeRed";
		data [2][1] ="ContaningMildSweet";
		
		return data;
		
	}
	

}
