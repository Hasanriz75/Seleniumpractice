package prac;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class switchwindow {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://omayo.blogspot.com/");
		driver.findElement(By.id("selenium143")).click();
		
		Set<String> windowhandles = driver.getWindowHandles();
		
		for (String id : windowhandles) {
			driver.switchTo().window(id);
			System.out.println("window handles - " + id);
			if ( driver.getTitle().equals("Selenium143")) {
				driver.findElement(By.xpath("//a[@href='https://t.me/qafoxoriginal']")).click();
				String title = driver.getCurrentUrl();
				System.out.println(title);			
			}
		}	
		driver.quit();
	}
}
