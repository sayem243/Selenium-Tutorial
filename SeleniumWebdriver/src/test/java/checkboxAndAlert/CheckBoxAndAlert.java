package checkboxAndAlert;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxAndAlert {
	
	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
//		driver.findElement(By.xpath("//input[@id='monday']")).click();
		
		List<WebElement> checkBoxes=driver.findElements(By.xpath("(//input[@class=\"form-check-input\" and @type=\"checkbox\"])"));
//		for(WebElement checkBox: checkBoxes) {
//			checkBox.click();
//		}
		
		for(int i=0; i<checkBoxes.size();i++) {
			checkBoxes.get(i).click();
		}
	}

}
