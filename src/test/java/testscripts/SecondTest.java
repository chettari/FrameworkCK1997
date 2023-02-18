package testscripts;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import genericlibraries.BaseClass;

public class SecondTest extends BaseClass {
	
	@Test
	public void secondtest() {
		SoftAssert soft = new SoftAssert();
		
		home.clickGears();
		home.ClickskillrarydemoApp();
		web.handleChildBrowser();
		
		soft.assertTrue(skillrarydemo.getPageHeader().isDisplayed());
		
		
		skillrarydemo.selectcategory(web,  1);
		soft.assertEquals(testing.getpageheader(),"Testing");
		
		web.dragAndDropElement(testing.getSeleniumimage(),testing.getcarrtarea());
		web.scrolltoElement(testing.clickfacebookicon());
		testing.clickfacebookicon();
		
		soft.assertAll();
		
	}

}
