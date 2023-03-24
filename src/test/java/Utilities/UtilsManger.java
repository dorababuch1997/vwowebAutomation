package Utilities;

public class UtilsManger {
	
	
	public SeleniumUtilites seleniumUtilites =null;
	public configReader configReader = null;
	
	public UtilsManger(SeleniumUtilites seleniumUtilites, configReader configReader) {
		this.seleniumUtilites = seleniumUtilites;
		this.configReader= configReader;
		
	}

}
