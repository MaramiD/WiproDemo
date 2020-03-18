package pageObjects;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class HomePage {
	public HomePage(AndroidDriver<AndroidElement> driver)
	{
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@AndroidFindBy(id="in.amazon.mShop.android.shopping:id/search_edit_text")
	private WebElement search_Input;
	@AndroidFindBy(className="android.view.View")
	private List<WebElement >results_Option;
	
	
	
public void searchTv(String searchData) {
	search_Input.sendKeys(searchData);
	search_Input.sendKeys(Keys.ENTER);
}
	public String getProductInfo() {
		String info= results_Option.get(1).getAttribute("content-desc");
		return info;
	}
	public void clickProduct() {
		results_Option.get(1).click();
	}
	
	
	
}
