package basics;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class frames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",  "C:\\Users\\intel\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/guru99home/");
		driver.manage().window().maximize();
		driver.switchTo().frame("a077aa5e");   //a077aa5e
		
		driver.findElement(By.xpath("/html/body/a/img")).click();
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("agghsaxgvh");
		
		

	}

}
