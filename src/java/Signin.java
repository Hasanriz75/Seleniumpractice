package java;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Signin {
	
	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub

//		 Invoking Browser 
		
		ChromeDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		//driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get("https://builder.zety.com/signin");
		
		System.out.println(driver.getTitle());
	    driver.findElement(By.className("js-for-forgot-pwd")).click();
	    driver.findElement(By.id("btnSubmitMail")).click();	   
	    Thread.sleep(5000);
	    driver.findElement(By.id("widget-user-forgot-mail")).sendKeys("hasan.sardar+31nov@bold.com");
	    Thread.sleep(5000);
	    driver.findElement(By.id("btnSubmitMail")).click();
	    
	    Thread.sleep(5000);
	   
	    WebElement c = driver.findElement(By.id("user-not-exist-msg"));
	    String Displayedmsg = c.getText();
	    System.out.println(Displayedmsg + " $$");
	    String ActualErrormsg = "Please enter registered email, so, we can help with your new password!";
	    if (Displayedmsg.equals(ActualErrormsg))
	    {
	    System.out.println("Error text is correct" );
	    }
	    else
	    {
	    	System.out.println("Error text is not same");
	    }
	    
	    driver.findElement(By.id("widget-user-forgot-mail")).clear();
	    driver.findElement(By.id("btnSubmitMail")).click();
	    Thread.sleep(1000); 
	    
	    WebElement d = driver.findElement(By.xpath("//*[@id='forgot-password-form']/div/span[1]"));
	    String Textrecd = d.getText();
	    
	    System.out.println("**" + Textrecd);
	    
	    String Actualmsg = "Please enter a valid email address";
	    if (Textrecd.equals(Actualmsg))
	    {
	    System.out.println("Error text is same");
	    }
	    
	    else
	    
	    {
	    	System.out.println("Error text is not same");
	    }
	    
	    driver.findElement(By.id("widget-user-forgot-mail")).sendKeys("hasan.sardar+06dec@bold.com");
	    driver.findElement(By.id("btnSubmitMail")).click();
	    driver.findElements(By.xpath("(//*[@class=\"widget-body\"])[2]"));
	  
	   
	 
	    WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//footer[@class='widget-footer']//a[@class='js-link-forgot-pwd']")));
	    element.click();
	    driver.findElement(By.xpath("//header[@class='widget-header']"));
	    
	    
	 
	    
	    //driver.findElement(By.xpath("//a[text()='Sign In']")).click();
	    driver.findElement(By.className("widget-h2 headingAccountsSignIn"));
	    driver.findElement(By.id("btn-google-login")).click();
	    driver.getWindowHandle();
	    
	driver.close();
		
	}
}
