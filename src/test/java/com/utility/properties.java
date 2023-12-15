package com.utility;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class properties {
	
	public String email,password,Name,LastName,Address,Code,City,Mobile,country,url,vaild_email,valid_pass,Invalid_email,Invalid_pass,search,firstName,mobileNumber,lastname,city,
	zipcode,Email,Password,ConfirmPassword,currentPassword,NewPassword,ConfirmNewPassword;;
	public properties(){
		data();
	}
	public void data() {
		File file = new File("C:\\Pilot project Push\\PurpleRangers_PilotProject\\src\\test\\resources\\Features\\Serach.properties");
		FileInputStream fio =null;
		try {
			fio = new FileInputStream(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		Properties prop = new Properties();
		try {
			prop.load(fio);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		url = prop.getProperty("url");
		vaild_email = prop.getProperty("vaild_email");
		valid_pass = prop.getProperty("valid_pass");
		Invalid_email = prop.getProperty("Invalid_email");
		Invalid_pass = prop.getProperty("Invalid_pass");
		firstName = prop.getProperty("firstName");
		lastname=prop.getProperty("lastname");
		city=prop.getProperty("city");
		zipcode=prop.getProperty("zipcode");
		mobileNumber = prop.getProperty("mobileNumber");
		Email = prop.getProperty("Email");
		password = prop.getProperty("password");
		ConfirmPassword = prop.getProperty("ConfirmPassword");
		currentPassword=prop.getProperty("currentPassword");
		NewPassword=prop.getProperty("NewPassword");
		ConfirmNewPassword=prop.getProperty("ConfirmNewPassword");
		email = prop.getProperty("email");
		Password = prop.getProperty("Password");
		Name = prop.getProperty("Name");
		LastName = prop.getProperty("LastName");
		Address = prop.getProperty("Address");
		Code = prop.getProperty("Code");
		City = prop.getProperty("City");
		Mobile = prop.getProperty("Mobile");
		search = prop.getProperty("search");

		
		
}

}

