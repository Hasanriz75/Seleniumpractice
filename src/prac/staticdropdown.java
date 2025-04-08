package prac;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class staticdropdown {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Thread.sleep(7000);
		WebElement staticdropdown = driver.findElement(By.xpath("//*[contains(@id,'searchDropdownBox')]"));
		Select dropdown = new Select(staticdropdown);
		dropdown.selectByVisibleText("Baby");
		List<WebElement> options = dropdown.getOptions();
		Thread.sleep(3000);
		for (WebElement option : options) {
            System.out.println(option.getText());
		}
		driver.close();
	}
}
