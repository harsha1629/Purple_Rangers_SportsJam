package com.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Payment {
	public String url,Email,Password,Name,LastName,Address,Code,City,Mobile,country;
	public Payment() {
		datas();
	}
	public void datas() {
		File inputFile = new File("C:\\Users\\akumaresan2\\eclipse-workspace\\Purple_Rangers-Pilot_Project\\SportsJam\\src\\test\\resources\\Payment.properties");
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
		Email = prop.getProperty("Email");
		Password = prop.getProperty("Password");
		Name = prop.getProperty("Name");
		LastName = prop.getProperty("LastName");
		Address = prop.getProperty("Address");
		Code = prop.getProperty("Code");
		City = prop.getProperty("City");
		Mobile = prop.getProperty("Mobile");
		
	}

}
