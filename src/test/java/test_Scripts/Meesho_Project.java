package test_Scripts;

import java.io.IOException;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import generic.Base_Test;
import generic.ReadExcel;
import pom_scripts.Profile;

public class Meesho_Project extends Base_Test {
	@Test(dataProvider="testData")
	public void test(String[]testData)throws InterruptedException{
		Profile P1 =new Profile(driver);
		P1.click_Profile();
		P1.Click_Signup();
		P1.EnterValueInTel(testData[0]);
		P1.SendOTP();
		Thread.sleep(3000);
		P1.Click_Profile1();
		Thread.sleep(3000);
		P1.Click_MyOrders();
		Thread.sleep(3000);
		P1.Click_Profile2();
		Thread.sleep(3000);
		P1.Click_Logout();
		Thread.sleep(3000);
		
	}
	@DataProvider(name = "testData")
	public String[][] getTestData() throws IOException {
		String [][]testdata=ReadExcel.getMultipleData("Sheet1");
		return testdata;
	}
	

}
