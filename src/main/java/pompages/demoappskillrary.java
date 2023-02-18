package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericlibraries.WebDriverUtility;

public class demoappskillrary {
	
	@FindBy(xpath="//div[@class='navbar-header']")
	private WebElement pageheader;
	@FindBy(id="course")
	private WebElement courseTAB;
	@FindBy(xpath="(//a[text()='Selenium Training'])[1]")
	private WebElement seleniumtraininglink;
	@FindBy(name="addresstype")
	private WebElement categoryDropDown;
	@FindBy(xpath="//a[text()='Contact Us']")
	private WebElement contactuslink;
	
	//initialization
	public demoappskillrary(WebDriver driver) {
		PageFactory.initElements(driver,this );
	}
	//utilization
	
	public WebElement getPageHeader() {
		return pageheader;
	}
	public void mouseHoverToCourse(WebDriverUtility web) {
		web.mousehover(courseTAB);
	}
	public void clickseleniumtraining() {
		seleniumtraininglink.click();
	}
	public void selectcategory(WebDriverUtility web, int index) {
		web.dropdown(categoryDropDown, index );
	}
	public void clickcontactus(){
		contactuslink.click();
	}

	public WebElement getcontactus() {
		// TODO Auto-generated method stub
		return null;
	}

	
	}
		
	
	
	
	


