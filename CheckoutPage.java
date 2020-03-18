package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class CheckoutPage {
	public CheckoutPage(AndroidDriver<AndroidElement> driver)
	{
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	
	
	@AndroidFindBy(id="bylineInfo")
	public WebElement name_Input;
	
	
	@AndroidFindBy(xpath="//android.view.View[@content-desc=\"Samsung 163 cm (65 Inches) 4K Ultra HD Smart QLED TV QA65Q60RAKXXL (Black) (2019 Model)")
	public WebElement Description_Input;
	
	
	@AndroidFindBy(xpath="//android.widget.EditText[@content-desc=\"rupees 1,69,990\"")
	public WebElement price_Input;
	
	public String getProductName() {
		String name=name_Input.getAttribute("content-desc");
		return name;
	}
	
	public String getProductDescription() {
		String desc=name_Input.getAttribute("content-desc");
		return desc;
	}
	public String getProductPrice() {
		String price=name_Input.getAttribute("content-desc");
		return price;
	}
}
