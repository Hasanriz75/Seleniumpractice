package prac;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class practice {
	@Test
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
driver.get("https://admission.lpu.in/");
Thread.sleep(3000);

WebElement dropdown = driver.findElement(By.id("StateId"));
Select staticdropdown = new Select(dropdown);
staticdropdown.selectByIndex(3);
Thread.sleep(4000);

List<WebElement> all = staticdropdown.getOptions();
for (WebElement text : all) {
	String ops = text.getText();
	System.out.println(ops);
}

driver.quit();
	}

	
}
