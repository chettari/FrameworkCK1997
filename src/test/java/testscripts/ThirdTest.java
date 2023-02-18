package testscripts;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import genericlibraries.BaseClass;

public class ThirdTest extends BaseClass {

	
	@Test
	public void thirdtest() throws InterruptedException {
		SoftAssert soft = new SoftAssert();
		
		home.searchFor("core java for selenium");
		soft.assertEquals(coreJava.getpageheader(),"CORE JAVA FOR SELENIUM");
		
		coreJava.clickcoreJavaForSeleniumLink();
		soft.assertEquals(javaVideo.getpageheader(), "core java for selenium training");
		
		javaVideo.clickCloseCookies();
		web.SwitchToFrame();
		javaVideo.clickplaybutton();
		Thread.sleep(2000);
		javaVideo.clickpausebutton();
		
		web.switchBackFromFrame();
		
		javaVideo.clickAddToWishlist();
		
		soft.assertAll();
	}

}
