package avpapplication123;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
//Test to verify the refresh functionality.
public class TC_HOME_003 {
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
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.findElement(By.xpath("//android.widget.TextView[@text='(English)']")).click();
	
}
}
