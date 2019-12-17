package amazon.com.qa.pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import amazon.com.qa.base.TestBase;

public class homePage extends TestBase{
	
	
	
	@FindBy(xpath="//*[contains(text(),'Hello, ')]")
	WebElement label_user;

	@FindBy(xpath="//INPUT[contains(@id, 'twotabsearchtextbox')]")  //twotabsearchtextbox
	WebElement Txt_SearchBox;
	
	@FindBy(xpath="/HTML[1]/BODY[1]/DIV[1]/HEADER[1]/DIV[1]/DIV[1]/DIV[3]/DIV[1]/FORM[1]/DIV[2]/DIV[1]")
	WebElement btn_Search;
	
	
	
	public homePage(){
		PageFactory.initElements(driver,this);
	}
	
	public boolean verifyUserLable(){
		return label_user.isDisplayed();				
	}
	
	public void searchProduct(String pd){
		
		//Actions actions = new Actions(driver);
		//actions.moveToElement(Txt_SearchBox);
		//actions.click();
		//actions.sendKeys(pd);
		//actions.build().perform();
		Assert.assertTrue(Txt_SearchBox.isDisplayed());
		Txt_SearchBox.sendKeys(pd);
		btn_Search.click();
	}
	
	
}
