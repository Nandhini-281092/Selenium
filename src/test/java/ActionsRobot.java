

import java.io.File;
	
	import org.openqa.selenium.By;
	import org.openqa.selenium.Keys;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Actions;

	public class ActionsRobot {

	public static void main(String args[]) throws Throwable {
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\eclipse-workspace\\Projects_Maven\\target\\chromedriver.exe");
		     
			//WebDriverManager.chromedriver().setup();
			
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.flipkart.com/");
			//driver.get("https://www.facebook.com/");
			driver.manage().window().maximize();
			
			try {
			driver.findElement(By.xpath("//button[text()='X']")).click();
			}
			
			catch(Exception e) {
				
			}
			//WebElement search = driver.findElement(By.name("q"));			
			//Actions act = new Actions(driver);
			//act.sendKeys(search,"Redmi mobiles",Keys.ENTER);
			
			WebElement move = driver.findElement(By.xpath("//*[text()='Fashion']"));
			Actions acc = new Actions(driver);
			acc.moveToElement(move).perform();
	
           // WebElement user = driver.findElement(By.id("email"));
            //user.sendKeys("Selenium");
            //Actions acc = new Actions(driver);
            //acc.doubleClick(user).perform();
            
            
								
			
	}		
			
			
	}

