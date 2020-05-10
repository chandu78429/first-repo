package BasicCommands;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day1 {

	public static void main(String[] args) {
		

		System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();
		
		System.out.println("URL opened");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement element = driver.findElement(By.xpath("//input[@type='text']//ancestor::form[@autocomplete='on']"));
		System.out.println("element found");
		driver.switchTo().alert();
		element.sendKeys("9700033397");
		//driver.findElement(By.xpath("//input[@type='text']//ancestor::form[@autocomplete='on']")).sendKeys("9700033397");
		//driver.close();
		
		//adding comment from GIT
		//adding 2nd comment from GIT
		//adding comment from local to GIT
	}

}
