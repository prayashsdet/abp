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
public class CoronaCasesForAllTheStates {
	@Test
	public void demo() throws Throwable {
		DesiredCapabilities dc = new DesiredCapabilities();
		//common DC for android or IOS
//		dc.setCapability("deviceName","Samsung galaxy s10+");
//		dc.setCapability("platformVersion", "11");
		dc.setCapability("automationName", "appium");
		dc.setCapability("platformName", "Android");
		dc.setCapability("noReset", true);
		//DC for android
		dc.setCapability("appPackage", "com.winit.starnews.hin");
		dc.setCapability("appActivity",".activities.Welcome");
		
		//Android server port no
		
		URL url = new URL("http://localhost:4723/wd/hub");
		AndroidDriver driver = new AndroidDriver(url,dc);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	

//	driver.findElement(By.xpath("//android.widget.TextView[@text='(English)']")).click();
	//driver.findElement(By.id("com.android.packageinstaller:id/permission_allow_button")).click();
//	WebElement ele = driver.findElement(By.xpath("//androidx.appcompat.app.ActionBar.Tab[@content-desc=\"For You\"]/android.widget.LinearLayout/android.widget.TextView"));
//	if (ele.isSelected()) {
//		WebElement home = driver.findElement(By.xpath("//androidx.appcompat.app.ActionBar.Tab[@content-desc=\"Home\"]/android.widget.LinearLayout/android.widget.TextView"));
//		Thread.sleep(10000);
//	home.click();
//	}
    Thread.sleep(10000);
//	driver.swipe(513, 1475, 516, 1034, 500);
	
	
	///////////////////////////////////////////corona cases accorrding to state
	
	scrollcorona(driver, "text", "Andaman and Nicobar Islands");
	scrollcorona(driver, "text", "Andhra Pradesh");
	scrollcorona(driver, "text", "Arunachal Pradesh");
	scrollcorona(driver, "text", "Assam");
	scrollcorona(driver, "text", "Bihar");
	scrollcorona(driver, "text", "Chandigarh");
	scrollcorona(driver, "text", "Chhattisgarh");
	scrollcorona(driver, "text", "Dadra Nagar Haveli and Daman Diu");
	scrollcorona(driver, "text", "Delhi");
	scrollcorona(driver, "text", "Goa");
	scrollcorona(driver, "text", "Gujarat");
	scrollcorona(driver, "text", "Haryana");
	scrollcorona(driver, "text", "Himachal Pradesh");
	scrollcorona(driver, "text", "Jammu and Kashmir");
	scrollcorona(driver, "text", "Jharkhand");
	scrollcorona(driver, "text", "Karnataka");
	scrollcorona(driver, "text", "Kerala");
	scrollcorona(driver, "text", "Ladakh");
	scrollcorona(driver, "text", "Lakshadweep");
	scrollcorona(driver, "text", "Madhya Pradesh");
	scrollcorona(driver, "text", "Maharashtra");
	scrollcorona(driver, "text", "Manipur");
	scrollcorona(driver, "text", "Meghalaya");
	scrollcorona(driver, "text", "Mizoram");
	scrollcorona(driver, "text", "Nagaland");
	scrollcorona(driver, "text", "Odisha");
	scrollcorona(driver, "text", "Puducherry");
	scrollcorona(driver, "text", "Punjab");
	scrollcorona(driver, "text", "Rajasthan");
	scrollcorona(driver, "text", "Sikkim");
	scrollcorona(driver, "text", "Tamil Nadu");
	scrollcorona(driver, "text", "Telangana");
	scrollcorona(driver, "text", "Tripura");
	scrollcorona(driver, "text", "Uttar Pradesh");
	scrollcorona(driver, "text", "Uttarakhand");
	scrollcorona(driver, "text", "West Bengal");
	
	
	
	
//	List<WebElement> ele1 = driver.findElements(By.xpath("//android.widget.CheckedTextView[@resource-id=\"android:id/text1\"]"));
//	
//	for(int i=0; i< ele1.size(); i++){
//		   MobileElement listItem = (MobileElement) ele1.get(i);   
//		   System.out.println(listItem.getText());
//	}  
	
//	driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Tripura\"))").click();
//	Thread.sleep(3000);
//	
//	WebElement active = driver.findElement(By.xpath("//android.view.View[@resource-id='totalCases']"));
//	System.out.println("Active "+active.getText());
//
//	WebElement recovered = driver.findElement(By.xpath("//android.view.View[@resource-id='recovered']"));
//	System.out.println("Recovered "+recovered.getText());
//	
//	WebElement deceased = driver.findElement(By.xpath("//android.view.View[@resource-id='death']"));
//	System.out.println("Deceased "+deceased.getText());
//	
	
		
	
}
	public void scrollcorona(AndroidDriver driver,String an, String av) throws Throwable {
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[1]/android.widget.LinearLayout/android.view.ViewGroup/android.widget.LinearLayout[2]/androidx.viewpager.widget.ViewPager/android.view.ViewGroup/android.view.ViewGroup/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[2]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.webkit.WebView/android.webkit.WebView/android.view.View[1]/android.view.View[2]")).click();	
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView("+an+"(\""+av+"\"))").click();
		Thread.sleep(3000);
		System.out.println(av);
		WebElement active = driver.findElement(By.xpath("//android.view.View[@resource-id='cases-count']//android.widget.TextView[@resource-id='totalCases']"));
		System.out.println("Active "+active.getText());

		WebElement recovered = driver.findElement(By.xpath("//android.widget.TextView[@text='RECOVERED']/following-sibling::android.widget.TextView[@resource-id='recovered']"));
		System.out.println("Recovered "+recovered.getText());
	
		WebElement deceased = driver.findElement(By.xpath("////android.widget.TextView[@text='DECEASED']/following-sibling::android.widget.TextView[@resource-id='death']"));
		System.out.println("Deceased "+deceased.getText());
	}
	
}

