package prac;

import java.io.File;
import java.nio.file.Path;
import java.io.IOException;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class screenshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://zety.com/");
		driver.manage().window().maximize();
		// Taking screenshot
		TakesScreenshot ts = (TakesScreenshot)driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		System.out.print("Action started");
		// Saving screenshot
		Files.copy(source, new File("C:\\Users\\hasan.sardar\\eclipse-workspace\\Selenium\\screenshots.png"));
		driver.close();
		driver.quit();
	}

}