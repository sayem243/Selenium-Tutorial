package screenshot;


import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HandSSL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeOptions options= new ChromeOptions();
		options.setAcceptInsecureCerts(true);//accept ssl certificate
		
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://expired.badssl.com/");
		driver.manage().window().maximize();
		
		System.out.println("Title of the page "+driver.getTitle()); //privacy error

	}

}
