package avpapplication123;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
@Listeners(avpapplication123.Listeners.class)
public class StoryCard {
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
	WebElement ele = driver.findElement(By.xpath("//androidx.appcompat.app.ActionBar.Tab[@content-desc=\"For You\"]/android.widget.LinearLayout/android.widget.TextView"));
	if (ele.isSelected()) {
		WebElement home = driver.findElement(By.xpath("//androidx.appcompat.app.ActionBar.Tab[@content-desc=\"Home\"]/android.widget.LinearLayout/android.widget.TextView"));
		Thread.sleep(10000);
	home.click();
	}
	Thread.sleep(6000);
	for (int i=0;i<2;i++) {
	driver.swipe(616, 1811, 600, 920,600);
	}
	driver.findElement(By.id("com.winit.starnews.hin:id/newsHeadingText")).click();
	Thread.sleep(3000);
	//driver.swipe(616, 1811, 600, 920,600);
	WebElement dateandtime = driver.findElement(By.xpath("//android.widget.TextView[@resource-id='com.winit.starnews.hin:id/recentTimeText']"));
	System.out.println(dateandtime.getText());
	WebElement storycardtitle = driver.findElement(By.xpath("//android.widget.TextView[@resource-id='com.winit.starnews.hin:id/newsTitleTextview']"));
	System.out.println(storycardtitle.getText());
	//System.out.println(dateandtime.getText());
	
}
}


