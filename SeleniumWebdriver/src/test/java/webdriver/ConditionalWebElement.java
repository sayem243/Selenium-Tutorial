package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditionalWebElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.nopcommerce.com/en/register");
		
		//
		 WebElement logo=driver.findElement(By.xpath("//img[@alt=\"nopCommerce\"]"));
		 System.out.println("Displayed status of logo"+logo.isDisplayed());
		 
		 System.out.println("Display status of logo"+logo);

	}

}
