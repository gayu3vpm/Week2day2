package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2EditLead {

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
		   driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("firstname");
		   driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
			/*
			 * Click on first resulting lead 
			 * 11 Verify title of the page
			 */
		   driver.findElement(By.xpath("(//a[@class='subMenuButton'])[3]")).click();
		   driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("amazon");
		   driver.findElement(By.xpath("(//input[@type='submit'])[1]")).click();
			/*
			 * 15 Confirm the changed name appears
			 *  16 Close the browser (Do not log out)
			 */
		   
		   
		   
	}

}
