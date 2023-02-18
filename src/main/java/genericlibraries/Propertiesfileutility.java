package genericlibraries;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 * This class contains all reusable methods to perform operation on properties file
 * @author QPS-Basavanagudi
 */

public class Propertiesfileutility {
	Properties property;

	/**
	 * This method is used to initialize properties file
	 * @param filepath
	 */
	public void propertyfileintialization(String filepath) {
		FileInputStream fis = null;
		try {
		    fis = new FileInputStream(filepath);
	}catch (FileNotFoundException e) {
		e.printStackTrace();
	}
	
	property = new Properties();
	
	try {
		property.load(fis);
	}catch (IOException e) {
		e.printStackTrace();
	}
	}

	public String fetchProperty1(String string) {
		// TODO Auto-generated method stub
		return null;
	}

	public String fetchProperty(String string) {
		// TODO Auto-generated method stub
		return null;
	}
}
	
	/**
	 * This method returns the data from properties file based on the key passed
	 * @param key
	 * @return
	 */

