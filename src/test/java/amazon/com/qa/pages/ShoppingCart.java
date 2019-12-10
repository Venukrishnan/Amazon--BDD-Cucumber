package amazon.com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import amazon.com.qa.base.TestBase;

public class ShoppingCart extends TestBase{
	
	@FindBy(xpath="//*[@id='sc-buy-box-ptc-button']/span/input")
	WebElement btn_prochkout;
	
	
	public ShoppingCart(){
		PageFactory.initElements(driver,this);
	}
	
	public boolean verifyshoppingCartPage() {
		
		return btn_prochkout.isDisplayed();
	}

	public boolean getProductTitle(String title) {
		
		WebElement prodTitle=driver.findElement(By.xpath("//SPAN[contains(text(),'"+title+"')]"));
		return prodTitle.isDisplayed();
	}
	
	public void verifyTotalPrice()
	{
		
	}
}
