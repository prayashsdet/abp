package avpapplication123;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class CoronaCases {
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
	WebElement ele = driver.findElement(By.xpath("//androidx.appcompat.app.ActionBar.Tab[@content-desc=\"For You\"]/android.widget.LinearLayout/android.widget.TextView"));
	if (ele.isSelected()) {
		WebElement home = driver.findElement(By.xpath("//androidx.appcompat.app.ActionBar.Tab[@content-desc=\"Home\"]/android.widget.LinearLayout/android.widget.TextView"));
		Thread.sleep(10000);
	 driver.tap(1, home, 500);
	}
		
	Thread.sleep(10000);
	
	driver.swipe(505, 1844, 522, 702, 600);
	Thread.sleep(10000);
	
	driver.findElement(By.xpath("//android.widget.Spinner[@package='com.winit.starnews.hin']")).click();
	driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Tripura\"))").click();
//	Thread.sleep(3000);
	
//	String scrollElement = "new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().text(\"BLOG\").instance(0))";
//	driver.findElementByAndroidUIAutomator(scrollElement);
	
//	driver.swipe(579, 1425, 612, 821, 100);
	WebElement active = driver.findElement(By.xpath("//android.view.View[@resource-id='totalCases']"));
	System.out.println("Active "+active.getText());

	WebElement recovered = driver.findElement(By.xpath("//android.view.View[@resource-id='recovered']"));
	System.out.println("Recovered "+recovered.getText());
	
	WebElement deceased = driver.findElement(By.xpath("//android.view.View[@resource-id='death']"));
	System.out.println("Deceased "+deceased.getText());
	
	
		
	
}
}

