package avpapplication123;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
//Test to verify user is able to switch from SPORTS tab into BUSINESS tab by sliding right to left.
public class TC_HOME_0011 {
	@Test
	public void demo() throws Throwable  {
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
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	driver.findElement(By.xpath("//android.widget.TextView[@text='(English)']")).click();
	Thread.sleep(3000);
	driver.swipe(546, 809, 550, 1495, 100);//swipe up  from ad 
	Thread.sleep(3000);
	for(int i=0;i<=5;i++) {
	driver.swipe(969, 928, 107, 908, 500);}//swipe to sports tab from home tab
	// to verify user is able to switch to sports tab to business tab
	Thread.sleep(100);
	for(int i=0;i<3;i++) {
	driver.swipe(981, 891,  111,899, 500);
}
	
}
}
