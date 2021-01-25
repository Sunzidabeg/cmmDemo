package pracDemo;


import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class test_test {
	
	WebDriver driver;
	static WebElement validateWarningPage;
	@Test
	public void text1() throws InterruptedException {

			
	    System.setProperty("webdriver.chrome.driver","C:\\Users\\Sunzida\\eclipse-workspaceTF\\Selenium\\pracDemo\\driver86\\chromedriver.exe");  
        driver = new ChromeDriver();  
        driver.get("https://techfios.com/test/101/");
        driver.manage().window().maximize();

        WebElement ele = driver.findElement(By.linkText("hdf"));
        ele.isSelected();
        
        driver.findElement(By.xpath("//input[@name='submit' and @value='Remove']")).click();
        
       
		//Assert.assertTrue(driver.findElement(By.linkText("hdf")).isSelected());  
		//System.out.println("Are you sure!!");
        
        
       // 
        
       
       
    	}
	
		
	
	
		
      
       
        
        //TestNG
      // driver.findElement(By.xpath("//select[@name='category']")).sendKeys("saha");

	}

	
