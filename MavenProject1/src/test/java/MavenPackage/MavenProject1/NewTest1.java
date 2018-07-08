package MavenPackage.MavenProject1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class NewTest1 {

@Test
public void testInvoke3() throws InterruptedException
{
	WebDriver driver=null;
	//System.setProperty("webdriver.chrome.driver", "C:\\Satish\\SoftwareAndJars\\geckodriver-v0.21.0-win64\\geckodriver.exe");
	System.setProperty("webdriver.chrome.driver", "C:\\Satish\\RPMXAUTOMATION2\\RPMXV1\\RPMX_4\\BrowserDrivers\\chromedriver.exe");
	
	driver=new ChromeDriver();
	driver.get("http://www.google.com");
	Thread.sleep(5000);
	driver.manage().window().maximize();
	System.out.println("Invoked Google");
driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Testing");
System.out.println("Set In Google");
Thread.sleep(2000);
}
	
@Test
  public void f() {
	
	
	System.out.println("+++++++++jmp shree");
	  for (int i=1;i<5;i++)
	  {
		  System.out.println("jmp");
	  }
	  System.out.println("+++++++++jmp shree");  
  }

}
