package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LearnXpath {
	//Find the xpath 
	//https://www.nykaa.com/    -> Search box  using (name) attribute
	//https://www.swiggy.com/   -> Text based (food button)
	//https://www.axisbank.com/ -->Partial attribute based xpath(Login button)
	//https://www.amazon.in/    --> Partial text based xpath (Bluetooth Calling)

	public static void main(String[] args) {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver=new ChromeDriver(options);
		driver.get("https://www.nykaa.com/");
		driver.manage().window().maximize();
		WebElement search = driver.findElement(By.xpath("//input[@name ='search-suggestions-nykaa']"));
		search.sendKeys("FaceMask");
		driver.get("https://www.swiggy.com/");
		WebElement food = driver.findElement(By.xpath("//span[text()='FIND FOOD']"));
		System.out.println(food);
		driver.get("https://www.axisbank.com/");
		WebElement axislogin = driver.findElement(By.xpath("//div[contains(@class,'loginClk')]"));
		axislogin.click();
		driver.get("https://www.amazon.in/");
		WebElement amazontext = driver.findElement(By.xpath("//h2[contains(text(),'Calling')]"));
		System.out.println(amazontext);
	}    
}
//org.openqa.selenium.ElementClickInterceptedException