package week2.day2;
//https://www.leafground.com/input.xhtml

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment4Task1 {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/input.xhtml");
		driver.manage().window().maximize();
        driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("Gayathri");
        driver.findElement(By.xpath("(//input[@type='text'])[3]")).clear();
        driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("Villpuram");
        WebElement disabled = driver.findElement(By.xpath(("//div[contains(@class,'grid')][3])//input")));
        boolean res = disabled.isEnabled();
        System.out.println(res);
        driver.findElement(By.xpath("//input[contains(@value,'clear')]")).clear();
        String text = driver.findElement(By.xpath("//input[contains(@value,'learning')]")).getText();
        System.out.println(text);
        
      
	}

}
