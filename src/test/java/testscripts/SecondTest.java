package testscripts;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import genericlibraries.BaseClass;

public class SecondTest extends BaseClass {
	
	@Test
	public void secondtest() {
		SoftAssert soft = new SoftAssert();
		
		home.clickGears();
		home.clickSkillraryDemoApp();
		web.handleChildBrowser();
		
		soft.assertTrue(skillraryDemo.getPageHeader().isDisplayed());
		
		
		skillraryDemo.selectCategory(web,  1);
		soft.assertEquals(testing.getPageHeader(),"Testing");
		
		web.dragAndDropElement(testing.getSeleniumImage(),testing.getCarrtArea());
		web.scrollToElement(testing.getFacebookIcon());
		testing.clickFacebookIcon();
		
		soft.assertAll();
		
	}

}
