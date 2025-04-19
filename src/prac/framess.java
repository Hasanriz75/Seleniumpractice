package prac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class framess {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
				driver.get("https://practice-automation.com/iframes/");
				driver.manage().window().maximize();
				Thread.sleep(3000);
				driver.switchTo().frame(0);
				driver.findElement(By.xpath("//a[contains(@class,'getStarted_Sjon')]")).click();
				Thread.sleep(3000);
			// non-static drowdown
				driver.get("https://practice.expandtesting.com/dropdown");
				driver.findElement(By.xpath("//a[@class='nav-link dropdown-toggle']")).click();
				driver.findElement(By.xpath("//ul[@class='dropdown-menu show']/li[5]")).click();
				Thread.sleep(5000);
				driver.quit();
}
}
