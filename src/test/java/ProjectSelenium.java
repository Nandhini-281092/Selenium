
import org.apache.poi.util.SystemOutLogger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.WebElement;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.interactions.Actions;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import org.openqa.selenium.JavascriptExecutor;
import org.apache.commons.io.FileUtils;



public class ProjectSelenium {
	
	public static void main(String args[]) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\eclipse-workspace\\Projects_Maven\\target\\chromedriver.exe");
	     
		//WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/alerts/");
		
		//driver.navigate().to("https://www.flipkart.com/");
		//Thread.sleep(3000);
		//driver.navigate().back();
		//Thread.sleep(3000);
		//driver.navigate().forward();
		//Thread.sleep(3000);
		//driver.navigate().refresh();
		//Thread.sleep(3000);
		
		//String currentUrl = driver.getCurrentUrl();
		//System.out.println(currentUrl);
		
		//String title = driver.getTitle();
		//System.out.println(title);
		
		//driver.switchTo().newWindow(WindowType.TAB);
		//Thread.sleep(3000);
		//driver.close();
		
		driver.manage().window().maximize();
		//driver.manage().window().minimize();
		
		//String source = driver.getPageSource();
		//System.out.println(source);
		
		//WebElement user = driver.findElement(By.id("email"));
		//user.sendKeys("Selenium");
		//user.clear();
		//user.sendKeys("Java");
		
		//String attribute = user.getAttribute("value");
		//if(attribute.equals("selenium")) {
			//System.out.println("User accepting alphabets in respective field"+attribute);
		//}
		
		//WebElement pass = driver.findElement(By.name("pass"));
		//pass.sendKeys("selenium");
		
		//WebElement login = driver.findElement(By.linkText("Log in"));
		//String text = login.getText();
		//System.out.println(text);
		//login.click();
		
		//List<WebElement> login = driver.findElements(By.tagName("a"));
		
		//for(int i=0;i<login.size();i++) {
			
			//login.getText();
		//}
		
		//for(WebElement x:login) {
			
		//System.out.println(x.getText());
		//}
		
		//WebElement login = driver.findElement(By.partialLinkText("Log"));
		//login.click();
		
		//WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));
		//login.click();
		
		//driver.quit();
		
		//ChromeOptions o = new ChromeOptions();
		//o.addArguments("--disable-notifications");
		
		//WebElement user = driver.findElement(By.id("email"));
		//user.sendKeys("Selenium");
		//Actions ac = new Actions(driver);
		//ac.doubleClick(user).perform();
		//ac.contextClick(user).perform();
		
		//Robot r = new Robot();
		//for(int i=0;i<3;i++) 
			
		//r.keyPress(KeyEvent.VK_DOWN);
		//r.keyRelease(KeyEvent.VK_DOWN);
		
		//r.keyPress(KeyEvent.VK_ENTER);
		//r.keyRelease(KeyEvent.VK_ENTER);
		
		//r.keyPress(KeyEvent.VK_TAB);
		//r.keyRelease(KeyEvent.VK_TAB);
		
		//r.keyPress(KeyEvent.VK_CONTROL);
		//r.keyPress(KeyEvent.VK_V);
		//r.keyRelease(KeyEvent.VK_CONTROL);
		//r.keyRelease(KeyEvent.VK_V);
		
		//Drag and Drop
		//driver.get("https://demo.guru99.com/test/drag_drop.html");
		//WebElement drag = driver.findElement(By.xpath("//a[contains(text(),'BANK')]"));
		//WebElement drop = driver.findElement(By.xpath(("//li[contains(@class,'placeholder')])[1]")));
		
		//WebElement drag1 = driver.findElement(By.xpath("//a[contains(text(),'BANK')]"));
		//WebElement drop1 = driver.findElement(By.xpath(("//li[contains(@class,'placeholder')])[1]")));
		
		//WebElement drag2 = driver.findElement(By.xpath("//a[contains(text(),'BANK')]"));
		//WebElement drop2 = driver.findElement(By.xpath(("//li[contains(@class,'placeholder')])[1]")));
		
		//WebElement drag3 = driver.findElement(By.xpath("//a[contains(text(),'BANK')]"));
		//WebElement drop3 = driver.findElement(By.xpath(("//li[contains(@class,'placeholder')])[1]")));
		
		//Actions ac = new Actions(driver);
		//ac.dragAndDrop(drag,drop).build().perform();
		//ac.dragAndDrop(drag1,drop1).build().perform();
		//ac.dragAndDrop(drag2,drop2).build().perform();
		//ac.dragAndDrop(drag3,drop3).build().perform();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
				
		//JavaScript Executor
		
		//WebElement user = driver.findElement(By.id("email"));
		//WebElement pass = driver.findElement(By.id("pass"));
		//WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));
		//WebElement down = driver.findElement(By.xpath("//a [text()='Careers']"));
		
		//DownCasting
		//JavascriptExecutor js = (JavascriptExecutor)driver;
		//js.executeScript("arguments[0].setAttribute('value','Selenium')",user,pass,login );
		//Object executeScript = js.executeScript("return arguments[0].getAttribute('value')",user);
		//System.out.println(executeScript);
		
		//js.executeScript("arguments[0].scrollIntoView(true)", down); // ScrollDown
		//Thread.sleep(2000);
		//js.executeScript("arguments[0].scrollIntoView(false)", user); //ScrollUp
		//Thread.sleep(2000);
		
		//js.executeScript("arguments[0].click()", login);
		
		//Highlight the WebElement
		
		//js.executeScript("arguments[0].setAttribute('style','border:2px solid red;background:yellow')",user);
	
		
		
		driver.findElement(By.id("alertButton")).click();
		
		//Simple Alert
		
		Alert a = driver.switchTo().alert();
		String text = a.getText();
		System.out.println(text);
		Thread.sleep(2000);
		a.accept();
		
		//Confirm Alert
		
		driver.findElement(By.id("confirmButton")).click();
		String text1 = a.getText();
		System.out.println(text1);
		Thread.sleep(2000);
		a.dismiss();
		
		//Prompt Alert
		
		driver.findElement(By.id("promtButton")).click();
		String text2 = a.getText();
		System.out.println(text2);
		a.sendKeys("Selenium");
		a.dismiss();
		
		
		
		
		
		
		
		
		
		
		
		//Screenshot
		
		//TakeScreenShot tk = (TakeScreenShot)driver;
		//File src = tk.getScreenShotsAs(OutputType.FILE);
		//File desc = new File ()
	    //FileUtils.copyFiles(src,desc);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	}



