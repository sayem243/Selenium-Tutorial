package frame;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe {

	public static void main(String[] args) {
		
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://ui.vision/demo/webtest/frames/");
		driver.manage().window().maximize();
		
		//Frame 1
	    WebElement frame1=driver.findElement(By.xpath("/html[1]/frameset[1]/frame[1]")); //iframe xpath
	    driver.switchTo().frame(frame1);// passed frame as a webElement
		
		driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("welcome");
		
		//Frame 2
		driver.switchTo().defaultContent();// go back to the page
		WebElement frame2= driver.findElement(By.xpath("//frame[@src='frame_2.html']"));
		driver.switchTo().frame(frame2); 
		
		driver.findElement(By.xpath("//input[@name='mytext2']")).sendKeys("Selenium");
		
		
		//Frame 3
		driver.switchTo().defaultContent();
		
		WebElement frame3=driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
		driver.switchTo().frame(frame3);
		driver.findElement(By.xpath("//input[@name=\"mytext3\"]")).sendKeys("Frame 3");
		
		//inner iframe - this is a part of frame 3
		driver.switchTo().frame(0);
	    driver.findElement(By.xpath("//div[@id='i9']//div[@class='AB7Lab Id5V1']")).click();
		
//		WebElement BtnRadio=driver.findElement(By.xpath("//div[@id='i9']//div[@class='AB7Lab Id5V1']"));
//		JavascriptExecutor js=(JavascriptExecutor)driver;
//		js.executeScript("arguments[0].click()", BtnRadio);
		
		driver.switchTo().defaultContent();
		//driver.switchTo().defaultContent();
		
		//frame 4
		WebElement frame4= driver.findElement(By.xpath("//frame[@src='frame_4.html']"));
		driver.switchTo().frame(frame4);
		driver.findElement(By.xpath("//input[@name=\"mytext4\"]")).sendKeys("Hello");
		
		
		
		
	}

}
