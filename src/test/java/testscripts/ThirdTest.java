package testscripts;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import genericlibraries.BaseClass;

public class ThirdTest extends BaseClass {
	
	
	@Test
	public void thirdtest() throws InterruptedException {
		SoftAssert soft = new SoftAssert();
		
		home.searchFor("core java for selenium");
		soft.assertEquals(corejava.getpageheader(),"CORE JAVA FOR SELENIUM");
		
		corejava.getCorejavaforselenium();
		soft.assertEquals(javavideo.getpageheader(), "core java for selenium training");
		
		javavideo.clickclosecookies();
		web.SwitchToFrame();
		javavideo.clickplaybutton();
		Thread.sleep(2000);
		javavideo.clickpausebutton();
		
		web.switchBackFromFrame();
		
		javavideo.clickaddtowishlist();
		
		soft.assertAll();
	}

}
