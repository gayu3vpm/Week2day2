package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2DeleteLead {

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
		   //Click on Phone
		   driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("9876543212");
		   driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
			/*
			 * Capture lead ID of First Resulting lead 
			 * 12 Click First Resulting lead
			 */
		   driver.findElement(By.xpath("//a[@class='subMenuButtonDangerous']")).click();
			/*
			 * Click Find leads 
			 * 15 Enter captured lead ID 
			 * 16 Click find leads button
			 *  17 Verify message "No records to display" in the Lead List. This message
			 * confirms the successful deletion 
			 * 18 Close the browser (Do not log out)
			 */
		 
		   
		  //ctrl shift i, f12, 
		   //(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a)[1]
		 

	}

}
