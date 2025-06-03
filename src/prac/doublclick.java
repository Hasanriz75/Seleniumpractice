package prac;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class doublclick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();
		
		Actions actions = new Actions(driver);
		WebElement dc = driver.findElement(By.xpath("//button[@ondblclick='dblclickAlert()']"));
		actions.doubleClick().perform();
		System.out.println("Action performed");
		
		// Accepting alert
		Alert popup = driver.switchTo().alert();
		System.out.println(popup.getText());
		popup.accept();
		driver.quit();
	}

}
