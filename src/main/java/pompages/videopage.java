package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class videopage {
	
	//Declaration
	
	@FindBy(xpath="//h1[text()='Core Java For Selenium Training']")
	private WebElement pageHeader;
	@FindBy(xpath="//button[@aria-label='Play']")
	private WebElement playButton;
	@FindBy(xpath="//button[@aria-label='Pause']")
	private WebElement pauseButton;
	@FindBy(xpath="//span[text()='Add To Wishlist']")
	private WebElement addToWishlistTab;
	@FindBy(xpath="//a[@class='close_cookies']")
	private WebElement closeCookiesIcon;
	
	//initialization
	
	public videopage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	//utilization
	
	public String getpageheader() {
		return pageHeader.getText();
			
	}
	public void clickplaybutton() {
		playButton.click();
		
		
	}
	public void clickpausebutton() {
		pauseButton.click();
	}

	public void clickAddToWishlist() {
		addToWishlistTab.click();
	}
	public void clickCloseCookies() {
		closeCookiesIcon.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
