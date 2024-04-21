package dataProvider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider_Test2 {
	
	
	@Test(dataProvider ="sender")// calling dataProvider here is starting letter lower case this is also rules here 
	public void receiver(String id,String password) {
		System.out.println("Recived data"+id+" "+password);
	
		
	}
	@DataProvider
	public Object [][] sender() {//Return type name should be Object[][]in playwright for DataProvider annotation
		///if it is String or int 
		//Here method name sender() can be any name  
	Object [][] data =new String[3][2];// here data is  variable obj 
	
	data[0][0]="test1";
	data[0][1]="Pass1";
	data[1][0]="test2";
	data[1][1]="Pass2";
	data[2][0]="test3";
	data[2][1]="Pass3";
	
	return data;// data is return type
	}


	}
