package amazon.com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
/***************************************************************************

*                                                                          *

*             Page details:  This is the page file for Shopping cart page  *
                             Contains object and associated actions
*             Author:        Venukrishnan VR                               *

*                                                                          *

*                                                                          *

***************************************************************************/
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
	
	public boolean verifyTotalPrice(double totalPrice)
	{
		String str_totalPrice="$"+totalPrice;
		
		if (totalPrice > 999.99 ) {
			StringBuffer str_totalPrice_1=new StringBuffer(str_totalPrice);
			str_totalPrice_1.insert(2, ",");
			str_totalPrice=str_totalPrice_1.toString();
		}
		System.out.println(str_totalPrice);
		WebElement subTotal=driver.findElement(By.xpath("//SPAN[contains(text(),'"+str_totalPrice+"')]"));
		return subTotal.isDisplayed();
	}
}
