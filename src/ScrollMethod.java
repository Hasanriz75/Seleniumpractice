import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ScrollMethod {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		driver.get("https://builder.zety.com/signin");
		driver.findElement(By.id("widget-user-email")).sendKeys("hasan.sardar@bold.com");
		driver.findElement(By.id("widget-user-password")).sendKeys("111111");
		driver.findElement(By.id("btnSignIn")).click();
		WebElement element1 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@data-auto='thumnail-edit-icon']")));
		element1.click();
		WebElement element2 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@title='Reset']")));
		element2.click();
		
		Actions actions = new Actions(driver);
		WebElement body = driver.findElement(By.className("tab-panel"));
		actions.sendKeys(body, Keys.PAGE_DOWN).perform();	
		}

}
