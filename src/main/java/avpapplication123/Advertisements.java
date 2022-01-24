package avpapplication123;

import java.net.URL;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.MobileBy.ByAccessibilityId;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;

public class Advertisements {//TEST SCRIPT FOR STICKY ADS
	@Test
	public void demo() throws Throwable  {
	DesiredCapabilities dc = new DesiredCapabilities();
	//common DC for android or IOS
	dc.setCapability("automationName", "appium");
	dc.setCapability("platformName", "Android");
	dc.setCapability("noReset", true);
	//DC for android
	dc.setCapability("appPackage", "com.winit.starnews.hin");
	dc.setCapability("appActivity",".activities.Welcome");
	
	//Android server port no
	URL url = new URL("http://localhost:4723/wd/hub");
	
	AndroidDriver driver = new AndroidDriver(url,dc);
	
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.findElement(By.xpath("//android.widget.TextView[@text='(English)']")).click();

WebElement ele = driver.findElement(By.xpath("//androidx.appcompat.app.ActionBar.Tab[@content-desc=\"For You\"]/android.widget.LinearLayout/android.widget.TextView"));
if (ele.isSelected()) {
	WebElement home = driver.findElement(By.xpath("//androidx.appcompat.app.ActionBar.Tab[@content-desc=\"Home\"]/android.widget.LinearLayout/android.widget.TextView"));
	Thread.sleep(10000);
 driver.tap(1, home, 500);
}
	
	
//	TouchAction action = new TouchAction(driver);
//	action
	
	//for (int i=0;i<4;i++) {
	driver.swipe(535, 1141, 556, 580, 500);
	//}
	
	
	WebElement stickyads = driver.findElement(By.xpath("//android.widget.Image[@text='Advertisement']"));
	if (stickyads.isDisplayed()) {
		System.out.println("stickyads is visible after swiping down");
	}
	
	
	driver.swipe(489, 583, 489, 1926, 1000);
	
	
	
	try {
	if (stickyads.isDisplayed()) {
		System.out.println("stickyads is visible");
	}
	}
	
		catch(Exception e) {
			System.out.println("sticky ads not displaying after swiping up");
		}
	}
	
	
	

	 //driver.findElementByAccessibilityId("OPEN").click();
	 //driver.tap(1, ele, 100);
//	System.out.println(stickyads.getText());
	
//	driver.findElement(By.xpath("//android.widget.TextView[@text='KANNADA']")).click();
//	driver.pressKeyCode(AndroidKeyCode.BACK);
//	
	
//	System.out.println(ad.getText());
//	Set<String> window = driver.getContextHandles();
//	for (String wd:window) {
//		System.out.println(wd);
//
//	}
//	driver.context("WEBVIEW_chrome");
//	driver.getTitle();
//	driver.context("WEBVIEW_com.winit.starnews.hin");
	//	driver.tap(1, stickyads, 100);

	
	
}

//	private By ByAccessibilityId(String string) {
//		// TODO Auto-generated method stub
//		return null;
	
