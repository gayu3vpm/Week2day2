package week2.day2;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//Assignment:3
//===================
//1. Load url "https://acme-test.uipath.com/login"
//2. Enter email as "kumar.testleaf@gmail.com"
//3. Enter Password as "leaf@12"
//4. Click login button
//5. Get the title of the page and print
//6. Click on Log Out
//7. Close the browser (use -driver.close())
//======================
public class Assignment3 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		  driver.get("https://acme-test.uipath.com/login");
		  driver.manage().window().maximize();
	      WebElement email = driver.findElement(By.id("email"));
	      email.sendKeys("kumar.testleaf@gmail.com");
		  driver.findElement(By.id("password")).sendKeys("leaf@12");
		  driver.findElement(By.xpath("//button[@type='submit']")).click();
		  String title = driver.getTitle();
		  System.out.println(title);
		  driver.findElement(By.xpath("//a[text()='Log Out']")).click();
		  Thread.sleep(2000);//need to add InterruptedException
		                      //below thread which method call-that particular 1 method thread work
		  driver.close();
		  
	
			 
		  
		 
	}

}
