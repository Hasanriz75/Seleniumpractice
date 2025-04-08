package prac;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alertpopup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("alert1")).click();
		Alert a = driver.switchTo().alert();
		String text = a.getText();
		System.out.println(text);
	    a.accept();   
	    driver.findElement(By.id("prompt")).click();
	    Alert ac = driver.switchTo().alert();
	    String dc = ac.getText();
	    System.out.println(dc);
	    ac.dismiss();
	    driver.quit();
	
	}
}
