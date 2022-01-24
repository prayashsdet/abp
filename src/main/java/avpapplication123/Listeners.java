package avpapplication123;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.google.common.io.Files;

public class Listeners implements ITestListener {
		WebDriver driver;
		ExtentReports reports;
		ExtentTest test;

		public void onTestStart(ITestResult result) 
		{
			test=reports.createTest(result.getMethod().getMethodName());
		}

		public void onTestSuccess(ITestResult result)
		{
		    test.log(Status.PASS, result.getMethod().getMethodName()+"is passed");	
			
		}

		public void onTestFailure(ITestResult result) {
		
			String methodName = result.getMethod().getMethodName();
			Object obj = result.getInstance();
			WebDriver driver = null;
			test.log(Status.FAIL, result.getMethod().getMethodName()+"is failed");
		}
			
//			try {
//				driver = (WebDriver)result.getTestClass().getRealClass().getSuperclass().getDeclaredField("driver").get(obj);
//			} catch (IllegalArgumentException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			} catch (IllegalAccessException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			} catch (NoSuchFieldException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			} catch (SecurityException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
//			TakesScreenshot ts = (TakesScreenshot) driver;
//			File src = ts.getScreenshotAs(OutputType.FILE);
//			File dest = new File("./screenshot/"+methodName+".PNG");
//			try {
//				Files.copy(src, dest);
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			
//		}

		public void onTestSkipped(ITestResult result) {
			test.log(Status.SKIP, result.getMethod().getMethodName()+"is skipped");
			test.log(Status.SKIP, result.getThrowable());
		}

		public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
			
			
		}

		public void onStart(ITestContext context) {
			ExtentHtmlReporter reporter = new ExtentHtmlReporter(System.getProperty("user.dir")+"/ExtentReport/ExtentReports1.html");
			reporter.config().setTheme(Theme.DARK);
			reporter.config().setDocumentTitle("TestScript");
			reporter.config().setReportName("automation excution report");
			
			reports = new ExtentReports();
			reports.attachReporter(reporter);
			
			reports.setSystemInfo("BuildNo", "5.1");
			reports.setSystemInfo("Env", "pro");
			reports.setSystemInfo("Platform", "windows");
			reports.setSystemInfo("Browser version", "chrome-93");
			
			
		}

		public void onFinish(ITestContext context) {
			reports.flush();
			
		}

		


		
	}