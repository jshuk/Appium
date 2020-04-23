import java.net.MalformedURLException;

import org.openqa.selenium.By;

import io.appium.java_client.AppiumDriver;

public class first extends base{

	static AppiumDriver driver;
	
	
	public static void main(String[] args) throws MalformedURLException  {
		
		driver = capabilities();
		driver.findElementByXPath("//android.widget.TextView[@text='Preference']").click();
	}

}
