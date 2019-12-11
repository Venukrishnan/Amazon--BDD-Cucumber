/***************************************************************************

*                                                                          *

*             Page details:  This is the step definition file for home     *
                             page
*             Author:        Venukrishnan VR                               *

*                                                                          *

*                                                                          *

***************************************************************************/
package amazon.com.qa.stepDefinitions;

import java.net.MalformedURLException;
import java.net.URL;

import org.junit.After;
import org.junit.Assert;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.Platform;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import amazon.com.qa.base.TestBase;
import amazon.com.qa.pages.ProductListingPage;
import amazon.com.qa.pages.homePage;
import amazon.com.qa.pages.loginPage;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class homePageSteps extends TestBase{

	public loginPage lp;
	public homePage hp;
	public ProductListingPage plp;
	public static String webdriverLoc;
	public homePageSteps(){
		super();
	}
	
	@Before("@Chrome")
	public static void launchChrome() throws MalformedURLException{
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("enable-automation");
		options.addArguments("--headless");
		options.addArguments("--window-size=1920,1080");
		options.addArguments("--no-sandbox");
		options.addArguments("--disable-extensions");
		options.addArguments("--dns-prefetch-disable");
		options.addArguments("--disable-gpu");
		options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
		
		webdriverLoc=System.getProperty("user.dir")+"\\WebDrivers\\chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver", webdriverLoc);
		driver=new ChromeDriver();
		
		/*DesiredCapabilities cap = new DesiredCapabilities();
		cap.setBrowserName("chrome");
		cap.setPlatform(Platform.WINDOWS);
		
		ChromeOptions opt=new ChromeOptions();
		opt.merge(cap);
		
		
		String HubUrl="http://10.100.159.30:4444/wd/hub";
		
		driver=new RemoteWebDriver(new URL(HubUrl),opt);*/
	}
	
	@Before("@FF")
	public static void launchMozilla() throws MalformedURLException{
		
		webdriverLoc=System.getProperty("user.dir")+"\\WebDrivers\\geckodriver.exe";
		
		System.setProperty("webdriver.gecko.driver", webdriverLoc);
		driver=new FirefoxDriver();
		
		/*DesiredCapabilities cap = new DesiredCapabilities();
		cap.setBrowserName("firefox");
		cap.setPlatform(Platform.WINDOWS);
		
		
		FirefoxOptions opt=new FirefoxOptions();
		opt.merge(cap);
		
		
		String HubUrl="http://10.100.159.30:4444/wd/hub";
		
		driver=new RemoteWebDriver(new URL(HubUrl),opt);*/
		
		
	}
	
	@Before("@IE")
	public static void launchIE() throws MalformedURLException{
		
		webdriverLoc=System.getProperty("user.dir")+"\\WebDrivers\\IEDriverServer.exe";
		
		System.setProperty("webdriver.ie.driver", webdriverLoc);
		driver=new InternetExplorerDriver();
		
		/*DesiredCapabilities cap = new DesiredCapabilities();
		cap.setBrowserName("internet explorer");
		cap.setPlatform(Platform.WINDOWS);
		
		
		InternetExplorerOptions opt=new InternetExplorerOptions();
		opt.merge(cap);
		
		
		String HubUrl="http://10.100.159.30:4444/wd/hub";
		
		driver=new RemoteWebDriver(new URL(HubUrl),opt);*/
	}
	
		

	@Given("^User is on the Amazon home page$")
	public void user_is_on_the_Amazon_home_page()  {
		TestBase.initialization();
		 lp=new loginPage();
		boolean status=lp.validateLogo();
		Assert.assertTrue(status);
	}

	@When("^User search for a product$")
	public void user_search_for_a_product()  {
		hp=new homePage();
		hp.searchProduct(prop.getProperty("SearchProduct"));
	}

	@Then("^Product List page is displayed$")
	public void product_List_page_is_displayed()  {
		plp=new ProductListingPage();
		Assert.assertTrue(plp.verifyPLP());
	}
	
	@Then("^Close the browser$")
	public void Close_the_browser()  {
		driver.quit();
	}
	
	@After
	public void tearDown()
	{
		driver.quit();
	}
	
}
