package avpapplication123;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;
@Listeners(avpapplication123.Listeners.class)
public class HomePageScroll {
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
		
		
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
			driver.findElement(By.xpath("//android.widget.TextView[@text='(English)']")).click();
//			driver.findElement(By.id("com.android.packageinstaller:id/permission_allow_button")).click();
//			 WebElement ele = driver.findElement(By.xpath("//androidx.appcompat.app.ActionBar.Tab[@content-desc=\"For You\"]/android.widget.LinearLayout/android.widget.TextView"));
//				if (ele.isSelected()) {
//			    WebElement home = driver.findElement(By.xpath("//androidx.appcompat.app.ActionBar.Tab[@content-desc=\"Home\"]/android.widget.LinearLayout/android.widget.TextView"));
//				Thread.sleep(10000);
//				home.click();
//				}
				//Thread.sleep(6000);
				//or @AndroidFindBy(id="your_id")
			/*	private MobileElement button;

				@AndroidFindBy(id="your_ad_close_button_id")
				private MobileElement ad_close;

				    public void protected_click(MobileElement element){ //you can call this function with any mobileElement (e.g. your button); this could also return another page object and not void.
				        try{
				//you may want to wait here until the element is visible or clickable using wait.until(ExpectedConditions.elementToBeClickable(element)); or similar (add a timeout exception in this case as well)
				            element.click();
				        }
				        catch (NoSuchElementException e){ //element could not be found because it is covered by the ad
				            if (ad_close.isDisplayed()){ //this throws an element not found exception so I skipped rethrowing.. otherwise this has to be in another try catch block or handled differently
				                ad_close.click();
				                //now it should be possible to click the element
				                element.click();
				            }
				        }
				        */
			
			//Thread.sleep(3000);
		//
//			for(int i=0;i<2;i++) {
				
			
				driver.swipe(508, 2078, 521, 1028,600);
				driver.swipe(508, 2078, 521, 1028,1600);
//			}
		//
				
				driver.findElement(By.id("com.winit.starnews.hin:id/newsHeadingText")).click();
				Thread.sleep(3000);
				//driver.swipe(616, 1811, 600, 920,600);
			//	WebElement dateandtime = driver.findElement(By.xpath("//android.widget.TextView[@resource-id='com.winit.starnews.hin:id/recentTimeText']"));
				WebElement dateandtime =driver.findElement(By.id("com.winit.starnews.hin:id/tvLiveBlogTime"));
				System.out.println(dateandtime.getText());
			//	WebElement storycardtitle = driver.findElement(By.xpath("//android.widget.TextView[@resource-id='com.winit.starnews.hin:id/newsTitleTextview']"));
				WebElement storycardtitle =driver.findElement(By.id("com.winit.starnews.hin:id/tvEnglishTitle"));
				System.out.println(storycardtitle.getText());
				Thread.sleep(6000);	
                scrollHomePage(driver,"text","Tags:");
             WebElement tags = driver.findElement(By.id("com.winit.starnews.hin:id/tag_layout_parent"));
            System.out.println(tags.getText());
            for (int i=0;i<=6;i++) {
    	        driver.swipe(489, 583, 489, 1926, 1000);
    	        
    	     
    }

            
            
              driver.pressKeyCode(AndroidKeyCode.BACK);
              Thread.sleep(3000);
              //driver.swipe(508, 2078, 521, 1028,600);
              driver.findElement(By.xpath("(//android.widget.TextView[@resource-id='com.winit.starnews.hin:id/newsHeadingText'])[2]")).click();
             // WebElement title = driver.findElement(By.id("com.winit.starnews.hin:id/newsTitleTextview"));
              WebElement title = driver.findElement(By.id("com.winit.starnews.hin:id/tvEnglishTitle"));
              
              System.out.println(title.getText());
            //  WebElement time = driver.findElement(By.id( "com.winit.starnews.hin:id/recentTimeText"));
              WebElement time = driver.findElement(By.id( "com.winit.starnews.hin:id/tvLiveBlogTime"));
              
