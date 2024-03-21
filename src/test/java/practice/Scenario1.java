package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Scenario1 {

	public static void main(String[] args) throws InterruptedException {
		//step1: launch app 
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		d.get("https://demowebshop.tricentis.com/");
		
		//login to app
		d.findElement(By.linkText("Log in")).click();
		d.findElement(By.id("Email")).sendKeys("reshma555@gmail.com");
		d.findElement(By.id("Password")).sendKeys("123456");
		d.findElement(By.xpath("(//input[@type='submit'])[2]")).click();
		
		//step3: Add jewlery to cart
		d.findElement(By.xpath("(//a[contains(text(),'Jewelry')])[3]")).click();
		d.findElement(By.xpath("(//a[text()='Create Your Own Jewelry'])[3]")).click();
		d.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("2");
		d.findElement(By.xpath("(//input[@type='button'])[3]")).click();
		WebElement msg=d.findElement(By.xpath("//p[@class='content']"));
		
		//step4: verify jwelery
		if(msg.isDisplayed())
			System.out.println("item is added : "+msg.getText());
		else
			System.out.println("item is not added");
		
		//step5: logout of app
		Thread.sleep(3000);
		d.findElement(By.linkText("Log out")).click();
		d.quit();

	}
	
	

}
