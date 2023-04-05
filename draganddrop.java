package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class draganddrop {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",  "C:\\Users\\intel\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		
		//Element which needs to drag.
		WebElement From=driver.findElement(By.xpath("//*[@id=\"credit2\"]/a"));
		//Element which needs to drop.
		WebElement To=driver.findElement(By.xpath("//*[@id=\"shoppingCart1\"]"));
		
		
		
		//using action class for drag and drop
        Actions a = new Actions(driver);
        Thread.sleep(1000);
        //Dragged and Dropped.
        a.dragAndDrop(From, To).perform();
    	WebElement from1=driver.findElement(By.xpath("	(//a[@class = 'button button-orange'])[2]"));
    	WebElement to1=driver.findElement(By.xpath("//*[@id=\"amt7\"]/li"));
    	 Actions a2 = new Actions(driver);
         Thread.sleep(1000);
          a2.dragAndDrop(from1, to1).perform();
         WebElement from2=driver.findElement(By.xpath(" (//a[@class='button button-orange'])[6]"));
         WebElement to2=driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
         Actions a3 = new Actions(driver);
         Thread.sleep(1000);
       a3.dragAndDrop(from2, to2).perform();
       WebElement from3=driver.findElement(By.xpath ("(//a[@class='button button-orange'])[4]"));
       WebElement to3=driver.findElement(By.xpath("//*[@id=\"amt8\"]/li"));
       Actions a4 = new Actions(driver);
       Thread.sleep(1000);
     a4.dragAndDrop(from3, to3).perform();
    	
        
		
		
		
		
      
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}



	}

