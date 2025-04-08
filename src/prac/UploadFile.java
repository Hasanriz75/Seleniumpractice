package prac;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class UploadFile {
 

	public static void main(String args[]) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://reg-builder.zety.com/resume/experience-level");
		driver.manage().window().maximize();
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		 WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@class='btn btn-default ']")));
		element.click();
		//driver.navigate().back();
		
		driver.findElement(By.xpath("//button[normalize-space()='Upload file']")).click();
		WebElement upload =driver.findElement(By.xpath("//input[@type='file']"));
		upload.sendKeys("D:\\Jira BUG tickets\\Hasan_Sardar_ResumeG.pdf");
		
		driver.close();
	}
}
