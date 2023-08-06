
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedmiMobiles {

public static void main(String args[]) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\eclipse-workspace\\Projects_Maven\\target\\chromedriver.exe");
	     
		//WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[tex()='X')")).click();
		
		WebElement element = driver.findElement(By.name("q"));
		element.sendKeys("Redmi Mobiles",Keys.ENTER);
		
		Map<String,String> mp = new HashMap<>();
		
		List<WebElement> mbname = driver.findElement(By.xpath("div))"
				for(int i=0;i<mbname.size();i++) {
					WebElement mobile = mbname.get(i);
					String text = mobile.getText();
		
					List<WebElement> mbprice = driver.findElements(By.xpath("))"
						for(int j=1;j==i;j++) {
							WebElement price = mbprice.get(j);
							String text1 = price.getText();
							
							mp.put(text,text1);
							Set<Entry<String,String>> entryset = mp.entrySet();
							for(Entry<String,String> entry : entrySet) {
								System.out.println(entry);
							}
							
							
							
						}
				}
		
}
}

