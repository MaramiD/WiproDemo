package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class LoginPage {
	public LoginPage(AndroidDriver<AndroidElement> driver)
	{
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	
	
	@AndroidFindBy(id="in.amazon.mShop.android.shopping:id/sign_in_button")
	private WebElement signIn_Button;	
	@AndroidFindBy(id="ap_email_login")
	private WebElement mobileNo_input;
	@AndroidFindBy(xpath="//android.widget.Button[@content-desc=\"Continue\"]")
	public WebElement continue_Button;
	@AndroidFindBy(id="ap_password")
	private WebElement password_input;
	@AndroidFindBy(id="signInSubmit")
	private WebElement login_Button;	
	
	public void loginToApp(String mob, String pwd) {
		signIn_Button.click();
		mobileNo_input.sendKeys(mob);
		continue_Button.click();
		password_input.sendKeys(pwd);
		login_Button.click();
	}
	
	
	
}
