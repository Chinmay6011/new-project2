package com.Testing.CustomUtils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesUtils {
	static Properties prop = new Properties();
	public static String getproperty(String Key) {
	String value="";
	try {
		String basepath=System.getProperty("user.dir");//absolute path
		
		FileInputStream fis= new FileInputStream(basepath+"/src/main/resources/ObjectRepository.properties");
		prop.load(fis);
		value = (String)prop.get(Key);
		
	}catch(FileNotFoundException e) {
		e.printStackTrace();
		System.err.println("Object Repository not found");
		
		
	}catch(IOException e) {
		System.err.println("unable to load properties file");
		e.printStackTrace();
		
		
	}
	return value;

}
	
	public static String[] getLocatorValue(String locatorName) {
		return getproperty(locatorName).split("##");
	}
}