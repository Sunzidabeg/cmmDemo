package pracDemo;



import org.junit.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Checkbox_test {
	 
	WebDriver driver;
	
	@BeforeMethod
	public void test2() throws InterruptedException {

	
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\Sunzida\\eclipse-workspaceTF\\Selenium\\pracDemo\\driver86\\chromedriver.exe");  
	     driver = new ChromeDriver();  
	     driver.navigate().to("https://techfios.com/test/101/");
	     driver.manage().window().maximize();
	     driver.findElement(By.xpath("//input[@name='allbox']")).click();
	     driver.findElement(By.linkText("hdf")).isSelected();
	     driver.findElement(By.linkText("Abdel 09:54")).isSelected();
	     
	    WebElement remove = driver.findElement(By.xpath("//input[@value='Remove']"));
	    remove.click();
	    
	 
	   
	}
	
	@Test
	public void verifyRemovePageTitle() {
		
		String title = driver.getTitle();
				System.out.println("the page title is :" +title);
		
			Assert.assertEquals(title, "Warning ");
				    
	}
	

}

