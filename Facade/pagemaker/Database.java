package pagemaker;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Database {
	private Database() {
		
	}
	
	protected static Properties getProperties(String dbname) throws FileNotFoundException, IOException {
		String filename = dbname + ".txt";
		Properties prop = new Properties();
		prop.load(new FileInputStream(filename));
		
		
		return prop;
	}
}
