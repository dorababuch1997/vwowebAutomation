package Utilities;

import org.openqa.selenium.WebDriver;

import com.mongodb.diagnostics.logging.Logger;

public class SeleniumUtilites {
	
	
	public static WebDriver driver=null;
	public Logger logger;
	
	
	public void NavigateTo(String url) {
		
		driver.navigate().to(url);

	}
	

}
