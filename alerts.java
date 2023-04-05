package basics;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alerts {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",  "C:\\Users\\intel\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
	       driver.manage().window().maximize();
	System.out.println( driver.findElement(By.id("output")).getText());
	   driver.findElement(By.id("alertBox")).click();
	   System.out.println( driver.switchTo().alert().getText());
	   driver.switchTo().alert().accept();
	   System.out.println( driver.findElement(By.id("output")).getText()); 
		


	}

}
