package genericUtilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * @author reshma
 */
public class DemoPropertyFileUtility {

	/**
	 * This method will read data from property file and return value to caller
	 * @param key
	 * @return
	 * @throws IOException
	 */
	public static String propertyFileDataRead(String key) throws IOException {
		
		FileInputStream fis = new FileInputStream(".\\src\\test\\resources\\DemoCommonData.properties");
		Properties p = new Properties();
		p.load(fis);
		String value = p.getProperty(key);
		return value;
	}
}
