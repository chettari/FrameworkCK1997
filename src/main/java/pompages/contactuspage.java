package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class contactuspage {
	
	//Declaration
	
	@FindBy(xpath="//img[contains(@src,'contactus')]")
	private WebElement PageHeader;
	@FindBy(name="name")
	private WebElement fullNameTF;
	@FindBy(name="sender")
	private WebElement emailTF;
	@FindBy(name="subject")
	private WebElement subjectTF;
	@FindBy(name="message")
	private WebElement messageTextArea;
	@FindBy(xpath="//button[text()='Send us mail']")
	private WebElement sendUsEmailButton;
	
	//initialization
	
	public contactuspage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	//utilization
	
	public WebElement getPageHeader() {
		return PageHeader;
	}
	public void submitDetails(String name, String email, String subject, String message) {
		fullNameTF.sendKeys(name);
		emailTF.sendKeys(email);
		subjectTF.sendKeys(subject);
		messageTextArea.sendKeys(message);
		sendUsEmailButton.click();

		}

}
