package in.amazon.project.lesson1;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestSearchMobilePage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone 13");

		
		driver.findElement(By.id("twotabsearchtextbox")).submit();
		
		Thread.sleep(1500);
		
		driver.findElement(By.xpath("(//div[@class='a-section'])[2]/descendant::span[11]")).click();
		
        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
	
		
		driver.switchTo().window(tabs.get(1));
		
		Thread.sleep(1500);
		
		
		driver.findElement(By.id("wishlistButtonStack")).click();
		 Thread.sleep(3000);
	        driver.findElement(By.id("ap_email")).sendKeys("vaidehi.a2000@gmail.com");
			driver.findElement(By.xpath("//input[@id='continue']")).click();
			driver.findElement(By.id("ap_password")).sendKeys("qwerty");
			driver.findElement(By.id("signInSubmit")).click();   
		//driver.quit();

	}

}
