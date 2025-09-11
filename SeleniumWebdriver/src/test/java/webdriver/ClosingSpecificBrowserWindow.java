package webdriver;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClosingSpecificBrowserWindow {

	public static void main(String[] args) {
		

		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();
		
		Set<String> windowIds= driver.getWindowHandles();
		
		for(String windId:windowIds) {
			String title= driver.switchTo().window(windId).getTitle();
			System.out.println("Title----->"+title);
			
			if(title.equals("Human Resources Management Software | OrangeHRM HR Software")) {
				driver.close();
			}
		}

	}

}
