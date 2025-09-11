package webdriver;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.*;

public class HandleBrowserWindow {

	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();
		
		Set<String> windowIds= driver.getWindowHandles();
		//Approach 1
		/*
		List<String> windowList= new ArrayList(windowIds);
	    String ParentID	=windowList.get(0);
	    String ChildID= windowList.get(1);
	    //switch window
	    
	    driver.switchTo().window(ChildID);
	    System.out.println(driver.getTitle());
		*/
		//Approach 2
	}

}
