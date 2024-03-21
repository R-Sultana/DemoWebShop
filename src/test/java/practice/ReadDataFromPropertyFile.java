package practice;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadDataFromPropertyFile {

	public static void main(String[] args) throws IOException {
		//step1:open doc in a java readable format
		FileInputStream fis = new FileInputStream(".\\src\\test\\resources\\CommonData.properties");
		
		//step2: create property file object from java.util
		Properties p = new Properties();
		
		//step3:load doc in properties object
		p.load(fis);
		
		//step4: fetch the data from property file
		String url=p.getProperty("url");
		System.out.println(url);
		
		String user=p.getProperty("username");
		System.out.println(user);
		
		String pass=p.getProperty("password");
		System.out.println(pass);
	}

}
