package week2.day2;
//Assignment:2 
//================================================
//https://github.com/TestLeafPages/SeleniumAssignments/tree/master/week2/day2.assignments
//Complete all 4 assignments in this link
//Create contact
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment2 {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
	    WebElement Username = driver.findElement(By.id("username"));
		   Username.sendKeys("demoSalesManager");
		   driver.findElement(By.id("password")).sendKeys("crmsfa");
		   driver.findElement(By.className("decorativeSubmit")).click();
		   driver.findElement(By.linkText("CRM/SFA")).click();
		   driver.findElement(By.xpath("//a[text()='Contacts']")).click();
		   driver.findElement(By.xpath("//a[text()='Create Contact']")).click();
		   driver.findElement(By.id("firstNameField")).sendKeys("abcd");
		   driver.findElement(By.id("lastNameField")).sendKeys("M");
		   driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("firstlocal");
		   driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("lastlocal");
		   driver.findElement(By.id("createContactForm_departmentName")).sendKeys("dept123");
		   driver.findElement(By.id("createContactForm_description")).sendKeys("desc123");
		   driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("abc@gmail.com");
		   WebElement state = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
		   Select dd=new Select(state);
		   dd.selectByVisibleText("New York");
		   driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		   driver.findElement(By.xpath("//a[text()='Edit']")).click();
		   driver.findElement(By.id("updateContactForm_description")).clear();
		   driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("importance notes");
		   driver.findElement(By.xpath("(//input[@type='submit'])[1]")).click();
		   String title = driver.getTitle();
		   System.out.println(title);
		   
		   
		   
		   
		   
		   
		   
		   
		   
		 
		
		   
		   
		   

	}

}
