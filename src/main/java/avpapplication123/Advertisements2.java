package avpapplication123;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;

public class Advertisements2 {//ADS IN HOME PAGE 
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
	WebElement ele = driver.findElement(By.xpath("//androidx.appcompat.app.ActionBar.Tab[@content-desc=\"For You\"]/android.widget.LinearLayout/android.widget.TextView"));
	if (ele.isSelected()) {
		WebElement home = driver.findElement(By.xpath("//androidx.appcompat.app.ActionBar.Tab[@content-desc=\"Home\"]/android.widget.LinearLayout/android.widget.TextView"));
		Thread.sleep(10000);
	 driver.tap(1, home, 500);
	}
		
	WebDriverWait wait=new WebDriverWait(driver,50);
	wait.until(ExpectedConditions.elementToBeClickable(By.id("com.winit.starnews.hin:id/linearLayout")));
	driver.findElement(By.id("com.winit.starnews.hin:id/linearLayout")).click();
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.TextView[@text='KANNADA']"))).click();
	driver.findElement(By.xpath("//android.widget.TextView[@text='KANNADA']")).click();
	
	
	
	
	
	driver.pressKeyCode(AndroidKeyCode.BACK);
	
	
}
}
