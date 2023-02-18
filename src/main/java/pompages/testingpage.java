package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class testingpage {
	
	//Declaration
	@FindBy(xpath="//h1[@class='page-header']")
	private WebElement pageheader;
	@FindBy(id="Selenium Training")
	private WebElement seleniumimage;
	@FindBy(id="cartArea")
	private WebElement cartarea;
	@FindBy(xpath="//footer[@class='main-footer']/descendant::i[@class='fa fa-facebook']")
	private WebElement facebookicon;
	
	//initialization
	public testingpage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	//utilization
	public String  getpageheader() {
		return pageheader.getText();
	}
	public WebElement getSeleniumimage() {
		return seleniumimage;
	}
	public WebElement getcarrtarea() {
		return cartarea;
	}
	public WebElement getfacebookicon() {
		return facebookicon;
	}
	public WebElement clickfacebookicon() {
		facebookicon.click();
		return cartarea;
		
	}
	
	
	}
	


