package avpapplication123;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.appium.java_client.android.AndroidDriver;

public class LanguageTest {
@Test
	public void demo() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException {
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
	
	WebElement ele=driver.findElement(By.xpath("//android.widget.TextView[@text='(English)']"));
	String english=ele.getText();
	SoftAssert sa =new SoftAssert();
	sa.assertEquals("(English)", english);
		System.out.println(english);
		
		
		driver.findElement(By.xpath("//android.widget.TextView[@text='(English)']")).click();
		//driver.findElement(By.id("com.android.packageinstaller:id/permission_allow_button")).click();
		Thread.sleep(5000);
		driver.findElementByAccessibilityId("Menu").click();
		driver.findElement(By.id("com.winit.starnews.hin:id/spinner_arrow_iv")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@text='(Hindi)']")).click();
//		driver.findElement(By.xpath("com.winit.starnews.hin:id/menu_menu")).click();
//		driver.findElement(By.xpath("com.winit.starnews.hin:id/spinner_arrow_iv")).click();
//		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[2]/android.widget.TextView"));
//		driver.swipe(530, 1852, 501, 578, 2000);
		
		
		
	WebElement hnd = driver.findElement(By.xpath("//androidx.appcompat.app.ActionBar.Tab[@content-desc=\"होम\"]/android.widget.LinearLayout/android.widget.TextView"));
	String  hindi=hnd.getText();
	
	
	FileInputStream fis=new FileInputStream("./home.xlsx");
	Workbook wb = WorkbookFactory.create(fis);
	String home=wb.getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
	
    SoftAssert sa3=new SoftAssert();
	sa3.assertEquals(home, hindi);
    System.out.println(home);
    
  WebElement language = driver.findElement(By.xpath("//android.widget.TextView[@resource-id='com.winit.starnews.hin:id/newsHeadingText' and @index='2']"));
  String lg=language.getText();
  String hn=wb.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
     SoftAssert as =new SoftAssert();
     as.assertEquals(hn, lg);
	System.out.println( lg);
	
	
	
}
}
