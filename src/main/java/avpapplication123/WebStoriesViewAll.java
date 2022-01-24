package avpapplication123;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class WebStoriesViewAll {
	@Test
	public void demo() throws Throwable {
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
		
		 Thread.sleep(3000);
		
//		Thread.sleep(6000);
//        for (int i=0;i<=7;i++) {
//		driver.swipe(517, 1737, 560, 563, 1600);	
//		}
		
		driver.swipe(517, 1737, 560, 563, 1600);	
		
		scrollHomePage(driver,"text","WEB STORIES");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//android.widget.TextView[@text='WEB STORIES']/ancestor::android.widget.LinearLayout[@resource-id='com.winit.starnews.hin:id/linearLayout']/descendant::android.widget.FrameLayout[@resource-id=\"com.winit.starnews.hin:id/villAllCardView\"]")).click();
        
        
        
       List<WebElement> WebStories = driver.findElements(By.xpath("//android.widget.TextView[@resource-id=\"com.winit.starnews.hin:id/search_news_text\"]"));
       
       
       ArrayList<String> al= new ArrayList<String>();
       for (WebElement wb:WebStories) {
    	  System.out.println(wb.getText());
    	  al.add(wb.getText());
//       String name = wb.getText();
       } 
    	   
    	   FileInputStream file = new FileInputStream (new File("C:\\Users\\ACER\\Desktop\\documents\\home.xlsx"));
   			Workbook wb1 = WorkbookFactory.create(file);
   			
   			Sheet sheet = wb1.getSheet("Sheet2");
   			for(int i = 0; i<WebStories.size();i++) {
   				Row row = sheet.createRow(i);
   				row.createCell(0).setCellValue(al.get(i));
   			
   				
   			}
   			FileOutputStream writeFile = new FileOutputStream(new File("C:\\Users\\ACER\\Desktop\\documents\\home.xlsx"));
	   		wb1.write(writeFile);
	   		writeFile.flush();
	   		wb1.close();
   			
   			
       
       
        driver.findElement(By.xpath("(//android.widget.TextView[@resource-id='com.winit.starnews.hin:id/search_news_text'])[1]")).click();
       Thread.sleep(1000000);
      driver.closeApp();
      
 
      
	}
	public void scrollHomePage(AndroidDriver driver,String an, String av) throws Throwable {	
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView("+an+"(\""+av+"\"))").click();
		
		
	}
}

