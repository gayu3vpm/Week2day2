package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearnDropDown {

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
		   driver.findElement(By.linkText("Create Lead")).click();
		   driver.findElement(By.id("createLeadForm_companyName")).sendKeys("abc");
		   driver.findElement(By.id("createLeadForm_firstName")).sendKeys("firstname");
		   driver.findElement(By.id("createLeadForm_lastName")).sendKeys("lastname");
		   driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("firstloacalname");
		   driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("dep123");
		   driver.findElement(By.id("createLeadForm_description")).sendKeys("desc123");
		   driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("abc@gmail.com");
		   WebElement industry = driver.findElement(By.id("createLeadForm_industryEnumId"));
		   Select dd=new Select(industry);
		   dd.selectByIndex(1);
		   dd.selectByValue("IND_SOFTWARE");
		   dd.selectByVisibleText("Press");
		   WebElement ownership = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		   Select dd1=new Select(ownership);
		   dd1.selectByIndex(3);
		   dd1.selectByValue("OWN_LLC_LLP");
		   dd1.selectByVisibleText("Corporation");
		   
	}

}
