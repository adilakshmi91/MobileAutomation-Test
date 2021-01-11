package LaunchCalculator;

import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;


import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class AndroidUtilis {
	public void launchApp() throws Exception{
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "ANDROID");//"platformName"
		cap.setCapability(MobileCapabilityType.DEVICE_NAME,"Android Emulator");
	    cap.setCapability("appPackage", "com.android.calculator2");
		cap.setCapability("appActivity",  "com.android.calculator2.Calculator");
		TestBase.driver = new AndroidDriver<WebElement>(new URL("http://0.0.0.0:4723/wd/hub"), cap);
		System.out.println("App Launched");

}
}
