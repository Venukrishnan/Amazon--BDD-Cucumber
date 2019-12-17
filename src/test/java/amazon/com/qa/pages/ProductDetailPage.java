/***************************************************************************

*                                                                          *

*             Page details:  This is the page file for Product detail page *
                             Contains object and associated actions
*             Author:        Venukrishnan VR                               *

*                                                                          *

*                                                                          *

***************************************************************************/
package amazon.com.qa.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import amazon.com.qa.base.TestBase;

public class ProductDetailPage extends TestBase {
	
	@FindBy(id="add-to-cart-button")
	WebElement button_add_to_cart;
	
	@FindBy(xpath="//*[@id='productTitle']")
	WebElement label_producttitle;
	
	@FindBy(xpath="//span[@class='a-dropdown-label']")
	WebElement dd_qty;
	
	@FindBy(xpath="//h1[contains(text(),'Added to Cart')]")
	WebElement label_scuccessmsg;
	
	@FindBy(xpath="//*[@id='hlb-view-cart-announce' or @aria-labelledby='attach-sidesheet-view-cart-button-announce']")
	WebElement btn_cart;
	
	@FindBy(xpath="//SPAN[contains(@id,'priceblock_ourprice')]")
	WebElement label_unitPrice;
	
	
	
	
	public ProductDetailPage(){
		PageFactory.initElements(driver,this);
	}
	
	public boolean verifyPDPPage() {
		return button_add_to_cart.isDisplayed();
	}
	
	public String getProductDescription() {
		String title= label_producttitle.getText();
		return title;
		
	}
	
	public double getProductUnitPrice() {
		
		double prodprice=0.00;
		String price;
		String xpath;
		
		try{
			price=label_unitPrice.getText();
		}
		catch(Exception e) {
			xpath="//SPAN[contains(@id,'priceblock_saleprice')]";
			WebElement label_unitPrice_2=driver.findElement(By.xpath(xpath));
			price=label_unitPrice_2.getText();
		}
		
		System.out.println("Price "+price);
		int len=price.length();
		System.out.println("len "+len);
		String price_1=price.substring(1, len);
		System.out.println("price_1 "+price);
		prodprice=Double.parseDouble(price_1);
		System.out.println("prodprice "+prodprice);
		return prodprice;
	}
	
	public int selectProductQuantity(int qty) {
		int qty_1=qty-1;
		int qty_selected;
		try {
			dd_qty.click();
		}catch(Exception e) {
			return 1;
		}
		String xpath="//*[@id='quantity_"+qty_1+"']";
		try {
		List<WebElement> quantity=driver.findElements(By.xpath(xpath));
		int k=quantity.size();
		if (k==1) {
			quantity.get(0).click();
			qty_selected=8;
		}else {
			driver.findElement(By.xpath("//*[@id='quantity_0']")).click();
			qty_selected=1;
		}	
		
		return qty_selected;
		}
		catch(Exception e) {
			return 1;
		}
		
	}
	
	public void addtobasket() {
		button_add_to_cart.click();
		
	}
	public boolean verifyProductAdded() {
		
		boolean status=false;
		try {
			label_scuccessmsg.click();
			status= label_scuccessmsg.isDisplayed();
		}catch(Exception e) {
			System.out.println("Entered Catch block");
			WebElement labael_successmsg_2=driver.findElement(By.xpath("//*[@id='attachDisplayAddBaseAlert']/div/h4"));
			//status= labael_successmsg_2.isDisplayed();
			String k=labael_successmsg_2.getText();
			System.out.println("Text "+k);
			if (k.equalsIgnoreCase("Added to Cart")) {
				status=true;
			}
		}
		
		
		return status;
	}
	public void proccedtoCart(){
		
		btn_cart.click();
	}

}
