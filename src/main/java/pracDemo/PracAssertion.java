package pracDemo;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;





//@SuppressWarnings("deprecation")
public class PracAssertion {

	public static void main(String[] args) throws InterruptedException {
	
		
		
     // TODO Auto-generated method stub  
     System.setProperty("webdriver.chrome.driver","C:\\Users\\Sunzida\\eclipse-workspaceTF\\Selenium\\pracDemo\\driver86\\chromedriver.exe");  
     WebDriver driver = new ChromeDriver();  
     driver.navigate().to("https://techfios.com/test/101/");
     driver.manage().window().maximize();
     Thread.sleep(2000);
     driver.findElement(By.xpath("//input[@type='checkbox']")).click();
    
     Assert.assertTrue(driver.findElement(By.xpath("//input[@type='checkbox']")).isSelected());
      
     System.out.println(driver.findElement(By.xpath("//input[@type='checkbox']")).isSelected());
 }  
	
	}

