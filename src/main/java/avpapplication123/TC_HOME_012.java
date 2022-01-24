package avpapplication123;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class TC_HOME_012 {
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
WebElement language = driver.findElement(By.xpath("//android.widget.TextView[@text='(English)']"));
driver.tap(1, language, 100);
	Thread.sleep(5000);
	driver.swipe(546, 809, 550, 1495, 500);//swipe up  from ad 
	Thread.sleep(5000);
	for (int i=0;i<9;i++) {
	driver.swipe(981, 924, 99, 903, 500);
	}//home to business tab
	for(int i=0;i<=5;i++) {
	driver.swipe(94, 862, 986,842, 500);//business to entertainment lab
}

}
}
