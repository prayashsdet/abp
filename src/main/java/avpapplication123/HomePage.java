package avpapplication123;

import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class HomePage {
	@Test
	public void demo() throws InterruptedException, IOException, EncryptedDocumentException, InvalidFormatException {
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
		}
		Thread.sleep(6000);
        for (int i=0;i<=39;i++) {
		driver.swipe(522, 1877, 542, 575, 600);
		
//		if (driver.findElement(By.id("com.winit.starnews.hin:id/headerTitletextView")).isDisplayed()) {
//			System.out.println("live tv visible");
//		}
//		if (driver.findElement(By.id("cases-count")).isDisplayed()){
//				System.out.println("corona-logo");
//			}
//		if(driver.findElement(By.id("com.winit.starnews.hin:id/headerTitletextView")).isDisplayed()){
//			System.out.println("top videos section visible");
//		}
		
		}
        Thread.sleep(6000);
        for( int j=0;j<=36;j++) {
        	driver.swipe(489, 583, 489, 1926, 1000);
        }
        
			
		}
		
      
}

