package avpapplication123;


import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindAll;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class Language {
	AndroidDriver driver;
	
	@AndroidFindAll({
		@AndroidFindBy(xpath="//android.widget.TextView[@text='(English)']"),
				@AndroidFindBy(xpath="//android.widget.TextView[@text='(Hindi)']"),
				@AndroidFindBy(xpath="//android.widget.TextView[@text='(Bengali)']"),
				@AndroidFindBy(xpath="//android.widget.TextView[@text='(Marathi)']"),
				@AndroidFindBy(xpath="//android.widget.TextView[@text='(Punjabi)']"),
				@AndroidFindBy(xpath="//android.widget.TextView[@text='(Gujarati)']"),
				@AndroidFindBy(xpath="//android.widget.TextView[@text='(Ganga)']"),
				@AndroidFindBy(xpath="//android.widget.TextView[@text='(Tamil)']"),
				@AndroidFindBy(xpath="//android.widget.TextView[@text='(Gujarati)']"),})
	
	private MobileElement lang; 
}
