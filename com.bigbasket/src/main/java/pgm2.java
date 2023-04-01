import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class pgm2 {
@Test
public void login() throws InterruptedException
{
		
		WebDriver driver = new ChromeDriver(); 
		driver.navigate().to("https://www.motherhoodindia.com");
		 Thread.sleep(2000); 
		driver.manage().window().maximize();
		 Thread.sleep(2000); 
}
	
	
	
	
}
