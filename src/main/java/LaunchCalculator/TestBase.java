package LaunchCalculator;

import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import io.appium.java_client.android.AndroidDriver;

public class TestBase {
	public static AndroidDriver<WebElement> driver=null;
	AndroidUtilis cal= new AndroidUtilis();
	
	@BeforeSuite
	public void TriggerinBeforeSuiteDependency() throws Exception{
    cal.launchApp();
    
	}
    
    @AfterSuite
	public void closeApp() throws Exception{
		driver.quit();
	}
}
