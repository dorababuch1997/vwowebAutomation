package Utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class configReader {
	
	
	Properties properties;
	
	FileInputStream fileInputStream;
	
	
	public Properties readProperties() {
		
		try {
			fileInputStream = new FileInputStream(Utilities_Paths.Config_Propertiespath);
			properties = new Properties();
			
			properties.load(fileInputStream);
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return properties;
	}
	
	
	public String readPropertiesdata(String stringurl) {
		
		String property = readProperties().getProperty(stringurl);
			
		return property;
	}
	
	public String get_DEV_homeUrl() {
		
		String readPropertiesdata = readPropertiesdata("dev_webapplication_home");
		
		return readPropertiesdata;
	}
	
	public String get_DEV_LoginUrl() {
		
	String readPropertiesdata = readPropertiesdata("dev_webapplication_login");
		
		return readPropertiesdata;

	}
	
	public void get_QA_homeUrl() {
		

	}
	
	public void get_QA_LoginUrl() {
		// TODO Auto-generated method stub

	}
	
	public static void main(String[] args) {
		configReader configReader = new configReader();
		System.out.println(configReader.get_DEV_LoginUrl());
	}
}


