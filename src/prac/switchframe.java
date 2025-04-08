package prac;

import java.awt.Color;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class switchframe {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://omayo.blogspot.com/");
		driver.findElement(By.linkText("Open a popup window")).click();
		Thread.sleep(5000);

		Set<String> windowshande = driver.getWindowHandles();
		
		for (String ids : windowshande) {
			driver.switchTo().window(ids);
			System.out.println("window handles - " + ids);
			if ( driver.getTitle().equals("New Window")) {

				System.out.println(driver.getTitle());			
			}
		}
		driver.quit();
	}}
