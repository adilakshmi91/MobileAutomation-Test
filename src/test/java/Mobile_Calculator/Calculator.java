package Mobile_Calculator;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import LaunchCalculator.TestBase;

public class Calculator extends TestBase {
	   @Test
	    public void sum() throws Exception {
			
	     	driver.findElement(By.id("digit_2")).click();
			driver.findElement(By.id("digit_3")).click();
			driver.findElement(By.id("op_add")).click();
			driver.findElement(By.id("digit_9")).click();
			driver.findElement(By.id("digit_5")).click();
			driver.findElement(By.id("eq")).click();
			Thread.sleep(2000);
			System.out.println(driver.findElement(By.id("result")).getText());
			
		}

}
