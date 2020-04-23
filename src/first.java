import java.net.MalformedURLException;

import org.openqa.selenium.By;

import io.appium.java_client.AppiumDriver;

public class first extends base{

	static AppiumDriver driver;
	
	
	public static void main(String[] args) throws MalformedURLException  {
		
		driver = capabilities();
		driver.findElementByXPath("//android.widget.TextView[@text='Preference']").click();
		driver.findElementByXPath("//android.widget.TextView[@text='3. Preference dependencies']").click();
		driver.findElementByXPath("//android.widget.CheckBox[@resource-id='android:id/checkbox']").click();
		driver.findElementByXPath("(//android.widget.RelativeLayout)[2]").click();
		driver.findElementByClassName("android.widget.EditText").sendKeys("Netgear");
		driver.findElementByXPath("//*[@text='OK']").click();
	}

}
