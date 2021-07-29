

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class remotetest {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setBrowserName("chrome");
		dc.setPlatform(Platform.WINDOWS);
		WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),dc);
		//driver.get("http://google.com");
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("philips trimmer");
		List<WebElement>result=driver.findElements(By.id("nav-search"));
		for(WebElement results: result)
		{
		if(results.getText().equalsIgnoreCase("philips trimmer for men latest model"))
		{
			results.click();
		}
		}
	}
	}


