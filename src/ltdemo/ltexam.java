package ltdemo;

import java.net.URL;
import java.time.Duration;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ltexam {

	public static void main(String[] args) {		
		
		ChromeOptions browserOptions = new ChromeOptions();
		browserOptions.setPlatformName("Windows 11");
		browserOptions.setBrowserVersion("136");
		HashMap<String, Object> ltOptions = new HashMap<String, Object>();
		ltOptions.put("username", "hasanriz75");
		ltOptions.put("accessKey", "LT_SMukXUOCwsvAVESWH2nxDFt0QYzOkj8nSG1ysM8qkpRGb72");
		ltOptions.put("build", "SeleniumBuild");
		ltOptions.put("project", "Selenium");
		ltOptions.put("w3c", true);
		ltOptions.put("plugin", "java-testNG");
		browserOptions.setCapability("LT:Options", ltOptions);
		
		
			ChromeDriver driver = new ChromeDriver();
			driver.get("https://www.lambdatest.com/selenium-playground/");
			driver.findElement(By.partialLinkText("Simple Form Demo")).click();
			
			String currenturl = driver.getCurrentUrl();
		
			if (currenturl.contains("simple-form-demo")) {
				System.out.println("TEST PASSED");
			}
			else {
				System.out.println("TEST FAILED");
			}
		String c = "Welcome to LambdaTest";
		driver.findElement(By.id("user-message")).clear();
		driver.findElement(By.id("user-message")).sendKeys(c);
		driver.findElement(By.xpath("//button[@type='button'][1]")).click();
		 driver.findElement(By.xpath("//p[text()='Welcome to LambdaTest']"));
		 System.out.println("ALL TEST PASSED");
		 driver.quit();
	}
	}