              System.out.println(time.getText());
              Thread.sleep(3000);
//              scrollHomePage(driver,"text","Tags:");
//              WebElement tags1 = driver.findElement(By.id("com.winit.starnews.hin:id/tag_layout_parent"));
//             System.out.println(tags.getText());
             Thread.sleep(3000);
             for (int i=0;i<=6;i++) {
     	        driver.swipe(489, 583, 489, 1926, 1000);
     	        
     	     
     }

              driver.pressKeyCode(AndroidKeyCode.BACK);
              Thread.sleep(3000);
              driver.findElement(By.xpath("(//android.widget.TextView[@resource-id='com.winit.starnews.hin:id/newsHeadingText'])[3]")).click();
             WebElement title1 = driver.findElement(By.id("com.winit.starnews.hin:id/newsTitleTextview"));
              
             System.out.println(title1.getText());
             WebElement time1 = driver.findElement(By.id("com.winit.starnews.hin:id/recentTimeText"));
             
              System.out.println(time1.getText());
              
                Thread.sleep(6000);
                scrollHomePage(driver,"text","Tags:");
                WebElement tags2 = driver.findElement(By.id("com.winit.starnews.hin:id/tag_layout_parent"));
               System.out.println(tags.getText());
               Thread.sleep(6000);
               for (int i=0;i<=6;i++) {
       	        driver.swipe(489, 583, 489, 1926, 1000);
       	        
       	     
       }

               
				driver.pressKeyCode(AndroidKeyCode.BACK);
				Thread.sleep(3000);
			
//			scrollHomePage(driver, "text", "TOP VIDEOS");
//			
		        
		       
		scrollHomePage(driver, "text", "BLOG");
		 driver.findElement(By.xpath("//android.widget.TextView[@text='BLOG']/ancestor::android.widget.LinearLayout[@resource-id='com.winit.starnews.hin:id/linearLayout']/descendant::android.widget.FrameLayout[@resource-id=\"com.winit.starnews.hin:id/villAllCardView\"]")).click();
	        driver.findElement(By.id("com.winit.starnews.hin:id/newsHeadingText")).getText();
	        for (int i=0;i<=6;i++) {
	        	
	        
	        driver.swipe(508, 2078, 521, 1028,600);
	        }
	        for (int i=0;i<=6;i++) {
	        driver.swipe(489, 583, 489, 1926, 1000);
	        
	     
}
	        driver.pressKeyCode(AndroidKeyCode.BACK);
		scrollHomePage(driver, "text", "WEB STORIES");
		driver.findElement(By.xpath("//android.widget.TextView[@text='WEB STORIES']/ancestor::android.widget.LinearLayout[@resource-id='com.winit.starnews.hin:id/linearLayout']/descendant::android.widget.FrameLayout[@resource-id=\"com.winit.starnews.hin:id/villAllCardView\"]")).click();
		Thread.sleep(6000);
		 for (int i=0;i<=6;i++) {
	        	
		        
		        driver.swipe(508, 2078, 521, 1028,600);
		        }
		        for (int i=0;i<=6;i++) {
		        driver.swipe(489, 583, 489, 1926, 1000);
		        }
		 driver.pressKeyCode(AndroidKeyCode.BACK);
		 
		 Thread.sleep(3000);
		scrollHomePage(driver, "text", "TV SHOWS");	
		driver.findElement(By.xpath("//android.widget.TextView[@text='TV SHOWS']/ancestor::android.widget.LinearLayout[@resource-id='com.winit.starnews.hin:id/linearLayout']/descendant::android.widget.FrameLayout[@resource-id=\"com.winit.starnews.hin:id/villAllCardView\"]")).click();
		Thread.sleep(6000);
		 for (int i=0;i<=6;i++) {
	        	
		        
		        driver.swipe(508, 2078, 521, 1028,600);
		        }
		        for (int i=0;i<=6;i++) {
		        driver.swipe(489, 583, 489, 1926, 1000);
		        }
		 driver.pressKeyCode(AndroidKeyCode.BACK);
		 Thread.sleep(3000);
		 
