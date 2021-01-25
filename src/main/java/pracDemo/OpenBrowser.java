package pracDemo;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class OpenBrowser {
	
	WebDriver driver;
	
	@Test
	
	public void test1() {
			
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sunzida\\eclipse-workspaceTF\\Selenium\\pracDemo\\driver86\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://techfios.com/test/101/");
	driver.manage().window().maximize();
		
	//WebElement checkbox = driver.findElement(By.name("allbox"));
	//WebElement allbox = 
	
	driver.findElement(By.xpath("//input[@name='allbox']")).click();;
	
	
	boolean b1 = driver.findElement(By.xpath("//input[@name='allbox']")).isDisplayed();
	System.out.println(b1);
	
	//if(!checkbox.isSelected())
	//checkbox.click();
	
	//System.out.println("checked");
	
	//System.out.println("The checkbox is selection: " + checkbox.isSelected());
	//
	}
	
}


	


