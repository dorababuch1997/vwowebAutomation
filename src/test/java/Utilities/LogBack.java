package Utilities;

import org.apache.log4j.Logger;



public class LogBack {

	
	
	public static Logger log = Logger.getLogger(LogBack.class.getName());
	
	public void StartScenario(String scenarioName) {
		
		 log.info("$$$$$$$$$$$$$$$$$$$$$        -START-"+scenarioName+"        $$$$$$$$$$$$$$$$$$$$$$$$$");

	}
	
	 public static void endScenario(String testScenarioName){

		 log.info("XX");
		 
		 log.info("XXXXXXXXXXXXXXXXXXXXXXX        -END-"+testScenarioName+"        XXXXXXXXXXXXXXXXXXXXXX");
		 
		 log.info("XX");
		 
		 }
}

