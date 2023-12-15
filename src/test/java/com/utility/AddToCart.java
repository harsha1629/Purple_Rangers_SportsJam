package com.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class AddToCart {
	public String url,search;
	public AddToCart() {
		datas();
	}
	public void datas() {
		File inputFile = new File("C:\\Users\\akumaresan2\\eclipse-workspace\\Purple_Rangers-Pilot_Project\\SportsJam\\src\\test\\resources\\AddToCart.properties");
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
		search = prop.getProperty("search");
		
	}

}
