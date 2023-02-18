package testscripts;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import genericlibraries.BaseClass;

public class FirstTest extends BaseClass {
	
	
	@Test
	public void firstTest() {
		SoftAssert soft = new SoftAssert();
		
		
		home.clickGears();
		home.ClickskillrarydemoApp();
		web.handleChildBrowser();
		
		soft.assertTrue(skillrarydemo.getPageHeader().isDisplayed());
		skillrarydemo.mouseHoverToCourse(web);
		skillrarydemo.clickseleniumtraining();
		
		soft.assertEquals(selenium.getPageHeader(),"Selenium Training");
	    selenium.doubleClickplusButton(web);
	    selenium.clickadtocart();
	    web.handleAlert();
	    web.explicitWait(time, selenium.getitemaddedmessage());
	    web.takescreenShot();
	    soft.assertTrue(selenium.getitemaddedmessage().isDisplayed());
	    
	    soft.assertAll();
			
	}
	

}
