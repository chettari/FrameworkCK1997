package testscripts;

import java.util.List;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import genericlibraries.BaseClass;

public class FourthTest extends BaseClass {
	
	@Test
	public void fourthtest() {
		SoftAssert soft = new SoftAssert();
		
		
		home.clickGears();
		home.ClickskillrarydemoApp();
		web.handleChildBrowser();
		
		soft.assertTrue(skillrarydemo.getPageHeader().isDisplayed());
		
		web.scrolltoElement(skillrarydemo.getcontactus());
		skillrarydemo.clickcontactus();
		
		soft.assertTrue(contact.getpageheader().isDisplayed());
		
		List<String> data = excel.fetchDataFromExcel("sheet1");
		contact.submitDetails(data.get(0), data.get(1), data.get(2), data.get(3));
		
		soft.assertAll();
		
	}
	

}
