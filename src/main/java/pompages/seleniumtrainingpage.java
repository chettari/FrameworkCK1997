package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericlibraries.WebDriverUtility;

public class seleniumtrainingpage {
	
	//Declaration
	@FindBy(xpath="//h1[@class='page-header']")
	private WebElement seleniumtraining;
	@FindBy(id="add")
	private WebElement addbutton;
	@FindBy(xpath="//button[text()=' Add to Cart']")
	private WebElement addtocartbutton;
	@FindBy(xpath="//div[@id='callout']/span")
	private WebElement itemaddedtocart;
	
	//initialization
	public seleniumtrainingpage(WebDriver driver) {
		PageFactory.initElements(driver,this );
	}
	//utilization
	public WebElement getPageHeader() {
		return seleniumtraining;
	}
	public void doubleClickplusButton(WebDriverUtility web) {
	web.doubleclickonelement(addbutton);
}
	public void clickadtocart() {
		addtocartbutton.click();
	}
	public WebElement getitemaddedmessage() {
		return itemaddedtocart;

	}
	

}
