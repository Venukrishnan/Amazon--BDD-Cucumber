/***************************************************************************

*                                                                          *

*             Page details:  This is the base class where the              *
                             initialisation are happening
*             Author:        Venukrishnan VR                               *

*                                                                          *

*                                                                          *

***************************************************************************/

package amazon.com.qa.base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.Before;
import amazon.com.qa.util.TestUtil;
import amazon.com.qa.util.XLUtils;

public class TestBase {
	public static WebDriver driver;
	public static Properties prop;
	public static String ExcelFileLoc=System.getProperty("user.dir")+"/TestData/TestData.xlsx";
	public static String ExcelSheet="GeneralData";
	public static String url;
	public String searchItem;
	
	
	public TestBase() {
		try{
			prop=new Properties();
			FileInputStream fs=new FileInputStream(System.getProperty("user.dir")+"/src/test/java/amazon/com/qa/config/config.properties");
			prop.load(fs);
		}catch (IOException e){
			e.getMessage();
		}
		
		try {
			int rowCount=XLUtils.getRowCount(ExcelFileLoc, ExcelSheet);
			int columnCount=XLUtils.getCellCount(ExcelFileLoc, ExcelSheet, 1);
			url=XLUtils.getCellData(ExcelFileLoc, ExcelSheet, 1, 0);
			searchItem=XLUtils.getCellData(ExcelFileLoc, ExcelSheet, 1, 1);
			System.out.println("Search Item- "+searchItem);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	public static void initialization(){
			
		driver.manage().window().maximize();
		//driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		driver.get(url);
	}
	
	
}
