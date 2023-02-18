package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class corejavaforselenium {
	
	//Declaration
	
	@FindBy(xpath="//h2[@class='list_title']")
	private WebElement pageheader;
	@FindBy(xpath="/a[text()=' Core Java For Selenium Trainin']")
	private WebElement corejavaforselenium;
	
	//Initialaization
	public corejavaforselenium(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	//utilization
	public String getpageheader() {
		return pageheader.getText();
		
	}
	public void corejavaforseleniumlink() {
		getCorejavaforselenium().click();
	}

	public WebElement getCorejavaforselenium() {
		return corejavaforselenium;
	}

	public void setCorejavaforselenium(WebElement corejavaforselenium) {
		this.corejavaforselenium = corejavaforselenium;
	}
	

}
