package steps_definations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Utilities.UtilsManger;
import Utilities.configReader;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class hooks {
	
	private UtilsManger utilsManger;
	
	public hooks(UtilsManger utilsManger) {
		this.utilsManger=utilsManger;
	}
	
	@Before
	public void scrnStart() {
		
		WebDriverManager.chromedriver().setup();
		
		utilsManger.seleniumUtilites.driver = new ChromeDriver();
		
		utilsManger.seleniumUtilites.driver.manage().window().maximize();
		
		utilsManger.seleniumUtilites.driver.get(utilsManger.configReader.get_DEV_homeUrl());
		

	}

	
	@After
	public void teardown() {
		
		
		
		
	}
}
