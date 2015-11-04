import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;


public class loginTest {
	
	public static WebDriver driver;
	
	@BeforeSuite
	public void setUp(){
		
		driver = new FirefoxDriver();
		
		
	}
	
	@Test
	public void doLogin() throws InterruptedException{
		
		driver.get("http://www.wakanow.com/ng");
		driver.findElement(By.id("intlDeptCode")).sendKeys("lagos");
		driver.findElement(By.xpath("html/body/div[4]/ul/li")).click();
		driver.findElement(By.id("intlArrvCode")).sendKeys("london");
		driver.findElement(By.xpath("html/body/div[5]/ul/li[4]")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.id("test")).click();;
	}

	@AfterSuite
	public void Teardown(){
		driver.quit();
		
	}
}
