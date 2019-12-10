package amazon.com.qa.stepDefinitions;

import org.junit.Assert;

import amazon.com.qa.base.TestBase;
import amazon.com.qa.pages.ProductDetailPage;
import amazon.com.qa.pages.ProductListingPage;
import cucumber.api.java.en.And;

public class productListingPage extends TestBase{
	
	public ProductListingPage plp;
	public ProductDetailPage pdp;
	
	@And("^Select product from PLP$")
	public void Select_product_from_PLP() {
		
		plp=new ProductListingPage();
		plp.selectProduct("5");
		
		pdp=new ProductDetailPage();
		Assert.assertTrue(pdp.verifyPDPPage());
		
	}

}
