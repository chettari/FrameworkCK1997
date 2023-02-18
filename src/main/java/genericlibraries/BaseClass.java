package genericlibraries;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import pompages.Homepage;
import pompages.contactuspage;
import pompages.corejavaforselenium;
import pompages.demoappskillrary;
import pompages.seleniumtrainingpage;
import pompages.testingpage;
import pompages.videopage;

public class BaseClass {
	protected Propertiesfileutility property;
	protected Excelutility excel;
	protected WebDriverUtility web;
	protected WebDriver driver;
	protected Homepage home;
	protected demoappskillrary skillraryDemo;
	protected seleniumtrainingpage seleniumTraining;
	protected testingpage testing;
	protected corejavaforselenium coreJava;
	protected videopage javaVideo;
	protected contactuspage contact;
	protected long time;
	
	//@BeforeSuite
	//@BeforeTest
	@BeforeClass
	public void ClassConfiguration() {
		property = new Propertiesfileutility();
		excel = new Excelutility();
		web = new WebDriverUtility();
		
		property.propertyFileIntialization(Iconstantpath.PROPERTIES_FILE_PATH);
		excel.excelInitialization(Iconstantpath.EXCEL_FILE_PATH);
	}
	
	@BeforeMethod
	public void methodConfiguration() {
	    time = Long.parseLong(property.fetchProperty("timeouts"));
		driver = web.openApplication(property.fetchProperty("browser"),
				property.fetchProperty("Url"),time);
				
				home = new Homepage(driver);
				
				Assert.assertTrue(home.getLogo().isDisplayed());
				
				skillraryDemo = new demoappskillrary(driver);
				seleniumTraining = new seleniumtrainingpage(driver);
				coreJava = new corejavaforselenium(driver);
				javaVideo = new videopage(driver);
				testing = new testingpage(driver);
				contact = new contactuspage(driver);
	}
	@AfterMethod
	public void methodTearDown() {
		web.quitBrowser();
	}
	@AfterClass
	public void ClassTearDown() {
		excel.closeExcel();
	}
	//@AfterTest
	//@AfterSuite
	
				
				
		
		
		
	}
	
	


