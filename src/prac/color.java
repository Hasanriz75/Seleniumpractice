package prac;

import java.awt.Color;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class color {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://zety.com/");
		driver.manage().window().maximize();
		String CTAcolor = "#ffc85e";

		WebElement CTA = driver.findElement(By.xpath("(//a[contains(@class,'button_zu9gw_146 _p')])[1]"));
		String color = CTA.getCssValue("background-color");
		System.out.println("Color is " + color);
		
		driver.quit();
	}

}
