package mouseAction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightCLick {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=  new ChromeDriver();
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		driver.manage().window().maximize();
		WebElement button = driver.findElement(By.xpath("(//span[@class='context-menu-one btn btn-neutral'])[1]"));
		
		Actions act= new Actions(driver);
		//right click action
		act.contextClick(button).build().perform();
		
		//click on copy
		 WebElement copy=driver.findElement(By.xpath("//li[@class=\"context-menu-item context-menu-icon context-menu-icon-copy\"]"));
		 copy.click();
		 
		 Thread.sleep(5000);
		 //close alert box
		 driver.switchTo().alert().accept();
	}

}
