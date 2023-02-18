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
	@FindBy (xpath = "//input[@value='go']")
	private WebElement Search_Button;
	@FindBy (xpath = "//a[text()=' GEARS '] ")
	private WebElement gearsTab;
	@FindBy (xpath = "//u1[@class='drop-menu gear_menu']/descendant::a[text()=' SkillRary Demo APP']")
	private WebElement demoAppLink;
	
	
	//Initialization
	public Homepage(WebDriver driver) {
		PageFactory.initElements(driver,this );
	}
	//utilization
	public WebElement getLogo() {
		return logo;
	}
	public void searchFor(String data) {
		search_TF.sendKeys(data);
		Search_Button.click();
	}
	public void clickGears() {
		gearsTab.click();
	}
	public void clickSkillraryDemoApp() {
		demoAppLink.click();
		
	}
	
	
	

}
