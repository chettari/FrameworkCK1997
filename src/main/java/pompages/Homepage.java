package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
	
	//Declaration 
	@FindBy (xpath = "//img[@alt='SkillRary']" )
	private WebElement logo;
	@FindBy (name = "q")
	private WebElement search_TF;
	@FindBy (xpath = "//input[@type='submit']")
	private WebElement Search_button;
	@FindBy (linkText = " GEARS ")
	private WebElement Gears_TAB;
	@FindBy (xpath = "(//a[text()=' SkillRary Demo APP'])[2]")
	private WebElement demoAppLink;
	
	public Homepage(WebDriver driver) {
		PageFactory.initElements(driver,this );
	}
	//intialization
	public WebElement getLogo() {
		return logo;
	}
	public void searchFor(String data) {
		search_TF.sendKeys(data);
		Search_button.click();
	}
	public void clickGears() {
		Gears_TAB.click();
	}
	public void ClickskillrarydemoApp() {
		demoAppLink.click();
		
	}
	
	
	

}
