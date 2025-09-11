package dropDown;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {

	public static void main(String[] args) {

		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://blazedemo.com/reserve.php");
		driver.manage().window().maximize();
		
		int tableRow=driver.findElements(By.xpath("//table[@class='table']//tbody//tr")).size();
		System.out.println("---------->"+tableRow);
		int tableCol=driver.findElements(By.xpath("//table[@class='table']//th")).size();
		System.out.println("---------->"+tableCol);
		
		for(int r=1;r<=tableRow; r++) {
			for(int c=1;c<=tableCol; c++) {
			String Value=driver.findElement(By.xpath("//table[@class='table']//tbody//tr["+r+"]//td["+c+"]")).getText();
			System.out.print(Value+"\t");
			}
			System.out.println(" ");
			
		}
		List<String> rows = new ArrayList<>();
		for(int i=1; i<=tableRow;i++) {
			String rowV= driver.findElement(By.xpath("//table[@class='table']//tbody//td[6]")).getText();
			rows.add(rowV);
			System.out.print(rowV+" ");
			
		}
		  Collections.sort(rows);
		  for (String row : rows) {
	            System.out.println(row);
	        }
		
		
	}

}
