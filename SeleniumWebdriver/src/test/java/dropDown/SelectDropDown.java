package dropDown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDown {

	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		WebElement drpCountryEL= driver.findElement(By.xpath("//select[@id=\"country\"]"));
		Select drpcountry= new Select(drpCountryEL);
		
//		drpcountry.selectByVisibleText(null);
//		drpcountry.selectByIndex(0);
//		drpcountry.selectByValue(null);
		drpcountry.selectByVisibleText("France");
		
		
		List<WebElement>options=drpcountry.getOptions();
		System.out.println("Number of options:"+options.size());
		for(int i=0;i<options.size();i++) {
			 System.out.println( options.get(i).getText());
		}
		
		for(WebElement option: options) {
		  System.out.println(""+	option.getText());
		}
		//Bootstrao dropdown
		 //multiple sekected options
		 
	}

}
