package com.fourstay.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {

	static Properties propFile;
	static {
		try {
			String path = "./src/test/resources/test_data/configuration.properties";
			FileInputStream input = new FileInputStream(path);
			propFile = new Properties();
			propFile.load(input);
			input.close();
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}
	}

	public static String getProperty(String key) {
		return propFile.getProperty(key);
	}

}
