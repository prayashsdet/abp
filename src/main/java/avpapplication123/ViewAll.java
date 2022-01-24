package avpapplication123;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class ViewAll {//BLOG VIEW ALL FUNCTIONALITY TEST SCRIPT
	@Test
	public void demo() throws MalformedURLException, InterruptedException {
		DesiredCapabilities dc = new DesiredCapabilities();
		//common DC for android or IOS
		dc.setCapability("automationName", "appium");
		dc.setCapability("platformName", "Android");
		dc.setCapability("noReset", true);
		//DC for android
		dc.setCapability("appPackage", "com.winit.starnews.hin");
		dc.setCapability("appActivity",".activities.ActivityChannelSelectionList");
		
		//Android server port no
		URL url = new URL("http://localhost:4723/wd/hub");
		
		AndroidDriver driver = new AndroidDriver(url,dc);
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//android.widget.TextView[@text='(English)']")).click();
		//WebElement ele = driver.findElement(By.id("com.winit.starnews.hin:id/switch_foryou"));
		
		Thread.sleep(3000);
		
	WebElement ele = driver.findElement(By.xpath("//androidx.appcompat.app.ActionBar.Tab[@content-desc=\"For You\"]/android.widget.LinearLayout/android.widget.TextView"));
		if (ele.isSelected()) {
			WebElement home = driver.findElement(By.xpath("//androidx.appcompat.app.ActionBar.Tab[@content-desc=\"Home\"]/android.widget.LinearLayout/android.widget.TextView"));
			Thread.sleep(10000);
		home.click();
		
			
//	
//		if (driver.findElement(By.id("com.winit.starnews.hin:id/switch_foryou")).isDisplayed()) {
//			driver.findElement(By.id("com.winit.starnews.hin:id/switch_foryou")).click();
//			WebElement home = driver.findElement(By.xpath("//androidx.appcompat.app.ActionBar.Tab[@content-desc=\"Home\"]/android.widget.LinearLayout/android.widget.TextView"));
//			home.click();
			
		}
		
		Thread.sleep(6000);
		
		
		
//		String scrollElement = "new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().text(\"BLOG\").instance(0))";
//		driver.findElementByAndroidUIAutomator(scrollElement);
//		driver.findElement(By.xpath("//android.widget.LinearLayout[@resource-id='com.winit.starnews.hin:id/viewAllLinearLayout' and @index ='0']")).click();
		//driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Tripura\"))");
for (int i=0;i<=6;i++) {
		driver.swipe(517, 1737, 560, 563, 1600);
//		}

		
		}
Thread.sleep(3000);
driver.findElement(By.id("com.winit.starnews.hin:id/viewAllLinearLayout")).click();;
WebElement title = driver.findElement(By.id("com.winit.starnews.hin:id/newsHeadingText"));
title.getText();
title.click();


      String text = driver.findElement(By.id("com.winit.starnews.hin:id/newsTitleTextview")).getText();
      
      if(title.equals(text)) {
    	  System.out.println("header is equal to title");
    	  
      }
      else {
    	  System.out.println("not equal");
      }
      WebElement dateandtime = driver.findElement(By.xpath("//android.widget.TextView[@resource-id='com.winit.starnews.hin:id/recentTimeText']"));
  	System.out.println(dateandtime.getText());
  	WebElement storycardtitle = driver.findElement(By.xpath("//android.widget.TextView[@resource-id='com.winit.starnews.hin:id/newsTitleTextview']"));
  	System.out.println(storycardtitle.getText());;
        
driver.closeApp();
	}
	
	
}








