package amazon.com.qa.stepDefinitions;
/***************************************************************************

*                                                                          *

*             Page details:  This is step definition file for log in page  *
                             
*             Author:        Venukrishnan VR                               *

*                                                                          *

*                                                                          *

***************************************************************************/
import org.junit.Assert;

import amazon.com.qa.base.TestBase;
import amazon.com.qa.pages.ProductDetailPage;
import amazon.com.qa.pages.ShoppingCart;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class productDetailPage extends TestBase{
	
	public ProductDetailPage pdp;
	public ShoppingCart sc;
	public static String productTitle;
	public static double unitProdPrice;
	public static int product_qty;
	
	@Then("^User choose product quantity$")
	public void User_choose_product_quantity() {
		pdp=new ProductDetailPage();
		unitProdPrice=pdp.getProductUnitPrice();
		product_qty=pdp.selectProductQuantity(8);
		productTitle=pdp.getProductDescription();
		System.out.println(productTitle);
		
	}
	
	@And("^Add to basket$")
	public void Add_to_basket() {
		pdp.addtobasket();
		Assert.assertTrue(pdp.verifyProductAdded());
	}
	
	@Then("^Proceed to basket$")
	public void proceed_to_basket() {
		pdp.proccedtoCart();
		sc=new ShoppingCart();
		Assert.assertTrue(sc.verifyshoppingCartPage());
	}
}
