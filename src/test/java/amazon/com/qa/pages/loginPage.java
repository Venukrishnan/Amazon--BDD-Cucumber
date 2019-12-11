/***************************************************************************

*                                                                          *

*             Page details:  This is the page file for login page          *
                             Contains object and associated actions
*             Author:        Venukrishnan VR                               *

*                                                                          *

*                                                                          *

***************************************************************************/
package amazon.com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import amazon.com.qa.base.TestBase;

public class loginPage extends TestBase{

	public homePage obj_homePage=new homePage();
	// Page Factory - OR
	
	@FindBy(xpath="//span[@id='a-autoid-0']/span[@class='a-button-inner']")
	WebElement link_signIn;
	
	@FindBy(name="email")
	WebElement textbox_username;
	
	@FindBy(id="continue")
	WebElement button_continue;
	
	@FindBy(name="password")
	WebElement textbox_password;
	
	@FindBy(id="signInSubmit")
	WebElement button_login;
	
	@FindBy(xpath="//div[@id='nav-logo']/a[@class='nav-logo-link']")
	WebElement img_logo;
	
	// Initializing the page objects.
	public loginPage(){
		PageFactory.initElements(driver,this);
	}
	
	// Actions
	public boolean validateLogo(){
		return img_logo.isDisplayed();
	}
	
	public String selectsigninlink(){
		link_signIn.click();
		return driver.getTitle();
	}
	
	public void enterUserName(String un){
		textbox_username.sendKeys(un);
		button_continue.click();
	}
	
	public void enterPassword(String pw){
		textbox_password.sendKeys(pw);
		button_login.click();
	}
	
	public homePage verifyHomePage(){
		
		return obj_homePage;
	}
	
	
	
}
