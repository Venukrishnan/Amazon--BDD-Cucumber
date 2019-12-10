package amazon.com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import amazon.com.qa.base.TestBase;

public class ProductListingPage extends TestBase{
	
	@FindBy(xpath="//*[@id=\"search\"]/span[2]/h1/div/div[1]/div/div")
	WebElement searchResult;
	
	public ProductListingPage() {
		
		PageFactory.initElements(driver,this);
	}
	
	public boolean verifyPLP(){
		return searchResult.isDisplayed();				
	}
	
	public void selectProduct(String index) {
		String xpath="//img[@data-image-index='"+index+"']";
		
		WebElement productlink=driver.findElement(By.xpath(xpath));
		productlink.click();
		
	}

}
