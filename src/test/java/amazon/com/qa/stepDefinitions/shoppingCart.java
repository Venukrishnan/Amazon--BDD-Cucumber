/***************************************************************************

*                                                                          *

*             Page details:  This is the step definition file for shopping *
                             cart page
*             Author:        Venukrishnan VR                               *

*                                                                          *

*                                                                          *

***************************************************************************/
package amazon.com.qa.stepDefinitions;

import org.junit.Assert;

import amazon.com.qa.base.TestBase;
import amazon.com.qa.pages.ShoppingCart;
import cucumber.api.java.en.And;

public class shoppingCart extends TestBase{
	
	public ShoppingCart sc;
	
	@And("^Verify product details$")
	public void Verify_product_details() {
		sc=new ShoppingCart();
		Assert.assertTrue(sc.getProductTitle(productDetailPage.productTitle));
		double val=productDetailPage.unitProdPrice*productDetailPage.product_qty;
		System.out.println("Total price "+val);
		Assert.assertTrue(sc.verifyTotalPrice(val));
	}

}