		scrollHomePage(driver, "text", "PHOTO GALLERY");
		driver.findElement(By.xpath("//android.widget.TextView[@text='PHOTO GALLERY']/ancestor::android.widget.LinearLayout[@resource-id='com.winit.starnews.hin:id/linearLayout']/descendant::android.widget.FrameLayout[@resource-id=\"com.winit.starnews.hin:id/villAllCardView\"]")).click();
		Thread.sleep(6000);
		 for (int i=0;i<=6;i++) {
	        	
		        
		        driver.swipe(508, 2078, 521, 1028,600);
		        }
		        for (int i=0;i<=6;i++) {
		        driver.swipe(489, 583, 489, 1926, 1000);
		        }
		 driver.pressKeyCode(AndroidKeyCode.BACK);
		
		 
			scrollHomePage(driver, "text", "MOVIE REVIEWS");
			scrollHomePage(driver, "text", "INDIA");
			driver.findElement(By.xpath("//android.widget.TextView[@text='INDIA']/ancestor::android.widget.LinearLayout[@resource-id='com.winit.starnews.hin:id/linearLayout']/descendant::android.widget.FrameLayout[@resource-id=\"com.winit.starnews.hin:id/villAllCardView\"]")).click();
			Thread.sleep(6000);
			 for (int i=0;i<=6;i++) {
		        	
			        
			        driver.swipe(508, 2078, 521, 1028,600);
			        }
			        for (int i=0;i<=6;i++) {
			        driver.swipe(489, 583, 489, 1926, 1000);
			        }
			 driver.pressKeyCode(AndroidKeyCode.BACK);
			 Thread.sleep(3000);
			scrollHomePage(driver, "text", "ENTERTAINMENT");
			driver.findElement(By.xpath("//android.widget.TextView[@text='ENTERTAINMENT']/ancestor::android.widget.LinearLayout[@resource-id='com.winit.starnews.hin:id/linearLayout']/descendant::android.widget.FrameLayout[@resource-id=\"com.winit.starnews.hin:id/villAllCardView\"]")).click();
			Thread.sleep(6000);
			 for (int i=0;i<=6;i++) {
		        	
			        
			        driver.swipe(508, 2078, 521, 1028,600);
			        }
			        for (int i=0;i<=6;i++) {
			        driver.swipe(489, 583, 489, 1926, 1000);
			        }
			 driver.pressKeyCode(AndroidKeyCode.BACK);
			 Thread.sleep(3000);
			scrollHomePage(driver, "text", "SPORTS");
			driver.findElement(By.xpath("//android.widget.TextView[@text='SPORTS']/ancestor::android.widget.LinearLayout[@resource-id='com.winit.starnews.hin:id/linearLayout']/descendant::android.widget.FrameLayout[@resource-id=\"com.winit.starnews.hin:id/villAllCardView\"]")).click();
			Thread.sleep(6000);
			 for (int i=0;i<=6;i++) {
		        	
			        
			        driver.swipe(508, 2078, 521, 1028,600);
			        }
			        for (int i=0;i<=6;i++) {
			        driver.swipe(489, 583, 489, 1926, 1000);
			        }
			 driver.pressKeyCode(AndroidKeyCode.BACK);
			 Thread.sleep(3000);
			scrollHomePage(driver, "text", "WORLD");
			driver.findElement(By.xpath("//android.widget.TextView[@text='WORLD']/ancestor::android.widget.LinearLayout[@resource-id='com.winit.starnews.hin:id/linearLayout']/descendant::android.widget.FrameLayout[@resource-id=\"com.winit.starnews.hin:id/villAllCardView\"]")).click();
			Thread.sleep(6000);
			 for (int i=0;i<=6;i++) {
		        	
			        
			        driver.swipe(508, 2078, 521, 1028,600);
			        }
			        for (int i=0;i<=6;i++) {
			        driver.swipe(489, 583, 489, 1926, 1000);
			        }
			 driver.pressKeyCode(AndroidKeyCode.BACK);
			 Thread.sleep(3000);
			scrollHomePage(driver, "text", "BUSINESS");
			driver.findElement(By.xpath("//android.widget.TextView[@text='BUSINESS']/ancestor::android.widget.LinearLayout[@resource-id='com.winit.starnews.hin:id/linearLayout']/descendant::android.widget.FrameLayout[@resource-id=\"com.winit.starnews.hin:id/villAllCardView\"]")).click();
			Thread.sleep(6000);
			 for (int i=0;i<=6;i++) {
		        	
			        
			        driver.swipe(508, 2078, 521, 1028,600);
			        }
			        for (int i=0;i<=6;i++) {
			        driver.swipe(489, 583, 489, 1926, 1000);
			        }
			 driver.pressKeyCode(AndroidKeyCode.BACK);
			 Thread.sleep(3000);
			scrollHomePage(driver, "text", "AUTO");
			driver.findElement(By.xpath("//android.widget.TextView[@text='AUTO']/ancestor::android.widget.LinearLayout[@resource-id='com.winit.starnews.hin:id/linearLayout']/descendant::android.widget.FrameLayout[@resource-id=\"com.winit.starnews.hin:id/villAllCardView\"]")).click();
			Thread.sleep(6000);
			 for (int i=0;i<=6;i++) {
		        	
			        
			        driver.swipe(508, 2078, 521, 1028,600);
			        }
			        for (int i=0;i<=6;i++) {
			        driver.swipe(489, 583, 489, 1926, 1000);
			        }
			 driver.pressKeyCode(AndroidKeyCode.BACK);
			 Thread.sleep(3000);
			scrollHomePage(driver, "text", "LIFESTYLE");
			driver.findElement(By.xpath("//android.widget.TextView[@text='LIFESTYLE']/ancestor::android.widget.LinearLayout[@resource-id='com.winit.starnews.hin:id/linearLayout']/descendant::android.widget.FrameLayout[@resource-id=\"com.winit.starnews.hin:id/villAllCardView\"]")).click();
			Thread.sleep(6000);
			 for (int i=0;i<=6;i++) {
		        	
			        
			        driver.swipe(508, 2078, 521, 1028,600);
			        }
			        for (int i=0;i<=6;i++) {
			        driver.swipe(489, 583, 489, 1926, 1000);
			        }
			 driver.pressKeyCode(AndroidKeyCode.BACK);
			 Thread.sleep(3000);
			scrollHomePage(driver, "text", "HEALTH");
			driver.findElement(By.xpath("//android.widget.TextView[@text='HEALTH']/ancestor::android.widget.LinearLayout[@resource-id='com.winit.starnews.hin:id/linearLayout']/descendant::android.widget.FrameLayout[@resource-id=\"com.winit.starnews.hin:id/villAllCardView\"]")).click();
			Thread.sleep(6000);
			 for (int i=0;i<=6;i++) {
		        	
			        
			        driver.swipe(508, 2078, 521, 1028,600);
			        }
			        for (int i=0;i<=6;i++) {
			        driver.swipe(489, 583, 489, 1926, 1000);
			        }
			 driver.pressKeyCode(AndroidKeyCode.BACK);
			 Thread.sleep(3000);
			scrollHomePage(driver, "text", "STORIES");
			 Thread.sleep(3000);
			scrollHomePage(driver, "text", "TRENDING TOPICS");
			
			Thread.sleep(3000);
//			for (int i=0;i<36;i++) {
//			driver.swipe(566, 535, 524, 1667, 1000);
				} 	
	
	
		public void scrollHomePage(AndroidDriver driver,String an, String av) throws Throwable {	
			driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView("+an+"(\""+av+"\"))");
			Thread.sleep(3000);
			System.out.println(av);
		}
}
