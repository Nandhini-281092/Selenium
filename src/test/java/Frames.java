import java.util.Set;
import java.util.List;
import java.util.ArrayList;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {
	
		
		public static void main(String args[]) throws Throwable {
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\eclipse-workspace\\Projects_Maven\\target\\chromedriver.exe");
		     
			//WebDriverManager.chromedriver().setup();
			
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.flipkart.com/");
			driver.manage().window().maximize();
			
			try {
			driver.findElement(By.xpath("button[text()='X']")).click();
			}
			
			catch(Exception e) {
				e.printStackTrace();
			}
			driver.findElement(By.name("q")).sendKeys("Redmi mobiles",Keys.ENTER);
            Thread.sleep(2000);
            driver.findElement(By.xpath("(//div[@class='_4rR01T'])[1]")).click();
            driver.findElement(By.xpath("(//div[@class='_4rR01T'])[2]")).click();
            driver.findElement(By.xpath("(//div[@class='_4rR01T'])[3]")).click();
            String parent = driver.getWindowHandle();
            Set<String> child = driver.getWindowHandles();
            List<String> child1 = new ArrayList<>(child);
            
            driver.switchTo().window(child1.get(3));
            String text = driver.findElement(By.xpath("//span[@class='B_NuCI']")).getText();
            		System.out.println(text);
            
            
            
            
            
            
}
}
