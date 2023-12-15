package com.utility;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
 
public class SearchProperties {
	public String url,valueone,valuetwo;
	
	public SearchProperties() {
		datas();
	}
	public void datas() {
		File inputFile = new File("C:\\Pilot project Push\\PurpleRangers_PilotProject\\src\\test\\resources\\Features\\Serach.properties");
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(inputFile);
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		Properties prop = new Properties();
		try {
			prop.load(fis);
		}catch(IOException e) {
			e.printStackTrace();
		}
		url = prop.getProperty("url");
		valueone= prop.getProperty("valueone");
		valuetwo= prop.getProperty("valuetwo");
	}
 
}


