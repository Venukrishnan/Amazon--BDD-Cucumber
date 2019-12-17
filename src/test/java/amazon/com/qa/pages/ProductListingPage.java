package amazon.com.qa.pages;

import java.util.List;

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
		
		List<WebElement> productlink=driver.findElements(By.xpath(xpath));
		
		int k=productlink.size();
		System.out.println("Elements count: "+k);
		if (k==1) {
			productlink.get(k-1).click();
		}else {
			driver.findElement(By.xpath("//img[@data-image-index='2']"));
		}

		
	}

}
