package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class videopage {
	
	//Declaration
	
	@FindBy(xpath="//h1[text()='Core Java For Selenium Training']")
	private WebElement pageheader;
	@FindBy(xpath="//button[@aria-label='Play']")
	private WebElement playbutton;
	@FindBy(xpath="//button[@aria-label='Pause']")
	private WebElement pausebutton;
	@FindBy(xpath="//span[text()='Add To Wishlist']")
	private WebElement addtowishlist;
	@FindBy(xpath="//a[@class='close_cookies']")
	private WebElement closecookiesicon;
	
	//initialization
	
	public videopage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	//utilization
	
	public String getpageheader() {
		return pageheader.getText();
			
	}
	public void playbutton() {
		playbutton.click();
		
		
	}
	public void clickpausebutton() {
		pausebutton.click();
	}
	public void clickclosecookies() {
		closecookiesicon.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	public void clickaddtowishlist() {
		addtowishlist.click();
	}

	public void clickplaybutton() {
		// TODO Auto-generated method stub
		
	}
	

}
