package practice;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class WriteDataInPrpertyFile {

	public static void main(String[] args) throws IOException {
		//write data in property file
		FileOutputStream fos= new FileOutputStream(".\\src\\test\\resources\\NewFile.properties");
		Properties p = new Properties();
		p.setProperty("fname", "reshma");
		p.setProperty("lname", "sultana");
		p.setProperty("role", "tester");
		p.store(fos, "data is saved successfully");
	
	}

}
