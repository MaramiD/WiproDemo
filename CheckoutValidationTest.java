package Amazon;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import AmazonFramework.Utilities;
import AmazonFramework.base;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import pageObjects.CheckoutPage;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import resources.TestData;




public class CheckoutValidationTest extends base{
	LoginPage login=new LoginPage(driver);
    HomePage home=new HomePage(driver);
    CheckoutPage checkout= new CheckoutPage(driver);
    Utilities utility=new Utilities(driver);
	@Test(dataProvider="data", dataProviderClass=TestData.class)
	public void totalValidation(String mob,String pwd,String searchData) throws IOException, InterruptedException
	{    
		 SoftAssert sa = new SoftAssert();
		 service=startServer();
		 AndroidDriver<AndroidElement> driver=capabilities("AmazonApp");
	     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);		     
	     login.loginToApp(mob, pwd);
	     home.searchTv(searchData);
		 String actual=home.getProductInfo();
		 home.clickProduct();
		 String name=checkout.getProductName();
		 String description =checkout.getProductDescription();
		 String price= checkout.getProductPrice();
		 sa.assertTrue(utility.checkTextConatins(actual, name));
		 sa.assertTrue(utility.checkTextConatins(actual, description));
		 sa.assertTrue(utility.checkTextConatins(actual, price));
		 sa.assertAll();
		 service.stop();
	}
	
	
}
