package prac;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class linkcount {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
				driver.get("https://builder.zety.com");
				driver.manage().window().maximize();
				List<WebElement> link = driver.findElements(By.tagName("a"));
				int count = link.size();
				System.out.println(count);
				driver.findElement(By.linkText("My Account")).click();		
				try {
					Thread.sleep(4000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("clicked by link text");
				driver.quit();

}
}