package week2.day2;
//Step 1: Download and set the path 
//Step 2: Launch the chromebrowser
//Step 3: Load the URL https://en-gb.facebook.com/
//Step 4: Maximise the window
//Step 5: Add implicit wait
//Step 6: Click on Create New Account button
//Step 7: Enter the first name
//Step 8: Enter the last name
//Step 9: Enter the mobile number
//Step 10: Enterthe password
//Step 11: Handle all the three drop downs
//Step 12: Select the radio button "Female" 
 //( A normal click will do for this step) 

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));//works all findelement and findelements
        //create account
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("anu");
        driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("M");
        driver.findElement(By.xpath("(//div[contains(@class,'uiStickyPlaceholderInput ')])[3]/input")).sendKeys("9876543210");
        driver.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys("abc@123");
        WebElement day = driver.findElement(By.id("day"));
        Select dd1=new Select(day);
        dd1.selectByValue("10");
        WebElement month = driver.findElement(By.id("month"));
        Select dd2=new Select(month);
        dd2.selectByVisibleText("Jan");
        WebElement year = driver.findElement(By.id("year"));
        Select dd3=new Select(year);
        dd3.selectByVisibleText("1993");
        driver.findElement(By.xpath("//label[text()='Female']")).click();
      
        
        
        
	}
	

}
