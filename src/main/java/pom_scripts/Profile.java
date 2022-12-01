package pom_scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Profile extends BasePage{
	public Profile(WebDriver driver)
	{
		super(driver);
	}
	@FindBy(xpath="//span[text()='Profile']")
	WebElement Profile;
	public void click_Profile()
	{
		clickAction(Profile);
	}
	
	
	@FindBy(xpath="//span[text()='Sign Up']")
	WebElement Signup;
	public void Click_Signup() {
		clickAction(Signup);
	}
	
	
	@FindBy(xpath="//input[@type='tel']")
	WebElement Tel;
	public void EnterValueInTel(String TelNo) {
		enter_value(Tel,TelNo);
	}
	@FindBy(xpath="//span[contains(@class,'sc-gsDJrp ePNcaI')]")
	WebElement SendOTP ;
	public void SendOTP() {
		clickAction(SendOTP);
	}
	@FindBy(xpath="//span[text()='Profile']")
	WebElement Profile1 ;
	public void Click_Profile1() {
		clickAction(Profile1);
	}
	@FindBy(xpath="//span[text()='My Orders']")
	WebElement MyOrders ;
	public void Click_MyOrders() {
		clickAction(MyOrders);
	}
	@FindBy(xpath="//span[text()='Profile']")
	WebElement Profile2;
	public void Click_Profile2() {
		clickAction(Profile2);
	}
	@FindBy(xpath="//span[text()='Logout']")
	WebElement Logout;
	public void Click_Logout() {
		clickAction(Logout);
	}
	
	
	
}
	


