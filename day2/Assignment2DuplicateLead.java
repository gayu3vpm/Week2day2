package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2DuplicateLead {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
	    WebElement Username = driver.findElement(By.id("username"));
		   Username.sendKeys("demoSalesManager");
		   driver.findElement(By.id("password")).sendKeys("crmsfa");
		   driver.findElement(By.className("decorativeSubmit")).click();
		   driver.findElement(By.linkText("CRM/SFA")).click();
		   driver.findElement(By.linkText("Leads")).click();
		   driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
           //Click on Email
		   driver.findElement(By.xpath("//input[@name='emailAddress']")).sendKeys("abcd@gmail.com");
		   driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
			/*
			 * Capture name of First Resulting lead 
			 * 12 Click First Resulting lead
			 */
		   driver.findElement(By.xpath("(//a[@class='subMenuButton'])[1]")).click();
		   //Verify the title as 'Duplicate Lead'
		   driver.findElement(By.xpath("(//input[@value='Create Lead']")).click();
			/*
			 * Confirm the duplicated lead name is same as captured name 17 Close the
			 * browser (Do not log out)
			 */
		 
		
	}

}
