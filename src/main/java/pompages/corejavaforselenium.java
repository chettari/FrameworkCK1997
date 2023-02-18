package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class corejavaforselenium {
	
	//Declaration
	
	@FindBy(xpath="//h2[@class='list_title']")
	private WebElement pageHeader;
	@FindBy(xpath="/a[text()=' Core Java For Selenium Trainin']")
	private WebElement coreJavaForSeleniumLink;
	
	//Initialaization
	public corejavaforselenium(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	//utilization
	public String getpageheader() {
		return pageHeader.getText();
		
	}
	public void clickcoreJavaForSeleniumLink() {
		coreJavaForSeleniumLink.click();
	}

	

}
