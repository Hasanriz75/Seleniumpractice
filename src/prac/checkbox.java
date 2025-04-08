package prac;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkbox  {
	public static void main(String[] args) {
WebDriver driver = new ChromeDriver();
		driver.get("https://builder.zety.com/resume/experience-level");
		driver.manage().window().maximize();
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			
			System.out.println(e);
		}
		
		driver.findElement(By.xpath("//button[normalize-space()='3-5 Years']")).click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			
			System.out.println(e);
		}
		driver.findElement(By.xpath("//button[normalize-space()='Skip']")).click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			
			System.out.println(e);
		}
		
		List<WebElement> checkbox = driver.findElements(By.xpath("//label[contains(@class,'custom-control-label')]"));
		
		for(WebElement box : checkbox) {
			
				box.click();
		}
		
		
		try {
			Thread.sleep(7000);
		} catch (InterruptedException e) {
			
			System.out.println(e);
		}
		driver.navigate().refresh();
		driver.close();
		
}
}